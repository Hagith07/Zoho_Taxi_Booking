public class Booking
{
    private int book_id;
    private int emp_id;
    private int cost;
    private int day;
    private int month;
    private int year;
    public Booking(int book_id, int emp_id, int cost, int day,int month,int year)
    {
        this.setBook_id(book_id);
        this.setEmp_id(emp_id);
        this.setCost(cost);
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }
    public Booking()
    {

    }
    static Booking booking[] = new Booking[100];
    static int book_index;
    public void book_taxi(int emp_id,int day,int month,int year)
    {
        for (int i = 0; i <= Taxi.taxi_index; i++)
        {
            try {
                if (Employee.employee[emp_id - 1].getDesignation().equals(Taxi.taxi[i].getEmp_designation())) {
                    System.out.println("Taxi " + Taxi.taxi[i].getTaxi_Id() + " is booked--------------");
                    int cost = Employee.employee[emp_id - 1].getDistance() * Taxi.taxi[i].getCost_per_km();
                    booking[book_index] = new Booking(++book_index, emp_id, cost, day, month, year);
                    break;
                }
            }
            catch (Exception e)
            {
                System.out.println("Sorry value not found");
            }
        }
    }
    public void booking_details(int id)
    {
        int total=0;
        int count=0;
        for (int i = 0; i < book_index; i++)
        {
            if(booking[i].getEmp_id() == id)
            {
                System.out.println("Booking ID: "+ booking[i].getBook_id() +"\nCost of the trip: "+ booking[i].getCost() +"\nDay: "+ booking[i].getDay() +"\nMonth: "+ booking[i].getMonth() +"\nYear: "+ booking[i].getYear());
                System.out.println("-------------------------------------------------------");
                total += booking[i].getCost();
                count++;
            }
        }
        System.out.println("Total number of trips: "+count+"\nTotal cost of the trips: "+total);
    }
    public void daily_booking_details(int year1,int month1,int f_day,int t_day)
    {
        for (int i = 0; i <= book_index; i++)
        {
                if (booking[i].getYear() == year1 && booking[i].getMonth() == month1 && booking[i].getDay() >= f_day && booking[i].getDay() <= t_day) {
                    System.out.println("Employee ID: " + booking[i].getEmp_id() + "\nCost of the trip: " + booking[i].getCost() + "\nDay: " + booking[i].getDay() + "\nMonth: " + booking[i].getMonth() + "\nYear" + booking[i].getYear());
                }
        }
    }
    public void monthly_booking_details(int year2,int f_month,int t_month)
    {
        for (int i = 0; i <= book_index; i++)
        {
                if (booking[i].getYear() == year2 && booking[i].getMonth() >= f_month && booking[i].getMonth() <= t_month) {
                    System.out.println("Employee ID: " + booking[i].getEmp_id() + "\nCost of the trip: " + booking[i].getCost() + "\nDay: " + booking[i].getDay() + "\nMonth: " + booking[i].getMonth() + "\nYear" + booking[i].getYear());
                }
        }
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
