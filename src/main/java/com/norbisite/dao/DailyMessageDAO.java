package com.norbisite.dao;

import com.norbisite.domain.DailyMessage;

public interface DailyMessageDAO {

    void save(DailyMessage dailyMessage);

    String findMessageByDay(int day);

    void modify(DailyMessage dailyMessage);
}
