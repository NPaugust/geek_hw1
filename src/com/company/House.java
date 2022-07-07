package com.company;

public class House {
    private String family;
    private String occupation;

    public House(String family, String occupation) {
        this.family = family;
        this.occupation = occupation;
    }

    public String getFamily() {
        return family;
    }

    public String getOccupation() {
        return occupation;
    }
    static void giveGas() {
        System.out.println("Vroom Vroom");

    }

    static void giveGas(String voice) {
        System.out.println(voice);

    }
}
