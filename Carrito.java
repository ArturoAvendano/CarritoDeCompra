import java.util.Random;

public class Carrito {

    Random numeroAleatorio = new Random();

    private int cantidadDeProductosDistintos = numeroAleatorio.nextInt(21) + 1;  // Entre 0 y 5, más 1.
    private int[] valorDeProductos = new int[cantidadDeProductosDistintos];


    public int [] valorCarrito = new int[valorDeProductos.length];

    public Carrito(int[] _valorDeProductos) {
        this.valorDeProductos = _valorDeProductos;
    }

    public int[] getValorDeProductos() {
        return valorDeProductos;
    }

    public void setValorDeProductos(int[] valorDeProductos) {
        this.valorDeProductos = valorDeProductos;
    }

    public int[] getValorCarrito() {
        return valorCarrito;
    }

    public void setValorCarrito(int[] valorCarrito) {
        this.valorCarrito = valorCarrito;
    }

    public void crearCarrito(int[] valorDeProductos){ //METODO 1
        Random numeroAleatorio = new Random();
        
        for(int i=0; i< valorDeProductos.length-1; i++){
            int cantidadDeProductos = numeroAleatorio.nextInt(15)+1;
            valorDeProductos[i]=cantidadDeProductos;
        }
    }

    public void mostrarCarrito(int[] valorDeProductos){ //METODO 2
        int totalDeProductos=0;
        for(int i=0; i< valorDeProductos.length-1; i++){
            totalDeProductos=totalDeProductos+valorDeProductos[i];
        }
        System.out.println("La cantidad de productos en el carrito es:" + totalDeProductos);
    }

    public int cuentaCarrito(int[] valorDeProductos){ //METODO 3
        int valorInicialDelProducto=500;
        int totalValor=0;

        for(int i=0; i<valorDeProductos.length-1; i++){
            valorCarrito[i]=valorDeProductos[i]*valorInicialDelProducto;
            valorInicialDelProducto=valorInicialDelProducto+500;
            totalValor=totalValor+valorCarrito[i];
        }
        return totalValor;
    }

    public void mostrarDetalle(int[] valorDeProductos){ //METODO 4
        for(int i=0;i<valorDeProductos.length-1;i++) {
            System.out.println("Cantidad De Producto " + i + ":" + valorDeProductos[i] +", Subtotal es: " + valorCarrito[i]);
        }
        System.out.println("Total de compra: $" +cuentaCarrito(valorDeProductos));
    }

    public static void main(String[] args) {



            Random numeroAleatorio = new Random();

            int cantidadDeProductosDistintos = numeroAleatorio.nextInt(21) + 1;
            int[] valorDeProductos = new int[cantidadDeProductosDistintos];
            Carrito carrito = new Carrito(valorDeProductos);
            carrito.crearCarrito(valorDeProductos);
            carrito.mostrarCarrito(valorDeProductos);
            carrito.cuentaCarrito(valorDeProductos);
            carrito.mostrarDetalle(valorDeProductos);

    }
}
