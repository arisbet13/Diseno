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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aRiS
 */
@Entity
@Table(name = "USUARIOS_ARISBETCATALAN_JORGEAGUIRRE_HUGOCELIS_EDNERVILMA_ALDOSANCHEZ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findAll", query = "SELECT u FROM UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez u")
    , @NamedQuery(name = "UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findById", query = "SELECT u FROM UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez u WHERE u.id = :id")
    , @NamedQuery(name = "UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByNombre", query = "SELECT u FROM UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByPaterno", query = "SELECT u FROM UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez u WHERE u.paterno = :paterno")
    , @NamedQuery(name = "UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByMaterno", query = "SELECT u FROM UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez u WHERE u.materno = :materno")
    , @NamedQuery(name = "UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByUsuario", query = "SELECT u FROM UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez u WHERE u.usuario = :usuario")
    , @NamedQuery(name = "UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByPass", query = "SELECT u FROM UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez u WHERE u.pass = :pass")})
public class UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PATERNO")
    private String paterno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MATERNO")
    private String materno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PASS")
    private String pass;
    @OneToMany(mappedBy = "idjugador")
    private Collection<MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> misionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    @OneToMany(mappedBy = "idjugador")
    private Collection<JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> jugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    @JoinColumn(name = "TIPOUSUARIO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez tipousuario;

    public UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez() {
    }

    public UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez(Integer id) {
        this.id = id;
    }

    public UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez(Integer id, String nombre, String paterno, String materno, String usuario, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.usuario = usuario;
        this.pass = pass;
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

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @XmlTransient
    public Collection<MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> getMisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection() {
        return misionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    }

    public void setMisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection(Collection<MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> misionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection) {
        this.misionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection = misionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    }

    @XmlTransient
    public Collection<JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> getJugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection() {
        return jugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    }

    public void setJugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection(Collection<JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez> jugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection) {
        this.jugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection = jugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchezCollection;
    }

    public TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(TipoUsuarioArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez tipousuario) {
        this.tipousuario = tipousuario;
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
        if (!(object instanceof UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez)) {
            return false;
        }
        UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez other = (UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Diseno.UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez[ id=" + id + " ]";
    }
    
}
