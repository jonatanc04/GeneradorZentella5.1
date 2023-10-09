import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeneradorZentella extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JCheckBox buffDelLocalCheckBox;
    private JButton generarPartidoButton;
    private JLabel amarillasT;
    private JLabel amarillasL;
    private JLabel amarillasV;
    private JLabel rojasDir;
    private JLabel golesLoc;
    private JLabel golesVis;
    private JLabel redcadFor;
    private JLabel goalFor;
    private JButton playerGen;
    private JButton aleatoryNum;
    private JLabel resultF;
    private JLabel typeGoal;
    private JLabel asistente;
    private JRadioButton dos;
    private JRadioButton tres;
    private JRadioButton cuatro;
    private JRadioButton cinco;
    private JRadioButton once;
    private JLabel mostrarLesion;
    private JButton limpiarButton;
    private JLabel check;
    private JButton asigAmarillas;
    private JLabel playerAsig;

    int[] amarillas;
    int rojaDirecta;
    int rojaFor;
    int lesiones;
    String lesionFor;

    String localMedia, visitMedia;
    float local, visit;
    boolean buff;

    int[] resultado;
    int golesL, golesV;

    public GeneradorZentella() {
        setContentPane(panel1);
        once.doClick();

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                amarillasT.setText("0");
                amarillasL.setText("0");
                amarillasV.setText("0");
                rojasDir.setText("0");
                redcadFor.setText("---");
                golesLoc.setText("0");
                golesVis.setText("0");
                mostrarLesion.setText("---");

                check.setText("---");

            }
        });

        generarPartidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                localMedia = textField1.getText();
                visitMedia = textField2.getText();

                lesionFor = "---";

                local = Float.parseFloat(localMedia);
                visit = Float.parseFloat(visitMedia);

                buff = buffDelLocalCheckBox.isSelected();

                amarillas = Tool.ruletaAmarillas();
                rojaDirecta = Tool.ruletaRojas();

                if (rojaDirecta == 1) {
                    rojaFor = Tool.asignarRoja();
                } else {
                    rojaFor = 3;
                }

                if (amarillas[0] > 0 || rojaDirecta == 1) {
                    lesiones = Tool.ruletaLesiones();
                    if (lesiones == 1) {
                        lesionFor = Tool.asignarLesiones(amarillas, rojaFor);
                    } else {
                        lesionFor = "---";
                    }
                }

                resultado = Generador.generarPartido(local, visit, buff, rojaFor);
                golesL = resultado[0];
                golesV = resultado[1];

                amarillasT.setText(String.valueOf(amarillas[0]));
                amarillasL.setText(String.valueOf(amarillas[1]));
                amarillasV.setText(String.valueOf(amarillas[2]));
                rojasDir.setText(String.valueOf(rojaDirecta));
                mostrarLesion.setText(lesionFor);

                if (rojaFor == 0) {
                    redcadFor.setText("Roja para Local");
                } else if (rojaFor == 1) {
                    redcadFor.setText("Roja para Visitante");
                } else if (rojaFor == 2){
                    redcadFor.setText("Roja para ambos");
                } else {
                    redcadFor.setText("---");
                }

                golesLoc.setText(String.valueOf(golesL));
                golesVis.setText(String.valueOf(golesV));

                if (check.getText().equalsIgnoreCase("---")) {
                    check.setText("Gen!");
                }

            }

        });

        playerGen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] aux = Tool.ruletaJugadores();
                goalFor.setText(aux[0]);
                typeGoal.setText(aux[1]);
                asistente.setText(aux[2]);
                if (!typeGoal.getText().equalsIgnoreCase("normal") &&
                !typeGoal.getText().equalsIgnoreCase("corner")) {
                    asistente.setText("---");
                }
            }
        });

        aleatoryNum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int aux = 0;
                if (dos.isSelected()) {
                    aux = 2;
                } else if (tres.isSelected()) {
                    aux = 3;
                } else if (cuatro.isSelected()) {
                    aux = 4;
                } else if (cinco.isSelected()) {
                    aux = 5;
                } else if (once.isSelected()) {
                    aux = 11;
                }
                resultF.setText(String.valueOf(Tool.numeroAleatorio(aux)));
            }
        });

        asigAmarillas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerAsig.setText(Tool.asignarAmarillas());
            }
        });

    }

}
