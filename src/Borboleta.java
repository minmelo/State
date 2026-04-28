public class Borboleta {

    private Estado estado;

    public Borboleta() {
        this.estado = new Ovo();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void mostrarComportamento() {
        estado.mostrarComportamento();
    }

    public void proximoEstado() {
        estado.proximo(this);
    }

    public static void main(String[] args) {
        Borboleta b = new Borboleta();

        b.mostrarComportamento();
        b.proximoEstado();

        b.mostrarComportamento();
        b.proximoEstado();

        b.mostrarComportamento();
        b.proximoEstado();

        b.mostrarComportamento();
    }
}