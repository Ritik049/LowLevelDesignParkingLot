import java.util.*;
import java.time.LocalTime;
public class ParkingTicket {

    int slotNo;
    String vehicleType;
    String vehicleNo;

    LocalTime entryTime;
    LocalTime exitTime;


    public void setSlotNo(int slotNo)
    {
        this.slotNo = slotNo;
        }

    public void setVehicleType(String vehicleType)
    {
         this.vehicleType = vehicleType;
    }

    public void setVehicleNo (String vehicleNo)
    {
        this.vehicleNo = vehicleNo;
    }

    public void setEntryTime(LocalTime entrytime)
    {
        this.entryTime = entryTime;
    }

    public void setExitTime(LocalTime exitTime)
    {
        this.exitTime = exitTime;
    }

    public int getSlotNo()
    {
        return slotNo;
    }

    public String getVehicleType()
    {
        return vehicleType;
    }

    public String getVehicleNo()
    {
        return vehicleNo;
    }

    public LocalTime getEntryTime()
    {
        return entryTime;
    }

    public LocalTime getExitTime()
   {
    return exitTime;
   }



    
}
