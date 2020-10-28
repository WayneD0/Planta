package com.selmec.plantaselmec.Models;
// Generated Oct 30, 2014 5:43:43 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Lecturas generated by hbm2java
 */
@Entity
@Table(name = "lecturas", catalog = "casetapruebas"
)

public class Lecturas implements java.io.Serializable {

    private Integer id;
    private Pruebabase pruebabase;
    private Double l1l2;
    private Double l2l3;
    private Double l3l1;
    private Double hz;
    private Integer temp;
    private Double l1;
    private Double l2;
    private Double l3;
    private Date dtStamp;
    private Integer rmp;
    private Double i1;
    private Double i2;
    private Double i3;
    private Double bateria;
    private Integer segundo;
    private Integer iteracion;
    private Iteraciones iteraciones;

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ID", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PruebaID")
    public Pruebabase getPruebabase() {
        return this.pruebabase;
    }

    public void setPruebabase(Pruebabase pruebabase) {
        this.pruebabase = pruebabase;
    }

    @Column(name = "L1L2", precision = 22, scale = 0)
    public Double getL1l2() {
        return this.l1l2;
    }

    public void setL1l2(Double l1l2) {
        this.l1l2 = l1l2;
    }

    @Column(name = "L2L3", precision = 22, scale = 0)
    public Double getL2l3() {
        return this.l2l3;
    }

    public void setL2l3(Double l2l3) {
        this.l2l3 = l2l3;
    }

    @Column(name = "L3L1", precision = 22, scale = 0)
    public Double getL3l1() {
        return this.l3l1;
    }

    public void setL3l1(Double l3l1) {
        this.l3l1 = l3l1;
    }

    @Column(name = "HZ", precision = 22, scale = 0)
    public Double getHz() {
        return this.hz;
    }

    public void setHz(Double hz) {
        this.hz = hz;
    }

    @Column(name = "TEMP")
    public Integer getTemp() {
        return this.temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    @Column(name = "L1", precision = 22, scale = 0)
    public Double getL1() {
        return this.l1;
    }

    public void setL1(Double l1) {
        this.l1 = l1;
    }

    @Column(name = "L2", precision = 22, scale = 0)
    public Double getL2() {
        return this.l2;
    }

    public void setL2(Double l2) {
        this.l2 = l2;
    }

    @Column(name = "L3", precision = 22, scale = 0)
    public Double getL3() {
        return this.l3;
    }

    public void setL3(Double l3) {
        this.l3 = l3;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dtStamp", length = 19)
    public Date getDtStamp() {
        return this.dtStamp;
    }

    public void setDtStamp(Date dtStamp) {
        this.dtStamp = dtStamp;
    }

    @Column(name = "RMP")
    public Integer getRmp() {
        return this.rmp;
    }

    public void setRmp(Integer rmp) {
        this.rmp = rmp;
    }

    @Column(name = "I1", precision = 22, scale = 0)
    public Double getI1() {
        return this.i1;
    }

    public void setI1(Double i1) {
        this.i1 = i1;
    }

    @Column(name = "I2", precision = 22, scale = 0)
    public Double getI2() {
        return this.i2;
    }

    public void setI2(Double i2) {
        this.i2 = i2;
    }

    @Column(name = "I3", precision = 22, scale = 0)
    public Double getI3() {
        return this.i3;
    }

    public void setI3(Double i3) {
        this.i3 = i3;
    }

    @Column(name = "bateria", precision = 22, scale = 0)
    public Double getBateria() {
        return this.bateria;
    }

    public void setBateria(Double bateria) {
        this.bateria = bateria;
    }

    @Column(name = "segundo")
    public Integer getSegundo() {
        return this.segundo;
    }

    public void setSegundo(Integer segundo) {
        this.segundo = segundo;
    }

    @Column(name = "iteracion")
    public Integer getIteracion() {
        return this.iteracion;
    }

    public void setIteracion(Integer iteracion) {
        this.iteracion = iteracion;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "lecturas")
    public Iteraciones getIteraciones() {
        return this.iteraciones;
    }

    public void setIteraciones(Iteraciones iteraciones) {
        this.iteraciones = iteraciones;
    }

}
