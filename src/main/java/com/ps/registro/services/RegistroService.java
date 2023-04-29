package com.ps.registro.services;

import com.ps.registro.modelo.Persona;
import com.ps.registro.modelo.Registro;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegistroService {

    @Transactional()
    public Registro guardar(Registro registro) throws Exception {

        if (registro.getId() < 0) {
            throw new Exception("El empleado no puede tener numeros menores o iguales a 0");
        }
        if (registro.getRegistro() == null || registro.getRegistro().equals("")) {
            throw new Exception("El usuario no tiene correo");
        }
        if (registro.getPersona_id() == null || registro.getPersona_id().equals("")) {
            throw new Exception("El usuario no tiene identificacion");
        }



        return registro;

    }
}
