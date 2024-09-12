
package Controlador;

import Modelo.ModeloHabitaciones;
import Vista.VistaHabitaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorHabitaciones implements ActionListener{
    
    private VistaHabitaciones viewhabit;
    private ModeloHabitaciones modelhabit;
    
    public ControladorHabitaciones(VistaHabitaciones viewhabit, ModeloHabitaciones modelhabit)
    {
        this.viewhabit = viewhabit;
        this.modelhabit = modelhabit;
        this.viewhabit.btnGuardar.addActionListener(this);
    }
    
    public void iniciar()
    {
        viewhabit.setTitle("Registro de Habitacion");
        viewhabit.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
    }
    
}
