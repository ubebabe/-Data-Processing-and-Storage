import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        InMemoryDB database = new InMemoryDB();
        String acc;
        int value;

        while(true){
            System.out.println("Enter # of desired command:");
            System.out.println("1. Get");
            System.out.println("2. Begin Transaction");
            System.out.println("3. Put");
            System.out.println("4. Commit");
            System.out.println("5. Rollback");
            System.out.println("6. Quit");

            switch (Integer.parseInt(key.nextLine())) {
                
                //get
                case 1:
                    System.out.println("Enter name of account:");
                    acc = key.nextLine();
                    System.out.println(database.get(acc));
                    break;

                //begin transaction
                case 2:
                    database.begin_transaction();
                    break;

                //put
                case 3:
                    System.out.println("Enter name of account:");
                    acc = key.nextLine();
                    System.err.println("Enter account value:");
                    value = Integer.parseInt(key.nextLine());
                    database.put(acc, value);
                    break;

                //commit
                case 4:
                    database.commit();
                    break;

                // rollback
                case 5:
                    database.rollback();
                    break;
                
                //quit
                default:
                    return;
            }
        }
    }
}
