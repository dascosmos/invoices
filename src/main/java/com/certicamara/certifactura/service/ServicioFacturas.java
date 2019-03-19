package com.certicamara.certifactura.service;

import com.certicamara.certifactura.Repository.RepositorioFacturas;
import com.certicamara.certifactura.data.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioFacturas implements IServicioFacturas {

    @Autowired
    private RepositorioFacturas repositorio;

    @Override
    public List<Invoice> findAll() {

        List<Invoice> facturas = (List<Invoice>) repositorio.findAll();
        return facturas;
    }
}
