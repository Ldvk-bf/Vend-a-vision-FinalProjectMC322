package unicamp.ic.mc322.model;


import java.util.ArrayList;

public class Filial {

	private final Integer id = null;

	private Funcionario Dono;

	private String nome;

	private String endereco;

	private ArrayList<Cliente> listaClientes;

	private ArrayList<Funcionario> listaFuncionarios;

	private ArrayList<Fornecedor> listaFornecedor;

	private ArrayList<Produto> mostragem;

	private ArrayList<Produto> armazem;


	public Boolean addFuncionario(Funcionario objFuncionario) {
		return null;
	}

	public Venda gerarVenda() {
		return null;
	}

	public ArrayList<Funcionario> listarFuncionario() {
		return null;
	}

	public ArrayList<Cliente> listarClientes() {
		return null;
	}

	public ArrayList<Fornecedor> listarFornecedores() {
		return null;
	}

	public ArrayList<Produto> listarProdutos() {
		return null;
	}

	public ArrayList<Produto> listarProdutosArmazem() {
		return null;
	}

	public ArrayList<Produto> listarProdutosMostragem() {
		return null;
	}

	public ArrayList<Venda> listarVendas() {
		return null;
	}

	public Funcionario funcionarioDoMes(String mes) {
		return null;
	}

	public Double gerarFaturamento() {
		return null;
	}

	public Double gerarFaturamentoMensal(String mes) {
		return null;
	}

	public Cliente clientePremiadoCNPJ(String mes) {
		return null;
	}

	public Cliente clientePremiadoCPF(String mes) {
		return null;
	}

	public Funcionario getDono() {
		return Dono;
	}

	public void setDono(Funcionario dono) {
		Dono = dono;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}

	public ArrayList<Fornecedor> getListaFornecedor() {
		return listaFornecedor;
	}

	public void setListaFornecedor(ArrayList<Fornecedor> listaFornecedor) {
		this.listaFornecedor = listaFornecedor;
	}

	public ArrayList<Produto> getMostragem() {
		return mostragem;
	}

	public void setMostragem(ArrayList<Produto> mostragem) {
		this.mostragem = mostragem;
	}

	public ArrayList<Produto> getArmazem() {
		return armazem;
	}

	public void setArmazem(ArrayList<Produto> armazem) {
		this.armazem = armazem;
	}

	public Integer getId() {
		return id;
	}

}