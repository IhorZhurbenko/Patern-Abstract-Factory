package com.epam.rd.autocode.factory.plot;

class ContemporaryDisneyPlot implements Plot {
    private final String hero;
    private final String epicCrisis;
    private final String funnyFriend;

    public ContemporaryDisneyPlot(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        this.hero = hero.name();
        this.epicCrisis = epicCrisis.name();
        this.funnyFriend = funnyFriend.name();
    }

    @Override
    public String asText() {
        return String.format("In the beginning, " +
                        "%s feels a bit awkward and uncomfortable. But personal issue fades, when a big trouble comes - " +
                        "%s. %s stands up against it, but with no success at first. " +
                        "But then, by putting self together and with the help of friends, " +
                        "including spectacular, funny %s, " +
                        "%s restores the spirit, overcomes the crisis and gains gratitude and respect."
                , hero, epicCrisis, hero, funnyFriend, hero);
    }
}
