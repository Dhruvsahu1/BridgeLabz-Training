package M1Questions.versionControlledStorage;
import java.util.*;

class FileVersion {
    String version;
    int size;

    FileVersion(String version, int size) {
        this.version = version;
        this.size = size;
    }
}

public class Main {

    static Map<String, LinkedHashMap<String, Integer>> storage = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String operation = parts[0];

            switch (operation) {

                case "UPLOAD":
                    upload(parts[1], parts[2], Integer.parseInt(parts[3]));
                    break;

                case "FETCH":
                    fetch(parts[1]);
                    break;

                case "LATEST":
                    latest(parts[1]);
                    break;

                case "TOTAL_STORAGE":
                    totalStorage(parts[1]);
                    break;
            }
        }
    }

    static void upload(String fileName, String version, int size) {

        storage.putIfAbsent(fileName, new LinkedHashMap<>());

        LinkedHashMap<String, Integer> versions = storage.get(fileName);

        if (!versions.containsKey(version)) {
            versions.put(version, size);
        }
    }

    static void fetch(String fileName) {

        if (!storage.containsKey(fileName)) {
            System.out.println("File Not Found");
            return;
        }

        List<FileVersion> list = new ArrayList<>();

        for (Map.Entry<String, Integer> e : storage.get(fileName).entrySet()) {
            list.add(new FileVersion(e.getKey(), e.getValue()));
        }

        Collections.sort(list, (a, b) -> {
            if (a.size != b.size)
                return a.size - b.size;
            return a.version.compareTo(b.version);
        });

        for (FileVersion f : list) {
            System.out.println(fileName + " " + f.version + " " + f.size);
        }
    }

    static void latest(String fileName) {

        if (!storage.containsKey(fileName)) {
            System.out.println("File Not Found");
            return;
        }

        LinkedHashMap<String, Integer> versions = storage.get(fileName);

        String latestVersion = null;
        int size = 0;

        for (Map.Entry<String, Integer> e : versions.entrySet()) {
            latestVersion = e.getKey();
            size = e.getValue();
        }

        System.out.println(fileName + " " + latestVersion + " " + size);
    }

    static void totalStorage(String fileName) {

        if (!storage.containsKey(fileName)) {
            System.out.println("File Not Found");
            return;
        }

        int sum = 0;

        for (int size : storage.get(fileName).values()) {
            sum += size;
        }

        System.out.println(fileName + " " + sum);
    }
}