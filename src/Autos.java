public class Autos extends Vehiculo {
    private int numPuertas;
    public Autos(){

    }

    public Autos(String marca, String modelo, int año, double precioBase, int numPuertas) {
        super(marca, modelo, año, precioBase);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+ "Autos{" +
                "numPuertas=" + numPuertas +
                '}';
    }
}
