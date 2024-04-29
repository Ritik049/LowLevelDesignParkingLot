public class Bike implements Vehicle {
    String vehicleNo;
    public Bike(String vehicleNo)
    {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType()
    {
        return "Mid";
    }

    public String getVehicleNo()
    {
        return vehicleNo;
    }
    
}
