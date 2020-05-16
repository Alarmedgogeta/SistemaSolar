package Clases;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class VentanaSistemaSolar extends javax.swing.JFrame {
    Thread hiloMercurio;
    Thread hiloVenus;
    Thread hiloTierra;
    Thread hiloMarte;
    Thread hiloJupiter;
    Thread hiloSaturno;
    Thread hiloUrano;
    Thread hiloNeptuno;
    public VentanaSistemaSolar() {
        initComponents();
        ImageIcon solIcon = new ImageIcon("src/Clases/Sol.jpg");
        Icon solFondo = new ImageIcon(solIcon.getImage().getScaledInstance(sol.getWidth(), 
                sol.getHeight(), Image.SCALE_DEFAULT));
        sol.setIcon(solFondo);
        ImageIcon mercurioIcon = new ImageIcon("src/Clases/Mercurio.jpg");
        Icon mercurioFondo = new ImageIcon(mercurioIcon.getImage().getScaledInstance(mercurio.getWidth(), 
                mercurio.getHeight(), Image.SCALE_DEFAULT));
        mercurio.setIcon(mercurioFondo);
        ImageIcon venusIcon = new ImageIcon("src/Clases/Venus.jpg");
        Icon venusFondo = new ImageIcon(venusIcon.getImage().getScaledInstance(venus.getWidth(), 
                venus.getHeight(), Image.SCALE_DEFAULT));
        venus.setIcon(venusFondo);
        ImageIcon tierraIcon = new ImageIcon("src/Clases/Tierra.jpg");
        Icon tierraFondo = new ImageIcon(tierraIcon.getImage().getScaledInstance(tierra.getWidth(), 
                tierra.getHeight(), Image.SCALE_DEFAULT));
        tierra.setIcon(tierraFondo);
        ImageIcon marteIcon = new ImageIcon("src/Clases/Marte.jpg");
        Icon marteFondo = new ImageIcon(marteIcon.getImage().getScaledInstance(marte.getWidth(), 
                marte.getHeight(), Image.SCALE_DEFAULT));
        marte.setIcon(marteFondo);
        ImageIcon jupiterIcon = new ImageIcon("src/Clases/Jupiter.jpg");
        Icon jupiterFondo = new ImageIcon(jupiterIcon.getImage().getScaledInstance(jupiter.getWidth(), 
                jupiter.getHeight(), Image.SCALE_DEFAULT));
        jupiter.setIcon(jupiterFondo);
        ImageIcon saturnoIcon = new ImageIcon("src/Clases/Saturno.jpg");
        Icon saturnoFondo = new ImageIcon(saturnoIcon.getImage().getScaledInstance(saturno.getWidth(), 
                saturno.getHeight(), Image.SCALE_DEFAULT));
        saturno.setIcon(saturnoFondo);
        ImageIcon uranoIcon = new ImageIcon("src/Clases/Urano.jpg");
        Icon uranoFondo = new ImageIcon(uranoIcon.getImage().getScaledInstance(urano.getWidth(), 
                urano.getHeight(), Image.SCALE_DEFAULT));
        urano.setIcon(uranoFondo);
        ImageIcon neptunoIcon = new ImageIcon("src/Clases/Neptuno.jpg");
        Icon neptunoFondo = new ImageIcon(neptunoIcon.getImage().getScaledInstance(neptuno.getWidth(), 
                neptuno.getHeight(), Image.SCALE_DEFAULT));
        neptuno.setIcon(neptunoFondo);
        this.repaint();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Sistema Solar");
        hiloMercurio = new ActualizadorDePosiciones(this.sistemaSolar, 58.757978181690355, 7, 164);
        hiloMercurio.start();
        hiloVenus = new ActualizadorDePosiciones(this.sistemaSolar, 95.65824585470925, 6, 117);
        hiloVenus.start();
        hiloTierra = new ActualizadorDePosiciones(this.sistemaSolar, 130.61584896175503, 5, 100);
        hiloTierra.start();
        hiloMarte = new ActualizadorDePosiciones(this.sistemaSolar, 167.59027418081277, 4, 81);
        hiloMarte.start();
        hiloJupiter = new ActualizadorDePosiciones(this.sistemaSolar, 212.00943375236866, 3, 44);
        hiloJupiter.start();
        hiloSaturno = new ActualizadorDePosiciones(this.sistemaSolar, 274.0072991728505, 2, 32);
        hiloSaturno.start();
        hiloUrano = new ActualizadorDePosiciones(this.sistemaSolar, 336.00595232822883, 1, 23);
        hiloUrano.start();
        hiloNeptuno = new ActualizadorDePosiciones(this.sistemaSolar, 388.0051546049356, 0, 18);
        hiloNeptuno.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sistemaSolar = new javax.swing.JPanel();
        sol = new javax.swing.JLabel();
        mercurio = new javax.swing.JLabel();
        venus = new javax.swing.JLabel();
        tierra = new javax.swing.JLabel();
        marte = new javax.swing.JLabel();
        jupiter = new javax.swing.JLabel();
        saturno = new javax.swing.JLabel();
        urano = new javax.swing.JLabel();
        neptuno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sistemaSolar.setBackground(new java.awt.Color(0, 0, 0));

        mercurio.setForeground(new java.awt.Color(255, 255, 255));

        venus.setForeground(new java.awt.Color(255, 255, 255));

        tierra.setForeground(new java.awt.Color(255, 255, 255));

        marte.setForeground(new java.awt.Color(255, 255, 255));

        jupiter.setForeground(new java.awt.Color(255, 255, 255));

        saturno.setForeground(new java.awt.Color(255, 255, 255));

        urano.setForeground(new java.awt.Color(255, 255, 255));

        neptuno.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout sistemaSolarLayout = new javax.swing.GroupLayout(sistemaSolar);
        sistemaSolar.setLayout(sistemaSolarLayout);
        sistemaSolarLayout.setHorizontalGroup(
            sistemaSolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sistemaSolarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(neptuno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(urano, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saturno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jupiter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(marte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tierra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(venus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mercurio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sol, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(370, Short.MAX_VALUE))
        );
        sistemaSolarLayout.setVerticalGroup(
            sistemaSolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sistemaSolarLayout.createSequentialGroup()
                .addGroup(sistemaSolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sistemaSolarLayout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(sol, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sistemaSolarLayout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addGroup(sistemaSolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neptuno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sistemaSolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jupiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tierra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(venus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mercurio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(marte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(urano, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addComponent(saturno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(289, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sistemaSolar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sistemaSolar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSistemaSolar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jupiter;
    private javax.swing.JLabel marte;
    private javax.swing.JLabel mercurio;
    private javax.swing.JLabel neptuno;
    private javax.swing.JLabel saturno;
    private javax.swing.JPanel sistemaSolar;
    private javax.swing.JLabel sol;
    private javax.swing.JLabel tierra;
    private javax.swing.JLabel urano;
    private javax.swing.JLabel venus;
    // End of variables declaration//GEN-END:variables
}
