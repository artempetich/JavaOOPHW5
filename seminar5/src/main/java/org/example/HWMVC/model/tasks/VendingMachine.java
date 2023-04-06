package org.example.HWMVC.model.tasks;

import org.example.HWMVC.model.products.Product;
import org.example.HWMVC.model.utils.Input2;

import java.util.List;

public abstract class VendingMachine implements Input2 {
    List<Product> ourDataBase;

    public VendingMachine(List<Product> ourDataBase) {
        this.ourDataBase = ourDataBase;
    }

    public Product getProduct(String name) throws Exception {

        for (Product el : ourDataBase) {
            if (el.getName().contains(name.toLowerCase())) {
                return el;
            }
        }
        throw new Exception("продукт не найден");
    }
}