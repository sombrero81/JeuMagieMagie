/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import magiemagie.service.PlayerServiceCrud;
import org.springframework.ui.Model;

/**
 *
 * @author Ayo Boo
 */

@Controller
public class PlayerController {
    
    @Autowired
    private PlayerServiceCrud service;
    
    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String joinGET(Model model) {
        
        
        service.findAll();
        
        return "join.jsp";
    }
    
    
    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public String joinPOST(Model model) {
        
        
        service.findAll();
        
        return "redirect:/game.jsp";
    }
    
}
