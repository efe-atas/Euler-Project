package Euler;
public class QS1 {
    
    public static void main(String[] args){
        int t= 0;
        int k=0;


        for(int i=0;i<1000;i++){
            if(i%3==0 && i%15!=0){
                t+=i;
            }

            if(i%5==0){
                k+=i;
            }
            
        }
      
        System.out.println((t+k));
        
       

        }
}
