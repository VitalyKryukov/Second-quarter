package org.example.seminar2.hw2;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Buyer actor);
    void replaceFromMarket(Buyer actor);
    void update();
}
