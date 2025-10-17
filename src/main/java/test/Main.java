package test;

import model.Sucursal;
import service.DAOSucursal;
import service.IDAOSucursal;

import java.util.List;

public class Main {
    private static final IDAOSucursal dao = new DAOSucursal();

    public static void main(String[] args) {
        List<Sucursal> lista = dao.getAll();
        lista.forEach(System.out::println);
    }
}