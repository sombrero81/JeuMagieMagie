/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie.service;

import java.util.List;
import magiemagie.entity.Avatar;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author admin
 */
public interface AvatarDAO extends CrudRepository<Avatar, Long> {

    public List<Avatar> findAllById(long f);
}
