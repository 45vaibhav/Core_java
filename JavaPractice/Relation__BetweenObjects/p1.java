
class Company{
	String cmpName;
	int empNo;
	Company(String cmpName,int empNo){
		this.cmpName=cmpName;
		this.empNo=empNo;
			}
	void setCompName(String cmpName,int empNo){
		this.cmpName=cmpName;
		this.empNo=empNo;

			}
	String getcmpName(){
		return cmpName;
			}
	int getempNo(){
		return empNo;
			}
		}
class Employee{
	String empName;
	Employee(String empName){
			this.empName=empName;
			}
	void setEmpName(String empName){
			this.empName=empName;

			}
	String getEmpName(){
			return empName;
			}
	Company getCompObj(Company obj){
		return obj;
				}
		}
class Main{
	public static void main(String args[]){
		Company coditas=new Company("coditas",500);
		Company capg = new Company("capg",1000);
		Employee shubham=new Employee("Shubham");
		Employee rajat=new Employee("Rajat");
		Company tcs = new Company("TCS",11000);

		
		System.out.println(""+shubham.getEmpName());
		Company object=shubham.getCompObj(capg);
		System.out.println("the employee count is "+object.getempNo()+" the company name is :"+object.getcmpName());
			object.setCompName("capg", 5000);	
		System.out.println("the employee count after one year is "+object.getempNo());
		
		System.out.println("-------------------------------------------");

		System.out.println(""+rajat.getEmpName());
		Company object1=rajat.getCompObj(coditas);
		System.out.println("the employee count is "+object1.getempNo()+" the company name is :"+object1.getcmpName());

		System.out.println("-------------------------------------------");
		Company object2=rajat.getCompObj(tcs);
		System.out.println(""+rajat.getEmpName());
		System.out.println("the employee count is "+object2.getempNo()+" the company name is :"+object2.getcmpName());



		
		
			}

	}










