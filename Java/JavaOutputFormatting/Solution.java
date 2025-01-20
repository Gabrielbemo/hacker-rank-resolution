package JavaOutputFormatting;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            int aux = 16 - s1.length();
            String aux2 = "";
            for(int p = 1;p<aux;p++){
                aux2 += " ";
            }
            if(x < 99){
                if(x < 10){
                    System.out.println(s1  + aux2 + "00"+x);
                }else{
                    System.out.println(s1  + aux2 + "0"+x);
                }
            }else{
                System.out.println(s1  + aux2 + x);
            }
        }
        System.out.println("================================");
    }
}
