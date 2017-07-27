package com.zlsam.learning.abstract_factory;

public class RoomDecorator {
    private static FurnitureMaker mFurnitureMaker;

    public static void main(String[] args) {
        mFurnitureMaker = new ChineseStyleFurnitureMaker();
        Room room = new Room(mFurnitureMaker.makeDoor(), mFurnitureMaker.makeChair(),
         mFurnitureMaker.makeBed(), mFurnitureMaker.makeTable());

        System.out.println(room.toString());
    }
}