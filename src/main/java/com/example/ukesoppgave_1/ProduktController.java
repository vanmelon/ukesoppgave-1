package com.example.ukesoppgave_1;

import java.util.ArrayList;
import java.util.List;

public class ProduktController {
    private List<Produkt> produkter = new ArrayList<>();

    public void leggTilProdukt(Produkt produkt) {
        produkter.add(produkt);
    }

    public List<Produkt> hentAlleProdukter() {
        return produkter;
    }
}