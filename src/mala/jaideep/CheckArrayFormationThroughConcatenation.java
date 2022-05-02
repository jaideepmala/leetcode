package mala.jaideep;

import java.util.HashMap;
import java.util.Map;

public class CheckArrayFormationThroughConcatenation {
    public static void main(String[] args)
    {
        int[] arr = {91};
        int[][] pieces = {{1}};
        System.out.println(canFormArray(arr,pieces));
    }
    public static boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>();
        for(int[] piece : pieces){
            map.put(piece[0], piece);
        }

        int start = 0;
        while(start<arr.length){
            if(map.containsKey(arr[start])){
                int[] piece = map.get(arr[start]);

                for(int i=0;i<piece.length;i++){
                    if(arr[start]!=piece[i]){
                        return false;
                    } else{
                        start++;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }
}

