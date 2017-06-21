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
@Table(name="TIJD")
public class Tijd {
    @Id
    @Column(name = "TIJDID", unique = true, nullable = false)
    private Integer Tijd_id;
    private Date Begintijd;

    public Tijd(Integer tijd_id, Date begintijd) {
        Tijd_id = tijd_id;
        Begintijd = begintijd;
    }

    public Tijd() {

    }

    public Integer getTijd_id() {
        return Tijd_id;
    }

    public void setTijd_id(Integer tijd_id) {
        Tijd_id = tijd_id;
    }

    public Date getBegintijd() {
        return Begintijd;
    }

    public void setBegintijd(Date begintijd) {
        Begintijd = begintijd;
    }

    @Override
    public String toString() {
        return "Tijd{" +
                "Tijd_id=" + Tijd_id +
                ", Begintijd=" + Begintijd +
                '}';
    }
}
