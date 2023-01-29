import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Employee emp = new Employee();
        Taxi tax = new Taxi();
        Booking book = new Booking();
        Scanner sc = new Scanner(System.in);
        boolean x = true;
        while(x)
        {
            System.out.println("1)Create Employee" +
                    "\n2)Create Taxi" +
                    "\n3)Book Taxi" +
                    "\n4)Trip based on employee" +
                    "\n5)Daily trips" +
                    "\n6)Monthly trips" +
                    "\n7)Exit");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter your name");
                    String name = sc.next();
                    System.out.println("Enter the Designation of the employee");
                    String designation = sc.next();
                    System.out.println("Enter the place of your home");
                    String home = sc.next();
                    System.out.println("Enter the distance of your home");
                    int distance = sc.nextInt();
                    emp.create_employee(name,designation,home,distance);
                    break;
                case 2:
                    System.out.println("Enter the type of the cab");
                    String type = sc.next();
                    System.out.println("Enter the cost per km");
                    int cost = sc.nextInt();
                    System.out.println("Enter the Designation that you want to set to this type of car");
                    String emp_designation = sc.next();
                    tax.create_taxi(type,cost,emp_designation);
                    break;
                case 3:
                    System.out.println("Enter your Employee ID");
                    int emp_id = sc.nextInt();
                    System.out.println("Enter the day");
                    int day = sc.nextInt();
                    System.out.println("Enter the month");
                    int month = sc.nextInt();
                    System.out.println("Enter the year");
                    int year = sc.nextInt();
                    book.book_taxi(emp_id,day,month,year);
                    break;
                case 4:
                    System.out.println("Enter the employee ID");
                    int id = sc.nextInt();
                    emp.print_employee(id);
                    book.booking_details(id);
                    break;
                case 5:
                    System.out.println("Enter the year: ");
                    int year1 = sc.nextInt();
                    System.out.println("Enter the month :");
                    int month1 = sc.nextInt();
                    System.out.println("Enter the From Day: ");
                    int f_day = sc.nextInt();
                    System.out.println("Enter the To Day: ");
                    int t_day = sc.nextInt();
                    book.daily_booking_details(year1,month1,f_day,t_day);
                    break;
                case 6:
                    System.out.println("Enter the year: ");
                    int year2 = sc.nextInt();
                    System.out.println("Enter the from month :");
                    int f_month = sc.nextInt();
                    System.out.println("Enter the to month : ");
                    int t_month = sc.nextInt();
                    book.monthly_booking_details(year2,f_month,t_month);
                    break;
                case 7:
                    x = false;
                    break;
            }
        }
    }
}