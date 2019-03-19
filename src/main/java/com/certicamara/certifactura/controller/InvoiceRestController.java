package com.certicamara.certifactura.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceRestController {


    @PostMapping
    public String creacionFactura(){

        return "";
    }
}
