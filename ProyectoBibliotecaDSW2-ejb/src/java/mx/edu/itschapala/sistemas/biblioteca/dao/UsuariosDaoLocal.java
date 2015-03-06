/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.sistemas.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Usuarios;

/**
 *
 * @author Admin
 */
@Local
public interface UsuariosDaoLocal {

    void crear(Usuarios usuarios);

    void editar(Usuarios usuarios);

    void remover(Usuarios usuarios);

    Usuarios buscarPorId(Object id);

    List<Usuarios> buscarTodo();

    List<Usuarios> buscarRango(int[] range);

    int contar();
    
}
