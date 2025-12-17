// Acme pattern code 

class AcmePattern{
	public static void main(String args[]){
		int num=15;
		int value=10;
		for(int i=1;i<num-1;i++){
			for(int j=1;j<num;j++){
				if(i==j || i+j==num-1+i){
					if(i%2!=0){
					System.out.println(value+ "  " );
					}else{
					System.out.println("* ");
					}
				}else{
				System.out.print("  ");
				}
			}
			if(num/2>i){
				value=value+10;
			}else{
				value=value-10;
			}
		
		}
	
	}

}


/*
10
                        10
  *
                      *
    30
                    30
      *
                  *
        50
                50
          *
              *
            70
            70
              *
          *
                50
        50
                  *
      *
                    30
    30
                      *
  *
                        10
10

*/