/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.sistemas.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.sistemas.biblioteca.dao.EmpleadosDaoLocal;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Empleados;

/**
 *
 * @author Admin
 */
@Stateless
public class EmpleadoBL implements EmpleadoBLLocal {
    @EJB
    private EmpleadosDaoLocal empleadosDao;

    @Override
    public boolean registrar(Empleados empleado) {
        empleadosDao.crear(empleado);
        return true;
    }

    @Override
    public boolean editar(Empleados empleados) {
        empleadosDao.editar(empleados);
        return true;
    }

    @Override
    public boolean eliminar(Empleados empleado) {
        empleadosDao.remover(empleado);
        return true;
    }

    @Override
    public Empleados getPorId(int id) {
        return empleadosDao.buscarTodo(id);
    }

    @Override
    public List<Empleados> getLista(int empleado) {
        return empleadosDao.buscarTodo();
    }

}
