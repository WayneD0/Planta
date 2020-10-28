package com.selmec.plantaselmec.Models;
// Generated Oct 30, 2014 5:43:43 PM by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Ensamblearranque generated by hbm2java
 */
@Entity
@Table(name = "ensamblearranque", catalog = "casetapruebas"
)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ensamblearranque extends Ensamblebase implements java.io.Serializable {

    private Ubicaciones ubicaciones;
    private String recibio;
    private String tecnico;
    private Set pruebaarranques = new HashSet(0);
    public Kit kit;
//    private Usuarios Autorizo;
//    private int Estatus;
//    private Date dtAutorizo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CarrilID", nullable = false)
    public Kit getKit() {
        return this.kit;
    }

    public void setKit(Kit kit) {
        this.kit = kit;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UbicacionId", nullable = false)
    public Ubicaciones getUbicaciones() {
        return this.ubicaciones;
    }

    public void setUbicaciones(Ubicaciones ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    @Column(name = "Recibio", nullable = false, length = 100)
    public String getRecibio() {
        return this.recibio;
    }

    public void setRecibio(String recibio) {
        this.recibio = recibio;
    }

    @Column(name = "Tecnico", nullable = false, length = 100)
    public String getTecnico() {
        return this.tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ensamblearranque")
    public Set getPruebaarranques() {
        return this.pruebaarranques;
    }

    public void setPruebaarranques(Set pruebaarranques) {
        this.pruebaarranques = pruebaarranques;
    }

}
