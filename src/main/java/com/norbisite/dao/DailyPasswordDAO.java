package com.norbisite.dao;

import com.norbisite.domain.DailyPassword;

public interface DailyPasswordDAO {

    void save(DailyPassword dailyPassword);

    String findPasswordByDay(int day);

    void modify(DailyPassword dailyPassword);
}
