package com.certicamara.certifactura.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private String id;

    private String razonSocial;

    @OneToMany(targetEntity = Invoice.class)
    private List listaFacturas;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(List listaFacturas) {
        this.listaFacturas = listaFacturas;
    }
}
