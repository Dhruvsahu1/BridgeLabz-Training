public class CompareStringPerformance {
    public static void main(String[] args) {
        int N = 100;
        String letter = "GLA";

 
        String res = "";
        long startString = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            res += letter;
        }
        long endString = System.currentTimeMillis();
        System.out.println("String Time: " + (endString - startString) + " ms");

        StringBuilder builder = new StringBuilder();
        long startBuilder = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            builder.append(letter);
        }
        long endBuilder = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder) + " ms");

        StringBuffer sb = new StringBuffer();
        long startBuffer = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            sb.append(letter);
        }
        long endBuffer = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endBuffer - startBuffer) + " ms");
    }
}