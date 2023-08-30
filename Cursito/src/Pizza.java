public class Pizza {

    private String nombre, topping, salsa;
    private boolean extraQueso;

    Pizza(String nombre) {
        this.nombre = nombre;
    }
    Pizza(String nombre, String topping) {
        this(nombre);
        this.topping = topping;
    }
    Pizza(String nombre, String topping, String salsa) {
        this(nombre, topping);
        this.salsa = salsa;
    }
    Pizza(String nombre, String topping, String salsa, boolean extraQueso) {
        this(nombre, topping, salsa);
        this.extraQueso = extraQueso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    @Override
    public String toString() {
        return "Pizza{" + "nombre = " + nombre + ", topping = " + topping + ", salsa = " + salsa + ", extraQueso = " + extraQueso + '}';
    }





}
