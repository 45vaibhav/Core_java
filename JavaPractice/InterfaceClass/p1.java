
	interface parent{
		void marry();
		default void education(){
			System.out.println("BCA");	
			}
		default void property(){
			System.out.println("50acre");
			}
		}
	class child implements parent{
		public void marry(){
			System.out.println("XYZ");
			}
		public void education(){
			System.out.println("engineering");
			}
				}
	class Demo{
		public static void main(String args[]){
			child c=new child();
			c.marry();
			c.education();
			c.property();
				}
		}

	//o/p:XYZ	------>>> 1)abstract override 1)normal method override 3)direct parent method access
	//    engineering
	//    50acre