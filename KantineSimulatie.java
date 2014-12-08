/**
 * Write a description of class KantinSimulatie here.
 * 
 * Weiwei Tao, Patrick Breukelman
 * @ version week2 - date 01'12'2014
 */
public class KantineSimulatie 
{
    private Kantine kantine;
    // kantineaanbod
    private KantineAanbod kantineaanbod;
    // random generator
    private Random random;
    // aantal artikelen
    private static final int AANTAL_ARTIKELEN=4;
    // artikelen
    private static final String[] artikelnamen=
    new String[] {"Koffie","Broodje pindakaas", "Broodje kaas", "Appelsap"};
    // prijzen
    private static double[] artikelprijzen=
    new double[]{1.50, 2.10, 1.65, 1.65};
    // minimum en maximum aantal artikelen per soort
    private static final int MIN_ARTIKELEN_PER_SOORT=10000;
    private static final int MAX_ARTIKELEN_PER_SOORT=20000;
    // minimum en maximum aantal personen per dag
    private static final int MIN_PERSONEN_PER_DAG=50;
    private static final int MAX_PERSONEN_PER_DAG=100;
    // minimum en maximum artikelen per persoon
    private static final int MIN_ARTIKELEN_PER_PERSOON=1;
    private static final int MAX_ARTIKELEN_PER_PERSOON=4;
    /**
     * Constructor for objects of class KantineSimulatie
     */
    public KantineSimulatie()
    {
        kantine=new Kantine();
        random=new Random();
        int[] hoeveelheden=getRandomArray(
        AANTAL_ARTIKELEN,MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);
        kantineaanbod=new KantineAanbod(artikelnamen, artikelprijzen,
        hoeveelheden);
        kantine.setKantineAanbod(kantineaanbod);
    }
    
    /**
    * Methode om een array van random getallen liggend tussen min en max
    * van de gegeven lengte te genereren
    * @param lengte
    * @param min
    * @param max
    * @return De array met random getallen
    */
    private int[] getRandomArray(int lengte, int min, int max) 
    {
       int[] temp=new int[lengte];
       for(int i=0;i<lengte;i++) {
           temp[i]=getRandomValue(min, max);
        }
        return temp;
    }
    
    /**
    * Methode om op basis van een array van indexen voor de array
    * artikelnamen de bijhorende array van artikelnamen te maken
    * @param indexen
    * @return De array met artikelnamen
    */
    private String[] geefArtikelNamen(int[] indexen) 
    {
        String[] artikelen=new String[indexen.length];
        for(int i=0;i<indexen.length;i++) {
            artikelen[i]=artikelnamen[indexen[i]];
        }
        return artikelen;
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
            // maak persoon en dienblad aan, koppel ze
            // bedenk hoeveel artikelen worden gepakt
            //int aantalartikelen=...
            // genereer de “artikelnummers”, dit zijn indexen
            // van de artikelnamen array
            int[] tepakken=getRandomArray(aantalartikelen, 0,
            AANTAL_ARTIKELEN-1);
            String[] artikelen=geefArtikelNamen(tepakken);
            // verwerk rij voor de kassa
            kantine.verwerkRijVoorKassa();
            // toon dagtotalen (artikelen en geld in kassa)
            System.out.println("Totaal aantal vekochte artikelen: ");
            kantine.getKassa();
            System.out.println("Totaal aantal geld in kassa: ");
            kantine.getKassa();
            // reset de kassa voor de volgende dag
            kantine.getKassa();
        }
    }
}