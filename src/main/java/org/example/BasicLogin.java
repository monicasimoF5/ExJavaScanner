package org.example;

import java.util.Scanner;

public interface BasicLogin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String usuario = "admin";
        String contrasenya = "1234";
        byte tries = 0;

        while (tries < 3) {
            System.out.println("Introduzca el usuario: ");
            String userScanner = scanner.next();
            System.out.println("Introduzca la contraseña: ");
            String passScanner = scanner.next();

            if (usuario.equals(userScanner) && contrasenya.equals(passScanner)){
                System.out.println("¡Autenticación exitosa!");
                break;
            }
            System.out.println("Usuario o contraseña incorrectos, te quedan " + (2-tries) + " intentos.");
            tries++;

            if (tries == 3){
                System.out.println("¡Autenticación KO!");
            }
        }

        scanner.close();
    }

}
