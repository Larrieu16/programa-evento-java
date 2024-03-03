package main;
import java.util.Locale;
import java.util.Scanner;

public class Register {
    public static void App(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastrar Usuário: ");

        System.out.println("Nome Completo: ");
        String UserName = sc.nextLine();

        System.out.println("Endereço: ");
        String UAdress = sc.nextLine();

        System.out.println("Idade: ");
        int UAge = sc.nextInt();

        System.out.println("Sexo(M/F) ");
        String UISex = sc.nextLine();
        String USex = UISex.toUpperCase();

        System.out.println("E-mail: ");
        String UEmail = sc.nextLine();


        sc.nextLine();

        User user = new User(UserName, UAdress, UAge, USex, UEmail);

    }
}
