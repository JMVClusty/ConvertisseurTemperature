package modeles;

/**
 * Une classe permettant d'obtenir une température en Celsius ou Fahrenheit.
 *
 */
 public class Temperature {

   /**
    * La valeur, exprimée en degrés Celsius
    */
   private double temperature;
   


/**
    * Le constructeur, prend des Celsius en paramètres
   */
   public Temperature(double valeur)
   {
	   temperature = valeur;
   }
 

   /**
    * Pour obtenir la valeur en Celsius
    *
    * @return Valeur de la température en Celsius
  */
   public double getCelsius() {
         return (temperature-32)*5/9 ;
   }
   

   /**
    * Pour obtenir la valeur en Fahrenheit
    *
    * @return Valeur de la température en Fahrenheit
   */
   public double getFahrenheit() {
         return (temperature * 9/5) + 32;
 }
}