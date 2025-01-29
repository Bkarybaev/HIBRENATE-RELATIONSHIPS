package java16.config;

import jakarta.persistence.EntityManagerFactory;
import java16.manytomany.Developer;
import java16.manytomany.Projects;
import java16.onetomany.City;
import java16.onetomany.Country;
import java16.ontoone.Laptop;
import java16.ontoone.Programmer;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class DataBaseConfig {
    public static EntityManagerFactory getEntityManager(){
        Properties props = new Properties();
            props.put(Environment.JAKARTA_JDBC_URL,"jdbc:postgresql://localhost:5432/postgres");
            props.put(Environment.JAKARTA_JDBC_USER,"postgres");
            props.put(Environment.JAKARTA_JDBC_PASSWORD,"baiel123");
            props.put(Environment.DIALECT,"org.hibernate.dialect.PostgreSQLDialect");
            props.put(Environment.HBM2DDL_AUTO,"update");
            props.put(Environment.SHOW_SQL,true);

        Configuration cfg = new Configuration();
        cfg.setProperties(props);
        cfg.addAnnotatedClass(Programmer.class);
        cfg.addAnnotatedClass(Laptop.class);
        cfg.addAnnotatedClass(City.class);
        cfg.addAnnotatedClass(Country.class);
        cfg.addAnnotatedClass(Developer.class);
        cfg.addAnnotatedClass(Projects.class);

        return cfg.buildSessionFactory().unwrap(EntityManagerFactory.class);
    };
}
