package com.certicamara.certifactura.service;

import com.certicamara.certifactura.data.Invoice;

import java.util.List;

public interface IServicioFacturas {

    public List<Invoice> findAll();
}
