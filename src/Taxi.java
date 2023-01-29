public class Taxi
{
    private int Taxi_Id;
    private String type;
    private int cost_per_km;
    private String emp_designation;
    public Taxi(int Taxi_Id,String type, int cost_per_km, String emp_designation)
    {
        this.setTaxi_Id(Taxi_Id);
        this.setType(type);
        this.setCost_per_km(cost_per_km);
        this.setEmp_designation(emp_designation);
    }
    public Taxi()
    {

    }
    static Taxi taxi[] = new Taxi[100];
    static int taxi_index;
    public void create_taxi(String type,int cost,String emp_designation)
    {
        taxi[taxi_index] = new Taxi(++taxi_index,type,cost,emp_designation);
        System.out.println("------------------Taxi - "+taxi_index+"Created Sucessfully---------------");
    }

    public int getTaxi_Id() {
        return Taxi_Id;
    }

    public void setTaxi_Id(int taxi_Id) {
        Taxi_Id = taxi_Id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCost_per_km() {
        return cost_per_km;
    }

    public void setCost_per_km(int cost_per_km) {
        this.cost_per_km = cost_per_km;
    }

    public String getEmp_designation() {
        return emp_designation;
    }

    public void setEmp_designation(String emp_designation) {
        this.emp_designation = emp_designation;
    }
}
