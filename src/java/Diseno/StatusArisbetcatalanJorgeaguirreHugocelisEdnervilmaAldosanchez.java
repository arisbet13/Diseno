/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseno;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aRiS
 */
@Entity
@Table(name = "STATUS_ARISBETCATALAN_JORGEAGUIRRE_HUGOCELIS_EDNERVILMA_ALDOSANCHEZ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findAll", query = "SELECT s FROM StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez s")
    , @NamedQuery(name = "StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findById", query = "SELECT s FROM StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez s WHERE s.id = :id")
    , @NamedQuery(name = "StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByDescripcion", query = "SELECT s FROM StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez s WHERE s.descripcion = :descripcion")})
public class StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 120)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(mappedBy = "status")
    private Collection<JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> juegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;

    public StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez() {
    }

    public StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> getJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection() {
        return juegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    }

    public void setJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection(Collection<JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> juegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection) {
        this.juegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection = juegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez)) {
            return false;
        }
        StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez other = (StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Diseno.StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez[ id=" + id + " ]";
    }
    
}
