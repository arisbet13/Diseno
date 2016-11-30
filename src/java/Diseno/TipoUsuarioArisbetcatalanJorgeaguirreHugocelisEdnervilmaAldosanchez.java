/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseno;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aRiS
 */
@Entity
@Table(name = "TIPO_USUARIO_ARISBETCATALAN_JORGEAGUIRRE_HUGOCELIS_EDNERVILMA_ALDOSANCHEZ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findAll", query = "SELECT t FROM TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez t")
    , @NamedQuery(name = "TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findById", query = "SELECT t FROM TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez t WHERE t.id = :id")
    , @NamedQuery(name = "TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByDescripcion", query = "SELECT t FROM TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez t WHERE t.descripcion = :descripcion")})
public class TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipousuario")
    private Collection<UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> usuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;

    public TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez() {
    }

    public TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez(Integer id) {
        this.id = id;
    }

    public TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
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
    public Collection<UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> getUsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection() {
        return usuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    }

    public void setUsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection(Collection<UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> usuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection) {
        this.usuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection = usuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
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
        if (!(object instanceof TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez)) {
            return false;
        }
        TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez other = (TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Diseno.TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez[ id=" + id + " ]";
    }
    
}
