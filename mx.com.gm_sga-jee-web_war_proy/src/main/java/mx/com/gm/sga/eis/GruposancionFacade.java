/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.eis;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Gruposancion;

@Local
public interface GruposancionFacade {

    void create(Gruposancion gruposancion);

    void edit(Gruposancion gruposancion);

    void remove(Gruposancion gruposancion);

    Gruposancion find(Object id);

    List<Gruposancion> findAll();

    List<Gruposancion> findRange(int[] range);

    int count();
}
