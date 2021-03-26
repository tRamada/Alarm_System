/*
    Autor: Tiago Ramada
    Turma: PI0919
    Programa: Sistema de alarmística
*/

// Bibliotecas
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;
import javax.imageio.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Locale;

// Painel de Ligar e Desligar
class PainelOnOff extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1l;

    JLabel lb;
    JButton bt;
    ImageIcon on, off;
    Boolean status = false;

    public PainelOnOff() {
        setLayout(null);
        off = new ImageIcon("images/Bt_OFF.png");
        on = new ImageIcon("images/Bt_ON.png");
        bt = new JButton();
        bt.setIcon(off);
        bt.addActionListener(this);
        bt.setContentAreaFilled(false);
        bt.setBorderPainted(false);
        bt.setFocusPainted(false);
        bt.setBounds(115, 40, 50, 30);
        add(bt);
    } // End Painel

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt) {
            if (status) {
                bt.setIcon(off);
                Demo.offBool = false;
                status = false;
            } else {
                bt.setIcon(on);
                status = true;
                Demo.offBool = true;
            }
        } // End If
    }// End actionPerfomed
}// End Class Painel

// Painel Cozinha
class Painel extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1l;

    JLabel lb;
    JButton bt;
    ImageIcon on, off;
    Boolean status = false;

    public Painel() {
        setLayout(null);
        off = new ImageIcon("images/Bt_OFF.png");
        on = new ImageIcon("images/Bt_ON.png");
        bt = new JButton();
        bt.setIcon(off);
        bt.addActionListener(this);
        bt.setContentAreaFilled(false);
        bt.setBorderPainted(false);
        bt.setFocusPainted(false);
        bt.setBounds(115, 40, 50, 30);
        add(bt);
    } // End Painel

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt && Demo.offBool == true) {
            if (status) {
                bt.setIcon(off);
                status = false;
                Grafico1.corCozinha = new Color(252, 68, 68);
                Demo.grafico1.repaint();
            } else {
                bt.setIcon(on);
                status = true;
                Grafico1.corCozinha = Color.green;
                Demo.grafico1.repaint();
                
                Demo.trialTime = new Date();
                Demo.cal.setTime(Demo.trialTime);
                Demo.data[Demo.linha][0] = Demo.linha;
                Demo.data[Demo.linha][1] = "Cozinha";
                Demo.data[Demo.linha][2] = Demo.cal.get(Calendar.HOUR_OF_DAY);
                Demo.data[Demo.linha][3] = Demo.cal.get(Calendar.MINUTE);
                Demo.data[Demo.linha][4] = Demo.cal.get(Calendar.DAY_OF_MONTH);
                Demo.data[Demo.linha][5] = Demo.mes;
                Demo.data[Demo.linha][6] = Demo.cal.get(Calendar.YEAR);
                Demo.linha++;
            }
        } // End If
    }// End actionPerfomed
}// End Class Painel

// Painel Escritório
class Painel2 extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1l;

    JLabel lb;
    JButton bt;
    ImageIcon on, off;
    Boolean status = false;

    public Painel2() {
        setLayout(null);
        off = new ImageIcon("images/Bt_OFF.png");
        on = new ImageIcon("images/Bt_ON.png");
        bt = new JButton();
        bt.setIcon(off);
        bt.addActionListener(this);
        bt.setContentAreaFilled(false);
        bt.setBorderPainted(false);
        bt.setFocusPainted(false);
        bt.setBounds(115, 40, 50, 30);
        add(bt);
    } // End Painel

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt && Demo.offBool == true) {
            if (status) {
                bt.setIcon(off);
                status = false;
                Grafico1.corEscritorio = new Color(252, 68, 68);
                ;
                Demo.grafico1.repaint();
            } else {
                bt.setIcon(on);
                status = true;
                Grafico1.corEscritorio = Color.green;
                Demo.grafico1.repaint();

                Demo.trialTime = new Date();
                Demo.cal.setTime(Demo.trialTime);
                Demo.data[Demo.linha][0] = Demo.linha;
                Demo.data[Demo.linha][1] = "Escritório";
                Demo.data[Demo.linha][2] = Demo.cal.get(Calendar.HOUR_OF_DAY);
                Demo.data[Demo.linha][3] = Demo.cal.get(Calendar.MINUTE);
                Demo.data[Demo.linha][4] = Demo.cal.get(Calendar.DAY_OF_MONTH);
                Demo.data[Demo.linha][5] = Demo.mes;
                Demo.data[Demo.linha][6] = Demo.cal.get(Calendar.YEAR);
                Demo.linha++;
            }
        } // End If
    }// End actionPerfomed
}// End Class Painel

