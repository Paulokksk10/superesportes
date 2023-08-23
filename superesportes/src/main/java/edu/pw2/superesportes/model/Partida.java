package edu.pw2.superesportes.model;

import java.time.LocalDateTime;
import java.time.Duration;

public class Partida {
    private String local;
    private LocalDateTime inicio;
    private LocalDateTime fim;

    public Partida() {
    }

    public Partida(String local, LocalDateTime inicio, LocalDateTime fim) {
        this.local = local;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Partida(PartidaDados dados){
        this.local = dados.local();
        this.inicio = dados.inicio();
        this.fim = dados.fim();
    }
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public long calcularDuracao() {
        return Duration.between(inicio, fim).toMinutes();
    }
}
