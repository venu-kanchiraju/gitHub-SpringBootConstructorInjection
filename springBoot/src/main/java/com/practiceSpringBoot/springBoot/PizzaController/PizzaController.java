package com.practiceSpringBoot.springBoot.PizzaController;

import com.practiceSpringBoot.springBoot.VegPizza.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {
    private VegPizza vegPizza;
    @Autowired
    public PizzaController(VegPizza vegPizza){
        this.vegPizza=vegPizza;
    }
    public String getPizza(){
        return vegPizza.getPizza();
    }
}