// Painel Quarto
class Painel3 extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1l;

    JLabel lb;
    JButton bt;
    ImageIcon on, off;
    Boolean status = false;

    public Painel3() {
        setLayout(null);
        off = new ImageIcon("images/Bt_OFF.png");
        on = new ImageIcon("images/Bt_ON.png");
        bt = new JButton();
        bt.setIcon(off);
        bt.addActionListener(this);
        bt.setContentAreaFilled(false);
        bt.setBorderPainted(false);
        bt.setFocusPainted(false);
        bt.setBounds(115, 40, 50, 30);
        add(bt);
    } // End Painel

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt && Demo.offBool == true) {
            if (status) {
                bt.setIcon(off);
                status = false;
                Grafico1.corQuarto = new Color(252, 68, 68);
                ;
                Demo.grafico1.repaint();
            } else {
                bt.setIcon(on);
                status = true;
                Grafico1.corQuarto = Color.green;
                Demo.grafico1.repaint();

                Demo.trialTime = new Date();
                Demo.cal.setTime(Demo.trialTime);
                Demo.data[Demo.linha][0] = Demo.linha;
                Demo.data[Demo.linha][1] = "Quartos";
                Demo.data[Demo.linha][2] = Demo.cal.get(Calendar.HOUR_OF_DAY);
                Demo.data[Demo.linha][3] = Demo.cal.get(Calendar.MINUTE);
                Demo.data[Demo.linha][4] = Demo.cal.get(Calendar.DAY_OF_MONTH);
                Demo.data[Demo.linha][5] = Demo.mes;
                Demo.data[Demo.linha][6] = Demo.cal.get(Calendar.YEAR);
                Demo.linha++;
            }
        } // End If
    }// End actionPerfomed
}// End Class Painel

// Painel Sala
class Painel4 extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1l;

    JLabel lb;
    JButton bt;
    ImageIcon on, off;
    Boolean status = false;

    public Painel4() {
        setLayout(null);
        off = new ImageIcon("images/Bt_OFF.png");
        on = new ImageIcon("images/Bt_ON.png");
        bt = new JButton();
        bt.setIcon(off);
        bt.addActionListener(this);
        bt.setContentAreaFilled(false);
        bt.setBorderPainted(false);
        bt.setFocusPainted(false);
        bt.setBounds(115, 40, 50, 30);
        add(bt);
    } // End Painel

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt && Demo.offBool == true) {
            if (status) {
                bt.setIcon(off);
                status = false;
                Grafico1.corSala = new Color(252, 68, 68);
                Demo.grafico1.repaint();
            } else {
                bt.setIcon(on);
                status = true;
                Grafico1.corSala = Color.green;
                Demo.grafico1.repaint();

                Demo.trialTime = new Date();
                Demo.cal.setTime(Demo.trialTime);
                Demo.data[Demo.linha][0] = Demo.linha;
                Demo.data[Demo.linha][1] = "Salas";
                Demo.data[Demo.linha][2] = Demo.cal.get(Calendar.HOUR_OF_DAY);
                Demo.data[Demo.linha][3] = Demo.cal.get(Calendar.MINUTE);
                Demo.data[Demo.linha][4] = Demo.cal.get(Calendar.DAY_OF_MONTH);
                Demo.data[Demo.linha][5] = Demo.mes;
                Demo.data[Demo.linha][6] = Demo.cal.get(Calendar.YEAR);
                Demo.linha++;
            }
        } // End If
    }// End actionPerfomed
}// End Class Painel

