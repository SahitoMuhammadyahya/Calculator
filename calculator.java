import java.util.*;
class calculator{
	void add(int a,int b){
	Scanner ob=new Scanner(System.in);
	System.out.println("enter any num");
	 a=ob.nextInt();
	System.out.println("enter any num");
	 b=ob.nextInt();
	System.out.println("addition"+(a+b));
	}
	
	void sub(){
	Scanner ob=new Scanner(System.in);
	System.out.println("enter any num");
	int a=ob.nextInt();
	System.out.println("enter any num");
	int b=ob.nextInt();
	System.out.println("substrartion"+(a-b));
	}

	void mult(){
	Scanner ob=new Scanner(System.in);
	System.out.println("enter any num");
	int a=ob.nextInt();
	System.out.println("enter any num");
	int b=ob.nextInt();
	System.out.println("multiply"+(a*b));
	}

	void div(){
	Scanner ob=new Scanner(System.in);
	System.out.println("enter any num");
	int a=ob.nextInt();
	System.out.println("enter any num");
	int b=ob.nextInt();
	System.out.println("division"+(a/b));
	}
	
	void rem(){
	Scanner ob=new Scanner(System.in);
	System.out.println("enter any num");
	int a=ob.nextInt();
	System.out.println("enter any num");
	int b=ob.nextInt();
	System.out.println("reminder"+(a%b));
	}
	}
	
	class main_calculator{
		public static void main(String arg[]){
			calculator ob=new calculator();
			ob.add(a,b);
			ob.sub();
			ob.mult();
			ob.div();
			ob.rem();
		}
	}