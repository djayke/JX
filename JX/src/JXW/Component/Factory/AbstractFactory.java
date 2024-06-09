package JXW.Component.Factory;

import JXW.Component.Comp;


public abstract class AbstractFactory {
    abstract Comp getComp(String compType) ;
}