package logica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.ControladoraPersistencia;

public class Controladora {

ControladoraPersistencia controlPersis = new  ControladoraPersistencia();

    public void crearChofer(String nombre, int diasTrabajadoNormal, int diasTrabajadosCampo, double sueldoTotalCampo, double sueldoTotalNormal, double pago) {

        Chofer chofer = new Chofer();

        chofer.setNombre(nombre);
        chofer.setPago(pago);
        chofer.setValorCampo(sueldoTotalCampo);
        chofer.setValorNormal(sueldoTotalNormal);
        chofer.setDiaTraNor(diasTrabajadoNormal);
        chofer.setDiaTraCam(diasTrabajadosCampo);

        controlPersis.guardarChofer(chofer);

        try {
            controlPersis.guardarChofer(chofer);
            JOptionPane.showMessageDialog(null, "Le tenes que pagar: " + pago + " $", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace(); // Mostrar mensaje de error JOptionPane.showMessageDialog(null, "Error al guardar el chofer: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); } 

        }

    }

    public void crearEmpleado(String nombre, int diasTrabajadoNormal, int diasTrabajadosCampo, double sueldoTotalCampo, double sueldoTotalNormal, double pago) {
        Empleado empleado = new Empleado();
        empleado.setNombre(nombre);
        empleado.setDiaTraNor(diasTrabajadoNormal);
        empleado.setDiaTraCam(diasTrabajadosCampo);
        empleado.setValorCampo(sueldoTotalCampo);
        empleado.setValorNormal(sueldoTotalNormal);
        empleado.setPago(pago);
        
        try{
            this.controlPersis.guardarEmpleado(empleado);
             JOptionPane.showMessageDialog(null, "Le tenes que pagar: " + pago + " $", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Error de persistencia");
        }
        

    }

    public ArrayList<Chofer> traerChoferes() {
        return controlPersis.traerChoferes();
    }

    public ArrayList<Empleado> traerEmpleados() {
        return controlPersis.traerEmpleados();
    }



}

