package model;

import javax.persistence.*;



@Entity
@Table(name = "tbl_item")
public class Registro {
	
	@Id
	@GeneratedValue
	@Column(name = "id_item")
	private Integer idInformacao;
	
	
	@Column(name ="status", nullable = false)
	private Boolean status;
	
	
	
	@Column(name ="descricao", nullable = false)
	private String informacao;
	
	
	public Registro(String informacao, Boolean status) {
		super();
		this.informacao = informacao;
		this.status = status;
	}

	
	public String getInformacao() {
		return informacao;
	}
	
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
	
	public int getIdInformacao() {
		return idInformacao;
	}
	
	public void setIdInformacao(int idInformacao) {
		this.idInformacao = idInformacao;
	}
	
	
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	

}