// Painel WC's
class Painel5 extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1l;

    JLabel lb;
    JButton bt;
    ImageIcon on, off;
    Boolean status = false;

    public Painel5() {
        setLayout(null);
        off = new ImageIcon("images/Bt_OFF.png");
        on = new ImageIcon("images/Bt_ON.png");
        bt = new JButton();
        bt.setIcon(off);
        bt.addActionListener(this);
        bt.setContentAreaFilled(false);
        bt.setBorderPainted(false);
        bt.setFocusPainted(false);
        bt.setBounds(115, 40, 50, 30);
        add(bt);
    } // End Painel

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt && Demo.offBool == true) {
            if (status) {
                bt.setIcon(off);
                status = false;
                Grafico1.corWC = new Color(252, 68, 68);
                Demo.grafico1.repaint();
            } else {
                bt.setIcon(on);
                status = true;
                Grafico1.corWC = Color.green;
                Demo.grafico1.repaint();
                
                Demo.trialTime = new Date();
                Demo.cal.setTime(Demo.trialTime);
                Demo.data[Demo.linha][0] = Demo.linha;
                Demo.data[Demo.linha][1] = "WC's";
                Demo.data[Demo.linha][2] = Demo.cal.get(Calendar.HOUR_OF_DAY);
                Demo.data[Demo.linha][3] = Demo.cal.get(Calendar.MINUTE);
                Demo.data[Demo.linha][4] = Demo.cal.get(Calendar.DAY_OF_MONTH);
                Demo.data[Demo.linha][5] = Demo.mes;
                Demo.data[Demo.linha][6] = Demo.cal.get(Calendar.YEAR);
                Demo.linha++;
            }
        } // End If
    }// End actionPerfomed
}// End Class Painel

// Painel Lavandaria
class Painel6 extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1l;

    JLabel lb;
    JButton bt;
    ImageIcon on, off;
    Boolean status = false;

    public Painel6() {
        setLayout(null);
        off = new ImageIcon("images/Bt_OFF.png");
        on = new ImageIcon("images/Bt_ON.png");
        bt = new JButton();
        bt.setIcon(off);
        bt.addActionListener(this);
        bt.setContentAreaFilled(false);
        bt.setBorderPainted(false);
        bt.setFocusPainted(false);
        bt.setBounds(115, 40, 50, 30);
        add(bt);
    } // End Painel

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt && Demo.offBool == true) {
            if (status) {
                bt.setIcon(off);
                status = false;
                Grafico1.corLavandaria = new Color(252, 68, 68);
                Demo.grafico1.repaint();
            } else {
                bt.setIcon(on);
                status = true;
                Grafico1.corLavandaria = Color.green;
                Demo.grafico1.repaint();
                
                Demo.trialTime = new Date();
                Demo.cal.setTime(Demo.trialTime);
                Demo.data[Demo.linha][0] = Demo.linha;
                Demo.data[Demo.linha][1] = "WC's";
                Demo.data[Demo.linha][2] = Demo.cal.get(Calendar.HOUR_OF_DAY);
                Demo.data[Demo.linha][3] = Demo.cal.get(Calendar.MINUTE);
                Demo.data[Demo.linha][4] = Demo.cal.get(Calendar.DAY_OF_MONTH);
                Demo.data[Demo.linha][5] = Demo.mes;
                Demo.data[Demo.linha][6] = Demo.cal.get(Calendar.YEAR);
                Demo.linha++;
            }
        } // End If
    }// End actionPerfomed
}// End Class Painel

