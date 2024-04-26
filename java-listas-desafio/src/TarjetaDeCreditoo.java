import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCreditoo {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompra;

    //Constructor
    public TarjetaDeCreditoo(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompra = new ArrayList<>();
    }

    public boolean lanzarCompra(Compra compra){
        if (this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompra.add(compra);
            return true;
        }
        return false;
    }

    //Getters
    public double getLimite() {
        return limite;
    }public List<Compra> getListaDeCompra() {
        return listaDeCompra;
    }public double getSaldo() {
        return saldo;
    }
}