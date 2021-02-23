package jpa;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Entity1.class)
public class Entity1_ {
    public static volatile SingularAttribute<Entity1, String> id;
    public static volatile SingularAttribute<Entity1, String> column1;
    public static volatile SingularAttribute<Entity1, String> column2;
    public static volatile SingularAttribute<Entity1, String> column3;
    
}
