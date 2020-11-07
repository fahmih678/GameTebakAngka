/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka;
//men-load class random dan input
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Fahmi Habibi
 */
public class OrangDalam {  
    
    void inputTebakan(){
        // peemberian variabel suatu fungsi
        Random rand = new Random(); 
        Scanner input = new Scanner(System.in);
        
        // menyimpan angka random dalam variabel rand_int    
        int rand_int = rand.nextInt(101);
        int tebakan;

        
        do{
            System.out.println("Tebakan Anda: ");
            // input angka tebakan           
            tebakan = input.nextInt();
            // input untuk enter           
            input.nextLine();
            
            //  Pengkondisian Output          
            if (tebakan > rand_int){
                System.out.println("--Bilangan tebakan Anda terlalu besar---");           
            } else if (tebakan < rand_int) {
                System.out.println("--Bilangan tebakan Anda terlalu kecil---");
            } else {
                System.out.println("!!!Selamat tebakan Anda benar!!!");
            }
        }while(tebakan != rand_int);
    }
    
    void opening(){
    System.out.println("Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silahkan tebak ya!!!");
    }
}

