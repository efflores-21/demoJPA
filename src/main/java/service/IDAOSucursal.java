package service;

import model.Sucursal;

import java.util.List;

public interface IDAOSucursal {
    //Consultar todos
    List<Sucursal> getAll();
    //insertar
    void insert(Sucursal sucursal);
    //actualizar
    void update(Sucursal sucursal);
    //eliminar
    void delete(Sucursal sucursal);
    //buscar por id
    Sucursal getById(Integer id);
}
