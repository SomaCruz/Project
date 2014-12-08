/**
 * Write a description of class Kantine here.
 * 
 * Weiwei Tao, Patrick Breukelman
 * @ version week2 - date 01'12'2014
 */
public class Kantine 
{
    private Kassa kassa;
    private KassaRij kassarij;
    private Persoon persoon;
    
    /**
     * Constructor for objects of class Kantine
     */
    public Kantine() 
    {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
    }
    
    /**
     * In deze methode wordt een Persoon en Dienblad
     * gemaakt en aan elkaar
     * gekoppeld. Maak twee Artikelen aan en plaats
     * deze op het dienblad.
     * Tenslotte sluit de Persoon zich aan bij de rij
     * voor de kassa.
     */
    public void loopPakSluitAan() 
    {
      Persoon persoon = new Persoon(999666999, "Bennie", "Tiggeloven", 1, 5, 2000, 'M');
      Dienblad dienblad = new Dienblad();
      Artikel artikel1 = new Artikel ("Pizza", 3.50);
      Artikel artikel2 = new Artikel ("Koffie", 1.00);
      
      persoon.pakDienblad(dienblad);
      persoon.pakArtikel(artikel1);
      persoon.pakArtikel(artikel2);
      kassarij.sluitAchteraan(persoon);
    }
    
    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() 
    {
        while((this.persoon = kassarij.eerstePersoonInRij()) != null) 
        {
            kassa.rekenAf(persoon);
        }
    }
     
    private void getKassa()
    {
        kassa.resetKassa();
        kassa.aantalArtikelen();
        kassa.hoeveelheidGeldInKassa();
    }
}