// Painel Casa Forte
class Painel7 extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1l;

    JLabel lb;
    JButton bt;
    ImageIcon on, off;
    Boolean status = false;

    public Painel7() {
        setLayout(null);
        off = new ImageIcon("images/Bt_OFF.png");
        on = new ImageIcon("images/Bt_ON.png");
        bt = new JButton();
        bt.setIcon(off);
        bt.addActionListener(this);
        bt.setContentAreaFilled(false);
        bt.setBorderPainted(false);
        bt.setFocusPainted(false);
        bt.setBounds(115, 40, 50, 30);
        add(bt);
    } // End Painel

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt && Demo.offBool == true) {
            if (status) {
                bt.setIcon(off);
                status = false;
                Grafico1.corCasaForte = new Color(252, 68, 68);
                Demo.grafico1.repaint();
            } else {
                bt.setIcon(on);
                status = true;
                Grafico1.corCasaForte = Color.green;
                Demo.grafico1.repaint();
                
                Demo.trialTime = new Date();
                Demo.cal.setTime(Demo.trialTime);
                Demo.data[Demo.linha][0] = Demo.linha;
                Demo.data[Demo.linha][1] = "Casa forte";
                Demo.data[Demo.linha][2] = Demo.cal.get(Calendar.HOUR_OF_DAY);
                Demo.data[Demo.linha][3] = Demo.cal.get(Calendar.MINUTE);
                Demo.data[Demo.linha][4] = Demo.cal.get(Calendar.DAY_OF_MONTH);
                Demo.data[Demo.linha][5] = Demo.mes;
                Demo.data[Demo.linha][6] = Demo.cal.get(Calendar.YEAR);
                Demo.linha++;
            }
        } // End If
    }// End actionPerfomed
}// End Class Painel

// Classe Grafico
class Grafico extends JPanel {
    private static final long serialVersionUID = 1l;

    public Grafico() {
        setBackground(Color.white);
    }// end constructor

    // Metedo de paint no swing
    public void paintComponent(Graphics g) { // Start Paint
        Graphics2D g2D = (Graphics2D) g;// Graphics 2D
        super.paintComponent(g2D);
        // Desenhar
        g2D.setStroke(new BasicStroke(10));
        g2D.setColor(Color.blue);
        // Linha Horizontal Superior
        g2D.drawLine(60, 60, 1100, 60);
        // linha vertical esquerda
        g2D.drawLine(60, 60, 60, 675);
        // linha horizontalinferior
        g2D.drawLine(60, 680, 1100, 680);
        // linha vertical direita
        g2D.drawLine(1105, 60, 1105, 675);

        // Mostrar imagens e a sua coordenada
        g2D.drawImage(Demo.image2[Demo.aponta], 70, 70, this);

    }// end Paint
}// end class Grafico

// Classe Grafico1
class Grafico1 extends JPanel {
    private static final long serialVersionUID = 1l;

    static Color corCozinha = new Color(252, 68, 68);
    static Color corEscritorio = new Color(252, 68, 68);
    static Color corQuarto = new Color(252, 68, 68);
    static Color corSala = new Color(252, 68, 68);
    static Color corWC = new Color(252, 68, 68);
    static Color corLavandaria = new Color(252, 68, 68);
    static Color corCasaForte = new Color(252, 68, 68);

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // Metodo de paint no swing
    public void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;// Graphics 2D
        super.paintComponent(g2D);
        // Desenhar
        g2D.setStroke(new BasicStroke(10));
        g2D.setColor(Color.blue);
        // Linha Horizontal Superior
        g2D.drawLine(150, 70, 1005, 70);
        // linha vertical esquerda
        g2D.drawLine(140, 70, 140, 690);
        // linha horizontal inferior
        g2D.drawLine(150, 690, 1005, 690);
        // linha vertical direita
        g2D.drawLine(1005, 70, 1005, 690);

        // Mostrar imagens e a sua coordenada
        g2D.drawImage(Demo.image3, 150, 80, this);

        // Led de sinalização
        g2D.setColor(corCozinha);
        g2D.fillOval(258, 238, 10, 10);

        g2D.setColor(corEscritorio);
        g2D.fillOval(598, 495, 10, 10);

        g2D.setColor(corQuarto);
        g2D.fillOval(598, 305, 10, 10);
        g2D.fillOval(732, 305, 10, 10);
        g2D.fillOval(822, 305, 10, 10);
        g2D.fillOval(678, 495, 10, 10);

        g2D.setColor(corSala);
        g2D.fillOval(385, 460, 10, 10);
        g2D.fillOval(340, 350, 10, 10);

        g2D.setColor(corWC);
        g2D.fillOval(450, 300, 10, 10);
        g2D.fillOval(670, 280, 10, 10);
        g2D.fillOval(780, 520, 10, 10);
        g2D.fillOval(780, 280, 10, 10);

