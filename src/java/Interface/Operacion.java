/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;

/**
 *
 * @author FIA-LAB1D6
 * @param <Entidad>
 */
public interface Operacion <Entidad>{
    public int create(Entidad e);
    public int update(Entidad e);
    public boolean delete(Object key);
    public List<Entidad> readAll();
    public List<Entidad> read(int id);
}
