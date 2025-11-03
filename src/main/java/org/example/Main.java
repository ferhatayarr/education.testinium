package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz:");
        String username = scanner.nextLine();
        System.out.print("Şifre giriniz:");
        String password = scanner.nextLine();

        if(username.equals("admin") && password.equals("1234")){
            System.out.println("Giriş Başarılı...");
        }else {
            System.out.println("Giriş Başarısız!");
        }
    }
}
