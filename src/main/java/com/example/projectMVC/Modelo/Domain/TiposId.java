package com.example.projectMVC.Modelo.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tipos_id")
public class TiposId {

    @Id
    @Column(name = "id_tipo_id")
    private Integer idTipoId;

    @Column(name = "nom_tipo_id")
    private String nomTipoId;

    @OneToMany(mappedBy = "tiposId")
    @JsonIgnore
    private List<Cliente> clientes;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Integer getIdTipoId() {
        return idTipoId;
    }

    public void setIdTipoId(Integer idTipoId) {
        this.idTipoId = idTipoId;
    }

    public String getNomTipoId() {
        return nomTipoId;
    }

    public void setNomTipoId(String nomTipoId) {
        this.nomTipoId = nomTipoId;
    }
}
