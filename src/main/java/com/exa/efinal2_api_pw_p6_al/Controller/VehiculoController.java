package com.exa.efinal2_api_pw_p6_al.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exa.efinal2_api_pw_p6_al.Modelo.Vehiculo;
import com.exa.efinal2_api_pw_p6_al.Service.IVehiculoService;

@RestController
@RequestMapping(path = "/vehiculo")
@CrossOrigin
public class VehiculoController {

    @Autowired
    private IVehiculoService vehiculoService;

    @PostMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Vehiculo> guardar(@RequestBody Vehiculo vehiculo){
        this.vehiculoService.guardar(vehiculo);
        HttpHeaders cabeceras = new HttpHeaders();
        cabeceras.add("mensaje", "Vehiculo guardado exitosamente");
        return new ResponseEntity<>(vehiculo, cabeceras, 201);
    }

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Vehiculo>> buscarTodos(){
        HttpHeaders cabeceras = new HttpHeaders();
        cabeceras.add("mensaje", "Vehiculos encontrados");
        return new ResponseEntity<>(this.vehiculoService.buscarTodos(), cabeceras, 236);
    }

    //http://localhost:8080/API/v1.0/Consecionaria/vehiculo/1
    @DeleteMapping(path = "/{placa}")
    public ResponseEntity<Void> eliminar(@PathVariable String placa) {
        HttpHeaders cabeceras = new HttpHeaders();
        cabeceras.add("mensaje", "Vehiculo Borrado");
        this.vehiculoService.eliminarPorPlaca(placa);
        return new ResponseEntity<>(cabeceras, HttpStatus.NO_CONTENT);
    }
    

}
