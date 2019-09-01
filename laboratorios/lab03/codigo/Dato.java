package Laboratorio_3;


import java.util.ArrayList;
import java.util.Objects;

/**
 * Es la entidad que permite diferenciar y manejar los datos ingresados en el
 * archivo CSV
 *
 * @author Samuel Palacios Bernate
 * @version 1.0
 */
public class Dato extends ArrayList {


    private int codigo;
    private String codMateria;
    private int semestre;
    private String nombre;
    private int grupo;
    private String descEvaluacion;
    private int porcentaje;
    private String descripcion;
    private String nomMateria;
    private int nota;
    private int notaDefinitiva;


    /**
     * Método constructor vacio
     */
    public Dato() {
    }

    /**
     * Método constructor de la clase Dato
     */
    public Dato(String nombre, int codigo, String codMateria, int semestre, int grupo, String descEvaluacion, int porcentaje, String descripcion, String nomMateria, int nota, int notaDefinitiva) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.codMateria = codMateria;
        this.semestre = semestre;
        this.grupo = grupo;
        this.descEvaluacion = descEvaluacion;
        this.porcentaje = porcentaje;
        this.descripcion = descripcion;
        this.nomMateria = nomMateria;
        this.nota = nota;
        this.notaDefinitiva = notaDefinitiva;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dato)) return false;
        if (!super.equals(o)) return false;
        Dato dato = (Dato) o;
        return getCodigo() == dato.getCodigo() &&
                getSemestre() == dato.getSemestre() &&
                getPorcentaje() == dato.getPorcentaje() &&
                getNota() == dato.getNota() &&
                getNotaDefinitiva() == dato.getNotaDefinitiva() &&
                getGrupo() == dato.getGrupo() &&
                getNombre().equals(dato.getNombre()) &&
                getCodMateria().equals(dato.getCodMateria()) &&
                getDescEvaluacion().equals(dato.getDescEvaluacion()) &&
                getDescripcion().equals(dato.getDescripcion()) &&
                getNomMateria().equals(dato.getNomMateria());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNombre(), getCodigo(), getCodMateria(), getSemestre(), getGrupo(), getDescEvaluacion(), getPorcentaje(), getDescripcion(), getNomMateria(), getNota(), getNotaDefinitiva());
    }

    /**
     * Método sobreescrito de ArrayList que permite retornar un atibuto
     * específico de la clase Dato
     *
     * @param index Elije qué valor retornar
     * @return Retorna un object que contiene un atributo específico de la clase
     * Dato
     */

    @Override
    public Object get(int index) {
        switch (index) {
            case 1:
                return getNombre();
            case 2:
                return getCodigo();
            case 3:
                return getCodMateria();
            case 4:
                return getSemestre();
            case 5:
                return getGrupo();
            case 6:
                return getDescEvaluacion();
            case 7:
                return getPorcentaje();
            case 8:
                return getDescripcion();
            case 9:
                return getNomMateria();
            case 10:
                return getNota();
            case 11:
                return getNotaDefinitiva();

            default:
                break;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Dato{" +
                "codigo=" + codigo +
                ", codMateria='" + codMateria + '\'' +
                ", semestre=" + semestre +
                ", nombre='" + nombre + '\'' +
                ", grupo='" + grupo + '\'' +
                ", descEvaluacion='" + descEvaluacion + '\'' +
                ", porcentaje=" + porcentaje +
                ", descripcion='" + descripcion + '\'' +
                ", nomMateria='" + nomMateria + '\'' +
                ", nota=" + nota +
                ", notaDefinitiva=" + notaDefinitiva +
                '}';
    }

    /**
     * Método que retorna un objeto tipo Dato en modo String
     *
     * @return String de dato
     */


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(String codMateria) {
        this.codMateria = codMateria;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getDescEvaluacion() {
        return descEvaluacion;
    }

    public void setDescEvaluacion(String descEvaluacion) {
        this.descEvaluacion = descEvaluacion;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNomMateria() {
        return nomMateria;
    }

    public void setNomMateria(String nomMateria) {
        this.nomMateria = nomMateria;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNotaDefinitiva() {
        return notaDefinitiva;
    }

    public void setNotaDefinitiva(int notaDefinitiva) {
        this.notaDefinitiva = notaDefinitiva;
    }
}
