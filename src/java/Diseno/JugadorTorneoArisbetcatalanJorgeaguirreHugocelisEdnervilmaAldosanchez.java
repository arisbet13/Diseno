/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseno;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aRiS
 */
@Entity
@Table(name = "JUGADOR_TORNEO_ARISBETCATALAN_JORGEAGUIRRE_HUGOCELIS_EDNERVILMA_ALDOSANCHEZ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findAll", query = "SELECT j FROM JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez j")
    , @NamedQuery(name = "JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findById", query = "SELECT j FROM JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez j WHERE j.id = :id")
    , @NamedQuery(name = "JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByScore", query = "SELECT j FROM JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez j WHERE j.score = :score")})
public class JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "SCORE")
    private Integer score;
    @JoinColumn(name = "IDTORNEO", referencedColumnName = "ID")
    @ManyToOne
    private TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez idtorneo;
    @JoinColumn(name = "IDJUGADOR", referencedColumnName = "ID")
    @ManyToOne
    private UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez idjugador;

    public JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez() {
    }

    public JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez getIdtorneo() {
        return idtorneo;
    }

    public void setIdtorneo(TorneosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez idtorneo) {
        this.idtorneo = idtorneo;
    }

    public UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez getIdjugador() {
        return idjugador;
    }

    public void setIdjugador(UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez idjugador) {
        this.idjugador = idjugador;
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
        if (!(object instanceof JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez)) {
            return false;
        }
        JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez other = (JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Diseno.JugadorTorneoArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez[ id=" + id + " ]";
    }
    
}
