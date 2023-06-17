package unicamp.ic.mc322.model;


public enum Desconto {
	 varejo(0, 5.0),
	 atacado(1, 15.0),
	 fator_100_200(2, 5.0),
	 fator_200_500(3, 10.0),
	 fator_500(4,  15.0);

	private Integer codigo;

	private Double porcentagem;
	
	Desconto(Integer codigoInteger, Double porceDouble) {
		this.codigo = codigoInteger;
		this.porcentagem = porceDouble;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(Double porcentagem) {
		this.porcentagem = porcentagem;
	}


}