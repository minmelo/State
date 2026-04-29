public class Ovo implements Estado {

    @Override
    public void mostrarComportamento() {
        System.out.println("Ovo: não tem pernas, asas, não anda, não come, não voa.");
    }

    @Override
    public void proximo(Borboleta contexto) {
        contexto.setEstado(new Larva());
    }
}