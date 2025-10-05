import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit

        int hour, second, minute, time;
        boolean run = true;

        Scanner sc = new Scanner(System.in);

        while (run == true){
        System.out.println("Convert time to total seconds\n");
        System.out.print("Enter hours: ");
        hour = sc.nextInt();
        System.out.print("Enter minutes: ");
        minute = sc.nextInt();
        System.out.print("Enter seconds: ");
        second = sc.nextInt();

        System.out.println("\nTime Conversion");
        System.out.println("Input: " + hour + " hour, " + minute + " minute, and " + second +" second");
        time = (hour * 3600)+ (minute * 60) + second;
        System.out.println("Total seconds: " + time + " seconds");

        System.out.println("\nCalculation:");
        System.out.println(hour +" hours × 3600 = "+(hour*3600)+ " seconds");
        System.out.println(minute + " minutes × 60 = "+ (minute*60)+ " seconds");
        System.out.println(second + " seconds = "+ second +" seconds");
        System.out.println("Total seconds: " + time + " seconds");

        System.out.print("\nDo you want to convert another time? (y/n): ");
        char runAgain = sc.next().charAt(0);

        if (runAgain != 'y')
        {
        System.out.println("Goodbye!");
        run = false;
        }
        System.out.println();
        }
    }
}