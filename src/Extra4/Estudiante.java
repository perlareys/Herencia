/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra4;

import java.time.LocalDate;

/**
 *
 * @author Perla
 */
public class Estudiante extends Facultad {

    private String curso;

    public Estudiante(String curso, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public void matricular(String nuevoCurso) {
        this.curso = nuevoCurso;
    }
    
    @Override
    public String getInformacion(){
        return super.getInformacion()+ "\n" +
                "Curso " + curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
