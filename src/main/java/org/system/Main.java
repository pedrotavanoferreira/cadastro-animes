package org.system;

import org.system.model.Anime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        Anime var1 = new Anime();
        var1.setName("Naruto");
        var1.setCreator("Masashi Kishimoto");
        Anime var2 = new Anime();
        var2.setName("Jujutsu Kaisen");
        var2.setCreator("Gege Akutami");
        System.out.println(var1.getName());
    }
}