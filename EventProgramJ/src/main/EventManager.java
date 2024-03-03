package main;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class EventManager {
    private List<Events> events;

    public EventManager(){
        events = new ArrayList<>();
    }
    public void registerEvent(Events event){
        events.add(event);
    }
    public List<Events> consultEvents(){
        return events;
    }
}
