package Laboratorio_3;

import org.jetbrains.annotations.NotNull;


class Filtros {
    private static final String ST0242 = "NOTAS ST0242.csv";
    private static final String ST0245 = "NOTAS ST0245.csv";
    private static final String ST0247 = "NOTAS ST0247.csv";


    static void filtro1(@NotNull String materia, int semestre) {
        String cod;
        if (materia.equalsIgnoreCase("fundamentos de programación")) cod = ST0242;
        else if (materia.equalsIgnoreCase("estructura datos y algorítmos 1")) cod = ST0245;
        else if (materia.equalsIgnoreCase("estructura datos y algorítmos 2")) cod = ST0247;
        else return;
        System.out.println("\033[92mNOMBRE\t\tNOTA\033[90m");
        DataFrame.leerfichero(cod).forEach(estudiante -> {
            if (estudiante.getSemestre() == semestre) {
                System.out.println(estudiante.getNombre() + "\t\t" + estudiante.getNota());
            }
        });
    }

    static void filtro2(String nombre, int semestre) {
        System.out.println("\033[92mNOMBRE\t\tST0242\tST0245\tST0247\033[90m");
        for (Estudiante estudiante : DataFrame.leerfichero(ST0242)) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre) && estudiante.getSemestre() == semestre) {
                System.out.print(estudiante.getNombre() + "\t\t" + estudiante.getNota() + "\t\t");
                break;
            }
        }
        for (Estudiante estudiante : DataFrame.leerfichero(ST0245)) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre) && estudiante.getSemestre() == semestre) {
                System.out.print(estudiante.getNota() + "\t\t");
                break;
            }
        }
        for (Estudiante estudiante : DataFrame.leerfichero(ST0247)) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre) && estudiante.getSemestre() == semestre) {
                System.out.print(estudiante.getNota() + "\t\t");
                break;
            }
        }

    }


}
