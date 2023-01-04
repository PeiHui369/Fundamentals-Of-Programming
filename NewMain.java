/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.helloworldapp;

/**
 *
 * @author User
 */
import java.util.Scanner;
import java.util.Random;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int guess, given,score=0,count=0;
        boolean again = true;
        
        while(again){
        Random random = new Random();
        given = random.nextInt(1,4);
        System.out.println("Hacker see: "+ given);
        if(given<0){given*=-1;}
        System.out.println("Hacker see: "+ given);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        guess = scanner.nextInt();
        count++;
        
        if(guess<0){
            break;}
        
        if(guess==given){
            System.out.println("You guess it right! Congrats!");
            score++;
        }else{
            System.out.println("Wrong, please try next.");
        }
        }
        
        System.out.println("Thanks for playing. Your score is " + score + "/" + count);
    }
    
}
