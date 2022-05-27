/**
 * Diese Klasse modelliert R�ume in der Welt von Zuul.
 * 
 * Ein "Raum" repr�sentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen R�umen �ber Ausg�nge verbunden.
 * M�gliche Ausg�nge liegen im Norden, Osten, S�den und Westen.
 * F�r jede Richtung h�lt ein Raum eine Referenz auf den 
 * benachbarten Raum.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
package zuul;

public class Raum 
{
    private String beschreibung;
    private Raum nordausgang;
    private Raum suedausgang;
    private Raum ostausgang;
    private Raum westausgang;
    private Raum treppeNachOben;
    private Raum treppeNachUnten;

    /**
     * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
     * hat anfangs keine Ausg�nge.
     * @param beschreibung enth�lt eine Beschreibung in der Form
     *        "in einer K�che" oder "auf einem Sportplatz".
     */
    public Raum(String beschreibung) 
    {
        this.beschreibung = beschreibung;
    }

    /**
     * Definiere die Ausg�nge dieses Raums. Jede Richtung
     * f�hrt entweder in einen anderen Raum oder ist 'null'
     * (kein Ausgang).
     * @param norden Der Nordeingang.
     * @param osten Der Osteingang.
     * @param sueden Der S�deingang.
     * @param westen Der Westeingang.
     */
    public void setzeAusgaenge(Raum norden, Raum osten,
                               Raum sueden, Raum westen,
                               Raum oben, Raum unten)
    {
        if(norden != null)
            nordausgang = norden;
        if(osten != null)
            ostausgang = osten;
        if(sueden != null)
            suedausgang = sueden;
        if(westen != null)
            westausgang = westen;
        if(oben != null)
            treppeNachOben = oben;
        if(unten != null)
            treppeNachUnten = unten;
    }

    /**
     * @return Die Beschreibung dieses Raums.
     */
    public String gibBeschreibung()
    {
        return beschreibung;
    }

    public Raum getAusgang(String ausgang){
        Raum ausgangs_raum = null;
        if(ausgang.equals("north"))
            ausgangs_raum = nordausgang;
        if(ausgang.equals("east"))
            ausgangs_raum = ostausgang;
        if(ausgang.equals("south"))
            ausgangs_raum = suedausgang;
        if(ausgang.equals("west"))
            ausgangs_raum = westausgang;
        if(ausgang.equals("up"))
            ausgangs_raum = treppeNachOben;
        if(ausgang.equals("down"))
            ausgangs_raum = treppeNachUnten;
        return ausgangs_raum;
    }

    public String ausgaengeToString(){
        String ausgaenge = "";
        if(nordausgang != null)
            ausgaenge += "north ";
        if(ostausgang != null)
            ausgaenge += "east ";
        if(suedausgang != null)
            ausgaenge += "south ";
        if(westausgang != null)
            ausgaenge += "west ";
        if(treppeNachOben != null)
            ausgaenge += "up ";
        if(treppeNachUnten != null)
            ausgaenge += "down ";
        return ausgaenge;
    }
}
