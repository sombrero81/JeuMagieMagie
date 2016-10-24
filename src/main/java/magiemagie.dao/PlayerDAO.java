/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie.service;

import java.util.List;
import magiemagie.entity.Card;
import magiemagie.entity.Player;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author Ayo Boo
 */
public interface PlayerDAO extends CrudRepository<Player,Long> {
    
    public List<Player> findAllByGameId(long id);
    
    @Override
    public <Card extends Player> Card save(Card Cards);
    
}
