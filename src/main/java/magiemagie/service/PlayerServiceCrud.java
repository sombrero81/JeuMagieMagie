/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie.service;

import magiemagie.entity.Player;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author Ayo Boo
 */
public interface PlayerServiceCrud extends CrudRepository<Player,Long> {
    
    
}
