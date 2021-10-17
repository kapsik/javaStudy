package algorithmEx;

import java.util.HashMap;
import java.util.Map;

public class choibinsu {
    public static void main(String[] args){
        //가장 많이 출현한 수를 출력하시오(최빈수)
        int[] arr = {1, 1, 2, 3, 4, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6};

        Map<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
        
        int cnt = 0;
        int curNum = 0;
        
        int curCnt = 0;
        for(int i = 0; i < arr.length; i++){
            curNum = arr[i];
            cnt = 0;
            for(int j = 0; j < arr.length; j++){
                curCnt = arr[j];
                if(curNum == curCnt){
                    cnt = cnt+1;
                    
                    arrMap.put(curNum, cnt);
                    System.out.println("curNum : "+curNum+" cnt : "+cnt);
                }
            }
        }
        System.out.println(arrMap.toString());
    }
}
