package LabHw9_INES_3BSCS1_SingletonPattern;
import java.util.Scanner;
public class HelpDesk
{
    public static void main(String[] args)
    {
        QueueSystem queuingSystem = new QueueSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nWELCOME TO PAG-IBIG OFFICE");
        System.out.print("\nINES, SAMANTHA PAULINE | 3 BSCS 1 | LAB 9: SINGLETON PATTERN");

        System.out.print("\n\n=======================================================================");

        System.out.print("\n\nANNOUNCEMENT: Please get your queue number and wait patiently. Thank you!");

        boolean a = true;

        while (a)
        {
            System.out.print("\n\n[1] Enqueue");
            System.out.print("\n[2] Display Queue");
            System.out.print("\n[3] Reset Queue");
            System.out.print("\n[4] Serve Customer (Help Desk Station)");
            System.out.print("\n[5] Exit");
            System.out.print("\n\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    queuingSystem.enqueue();
                    break;
                case 2:
                    queuingSystem.displayQueue();
                    break;
                case 3:
                    System.out.print("Enter the new queue number: ");
                    int newQueueNumber = scanner.nextInt();
                    queuingSystem.resetQueue(newQueueNumber);
                    break;
                case 4:
                    System.out.print("Enter Help Desk Station number (1-3): ");
                    int helpDeskStationNumber = scanner.nextInt();
                    queuingSystem.serveCustomer(helpDeskStationNumber);
                    break;
                case 5:
                    System.out.print("\n\nThank you!\n");
                    System.exit(5);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
