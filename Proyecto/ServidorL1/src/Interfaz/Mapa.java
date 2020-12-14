package Interfaz;

import Clases.Servidor;
import static Clases.Servidor.buses;
import javax.swing.JOptionPane;

//Esta clase es el mapa por donde correrán todos los buses 
public final class Mapa extends javax.swing.JFrame {

    public void start() {// Este método le asigna una ubicación a los buses 

        Servidor.bus1.setLocation(label_bus1);
        Servidor.bus2.setLocation(label_bus2);
        Servidor.bus3.setLocation(label_bus3);
        Servidor.bus4.setLocation(label_bus4);
        Servidor.bus5.setLocation(label_bus5);
        Servidor.bus6.setLocation(label_bus6);
        Servidor.bus7.setLocation(label_bus7);
        Servidor.bus8.setLocation(label_bus8);
        Servidor.bus9.setLocation(label_bus9);
        Servidor.bus10.setLocation(label_bus10);

    }

    public Mapa() {
        initComponents();
        start();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_parada10 = new javax.swing.JLabel();
        label_parada20 = new javax.swing.JLabel();
        label_parada19 = new javax.swing.JLabel();
        label_parada9 = new javax.swing.JLabel();
        label_parada18 = new javax.swing.JLabel();
        label_parada16 = new javax.swing.JLabel();
        label_parada12 = new javax.swing.JLabel();
        label_parada17 = new javax.swing.JLabel();
        label_parada13 = new javax.swing.JLabel();
        label_parada7 = new javax.swing.JLabel();
        label_parada6 = new javax.swing.JLabel();
        label_parada4 = new javax.swing.JLabel();
        label_parada14 = new javax.swing.JLabel();
        label_parada15 = new javax.swing.JLabel();
        label_parada1 = new javax.swing.JLabel();
        label_parada8 = new javax.swing.JLabel();
        label_parada3 = new javax.swing.JLabel();
        label_parada2 = new javax.swing.JLabel();
        label_parada5 = new javax.swing.JLabel();
        label_parada11 = new javax.swing.JLabel();
        label_bus2 = new javax.swing.JLabel();
        label_bus4 = new javax.swing.JLabel();
        label_bus1 = new javax.swing.JLabel();
        label_bus10 = new javax.swing.JLabel();
        label_bus6 = new javax.swing.JLabel();
        label_bus9 = new javax.swing.JLabel();
        label_bus8 = new javax.swing.JLabel();
        label_bus7 = new javax.swing.JLabel();
        label_bus3 = new javax.swing.JLabel();
        label_bus5 = new javax.swing.JLabel();
        bt_info_buses = new javax.swing.JButton();
        label_mapa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_parada10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, -1, 60));

        label_parada20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 60));

        label_parada19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, 60));

        label_parada9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, -1, 60));

        label_parada18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, 60));

        label_parada16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, 60));

        label_parada12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, 60));

        label_parada17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, 60));

        label_parada13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, 60));

        label_parada7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, 60));

        label_parada6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, 60));

        label_parada4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 60));

        label_parada14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, 60));

        label_parada15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, 60));

        label_parada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, 60));

        label_parada8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, -1, 60));

        label_parada3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 80, 60));

        label_parada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, 60));

        label_parada5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 60));

        label_parada11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/parada.png"))); // NOI18N
        getContentPane().add(label_parada11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, -1, 60));

        label_bus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/bus.png"))); // NOI18N
        getContentPane().add(label_bus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        label_bus4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/bus.png"))); // NOI18N
        getContentPane().add(label_bus4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        label_bus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/bus.png"))); // NOI18N
        getContentPane().add(label_bus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, -1));

        label_bus10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/bus.png"))); // NOI18N
        getContentPane().add(label_bus10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        label_bus6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/bus.png"))); // NOI18N
        getContentPane().add(label_bus6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, -1, -1));

        label_bus9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/bus.png"))); // NOI18N
        getContentPane().add(label_bus9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        label_bus8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/bus.png"))); // NOI18N
        getContentPane().add(label_bus8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, -1));

        label_bus7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/bus.png"))); // NOI18N
        getContentPane().add(label_bus7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, -1, -1));

        label_bus3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/bus.png"))); // NOI18N
        getContentPane().add(label_bus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        label_bus5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/bus.png"))); // NOI18N
        getContentPane().add(label_bus5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        bt_info_buses.setText("Estado Buses");
        bt_info_buses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_info_busesActionPerformed(evt);
            }
        });
        getContentPane().add(bt_info_buses, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, -1, -1));

        label_mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaz/map.jpg"))); // NOI18N
        getContentPane().add(label_mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Presionar este botón nos mostrará la parada actual de todos los buses
    private void bt_info_busesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_info_busesActionPerformed
        
        //imprime la ultima parada de todos los buses
        String paradas = "Última Parada de los buses:\n\n";
        for (int i = 0; i<10;i++) {
            paradas+="Bus"+buses.get(i).getPlaca()+": "+buses.get(i).getLastParada()+"\n";
        }
        JOptionPane.showMessageDialog(null,paradas,"Estado de los buses",JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_bt_info_busesActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_info_buses;
    private javax.swing.JLabel label_bus1;
    private javax.swing.JLabel label_bus10;
    private javax.swing.JLabel label_bus2;
    private javax.swing.JLabel label_bus3;
    private javax.swing.JLabel label_bus4;
    private javax.swing.JLabel label_bus5;
    private javax.swing.JLabel label_bus6;
    private javax.swing.JLabel label_bus7;
    private javax.swing.JLabel label_bus8;
    private javax.swing.JLabel label_bus9;
    private javax.swing.JLabel label_mapa;
    private javax.swing.JLabel label_parada1;
    private javax.swing.JLabel label_parada10;
    private javax.swing.JLabel label_parada11;
    private javax.swing.JLabel label_parada12;
    private javax.swing.JLabel label_parada13;
    private javax.swing.JLabel label_parada14;
    private javax.swing.JLabel label_parada15;
    private javax.swing.JLabel label_parada16;
    private javax.swing.JLabel label_parada17;
    private javax.swing.JLabel label_parada18;
    private javax.swing.JLabel label_parada19;
    private javax.swing.JLabel label_parada2;
    private javax.swing.JLabel label_parada20;
    private javax.swing.JLabel label_parada3;
    private javax.swing.JLabel label_parada4;
    private javax.swing.JLabel label_parada5;
    private javax.swing.JLabel label_parada6;
    private javax.swing.JLabel label_parada7;
    private javax.swing.JLabel label_parada8;
    private javax.swing.JLabel label_parada9;
    // End of variables declaration//GEN-END:variables
}
