//Q1.Initialize a number and use assignment operators (+=, -=, *=, /=, %=) to modify its value step by step.
class Assignment {
  void operator(){
    int a;
    
   // Assigning a value;
    a=3;
   
// Assigning a value using += operator
   a+=10;
   System.out.println("Applying += operartor :"+a);
   a-=10;
   System.out.println("Applying += operartor :"+a);
   a*=10;
   System.out.println("Applying *= operartor :"+a);
   a/=10;
   System.out.println("Applying /= operartor :"+a);
   a%=10;
   System.out.println("Applying %= operartor :"+a);
   
}


//Q2.Demonstrate how assignment operators can be used to shorten expressions.
void assign1(int i){
   System.out.println("initialized i:"+i);
  i=i+5;
  System.out.println("i=i+5 :"+i);
}
void assign2(int i)
{
  System.out.println("initialized i:"+i);
 i+=5;
  System.out.println("i+=5:"+i);
}
public static void main(String[] args){
  Assignment obj=new Assignment();
  obj.operator();
  obj.assign2(5);
  obj.assign1(5);
}
}

 
