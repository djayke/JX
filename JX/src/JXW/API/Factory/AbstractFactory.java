package JXW.API.Factory;

import JXW.Component.Comp;


public abstract class AbstractFactory {
    abstract Comp getComp(String compType) ;
}