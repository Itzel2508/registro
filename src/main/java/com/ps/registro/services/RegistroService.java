package com.ps.registro.services;
import com.ps.registro.modelo.Persona;
import com.ps.registro.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.ps.registro.modelo.Registro;
import com.ps.registro.repository.RegistroRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegistroService {

    @Autowired
    RegistroRepository registroRepository;

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

        return RegistroRepository.guardar(registro);
    }


    public Registro consultar(long id) throws Exception {
        if ( id <= 1){
            throw new Exception("El id enviado no es valido");
        }


        return RegistroRepository.getOne(id);

    }
    public Registro actualizar(Registro registro) throws Exception {

        Registro resultado=consultar(registro.getId());
        if (registro.getRegistro() == null && registro.getRegistro().equals("")) {
            resultado.setRegistro(registro.getRegistro());
        }

        return RegistroRepository.actualizar(registro);

    }
    public Persona borrar(long id) throws Exception {
        return registroRepository.borrar(id);
    }


}
