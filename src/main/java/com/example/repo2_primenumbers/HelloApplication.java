package com.example.repo2_primenumbers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
    }

    public static void main(String[] args) {

        int checker = 0; //defines the checker, it'll be used next in the code

        /* From line 20 to 23 the following code makes available to the user to make inputs */
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the quantity of prime numbers you want to see => ");
        int prime_number = number.nextInt();

        /* i and j are iterable variables */
        for (int i=1 ; i <= prime_number ; i++){
            for (int j=1 ; j<=i ; j++){
                if((i%j)==0){
                    checker = checker + 1; //checks if remainder between iterators i and j is zero
                }
            }
            if (checker>2){//checks if it is not prime and reassign the checker value to 0
                checker = 0;
            }
            if (checker == 2 || i==2){//checks if it is prime and print it to the console
                System.out.println("prime number =>" + i); //prints prime numbers
            }
        }
    }
}