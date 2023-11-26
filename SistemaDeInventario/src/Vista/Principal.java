
package Vista;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Jefferson
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
         establecerDia();
          lblDia = new JLabel();
          initContenido();
    }

   
    

    private void establecerDia() {
       LocalDate now =LocalDate.now();
       Locale spanishLocale = new Locale("es", "ES");
        lblDia.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEE dd 'de' MMM 'de' yyy",spanishLocale)));
    } 

    private void initContenido(){
        
        mostrarPanel(new Principal2());
        
    }
    
    public void mostrarPanel(JPanel p){
        
       // Principal2 p2 = new Principal2();
        p.setSize(730,440);
        p.setLocation(0,0);
        
        contenido.removeAll();;
        contenido.add(p);
        contenido.revalidate();
        contenido.repaint();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGround = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        lblNombreEmpresaPrincipal = new javax.swing.JLabel();
        Separador = new javax.swing.JSeparator();
        btnPrincipal = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnReportes1 = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        lblAdministracionInventario = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 620));

        backGround.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(51, 0, 51));

        lblNombreEmpresaPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblNombreEmpresaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreEmpresaPrincipal.setText("La Pulperia");
        lblNombreEmpresaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblNombreEmpresaPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Separador.setBackground(new java.awt.Color(255, 255, 255));

        btnPrincipal.setBackground(new java.awt.Color(51, 0, 51));
        btnPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home-outline (1).png"))); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.setBorder(null);
        btnPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrincipal.setIconTextGap(10);
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        btnInventario.setBackground(new java.awt.Color(51, 0, 51));
        btnInventario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/book-open-page-variant.png"))); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.setBorder(null);
        btnInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInventario.setIconTextGap(10);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnReportes.setBackground(new java.awt.Color(51, 0, 51));
        btnReportes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/file-chart.png"))); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.setBorder(null);
        btnReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReportes.setIconTextGap(10);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnReportes1.setBackground(new java.awt.Color(51, 0, 51));
        btnReportes1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReportes1.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calendar-plus.png"))); // NOI18N
        btnReportes1.setText("Añdir o eliminar producto");
        btnReportes1.setBorder(null);
        btnReportes1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReportes1.setIconTextGap(10);
        btnReportes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportes1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombreEmpresaPrincipal)
                .addGap(42, 42, 42))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReportes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblNombreEmpresaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportes1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(102, 0, 102));

        lblAdministracionInventario.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblAdministracionInventario.setForeground(new java.awt.Color(255, 255, 255));
        lblAdministracionInventario.setText("Administracion de Inventario");

        lblDia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDia.setForeground(new java.awt.Color(255, 255, 255));
        lblDia.setText("Hoy es {dia} de {mes} del {año}");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDia, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdministracionInventario))
                .addContainerGap(376, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblAdministracionInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblDia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backGroundLayout = new javax.swing.GroupLayout(backGround);
        backGround.setLayout(backGroundLayout);
        backGroundLayout.setHorizontalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        backGroundLayout.setVerticalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
         mostrarPanel(new Principal2());
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnReportes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportes1ActionPerformed
         mostrarPanel(new Añadir());
    }//GEN-LAST:event_btnReportes1ActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        mostrarPanel(new Inventario());
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        mostrarPanel(new Reporte());
    }//GEN-LAST:event_btnReportesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    private javax.swing.JPanel backGround;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnReportes1;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel header;
    private javax.swing.JLabel lblAdministracionInventario;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblNombreEmpresaPrincipal;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
