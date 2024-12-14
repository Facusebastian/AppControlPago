package persistencia;

import java.util.ArrayList;
import java.util.List;
import logica.Chofer;
import logica.Empleado;

public class ControladoraPersistencia {
    ChoferJpaController choferJPA = new ChoferJpaController();
    EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();
    public void guardarChofer(Chofer chofer) {
        choferJPA.create(chofer);
    }

    public void guardarEmpleado(Empleado empleado) {
        empleadoJPA.create(empleado);
    }

    public ArrayList<Empleado> traerEmpleados() {
      List<Empleado> emp = empleadoJPA.findEmpleadoEntities(); 
      return new ArrayList<>(emp);
       
       
    }

    public ArrayList<Chofer> traerChoferes() {
        List<Chofer> chof = choferJPA.findChoferEntities();
        return new ArrayList<>(chof);
    }

    
}
