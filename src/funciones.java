import java.io.File;
public class funciones {
    public static void renombrarCarpetas(String rutaPrincipal) {
        File documentos = new File(rutaPrincipal + "\\Documentos");
        File imagenes = new File(rutaPrincipal + "\\Imágenes");
        File peliculas = new File(rutaPrincipal + "\\Vídeos");
        if (documentos.exists()) {
            documentos.renameTo(new File(rutaPrincipal + "\\DOCS"));
        }

        if (imagenes.exists()) {
            imagenes.renameTo(new File(rutaPrincipal + "\\IMGS"));
        }

        if (peliculas.exists()) {
            peliculas.renameTo(new File(rutaPrincipal + "\\PELIS"));
        }
    }

    public static void renombrarArchivos(String ruta) {
        File directorio = new File(ruta);
        File[] archivos = directorio.listFiles();

        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile()) {
                    String nombre = archivo.getName();
                    int puntoIndex = nombre.lastIndexOf('.');
                    if (puntoIndex > 0) {
                        String nuevoNombre = nombre.substring(0, puntoIndex);
                        archivo.renameTo(new File(ruta + "/" + nuevoNombre));
                    }
                }
            }
        }
    }
}
