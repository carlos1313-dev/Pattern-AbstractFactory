/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patternabstractfactory;

/**
 *
 * @author sangr
 */
public class MenuGourmetFactory implements IMenuFactory {

    public IEntrada crearEntrada() {
        return new EntradaGourmet();
    }

    public IPlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipalGourmet();
    }

    public IBebida crearBebida() {
        return new BebidaGourmet();
    }

    public IPostre crearPostre() {
        return new PostreGourmet();
    }
}

