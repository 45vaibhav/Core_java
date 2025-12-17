class Demo {

public static void main(String [] args){
	int a= 10;
	int b=12;
	boolean c= a++ > ++b && ++a < ++b;
	System.out.println(c);
System.out.println(a);
System.out.println(b);
		}

	}