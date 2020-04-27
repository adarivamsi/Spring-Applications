package com.adarivamsi.repository;

import com.adarivamsi.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/27/2020
 */

@Repository("speakerRepository")
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar cal;

    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNum;

    public List<Speaker> findAll() {

        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Vamsi Charan");
        speaker.setLastName("Adari");
        speaker.setSeedNum(seedNum);

        System.out.println("Cal : " + cal.getTime());

        speakers.add(speaker);

        return speakers;

    }

}
