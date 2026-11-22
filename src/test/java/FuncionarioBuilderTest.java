import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioBuilderTest {
    @Test
    void deveRetornarExcecaoParaFuncionarioSemId() {
        try {
            FuncionarioBuilder builder = new FuncionarioBuilder();
            Funcionario funcionario = builder
                    .setNome("João Silva")
                    .setEmail("joao@empresa.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("ID do funcionário inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemNome() {
        try {
            FuncionarioBuilder builder = new FuncionarioBuilder();
            Funcionario funcionario = builder
                    .setId(100)
                    .setEmail("joao@empresa.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome do funcionário inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaSalarioNegativo() {
        try {
            FuncionarioBuilder builder = new FuncionarioBuilder();
            Funcionario funcionario = builder
                    .setId(100)
                    .setNome("João Silva")
                    .setSalario(-500)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Salário não pode ser negativo", e.getMessage());
        }
    }

    @Test
    void deveRetornarFuncionarioValido() {
        FuncionarioBuilder builder = new FuncionarioBuilder();
        Funcionario funcionario = builder
                .setId(100)
                .setNome("João Silva")
                .setEmail("joao@empresa.com")
                .setSalario(3500)
                .build();

        assertNotNull(funcionario);
    }
}
