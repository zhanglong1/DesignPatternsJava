package com.zlsam.learning.abstract_factory;

public class EuropeanStyleFurnitureMaker extends FurnitureMaker {
    @Override
    public Chair makeChair() {
        return new EuropeanStyleChair();
    }

    @Override
    public Door makeDoor() {
        return new EuropeanStyleDoor();
    }

    @Override
    public Bed makeBed() {
        return new EuropeanStyleBed();
    }

    @Override
    public Table makeTable() {
        return new EuropeanStyleTable();
    }
}