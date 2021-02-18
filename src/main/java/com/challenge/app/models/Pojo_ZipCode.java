package com.challenge.app.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
 
@Entity
@Table(name = "POJO_ZIPCODE")
public class Pojo_ZipCode implements Serializable {
	
	private static final long serialVersionUID = 2188053831729437529L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer d_codigo;
	private String d_asenta;
	private String d_tipo_asenta;
	private String D_mnpio;
	private String d_estado;
	private String d_ciudad;
	private Integer d_CP;
	private Integer c_estado;
	private Integer c_oficina;
	private Integer c_CP;
	private Integer c_tipo_asenta;
	private Integer c_mnpio;
	private Integer id_asenta_cpcons;
	private String d_zona;
	private Integer c_cve_ciudad;
	
	public Pojo_ZipCode() {
		
	}
	
	public Pojo_ZipCode(Integer d_codigo, String d_asenta, String d_tipo_asenta, String d_mnpio, String d_estado,
			String d_ciudad, Integer d_CP, Integer c_estado, Integer c_oficina, Integer c_CP, Integer c_tipo_asenta,
			Integer c_mnpio, Integer id_asenta_cpcons, String d_zona, Integer c_cve_ciudad) {
		super();
		this.d_codigo = d_codigo;
		this.d_asenta = d_asenta;
		this.d_tipo_asenta = d_tipo_asenta;
		D_mnpio = d_mnpio;
		this.d_estado = d_estado;
		this.d_ciudad = d_ciudad;
		this.d_CP = d_CP;
		this.c_estado = c_estado;
		this.c_oficina = c_oficina;
		this.c_CP = c_CP;
		this.c_tipo_asenta = c_tipo_asenta;
		this.c_mnpio = c_mnpio;
		this.id_asenta_cpcons = id_asenta_cpcons;
		this.d_zona = d_zona;
		this.c_cve_ciudad = c_cve_ciudad;
	}
	@JsonProperty("Codigo")
	public Integer getD_codigo() {
		return d_codigo;
	}
	public void setD_codigo(Integer d_codigo) {
		this.d_codigo = d_codigo;
	}
	@JsonProperty("Asenta")
	public String getD_asenta() {
		return d_asenta;
	}
	public void setD_asenta(String d_asenta) {
		this.d_asenta = d_asenta;
	}
	@JsonProperty("Tipo_Asenta")
	public String getD_tipo_asenta() {
		return d_tipo_asenta;
	}
	public void setD_tipo_asenta(String d_tipo_asenta) {
		this.d_tipo_asenta = d_tipo_asenta;
	}
	@JsonProperty("Municipio")
	public String getD_mnpio() {
		return D_mnpio;
	}
	public void setD_mnpio(String d_mnpio) {
		D_mnpio = d_mnpio;
	}
	@JsonProperty("Estado")
	public String getD_estado() {
		return d_estado;
	}
	public void setD_estado(String d_estado) {
		this.d_estado = d_estado;
	}
	@JsonProperty("Ciudad")
	public String getD_ciudad() {
		return d_ciudad;
	}
	public void setD_ciudad(String d_ciudad) {
		this.d_ciudad = d_ciudad;
	}
	@JsonProperty("CP")
	public Integer getD_CP() {
		return d_CP;
	}
	public void setD_CP(Integer d_CP) {
		this.d_CP = d_CP;
	}
	@JsonProperty("Estado_Id")
	public Integer getC_estado() {
		return c_estado;
	}
	public void setC_estado(Integer c_estado) {
		this.c_estado = c_estado;
	}
	@JsonProperty("Oficina_Id")
	public Integer getC_oficina() {
		return c_oficina;
	}
	public void setC_oficina(Integer c_oficina) {
		this.c_oficina = c_oficina;
	}
	@JsonProperty("CP_Id")
	public Integer getC_CP() {
		return c_CP;
	}
	public void setC_CP(Integer c_CP) {
		this.c_CP = c_CP;
	}
	@JsonProperty("Tipo_Asenta_Id")
	public Integer getC_tipo_asenta() {
		return c_tipo_asenta;
	}
	public void setC_tipo_asenta(Integer c_tipo_asenta) {
		this.c_tipo_asenta = c_tipo_asenta;
	}
	@JsonProperty("Municipio_Id")
	public Integer getC_mnpio() {
		return c_mnpio;
	}
	public void setC_mnpio(Integer c_mnpio) {
		this.c_mnpio = c_mnpio;
	}
	@JsonProperty("Id_Asenta_CPCons")
	public Integer getId_asenta_cpcons() {
		return id_asenta_cpcons;
	}
	public void setId_asenta_cpcons(Integer id_asenta_cpcons) {
		this.id_asenta_cpcons = id_asenta_cpcons;
	}
	@JsonProperty("Zona")
	public String getD_zona() {
		return d_zona;
	}
	public void setD_zona(String d_zona) {
		this.d_zona = d_zona;
	}
	@JsonProperty("Cve_Ciudad_Id")
	public Integer getC_cve_ciudad() {
		return c_cve_ciudad;
	}
	public void setC_cve_ciudad(Integer c_cve_ciudad) {
		this.c_cve_ciudad = c_cve_ciudad;
	}
}
