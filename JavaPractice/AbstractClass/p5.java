
	abstract class parent{
		abstract void fun();
		}
	class child extends parent{
		void fun(){
			System.out.println("in fun");
			}
		}
	class Demo{
		public static void main(String args[]){
		parent p=new child();
		p.fun();
			}
		}