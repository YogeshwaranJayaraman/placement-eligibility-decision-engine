import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Student Name: ");
            String name = scanner.next();
            System.out.println("Enter Student Percentage: ");
            double percentage = scanner.nextDouble();
            System.out.println("Enter No of Backlogs: ");
            int backlogs = scanner.nextInt();
            System.out.println("Enter Graduation Year: ");
            int graduationYear = scanner.nextInt();

           Candidate candidate = new Candidate(
             name,
             percentage,
             backlogs,
             graduationYear
           );

            System.out.println("Candidate: " + candidate.getName());
            System.out.println("Percentage: " + candidate.getPercentage());
            System.out.println("Backlogs: " + candidate.getBacklog());
            System.out.println("Graduation Year: " + candidate.getGraduationYear());

           
            scanner.close();
}
}
