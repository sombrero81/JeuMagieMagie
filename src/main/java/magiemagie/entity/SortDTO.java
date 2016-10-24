/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiemagie.entity;

/**
 *
 * @author Ayo Boo
 */
public class SortDTO {
    
    long idVictime;
    Game.TypeSort typeSort;

    public long getIdVictime() {
        return idVictime;
    }

    public void setIdVictime(long idVictime) {
        this.idVictime = idVictime;
    }

    public Game.TypeSort getTypeSort() {
        return typeSort;
    }

    public void setTypeSort(Game.TypeSort typeSort) {
        this.typeSort = typeSort;
    }
    
    
}
