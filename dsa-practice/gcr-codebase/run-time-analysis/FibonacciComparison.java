public class FibonacciComparison {
    public static void main(String[] args) {
       int num =40;

       
       System.out.println("Fibonacci of " + num  + ":");        
       long startIter = System.nanoTime();
       int iterResult = fibonacciIterative(num );
       long endIter = System.nanoTime();
       System.out.println("Iterative Result: " + iterResult);
       System.out.println("Iterative Time: " + (endIter - startIter) );

       long startRecord = System.nanoTime();
       int recResult = fibonacciRecursive(num );
       long endRecord = System.nanoTime();
       System.out.println("Recursive Result: " + recResult);
       System.out.println("Recursive Time: " + (endRecord - startRecord) );
       
    }

    public static int fibonacciRecursive(int num ) {
        if (num  <= 1) return num ;
        return fibonacciRecursive(num  - 1) + fibonacciRecursive(num  - 2);
    }

    public static int fibonacciIterative(int num ) {
        if (num  <= 1) return num ;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= num ; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}