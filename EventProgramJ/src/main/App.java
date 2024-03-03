package main;
import java.util.Scanner;
import java.time.LocalDateTime;
public class App{
    public static void main(String[] args){
        int userSelected;
        do{
            userSelected = MenuData();
            switch(userSelected){
                case 1:
                    new Register();
                    break;
                case 2:
                    new EventRegister();
                    break;
                case 3:
                    new EventManager();
                    break;
                default:
                    System.out.println("Oops! Parece que você digitou uma opção inválida.");
                    break;
            }
        }
        while (userSelected <6);
    }
    public static int MenuData(){
        int selection;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo(a)!");
        System.out.println("1. Cadastramento de Usuário");
        System.out.println("2. Cadastramento de Evento");
        System.out.println("3. Meus eventos");
        System.out.println("Escolha uma opção(Somente em números inteiros): ");
        selection = sc.nextInt();
        return selection;
    }
}
