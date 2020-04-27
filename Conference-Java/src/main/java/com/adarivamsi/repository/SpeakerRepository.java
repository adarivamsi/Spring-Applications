package com.adarivamsi.repository;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/27/2020
 */

import com.adarivamsi.model.Speaker;

import java.util.List;

public interface SpeakerRepository {

    List<Speaker> findAll();

}
