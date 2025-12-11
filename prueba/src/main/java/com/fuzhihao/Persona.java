package com.fuzhihao;
/**
 * La clase persona
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;

    /**
     * El constructor de persona con parametros
     * @param nombre parametro de nombre
     * @param apellidos parametro de los apellidos
     * @param edad parametro de la edad
     * @param email parametro del email
     */

    public Persona(String nombre, String apellidos, int edad, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
    }

    public static Persona factory(String cadena){
        if (cadena == null) {
            throw new IllegalArgumentException("Argumentos inválidos");
        }
        String partes[] = cadena.split(",");

        if (partes.length != 4) {
            throw new IllegalArgumentException("Argumentos inválidos");
        }

        try {
            int e = Integer.parseInt(partes[2]);
            return new Persona(partes[0], partes[1], e, partes[3]);
        } catch (Exception e) {
            throw new IllegalArgumentException("Argumentos inválidos");
        }
    }

    /**
     * getter de nombre
     * @return el nombre de la persona
     */

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    


}
