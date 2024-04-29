public class Person {

    Vehicle vehicle;

    ParkingTicket ticket;

    Payment mode;


    public Person(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle()
    {
        return vehicle;
    }

    public  void setTicket(ParkingTicket ticket)
    {
        this.ticket = ticket;
    }

    public ParkingTicket  getTicket()
    {
        return ticket;
    }

    public void setMode(Payment mode)
    {
        this.mode = mode;
    }

    public Payment getMode()
    {
        return mode;
    }
    
}
