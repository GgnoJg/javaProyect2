//DECLARACIÓN DEL PAQUETE
package view;//Organizar el código en un paquete para la capa de interfaz de usuario
/*
 Sigue el patrón modelo-vista-controlado al estar en el paquete view, "package" palabra clave para declarar el paquete,
"view" nombre del paquete que indica que contiene componentes de la interfaz visual
*/

//IMPORTACION
import javax.swing.JOptionPane;//Importar la funcionalidad para crear ventanas de diálogo"javax.swing.JOptionPane",
/*
 "import" Palabra clave para incluir clases externas,
   javax.swing: Paquete que contiene componentes gráficos de Java
    JOptionPane: Clase para crear ventanas de diálogo simples
*/
//DECLARACION DE LA CLASE
public class viewCalculadora {
 public static void main(String[] args) { /* "public" Accesible para la JVM, "static" Método de clase, no requiere instancia
             "void" no retorna ningún valor, "main" Nombre del método principal  */
        JOptionPane.showMessageDialog(null, "mensaje practica 2");// ventana de dialoggo, muestra un mensaje inicial al usuariio
        //Usa la clase importada y es ejecutado por el método main 
    }
    
}
