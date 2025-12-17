	interface parent1{
		 default void education(){
			System.out.println("medical");
			}
		}
	interface parent2{
		
		default void education(){
			System.out.println("engineering");
			}
		}
	class child implements parent1,parent2{
		
		public void education(){
			parent1.super.education();
			parent2.super.education();
						    }
						}
	class Demo{
		public static void main(String args[]){
			child c=new child();
			c.education();
					}
			}
	//o/p:medical --------------------->>>>>it supports multiple inheritance in java deu to interface
	//    engineering