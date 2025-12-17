

	abstract  class syntax{
		abstract void fun();
		}
	class child extends syntax{
		void fun(){
		System.out.println("Syntax of the abstract class");
					}
		
			}
	class Demo{
	public static void main(String args[]){
		child c= new child();
		c.fun();
			}
		}