package com.zlsam.learning.abstract_factory;

public class Room {
    private Door mDoor;
    private Chair mChair;
    private Bed mBed;
    private Table mTable;

    public Room(Door door, Chair chair, Bed bed, Table table) {
        mDoor = door;
        mChair = chair;
        mBed = bed;
        mTable = table;
    }

    @Override
    public String toString() {
        return "I am a room with " + mDoor.describe() + ", " + mChair.describe() + ", " + mBed.describe()
            + ", " + mTable.describe();
    }
}