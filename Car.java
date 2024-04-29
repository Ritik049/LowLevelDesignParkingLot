public class Car implements Vehicle {
   
    String vehicleNo;
    public Car(String vehicleNo)
    {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType()
    {
        return "Large";
    }

    public String getVehicleNo()
    {
        return vehicleNo;
    }
    
}
