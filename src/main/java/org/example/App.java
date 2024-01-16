package org.example;

import org.json.JSONObject;

public class App {
    public static void main(String[] args) {
        String jsonStr = "{\"name\":\"Volodymyr\", \"lastName\":\"Veselovskyi\", \"city\":\"Kherson\"}";
        JSONObject jsonObj = new JSONObject(jsonStr);
        String fullName = String.format("I am %s %s from %s",
                jsonObj.getString("name"),
                jsonObj.getString("lastName"),
                jsonObj.getString("city"));
        System.out.println(fullName);
    }
}