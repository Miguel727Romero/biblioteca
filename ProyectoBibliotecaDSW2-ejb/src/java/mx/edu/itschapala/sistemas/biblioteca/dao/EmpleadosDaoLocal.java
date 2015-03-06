/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.sistemas.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Empleados;

/**
 *
 * @author Admin
 */
@Local
public interface EmpleadosDaoLocal {

    void crear(Empleados empleados);

    void editar(Empleados empleados);

    void remover(Empleados empleados);

    Empleados buscarPorId(Object id);

    List<Empleados> buscarTodo();

    List<Empleados> buscarRango(int[] range);

    int contar();
    
}
