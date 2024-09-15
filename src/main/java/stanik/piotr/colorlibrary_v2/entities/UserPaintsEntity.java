package stanik.piotr.colorlibrary_v2.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "userpaints")
public class UserPaintsEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Long id;
    private String brand;
    private String range;
    private String name;
    private String hex;

    public UserPaintsEntity(Long id, String brand, String range, String name, String hex) {
        this.id = id;
        this.brand = brand;
        this.range = range;
        this.name = name;
        this.hex = hex;
    }


    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public UserPaintsEntity() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }
}
