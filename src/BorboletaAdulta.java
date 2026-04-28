public class BorboletaAdulta implements Estado {

    @Override
    public void mostrarComportamento() {
        System.out.println("Borboleta: pode voar!");
    }

    @Override
    public void proximo(Borboleta contexto) {
        System.out.println("Já está na fase final.");
    }
}