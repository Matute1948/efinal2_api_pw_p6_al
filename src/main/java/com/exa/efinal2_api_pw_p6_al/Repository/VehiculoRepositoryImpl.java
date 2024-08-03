package com.exa.efinal2_api_pw_p6_al.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.exa.efinal2_api_pw_p6_al.Modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VehiculoRepositoryImpl implements IVehiculoRepository{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void insertar(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        this.entityManager.persist(vehiculo);
    }

    @Override
    public List<Vehiculo> seleccionarTodos() {
        // TODO Auto-generated method stub
        TypedQuery<Vehiculo> tQuery = this.entityManager.createQuery("SELECT v FROM Vehiculo v", Vehiculo.class);
        return tQuery.getResultList();
    }

    @Override
    public void eliminarPorPlaca(String placa) {
        // TODO Auto-generated method stub
        Query tQuery = this.entityManager.createQuery("DELETE FROM Vehiculo v WHERE v.placa =:placaB");
        tQuery.setParameter("placaB", placa);
        tQuery.executeUpdate();
        
    }
    
}
