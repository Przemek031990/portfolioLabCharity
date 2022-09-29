package pl.coderslab.charity.category;


import pl.coderslab.charity.donation.Donation;

import javax.persistence.*;

@Entity
@Table(name = Category.TABLE_NAME)
public class Category {

    final static String TABLE_NAME="categories";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Donation donation;
    public Category(){

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

    public Donation getDonation() {
        return donation;
    }

    public void setDonation(Donation donation) {
        this.donation = donation;
    }
}
