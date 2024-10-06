public class unary_operator {
    public static void main(String[] args){
  //Java Operator Mastery: Increment & Decrement Explained s| Prefix | Postfix


  //--------------pre increament and pre decrement-------------------------//
int a=25;
int b= ++a;//pre increment --> here the value of a will increase first then it will be assigned to b var
System.out.println("value of a after preincreament="+a);
//here both will give same output
System.out.println("value of b after preincreament="+b);
a=6;
b=--a;//same goes here. The value of a is being decreased and then being assigned to a
System.out.println("value of a after predecreament="+a);
System.out.println("value of a after predecreament="+b);


  //--------------post increament and pre decrement-------------------------//
  a=25;
   b= a++;//post increment --> here the value of a will increase after the value of a being assigned to b
  System.out.println("value of a after postincreament="+a);
  //here both will give different output
  System.out.println("value of b after postincreament="+b);
  a=6;
  b=a--;//same goes here
  System.out.println("value of a after postdecreament="+a);
  System.out.println("value of a after postdecreament="+b);
  

  //--------------post increament and pre decrement-------------------------//


    }
}