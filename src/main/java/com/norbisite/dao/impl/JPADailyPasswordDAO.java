package com.norbisite.dao.impl;

import com.norbisite.dao.DailyPasswordDAO;
import com.norbisite.domain.DailyPassword;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
@Transactional
public class JPADailyPasswordDAO implements DailyPasswordDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(DailyPassword dailyPassword) {
        entityManager.merge(dailyPassword);
    }

    @Override
    public String findPasswordByDay(int day) {
        DailyPassword actualDailyPassword = entityManager.find(DailyPassword.class, day);
        return actualDailyPassword.getPassword();
    }
}
