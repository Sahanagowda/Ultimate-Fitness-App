package com.example.ultimatefitnessapp;

/**
 * Created by guil on 11/20/15.
 */
public class UserData {


// User object where we can store all his values before storing it into the DB  (Height, gender, weight, etc...)

    private int _id;
    private String _name;
    private int _weight;
    private int _height;
    private String _gender;


    /* Constructor */
    public UserData(int _id) {
        this._id = _id;
    }



    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_weight() {
        return _weight;
    }

    public void set_weight(int _weight) {
        this._weight = _weight;
    }

    public String get_gender() {
        return _gender;
    }

    public void set_gender(String _gender) {
        this._gender = _gender;
    }


    public int get_height() {
        return _height;
    }

    public void set_height(int _height) {
        this._height = _height;
    }
}
