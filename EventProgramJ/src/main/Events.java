package main;
import java.time.LocalDateTime;
public class Events {
    private String eventName;
    private String eventAdress;
    private String category;
    private String description;
    private LocalDateTime time;


    public Events(String eventName, String eventAdress, String category, String description, LocalDateTime time){
        this.eventName = eventName;
        this.eventAdress = eventAdress;
        this.category = category;
        this.description = description;
        this.time = time;

    }
    public String getEventName(){
        return eventName;
    }
    public String getEventAdress(){
        return eventAdress;
    }
    public String getCategory(){
        return category;
    }
    public String getDescription(){return description;}
    public LocalDateTime getTime(){return time;}
}


