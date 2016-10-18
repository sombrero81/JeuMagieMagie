/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie.service;

import java.io.Serializable;
import java.util.List;
import magiemagie.entity.Game;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author admin
 */
public interface GameServiceCrud extends CrudRepository<Game, Long>{
    
    
//    public List<Game> findAllByOrderByIdAsc (long t); 
} 
