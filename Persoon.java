
/**
 * Write a description of class Persoon here.
 * 
 * Weiwei Tao, Patrick Breukelman
 * @1 - 21-11-2014
 */
public class Persoon
{
    private int bsn;
    private String voornaam;
    private String achternaam;
    private int dag;
    private int maand;
    private int jaar;
    private char geslacht;
    private Dienblad dienblad;
    
    /**
     * Constructor for objects of class Persoon
     */
    public Persoon(int persoonBsn, String persoonVoornaam, String persoonAchternaam, int persoonDag, 
                   int persoonMaand, int persoonJaar, char persoonGeslacht)
    {
        bsn = persoonBsn;
        voornaam = persoonVoornaam;
        achternaam = persoonAchternaam;
        setGeboortedatum(persoonDag, persoonMaand, persoonJaar);
        setGeslacht(persoonGeslacht);
    }
    //5 setters: achternaam/voornaam/geslacht/geboortedatum/BSN
    public void setVoornaam(String vn)
    {
        voornaam = vn;
    }
    
    public void setAchternaam(String an)
    {
        achternaam = an;
    }
    
    public void setBsn(int newbsn)
    {
        bsn = newbsn;
    }
    
    public void setGeboortedatum(int dag, int maand, int jaar)
    {
         if (dag >= 1 && dag <= 31 && maand >= 1 && maand <= 12 && jaar >= 1900 && jaar <= 2100)
         {
            int dagenInMaand;
             
             switch(maand){
                 case 1:  
                 case 3:
                 case 5:
                 case 7:
                 case 8:
                 case 10:
                 case 12: dagenInMaand = 31; break;
                 case 2: dagenInMaand = 28;
                         if (jaar % 4 == 0) {dagenInMaand = 29;}; break;
                 default: dagenInMaand = 30; break;
            }
            
            if (dag <= dagenInMaand){
                this.dag = dag;
                this.maand = maand;
                this.jaar = jaar;
                return;
            }
        }
        
        this.dag = 0;
        this.maand = 0;
        this.jaar = 0;
    }

    public void setGeslacht(char geslacht) {
        if (geslacht == 'M') {
           this.geslacht = geslacht;
        } else if (geslacht == 'V') {
            this.geslacht = geslacht;
        } else {
            this.geslacht = '?';
        }
    }
    //5 getters: achternaam/voornaam/geslacht/geboortedatum/BSN
    public int getBsn()
    {
        return bsn;
    }
    
    public String getVoornaam()
    {
        return voornaam;
    }
    
    public String getAchternaam()
    {
        return achternaam;
    }
    
    public String getGeslacht()
    {
        String geengeslacht;
        if (this.geslacht == 'M') {
        geengeslacht = "Man";
        } else if (this.geslacht == 'V') {
        geengeslacht = "Vrouw";
        } else {
        geengeslacht = "onbekend";
        }
        return geengeslacht;
    }
    
    public String getGeboorteDatum() 
    {
         String dagmaandjaar;
         if (dag==0 && maand==0 && jaar==0) {
         dagmaandjaar="Onbekend";
         } else {
         dagmaandjaar=dag+"/"+maand+"/"+jaar;
         }
         return dagmaandjaar;
    }
    
    public void drukAf()
    {
        System.out.println("########*Gegevens*#########");
        System.out.println("Voornaam:  " + voornaam);
        System.out.println("Achternaam: " + achternaam);
        System.out.println("BSN: " + bsn);
        System.out.print("Geboortedatum: " + dag);
        System.out.print("'" + maand);
        System.out.println("'" + jaar);
        System.out.print("Geslacht: ");
        if (geslacht == 'M') {
            System.out.println("Man");
        } else if (geslacht == 'V') {
            System.out.println("Vrouw");
        } else {
            System.out.println("onbekend");
        }
        System.out.print("########*Gegevens*#########");
        System.out.println();
    }
    
     public void pakDienblad(Dienblad dienblad)
    {
        this.dienblad = dienblad;
    }
    
    /**
       * Methode om artikel te pakken en te plaatsen op het dienblad
         * @param artikel
           */
    public void pakArtikel(Artikel artikel) 
    {
        if(dienblad == null) 
        {
            System.out.println("U heeft geen dienblad");
        }
        else 
        {
            dienblad.voegToe(artikel);
        }
    }
    
    /**
       * Methode om de totaalprijs van de artikelen
         * op dienblad dat bij de persoon hoort uit te rekenen
           * @return De totaalprijs
             */
    public double getTotaalPrijs() 
    {
        if(dienblad == null) 
        {
            System.out.println("U heeft geen dienblad");
            return 0;
        }
        else 
        {
            return dienblad.getTotaalPrijs();
        }
    }
    
    /**
       * Methode om het aantal artikelen op dienblad dat bij de
         * persoon hoort te tellen
           * @return Het aantal artikelen
             */
    public int getAantalArtikelen() 
    {
        if(dienblad == null) 
        {
            System.out.println("U heeft geen dienblad");
            return 0;
        }
        else 
        {
            return dienblad.getAantalArtikelen();
        }
    }
}