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
@Table(name = "MISIONES_ARISBETCATALAN_JORGEAGUIRRE_HUGOCELIS_EDNERVILMA_ALDOSANCHEZ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findAll", query = "SELECT m FROM MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez m")
    , @NamedQuery(name = "MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findById", query = "SELECT m FROM MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez m WHERE m.id = :id")
    , @NamedQuery(name = "MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByNombre", query = "SELECT m FROM MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByDescripcion", query = "SELECT m FROM MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByPuntaje", query = "SELECT m FROM MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez m WHERE m.puntaje = :puntaje")})
public class MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 30)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "PUNTAJE")
    private Integer puntaje;
    @OneToMany(mappedBy = "idmision")
    private Collection<MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> misionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    @JoinColumn(name = "IDJUEGO", referencedColumnName = "ID")
    @ManyToOne
    private JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez idjuego;

    public MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez() {
    }

    public MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez(Integer id) {
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

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    @XmlTransient
    public Collection<MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> getMisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection() {
        return misionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    }

    public void setMisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection(Collection<MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> misionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection) {
        this.misionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection = misionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
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
        if (!(object instanceof MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez)) {
            return false;
        }
        MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez other = (MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Diseno.MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez[ id=" + id + " ]";
    }
    
}
