//abstrat class
	abstract class parent{
		abstract void fun();

			}
	class child extends parent{

		void fun(){
		System.out.println("Hello");
				}
					}
	class Demo{
	public static void main(String args[]){
		child c= new child();
		c.fun();
				}
			}
	

	/*
	Hello
	*/