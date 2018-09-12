package com.mikolajApp;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ParkingSpotDao {

    @PersistenceContext
    private EntityManager entityManager;

    public int save(ParkingSpot p) {
        entityManager.persist(p);
        return p.getId();
    }

}
