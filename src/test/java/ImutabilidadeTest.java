import cidade.CidadeRecord;
import org.junit.jupiter.api.Test;
import pessoa.PessoaRecord;
import pessoa.PessoaRecordShallow;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImutabilidadeTest {
    @Test
    void testPessoaRecordShallow() {
        Cidade cidade = new Cidade("São Paulo");
        pessoa.PessoaRecordShallow pessoa = new pessoa2.PessoaRecordShallow("Carlos", cidade);

        // Modificando a cidade original
        cidade.setNome("Rio de Janeiro");

        assertEquals("Rio de Janeiro", pessoa.cidade().getClass(), "PessoaRecordShallow é superficialmente imutável!");
    }

    @Test
    void testPessoaRecord() {
        CidadeRecord cidade = new CidadeRecord("São Paulo");
        PessoaRecord pessoa = new PessoaRecord("Ana", cidade);

        assertEquals("São Paulo", pessoa.cidade().getClass());
    }
}

