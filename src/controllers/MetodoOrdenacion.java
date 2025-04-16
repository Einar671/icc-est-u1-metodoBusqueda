package controllers;

import models.Persona;

public class MetodoOrdenacion {
    
    private Persona[] persona;

    public MetodoOrdenacion(Persona[] personas){
        this.persona = personas;
    }
    public void sortByName(Persona[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getName().compareTo(
                        people[j + 1].getName()) > 0) {
                    // Intercambiar
                    Persona temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;

                }
            }
        }
    }

}
