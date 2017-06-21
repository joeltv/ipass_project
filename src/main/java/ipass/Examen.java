package ipass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by joelt on 21-6-2017.
 */

@Entity
@Table(name="EXAMEN")
public class Examen implements Serializable {
    @Id
    @Column(name = "EXAMENID", unique = true, nullable = false)
    private Integer Examen_id;
    @NotNull
    private String Examennaam;



    public Examen(){

    }

    public Examen(Integer examen_id, String examennaam) {
        Examen_id = examen_id;
        Examennaam = examennaam;
    }

    public Integer getExamen_id() {
        return Examen_id;
    }

    public void setExamen_id(Integer examen_id) {
        Examen_id = examen_id;
    }


    public String getExamennaam() {
        return Examennaam;
    }

    public void setExamennaam(String examennaam) {
        Examennaam = examennaam;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "Examen_id=" + Examen_id +
                ", Examennaam='" + Examennaam + '\'' +
                '}';
    }
}
