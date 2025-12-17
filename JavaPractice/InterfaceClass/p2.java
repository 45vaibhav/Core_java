
 	interface parent{
		void fun();
		static void gun(){
			System.out.println("in gun");
			}
		}
	class child implements parent{
		public void fun(){
			System.out.println("in fun");
			}
		
			}
	class Demo{
		public static void main(String args[]){
			child c=new child();
			c.fun();
			parent.gun();
			}
		}

	//o/p:in fun -------->>>>static method call by only class name
	//    in gun