import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;

/**
 * Test class
 * 
 * @author dmatarinl
 * @version 1.0
 * @since 2021
 */

public class Main2{

   // The new line separator:
   private static final String NL = System.getProperty("line.separator");

   // Declaring a CraftsShop object:
   CraftsShop myCS;

   /**
    * main method.
    * 
    * @param args
    * @throws ParseException
    */
   public static void main(String[] args) throws ParseException {

      // Making the instance of CraftsShop:
      CraftsShop myCS = new CraftsShop();

      // ***************************************************
      //   STEP 1 (Creating and listing Materials)
      // ***************************************************

      // Creating some Material objects and adding them into
      // its corresponding list:
      Material mSilver = new Material("Silver",4480.0);
	 myCS.add(mSilver);
	 Material mWood = new Material("Wood",570.0);
	 myCS.add(mWood);
	 Material mPlastic = new Material("Plastic",350.0);
	 myCS.add(mPlastic);

	 // Printing material's information:
      System.out.println("********************************");
      System.out.println("       OUTPUT OF STEP 1");
      System.out.println("********************************");
      System.out.println("List of materials (in the order they were introduced)");
      System.out.println("-----------------------------------------------------");
      System.out.println(myCS.listOfMaterials());

      // ***************************************************
      //   STEP 2 (Creating and listing Products)
      // ***************************************************

      // Creating some Product objects and adding them into
      // its corresponding list:
      CircleP pCircle1 = new CircleP("C01",mSilver,4.5);
	 myCS.add(pCircle1);
	 CircleP pCircle2 = new CircleP("C02",mSilver,3.5);
	 myCS.add(pCircle2);
	 CircleP pCircle3 = new CircleP("C03",mWood,4.5);
	 myCS.add(pCircle3);
	 RectangleP pRectangle1 = new RectangleP("R01",mSilver,3.5,7.5);
	 myCS.add(pRectangle1);
	 RectangleP pRectangle2 = new RectangleP("R02",mPlastic,3.5,7.5);
	 myCS.add(pRectangle2);
	 RectangleP pRectangle3 = new RectangleP("R03",mWood,3.5,7.5);
    myCS.add(pRectangle3);

	 // Printing product's information:
      System.out.println("********************************");
      System.out.println("       OUTPUT OF STEP 2");
      System.out.println("********************************");
      System.out.println("List of products (in the order they were introduced)");
      System.out.println("----------------------------------------------------");
      System.out.println(myCS.listOfProducts());

      // ***************************************************
      //   STEP 3 (Creating and listing Orders)
      // ***************************************************

      SimpleDateFormat d = new SimpleDateFormat("dd-MM-yy");

      // Creating some Order objects and adding them into
      // its corresponding list:
	 myCS.add(new Order("O001",d.parse("22-03-2018"),100,pCircle1));
	 myCS.add(new Order("O002",d.parse("23-03-2018"),150,pCircle2));
	 myCS.add(new Order("O003",d.parse("25-03-2018"),50,pRectangle1));
	 myCS.add(new Order("O004",d.parse("28-03-2018"),100,pRectangle3));

	 // Printing order's information:
      System.out.println("********************************");
      System.out.println("       OUTPUT OF STEP 3");
      System.out.println("********************************");
      System.out.println("List of orders (in the order they were introduced)");
      System.out.println("--------------------------------------------------");
      System.out.println(myCS.listOfOrders());

      // ***************************************************
      //   STEP 4 (List of products within a price range)
      // ***************************************************

      System.out.println("********************************");
      System.out.println("       OUTPUT OF STEP 4");
      System.out.println("********************************");
	 // Printing product's information (in a range of prices):
      System.out.println("List of products within a price range (in order of introduction)");
      System.out.println("----------------------------------------------------------------");
      double min = 2.0;  // minimum price
      double max = 20.0; // maximum price
      DecimalFormat myFormat = new DecimalFormat("#,##0.00");
      System.out.println("Minimum price: " + myFormat.format(min) + " euros"); 
      System.out.println("Maximum price: " + myFormat.format(max) + " euros" + NL); 
      System.out.println(myCS.listProductsInPriceRange(min,max));

      // ***************************************************
      //   STEP 5 (Removing Orders)
      // ***************************************************

      System.out.println("********************************");
      System.out.println("       OUTPUT OF STEP 5");
      System.out.println("********************************");
      
      // -- Successful case --
      // Explanation of the context: He have to imagine that,
      // in some way, the application provides the Order
      // object to be removed from the list orders, if
      // possible; that means (according to the definition of
      // method equals in class Order), in the case that an
      // Order object with the same reference code exists in
      // the list orders.
      // To show that, we create a "target" Order object with
      // the same reference code of the second Order object
      // created previously at STEP 3 and included into the
      // list Orders, but with "null" values for the rest of
      // its atributes.
      String myRef = new String("O002");
      Order myOrder = new Order(myRef,null,0,null);
      System.out.println("Trying to remove Order with reference code: " + myRef);
      if (myCS.removeOrder(myOrder))
         System.out.println("Order object has been removed");
      else
          System.out.println("ERROR: Order object not found");
      // Listing the remaining Order objects at list orders
      System.out.println("List of remaining orders (in order of introduction)");
      System.out.println("---------------------------------------------------");
      System.out.println(myCS.listOfOrders());

      // -- ERROR case --
      // Trying to remove an Order object that does not exist
      // in the list orders.
      // Reference code of the Order to be removed:
      String myRef2 = new String("O022");
      Order myOrder2 = new Order(myRef2,null,0,null);
      System.out.println("Trying to remove Order with reference code: " + myRef2);
      if (myCS.removeOrder(myOrder2))
         System.out.println("Order object has been removed");
      else
          System.out.println("ERROR: Order object not found");

   }

}