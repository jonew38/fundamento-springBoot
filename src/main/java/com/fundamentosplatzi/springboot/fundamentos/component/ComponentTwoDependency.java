package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoDependency implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Mi Nombre es Jose Guevara");

    }
}
