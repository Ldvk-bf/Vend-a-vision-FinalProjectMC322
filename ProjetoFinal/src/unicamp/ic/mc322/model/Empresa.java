package unicamp.ic.mc322.model;

import java.util.ArrayList;
import java.util.Collection;

public class Empresa {

	private String cnpj;

	private String nome;

	private ArrayList<Filial> listaFiliais;

	private Collection<Cliente> cliente;

	private Collection<Filial> filial;


	public Boolean criarFilial(Filial objFilial) {
		return null;
	}

	/**
	 *  
	 */
	public void excluirFilial() {

	}

	public ArrayList<Cliente> listarClientes() {
		return null;
	}

	public ArrayList<Filial> listarFiliais() {
		return null;
	}

	public ArrayList<Funcionario> listarFuncionarios() {
		return null;
	}

	public ArrayList<Venda> listarVendas() {
		return null;
	}

	public ArrayList<Fornecedor> listarFornecedores() {
		return null;
	}

	public ArrayList<Produto> listarProdutos() {
		return null;
	}

	public Double gerarFaturarmento() {
		return null;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Filial> getListaFiliais() {
		return listaFiliais;
	}

	public void setListaFiliais(ArrayList<Filial> listaFiliais) {
		this.listaFiliais = listaFiliais;
	}

	public Collection<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(Collection<Cliente> cliente) {
		this.cliente = cliente;
	}

	public Collection<Filial> getFilial() {
		return filial;
	}

	public void setFilial(Collection<Filial> filial) {
		this.filial = filial;
	}

}
