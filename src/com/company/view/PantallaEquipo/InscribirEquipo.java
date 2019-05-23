package com.company.view.PantallaEquipo;

import com.company.manager.ManagerEquipo;
import com.company.model.Equipo;
import com.company.view.PantalladeMenus.MenuEquipos;

import java.io.IOException;
import java.util.Scanner;

public class InscribirEquipo {

    private Scanner scanner = new Scanner(System.in);


    public void mostrar() throws IOException {

        Equipo equipo = new Equipo();
        ManagerEquipo managerEquipo = new ManagerEquipo();

        System.out.println("1.1.Inscribir un equipo");

        System.out.println("Nombre del equipo:");
        equipo.nombre = scanner.nextLine();

        System.out.println("Nombre en siglas del equipo:");
        equipo.siglasdelequipo = scanner.nextLine();

        System.out.println("Nombre de la ciudad o pais donde es el equipo:");
        equipo.ciudad = scanner.nextLine();

        managerEquipo.crearEquipo(equipo);

        System.out.println();
        MenuEquipos menuEquipos = new MenuEquipos();
        menuEquipos.mostrar();

    }
}