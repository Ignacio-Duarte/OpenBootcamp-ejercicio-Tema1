package com.tema5;

import java.util.List;

public interface CocheCRUD {

    void save(CocheCRUDimpl coche);

    void findAll();

    void delete(CocheCRUDimpl coche);
}
