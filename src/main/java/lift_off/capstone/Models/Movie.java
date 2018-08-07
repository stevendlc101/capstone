package lift_off.capstone.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=1, max=100)
    private String name;

    public Movie(String name){ }

    public Movie() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
