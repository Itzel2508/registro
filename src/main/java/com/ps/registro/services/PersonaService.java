package com.ps.registro.services;
import com.ps.registro.modelo.Persona;

import com.ps.registro.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @Transactional()
    public Persona guardar(Persona persona) throws Exception {

        if (persona.getId() < 0) {
            throw new Exception("El empleado no puede tener numeros menores o iguales a 0");
        }
        if (persona.getApellidos() == null || persona.getCorreo().equals("")) {
            throw new Exception("El usuario no tiene apellidos");
        }
        if (persona.getIdentificacion() == null || persona.getIdentificacion().equals("")) {
            throw new Exception("El usuario no tiene identificacion");
        }
        if (persona.getNombres() == null || persona.getIdentificacion().equals("")) {
            throw new Exception("El usuario no tiene nombre");
        }
        if (persona.getFechaNacimiento() == null || persona.getIdentificacion().equals("")) {
            throw new Exception("El usuario no tiene fecha");
        }
        if (persona.getTelefono() == null || persona.getIdentificacion().equals("")) {
            throw new Exception("El usuario no tiene telefono");
        }
        if (persona.getCorreo() == null || persona.getIdentificacion().equals("")) {
            throw new Exception("El usuario no tiene identificacion");
        }




        return personaRepository.save(persona);

    }

    @Override
    public Persona consultar(long id) throws Exception {
        return null;
    }

    @Override
    public Persona actualizar(Persona persona) throws Exception {
        return null;
    }

    @Override
    public Persona borrar(long id) throws Exception {
        return null;
    }

}
