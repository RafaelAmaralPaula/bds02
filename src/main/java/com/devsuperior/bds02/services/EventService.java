package com.devsuperior.bds02.services;

import com.devsuperior.bds02.dto.EventDTO;
import com.devsuperior.bds02.entities.City;
import com.devsuperior.bds02.entities.Event;
import com.devsuperior.bds02.repositories.CityRepository;
import com.devsuperior.bds02.repositories.EventRepository;
import com.devsuperior.bds02.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private CityRepository cityRepository;

    @Transactional
    public EventDTO update(Long id, EventDTO eventDTO) {
        try{
            Event entity = eventRepository.getOne(id);
            City city =  cityRepository.getOne(eventDTO.getCityId());

            copyDtoToEntity(entity , eventDTO ,city);

            entity = eventRepository.save(entity);

            return new EventDTO(entity);
        }
        catch (EntityNotFoundException ex){
            throw new ResourceNotFoundException("Id not found : " + id);
        }

    }

    private void copyDtoToEntity(Event entity, EventDTO eventDTO , City city) {
        entity.setName(eventDTO.getName());
        entity.setUrl(eventDTO.getUrl());
        entity.setDate(eventDTO.getDate());
        entity.setCity(city);
    }
}
