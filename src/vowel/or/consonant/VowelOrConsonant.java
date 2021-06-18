/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowel.or.consonant;
import java.util.Scanner;
public class VowelOrConsonant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char C=in.next().charAt(0);
        if(C=='A' || C=='E' || C=='I' || C=='O' || C=='U')
        {
            System.out.println("Vowel");
        }
        else
        {
             System.out.println("Consonant");
        }
        
    }
    
}
