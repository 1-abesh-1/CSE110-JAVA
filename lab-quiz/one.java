public class Main{
  public static void main(String [] args){
    
    int given=762853;
    int x=given/10000;
    int z=given%100;
    int middle=762853%10000;
    int y=middle/100;
    double a=((x*x)+(y*y)+(z*z))/3;
    double rms=Math.sqrt(a);
    System.out.println(rms);
    

  }
  
  
}


//for input 762853 output 55.88
