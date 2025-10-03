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
        while (run = true){
        System.out.println("convert time to total seconds\n");
        System.out.print("\nEnter hours: ");
        hour = sc.nextInt();
        System.out.print("Enter minutes: ");
        minute = sc.nextInt();
        System.out.print("Enter seconds: ");
        second = sc.nextInt();

        time = (hour * 3600)+ (minute * 60) + second;
        System.out.println("\nTotal: " + time);

        System.out.println("Caculation:");
        System.out.println(hour +" hours * 3600 = "+(hour*3600)+ " seconds");
        System.out.println(minute + " minutes * 60 = "+ (minute*60)+ " seconds");
        System.out.println(second + " seconds = "+ second +" seconds");
        System.out.println("\nTotal: " + time);

        System.out.println("do you want to run the program again(y/n): ");
        char runAgain = sc.next();
        if (runAgain != "y")
        {
        run = false;
        }

        }
    }
}