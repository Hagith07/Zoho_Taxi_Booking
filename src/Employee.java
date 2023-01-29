public class Employee
{
    private int ID;
    private String name;
    private String Designation;
    private String Home;
    private int Distance;
    public Employee(int ID, String name, String Designation,String Home,int Distance)
    {
        this.setID(ID);
        this.setName(name);
        this.setDesignation(Designation);
        this.setHome(Home);
        this.setDistance(Distance);
    }
    public Employee()
    {

    }
    static Employee employee[] = new Employee[100];
    static int emp_index;
    public void create_employee(String name,String designation,String home,int distance)
    {
        employee[emp_index] = new Employee(++emp_index,name,designation,home,distance);
        System.out.println("------------------Employee - "+emp_index+"Created Sucessfully---------------");
    }
    public void print_employee(int id)
    {
        System.out.println("Employee name: "+employee[id-1].name+"\nEmployee's Designation: "+employee[id-1].Designation);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getHome() {
        return Home;
    }

    public void setHome(String home) {
        Home = home;
    }

    public int getDistance() {
        return Distance;
    }

    public void setDistance(int distance) {
        Distance = distance;
    }
}
