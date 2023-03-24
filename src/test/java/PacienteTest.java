import FactoryAbstract.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacienteTest {
    @Test
    void deveRealizarExameSangue() {
        FabricaAbstrata fabrica = new FabricaExameSangue();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Exame de Sangue.", paciente.realizarExame());
    }

    @Test
    void deveRealizarExameUrina() {
        FabricaAbstrata fabrica = new FabricaExameUrina();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Exame de Urina.", paciente.realizarExame());
    }

    @Test
    void deveReceberReceitaControleEspecial() {
        FabricaAbstrata fabrica = new FabricaExameSangue();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Receita Controle Especial.", paciente.receberReceita());
    }

    @Test
    void deveReceberReceitaSimples() {
        FabricaAbstrata fabrica = new FabricaExameUrina();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Receita Simples.", paciente.receberReceita());
    }
}
