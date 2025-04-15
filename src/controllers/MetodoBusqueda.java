package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodoBusqueda {
    private ShowConsole showConsole;
    private Persona[] people;

    public MetodoBusqueda() {

    }

    public MetodoBusqueda(Persona[] persons) {

        showConsole = new ShowConsole();
        this.people = persons;
        showPersonByCode();
    }

    public int busquedaLineal(int arreglo[], int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                System.out.println("El elemento " + valor + "esta en la pocision: " + i);
                return i;
            }
        }
        return -1;
    }

    public int findPersonByCode(int code) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void showPersonByCode() {
        boolean rep=true;
        while (rep==true) {
            int codeToFind = showConsole.getCode();
            int indexPerson = findPersonByCode(codeToFind);
            if (indexPerson >= 0) {
                showConsole.showMessage("Persona encontrada");
                showConsole.showMessage(people[indexPerson].toString());
                rep=false;
                break;
            } else {
                showConsole.showMessage("Persona con codigo " + codeToFind + " no encontrado");
            }
        }
    }

}
