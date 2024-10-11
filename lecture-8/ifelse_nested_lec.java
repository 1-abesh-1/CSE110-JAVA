import java.util.Scanner; //importing the scanner

public class ifelse_nested_lec {
    public static void main(String[] args){
 Scanner scn=new Scanner(System.in);

 System.out.print("give a number>>>");
 int num=scn.nextInt();

//this is the example of nested if else

if(num>0){
  if(num%2==0){
    System.out.println("the number is positive and even");
  }else{
    System.out.println("the number is positive and odd");
  }

}else{
  if(num%2==0){
    System.out.println("the number is negative and even");
  }else{
    System.out.println("the number is negative and odd");
  }
  
}



//it's the example of branching
}


    }
