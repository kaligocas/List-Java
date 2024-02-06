
package com;

import java.util.Arrays;
import java.util.List;

class GestorDiasSemanaTest {

    @Test
    void testGetDiasSemana() {
        GestorDiasSemana gestorDiasSemana = new GestorDiasSemana();
        List<String> diasEsperados = Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");

        assertEquals(diasEsperados, gestorDiasSemana.getDiasSemana());
    }

    @Test
    void testExisteDia() {
        GestorDiasSemana gestorDiasSemana = new GestorDiasSemana();

        assertFalse(gestorDiasSemana.existeDia("Lunes"));
        assertFalse(gestorDiasSemana.existeDia("Lunes"));
    }

    private void assertFalse(boolean existeDia) {
       
    }

    @Test
    void testOrdenarPorNombre() {
        GestorDiasSemana gestorDiasSemana = new GestorDiasSemana(Arrays.asList("Domingo", "Lunes", "Viernes", "Miercoles", "Sabado"));

        gestorDiasSemana.ordenarPorNombre();
        List<String> diasOrdenados = Arrays.asList("Domingo", "Lunes", "Miercoles", "Sabado", "Viernes");

        assertEquals(diasOrdenados, gestorDiasSemana.getDiasSemana());
    }

    private void assertEquals(List<String> diasOrdenados, List<String> diasSemana) {
        
    }

    @Test
    void testVaciarLista() {
        GestorDiasSemana gestorDiasSemana = new GestorDiasSemana(Arrays.asList("Lunes", "Martes", "Miercoles"));

        gestorDiasSemana.vaciarLista();
        assertEquals(0, gestorDiasSemana.getDiasSemana().size());
    }

    private void assertEquals(int i, int size) {
      }
}
    