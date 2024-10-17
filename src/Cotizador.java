import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Cotizador extends JFrame {
    private JPanel JPCotizador;
    private JList JLIDestinos;
    private JLabel JLTitulo;
    private JLabel JLDestinos;
    private JList<Integer> JLIDias;
    private JLabel JLDias;
    private JRadioButton JRTargeta;
    private JRadioButton JRMensualidades;
    private JLabel JLHabitacion;
    private JLabel JLPagos;
    private JCheckBox JCSencilla;
    private JCheckBox JCDoble;
    private JCheckBox JCSuite;
    private JButton JBCotizar;
    private JButton JBVisualizar;
    private JButton JBLimpiar;
    private JButton JBAtras;
    private JLabel JLSubtotal;
    private JLabel JLMensaje;

    float subtotal = 0;

    public Cotizador(LinkedList<Usuario> usuarios, FRMIngreso frmIngreso) {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPCotizador);
        setSize(600, 800);

        JLMensaje.setText("Subtotal: $" + subtotal);

        JBAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPCotizador.setVisible(false);
                frmIngreso.setVisible(true);
            }
        });

    }

    private void destino() {
        if (JLIDestinos.isSelectedIndex(1)) {
            subtotal += subtotal * 0.25;
        } else if (JLIDestinos.isSelectedIndex(2)) {
            subtotal += subtotal * 0.30;
        } else if (JLIDestinos.isSelectedIndex(3)) {
            subtotal += subtotal * 0.35;
        } else if (JLIDestinos.isSelectedIndex(4)) {
            subtotal += subtotal * 0.40;
        } else {
            subtotal += subtotal * 0.45;
        }

    }

    private void dias(){
        subtotal= subtotal*JLIDias.getSelectedValue();
    }

    private void habitacion(){
        
    }
}
