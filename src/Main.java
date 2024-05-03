import java.io.File;
public class Main {
    public static void main(String[] args) {
        String rutaPrincipal = "C:\\Users\\Carlos";
        funciones.renombrarCarpetas(rutaPrincipal);
        funciones.renombrarArchivos(rutaPrincipal + "/IMGS");
        funciones.renombrarArchivos(rutaPrincipal + "/PELIS");
    }
}