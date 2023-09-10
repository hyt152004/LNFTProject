package model;

import java.util.ArrayList;

public class User {
    private ArrayList<Reflection> reflections;

    public User(){
        reflections = new ArrayList<>();
    }

    public void addReflection(Reflection reflection){
        reflections.add(reflection);
    }
    
}
