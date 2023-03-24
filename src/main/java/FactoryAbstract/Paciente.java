package FactoryAbstract;

public class Paciente {

        private Exame exame;
        private ReceitaMedica receita;

        public Paciente(FabricaAbstrata fabricaAbstrata) {
                this.exame = fabricaAbstrata.solicitarExame();
                this.receita = fabricaAbstrata.solicitarReceita();
        }

        public String realizarExame() {
                return this.exame.emitir();
        }

        public String receberReceita() {
                return this.receita.emitir();
        }
}
