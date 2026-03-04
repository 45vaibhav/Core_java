
// we converted int to String and check
class p11{
    public static void main(String args[]){
        int n=100;
        String s=Integer.toString(n);
        if(n==Integer.parseInt(s)){
            System.out.println("well converted ");
        }else{
            System.out.println("not conveted");
        }
    }
}


//O/P :well converted 