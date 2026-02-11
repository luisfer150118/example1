public class Almacen {
    private Producto[][] matriz;

    public Almacen(Producto[][] matriz) {
        this.matriz = matriz;
    }

    public String buscarProducto(String nombreBuscado){
            for(int i=0; i< matriz.length ;i++){
                for(int j = 0; j < matriz[i].length ; j++){
                    if (matriz[i][j].getNombre().equalsIgnoreCase(nombreBuscado)) {
                        return "Producto en la posicion: (" + i +"," + j +")";

                    }    
                }
            }

        return "PRODUCTO SINCRONIAZDO NO ENCONTRADO";

    }



    
}
