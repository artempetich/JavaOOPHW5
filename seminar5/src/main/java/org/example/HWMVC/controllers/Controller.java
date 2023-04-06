package org.example.HWMVC.controllers;

import org.example.HWMVC.model.products.Product;
import org.example.HWMVC.model.tasks.VendingMachine;

public class Controller {
    private final VendingMachine machine;

    public Controller(VendingMachine machine) {
        this.machine = machine;
    }

    public Product findProduct(String name) throws Exception {
        return machine.getProduct(name);

    }

}
