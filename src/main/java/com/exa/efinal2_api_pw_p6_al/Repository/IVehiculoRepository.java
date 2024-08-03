package com.exa.efinal2_api_pw_p6_al.Repository;

import java.util.List;

import com.exa.efinal2_api_pw_p6_al.Modelo.Vehiculo;

public interface IVehiculoRepository {
    public void insertar(Vehiculo vehiculo);
    public List<Vehiculo> seleccionarTodos();
    public void eliminarPorPlaca(String placa);
}
