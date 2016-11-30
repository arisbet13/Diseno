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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "JUEGOS_ARISBETCATALAN_JORGEAGUIRRE_HUGOCELIS_EDNERVILMA_ALDOSANCHEZ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findAll", query = "SELECT j FROM JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez j")
    , @NamedQuery(name = "JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findById", query = "SELECT j FROM JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez j WHERE j.id = :id")
    , @NamedQuery(name = "JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByDescripcion", query = "SELECT j FROM JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez j WHERE j.descripcion = :descripcion")
    , @NamedQuery(name = "JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByRuta", query = "SELECT j FROM JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez j WHERE j.ruta = :ruta")})
public class JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 120)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 120)
    @Column(name = "RUTA")
    private String ruta;
    @OneToMany(mappedBy = "idjuego")
    private Collection<TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> torneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    @JoinColumn(name = "STATUS", referencedColumnName = "ID")
    @ManyToOne
    private StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez status;
    @OneToMany(mappedBy = "idjuego")
    private Collection<ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> scoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    @OneToMany(mappedBy = "idjuego")
    private Collection<MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> misionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;

    public JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez() {
    }

    public JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez(Integer id) {
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

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @XmlTransient
    public Collection<TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> getTorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection() {
        return torneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    }

    public void setTorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection(Collection<TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> torneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection) {
        this.torneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection = torneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    }

    public StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez getStatus() {
        return status;
    }

    public void setStatus(StatusArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> getScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection() {
        return scoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    }

    public void setScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection(Collection<ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> scoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection) {
        this.scoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection = scoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    }

    @XmlTransient
    public Collection<MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> getMisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection() {
        return misionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    }

    public void setMisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection(Collection<MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> misionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection) {
        this.misionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection = misionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
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
        if (!(object instanceof JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez)) {
            return false;
        }
        JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez other = (JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Diseno.JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez[ id=" + id + " ]";
    }
    
}
