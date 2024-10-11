import java.util.Scanner; //importing the scanner

public class Problem1_lec {
    public static void main(String[] args){
 Scanner scn=new Scanner(System.in);
int maxVal=0;


//for(initialization;condition;steps){}
for(int i=1;i<=5;i++){
    System.out.print("enter a number");
    int num=scn.nextInt();

if(i==1){
    maxVal=num;
}else{
    if(num>maxVal){
        maxVal=num;
    }
}


System.err.println(maxVal);

}







//it's the example of for loop
}


    }
