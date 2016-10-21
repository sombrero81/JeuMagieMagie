/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie.controller;

import java.lang.reflect.Method;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.http.HttpSession;
import magiemagie.entity.Avatar;
import magiemagie.entity.Card;
import magiemagie.entity.Game;
import magiemagie.entity.Player;
import magiemagie.service.CardService;
import magiemagie.service.GameServiceCrud;
import magiemagie.service.PlayerServiceCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author admin
 */

@Controller
public class GameController {
    
    @Autowired
    private CardService cardService;
    
    @Autowired
    private GameServiceCrud service;
    
    @Autowired
    private PlayerServiceCrud playerDao;
    
    //lister les parties
    @RequestMapping(value={"/liste_games", "/"}, method = RequestMethod.GET)
    public String lister (Model model){
        
        model.addAttribute("lesgames", service.findAll());
        return "lister_partie.jsp";
        
    }
    
    //joindre partie
    @RequestMapping(value="/join/{idGame}", method = RequestMethod.GET)
    public String joinGET(@PathVariable("idGame") long id,Model model, HttpSession session){
     
        Game game = service.findOne(id);
        
        session.setAttribute("currentGameId", id);
                
        return "join.jsp";
     
     //jouer à une partie
        
    }
    
    @RequestMapping(value = "/ajax_cartes_joueur_act", method = RequestMethod.GET)
    public String ajaxCartesJoueurAct(Model model, HttpSession session) {
        
        // Récup joueur en session
        long playerId = (long) session.getAttribute("currentPlayerId");
        Player player = playerDao.findOne(playerId);
        
        // Set liste cartes en model attr
        model.addAttribute("cartes", player.getCards());

        return "ajax_cartes_joueur_act.jsp";
    }

    
    @Autowired
    private GameServiceCrud Gameservice;
    
    /**
     * Démarre partie
     * @param player
     * @param session
     * @return 
     */
    @RequestMapping(value="/game/",method = RequestMethod.GET)
    public String startGame(Model model, HttpSession session){
     
        // Récup id game
        long gameId = (long) session.getAttribute("currentGameId");
        
        // Récup id player
        long playerId = (long) session.getAttribute("currentPlayerId");
        
        // Crée 7 cartes au hasard par joueur 
        for(Player p : playerDao.findAllByGameId( gameId )){
            
            for(int i=0;i<7;i++){
                cardService.pioche(playerId);
            }
        }
        
        // Détermine le 1er joueur
        
                
        return "game.jsp";
     
    }
    
}
