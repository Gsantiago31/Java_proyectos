/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retojavapersona;

public class Persona {
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private String Trabajo;
    private int SalarioPorDia;
    private String Nacionalidad;

    public Persona(String Nombre, String Apellidos, int Edad, String Trabajo, int SalarioPorDia, String Nacionalidad) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Trabajo = Trabajo;
        this.SalarioPorDia = SalarioPorDia;
        this.Nacionalidad = Nacionalidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(String Trabajo) {
        this.Trabajo = Trabajo;
    }

    public int getSalarioPorDia() {
        return SalarioPorDia;
    }

    public void setSalarioPorDia(int SalarioPorDia) {
        this.SalarioPorDia = SalarioPorDia;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }
    
    public void MostrarEdad(){
        System.out.println(getNombre() + " tiene " + getEdad() + " años ");
    }
    
    public void MostrarTrabajoSalario(){
        System.out.println(getNombre() + " trabaja como " + getTrabajo() + " y gana un sueldo de " + getSalarioPorDia());
    }
    
    public void SalarioMensual(){
        int Salario = getSalarioPorDia() * 24;
        System.out.println(getNombre() + " gana " + Salario + " al mes ");
    }
    
    
}
