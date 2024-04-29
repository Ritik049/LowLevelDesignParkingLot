public class Cycle implements Vehicle {

    String vehicleNo;
    public Cycle(String vehicleNo)
    {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType()
    {
        return "Small";
    }

    public String getVehicleNo()
    {
        return vehicleNo;
    }
    
    
}
