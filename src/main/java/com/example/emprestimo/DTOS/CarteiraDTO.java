package com.example.emprestimo.DTOS;

import java.util.Date;

public class CarteiraDTO {
	
	private Long numeroCarteira;
    private Date dataEmissao;
    private boolean isValid;
    private Long usuarioId; 

  
    public CarteiraDTO() {}

    public Long getNumeroCarteira() {
        return numeroCarteira;
    }

    public void setNumeroCarteira(Long numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public boolean isIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

}
