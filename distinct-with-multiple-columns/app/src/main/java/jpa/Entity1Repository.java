package jpa;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public final class Entity1Repository {

    private Entity1Repository() {}

    private static final EntityManager em = Persistence.createEntityManagerFactory("sample-pu").createEntityManager();

    public static Entity1 find(String id) {
        return em.find(Entity1.class, id);
    }

    /**
     * Example of using tuple to specify distinct for multiple columns.
     * @return
     */
    public static List<DistinctResult> getMultipleDistinct1() {
        final CriteriaBuilder cb = em.getCriteriaBuilder();
        final CriteriaQuery<Tuple> cq = cb.createTupleQuery();
        final Root<Entity1> root = cq.from(Entity1.class);

        cq.multiselect(
            root.get(Entity1_.column1).alias("1"),
            root.get(Entity1_.column2).alias("2"))
        .distinct(true);

        return em.createQuery(cq).getResultList().stream()
            .map(t -> new DistinctResult((String)t.get("1"), (String)t.get("2")))
            .collect(Collectors.toList());
    }

    /**
     * Example of using CriteriaBuilder#construct to specify distinct for multiple columns.
     * @return
     */
    public static List<DistinctResult> getMultipleDistinct2() {
        final CriteriaBuilder cb = em.getCriteriaBuilder();
        final CriteriaQuery<DistinctResult> cq = cb.createQuery(DistinctResult.class);
        final Root<Entity1> root = cq.from(Entity1.class);

        cq.select(cb.construct(DistinctResult.class, 
            root.get(Entity1_.column1),
            root.get(Entity1_.column2)))
        .distinct(true);

        return em.createQuery(cq).getResultList();
    }
}
