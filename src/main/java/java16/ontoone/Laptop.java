package java16.ontoone;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import java16.BaseEntity;

import java.math.BigDecimal;

@Entity
@SequenceGenerator(name = "gen_id",sequenceName = "laptop_id",allocationSize = 1)
public class Laptop extends BaseEntity {
    private String LaptopName;
    private String LaptopCode;
    private BigDecimal Price;
    @OneToOne(mappedBy = "Laptop")
    private Programmer Programmer;
}
