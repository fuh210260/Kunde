/**
 * @author Rene Fuhry
 * @version 23-09-2022
 */
public class Kunde {
    private int nummer;
    private int einkaeufe;
    private int umsatz;
    private int guthaben;
    private String name;

    /**
     * constructor that gives all the default parameters
     */
    public Kunde() {
        setNummer(1000);
        setEinkaeufe(5);
        setUmsatz(100);
        setGuthaben(15);
        setName("Hubert Müller");
    }

    /**
     * constructor with costum Kundennummer
     */
    public Kunde(int Kundennummer) {
        setNummer(Kundennummer);
        setEinkaeufe(5);
        setUmsatz(100);
        setGuthaben(15);
        setName("Hubert Müller");
    }

    /**
     * sets the Kundennummer
     */
    public void setNummer(int set_nummer) {
        if(set_nummer >= 1000) {
            nummer = set_nummer;
        }
        else {
            System.out.println("nummer needs to be positive and larger than or equal to 1000");
        }
    }

    /**
     * sets the Einkaeufe
     */
    public void setEinkaeufe(int set_einkaeufe) {
        if(set_einkaeufe >= 0) {
            einkaeufe = set_einkaeufe;
        }
        else {
            System.out.println("einkaeufe needs to be positive");
        }
    }

    /**
     * sets the Umsatz
     */
    public void setUmsatz(int set_umsatz) {
        if(set_umsatz >= 0) {
            umsatz = set_umsatz;
        }
        else {
            System.out.println("umsatz needs to be positive");
        }
    }

    /**
     * sets the Guthaben
     */
    public void setGuthaben(int set_guthaben) {
        if(set_guthaben >= 0) {
            guthaben = set_guthaben;
        }
        else {
            System.out.println("guthaben needs to be positive");
        }
    }
    
    public void setName(String nameNeu) {
        int posLeerzeichen;
        char zeichen;
        String surName;
        String firstName;
        
        if(nameNeu != null && nameNeu.length() >= 2) {
            if(nameNeu.charAt(0) >= 'A' && nameNeu.charAt(0) <= 'Z') {
                posLeerzeichen= nameNeu.indexOf(' ');
                if(posLeerzeichen >= 2) {
                    zeichen = nameNeu.charAt(posLeerzeichen + 1);
                    if(zeichen >= 'A' && zeichen <= 'Z') {
                        surName = nameNeu.substring(0, posLeerzeichen);
                        firstName = nameNeu.substring(posLeerzeichen + 1);
                        System.out.println(firstName + " " + surName);
                        if(surName.equals(firstName)) {
                            System.out.println("setName: surName and firstName are equal");
                        }
                        name = nameNeu;
                    }
                    else {
                        System.out.println("setName: character after space needs to be capitalized");
                    }
                }
                else {
                System.out.println("setName: needs space after at least two characters");
                }
            }
            else {
            System.out.println("setName: first character needs to be capitelized");
            }
        }
        else {
            System.out.println("setName: null or too short");
        }
    }

    /**
     * gets the Kundennummer
     */
    public int getNummer() {
        return nummer;
    }

    /**
     * gets the Einkaeufe
     */
    public int getEinkaeufe() {
        return einkaeufe;
    }

    /**
     * gets the Umsatz
     */
    public int getUmsatz() {
        return umsatz;
    }

    /**
     * gets the Guthaben
     */
    public int getGuthaben() {
        return guthaben;
    }
    
    public String getName() {
        return name;
    }

    /**
     * prints every info about Kunde into the terminal
     */
    public void anzeigen() {
        System.out.println(nummer);
        System.out.println(einkaeufe);
        System.out.println(umsatz);
        System.out.println(guthaben);
        System.out.println(name);
    }

    /**
     * sets the Guthaben to 0
     */
    public void loesheGuthaben() {
        setGuthaben(0);
    }

    /**
     * adds the value of einkauf to umsatz
     * adds 1 to the number of einkaeufe
     * if the value of einkauf is higher than 100, 5 gets added to guthaben
     */
    public void einkaufen(int einkauf) {
        if(einkauf > 0) {
            setUmsatz(umsatz + einkauf);
            setEinkaeufe(einkaeufe + 1);
            if(einkauf > 50 && einkauf <= 100) {
                setGuthaben(guthaben + 3);
            }
            else {
                setGuthaben(guthaben + 5 * (einkauf / 100));
            }
        }
        else {
            System.out.println("einkauf needs to be positive");
        }
    }
    
    public String toString() {
        String s;
        
        s = "KNr: " + nummer + ", " + name;           //Variant 1
        if(einkaeufe > 0) {
            s = s + ", " + einkaeufe + " Einkäufe";         //Variant 2
        }
        if(guthaben > 0) {
            s = s + ", Guthaben " + guthaben + " Euro";     //Variant 3
            }
        if(einkaeufe > 0) {
            s = s + ", Umsatz: " + umsatz + " Euro";        //Variant 4
            }
        
        return s;
    }
}