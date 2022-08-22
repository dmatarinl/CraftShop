

public abstract class Product{

   /**
    * The new line separator
    */
   private String NL = System.getProperty("line.separator");

   /**
    * This atribute stores the product identification code
    */
   private String id;

   /**
    * This atribute stores the product material object
    */
   private Material material;

   /**
    * Constructor method
    * 
    * @param id
    *            the Product's id
    * @param material
    *            the Product's material object
    */
   public Product(String id, Material material) {
      this.id = id;
      this.material = material;
   }

   /**
    * Getter method of atribute id
    * @return atribute id
    */
   public String getId() {
      return this.id;
   }

   /**
    * Getter method of atribute material
    * @return atribute material
    */
   public Material getMaterial() {
      return this.material;
   }

   /**
    * Abstract method price (developed in every subclass)
    */
   abstract double price();

   /**
    * This method generates and returns an String with 
    * the product identification code.
    */
   public String toString() {
      return "Product id: " + this.id + NL;
   }

}
