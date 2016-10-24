/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie.controller;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpSession;
import magiemagie.entity.Game;
import magiemagie.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import magiemagie.service.AvatarDAO;
import magiemagie.service.GameDAO;
import magiemagie.service.PlayerDAO;

/**
 *
 * @author admin
 */
@Controller
public class JoinController {
    @Autowired
    private AvatarDAO service;
    
    @Autowired 
    private PlayerDAO playerService;
    
    @Autowired
    private GameDAO gameService;
    
    
    
    
    @RequestMapping(value = "/wait", method = RequestMethod.GET)
    public String waitGET(Model model, HttpSession session){
        
        model.addAttribute("players", playerService.findAllByGameId((long) session.getAttribute("currentGameId")));
        
        return "wait.jsp";
    }
    
    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String joinGET(Model model) {
        model.addAttribute("avatars", service.findAll() );
        
        return "join.jsp";
    }
    
    
   @RequestMapping(value = "/join", method = RequestMethod.POST)
   public String joinPOST(@ModelAttribute ("avatars")Player player, HttpSession session) {
        
       // Persiste player en base
       playerService.save(player);
    
       // Place joueur en session
       session.setAttribute("currentPlayerId", player.getId());
       
       // Associe player à une partie ( en base )
       long idGame = (long) session.getAttribute("currentGameId");
       Game game = gameService.findOne(idGame);
       
       game.getPlayers().add(player);
       player.setGame(game);
       
       gameService.save(game);
       playerService.save(player);
       
       return "redirect:/wait";
    }
    
    
    
}
