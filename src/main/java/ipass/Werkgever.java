package ipass;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="WERKGEVER")
public class Werkgever {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="WERKGEVER_SEQ")
    @Column(name="WERKGEVER_ID", nullable=false )
    @SequenceGenerator(name="WERKGEVER_SEQ", sequenceName="WERKGEVER_SEQ", allocationSize=1)
    private Integer    id           ;
    @NotNull
    private String Bedrijfsnaam;
    @NotNull
    private String Voornaam;
    @NotNull
    private String Achternaam;
    @NotNull
    private String Inlognaam;
    @NotNull
    private String Wachtwoord;
    @NotNull

    private String Emailadres;
    @NotNull
    private String Telefoonnummer_Actor;
    @NotNull
    private String Telefoonnummer_Bedrijf;

    public Werkgever() {

    };

    public Werkgever(Integer id, String bedrijfsnaam, String voornaam, String achternaam, String inlognaam, String wachtwoord, String emailadres, String telefoonnummer_Actor, String telefoonnummer_Bedrijf) {
        id = id;
        Bedrijfsnaam = bedrijfsnaam;
        Voornaam = voornaam;
        Achternaam = achternaam;
        Inlognaam = inlognaam;
        Wachtwoord = wachtwoord;
        Emailadres = emailadres;
        Telefoonnummer_Actor = telefoonnummer_Actor;
        Telefoonnummer_Bedrijf = telefoonnummer_Bedrijf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBedrijfsnaam() {
        return Bedrijfsnaam;
    }

    public void setBedrijfsnaam(String bedrijfsnaam) {
        Bedrijfsnaam = bedrijfsnaam;
    }

    public String getVoornaam() {
        return Voornaam;
    }

    public void setVoornaam(String voornaam) {
        Voornaam = voornaam;
    }

    public String getAchternaam() {
        return Achternaam;
    }

    public void setAchternaam(String achternaam) {
        Achternaam = achternaam;
    }

    public String getInlognaam() {
        return Inlognaam;
    }

    public void setInlognaam(String inlognaam) {
        Inlognaam = inlognaam;
    }

    public String getWachtwoord() {
        return Wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        Wachtwoord = wachtwoord;
    }

    public String getEmailadres() {
        return Emailadres;
    }

    public void setEmailadres(String emailadres) {
        Emailadres = emailadres;
    }

    public String getTelefoonnummer_Actor() {
        return Telefoonnummer_Actor;
    }

    public void setTelefoonnummer_Actor(String telefoonnummer_Actor) {
        Telefoonnummer_Actor = telefoonnummer_Actor;
    }

    public String getTelefoonnummer_Bedrijf() {
        return Telefoonnummer_Bedrijf;
    }

    public void setTelefoonnummer_Bedrijf(String telefoonnummer_Bedrijf) {
        Telefoonnummer_Bedrijf = telefoonnummer_Bedrijf;
    }

    @Override
    public String toString() {
        return "Werkgever{" +
                "Bedrijfsnaam='" + Bedrijfsnaam + '\'' +
                ", Voornaam='" + Voornaam + '\'' +
                ", Achternaam='" + Achternaam + '\'' +
                ", Inlognaam='" + Inlognaam + '\'' +
                ", Wachtwoord='" + Wachtwoord + '\'' +
                ", Emailadres='" + Emailadres + '\'' +
                ", Telefoonnummer_Actor='" + Telefoonnummer_Actor + '\'' +
                ", Telefoonnummer_Bedrijf='" + Telefoonnummer_Bedrijf + '\'' +
                '}';
    }
}

