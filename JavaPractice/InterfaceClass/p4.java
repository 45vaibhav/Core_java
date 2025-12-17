	interface parent1{
		void marry();
		void education();
		}
	interface parent2{
		void marry();
		void education();
		}
	class child implements parent1,parent2{
		public void marry(){
		System.out.println("kara kut pn");
			}
		public void education(){
			System.out.println("medical");
			}
		
				}
	class Demo{
		public static void main(String args[]){
			child c=new child();
			c.marry();
			c.education();
					}
			}