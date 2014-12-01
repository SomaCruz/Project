import java.util.Stack;

public class Dienblad
{
    /**
    * Constructor
    */
    private Stack<Artikel> artikelen;
    
    public Dienblad()
    {
        artikelen = new Stack<Artikel>();
    }
    
    /**
    * Methode om artikel aan dienblad toe te voegen
    * @param artikel
    */
    public void voegToe(Artikel artikel) 
    {
       artikelen.add(artikel);
    }
    
    /**
       * Methode om aantal artikelen op dienblad te tellen
         * @return Het aantal artikelen
           */
    public int getAantalArtikelen() 
    {
        return this.artikelen.size();
    }
    
    /**
       * Methode om de totaalprijs van de artikelen
         * op dienblad uit te rekenen
           * @return De totaalprijs
             */
    public double getTotaalPrijs() 
    {
        double totaalPrijs = 0;
        for(int i = 0; i < this.artikelen.size(); i++) {
            totaalPrijs += this.artikelen.get(i).getPrijs();
        }
        return totaalPrijs;
    }
}