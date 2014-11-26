
/**
 * Write a description of class Artikel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Artikel
{
    // instance variables - replace the example below with your own
    private String naam;
    private String prijs;

    /**
     * Constructor for objects of class Artikel
     */
    public Artikel(String artikelNaam, String artikelPrijs)
    
    {
        // initialise instance variables
        naam = artikelNaam;
        prijs = artikelPrijs;
    }
                                               
    public String getNaam()
    {
        return naam;
    }
    
    public String getPrijs()
    {
        return prijs;
    }
    
    public void drukAf()
    {
    System.out.println("########*Gegevens*#########");
    System.out.println("Naam product: " + naam);
    System.out.println("Prijs: " + prijs + "euro's");
    System.out.print("########*Gegevens*#########");
    System.out.println();
    }
    
}