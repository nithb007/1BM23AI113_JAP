import java.util.Scanner;

class ScoreTracker {
    int marks;
    String Name;

    ScoreTracker(int M, String N) {
        this.marks = M;
        this.Name = N;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int n = 5;
        ScoreTracker obj[] = new ScoreTracker[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Name of student " + (i + 1) + ":");
            String name = scan.nextLine();

            System.out.println("Enter Marks of student " + (i + 1) + ":");
            int marks = scan.nextInt();

            scan.nextLine();

            obj[i] = new ScoreTracker(marks, name);
            System.out.println(obj[i].Name + " has scored a total of: " + obj[i].marks);
        }

        ScoreTracker m = obj[0];
        int sum = 0;

        for (int j = 0; j < n; j++) {
            if (obj[j].marks > m.marks) {
                m = obj[j];
            }
            sum += obj[j].marks;
        }

        System.out.println("The student with the highest marks is " + m.Name + " with " + m.marks + " marks.");
        System.out.println("The total sum of marks for all students is: " + sum);

        scan.close();
    }
}