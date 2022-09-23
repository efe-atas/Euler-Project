package Euler;
public class QS2 {
    public static void main (String[] args){
     
         int a=1;
         int b=2;
         int x=0;
         int t=0;
         int k=0;
       

     while(a<4000000){

        if(a%2==0){

            k+=a;
        }

        
        
        t=b; 
        b=a+b; 
        a=t; 
       
        
     }
     System.out.println(k);

    }
}
