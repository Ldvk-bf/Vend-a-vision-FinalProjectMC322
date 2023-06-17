package unicamp.ic.mc322.model;

public enum Acesso {
	CLIENTE_CRIAR(0, "Criar CLIENTE"),
	PRODUTO_CRIAR(0, "Criar PRODUTO"),
	FUNCIONARIO_CRIAR(0, "Criar FUNCIONARIO"),
	FORNECEDOR_CRIAR(0, "Criar FORNECEDOR"),
	CLIENTE_LER(0, "Ler CLIENTE"),
	PRODUTO_LER(0, "Ler PRODUTO"),
	FUNCIONARIO_LER(0, "Ler FUNCIONARIO"),
	FORNECEDOR_LER(0, "Ler FORNECEDOR"),
	CLIENTE_ATUALIZAR(0, "Atualizar CLIENTE"),
	PRODUTO_ATUALIZAR(0, "Atualizar PRODUTO"),
	FUNCIONARIO_ATUALIZAR(0, "Atualizar FUNCIONARIO"),
	FORNECEDOR_ATUALIZAR(0, "Atualizar FORNECEDOR"),
	CLIENTE_REMOVER(0, "Remover CLIENTE"),
	PRODUTO_REMOVER(0, "Remover PRODUTO"),
	FUNCIONARIO_REMOVER(0, "Remover FUNCIONARIO"),
	FORNECEDOR_REMOVER(0, "Remover FORNECEDOR");

	private Integer code;

	private String acao;
	
	/*private JFrame pagina;*/
	
	Acesso(Integer codeInteger, String acaoString) {
		this.code = codeInteger;
		this.acao = acaoString;
				
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}




}