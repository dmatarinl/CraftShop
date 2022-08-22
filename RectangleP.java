import java.text.DecimalFormat;



public class RectangleP extends Product{

   // The new line separator:
   private final String NL = System.getProperty("line.separator");

   /**
    * This atribute stores the rectangle length in cm
    */
   private double length;

   /**
    * This atribute stores the rectangle width in cm
    */
   private double width;

   /**
    * Constructor method
    * 
    * @param id
    *            the Product's id
    * @param material
    *            the Product's material object
    * @param lenth
    *            the rectangle's lenth in cm
    * @param width
    *            the rectangle's width in cm
    */
   public RectangleP(String id, Material material, double length, double width) {
      super(id,material);
      this.length = length;
      this.width = width;
   }

   /**
    * Getter method of atribute length
    * @return atribute length
    */
   public double getLength() {
      return this.length;
   }

   /**
    * Getter method of atribute width
    * @return atribute width
    */
   public double getWidth() {
      return this.width;
   }

   /**
    * This method calculates and returns the price of the
    * rectangular product.
    * 
    * The price of the rectangular product is calculated as:
    *   (its area in m2) x (price per m2 of the material)
    * 
    * @return price of the rectangular product
    */
   public double price() {
      double area;
      area = (length/100) * (width/100);
      return (area * this.getMaterial().getPricePerm2());
   }

   /**
    * This method generates and returns an String with 
    * the information of the rectangular product object.
    *
    * Note that this method has to access to the Material
    * atribute of the class to get some information.
    */
   public String toString() {
      DecimalFormat myFormat1 = new DecimalFormat("#0.00");
      DecimalFormat myFormat2 = new DecimalFormat("#,##0.00");
      StringBuilder sb = new StringBuilder();
      sb.append(super.toString());
      sb.append("Product description: " + NL);
      sb.append("  Rectangle made on " + this.getMaterial().getName() + NL);
      sb.append("  Material price: " + myFormat1.format(this.getMaterial().getPricePerm2()) + " euros per m2" + NL);
      sb.append("  Length: " + myFormat2.format(this.length) + " cm" + NL);
      sb.append("  Width: " + myFormat2.format(this.width) + " cm" + NL);
      sb.append("Product price: " + myFormat2.format(this.price()) + " euros" + NL);
	return sb.toString();
   }
}
