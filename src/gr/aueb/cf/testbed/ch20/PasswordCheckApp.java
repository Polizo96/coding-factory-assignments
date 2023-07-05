package gr.aueb.cf.testbed.ch20;

import java.util.Scanner;

public class PasswordCheckApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;

        System.out.println("Please insert a password:");
         password = sc.next();

         if (password.matches("^(?=.*?[a-z])(?=.*?[A-Z])(?=.*\\d)(?=.*[#?!@$%^&*-]).{8,}$")) {
             System.out.println("Correct Password");
         } else {
             System.out.println("Incorrect Password");
         }
    }
}
