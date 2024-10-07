import java.util.Scanner; //importing the scanner

public class scanner_lec {
    public static void main(String[] args){
   //Mastering User Input in Java: Scanner Class Explained 

   Scanner scn = new Scanner(System.in);
System.out.print("give me an int number>>>");
   int num=scn.nextInt();//scanning the user input. The input must be int
System.out.println(num);//printing the user inp1ut
   
System.out.print("give me an fractional number>>>");
   double num2=scn.nextDouble();//scanning the user input. The input must be fractional
System.out.println(num2);//printing the user input
   




System.out.print("give me a Boolean value>>>");
   boolean num3=scn.nextBoolean();//scanning the user input. The input must be of boolean datatype
System.out.println(num3);//printing the user input
   

//not giving value of exact datatype will through runtime error

/*-----------under this there is a excicutable code. uncmnt it----------- */
//System.out.print("give me a string>>>");
  // String str=scn.nextLine();  //scanning the user input. The input must be a string. here we are not using something like nextString
   /*we used nextLine() */
//System.out.println(str);  //printing the user input

System.out.print("give me another string>>>");
String str2=scn.next();//next also works
System.out.println(str2);

}


    }
