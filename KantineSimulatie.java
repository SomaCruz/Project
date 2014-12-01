/**
 * Write a description of class KantinSimulatie here.
 * 
 * Weiwei Tao, Patrick Breukelman
 * @ version week2 - date 01'12'2014
 */
public class KantineSimulatie 
{
    private Kantine kantine;
    
    /**
     * Constructor for objects of class KantineSimulatie
     */
    public KantineSimulatie() 
    {
        kantine = new Kantine();
    }
    
    /**
     * Deze methode simuleert een aantal dagen in het
     * verloop van de kantine
     * @param dagen
     */
    public void simuleer(int dagen) 
    {
        // for lus voor dagen
        for (int i = 0; i < dagen; i++) {
            // per dag nu even vast 10+i personen naar binnen
            // laten gaan, wordt volgende week veranderd...
            // for lus voor personen
            for(int j=0;j<10+i;j++){
                kantine.loopPakSluitAan();
            }
            // verwerk rij voor de kassa
            kantine.verwerkRijVoorKassa();
            // toon dagtotalen (artikelen en geld in kassa)
            System.out.println("Totaal aantal vekochte artikelen: "+kantine.aantalArtikelen());
            System.out.println("Totaal aantal geld in kassa: "+kantine.hoeveelheidGeldInKassa());
            // reset de kassa voor de volgende dag
            kantine.resetKassa();
        }
    }
}