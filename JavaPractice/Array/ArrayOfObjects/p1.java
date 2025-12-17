
import java.util.*;
class PartyDetial{
	String Leader;
	String party;
	PartyDetial(String Leader,String party){
		this.Leader=Leader;
		this.party=party;
	}
	void display(){
	System.out.println("the leader is :"+Leader);
	System.out.println("the party name is :"+party);
	
	}

}

class demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		sc.nextLine();
		PartyDetial arr[]=new PartyDetial[n];
	for(int i=0; i<arr.length;i++){
		System.out.println("enter the leader name :");
		String Leader=sc.nextLine();
		System.out.println("enter the party name :");
		String party=sc.nextLine();
		arr[i]=new PartyDetial(Leader,party);
		
		}
	for(int i=0;i<arr.length;i++){
		arr[i].display();
		System.out.println("----------------");

		}
	
	}

}