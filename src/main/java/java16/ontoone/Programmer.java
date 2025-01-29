package java16.ontoone;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import java16.BaseEntity;

import java.math.BigDecimal;

@Entity
@SequenceGenerator(name = "gen_id",sequenceName = "dev_id",allocationSize = 1)
public class Programmer extends BaseEntity {

    private String ProgrammingLanguage;
    private BigDecimal Salary;
    @OneToOne
    private Laptop Laptop;
}
