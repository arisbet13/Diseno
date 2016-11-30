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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aRiS
 */
@Entity
@Table(name = "MISION_JUGADORES_ARISBETCATALAN_JORGEAGUIRRE_HUGOCELIS_EDNERVILMA_ALDOSANCHEZ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findAll", query = "SELECT m FROM MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez m")
    , @NamedQuery(name = "MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findById", query = "SELECT m FROM MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez m WHERE m.id = :id")
    , @NamedQuery(name = "MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByStatus", query = "SELECT m FROM MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez m WHERE m.status = :status")
    , @NamedQuery(name = "MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByScore", query = "SELECT m FROM MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez m WHERE m.score = :score")})
public class MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 30)
    @Column(name = "STATUS")
    private String status;
    @Column(name = "SCORE")
    private Integer score;
    @JoinColumn(name = "IDMISION", referencedColumnName = "ID")
    @ManyToOne
    private MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez idmision;
    @JoinColumn(name = "IDJUGADOR", referencedColumnName = "ID")
    @ManyToOne
    private UsuariosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez idjugador;

    public MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez() {
    }

    public MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez getIdmision() {
        return idmision;
    }

    public void setIdmision(MisionesArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez idmision) {
        this.idmision = idmision;
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
        if (!(object instanceof MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez)) {
            return false;
        }
        MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez other = (MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Diseno.MisionJugadoresArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez[ id=" + id + " ]";
    }
    
}
