import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner sc = new Scanner(System.in);
        Double temp;
        boolean run;

        run = true;
        while (run){
            System.out.println("----menu----");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("3. exit");
            System.out.print("Enter your choice:  ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("\nEnter the Temp in fahrenheit:  ");
                    temp = sc.nextDouble();
                    temp = (temp-32)*((double)5/9);
                    System.out.println("\nThe celsius is "+ temp);
                    break;
                case 2:
                    System.out.print("\nEnter the Temp in celsius:  ");
                    temp = sc.nextDouble();
                    temp = (temp*((double)9/5)+32);
                    System.out.println("\nThe fahrenheit is "+ temp);
                    break;
                case 3:
                    System.out.println("bye");
                    run = false;
                    break;
            }
        }
    }
}