package com.fuzhihao;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("ZZ", "FF", 2, "ok@ok");
        
        Gson gson = new Gson();
        String json = gson.toJson(p);
        System.out.println(json);
        
    }
}