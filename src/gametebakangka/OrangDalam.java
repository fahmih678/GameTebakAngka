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
        int score = 100;
        int jml = 0;

        
        do{
            System.out.println("Tebakan Anda: ");
            // input angka tebakan           
            tebakan = input.nextInt();
            // input untuk enter           
            input.nextLine();
            
            //  Pengkondisian Output          
            if (tebakan > rand_int){
                System.out.println("--Bilangan tebakan Anda terlalu besar---");
                jml+=1;
                score-=2;
            } else if (tebakan < rand_int) {
                System.out.println("--Bilangan tebakan Anda terlalu kecil---");
                jml+=1;
                score-=2;
            } else {
                System.out.println("!!!Selamat tebakan Anda benar!!!");
                if(jml<=5){
                    System.out.println("\n\nScore Anda: " + score);
                    System.out.println("Bonus: 50 poin");
                    System.out.println("Total Score Anda: "+ (score+50) );
                }else{
                    System.out.println("\n\nScore Anda : " + score);
                }
            }
            if (score == 0){
                System.out.println("\nMaaf score kamu habis");
                break;
            }
        }while(tebakan != rand_int);
    }
    
    void opening(){
    System.out.println("Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silahkan tebak ya!!!");
    }
}

