

package animales;

public class Leon {
    //mofique mi nombre a leon
    String nombre;
    String color;
    int edad;

    public Leon() {
    }

    public Leon(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Leon{" + "nombre=" + nombre + ", color=" + color + ", edad=" + edad + '}';
    }
    
}
