package FactoryAbstract;

public class FabricaExameSangue implements FabricaAbstrata{

    @Override
    public Exame solicitarExame(){;
        return new ExameSangue();
    }


    @Override
    public ReceitaMedica solicitarReceita() {

        return new ReceitaControleEspecial();
    }
}
