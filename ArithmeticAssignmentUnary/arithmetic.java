//Q1.Write a program to input two numbers and perform addition, subtraction, multiplication, division, and modulus operations.

class Arithmetic{
  public void arithmetic(int x,int y){
  
    int a=x;
    int b=y;
    int res;
    res=a+b; 	//Addition operator

    System.out.println("Addition of two numbers:"+res);
    res=a-b;	 //Subtractio operator

    System.out.println("Subtraction of two numbers:"+res);
    res=a*b;	//Multiplication Operator

    System.out.println("Multiplication of two numbers:"+res);
    res=a/b;	//Division Operator

    System.out.println("Division of two numbers:"+res);
    res=a%b;	//Modulo operator

    System.out.println("Modulo Division of two numbers:"+res);
System.out.println(" ");

  }

//Q2.Calculate the area and perimeter of a rectangle using arithmetic operators.

  public void rectangle(int length,int width){
   int area=length*width;	 //formula for area of a rectangle - lenght X breadth.

   int perimeter=2*(length+width);	// Formula for perimeter of a rectangle ((lentgh+breadth)+(length+breadth))-->2 X (Length+Breadth).
   System.out.println("Area of a recatngle is :"+ area);
   System.out.println("Perimeter of a recatngle is :"+ perimeter);
   System.out.println(" ");

  }
 
//Q3.Find the average of five numbers entered by the user.
void average(int a,int b, int c,int d,int e){
  int sum=a+b+c+d+e; 	//formula of average =sum of numbers/total number of numbers.
  int avg=sum/5;
  System.out.println("Average of 5 "+a+b+c+d+e+" numbers :"+avg);
}
  public static void main(String[] args){
    Arithmetic obj=new Arithmetic();
    System.out.println("========Operators========");
    obj.arithmetic(10,3);
    System.out.println("========Rectangle========");
    obj.rectangle(6,4);
    System.out.println("========Average========");
    obj.average(20,25,35,64,46);
}


}