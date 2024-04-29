public class Entry {
    

    public static void Entry(Person person, ParkingAgent parkingAgent)
    {
        parkingAgent.issueTicket(person);

        if(person.getTicket()==null)
        {
            System.out.println("Cant Enter");
        }


    }
}
