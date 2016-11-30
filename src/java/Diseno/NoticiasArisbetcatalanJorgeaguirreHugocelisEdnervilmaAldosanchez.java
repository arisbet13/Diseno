/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseno;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aRiS
 */
@Entity
@Table(name = "NOTICIAS_ARISBETCATALAN_JORGEAGUIRRE_HUGOCELIS_EDNERVILMA_ALDOSANCHEZ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findAll", query = "SELECT n FROM NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez n")
    , @NamedQuery(name = "NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findById", query = "SELECT n FROM NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez n WHERE n.id = :id")
    , @NamedQuery(name = "NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByTitulo", query = "SELECT n FROM NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez n WHERE n.titulo = :titulo")
    , @NamedQuery(name = "NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByDescripcion", query = "SELECT n FROM NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez n WHERE n.descripcion = :descripcion")
    , @NamedQuery(name = "NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByFecha", query = "SELECT n FROM NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez n WHERE n.fecha = :fecha")
    , @NamedQuery(name = "NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez.findByAutor", query = "SELECT n FROM NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez n WHERE n.autor = :autor")})
public class NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "TITULO")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "AUTOR")
    private String autor;

    public NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez() {
    }

    public NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez(Integer id) {
        this.id = id;
    }

    public NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez(Integer id, String titulo, String descripcion, Date fecha, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.autor = autor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
        if (!(object instanceof NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez)) {
            return false;
        }
        NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez other = (NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Diseno.NoticiasArisbetcatalanJorgeaguirreHugocelisEdnervilmaAldosanchez[ id=" + id + " ]";
    }
    
}
