/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author dell
 */
public class room {

    private String room_type;
    private int room_number;
    private int room_price;
    private boolean room_free;
    private int room_square;

    public boolean getRoom_free() {
        return room_free;
    }

    public void setRoom_free(boolean room_free) {
        this.room_free = room_free;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public int getRoom_price() {
        return room_price;
    }

    public void setRoom_price(int room_price) {
        this.room_price = room_price;
    }

    public int getRoom_square() {
        return room_square;
    }

    public void setRoom_square(int room_square) {
        this.room_square = room_square;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public room() {
    }

    @Override
    public String toString() {
        return "room{" + "room_type=" + room_type + ", room_number=" + room_number + ", room_price=" + room_price + ", room_free=" + room_free + ", room_square=" + room_square + '}';
    }
}
