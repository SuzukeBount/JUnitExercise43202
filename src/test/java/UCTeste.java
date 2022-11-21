import org.example.Nota;
import org.example.UC;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class UCTeste {
    static UC uc;

    @BeforeAll
    public static void UC(){
        ArrayList<Nota> notas = new ArrayList<>();
        notas.add(new Nota(43202, 18));
        notas.add(new Nota(43101, 15));
        notas.add(new Nota(20, 7));
        uc = new UC("LAM", notas, notas.size());
    }

    @DisplayName("Inserir nota Teste")
    @ParameterizedTest
    @CsvSource(value = {"10, 16", "11, 20", "40, 40"})
    public void inserirNotaTest(int arg, int arg2){
        assertTrue(uc.insereNotaUC(arg,arg2), "NOTA INVÁLIDA");
    }

    @DisplayName("Pesquisar Aluno")
    @ParameterizedTest
    @ValueSource(ints = {20, 40, 50, 43202, 43101})
    public void pesquisarAlunoTest(int arg){
        assertTrue(uc.pesquisaAluno(arg), "ALUNO NAO EXISTE");
    }

    @DisplayName("MEDIA")
    @Test
    public void media(){
        assertEquals(16.5, uc.media(), "MEDIA ERRADA");
    }

    @DisplayName("APROVADO")
    @ParameterizedTest
    @ValueSource(ints = {20, 30, 40, 43202, 43101})
    public void aprovado(int arg) {
        assertTrue(uc.aprovado(arg), "ALUNO NAO APROVADO");
    }
}
