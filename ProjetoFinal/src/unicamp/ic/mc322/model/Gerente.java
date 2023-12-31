package unicamp.ic.mc322.model;

import java.util.ArrayList;

public class Gerente extends Funcionario {

    private ArrayList<Venda> listaFuncionario = new ArrayList<>();

    public Gerente(String cpfString, String nomeString, String emailString,
            String telefoneString, String enderecoString, String senha, Filial objFilial,
            ArrayList<Venda> listaFuncionario) {
        super(cpfString, nomeString, emailString, telefoneString, enderecoString, senha, objFilial);
    }

    public ArrayList<Venda> listarFuncionario() {
        return listaFuncionario;
    }

    @Override
    public Double pontuacao() {
        throw new UnsupportedOperationException("Unimplemented method 'pontuacao'");
    }

}
