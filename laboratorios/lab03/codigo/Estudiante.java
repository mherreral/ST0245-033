package Laboratorio_3;

import java.util.Objects;

public class Estudiante {

    private String nombre;
    private String codigo;
    private String curso;
    private int semestre;
    private int nota;

    Estudiante() {
    }

    Estudiante(String nombre, String codigo, String curso, int semestre, int nota) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
        this.semestre = semestre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre +
                "\t\t\t" + codigo +
                "\t\t" + curso +
                "\t\t" + semestre +
                "\t\t" + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiante)) return false;
        Estudiante that = (Estudiante) o;
        return getSemestre() == that.getSemestre() &&
                getNota() == that.getNota() &&
                getNombre().equals(that.getNombre()) &&
                getCodigo().equals(that.getCodigo()) &&
                getCurso().equals(that.getCurso());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getCodigo(), getCurso(), getSemestre(), getNota());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
