import java.util.Scanner;

public class Hotel_Reservation_System {
    public static void main(String[] args){
    int roomno;
    String username;
    String useradd;
    int useramt;
    long mobno;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Hotel Reservation System ");
        System.out.println("Enter Room No you want to book");
        roomno=sc.nextInt();
        System.out.println("Enter Your Name");
        username=sc.next();
        System.out.println("Enter Mobile Number");
        mobno=sc.nextLong();
        System.out.println("Enter your Address");
        useradd=sc.next();
        System.out.println("Make Your Payment of 2000/day");
        useramt=sc.nextInt();
        System.out.println("Booking Details");
        System.out.println("Room has booked Successfully");
        System.out.println("Room no : "+roomno);
        System.out.println("Name : "+username);
        System.out.println("Address : "+useradd);
        System.out.println("Mobile No : "+mobno);
        System.out.println("Payment Done of Rs"+useramt);

       
          
    }
}
