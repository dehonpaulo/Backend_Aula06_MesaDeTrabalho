package server.impl;

import server.ISerie;

public class SerieService implements ISerie {
    @Override
    public String getSerie(String nome) {
        return "www." + nome + ".com.br";
    }
}
