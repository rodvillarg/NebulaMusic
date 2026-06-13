package com.example.NebulaMusic.model;

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasenia;
    private String txt_pseudonimo;
    private String rad_genero;
    private String sel_subscripcion;
    private String fechaNacimiento;
    private String cbx_terminos;
    private String comentarios;

    public Usuario() {

    }

    public Usuario(String nombre, String correo, String contrasenia, String txt_pseudonimo,
                   String rad_genero, String sel_subscripcion, String fechaNacimiento,
                   String cbx_terminos, String comentarios) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.txt_pseudonimo = txt_pseudonimo;
        this.rad_genero = rad_genero;
        this.sel_subscripcion = sel_subscripcion;
        this.fechaNacimiento = fechaNacimiento;
        this.cbx_terminos = cbx_terminos;
        this.comentarios = comentarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTxt_pseudonimo() {
        return txt_pseudonimo;
    }

    public void setTxt_pseudonimo(String txt_pseudonimo) {
        this.txt_pseudonimo = txt_pseudonimo;
    }

    public String getRad_genero() {
        return rad_genero;
    }

    public void setRad_genero(String rad_genero) {
        this.rad_genero = rad_genero;
    }

    public String getSel_subscripcion() {
        return sel_subscripcion;
    }

    public void setSel_subscripcion(String sel_subscripcion) {
        this.sel_subscripcion = sel_subscripcion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCbx_terminos() {
        return cbx_terminos;
    }

    public void setCbx_terminos(String cbx_terminos) {
        this.cbx_terminos = cbx_terminos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
