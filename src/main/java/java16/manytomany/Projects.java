package java16.manytomany;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import java16.BaseEntity;

import java.util.List;

@Entity
@SequenceGenerator(name = "gen_id",sequenceName = "pro_id", allocationSize = 1)

public class Projects extends BaseEntity {
    private String ProjectName;
    private String ProjectDescription;

    @ManyToMany
    private List<Developer> developerList;
}
