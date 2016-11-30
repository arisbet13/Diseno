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
@Table(name = "TORNEOS_ARISBETCATALAN_JORGEAGUIRRE_HUGOCELIS_EDNERVILMA_ALDOSANCHEZ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findAll", query = "SELECT t FROM TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez t")
    , @NamedQuery(name = "TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findById", query = "SELECT t FROM TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez t WHERE t.id = :id")
    , @NamedQuery(name = "TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByNombre", query = "SELECT t FROM TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByDescripcion", query = "SELECT t FROM TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByJugadores", query = "SELECT t FROM TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez t WHERE t.jugadores = :jugadores")})
public class TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 30)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 32000)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "JUGADORES")
    private Integer jugadores;
    @OneToMany(mappedBy = "idtorneo")
    private Collection<JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> jugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    @JoinColumn(name = "IDJUEGO", referencedColumnName = "ID")
    @ManyToOne
    private JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez idjuego;

    public TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez() {
    }

    public TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getJugadores() {
        return jugadores;
    }

    public void setJugadores(Integer jugadores) {
        this.jugadores = jugadores;
    }

    @XmlTransient
    public Collection<JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> getJugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection() {
        return jugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    }

    public void setJugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection(Collection<JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> jugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection) {
        this.jugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection = jugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    }

    public JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez getIdjuego() {
        return idjuego;
    }

    public void setIdjuego(JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez idjuego) {
        this.idjuego = idjuego;
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
        if (!(object instanceof TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez)) {
            return false;
        }
        TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez other = (TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Diseno.TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez[ id=" + id + " ]";
    }
    
}
