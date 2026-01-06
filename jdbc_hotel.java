import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

public class hotel_reservation {
    private static final String url = "jdbc:mysql://localhost:3306/hotel";   //private chai safety wise (yo class vnda bahira ko le use nagaros vanerw)
    private static final String username = "root"; //static chai class bahira yo variable use garda hotel_reservation.username gardai access grna naparos vanerw
    private static final String password = "ratna@123";   //final chai hamro root,url,password yei hunxa change hudaina tei vayerw


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            while (true) {
                System.out.println("----------------Hotel Reservation System---------------");
                System.out.println("1.Reserve a room");
                System.out.println("2.View Reservation");
                System.out.println("3.Get a room");
                System.out.println("4.Delete reservation");
                System.out.println("5.Update reservation");
                System.out.println("6.Exit");
                System.out.println("Enter your choice:");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 :
                        reserve(connection, scanner, statement);
                        break;
                    case 2 :
                        view(connection, scanner, statement);
                        break;
                    case 3 :
                        getroom(connection, scanner, statement);
                    break;
                    case 4 :
                        deletereserve(connection, scanner, statement);
                    break;
                    case 5 :
                        updatereserve(connection, scanner, statement);
                        break;
                    case 6:
                        System.out.println("Thank you for visiting our Hotel Reservation System");
                        System.out.print("Exiting System");
                        for (int i = 0; i < 5; i++) {
                            System.out.print(".");
                            Thread.sleep(1000);
                        }
                        System.exit(1);
                        break;
                    default :
                        System.out.println("Enter the number between 1 to 6");
                        break;

                }

            }


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void reserve(Connection connection, Scanner scanner, Statement statement) {

        System.out.println("Enter guest name:");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter Room no.");
        int room = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter contact no.");
        String contact = scanner.nextLine();
        String sql = "INSERT INTO reservation (guest_name, room_no, contact_no) " +
                "VALUES ('" + name + "', " + room + ", '" + contact + "')";

        try {
            int rowsaffeceted = statement.executeUpdate(sql);
            if (rowsaffeceted > 0) {
                System.out.println("Reservation sucessfull");
            } else {
                System.out.println("Reservation Failed");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void view(Connection connection, Scanner scanner, Statement statement) {


        String query = "Select * from reservation";
        try (ResultSet rs = statement.executeQuery(query);) {
            System.out.println("~~~~~~~~~~~~~~~~~~~Current Reservation~~~~~~~~~~~~~~~~~");
            System.out.println("+-------------------------------------------------------------------------------------+");
            System.out.println("|  Reservation Id |    Guest Name    |   Room No.  |   Contact no. |      Date         |");
            System.out.println("+--------------------------------------------------------------------------------------+");
            while (rs.next()) {
                int id = rs.getInt("rid");
                String name = rs.getString("guest_name");
                int room = rs.getInt("room_no");
                String contact = rs.getString("contact_no");
                String date = rs.getTimestamp("date").toString();

                System.out.printf("| %12d | %13s | %7d | %11s | %17s |\n",
                        id, name, room, contact, date);
            }

            System.out.println("+--------------------------------------------------------------------------------------+");
        }
      catch(SQLException e){
            e.printStackTrace();
      }
    }

    private static void getroom(Connection connection, Scanner scanner, Statement statement) {
        System.out.println("Enter Reservation Id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter guest name:");
        String name = scanner.nextLine();
        scanner.nextLine();
        String query = "Select room_no from reservation where rid="+id;
        try (ResultSet rs = statement.executeQuery(query);) {
            if (rs.next()) {

                int room = rs.getInt("room_no");
                System.out.println("Your room no. is " + room);
            } else {
                System.out.println("Reservation not found of id " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void deletereserve(Connection connection, Scanner scanner, Statement statement) {

        System.out.println("Enter Reservation Id to delete:");
        int id = scanner.nextInt();
        if(!reservationExist(connection,scanner,statement,id)){
            System.out.println("Reservation doesnt found for this id");
            return;
        }
        String sql = "Delete from reservation where rid="+id;
        try {
            int rowsaffeceted = statement.executeUpdate(sql);
            if (rowsaffeceted > 0) {
                System.out.println("Deletion sucessfull");
            } else {
                System.out.println("Deletion Failed");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void updatereserve(Connection connection, Scanner scanner, Statement statement) {
        System.out.println("Enter Original Reservation Id:");
        int id = scanner.nextInt();
        if(!reservationExist(connection,scanner,statement,id)){
            System.out.println("Reservation doesnt found for this id");
            return;
        }
        System.out.println("Enter new guest name:");
        String name = scanner.nextLine();
        System.out.println("Enter new Room no.");
        int room = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new contact no.");
        String contact = scanner.nextLine();
        String sql = "UPDATE reservation SET guest_name='" + name +
                "', room_no=" + room +
                ", contact_no='" + contact +
                "' WHERE rid=" + id;


        try {
            int rowsaffeceted = statement.executeUpdate(sql);
            if (rowsaffeceted > 0) {
                System.out.println("Updation sucessfull");
            } else {
                System.out.println("Updation  Failed");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static boolean reservationExist(Connection connection,Scanner scanner,Statement statement, int id){
        String query = "Select rid from reservation where rid="+id;
        try(ResultSet rs = statement.executeQuery(query);){
            return rs.next();
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

}
