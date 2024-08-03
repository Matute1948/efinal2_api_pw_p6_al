package com.exa.efinal2_api_pw_p6_al.Service;

import java.util.List;

import com.exa.efinal2_api_pw_p6_al.Modelo.Vehiculo;

public interface IVehiculoService {
    public void guardar(Vehiculo vehiculo);
    public List<Vehiculo> buscarTodos();
    public void eliminarPorPlaca(String placa);
}
