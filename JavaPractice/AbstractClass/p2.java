
	abstract class parent{
		abstract void education();
		void property(){
		 	System.out.println("59acre");
				}
			}
	class child extends parent{
		void education(){
			System.out.println("Engineering");		
				}
		
			}
	class Demo{
	public static void main(String args[]){
		child c=new child();
			c.education();
			c.property();
				}
		}