package server.impl;

import server.ISerie;

import java.util.Locale;

public class SerieProxy implements ISerie {
    Integer count;
    SerieService serieservice;

    public SerieProxy(SerieService serieservice) {
        this.serieservice = serieservice;
        this.count = 0;
    }

    @Override
    public String getSerie(String nome) {
        if(this.count < 5) {
            nome = nome.replaceAll(" ", "").toLowerCase();
            this.count++;
            return serieservice.getSerie(nome);
        } else {
            throw new SerieNaoHabilitadaException("Excede o número de reproduções permitidas");
        }
    }
}