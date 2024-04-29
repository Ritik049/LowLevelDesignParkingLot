public class Client {


  public static void main(String[]args)
    { ParkingArea parkingArea = new ParkingArea();
       parkingArea.setLargeCap(2);
       parkingArea.setMidCap(20);
       parkingArea.setSmallCap(10);

    ParkingAgent parkingAgent = new ParkingAgent(2, parkingArea);
    
    Payment automated = new Automated();
    Payment cash = new Cash();
    Payment card = new Card();

    //** Vehicle */
    Vehicle car1 = new Car("Car123");
    Person person1 = new Person(car1);

    Vehicle car2 = new Car("Car345");
    Person person2 = new Person(car2);

    Vehicle car3 = new Car("Car678");
    Person person3 = new Person(car3);


    Entry.Entry(person1,parkingAgent);
    Entry.Entry(person2,parkingAgent);
    Entry.Entry(person3,parkingAgent);


    person1.setMode(card);
    person2.setMode(cash);
    person3.setMode(automated);


    Exit.Exit(person1,parkingAgent);
    Exit.Exit(person2,parkingAgent);
    Exit.Exit(person3, parkingAgent);

   

    }
    
}
