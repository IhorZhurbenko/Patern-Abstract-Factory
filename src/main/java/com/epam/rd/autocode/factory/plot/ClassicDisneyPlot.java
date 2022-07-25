package com.epam.rd.autocode.factory.plot;

public class ClassicDisneyPlot implements Plot {
    private final String hero;
    private final String beloved;
    private final String villain;

    public ClassicDisneyPlot(Character hero, Character beloved, Character villain) {
        this.hero = hero.name();
        this.beloved = beloved.name();
        this.villain = villain.name();
    }

    @Override
    public String asText() {
        return String.format("%s is young and adorable." +
                        " %s and %s love each other." +
                        " %s interferes with their happiness, but loses in the end."
                , hero, hero, beloved, villain);
    }
}
