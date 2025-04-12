/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan42;

import java.util.Scanner;

/**
 *
 * @author Agustina
 * TGL: 12 April 2025
 */
public class Pertemuan42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] meja = new String[3][3];
        Scanner inp = new Scanner(System.in);
        
//        for(int brs=0; brs<3; brs++){
//            System.out.printf("Data Meja Baris: %d, Kolom: %d: ",brs,klm);
//                meja[brs][klm] = inp.nextLine();
                
        for(int brs=0; brs<3; brs++){
            for(int klm=0; klm<3; klm++){
                System.out.println("Data Meja Baris: "+meja[brs][klm]);     
            }
             System.out.println("");
        }
    }
    
}
