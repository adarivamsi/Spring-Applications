package com.adarivamsi.service;

import com.adarivamsi.model.Speaker;
import com.adarivamsi.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/27/2020
 */

@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    private SpeakerRepository repository;

    public SpeakerServiceImpl () {
        System.out.println("Empty constructor");
    }

    public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
        System.out.println("Service with repo parameter constructor");
        repository = speakerRepository;
    }

    @PostConstruct
    private void initialize () {
        System.out.println("After constructors");
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }
    public void setRepository(SpeakerRepository repository) {
        System.out.println("Setter");
        this.repository = repository;
    }
}
