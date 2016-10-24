/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie.service;

import magiemagie.entity.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class GameService {
    
    @Autowired
    private GameDAO gameServiceCrud;
    
    
    
     /**
      * creer partie si pas de partie dispo en statut standby
      */
    @Scheduled(fixedDelay = 1000L)
    public void creerPartieSiPasDispo() {
        System.out.println("passer ici");

        long nbr = gameServiceCrud.countByStatut(Game.Status.STANDBY);
        if (nbr == 0) {
            Game game = new Game();
            game.setStatut(Game.Status.STANDBY);
            gameServiceCrud.save(game);
        }

        
    }
}
