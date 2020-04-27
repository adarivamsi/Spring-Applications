package com.adarivamsi.service;

import com.adarivamsi.model.Speaker;
import com.adarivamsi.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/27/2020
 */

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    @Autowired
    public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
        repository = speakerRepository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
