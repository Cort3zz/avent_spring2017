package com.norbisite.dao.impl;

import com.norbisite.dao.DailyMessageDAO;
import com.norbisite.domain.DailyMessage;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
@Transactional
public class JPADailyMessageDAO implements DailyMessageDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(DailyMessage dailyMessage) {
        entityManager.merge(dailyMessage);
    }

    @Override
    public String findMessageByDay(int day) {
        DailyMessage actualDailyMessage = entityManager.find(DailyMessage.class, day);
        if (actualDailyMessage.getMessage().isEmpty()) {
            return "Feltöltés alatt! :)";
        }
        return actualDailyMessage.getMessage();
    }

    @Override
    public void modify(DailyMessage dailyMessage) {
        DailyMessage modifiedMessage = entityManager.find(DailyMessage.class, dailyMessage.getDay());
        entityManager.getTransaction().begin();
        modifiedMessage.setMessage(dailyMessage.getMessage());
        entityManager.getTransaction().commit();

    }
}
