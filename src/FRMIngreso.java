import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class FRMIngreso extends JFrame{
    private JPanel JPIngreso;
    private JTextField JTUsuario;
    private JPasswordField JTPContra;
    private JButton JBIngreso;
    private JButton JBRegistro;
    private JButton JBLimpiar;
    private JLabel JLTitulo;
    private JLabel JLUsuario;
    private JLabel JLContra;
    private JLabel JLMensaje;

    int contador=0,posision=0;
    LinkedList<Usuario> usuarios=new LinkedList<>();

    public FRMIngreso(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPIngreso);
        setSize(400,500);

        JTUsuario.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                limpiar();
            }
        });
        JTPContra.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                limpiar();
            }
        });

        JBIngreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                if (posible()==true && encontrar()==true){
                    //se habre pantalla
                    JLMensaje.setText("exito");
                }else if (usuarios.size()==0){JLMensaje.setText("Primero necesita registrarse");}
                else {JLMensaje.setText("Usuario inexistente");}

            }
        });

        JBRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                if (posible()==true && contador<6){
                    Usuario nuevo=new Usuario(JTUsuario.getText(),JTPContra.getText(),null);
                    usuarios.add(nuevo);
                    JLMensaje.setText("Registro hecho con exito");
                    contador++;
                }else if (contador== 6){
                    JLMensaje.setText("Ya no se pueden hacer mas registros");
                }
            }
        });
        JBLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
                JTUsuario.setText("");
                JTPContra.setText("");
            }
        });
    }

    public boolean posible(){
        boolean posible=false;
        if (!(JTUsuario.getText().trim().isEmpty() || JTPContra.getText().trim().isEmpty())){
            posible=true;
        }else {JLMensaje.setText("Ingrese todos los datos");}

        return posible;
    }

    public boolean encontrar(){
        int encontrado=0;
        boolean seEncontro=false;
        Usuario datos=new Usuario(JTUsuario.getText(),JTPContra.getText(),null);

        if (usuarios.size()!=0){
            for (Usuario u:usuarios) {
                if (u.getUsuario().equals(datos.getUsuario()) && u.getContra().equals(datos.getContra())) {
                    posision=encontrado;
                    seEncontro=true;
                }
                encontrado++;
            }
        }return seEncontro;}

    public void limpiar(){JLMensaje.setText("");}



}
