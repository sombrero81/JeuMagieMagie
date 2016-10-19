/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie.controller;

import magiemagie.service.AvatarServiceCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author admin
 */
@Controller
public class JoinController {
    @Autowired
    private AvatarServiceCrud service;
    
    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String joinGET(Model model) {
        model.addAttribute("avatars", service.findAll() );
        
        return "join.jsp";
    }
    
    
    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public String joinPOST(Model model) {
                
        return "redirect:/game.jsp";
    }
    
    
    
}
