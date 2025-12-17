
	interface  parent{
		void fun();
		}
	class child implements parent{
	    public void fun(){
		System.out.println("interface class");
			}
		}
	class Demo{
		public static void main(String args[]){
			child c=new child();
			c.fun();
			}
		}