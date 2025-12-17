

	abstract class parent{
		abstract void marry();
		void property(){
		System.out.println("80acre");
				}
		void education(){
		System.out.println("BCA");
				}

			}
	class child extends parent{
		void marry(){
		System.out.println("XYZ");	
			}
		void education(){
		System.out.println("Engineering");
				}
		void job(){
			System.out.println("TCS");
				}
					}
	class Demo{
		public static void main(String args[]){
			child c=new child();
			c.marry();
			c.property();
			c.education();
			c.job();
				}
		}