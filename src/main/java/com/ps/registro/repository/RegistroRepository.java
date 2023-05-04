package com.ps.registro.repository;

import com.ps.registro.modelo.Persona;
import com.ps.registro.modelo.Registro;

public interface RegistroRepository {
    static Registro guardar(Registro registro) {

        return registro;
    }

    static Registro getOne(long id) {
        return null;
    }
    

    static Registro actualizar(Registro registro) {
        return null;
    }

    Persona borrar(long id);
}
