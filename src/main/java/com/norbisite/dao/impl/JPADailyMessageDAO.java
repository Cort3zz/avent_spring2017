package com.norbisite.dao.impl;

import com.norbisite.dao.DailyMessageDAO;
import com.norbisite.domain.DailyMessage;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

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
        modifiedMessage.setMessage(modifiedMessage.getMessage().substring(0,modifiedMessage.getMessage().indexOf("<p>")+3) + dailyMessage.getMessage() + "</p>  ");
    }

    @Override
    public List<DailyMessage> allMessage() {
        return entityManager.createQuery("SELECT d FROM DailyMessage d", DailyMessage.class)
                .getResultList();
    }
}
