package java16.manytomany;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import java16.BaseEntity;

import java.util.List;

@Entity
@SequenceGenerator(name = "gen_id", sequenceName = "delve_id",allocationSize = 1)
public class Developer extends BaseEntity {
    private String DeveloperName;
    private String DeveloperEmail;
    private String DeveloperPhone;

    @ManyToMany(mappedBy = "developerList")
    private List<Projects> projectsList;
}
