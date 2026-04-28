public class Larva implements Estado {

    @Override
    public void mostrarComportamento() {
        System.out.println("Larva: cresce, troca de pele, não tem asas, não voa.");
    }

    @Override
    public void proximo(Borboleta contexto) {
        contexto.setEstado(new Pupa());
    }
}