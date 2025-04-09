public class Motocicletas extends Vehiculo {
    private double cilindraje;
    public Motocicletas(){

    }

    public Motocicletas(String marca, String modelo, int año, double precioBase, double cilindraje) {
        super(marca, modelo, año, precioBase);
        this.cilindraje = cilindraje;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return super.toString()+  "Motocicletas{" +
                "cilindraje=" + cilindraje +
                '}';
    }
}
