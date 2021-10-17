package algorithmEx;

public class Fibonacci{
    public static void main(String[] args){
        int prepreNum = 1;
        int preNum = 1;
        int Num = 0;
        System.out.print(preNum+" "+prepreNum+" ");
        for(int i = 0; i < 20; i++){
            Num = preNum + prepreNum;
            System.out.print(Num+" ");
            prepreNum = preNum;
            preNum = Num;
        }
    }
}