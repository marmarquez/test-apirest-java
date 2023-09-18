package com.apirestdemo.test.models;

import jakarta.persistence.*;

@Entity
@Table(name="api_afiliacion_maestro")
public class DatosTest {

    @Id
    @Column(name = "ap_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tipoDoc;
    private String nroDoc;
    private String tlfNum;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getNroDoc() {
        return nroDoc;
    }
    public void setNroDoc(String nroDoc) {
        this.nroDoc = nroDoc;
    }
    public String getTlfNum() {
        return tlfNum;
    }
    public void setTlfNum(String tlfNum) {
        this.tlfNum = tlfNum;
    }

}
