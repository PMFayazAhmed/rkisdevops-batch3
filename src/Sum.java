class Sum
{ //Beginning of the class
public static void main(String args[]) //main method
{
int num1,num2,res; //variable declaration
Scanner s = new Scanner(System.in);
System.out.println("Enter num1 value");
num1=s.nextInt();
System.out.println("Enter num2 value");
num2=s.nextInt();
res=num1-num2;
System.out.println("Difference is : "+res);
}
}
