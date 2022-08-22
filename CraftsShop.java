import java.util.Iterator;
import java.util.Enumeration;
import java.util.ArrayList;



public class CraftsShop{

   // The new line separator:
   private final String NL = System.getProperty("line.separator");

   /**
    * This atribute stores the list of materials
    */
   private ArrayList<Material> materials;

   /**
    * This atribute stores the list of products
    */
   private ArrayList<Product> products;

   /**
    * This atribute stores the list of orders
    */
   private ArrayList<Order> orders;

   /**
    * Constructor method
    */
   public CraftsShop() {
      this.materials = new ArrayList<Material>();
      this.products = new ArrayList<Product>();
      this.orders = new ArrayList<Order>();
   }

   /**
    * This method adds an element to the list of materials
    * @param m
    */
	public void add(Material m) {
		this.materials.add(m);
	}

   /**
    * This method adds an element to the list of products
    * @param p
    */
	public void add(Product p) {
		this.products.add(p);
	}

   /**
    * This method adds an element to the list of orders
    * @param o
    */
	public void add(Order o) {
		this.orders.add(o);
	}

   /**
    * This method generates and returns the information of
    * every element in the materials list of the shop, in
    * the order they were introduced.
    */
   public String listOfMaterials() {
      StringBuilder sb = new StringBuilder();
      for (Iterator<Material> it = materials.iterator(); it.hasNext();) {
         Material m = (Material) it.next();
         sb.append(m.toString());
      }
      return sb.toString();
   } 

   /**
    * This method generates and returns the information of
    * every element in the products list of the shop, in
    * the order they were introduced.
    */
   public String listOfProducts() {
      StringBuilder sb = new StringBuilder();
      for (Iterator<Product> it = products.iterator(); it.hasNext();) {
         Product p = (Product) it.next();
         sb.append(p.toString() + NL);
      }
      return sb.toString();
   } 

   /**
    * This method generates and returns the information of
    * every element in the orders list of the shop, in
    * the order they were introduced.
    */
   public String listOfOrders() {
      StringBuilder sb = new StringBuilder();
      for (Iterator<Order> it = orders.iterator(); it.hasNext();) {
         Order o = (Order) it.next();
         sb.append(o.toString() + NL);
      }
      return sb.toString();
   } 

   /**
    * This method generates and returns the information of
    * those elements in the products list of the shop,
    * whose price is comprised between a minimum and a maximum
    * values (both included).
    * @param min
    *             minimum price
    * @param max
    *             maximum price
    */
   public String listProductsInPriceRange(double min, double max) {
      StringBuilder sb = new StringBuilder();
      for (Iterator<Product> it = products.iterator(); it.hasNext();) {
         Product p = (Product) it.next();
         if ((p.price()>=min)&&(p.price()<=max))
           sb.append(p.toString() + NL);
      }
      return sb.toString();
   } 

   /**
    * This method removes an Order object from the list orders.
    * To do its task, this method has to use the appropriate
    * method of ArrayList class.
    * And to do that, it is necessary to redefine the equals
    * method on class Order, to define whether two Order
    * objects are equals (see description of equals method in
    * class Order)
    */
   public boolean removeOrder(Order order) {
      return this.orders.remove(order);
   }
}
