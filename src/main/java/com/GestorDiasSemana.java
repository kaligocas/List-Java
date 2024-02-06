
package com;

import java.util.Collections;
import java.util.List;

public class GestorDiasSemana {
    private List<String> diasSemana;

    public GestorDiasSemana() {
        diasSemana = List.of("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");
    }

    public List<String> getDiasSemana() {
        return diasSemana;
    }

    public void getDiasSemana(int posicion) {

    }

    public GestorDiasSemana(List<String> diasSemana) {
        this.diasSemana = diasSemana;
    }

    public boolean existeDia(String dia) {
        return diasSemana.contains(dia);
    }

    public void ordenarPorNombre() {
        Collections.sort(diasSemana);
    }

    public void vaciarLista() {
        diasSemana.clear();
    }
}
    


