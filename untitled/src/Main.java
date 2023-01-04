public class Main {
    /* miCoche */
    private String nombre;
    private int puertas;

    // agregar puerta
    public int getNombre()
    {
        return puertas;
    }

    public static void main(String[] args) {
        int param1 = 50; // 4 bytes
        int param2 = 30; // 4 bytes

        var valor = suma(param1, param2);

        System.out.println(valor);

  }
  public static int suma(int a, int b){
        return a + b;
  }

    public int getPuertas() {
        return puertas;
    }
}

class Coche {
    public int puertas = 4;

    public void PonerPuerta() {
        this.puertas++;

    System.out.println(puertas);
    }
}