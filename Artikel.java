
/**
 * Write a description of class Artikel here.
 * 
 * Weiwei Tao, Patrick Breukelman
 * @ version week2 - 01'12'2014
 */
public class Artikel
{
    // instance variables - replace the example below with your own
    private String naam;
    private double prijs;

    /**
     * Constructor for objects of class Artikel
     */
    public Artikel(String artikelNaam, double artikelPrijs)
    
    {
        // initialise instance variables
        naam = artikelNaam;
        prijs = artikelPrijs;
    }
                                               
    public String getNaam()
    {
        return naam;
    }
    
    public double getPrijs()
    {
        return prijs;
    }
    
    public void drukAf()
    {
    System.out.println("########*Gegevens*#########");
    System.out.println("Naam product: " + naam);
    System.out.println("Prijs: " + prijs + " euro's");
    System.out.print("########*Gegevens*#########");
    System.out.println();
    }
    
}