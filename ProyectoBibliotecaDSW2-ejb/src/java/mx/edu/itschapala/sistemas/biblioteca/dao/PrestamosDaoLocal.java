/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.sistemas.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Prestamos;

/**
 *
 * @author Admin
 */
@Local
public interface PrestamosDaoLocal {

    void crear(Prestamos prestamos);

    void editar(Prestamos prestamos);

    void remover(Prestamos prestamos);

    Prestamos buscarPorId(Object id);

    List<Prestamos> buscarTodo();

    List<Prestamos> buscarRango(int[] range);

    int contar();
    
}
