import java.text.DecimalFormat;


public class CircleP extends Product{

   // The new line separator:
   private final String NL = System.getProperty("line.separator");

   /**
    * PI constant (=3.1416)
    */
   private final double PI = 3.1416;

   /**
    * This atribute stores the circle radius (in cm)
    */
   private double r;

   /**
    * Constructor method
    * 
    * @param id
    *            the Product's id
    * @param material
    *            the Product's material object
    * @param r
    *            the circle's radius in cm
    */
   public CircleP(String id, Material material, double r) {
      super(id,material);
	 this.r = r;
   }

   /**
    * Getter method of atribute r
    * @return atribute r
    */
   public double getR() {
      return this.r;
   }

   /**
    * This method calculates and returns the price of the
    * circle product.
    * 
    * The price of the circle product is calculated as:
    *   (its area in m2) x (price per m2 of the material)
    *
    * @return price of the circle product
    */
   public double price() {
      double area;
      area = PI * (r/100) * (r/100);
      return (area * this.getMaterial().getPricePerm2());
   }

   /**
    * This method generates and returns an String with 
    * the information of the circle product object.
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
      sb.append("  Circle made on " + this.getMaterial().getName() + NL);
      sb.append("  Material price: " + myFormat1.format(this.getMaterial().getPricePerm2()) + " euros per m2" + NL);
      sb.append("  Radius: " + myFormat2.format(this.r) + " cm" + NL);
      sb.append("Product price: " + myFormat2.format(this.price()) + " euros" + NL);
	return sb.toString();
   }
}
