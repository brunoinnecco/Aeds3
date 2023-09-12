
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class game{
    private String name;
    private int ID;
    private  Date release_date;
    private float price;
    private boolean windows, lapide;
    private ArrayList<String> genres;

    public game(){
        this.name = null;
        this.ID = 0;
        this.genres = new ArrayList<String>();
        this.release_date = null;
        this.windows = false;
        this.lapide = true;



    }
     public game(String name, String owners, String website, String developers, ArrayList<String> languages, ArrayList<String> genres, Date release_date, int app_id, int age, int dlcs, int upvotes, int avg_playtime, float price, boolean windows, boolean mac, boolean linux, boolean lapide) {

        this.name = name;
        this.genres = genres;
        this.release_date = release_date;
        this.ID = ID;
        this.price = price;
        this.windows = windows;
        this.lapide = lapide;
    }
       public void setName(String name) { this.name = name; }
    public void setGenres(ArrayList<String> genres) { this.genres = genres; }
    public void setReleaseDate(Date release_date) { this.release_date = release_date; }
    public void setID(int ID) { this.ID = ID; }
    public void setPrice(float price) { this.price = price; }
    public void setWindows(boolean windows) { this.windows = windows; }
    public void setLapide(boolean lapide) { this.lapide = lapide; }

    public long getCreatedAt() { return release_date.getTime(); }
    public String getName() { return this.name; }
    public ArrayList<String> getGenres() { return this.genres; }
    public Date getReleaseDate() { return this.release_date; }
    public int getID() { return this.ID; }
    public float getPrice() { return this.price; }
    public boolean getWindows() { return this.windows; }
    public boolean getLapide() { return this.lapide; }
//começo dos metodos de pesquisa
//ID
    public void read(String line){
        char c_search;
        int index = 0, atr_index=0;
        while(true){
            index++;
            if(line.charAt(index)==','){
                this.ID=Integer.parseInt(line.substring(index, atr_index));

                 atr_index = ++index;
                 break;

            }
        }
        //nome
         if(line.charAt(atr_index) != ',') {

            if(line.charAt(atr_index) == '\"') {
                
                atr_index++;
                c_search = '\"';
            }
            else c_search = ',';
            
            while(true) {

                index++;

                if(line.charAt(index) == c_search) {
                    
                    this.name = line.substring(atr_index, index);

                    if(c_search == ',') index++;
                    else if(c_search == '\"') index += 2;
                    
                    atr_index = index;
                    break;
                }
            }
        }
        else atr_index = ++index;



    }}