        g2D.setColor(corLavandaria);
        g2D.fillOval(400, 228, 10, 10);

        g2D.setColor(corCasaForte);
        g2D.fillOval(675, 435, 10, 10);

    }// end

}// end class Grafico1

// Classe para a tabela
class LabelDefaultTableCellRenderer extends javax.swing.table.DefaultTableCellRenderer {

    // Dados
    private static final long serialVersionUID = 1L;

    // Constructor
    public LabelDefaultTableCellRenderer() {
        super();
        setOpaque(true);
    }// constructor

    // Method
    public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object color, boolean isSelected,
            boolean hasFocus, int row, int column) {

        java.awt.Component comp = super.getTableCellRendererComponent(table, color, isSelected, hasFocus, row, column);

        setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 12));

        try {
            if (column == 0) {
                setForeground(Color.red);
                setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                setVerticalAlignment(javax.swing.SwingConstants.TOP);
            } // column == 0

            if (column == 1) {
                setForeground(Color.blue);
                setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                setVerticalAlignment(javax.swing.SwingConstants.TOP);
            } // column == 1

            if (column == 2) {
                setForeground(new Color(0, 115, 0));
                setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                setVerticalAlignment(javax.swing.SwingConstants.TOP);
            } // column ==2

        } catch (NumberFormatException nfe) {
        }
        ;

        if (row % 2 == 0) {
            setBackground(java.awt.Color.white);
        } else {
            setBackground(new java.awt.Color(220, 255, 204));
        }
        return (comp);
    }// end
}// class LabelDefaultTableCellRenderer

// Public class
public class Demo extends JFrame implements ActionListener {

    // DADOS GLOBAIS
    private static final long serialVersionUID = 1l;
    // Swing Classes
    JTabbedPane jtp;
    // Resolução dos Sistemas
    Toolkit tlk;
    Dimension dim;
    // Imagens da casa, setas para os botões e o icon
    String[] strImg = { "images/casa.png", "images/casa2.png", "images/casa3.png", "images/casa4.png",
            "images/casa5.png", "images/casa6.png", "images/casa7.png", "images/casa8.png", "images/casa9.png",
            "images/casa10.png", "images/casa11.png", "images/casa12.png" };
    String[] strbt = { "images/arrowEsq.png", "images/arrowDir.png" };
    ImageIcon[] icon = new ImageIcon[2];

    // Icon do programa e imagens que vao mostrar
    Image image;
    static BufferedImage image2[] = new BufferedImage[12];
    static BufferedImage image3;

    // Criar as Variávéis
    File file;
    JButton bt0[] = new JButton[2];
    Grafico grafico;
    static Grafico1 grafico1;
    JPanel pCapa, pCc;
    JPanel p0, p0e, p0o;
    JPanel p1, p1e;
    JPanel pTabel;
    JLabel lb, lb_capa, lb_planta1, lb_planta2;
    JTextField tf;
    JTextArea ta;
    JButton bt;
    TitledBorder title_oeste, title_este;
    Border blackline_oeste, blackline_este;

    public static Boolean offBool = false;

    // Calendário
    public static Date trialTime;
    public static GregorianCalendar cal = new GregorianCalendar();
    public static int linha = 0;
    public static String mes = GregorianCalendar.getInstance().getDisplayName(Calendar.MONTH,
        Calendar.LONG,
        Locale.UK);

    // Menu Bar
    JMenuBar mb;

    // Tabela
    JTable table;
    JScrollPane scroll;
    public static Object data[][] = new Object[5000][7];
    Border lineBorder = new LineBorder(Color.blue, 3);
    public static String column[] = { "Posição", "Local de ocorrência do alarme", "Horas", "Minutos", "Dia", "Mes", "Ano" };

    // Painel de controlo
    PainelOnOff painelOnOff;
    Painel painel;
    Painel2 painel2;
    Painel3 painel3;
    Painel4 painel4;
    Painel5 painel5;
    Painel6 painel6;
    Painel7 painel7;

