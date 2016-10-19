/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie.controller;

import magiemagie.service.AvatarServiceCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */

@Controller
public class AvatarController {
    
    @Autowired
    private AvatarServiceCrud service;
    
//    @RequestMapping(value = "/")
    
}
