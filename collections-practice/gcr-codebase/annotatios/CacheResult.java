import java.lang.annotation.*;
import java.util.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}


class ExpensiveCalculator {
    private Map<Integer, Integer> cacheMap = new HashMap<>();

    @CacheResult
    public int computeSquare(int num) {
        if (cacheMap.containsKey(num)) {
            System.out.println("Fetching from cacheMap ");
            return cacheMap.get(num);
        }
        System.out.println("Computing ");
        int result = num * num;
        cacheMap.put(num, result);
        return result;
    }
}


public class CacheResult{
    public static void main(String[] args) throws Exception {
        ExpensiveCalculator calc = new ExpensiveCalculator();

        System.out.println(calc.computeSquare(5)); 
        System.out.println(calc.computeSquare(5)); 
    }
}