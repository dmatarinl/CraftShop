import java.text.DecimalFormat;



public class Material{

   /**
    * The new line separator
    */
   private final String NL = System.getProperty("line.separator");

   /**
    * This atribute stores the material name
    */
   private String name;

   /**
    * This atribute stores the price per m2 of this material
    */
   private Double pricePerm2;

   /**
    * Constructor method
    * 
    * @param name
    *                 the Material's name
    * @param material
    *                 the Material's price per m2
    */
   public Material(String name, Double pricePerm2) {
      this.name = name;
      this.pricePerm2 = pricePerm2;
   }

   /**
    * Getter method of atribute name
    * @return atribute name
    */
   public String getName() {
      return this.name;
   }

   /**
    * Getter method of atribute pricePerm2
    * @return atribute pricePerm2
    */
   public double getPricePerm2() {
      return this.pricePerm2;
   }

   /**
    * This method generates and returns an String with 
    * the information of the Material object.
    */
   public String toString() {
      DecimalFormat myFormat = new DecimalFormat("#0.00");
      StringBuilder sb = new StringBuilder();
      sb.append("Name: " + this.name + "\t");
      sb.append("Price per m2: " + myFormat.format(this.pricePerm2) + " euros" + NL);
      return sb.toString();
   }

}
