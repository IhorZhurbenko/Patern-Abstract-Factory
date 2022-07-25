package com.epam.rd.autocode.factory.plot;

class MarvelPlot implements Plot {
    private final String heroes;
    private final String epicCrisis;
    private final String villain;
    private final String are_Or_is;
    private final String heroES;
    private final String the;

    public MarvelPlot(Character[] heroesChars, EpicCrisis epicCrisis, Character villain) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : heroesChars) {
            stringBuilder.append("the brave ").append(c.name());
            if (c != heroesChars[heroesChars.length - 1]) {
                stringBuilder.append(", ");
                if (heroesChars.length >= 2 && c == heroesChars[heroesChars.length - 2]) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    stringBuilder.append(" and ");
                }
            }
        }
        String heroes = stringBuilder.toString();
        are_Or_is = heroesChars.length == 1 ? "is" : "are";
        heroES = heroesChars.length == 1 ? "" : "es";
        the = heroesChars.length == 1 ? " the" : "";
        this.heroes = heroes;
        this.epicCrisis = epicCrisis.name();
        this.villain = villain.name();
    }

    @Override
    public String asText() {
        return String.format("%s threatens the world." +
                        " But %s " + are_Or_is + " on guard." +
                        " So, no way that intrigues of %s will bend the willpower of" + the + " inflexible hero" + heroES + "."
                , epicCrisis, heroes, villain);
    }
}