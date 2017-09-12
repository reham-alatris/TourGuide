package com.example.android.tourguide;

/**
 * Created by reham moamed on 18/05/2017.
 */

public class List_Item {
    int Name;
    String Phone;
    String Location;
    int Image;

    public List_Item(int name, int image) {
        Name = name;
        Image = image;
    }

    public List_Item(int name, String phone, String location) {
        Name = name;
        Phone = phone;
        Location = location;
    }

    public List_Item(int name, String phone, String location, int image) {

        Name = name;
        Phone = phone;
        Location = location;
        Image = image;

    }

    public int getName() {
        return Name;
    }

    public void setName(int name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public String getLocation() {
        return Location;
    }

    public int getImage() {
        return Image;
    }


    @Override
    public String toString() {
        return "List_Item{" +
                "Name=" + Name +
                ", Phone=" + Phone +
                ", Location=" + Location +
                ", Image=" + Image +
                '}';
    }
}
