package com.exa.efinal2_api_pw_p6_al.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exa.efinal2_api_pw_p6_al.Modelo.Vehiculo;
import com.exa.efinal2_api_pw_p6_al.Repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

    @Autowired
    private IVehiculoRepository vehiculorRepository;

    @Override
    public void guardar(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        this.vehiculorRepository.insertar(vehiculo);
    }

    @Override
    public List<Vehiculo> buscarTodos() {
        // TODO Auto-generated method stub
        return this.vehiculorRepository.seleccionarTodos();
    }

    @Override
    public void eliminarPorPlaca(String placa) {
        // TODO Auto-generated method stub
        this.vehiculorRepository.eliminarPorPlaca(placa);
    }
    
}
