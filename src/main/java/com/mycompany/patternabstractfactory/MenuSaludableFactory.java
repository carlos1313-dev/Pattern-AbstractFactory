/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patternabstractfactory;

/**
 *
 * @author sangr
 */
public class MenuSaludableFactory implements IMenuFactory {

    public IEntrada crearEntrada() {
        return new EntradaSaludable();
    }

    public IPlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipalSaludable();
    }

    public IBebida crearBebida() {
        return new BebidaSaludable();
    }

    public IPostre crearPostre() {
        return new PostreSaludable();
    }
}
