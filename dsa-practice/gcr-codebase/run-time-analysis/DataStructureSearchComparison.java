import java.util.*;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
            Random rand = new Random();
            int capacity =100;

            List<Integer> li = new ArrayList<>();
            for (int i = 0; i < capacity; i++) {
                li.add(rand.nextInt(capacity * 10));
            }

            int target = li.get(rand.nextInt(capacity));

            int[] array = li.stream().mapToInt(i -> i).toArray();
            long startArray = System.nanoTime();
            boolean foundInArray = linearSearch(array, target);
            long endArray = System.nanoTime();

            HashSet<Integer> hashSet = new HashSet<>(li);
            long startHash = System.nanoTime();
            boolean foundInHash = hashSet.contains(target);
            long endHash = System.nanoTime();

            TreeSet<Integer> treeSet = new TreeSet<>(li);
            long startTree = System.nanoTime();
            boolean foundInTree = treeSet.contains(target);
            long endTree = System.nanoTime();

  
            System.out.printf("Array Search Time: %.4f ms\n", (endArray - startArray) / 1e6);
            System.out.printf("HashSet Search Time: %.4f ms\n", (endHash - startHash) / 1e6);
            System.out.printf("TreeSet Search Time: %.4f ms\n", (endTree - startTree) / 1e6);
            
        
    }


    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }
}