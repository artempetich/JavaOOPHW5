package org.example.HWMVC;

import org.example.HWMVC.controllers.Controller;
import org.example.HWMVC.model.products.HotBeverage;
import org.example.HWMVC.model.products.Product;
import org.example.HWMVC.model.tasks.CoffieMachine;
import org.example.HWMVC.views.ConsumerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> dataBase = new ArrayList<>(Arrays.asList(new HotBeverage("кофе", 100, 75, true),
                (new HotBeverage("кофе", 100, 75, true)),
                (new HotBeverage("чай", 90, 75, false)),
                (new HotBeverage("американо", 120, 85, true)),
                (new HotBeverage("матэ", 160, 65, false))));
        CoffieMachine machine = new CoffieMachine(dataBase);
        Controller controller = new Controller(machine);
        ConsumerView view = new ConsumerView(controller);
        view.run();

    }
}