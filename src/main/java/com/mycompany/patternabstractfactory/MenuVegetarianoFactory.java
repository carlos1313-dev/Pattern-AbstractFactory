/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patternabstractfactory;

/**
 *
 * @author sangr
 */
public class MenuVegetarianoFactory implements IMenuFactory {

    public IEntrada crearEntrada() {
        return new EntradaVegetariana();
    }

    public IPlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipalVegetariano();
    }

    public IBebida crearBebida() {
        return new BebidaVegetariana();
    }

    public IPostre crearPostre() {
        return new PostreVegetariano();
    }
}
