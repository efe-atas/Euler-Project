package Euler;

public class QS3 {
    public static void main(String[] args){ 
        long i=2;
        long k=0;
        long number =  600851475143L;
        long divisor = 2;

        
        for(divisor=2;divisor<number;divisor++){
                if(number%divisor==0){
                    for(i=2;i<divisor;i++){
                         if(divisor%i==0)
                          k++;
                        }
                        if(k==0)
                        {
                         System.out.println(divisor);
                        }
                     
                    }          





             }
 
   
                
  
}

}