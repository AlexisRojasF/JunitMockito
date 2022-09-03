package repositories;

import models.Examen;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ExamenRepositorieImpl implements ExamenRepositorie{
    @Override
    public List<Examen> findAll() {
        return Arrays.asList(new Examen(5L,"Matematicas"),new Examen(6L,"Filosofia") );
    }
}
