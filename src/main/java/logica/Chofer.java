package logica;
 import java.io.Serializable;
 import javax.persistence.*;
@Entity
//    control.crearChofer(nombre, diasTrabajadoNormal, diasTrabajadosCampo
//, sueldoTotalCampo, sueldoTotalNormal, pago);

public class Chofer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private String nombre;
    private double diaTraNor, diaTraCam, valorNormal, valorCampo, pago;

    public Chofer() {
    }

    public Chofer(int id, String nombre, double diaTraNor, double diaTraCam, double valorNormal, double valorCampo, double pago) {
        
        this.nombre = nombre;
        this.diaTraNor = diaTraNor;
        this.diaTraCam = diaTraCam;
        this.valorNormal = valorNormal;
        this.valorCampo = valorCampo;
        this.pago = pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDiaTraNor() {
        return diaTraNor;
    }

    public void setDiaTraNor(double diaTraNor) {
        this.diaTraNor = diaTraNor;
    }

    public double getDiaTraCam() {
        return diaTraCam;
    }

    public void setDiaTraCam(double diaTraCam) {
        this.diaTraCam = diaTraCam;
    }

    public double getValorNormal() {
        return valorNormal;
    }

    public void setValorNormal(double valorNormal) {
        this.valorNormal = valorNormal;
    }

    public double getValorCampo() {
        return valorCampo;
    }

    public void setValorCampo(double valorCampo) {
        this.valorCampo = valorCampo;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
    
}
