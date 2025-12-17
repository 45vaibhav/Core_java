
	abstract class parent{
		abstract void education();
		abstract void education(int a);
		void education(String a){
		System.out.println(a);
			}
		
		}
	class child extends parent {
		void education(){
		System.out.println("BCA");
			}
		void education(int a){
		System.out.println(a);
			}

			}
	class Demo{
		public static void main(String args[]){
			child c=new child();
				c.education();
				c.education(10);
				c.education("Engineer");
				}
		}

	//o/p:BCA --->> Method overloading work
	  //  10
//	      TCS