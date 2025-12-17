public class Power{
    public static void main(String[] args) {
        int n=8;
        int count=0;
      String num= Integer.toBinaryString(n);
      if(n==0 || n==1 || n==2){
        System.out.println("true");
      }else{
             
          for(int i=0;i<num.length();i++){
              if(num.charAt(i)==1 ){
                  count++;
              }
          }
          if(count==1){
              System.out.println("true");
          }else{
              System.out.println("false");
          }
      
    }
    }
}