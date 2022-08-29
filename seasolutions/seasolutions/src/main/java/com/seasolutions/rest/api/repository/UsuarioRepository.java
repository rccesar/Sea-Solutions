package com.seasolutions.rest.api.repository;

import com.seasolutions.rest.api.model.Trabalhador;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository <Trabalhador, String > {

}
