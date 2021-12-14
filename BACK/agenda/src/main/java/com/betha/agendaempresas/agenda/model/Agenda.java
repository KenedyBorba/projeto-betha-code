package com.betha.agendaempresas.agenda.model;

import com.betha.agendaempresas.agenda.enterprise.AbstractID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Agenda extends AbstractID {

//    @ManyToOne
//    @JoinColumn(name = "I_SERVICO", referencedColumnName = "id")
//    private Servico servico;
//    @Column(name = "TITULO")
    private String titulo;
    private String title;
    //alteramos o nome da data inicial para start
    @Column(name = "DATA_INICIAL")
    private LocalDateTime start;
    //alteramos o nome da data final para end
    @Column(name = "DATA_FINAL")
    private LocalDateTime end;
    //@Column(name = "cor")
    private String backgroundColor;

//    public Servico getServico() {
//        return servico;
//    }
//
//    public void setServico(Servico servico) {
//        this.servico = servico;
//    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public String getTitulo() {
        return title;
    }

    public void setTitulo(String titulo) {
        this.title = titulo;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "titulo='" + titulo + '\'' +
                ", title='" + title + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", backgroundColor='" + backgroundColor + '\'' +
                '}';
    }
}
