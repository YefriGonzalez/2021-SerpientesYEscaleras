package usuario;

import frames.PrincipalFrame;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author yefri1000
 */
public class ConstructorTablero {
    private static JLabel[][] tableroLabel;
    Tablero tablero;
    public ConstructorTablero(Tablero tablero){
        this.tablero=tablero;
    }
    public  void construirTablero(){
        int x=10;
        int y=10;
        int pos=0;
        tableroLabel=new JLabel[this.tablero.getFilas()][this.tablero.getColumnas()];
        for(int i=0;i<this.tablero.getFilas();i++){
            for(int j=0;j<this.tablero.getColumnas();j++){
                tableroLabel[i][j]=new JLabel();
                tableroLabel[i][j].setBounds(x,y,75,75);
                PrincipalFrame.jPanelPrincipal.add(tableroLabel[i][j]);
                tableroLabel[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                tableroLabel[i][j].setOpaque(true);
                tableroLabel[i][j].setBackground(Color.GREEN);
                tableroLabel[i][j].setText((this.tablero.getColumnas()*this.tablero.getFilas()-(j))-pos+"");
                tableroLabel[i][j].setVisible(true);
                x+=75;
            }
            pos+=this.tablero.getColumnas();
            x=10;
            y+=75;
        }
        PrincipalFrame.jugarjButton.setEnabled(false);
    }

    public static JLabel[][] getTableroLabel() {
        return tableroLabel;
    }
    
    
    
}
