public class ParkingArea {

   private int LargeCap;
  private  int SmallCap;
   private int MidCap;

   private int gates;

   private int []largeVehicles;
   private int []smallVehicles;

   private int[] midVehicles ;

   public ParkingArea() {
        // You can initialize arrays here if needed
    }

   public int[] getLargeVehicles()
   {
     return largeVehicles;
   }

   
   public int[] getSmallVehicles()
   {
     return smallVehicles;
   }

   
   public int[] getMidVehicles()
   {
     return midVehicles;
   }




   public void setGates(int gates)
   {
    this.gates = gates;
   }

   public int  getGates()
   {
    return gates;
   }

   public void setLargeCap(int LargeCap)
   {
     this.LargeCap = LargeCap;
     largeVehicles = new int[LargeCap];        
   }
   public void setMidCap(int MidCap)
   {
     this.MidCap = MidCap;
     midVehicles = new int[MidCap];
   }

   public void setSmallCap(int SmallCap)
   {
    this.SmallCap = SmallCap;
    smallVehicles = new int[SmallCap];
   }

   public int getLargeCap()
   {
    return LargeCap;
   }
   public int getMidCap()
   {
    return MidCap;

   }

   public int getSmallCap()
   {
    return SmallCap;
   }


    
}
