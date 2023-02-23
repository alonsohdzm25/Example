
package example.view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author alons
 */
public class Example extends JFrame {
    
    private JLabel label;
    private JTextField txtNombre;
    private JButton btnMostrar, btnSalir;
    
    public Example() {
        super();
        configurarVentana();
        inicializarComponentes();
    }
    
    private void configurarVentana() {
        this.setTitle("Ventana");
        this.setSize(310, 250);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void inicializarComponentes(){
        label = new JLabel();
        txtNombre = new JTextField();
        btnMostrar = new JButton();
        btnSalir = new JButton();
        
        label.setText("Nombre");
        label.setBounds(50,50, 50, 25);
        
        txtNombre.setBounds(100,50,150,25);
        
        btnMostrar.setText("Mostrar Mensaje");
        btnMostrar.setBounds(50, 100, 200, 30);
        btnMostrar.addActionListener(evt -> {
            this.btnMostrarAction(evt);
        });
        
        btnSalir.setText("Salir");
        btnSalir.setBounds(50, 140, 200, 30);
        btnSalir.addActionListener(evt -> {
            this.btnSalirAction(evt);
        });
        
        this.add(label); 
        this.add(txtNombre);
        this.add(btnMostrar);
        this.add(btnSalir);
        
        
    }
    
    public void btnMostrarAction(java.awt.event.ActionEvent evt) {
        String nombre = txtNombre.getText();

        if(!nombre.trim().isEmpty())
            JOptionPane.showMessageDialog(this, "Hola " + nombre + ", bienvenido.");
        else 
            JOptionPane.showMessageDialog(this, "Por favor ingrese su nombre!");
    }
    
    public void btnSalirAction(java.awt.event.ActionEvent evt) {
        int x;
        x = JOptionPane.showConfirmDialog(rootPane, "Esta seguro?");
        if (x == 0) this.dispose();
        else System.out.println("Operacion Cancelada");
    }
    
}
