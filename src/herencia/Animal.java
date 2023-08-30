/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Perla
 */
public class Animal {

    public String hacerRuido() {
        return "Hola";
    }
}

class Perro extends Animal {

    @Override
    public String hacerRuido() {
        return "Guau";
    }
}

class Gato extends Animal {

    @Override
    public String hacerRuido() {
        return "Miau";
    }
}
