/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.sistemas.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Empleados;

/**
 *
 * @author Admin
 */
@Local
public interface EmpleadoBLLocal {

    boolean registrar(Empleados empleado);

    boolean editar(Empleados empleados);

    boolean eliminar(Empleados empleado);

    Empleados getPorId(int id);

    List<Empleados> getLista(int empleado);
    
}
