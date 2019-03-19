package com.certicamara.certifactura.data;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "facturas")
public class Invoice {

    private String idPlantilla;

    private String razonSocial;

    @Id
    private String numeroFactura;

    private String fecha;

    private String subtotal;

    private String iva;

    private String total;

    @OneToMany(targetEntity = Product.class)
    private List <Product> products;

    public Invoice(){
        this.products = new ArrayList<Product>();
    }

    public String getIdPlantilla() {
        return idPlantilla;
    }

    public void setIdPlantilla(String idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "idPlantilla='" + idPlantilla + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", numeroFactura='" + numeroFactura + '\'' +
                ", fecha='" + fecha + '\'' +
                ", subtotal='" + subtotal + '\'' +
                ", iva='" + iva + '\'' +
                ", total='" + total + '\'' +
                ", products=" + products.toString() +
                '}';
    }
}
