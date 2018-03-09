package com.restauranteapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.restauranteapp.restauranteapp.models.Evento;

public interface RestauranteInterface extends CrudRepository<Evento, String>{

}
