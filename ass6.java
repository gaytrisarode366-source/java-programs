import java.util.*;

public class ass6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int[][] rooms = new int[3][5];
            int choice;
        
            do{
                System.out.println("========Hotel Boking System========");
                System.out.println("1. View Room");
                System.out.println("2.Book Room");
                System.out.println("3.Exit");
                System.out.print("Enter your Choice :");
                choice=sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("\n===== ROOM STATUS =====");

                        for (int floor = 0; floor < rooms.length; floor++) {
                            System.out.println("Floor " + (floor + 1));
                            for (int room = 0; room < rooms[floor].length; room++) {
                                if (rooms[floor][room] == 0) {
                                    System.out.println("Room " + (room + 1) + " : Available" );
                                } else {
                                    System.out.println("Room " + (room + 1) + " : Booked");
                                }
                            }
                            System.out.println();
                        }

                        break;
                    
                case 2:
                    System.out.print("Enter floor number (1-3): ");
                    int floor = sc.nextInt();

                    System.out.print("Enter room number (1-5): ");
                    int room = sc.nextInt();

                    if (floor < 1 || floor > 3 ||room < 1 || room > 5) {
                        System.out.println(
                            "Invalid floor or room number."
                        );

                    } else {
                        floor = floor - 1;
                        room = room - 1;
                        if (rooms[floor][room] == 0) {
                            rooms[floor][room] = 1;
                            System.out.println("Room booked successfully!");
                        } else {
                            System.out.println("Sorry, this room is already booked.");
                        }
                    }

                    break;

                case 3:

                    System.out.println(
                        "Thank you for using the Hotel Booking System!"
                    );

                    break;

                default:

                    System.out.println(
                        "Invalid choice. Please try again."
                    );
            }

        } while (choice != 3);

        sc.close();    
    }
    
}
