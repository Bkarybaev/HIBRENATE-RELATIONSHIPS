package java16.onetomany;

import jakarta.persistence.*;
import java16.BaseEntity;

import java.util.List;

@Entity
@SequenceGenerator(name = "gencountry_id", sequenceName = "country_id", allocationSize = 1)

public class Country extends BaseEntity {
    private String CountryName;

    @OneToMany(mappedBy = "Country")
    private List<City> CityList;
}
