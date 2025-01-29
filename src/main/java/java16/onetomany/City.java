package java16.onetoone;

import jakarta.persistence.*;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_id")
    @SequenceGenerator(name = "gen_id", sequenceName = "city_id", allocationSize = 1)
    private Long id;
}
