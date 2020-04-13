package com.learn.strategy;

/**
 * Context is configured with Concrete strategy object. Maintains references to strategy object.
 *
 * Intent:
 * 1. Define a family of algorithm, encapsulate each one and make them interchangeable.
 * 2. Strategy let algorithm vary independently based on the client who use it.
 *
 *
 * use strategy when
 * 1. many related class differ only in behavior.
 * 2. you need different variants of algorithm.
 * 3. algorithm uses data that client or user should not be aware of it.
 * 4. class defines many behaviors and those appear to be multiple conditional statements in its operations. Instead of many conditionals, move
 *    related conditionals into their own strategy class.
 *
 */
public class Composition {

    public void travers(){

        Strategy strategy = new SimpleCompositor();
        strategy.compose();
    }

    public void repair(){}
}
