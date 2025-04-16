package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodoBusquedaBinaria {

    private Persona[] persona;
    private ShowConsole showConsole;

    public MetodoBusquedaBinaria(Persona[] personas) {
        this.showConsole = new ShowConsole();
        this.persona = personas;
        showConsole.showMessage("Metodo de Busqueda Binaria");
    }

    public int findPersonByCode(int code) {
        int bajo = 0;
        int alto = persona.length - 1;

        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;

            if (persona[central].getCode() == code) {
                return central;
            }
            if (persona[central].getCode() < code) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }

        }
        return -1;
    }

    public void showPersonByCode(){
        boolean rep = true;
        while (rep == true) {
            int codeToFind = showConsole.getCode();
            int indexPerson = findPersonByCode(codeToFind);
            if (indexPerson == -1) {
                showConsole.showMessage("No hay persona con ese codigo");
            } else {
                showConsole.showMessage("Persona con el codigo "
                + codeToFind +" encontrada");
                showConsole.showMessage(persona[indexPerson].toString());
                rep = false;
                break;
            }
        }
    }


    /**
     * Encontara  por el nombre de la lista
     * 
     * @param name El nombre de la persona a buscar.
     * @return El indicie de la persona a encontra, o -1 si no se encuentra
     */
    private int findPersonByName(String name){
        MetodoOrdenacion mO = new MetodoOrdenacion(persona);
        mO.sortByName(persona);
        int bajo = 0;
        int alto = persona.length - 1;

        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            
            if (persona[central].getName().equalsIgnoreCase(name)) {
                return central;
            }
            if (persona[central].getName().compareToIgnoreCase(name)>0 ) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }

        }
        return -1;
        }

    public void showPersonByName(){
        boolean rep = true;
        while (rep == true) {
            String nameToFind = showConsole.getName();
            int indexPerson = findPersonByName(nameToFind);
            if (indexPerson == -1) {
                showConsole.showMessage("No hay persona con ese nombre");
            } else {
                showConsole.showMessage("Persona con el nombre "
                + nameToFind +" encontrada");
                showConsole.showMessage(persona[indexPerson].toString());
                rep = false;
                break;
            }
        }
    }
}
