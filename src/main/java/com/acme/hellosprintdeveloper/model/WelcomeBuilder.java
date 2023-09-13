package com.acme.hellosprintdeveloper.model;

public class WelcomeBuilder {
    private static final String WELCOME_TEMPLATE = "Hello %s!. Now You are a Sprint Developer";

    public static String build(String name){
        String finalName = name == null ? "Developer": name;
        return String.format(WELCOME_TEMPLATE, finalName);
    }


}
