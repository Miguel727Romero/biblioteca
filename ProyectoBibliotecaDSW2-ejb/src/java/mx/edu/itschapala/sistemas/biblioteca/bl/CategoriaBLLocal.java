/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.sistemas.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Categoria;

/**
 *
 * @author Admin
 */
@Local
public interface CategoriaBLLocal {

    boolean crear(Categoria categoria);

    boolean editar(Categoria categoria);

    boolean eliminar(Categoria categoria);

    Categoria getPorId(int id);

    List<Categoria> getLista(int id);
    
}
