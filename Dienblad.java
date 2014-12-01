import java.util.Stack;

/**
 * Write a description of class Dienblad here.
 * 
 * Weiwei Tao, Patrick Breukelman
 * @ version week2 - date 01'12'2014
 */
public class Dienblad
{
    private Stack<Artikel> artikelen;
    
    /**
     * Constructor for objects of class Dienblad
     */
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
        for (int i = 0; i < this.artikelen.size(); i++) {
            totaalPrijs += this.artikelen.get(i).getPrijs();
        }
        return totaalPrijs;
    }
}