    // Contador para os butões
    static int aponta = 0;

    // Tamanho da Frame
    int comp = 1400, alt = 900;

    // Tabela
    TableModel model1 = new AbstractTableModel() {
        private static final long serialVersionUID = 1;

        public String getColumnName(int columnVal) {
            return column[columnVal].toString();
        }// Method

        public int getRowCount() {
            return data.length;
        }// Method

        public int getColumnCount() {
            return column.length;
        }// Method

        public Object getValueAt(int row, int col) {
            return data[row][col];
        }// Method

    };

    // Constructor
    public Demo() {
        // Titulo do programa
        super("Sistema de alarmes");

        // Saber a resolução do sistema
        tlk = getToolkit();
        dim = tlk.getScreenSize();

        // Fechar a janela no X
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Icon de personalizado no programa
        image = new ImageIcon("images/logo.png").getImage();
        setIconImage(image);

        // Criar os arraws para as imagens dos botões
        icon[0] = new ImageIcon(strbt[0]);
        icon[1] = new ImageIcon(strbt[1]);


        // **MENU-BAR**
        mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Sair");
        exitItem.setIcon(new ImageIcon("images/exit.png"));

        JMenu about = new JMenu("About");
        JMenuItem programaItem = new JMenuItem("Programa");
        programaItem.setIcon(new ImageIcon("images/programa.png"));
        programaItem.addActionListener(this);
        programaItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {  
                final JPanel panel = new JPanel();
        
                JOptionPane.showMessageDialog(panel, "Este programa consiste em um sistema de alarme.", "Programa",
                JOptionPane.INFORMATION_MESSAGE);
                }
            });

        JMenuItem linguagemItem = new JMenuItem("Linguagem");
        linguagemItem.setIcon(new ImageIcon("images/java.png"));
        linguagemItem.addActionListener(this);
        linguagemItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) { 
                final JPanel panel = new JPanel();
        
                JOptionPane.showMessageDialog(panel, "Este programa foi criado em Java!", "Linguagem",
                JOptionPane.INFORMATION_MESSAGE);
                }
            });

        JMenuItem autorItem = new JMenuItem("Autor");
        autorItem.setIcon(new ImageIcon("images/autor.png"));
        autorItem.addActionListener(this);
        autorItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) { 
                final JPanel panel = new JPanel();
        
                JOptionPane.showMessageDialog(panel, "O autor deste programa é o Tiago Ramada, PI0919!", "Autor",
                JOptionPane.INFORMATION_MESSAGE);
                }
            });

        // Isto vai adicionar a ação de sair ao MenuItem exit
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent exitMenuItem) {
                    System.gc();
                    System.exit(0);
            }
        }); // End ActionListener

        file.add(exitItem);
        about.add(programaItem);
        about.add(linguagemItem);
        about.addSeparator();
        about.add(autorItem);
        mb.add(file);
        mb.add(about);
        setJMenuBar(mb);


        // Criar os panels p0, p1 e pCapa
        pCapa = new JPanel(new BorderLayout());
        p0 = new JPanel(new BorderLayout());
        p1 = new JPanel(new BorderLayout());
        pTabel = new JPanel(new BorderLayout());

        // Adicionar a imagem à label, para ser a capa + background -> pCapa
        Color capaBackground = new Color(74,64,101,255);
        pCapa.setBackground(capaBackground);
        lb_capa = new JLabel();
        lb_capa.setIcon(new ImageIcon("images/capa.jpg"));
        lb_capa.setHorizontalAlignment(JLabel.CENTER);
        lb_capa.setVerticalAlignment(JLabel.CENTER);
        pCapa.add(lb_capa, BorderLayout.CENTER);

        // Panel Oeste -> p0
        p0o = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 300));
        p0o.setBackground(Color.lightGray);
        p0o.setPreferredSize(new Dimension(100, 800));

        // Botão da direita -> p0
        bt0[0] = new JButton(icon[0]);
        bt0[0].addActionListener(this);
        bt0[0].setContentAreaFilled(false);
        bt0[0].setBorderPainted(false);
        bt0[0].setFocusPainted(false);
        bt0[0].setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));

        // Adiciona o panel p0o e o botão -> p0
        p0o.add(bt0[0]);
        p0.add(p0o, BorderLayout.WEST);

        // Adiciona/Cria o grafico -> p0
        grafico = new Grafico();
        grafico.setBackground(Color.lightGray);
        p0.add(grafico, BorderLayout.CENTER);

        // Panel Este -> p0
        p0e = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 300));
        p0e.setBackground(Color.lightGray);
        p0e.setPreferredSize(new Dimension(100, 800));

        // Botão da esquerda
        bt0[1] = new JButton(icon[1]);
        bt0[1].addActionListener(this);
        bt0[1].setContentAreaFilled(false);
        bt0[1].setBorderPainted(false);
        bt0[1].setFocusPainted(false);
        bt0[1].setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));

        // Adiciona o botão e o panel este -> p0
        p0e.add(bt0[1]);
        p0.add(p0e, BorderLayout.EAST);

        // TAB 3 - PLANTAS
        grafico1 = new Grafico1();
        grafico1.setBackground(Color.lightGray);
        p1.add(grafico1, BorderLayout.CENTER);

        // Painel Este -> p1
        p1e = new JPanel(new GridLayout(8, 1));
        p1e.setBackground(Color.lightGray);
        p1e.setPreferredSize(new Dimension(300, 100));
        p1e.setBorder(new TitledBorder(lineBorder, "[ Listagem de Alarmes do Sistema ]", TitledBorder.CENTER,
                TitledBorder.TOP, new Font("Arial", Font.PLAIN, 18), Color.black));


        // **PAINEL-DE-CONTROLO**
        painelOnOff = new PainelOnOff();
        painelOnOff.setBackground(Color.lightGray);
        painelOnOff.setBorder(new TitledBorder(lineBorder, "[ Ligar/Desligar ]", TitledBorder.CENTER, TitledBorder.TOP,
                new Font("Arial", Font.PLAIN, 17), Color.red));
        p1e.add(painelOnOff);

        painel = new Painel();
        painel.setBackground(Color.lightGray);
        painel.setBorder(new TitledBorder(lineBorder, "[ Cozinha ]", TitledBorder.CENTER, TitledBorder.TOP,
                new Font("Arial", Font.PLAIN, 17), Color.red));
        p1e.add(painel);

        painel2 = new Painel2();
        painel2.setBackground(Color.lightGray);
        painel2.setBorder(new TitledBorder(lineBorder, "[ Escritório ]", TitledBorder.CENTER, TitledBorder.TOP,
                new Font("Arial", Font.PLAIN, 17), Color.red));
        p1e.add(painel2);

        painel3 = new Painel3();
        painel3.setBackground(Color.lightGray);
        painel3.setBorder(new TitledBorder(lineBorder, "[ Quartos ]", TitledBorder.CENTER, TitledBorder.TOP,
                new Font("Arial", Font.PLAIN, 17), Color.red));
        p1e.add(painel3);

        painel4 = new Painel4();
        painel4.setBackground(Color.lightGray);
        painel4.setBorder(new TitledBorder(lineBorder, "[ Salas ]", TitledBorder.CENTER, TitledBorder.TOP,
                new Font("Arial", Font.PLAIN, 17), Color.red));
        p1e.add(painel4);

        painel5 = new Painel5();
        painel5.setBackground(Color.lightGray);
        painel5.setBorder(new TitledBorder(lineBorder, "[ WC's ]", TitledBorder.CENTER, TitledBorder.TOP,
                new Font("Arial", Font.PLAIN, 17), Color.red));
        p1e.add(painel5);

        painel6 = new Painel6();
        painel6.setBackground(Color.lightGray);
        painel6.setBorder(new TitledBorder(lineBorder, "[ Lavandaria ]", TitledBorder.CENTER, TitledBorder.TOP,
                new Font("Arial", Font.PLAIN, 17), Color.red));
        p1e.add(painel6);

        painel7 = new Painel7();
        painel7.setBackground(Color.lightGray);
        painel7.setBorder(new TitledBorder(lineBorder, "[ Casa Forte ]", TitledBorder.CENTER, TitledBorder.TOP,
                new Font("Arial", Font.PLAIN, 17), Color.red));
        p1e.add(painel7);

        p1.add(p1e, BorderLayout.EAST);


        // **TABELA-CUSTOMIZADA** -> pTabel
        // Aqui estamos a criar a tabela
        table = new JTable(model1);
        TableColumn column1 = null;

        for (int ct1 = 0; ct1 < 3; ct1++) {
            column1 = table.getColumnModel().getColumn(ct1);

            if (ct1 == 0) {
                column1.setPreferredWidth(100);
            } // if
            if (ct1 == 1) {
                column1.setPreferredWidth(1000);
            } // if
            if (ct1 == 2) {
                column1.setPreferredWidth(100);
            } // if
            if (ct1 == 3) {
                column1.setPreferredWidth(100);
            } // if
            if (ct1 == 4) {
                column1.setPreferredWidth(100);
            } // if
            if (ct1 == 5) {
                column1.setPreferredWidth(100);
            } // if
            if (ct1 == 6) {
                column1.setPreferredWidth(100);
            } // if
        }

        // **PERSONALIZAÇÃO-DA-TABELA**
        TableCellRenderer renderer = new LabelDefaultTableCellRenderer();
        table.setDefaultRenderer(Object.class, renderer);

        table.setFont(new Font("Arial", Font.BOLD, 14));

        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);

        table.getTableHeader().setBackground(Color.orange);
        table.getTableHeader().setForeground(Color.black);
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));

        // Tamanho de Row da tabela
        table.setRowHeight(22);

        table.setFont(new Font("Arial", Font.PLAIN, 12));
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setShowHorizontalLines(false);

        // Adicionar um scroll à tabela
        scroll = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBorder(new TitledBorder(lineBorder, "[ Listagem de Alarmes do Sistema ]", TitledBorder.CENTER,
                TitledBorder.TOP, new Font("Arial", Font.PLAIN, 18), Color.black));

        scroll.add(table);
        scroll.setViewportView(table);

        getContentPane().add(scroll, BorderLayout.CENTER);
        pTabel.add(scroll);



        // Posição das tabs no programa
        jtp = new JTabbedPane();
        jtp.setTabPlacement(1); // 1 a 4



        // Imagens do Slide Show e da Planta da casa
        try {
            image2[aponta] = ImageIO.read(new File(strImg[aponta]));
            image3 = ImageIO.read(new File("images/planta.png"));
        } catch (IOException io) {
            io.printStackTrace();
        }


        // Icons dos tabs
        ImageIcon alarme = new ImageIcon(this.getClass().getResource("images/alarme.png"));


        // Adicionar tabs ao programa
        jtp.addTab("Capa da aplicação", alarme, pCapa);
        jtp.addTab("Imagens da Casa", alarme, p0);
        jtp.addTab("Planta da casa", alarme, p1);
        jtp.addTab("Tabelas", alarme, pTabel);

        getContentPane().add(jtp, BorderLayout.CENTER);


        // Meter a frame sem poder dar resizable
        setResizable(false);


        // Abrir o programa no centro do ecrã
        setBounds(dim.width / 2 - comp / 2, // coordenada X
                dim.height / 2 - alt / 2, // coordenada Y
                comp, // comprimento
                alt);// altura


        // Mete a frame visivel
        setVisible(true);

    }// end constructor

    // Adicionar ações
    public void actionPerformed(ActionEvent e) {
        // Botao da direita
        if (e.getSource() == bt0[1]) {
            if (aponta < 11)
                aponta++;
            else
                aponta = 0;
        }
        // Botao da esquerda
        if (e.getSource() == bt0[0]) {
            if (aponta > 0)
                aponta--;
            else
                aponta = 11;
        }

       /// Carregar a imagem de fundo
        try {
            image2[aponta] = ImageIO.read(new File(strImg[aponta]));
        } catch (IOException io) {
            io.printStackTrace();
        }

        repaint();
        
    }

    // main function
    public static void main(String[] args) {
        Demo app = new Demo();
    }// end main
}// end public class