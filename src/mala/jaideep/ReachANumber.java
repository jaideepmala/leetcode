package mala.jaideep;

public class ReachANumber {
    public static void main(String []args){
        int target = 2;
        System.out.println(reachNumber(target));

    }
    public static int reachNumber(int target) {
        if (target<0)
            target=target*-1;
        int num = 8*target+1;
        double sqrt = Math.sqrt(num);
        double numerator = sqrt-1;
        int res = (int)Math.ceil(numerator/2);
        return res;
    }
}
