import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        // TODO: Implement distance converter
        // Requirements:
        // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
        // - Loop until user chooses to exit
        // - Use conversion factor: 1 mile = 1.60935 kilometers
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner sc = new Scanner(System.in);
        Double distance;
        boolean run;

        run = true;
        while (run){
            System.out.println("----menu----");
            System.out.println("1. Miles to kilometers");
            System.out.println("2. Kilometers to miles");
            System.out.println("3. exit");
            System.out.print("Enter your choice:  ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("\nEnter the distance in miles:  ");
                    distance = sc.nextDouble();
                    distance *= 1.60935;
                    System.out.println("\nThe kilometers is "+ distance);
                    break;
                case 2:
                    System.out.print("\nEnter the distance in kilometers:  ");
                    distance = sc.nextDouble();
                    distance /= 1.60935;
                    System.out.println("\nThe miles is "+ distance);
                    break;
                case 3:
                    System.out.println("bye");
                    run = false;
                    break;
            }
        }

    }
}