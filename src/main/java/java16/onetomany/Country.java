package java16.onetoone;

import jakarta.persistence.*;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gencountry_id")
    @SequenceGenerator(name = "gencountry_id", sequenceName = "country_id", allocationSize = 1)
    private Long id;
}
