import java.util.LinkedList;
public class KassaRij {
    /**
       * Constructor
         */
    private LinkedList<Persoon> personen;
        
    public KassaRij() 
    {
        personen = new LinkedList<Persoon>();
    }
    /**
       * Persoon sluit achter in de rij aan
         * @param persoon
           */
    public void sluitAchteraan(Persoon persoon) 
    {
        personen.add(persoon);
    }
    /**
       * Indien er een rij bestaat, de eerste Persoon uit
         * de rij verwijderen en retourneren.
           * Als er niemand in de rij staat geeft deze null terug.
             * @return Eerste persoon in de rij of null
               */
    public Persoon eerstePersoonInRij() 
    {
        if(personen.size() > 0) 
        {
            Persoon Eerste = personen.get(0);
            personen.remove(0);
            return Eerste;
        }
        else 
        {
            return null;
        }
    }
    /**
       * Methode kijkt of er personen in de rij staan.
         * @return Of er wel of geen rij bestaat
           */
    public boolean erIsEenRij() 
    {
        if (personen.size() > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}