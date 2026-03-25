/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;

/**
 *
 * @author rosam
 */
import modelo.Empleado;
import modelo.Gerente;
import controlador.NominaController;

public class Herencia830 {

    public static void main(String[] args) {
        System.out.println("aprendiendo herencia");
        NominaController control = new NominaController();
        
        //polimorfismo        
        control.registroEmpleados(new Empleado("Christian Villarreal",1000));
        control.registroEmpleados(new Gerente("Rosa Maria",5000,500));
        
        
        //listado de pagos
        System.out.println("== Listado de pagos ==");
        for(Empleado emp: control.obtenerLista()){
            //aqui es donde actua el polimorfismo: cada objeto sabe como calcular su pago.
            System.out.println("Nombre: "+ emp.getNombre());
            System.out.println("pago: $:"+emp.CalcularPago());
            System.out.println("-------------------------------");
            
            //sobrecarga
            
            System.out.println("=prueba de sobrecarga");
            Empleado busqueda1 = control.buscar("Christian Villarreal");
            Empleado busqueda2 = control.buscar(1);
            
            System.out.println("=prueba de sobrecarga busqueda por nombre: "+ (busqueda1 != null? busqueda1.getNombre(): "no existe"));
            System.out.println("=prueba de sobrecarga busqueda por indice   : "+ (busqueda2 != null? busqueda1.getNombre():" no existe"));
        }
        
    }
}
