package ipass;

import javax.persistence.*;
import java.util.List;

/**
 * Created by joelt on 21-6-2017.
 */
@Entity
@Table(name="EXAMEN_LOCATIE_TIJD")
public class ExamenMoment {
    @Id
    @Column(name = "EXAMENGEGEVEMSID", unique = true, nullable = false)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Examen examen;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Locatie locatie;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Tijd tijd;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "EXAMEN_KANDIDAAT", joinColumns = {
            @JoinColumn(name = "EXAMENGEGEVENSID", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "BSN",
                    nullable = false, updatable = false) })
    List<Kandidaten> kandidaten;

    public ExamenMoment() {
    }

    public ExamenMoment(Integer id, Examen examen, Locatie locatie, Tijd tijd, List<Kandidaten> kandidaten) {
        this.id = id;
        this.examen = examen;
        this.locatie = locatie;
        this.tijd = tijd;
        this.kandidaten = kandidaten;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }

    public Tijd getTijd() {
        return tijd;
    }

    public void setTijd(Tijd tijd) {
        this.tijd = tijd;
    }

    public List<Kandidaten> getKandidaten() {
        return kandidaten;
    }

    public void setKandidaten(List<Kandidaten> kandidaten) {
        this.kandidaten = kandidaten;
    }

    @Override
    public String toString() {
        return "ExamenMoment{" +
                "id=" + id +
                ", examen=" + examen +
                ", locatie=" + locatie +
                ", tijd=" + tijd +
                ", kandidaten=" + kandidaten +
                '}';
    }
}
