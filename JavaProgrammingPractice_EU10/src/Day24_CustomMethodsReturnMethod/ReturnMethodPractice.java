package Day24_CustomMethodsReturnMethod;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        //find the max number between 100&200
        //multiply the max number by 2
        int maxNumber=max(100,200);
        System.out.println(maxNumber);
        int multiplication=maxNumber*2;
        System.out.println(multiplication);

    }
    public static int max(int a,int b){
        int result=0;
        if(a>b){
            result=a;
        }else{
            result=b;
        }
        return result;
    }
}
