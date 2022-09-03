package services;

import models.Examen;

public interface ExamenService {

    Examen findExamenPorNombre(String nombre);
}
