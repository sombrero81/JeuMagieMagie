/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie.service;

import magiemagie.entity.Card;
import magiemagie.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */
@Service
public class CardService {
    
    @Autowired
    private PlayerServiceCrud playerDAO;
    
    /**
     * Pioche une nouvelle carte au hasard et l'affecte au joueur.
     * @param joueurId
     * @return 
     */
    @Transactional
    public Card pioche(long joueurId){
        
        int numCarte = (int) Math.round( Math.random() * 5);
        Card card = new Card();
        
        // Génère ingrédient au hasard
        switch(numCarte){
            case 0:
                card.setTypeCard(Card.TypeCard.AILE_DE_CHAUVE_SOURIS);
                break;
            case 1:
                card.setTypeCard(Card.TypeCard.BAVE_CRAPEAU);
                break;
            case 2:
                card.setTypeCard(Card.TypeCard.CORNE_LICORNE);
                break;
            case 4:
                card.setTypeCard(Card.TypeCard.LAPIS_LAZULI);
                break;
            default:
                card.setTypeCard(Card.TypeCard.SANG_DE_VIERGE);
                break;
        }
        
        // Associe au joueur
        Player player = playerDAO.findOne(joueurId);
        
        player.getCards().add(card);
        
        playerDAO.save(player);
        
        return card;
    }
}
