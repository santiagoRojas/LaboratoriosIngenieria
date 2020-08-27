/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author Santiago
 */
public class Computador {
    private String Equipo_Nombre;
    private String Placa_Inventario;
    private String Serial;
    private String Marca;
    private String Referencia;

    public Computador(String Equipo_Nombre, String Placa_Inventario, String Serial, String Marca, String Referencia) {
        this.Equipo_Nombre = Equipo_Nombre;
        this.Placa_Inventario = Placa_Inventario;
        this.Serial = Serial;
        this.Marca = Marca;
        this.Referencia = Referencia;
    }

    
    public String getEquipo_Nombre() {
        return Equipo_Nombre;
    }

    public void setEquipo_Nombre(String Equipo_Nombre) {
        this.Equipo_Nombre = Equipo_Nombre;
    }

    public String getPlaca_Inventario() {
        return Placa_Inventario;
    }

    public void setPlaca_Inventario(String Placa_Inventario) {
        this.Placa_Inventario = Placa_Inventario;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }
    
    
}
