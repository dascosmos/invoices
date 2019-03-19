package com.certicamara.certifactura.Repository;

import com.certicamara.certifactura.data.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioFacturas extends CrudRepository<Invoice, String> {

}
