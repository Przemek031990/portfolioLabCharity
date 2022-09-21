package pl.coderslab.charity.institution;


import javax.persistence.*;

@Entity
@Table(name = Institution.TABLE_NAME)
public class Institution {

    final static String TABLE_NAME="institutions";

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private String description;

    public Institution(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
