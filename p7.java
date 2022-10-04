import java.util.*;
import java.io.*;
class p7{
    public static void main(String args[]){
        takingInputs();
    }
    public static void takingInputs(){
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        char ch1=sc.next().charAt(0);
        char ch2 =sc.next().charAt(0);
        //str.replaceAll(regex, replacement);
        // String replaced=str.replace(ch1,ch2);
        
        // System.out.println(replaced);
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==(ch1)){
                sb.append(ch2);
            }
            else if(str.charAt(i)==(ch2)){
                sb.append(ch1);

            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
            
        
        
    }
}