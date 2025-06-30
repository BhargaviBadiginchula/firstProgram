//Q1.Show the effect of pre-increment and post-increment operators on a variable.
class Unary{
  public void unary(int a){
   System.out.println("initial integer value:"+a);
   System.out.println("Pre-incrememt increases the value of operand and then assign the value to the variable : "+(++a));
  
   System.out.println("pre-incremented integer value:"+(a));
   System.out.println("Post Increment take value then increment :"+(a++));
   System.out.println("Post-Incremented integer value:"+a);
}


//Q2.Write a program to demonstrate how unary minus changes the sign of a number.

public void demonstrate(){
  int j =10;
  System.out.println("initial integer value:" + j);
  int num=-j;
  System.out.println("After assigning unary minus -  to the integer i:"+num);
  System.out.println("10==-10 : "+(num==j));
}
public static void main(String[] args){
  Unary obj=new Unary();
  obj.unary(5);
  obj.demonstrate();
 
}
}
