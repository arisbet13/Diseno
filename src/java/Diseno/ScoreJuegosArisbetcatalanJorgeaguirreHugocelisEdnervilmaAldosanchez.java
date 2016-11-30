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
@Table(name = "SCORE_JUEGOS_ARISBETCATALAN_JORGEAGUIRRE_HUGOCELIS_EDNERVILMA_ALDOSANCHEZ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findAll", query = "SELECT s FROM ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez s")
    , @NamedQuery(name = "ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findById", query = "SELECT s FROM ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez s WHERE s.id = :id")
    , @NamedQuery(name = "ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByIdjugador", query = "SELECT s FROM ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez s WHERE s.idjugador = :idjugador")
    , @NamedQuery(name = "ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByScore", query = "SELECT s FROM ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez s WHERE s.score = :score")})
public class ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "IDJUGADOR")
    private Integer idjugador;
    @Column(name = "SCORE")
    private Integer score;
    @JoinColumn(name = "IDJUEGO", referencedColumnName = "ID")
    @ManyToOne
    private JuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez idjuego;

    public ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez() {
    }

    public ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdjugador() {
        return idjugador;
    }

    public void setIdjugador(Integer idjugador) {
        this.idjugador = idjugador;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
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
        if (!(object instanceof ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez)) {
            return false;
        }
        ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez other = (ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Diseno.ScoreJuegosArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez[ id=" + id + " ]";
    }
    
}
