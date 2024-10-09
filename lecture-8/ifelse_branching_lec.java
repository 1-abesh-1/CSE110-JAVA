import java.util.Scanner; //importing the scanner

public class ifelse_branching_lec {
    public static void main(String[] args){
 Scanner scn=new Scanner(System.in);

 System.out.print("give a number>>>");
 int num=scn.nextInt();



 /// if ,else basic. here 
 if(num > 10){
   System.out.println("number is greater then 10");
 }else if(num>20){
  System.out.println("number is greater then 20");
 }else if(num>30){
   System.err.println("the number is greater then 30");
 }else{
  System.out.println("if it's showing then it's less then all");
 }


//it's the example of branching
}


    }
