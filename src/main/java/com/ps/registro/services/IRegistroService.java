package com.ps.registro.services;

import com.ps.registro.modelo.Registro;

public interface IRegistroService {
    Registro guardar(Registro registro) throws Exception;
    Registro consultar(long id) throws Exception;
    Registro actualizar(Registro registro) throws Exception;
    Registro borrar(long id) throws Exception;
}
