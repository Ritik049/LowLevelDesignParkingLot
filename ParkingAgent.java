import java.util.*;
import java.time.LocalTime;
import java.time.*;
public class ParkingAgent {
    

    int gate;
    ParkingArea parkingArea;
    int issueSlotNo = -1;

    public ParkingAgent(int gate, ParkingArea parkingArea)
    {
        this.gate  = gate;
        this.parkingArea = parkingArea;
    }

    public ParkingArea getParkingArea()
    {
        return parkingArea;
    }

    //Issue ticket
    public  void issueTicket(Person person)
    {
         
        String type = person.getVehicle().getVehicleType();

        if(type.equals("Large"))
        {  int i=0;
            for(;i<parkingArea.getLargeCap();i++)
            {
                if(parkingArea.getLargeVehicles()[i]==0)      //vacant
                {
                    issueSlotNo = i;
                  //  System.out.println("i: "+i);
                    parkingArea.getLargeVehicles()[i] =1;
                  //  System.out.println("Parking Area "+parkingArea.getLargeVehicles()[i]);
                    break;
                }
            }

            if(i==parkingArea.getLargeCap())
            {
                issueSlotNo = -1;
                System.out.println("No Slots available");
            }

        }
        else if(type.equals("Small"))
        {  int i=0;
            for(i=0;i<parkingArea.getSmallCap();i++)
            {
                if(parkingArea.getSmallVehicles()[i]==0)      //vacant
                {
                    issueSlotNo = i;
                    parkingArea.getLargeVehicles()[i] = 1;
                     break;
                }
            }
            if(i==parkingArea.getSmallCap())
            {
                System.out.println("No Slots available");
                issueSlotNo = -1;
            }
        }
        else if(type.equals("Mid"))
        {   int i=0;
            for(;i<parkingArea.getMidCap();i++)
            {
                if(parkingArea.getMidVehicles()[i]==0)      //vacant
                {
                    issueSlotNo = i;
                    parkingArea.getLargeVehicles()[i] = 1;
                    break;
                }
            }

            if(i==parkingArea.getMidCap())
            {
                System.out.println("No Slots available");
                issueSlotNo = -1;
            }
        }
        else 
        {
            System.out.println("Type "+ type + " parking is not available");
        }

        //NOw issuing parking ticket
      
         
        if(issueSlotNo !=-1)      //means slot Available
        {
             ParkingTicket  ticket =  new ParkingTicket();

             ticket.setEntryTime(LocalTime.now());

             ticket.setSlotNo(issueSlotNo);

             ticket.setVehicleType(type);
             ticket.setVehicleNo(person.getVehicle().getVehicleNo());

             person.setTicket(ticket);

             System.out.println("Vehicle "+person.getVehicle().getVehicleNo()+" enter");

        }
        
       
    }

    public void acceptPayment(Payment mode, Person person)
    {
        //Calculatae payement
       // LocalTime entryTime = person.getTicket().getEntryTime();
        // Duration duration = Duration.between(entryTime, LocalTime.now());
        int totalHours = 10;
        int amt = 0;
        String type = person.getVehicle().getVehicleType();
        int slotNo  = person.getTicket().getSlotNo();
        

        if(person.getVehicle().getVehicleType().equals("Large"))
        {
           amt = totalHours *10; 
        }

        if(person.getVehicle().getVehicleType().equals("Small"))
        {
           amt = totalHours *8;   
        }
        if(person.getVehicle().getVehicleType().equals("Mid"))
        {
           amt = totalHours *5;   
        }

        
        if(mode.getMode()=="Card")
        {
            System.out.println("Payment "+amt+" accepted by card");
           
            if(type.equals("Large"))
            {
                parkingArea.getLargeVehicles()[slotNo] = 0;
            }
            else if (type.equals("Small"))
            {
                parkingArea.getSmallVehicles()[slotNo] = 0;
            }
            else if(type.equals("Mid"))
            {
                parkingArea.getLargeVehicles()[slotNo] = 0;
            }
             
        
        }
        else if(mode.getMode()=="Cash")
        {
            System.out.println("Payment "+amt+" accepted by cash");

            if(type.equals("Large"))
            {
                parkingArea.getLargeVehicles()[slotNo] = 0;
            }
            else if (type.equals("Small"))
            {
                parkingArea.getSmallVehicles()[slotNo] = 0;
            }
            else if(type.equals("Mid"))
            {
                parkingArea.getLargeVehicles()[slotNo] = 0;
            }
        }


    }
}
