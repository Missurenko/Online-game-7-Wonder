package com.wonder.wonder.service.cards.impl;

import com.wonder.wonder.service.cards.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * Creator: bm
 * Date: 13.06.17.
 */
public enum PurpleImpl implements Card {
    // purple
    WORKERS_GUILD,
    CRAFTMENS_GUILD,
    TRADERS_GUILD,
    PHILOSOPHERS_GUILD,
    SPY_GUILD,
    STRATEGY_GUILD,
    SHIPOWNERS_GUILD,
    SCIENTISTS_GUILD,
    MAGISTRATES_GUILD,
    BUILDERS_GUILD;
    @Override
    public List<Card> getAllCard() {
        List<Card> cards = new ArrayList<>();
        cards.add(SilverCardImpl.LOOM);
        cards.add(SilverCardImpl.GLASSWORKS);
        cards.add(SilverCardImpl.PRESS);

        return cards;
    }
    @Override
    public void setField() {}
}
