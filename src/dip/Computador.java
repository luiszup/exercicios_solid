package dip;

public class Computador {
    DispositivoEntrada dispositivoEntrada;

    public void computador(DispositivoEntrada dispositivoEntrada) {
        this.dispositivoEntrada = dispositivoEntrada;
    }

    public void usarDispositivo() {
        dispositivoEntrada.usar();
    }
}
