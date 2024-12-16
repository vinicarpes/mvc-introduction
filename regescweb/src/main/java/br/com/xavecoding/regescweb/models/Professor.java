package br.com.xavecoding.regescweb.models;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.math.BigDecimal;

@Entity //cria uma tabela professor no bd
public class Professor {
    @Id //definindo id como pk no bd
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    private BigDecimal salario;
    @Enumerated(EnumType.STRING) //valor enumerado e o guarda como string
    private StatusProfessor statusProfessor;

    public Professor(String nome, BigDecimal salario, StatusProfessor statusProfessor) {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public StatusProfessor getStatusProfessor() {
        return statusProfessor;
    }

    public void setStatusProfessor(StatusProfessor statusProfessor) {
        this.statusProfessor = statusProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}