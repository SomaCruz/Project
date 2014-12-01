/**
 * Write a description of class Kassa here.
 * 
 * Weiwei Tao, Patrick Breukelman
 * @ version week2 - date 01'12'2014
 */
public class Kassa 
{
    private int verkocht;
    private double kassaGeld;
    private KassaRij kassarij;
    
    /**
     * Constructor for objects of class Kassa
     */
    public Kassa(KassaRij kassarij) 
    {
        this.kassarij = kassarij;
        this.kassaGeld = 0.0;
    }
    
    /**
     * vraag het aantal artikelen en de totaalprijs op.
     * De implementatie wordt later vervangen
     * door een echte betaling door de persoon.
     * @param persoon die moet afrekenen
     */
    public void rekenAf(Persoon persoon) 
    {
        this.verkocht += persoon.getAantalArtikelen();
        this.kassaGeld += persoon.getTotaalPrijs();
    }
    
    /**
     * Geeft het aantal artikelen dat de kassa
     * heeft gepasseerd,
     * vanaf het moment dat de methode resetWaarden
     * is aangeroepen.
     * @return aantal artikelen
     */
    public int aantalArtikelen() 
    {
        return this.verkocht;
    }
    
    /**
     * Geeft het totaalbedrag van alle artikelen die
     * de kassa zijn gepasseerd, vanaf het moment dat de methode
     *resetKassa
     * is aangeroepen.
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() 
    {
        return this.kassaGeld;
    }
    
    /**
     * reset de waarden van het aantal gepasseerde artikelen en
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa() 
    {
        this.verkocht = 0;
        this.kassaGeld = 0.0;
    }
}