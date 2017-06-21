package ipass;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="KANDIDATEN")
public class Kandidaten implements Serializable {



    @Id
    @Column(name = "BSN", unique = true, nullable = false)
    private Integer BSN;
    @NotNull
    private String Voornaam;
    @NotNull
    private String Achternaam;
    @NotNull
    private String Geboortedatum;
    @NotNull
    private String Rekeningnummer;
    @NotNull
    private String Postcode;
    @NotNull
    private String Straat;
    @NotNull
    private String Huisnummer;
    @NotNull
    private String Plaats;


    public Kandidaten() {

    }

    public Kandidaten(Integer BSN, String voornaam, String achternaam, String geboortedatum, String rekeningnummer, String postcode, String straat, String huisnummer, String plaats) {
        this.BSN = BSN;
        Voornaam = voornaam;
        Achternaam = achternaam;
        Geboortedatum = geboortedatum;
        Rekeningnummer = rekeningnummer;
        Postcode = postcode;
        Straat = straat;
        Huisnummer = huisnummer;
        Plaats = plaats;
    }

    public Integer getBSN() {
        return BSN;
    }

    public void setBSN(Integer BSN) {
        this.BSN = BSN;
    }

    public String getVoornaam() {
        return Voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.Voornaam = voornaam;
    }

    public String getAchternaam() {
        return Achternaam;
    }

    public void setAchternaam(String achternaam) {
        Achternaam = achternaam;
    }

    public String getGeboortedatum() {
        return Geboortedatum;
    }

    public void setGeboortedatum(String geboortedatum) {
        Geboortedatum = geboortedatum;
    }

    public String getRekeningnummer() {
        return Rekeningnummer;
    }

    public void setRekeningnummer(String rekeningnummer) {
        Rekeningnummer = rekeningnummer;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String postcode) {
        Postcode = postcode;
    }

    public String getStraat() {
        return Straat;
    }

    public void setStraat(String straat) {
        Straat = straat;
    }

    public String getHuisnummer() {
        return Huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        Huisnummer = huisnummer;
    }

    public String getPlaats() {
        return Plaats;
    }

    public void setPlaats(String plaats) {
        Plaats = plaats;
    }

    @Override
    public String toString() {
        return "Kandidaten{" +
                "BSN=" + BSN +
                ", Voornaam='" + Voornaam + '\'' +
                ", Achternaam='" + Achternaam + '\'' +
                ", Geboortedatum='" + Geboortedatum + '\'' +
                ", Rekeningnummer='" + Rekeningnummer + '\'' +
                ", Postcode='" + Postcode + '\'' +
                ", Straat='" + Straat + '\'' +
                ", Huisnummer='" + Huisnummer + '\'' +
                ", Plaats='" + Plaats + '\'' +
                '}';
    }

}

