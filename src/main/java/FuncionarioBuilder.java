import java.util.Date;

public class FuncionarioBuilder {
    private Funcionario funcionario;

    public FuncionarioBuilder() {
        funcionario = new Funcionario();
    }

    public Funcionario build() {
        // validações simples semelhantes ao exemplo do professor
        if (funcionario.getId() == 0) {
            throw new IllegalArgumentException("ID do funcionário inválido");
        }
        if (funcionario.getNome() == null || funcionario.getNome().trim().equals("")) {
            throw new IllegalArgumentException("Nome do funcionário inválido");
        }
        if (funcionario.getSalario() < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo");
        }
        return funcionario;
    }

    public FuncionarioBuilder setId(int id) {
        funcionario.setId(id);
        return this;
    }

    public FuncionarioBuilder setNome(String nome) {
        funcionario.setNome(nome);
        return this;
    }

    public FuncionarioBuilder setDataAdmissao(Date dataAdmissao) {
        funcionario.setDataAdmissao(dataAdmissao);
        return this;
    }

    public FuncionarioBuilder setCpf(String cpf) {
        funcionario.setCpf(cpf);
        return this;
    }

    public FuncionarioBuilder setRg(String rg) {
        funcionario.setRg(rg);
        return this;
    }

    public FuncionarioBuilder setCargo(String cargo) {
        funcionario.setCargo(cargo);
        return this;
    }

    public FuncionarioBuilder setSalario(double salario) {
        funcionario.setSalario(salario);
        return this;
    }

    public FuncionarioBuilder setDepartamento(String departamento) {
        funcionario.setDepartamento(departamento);
        return this;
    }

    public FuncionarioBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        funcionario.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public FuncionarioBuilder setEnderecoNumero(int enderecoNumero) {
        funcionario.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public FuncionarioBuilder setEnderecoComplemento(String enderecoComplemento) {
        funcionario.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public FuncionarioBuilder setEnderecoBairro(String enderecoBairro) {
        funcionario.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public FuncionarioBuilder setEnderecoCidade(String enderecoCidade) {
        funcionario.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public FuncionarioBuilder setEnderecoUF(String enderecoUF) {
        funcionario.setEnderecoUF(enderecoUF);
        return this;
    }

    public FuncionarioBuilder setCep(String cep) {
        funcionario.setCep(cep);
        return this;
    }

    public FuncionarioBuilder setEmail(String email) {
        funcionario.setEmail(email);
        return this;
    }

    public FuncionarioBuilder setTelefone(String telefone) {
        funcionario.setTelefone(telefone);
        return this;
    }
}
