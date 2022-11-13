package entities;

import javax.persistence.*;

@Entity
@Table(name = "coffee")
public class CoffeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String CoffeeName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoffeeName() {
        return CoffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        CoffeeName = coffeeName;
    }

    @Override
    public String toString() {
        return "CoffeeEntity{" +
                "id=" + id +
                ", CoffeeName='" + CoffeeName + '\'' +
                '}';
    }
}
