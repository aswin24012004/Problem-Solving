/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

/**
 *
 * @author aswin
 */
public class Anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a="tab",b="lat";
        int count=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            if(a.charAt(i)==b.charAt(j)){
                count++;
            }
        }
        }
        System.out.println(count);
    }
    
}
