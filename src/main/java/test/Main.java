package test;

import service.DAOSucursal;
import service.IDAOSucursal;

public class Main {
    private static final IDAOSucursal dao = new DAOSucursal();
    public static void main(String[] args) {
        dao.getAll();
    }
}
