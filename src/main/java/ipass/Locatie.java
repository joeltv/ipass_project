package ipass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by joelt on 21-6-2017.
 */

@Entity
@Table(name="LOCATIE")
public class Locatie {
    @Id
    @Column(name = "LOCATIEID", unique = true, nullable = false)
    private Integer Locatie_id;
    private String Naam;

    public Locatie(){

    }

    public Locatie(Integer locatie_id, String naam) {
        Locatie_id = locatie_id;
        Naam = naam;
    }

    public Integer getLocatie_id() {
        return Locatie_id;
    }

    public void setLocatie_id(Integer locatie_id) {
        Locatie_id = locatie_id;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String naam) {
        Naam = naam;
    }

    @Override
    public String toString() {
        return "Locatie{" +
                "Locatie_id=" + Locatie_id +
                ", Naam=" + Naam +
                '}';
    }
}