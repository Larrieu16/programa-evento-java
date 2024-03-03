package main;
import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Scanner;
public class EventRegister {
    public static void App(String[] args){
        EventManager eventManager = new EventManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastramento de Evento: ");

        System.out.println("Nome do Evento: ");
        String eventName = sc.nextLine();

        System.out.println("Local do Evento: ");
        String eventAdress = sc.nextLine();

        System.out.println("Categoria do Evento: ");
        String eventCategory = sc.nextLine();

        System.out.println("Descrição do Evento: ");
        String eventDescription = sc.nextLine();

        System.out.println("Data (Formato(ANO-MÊS-DIA HORA:MIN): ");
        String eventTimestr = sc.nextLine();

        String[] parts = eventTimestr.split(" ");
        String[] dateParts = parts[0].split(" ");
        String[] timeParts = parts[1].split(" ");

        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        int hour = Integer.parseInt(timeParts[0]);
        int min = Integer.parseInt(timeParts[1]);

        LocalDateTime time = LocalDateTime.of(year, month, day, hour, min);

        Events event = new Events(eventName, eventAdress, eventCategory, eventDescription, time);
        eventManager.registerEvent(event);

        System.out.println("\nEventos Cadastrados: ");
        for (Events e : eventManager.consultEvents()){
            System.out.printf("Nome: " + e.getEventName());
            System.out.printf("\nEndereço: " + e.getEventAdress());
            System.out.printf("\nCategoria: " + e.getCategory());
            System.out.printf("\nDescrição: " + e.getDescription());
            System.out.printf("\nHorário: " + e.getTime());
        }
        sc.close();
    }
}
