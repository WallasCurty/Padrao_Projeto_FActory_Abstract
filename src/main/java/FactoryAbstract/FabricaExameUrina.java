package FactoryAbstract;

public class FabricaExameUrina implements FabricaAbstrata{
    @Override
    public Exame solicitarExame(){;
        return new ExameUrina();
    }
    @Override
    public ReceitaMedica solicitarReceita() {
        return new ReceitaSimples();
    }
}
