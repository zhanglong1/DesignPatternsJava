package com.zlsam.learning.abstract_factory;

public class ChineseStyleFurnitureMaker extends FurnitureMaker {
    @Override
    public Chair makeChair() {
        return new ChineseStyleChair();
    }

    @Override
    public Door makeDoor() {
        return new ChineseStyleDoor();
    }

    @Override
    public Bed makeBed() {
        return new ChineseStyleBed();
    }

    @Override
    public Table makeTable() {
        return new ChineseStyleTable();
    }
}