/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author Agustina
 * TGL:12 April 2025
 */
public class Pertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nama = new String[5];
        
        nama[0] = "Yinari Dewi";
        nama[1] = "Santika";
        nama[2] = "Adisty";
        nama[3] = "Lia";
        nama[4] = "Yoriko";
        
        Scanner inp = new Scanner(System.in);
        
        for(int idx=0; idx<5; idx++ ){
            System.out.print("Data Teman ke-"+String.valueOf(idx)+": "); //Integer.toString()
            nama[idx] = inp.nextLine();
        }
        
        String NamaTeman = nama[2];
        System.out.printf("Data Temna: %s",nama[2]);
        
        //Menampilkan data Array dengan Perulangan
        for(int idx=0; idx<5; idx++ ){
            System.out.println("Data Teman ke-"+String.valueOf(idx)+": "+nama[idx]);
        }
        
        //foreach
        for(String nm : nama){
            System.out.println(nm);
        }
        
    }
    
}
