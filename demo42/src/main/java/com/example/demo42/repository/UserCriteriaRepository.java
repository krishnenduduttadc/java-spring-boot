package com.example.demo42.repository;

import com.example.demo42.entity.User;
import jakarta.persistence.*;
import jakarta.persistence.criteria.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserCriteriaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> findUsersByAgeAndName(int minAge, String namePart) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);

        Root<User> user = cq.from(User.class);
        Predicate agePredicate = cb.greaterThanOrEqualTo(user.get("age"), minAge);
        Predicate namePredicate = cb.like(user.get("name"), "%" + namePart + "%");

        cq.where(cb.and(agePredicate, namePredicate));

        return entityManager.createQuery(cq).getResultList();
    }
}
