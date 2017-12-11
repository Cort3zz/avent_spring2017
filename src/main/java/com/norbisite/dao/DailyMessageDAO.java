package com.norbisite.dao;

import com.norbisite.domain.DailyMessage;

import java.util.List;

public interface DailyMessageDAO {

    void save(DailyMessage dailyMessage);

    String findMessageByDay(int day);

    void modify(DailyMessage dailyMessage);

    List<DailyMessage> allMessage();
}
