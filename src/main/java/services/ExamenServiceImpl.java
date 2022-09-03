package services;

import models.Examen;
import repositories.ExamenRepositorie;

import java.util.Optional;

public class ExamenServiceImpl implements ExamenService{

    private ExamenRepositorie examenRepositorie;

    public ExamenServiceImpl(ExamenRepositorie examenRepositorie) {
        this.examenRepositorie = examenRepositorie;
    }

    @Override
    public Examen findExamenPorNombre(String nombre) {

        Optional<Examen> examenOptional= examenRepositorie.findAll()
                .stream()
                .filter(examen -> examen.getNombre().contains(nombre))
                .findFirst();

        Examen examen = null;

        if (examenOptional.isPresent()){
            examen = examenOptional.orElseThrow();
        }
        return examen;
    }
}
