import java.util.*;  
 public class question1  
 {  
      public static void main(String[] args) {  
            int i=0,j=0,sum=0,sum2=0;  
     Scanner sc= new Scanner(System.in);  
     String str[]= sc.nextLine().split(",");  
     while(i<str.length-1)  
     {  
       if(str[i].matches("5"))  
       break;  
       sum+=Integer.parseInt(str[i]);  
       i++;  
     }  
     while(i<str.length-1)  
     {  
       if(str[i-1].matches("8"))  
       break;  
       sum2=sum2*10;  
       sum2+=Integer.parseInt(str[i]);  
       i++;  
     }  
      while(i<str.length)  
     {  
       sum+=Integer.parseInt(str[i]);  
       i++;  
     }  
     System.out.println(sum2+sum);  
      }  
 }  
