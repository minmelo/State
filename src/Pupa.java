public class Pupa implements Estado {

    @Override
    public void mostrarComportamento() {
        System.out.println("Pupa: está em metamorfose, transformando o corpo.");
    }

    @Override
    public void proximo(Borboleta contexto) {
        contexto.setEstado(new BorboletaAdulta());
    }
}