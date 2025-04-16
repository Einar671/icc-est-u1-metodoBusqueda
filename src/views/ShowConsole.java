package views;

import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Metodo de busqueda");
    }

    public int getCode() {
        System.out.println("Ingrese codigo: ");
        int codigo = scanner.nextInt();
        System.out.println("Codigo ingresado: " + codigo);
        return codigo;
    }

    public String getName(){
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine().toLowerCase();
        System.out.println("Nombre ingresado: "+ nombre);
        return nombre;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
