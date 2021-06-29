package usuario;

import frames.PrincipalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author yefri1000
 */
public class ConstructorTablero {
    private static Tablero tablero;
    private static JPanel[][] tableroPanel;
    
    public ConstructorTablero(Tablero tablero){
        this.tablero=tablero;
    }

    public static Tablero getTablero() {
        return tablero;
    }

    public static JPanel[][] getTableroPanel() {
        return tableroPanel;
    }
    
    /**
     * Metodo para constrir tablero a partir de el tablero creado con el archivo de texto
     */
    public static  void construirTableroPanel(){
        int x=10;
        int y=10;
        int pos=0;
        tableroPanel=new JPanel[tablero.getFilas()][tablero.getColumnas()];
        for(int i=0;i<tablero.getFilas();i++){
            for(int j=0;j<tablero.getColumnas();j++){
                tableroPanel[i][j]=new JPanel();
                tableroPanel[i][j].setBounds(x,y,110,110);
                PrincipalFrame.jPanelPrincipal.add(tableroPanel[i][j]);
                tableroPanel[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                tableroPanel[i][j].setOpaque(true);
                tableroPanel[i][j].setBackground(Color.GREEN);
                if(i==0 &&j==0){
                    tableroPanel[0][0].add(new JLabel("META"));
                } else if ((i+1)==tablero.getFilas() && (j+1)==tablero.getColumnas()){
                    tableroPanel[i][j].add(new JLabel("INICIO"));   
                } else {
                    tableroPanel[i][j].add(new JLabel(tablero.getColumnas()*tablero.getFilas()-j-pos+""));
                }
                tableroPanel[i][j].setVisible(true);
                x+=110;
            }
            pos+=tablero.getColumnas();
            x=10;
            y+=110;
        }
        PrincipalFrame.CargarArchivojButton.setEnabled(false);
    }
    
}
