package com.ps.registro.controller;
import com.ps.registro.modelo.Persona;
import com.ps.registro.modelo.Registro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registro")
public class RegistroController {

    @GetMapping("/{id}")
    public ResponseEntity<Registro> consultar(@PathVariable("id") long id) {
        Registro registro = new Registro();
        registro.setId(id);
        return ResponseEntity.ok(registro);
    }

    @PostMapping("/")
    public ResponseEntity<?> guardar(@RequestBody Registro registro) {

        return ResponseEntity.ok(registro);
    }

    @PutMapping("/")
    public ResponseEntity<Registro> actualizar(@RequestBody Registro registro) {
        return ResponseEntity.ok(registro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Registro> borrar(@PathVariable("id") long id) {
        Registro registro = new Registro();
        registro.setId(id);
        return ResponseEntity.ok(registro);
    }

}
