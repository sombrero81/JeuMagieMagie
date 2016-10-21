/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie.controller;

import java.lang.reflect.Method;
import javax.servlet.http.HttpSession;
import magiemagie.entity.Avatar;
import magiemagie.entity.Game;
import magiemagie.entity.Player;
import magiemagie.service.GameServiceCrud;
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
    private GameServiceCrud service;
    
    
    
    //lister les parties
    @RequestMapping(value={"/liste_games", "/"},method=RequestMethod.GET)
    public String lister (Model model){
        
        model.addAttribute("lesgames", service.findAll());
        return "lister_partie.jsp";
        
    }
    
    //joindre partie
    @RequestMapping(value="/join/{idGame}",method =RequestMethod.GET)
    public String joinGET(@PathVariable("idGame") long id,Model model, HttpSession session){
     
        Game game = service.findOne(id);
        
        session.setAttribute("currentGameId", id);
                
     return "join.jsp";
     
     //jouer à une partie
       
        
    }
    @Autowired
    private GameServiceCrud Gameservice;
    
    
    @RequestMapping(value="/game/",method =RequestMethod.GET)
    public String gameGET(Model model ){
     
//        Game game = Gameservice.findOne(id);
//        
//        session.setAttribute("currentGameId", id);
                
     return "game.jsp";
     
    }
    
}
