package java16.onetomany;

import jakarta.persistence.*;
import java16.BaseEntity;

@Entity
@SequenceGenerator(name = "gen_id", sequenceName = "city_id", allocationSize = 1)
public class City extends BaseEntity {


    private String CityName;

    @ManyToOne
    private Country Country;

}
