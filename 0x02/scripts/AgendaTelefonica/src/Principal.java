/*
 * Crear tres clases: contacto, agenda y la clase principal para ejecutar ambas:
 * - Clase contacto, cuenta con dos atributos: nombre y número, además de los
 *   métodos Getters y Setters y los constructores que creas necesarios.
 * - Clase agenda, cuenta con un atributo, un vector de tipo contacto
 *   inicializado en 10, con los siguientes métodos:
 * - registrarContacto(), recibe un objeto de tipo contacto.
 * - listarContactos(), lista toda la agenda.
 * - buscarContacto(), recibe el nombre del contacto que desea buscar y muestra
 *   el teléfono.
 * - disponibles(), muestra los contactos disponibles para registrar.
 * - En la clase principal realizar todos los procesos anteriormente diseñados
 *   por los métodos y mostrar los resultados.
 */

import bookphone.Agenda;
import bookphone.Contacto;

public class Principal {
    public static void main(String[] args) throws Exception {
        Agenda.listarContactos();
        Agenda.disponibles();
        Contacto contacto1 = new Contacto("Jane", "555-001");
        Agenda.registrarContacto(contacto1);
        Contacto contacto2 = new Contacto("John", "555-002");
        Agenda.registrarContacto(contacto2);
        Contacto contacto3 = new Contacto("Anne", "555-003");
        Agenda.registrarContacto(contacto3);
        Contacto contacto4 = new Contacto("Paul", "555-004");
        Agenda.registrarContacto(contacto4);
        Contacto contacto5 = new Contacto("Mark", "555-005");
        Agenda.registrarContacto(contacto5);
        Contacto contacto6 = new Contacto("Anthony", "555-006");
        Agenda.registrarContacto(contacto6);
        Contacto contacto7 = new Contacto("Emily", "555-007");
        Agenda.registrarContacto(contacto7);
        Contacto contacto8 = new Contacto("Mark", "555-008");
        Agenda.registrarContacto(contacto8);
        Contacto contacto9 = new Contacto("Sophia", "555-009");
        Agenda.registrarContacto(contacto9);
        Contacto contacto10 = new Contacto("Brian", "555-010");
        Agenda.registrarContacto(contacto10);
        Agenda.listarContactos();
        Agenda.disponibles();
        Agenda.buscarContacto("Mark");
        Agenda.buscarContacto("Ava");
        Agenda.buscarContacto("Anne");
    }
}
