package com.adarivamsi.util;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/27/2020
 */
public class CalendarFactory implements FactoryBean<Calendar> {

    private final Calendar instance = Calendar.getInstance();

    @Override
    public Calendar getObject() throws Exception {
        return instance;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    public void addDays (int num) {
        instance.add(Calendar.DAY_OF_YEAR, num);
    }

}
