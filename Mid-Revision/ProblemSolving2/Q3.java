/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 22004781
 */

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of staff [N]: ");
        int n = input.nextInt();
        int ctr = 0;
        
        for(int i = 0; i<=n ; i++){
            int id = (int) Math.floor(Math.random()*(99999-10000+1)+10000);
            System.out.println("Staff ID: " + id);
            
            int second = (id/1000)%10;
            int fourth = (id/10)%10;
            if(second%2!=0 && fourth%2==0){
                System.out.println("Weekend Duty");
                ctr++;
            }else{
                System.out.println("Weekend Off");
            }
            }
        
        System.out.println("The number of staffs work during weekend is "+ctr);
        }
        
    }
    

