
public class OperationNamensraum
{
   public static void main (String [] args)
   {
      Quadrat quad = new Quadrat();
      quad.setSeitenlaenge(5);
      Kreis kreis = new Kreis();
      kreis.setRadius(5);

      //Flaecheninhalt des Quadrats
      System.out.println ("Flaecheninhalt des Quadrats: " + /***HIER ERG�NZEN***/);

      //Flaecheninhalt des Kreises
      System.out.println ("Flaecheninhalt des Kreises: " + /***HIER ERG�NZEN***/);
   }
}

class Quadrat
{
   private double seitenlaenge;

   public void setSeitenlaenge (double seitenlaenge)
   {
      this.seitenlaenge = seitenlaenge;
   }

   //***HIER ERG�NZEN***
}

class Kreis
{
   private double radius;

   public void setRadius (double radius)
   {
      this.radius = radius;
   }

   //***HIER ERG�NZEN***
}
