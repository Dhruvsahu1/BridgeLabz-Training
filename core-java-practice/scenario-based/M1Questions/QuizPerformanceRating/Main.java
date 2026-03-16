package M1Questions.QuizPerformanceRating;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    String name;
    String dept;
    int q1, q2, q3;

    Student(String name, String dept, int q1, int q2, int q3) {
        this.name = name;
        this.dept = dept;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
    }

    int total() {
        return q1 + q2 + q3;
    }
}

public class Main {

    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] parts = line.split(" ");

            if(parts[0].equals("Record")) {

                String name = parts[1];
                String dept = parts[2];
                int q1 = Integer.parseInt(parts[3]);
                int q2 = Integer.parseInt(parts[4]);
                int q3 = Integer.parseInt(parts[5]);

                students.add(new Student(name, dept, q1, q2, q3));

                System.out.println("Record Added: " + name);
            }

            else if(parts[0].equals("Top")) {

                if(students.isEmpty()) {
                    System.out.println("No Records Available");
                    continue;
                }

                String param = parts[1];

                if(param.equals("Q1") || param.equals("Q2") || param.equals("Q3")) {
                    topQuiz(param);
                }
                else {
                    topDepartment(param);
                }
            }
        }
    }

    static void topDepartment(String dept) {

        int max = -1;
        boolean found = false;

        for(Student s : students) {
            if(s.dept.equals(dept)) {
                found = true;
                max = Math.max(max, s.total());
            }
        }

        if(!found) {
            System.out.println("Department Not Found");
            return;
        }

        for(Student s : students) {
            if(s.dept.equals(dept) && s.total() == max) {
                System.out.println(s.name + " " + max);
            }
        }
    }

    static void topQuiz(String quiz) {

        int max = -1;

        for(Student s : students) {

            int score = 0;

            if(quiz.equals("Q1")) score = s.q1;
            if(quiz.equals("Q2")) score = s.q2;
            if(quiz.equals("Q3")) score = s.q3;

            max = Math.max(max, score);
        }

        for(Student s : students) {

            int score = 0;

            if(quiz.equals("Q1")) score = s.q1;
            if(quiz.equals("Q2")) score = s.q2;
            if(quiz.equals("Q3")) score = s.q3;

            if(score == max) {
                System.out.println(s.name + " " + score);
            }
        }
    }
}