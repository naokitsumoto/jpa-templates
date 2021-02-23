package jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Entity1 {
    @Id
    private String id;

    private String column1;

    private String column2;

    private String column3;
}
