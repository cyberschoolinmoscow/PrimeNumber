import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Integer integer = 1231111129;
        for(;integer<Integer.MAX_VALUE;integer++){
            BigInteger bigInteger = BigInteger.valueOf(integer);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
if(probablePrime){
    break;
}
        }
        System.out.println(integer);
    }
}