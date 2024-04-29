public class Exit {
    
    public  static void Exit (Person person, ParkingAgent parkingAgent)
    {
        Payment mode = person.getMode();

       // System.out.println("slot "+person.getTicket().getSlotNo());

        if(person.getTicket()==null)
        {
            System.out.println("Cant Exit ,have no ticket");
            return;       //this is used to come out from loop;
        }

        if(mode.getMode().equals("Automated"))
        {
            System.out.println("Automated Payment done");

            String type = person.getVehicle().getVehicleType();

            int slotNo= person.getTicket().getSlotNo();

            if(type.equals("Large"))
            {
                parkingAgent.getParkingArea().getLargeVehicles()[slotNo] = 0;
            }
            else if (type.equals("Small"))
            {
                parkingAgent.getParkingArea().getSmallVehicles()[slotNo] = 0;
            }
            else if(type.equals("Mid"))
            {
                parkingAgent.getParkingArea().getLargeVehicles()[slotNo] = 0;
            }
             
        }
        else 
        {
            parkingAgent.acceptPayment(mode, person);
        }

    }
}
