/**
 * Universidad del Valle de Guatemala
 * Proyecto Final POO
 * File: Main
 * @author Diana Díaz 21066
 * @author Sebastián Franco 21484
 * @author Juan Miguel González-Campo 21077
 * @author Mario Puente 21290
 * @author Sebastián Reyes 21139
 */

 /*imports */
import java.io.*;
import java.util.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusEvent;
import java.util.List;


/*clase main */
public class main  {

    public static Archivos Archivos = null;
    public int r = 0;
    public String p = "";
    public String r1 = "";
    public int preguntasNumero = 1;
    public int preguntasContestadas = 0;
    public int vidas = 3;
    public JTextField cajatextor = null;
    public JTextField cajanombre = null;
    public static preguntas pregunta = null;
    public static Puntaje puntaje = null;
    String filepath = "puntaje.csv";
    List<List<String>> llp = new ArrayList<>();
    JPanel panel = new JPanel();
    JFrame marco = new JFrame();
    /**
     * 
     */
    public main(Color color) throws IOException { ///Constructor

        BotonHome();
        BotonOpciones();
        BotonArchivos();
        BotonNiveles();
        CajasTexto();
        BotonEnviar();
        System.out.println(r1);
        System.out.println(r);
        puntaje = new Puntaje();
        
        marco = new JFrame();
        panel.setLayout(null);
        panel.setBackground(color);
        marco.add(panel);
        marco.setTitle("Juego de las Matematicas");
        marco.setSize(500, 500);
        marco.setResizable(true);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        
    }

