package com.springaws.servicios.serviciosartifact.mvc.model.persistence;

import javax.persistence.*;

/**
 * Created by IDEX1010 on 19/02/2019.
 */
@Entity
@Table(name = "PagoServicio", schema = "", catalog = "Servicios")
public class PagoServicioEntity {
    private int idPagoServicio;
    private String monto;
    private Boolean activo;
    private CatFormaPagoEntity catFormaPagoByIdFormaPago;
    private CatTipoDivisa catTipoDivisa;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPagoServicio")
    public int getIdPagoServicio() {
        return idPagoServicio;
    }

    public void setIdPagoServicio(int idPagoServicio) {
        this.idPagoServicio = idPagoServicio;
    }

    @Basic
    @Column(name = "Monto")
    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    @Basic
    @Column(name = "Activo")
    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PagoServicioEntity that = (PagoServicioEntity) o;

        if (idPagoServicio != that.idPagoServicio) return false;
        if (monto != null ? !monto.equals(that.monto) : that.monto != null) return false;
        if (activo != null ? !activo.equals(that.activo) : that.activo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPagoServicio;
        result = 31 * result + (monto != null ? monto.hashCode() : 0);
        result = 31 * result + (activo != null ? activo.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IdFormaPago", referencedColumnName = "IdFormaPago", nullable = false)
    public CatFormaPagoEntity getCatFormaPagoByIdFormaPago() {
        return catFormaPagoByIdFormaPago;
    }

    public void setCatFormaPagoByIdFormaPago(CatFormaPagoEntity catFormaPagoByIdFormaPago) {
        this.catFormaPagoByIdFormaPago = catFormaPagoByIdFormaPago;
    }

    @ManyToOne
    @JoinColumn(name = "IdTipoDivisa", referencedColumnName = "IdDivisa", nullable = false)
    public CatTipoDivisa getCatTipoDivisa() {
        return catTipoDivisa;
    }

    public void setCatTipoDivisa(CatTipoDivisa catTipoDivisa) {
        this.catTipoDivisa = catTipoDivisa;
    }
}
