package org.example.StepsDefs;

import io.cucumber.datatable.DataTable;

public class AuthenticationStepDefs implements io.cucumber.java8.Fr {
    public AuthenticationStepDefs() {
        Étantdonnéque("^Eric a une carte de crédit ou de débit valide$", () -> {
        });
        Etque("^le solde de son compte est de {int}$ $", (Integer arg0) -> {
        });
        Quand("^il insère sa carte$", () -> {
        });
        Et("^retire (\\d+) \\$$", (Integer arg0) -> {
        });
        Alors("^le guichet automatique renvoie {int}$ $", (Integer arg0) -> {
        });
        Et("^il retire {int}$ $", (Integer arg0) -> {
        });
        Et("^et le solde de som compte est de {int}$", (Integer arg0) -> {
        });
        Alors("^la transaction est refusee$", () -> {
        });
        Et("^le message suivant est retourne au client SOLDE INSUFFISANT$", () -> {
        });


    }
}