    /*
    metodo para ordenar el leaderboard
     */
    public void csvCompare() throws IOException {
        String line = "";
        String csvSplitter = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            while ((line = br.readLine()) != null) {
                llp.add(Arrays.asList(line.split(csvSplitter)));
            }
            llp.sort(new Comparator<List<String>>() {
                @Override
                public int compare(List<String> o1, List<String> o2) {
                    return o1.get(1).compareTo(o2.get(1));
                }
            });
            Collections.reverse(llp);
            System.out.println(llp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*es el boton home */
    private void BotonHome(){
        JButton boton1 = new JButton("Home");
        boton1.setBounds(50, 30, 100, 40);
        panel.add(boton1);
        
        ActionListener clickHome = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String nombre = cajanombre.getText();
                    FileWriter fw = new FileWriter(filepath,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);
                    pw.println(nombre+","+puntaje.getPuntaje());
                    pw.flush();
                    pw.close();
                } catch(Exception E){
                    System.out.println("Ocurrio un error al guardar el puntaje.");
                }
                try {
                    new main(Color.BLUE);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            } 
        }; 

        boton1.addActionListener(clickHome);
    }
    

  
    /*es la caja de texto para las preguntas y respuestas */
    private void CajasTexto(){
        
        /*instanciar las preguntas */
        pregunta = new preguntas();
        /*si es suma */
        if (pregunta.getTipo() == 1) {
            p = pregunta.Suma();
            r = pregunta.Respuesta();
            /*si es resta */
        } if (pregunta.getTipo()== 2) {
            p = pregunta.Resta();
            r = pregunta.Respuesta();
        } if (pregunta.getTipo() == 3) {
            /*si es multiplicacion */
            p = pregunta.Multiplicacion();
            r = pregunta.Respuesta();
            /*si es division */
        } if (pregunta.getTipo()== 4){
            p = pregunta.Division();
            r1 = pregunta.RespuestaDiv();
        }

        /*un nuevo label para preguntas*/
        JLabel preguntaAqui = new JLabel("Pregunta "+preguntasNumero);
        preguntaAqui.setBounds(200, 200, 200, 40);
        preguntaAqui.setForeground(Color.WHITE);
        preguntaAqui.setFont(new Font("Verdana",Font.PLAIN,20));
        panel.add(preguntaAqui);


        JLabel preguntaLabel = new JLabel ("");
        preguntaLabel.setText(p);
        preguntaLabel.setBounds(220, 250, 200, 40);
        preguntaLabel.setForeground(Color.WHITE);
        preguntaLabel.setFont(new Font("Verdana",Font.PLAIN,20));
        panel.add(preguntaLabel);

        /*para ingresar respuesta */
        cajatextor = new JTextField("Ingrese su respuesta");
        cajatextor.setBounds(150, 300, 200, 40);
        panel.add(cajatextor);

        cajatextor.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                cajatextor.setText("");
            }
        });
    }

    /*para las opciones */
    private void BotonOpciones(){
        JButton boton2 = new JButton("Opciones");
        boton2.setBounds(150, 30, 100, 40);
        panel.add(boton2);
        ActionListener click1 = new ActionListener(){

            Opciones opciones = new Opciones();
            @Override
            public void actionPerformed(ActionEvent e) {
                opciones.Opciones(panel, marco);
                
            }
        };
        boton2.addActionListener(click1);
    }

    /*boton para los archivos */
    private void BotonArchivos(){
        
        JButton boton3 = new JButton("Recursos");
        boton3.setBounds(250, 30, 100, 40);
        panel.add(boton3);

        ActionListener click = new ActionListener(){

            Archivos Archivos = new Archivos();
            @Override
            public void actionPerformed(ActionEvent e) {
                Archivos.Archivos(panel, marco);
                
            }
        };

        boton3.addActionListener(click);
    }        

    /*boton para los niveles */
    private void BotonNiveles() throws IOException {
        csvCompare();
        String[] header = {"Nombre","Puntuacion"};
        JButton boton4 = new JButton("Puntajes");
        JLabel titulo = new JLabel("Bienvenido al juego");
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("cooper black",3,20));
        titulo.setBounds(155, 100, 300, 80);
        boton4.setBounds(350, 30, 100, 40);
        panel.add(boton4);
        panel.add(titulo);

        ActionListener clickNiveles = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                panel.repaint();
                JButton home = new JButton("Home");
                ActionListener clickHome = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        marco.setVisible(false);
                        String[] arguments = new String[] {};
                        try {
                            main.main(arguments);
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                };
                marco.setLayout(new BorderLayout());
                panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
                marco.setSize(500,200);
                marco.setLocationRelativeTo(null);
                marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                marco.setVisible(true);
                JTable table = new JTable();
                table.setModel(new ListTableModel<>(llp));
                for(int i=0;i<table.getColumnCount();i++)
                {
                    TableColumn column1 = table.getTableHeader().getColumnModel().getColumn(i);

                    column1.setHeaderValue(header[i]);
                }
                home.addActionListener(clickHome);
                panel.add(new JScrollPane(table));
                marco.add(panel,BorderLayout.CENTER);
                marco.add(home,BorderLayout.SOUTH);

            }
        };

        boton4.addActionListener(clickNiveles);

    }

    /*boton para enviar respuestas */
    private void BotonEnviar(){
        
        JButton boton5 = new JButton("Enviar");
        boton5.setBounds(50, 400, 100, 40);
        panel.add(boton5);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(cajatextor.getText());
                String res = "";

                int respuestadada = 0;
                /*por si hay un error */
                try{
                    respuestadada = Integer.parseInt(cajatextor.getText());
                } catch (Exception i){
                    res = cajatextor.getText();
                }
                if (pregunta.getTipo() == 4){
                    if (res.equals(r1)){
                        JOptionPane.showMessageDialog(null, "¡Respuesta Correcta!", ".", JOptionPane.INFORMATION_MESSAGE);
                        String nombre = cajanombre.getText();
                        panel.removeAll();
                        panel.repaint();
                        puntaje.setPuntaje(1);
                        preguntasContestadas = preguntasContestadas+1;
                        preguntasNumero = preguntasNumero+1;
                        BotonHome();
                        BotonOpciones();
                        BotonArchivos();
                        try {
                            BotonNiveles();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        CajasTexto();
                        BotonEnviar();  
                    } else {/*si la tiene mala  */
                        JOptionPane.showMessageDialog(null, "Respuesta Incorrecta", ".", JOptionPane.INFORMATION_MESSAGE);
                        panel.removeAll();
                        panel.repaint();
                        vidas = vidas-1;
                        /*si no  */
                        if (vidas < 1){
                            GameOver();
                            BotonHome();
                        } else {
                            BotonHome();
                            BotonOpciones();
                            BotonArchivos();
                            try {
                                BotonNiveles();
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                            CajasTexto();
                            BotonEnviar();
                        }
                    }
                } else {
                    if (respuestadada == r){
                        JOptionPane.showMessageDialog(null, "¡Respuesta Correcta!", ".", JOptionPane.INFORMATION_MESSAGE);
                        panel.removeAll();
                        panel.repaint();
                        puntaje.setPuntaje(1);
                        preguntasContestadas = preguntasContestadas+1;
                        preguntasNumero = preguntasNumero+1;
                        BotonHome();
                        BotonOpciones();
                        BotonArchivos();
                        try {
                            BotonNiveles();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        CajasTexto();
                        BotonEnviar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Respuesta Incorrecta", ".", JOptionPane.INFORMATION_MESSAGE);
                        panel.removeAll();
                        panel.repaint();
                        vidas = vidas-1;
                        if (vidas < 1){
                            GameOver();
                            BotonHome();
                        } else {
                            BotonHome();
                            BotonOpciones();
                            BotonArchivos();
                            try {
                                BotonNiveles();
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                            CajasTexto();
                            BotonEnviar();
                        }
                    }
                }
            }
        };
        boton5.addActionListener(actionListener);
               

    }

    

    /*caja de preguntas */
    private void CajaPreguntas(){
        JTextField cajatexto1 = new JTextField();
        panel.add(cajatexto1);
    }

    private JComponent getContentPane() {
        return null;
    }

    private void GameOver(){
        /*
        para ingresar nombre
         */
        cajanombre = new JTextField("Ingrese su nombre");
        cajanombre.setBounds(1,160,200,40);
        panel.add(cajanombre);

        cajanombre.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                cajanombre.setText("");
            }
        });

        JLabel GameOver = new JLabel("Perdiste:( tu puntaje fue de: "+ Integer.toString(puntaje.getPuntaje()));
        GameOver.setBounds(1, 200, 400, 40);
        GameOver.setForeground(Color.WHITE);
        GameOver.setFont(new Font("Verdana",Font.PLAIN,20));
        panel.add(GameOver);
    }


/**
 * main 
 * @param args
 */
public static void main(String[]args) throws IOException {
    new main(Opciones.getColor());
    }
}
