package com.adarivamsi.service;

import com.adarivamsi.model.Speaker;
import com.adarivamsi.repository.SpeakerRepository;

import java.util.List;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/27/2020
 */
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl () {}

    public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
        this.repository = speakerRepository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

}
