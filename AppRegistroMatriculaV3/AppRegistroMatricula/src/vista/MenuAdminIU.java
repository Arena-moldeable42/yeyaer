
package vista;
import modelo.*;
public class MenuAdminIU extends javax.swing.JFrame {
    // Atributos
    private RegistroPersona registroPersona; // encargada de gestionar los datos de las personas
    private RegistroCurso registroCurso;
    private RegistroMatricula registroMatricula;
    private RegistroExpediente registroExpediente;
   
    public MenuAdminIU() {
        initComponents();
        // Crear una instancia del RegistroPersona
        this.registroPersona = new RegistroPersona();
        this.registroCurso = new RegistroCurso();
        this.registroMatricula = new RegistroMatricula();
        this.registroExpediente = new RegistroExpediente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        menuItemAlumno = new javax.swing.JMenuItem();
        menuItemDocente = new javax.swing.JMenuItem();
        menuItemAdministrativo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemNuevoCurso = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuItemRegistrarMatricula = new javax.swing.JMenuItem();
        menuItemRegistrarExpediente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuListaPersonas = new javax.swing.JMenu();
        menuItemListaAlumnos = new javax.swing.JMenuItem();
        menuItemListaDocentes = new javax.swing.JMenuItem();
        menuItemListaAdministrativos = new javax.swing.JMenuItem();
        menuItemListaCursos = new javax.swing.JMenuItem();
        menuItemListaAlumnosMatriculados = new javax.swing.JMenuItem();
        menuItemListaExpedientes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión de registros de Personas");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Sistema de Informacón para el registro de personas");

        jLabel2.setText("@ULima");

        jMenu1.setText("Archivo");

        jMenu4.setText("Nueva Persona");

        menuItemAlumno.setText("Alumno");
        menuItemAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAlumnoActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemAlumno);

        menuItemDocente.setText("Docente");
        menuItemDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDocenteActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemDocente);

        menuItemAdministrativo.setText("Administrativo");
        menuItemAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAdministrativoActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemAdministrativo);

        jMenu1.add(jMenu4);
        jMenu1.add(jSeparator1);

        menuItemNuevoCurso.setText("Nuevo Curso");
        menuItemNuevoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNuevoCursoActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemNuevoCurso);

        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemSalir);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Procesos");

        menuItemRegistrarMatricula.setText("Registrar Matrícula");
        menuItemRegistrarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistrarMatriculaActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemRegistrarMatricula);

        menuItemRegistrarExpediente.setText("Registrar Expediente");
        jMenu5.add(menuItemRegistrarExpediente);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("Reportes");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        menuListaPersonas.setText("Lista de Personas");

        menuItemListaAlumnos.setText("Lista Alumnos");
        menuItemListaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListaAlumnosActionPerformed(evt);
            }
        });
        menuListaPersonas.add(menuItemListaAlumnos);

        menuItemListaDocentes.setText("Lista Docentes");
        menuItemListaDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListaDocentesActionPerformed(evt);
            }
        });
        menuListaPersonas.add(menuItemListaDocentes);

        menuItemListaAdministrativos.setText("Lista Administrativos");
        menuItemListaAdministrativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListaAdministrativosActionPerformed(evt);
            }
        });
        menuListaPersonas.add(menuItemListaAdministrativos);

        jMenu3.add(menuListaPersonas);

        menuItemListaCursos.setText("Lista de Cursos");
        menuItemListaCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListaCursosActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemListaCursos);

        menuItemListaAlumnosMatriculados.setText("Lista de Alumnos Matriculados");
        menuItemListaAlumnosMatriculados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListaAlumnosMatriculadosActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemListaAlumnosMatriculados);

        menuItemListaExpedientes.setText("Lista de Expedientes");
        menuItemListaExpedientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListaExpedientesActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemListaExpedientes);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Ayuda");

        menuItemAcercaDe.setText("Acerca de");
        menuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAcercaDeActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemAcercaDe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addGap(121, 121, 121))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        // Cerrar el programa de software
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void menuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAcercaDeActionPerformed
        // Crea una nueva instancia u objeto de la Clase AcercaDeIU
        AcercaDeIU frmAcercaDe = new AcercaDeIU();
        frmAcercaDe.setVisible(true); // hide
        
    }//GEN-LAST:event_menuItemAcercaDeActionPerformed

    private void menuItemAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAlumnoActionPerformed
        RegistroNuevoAlumnoIU frmRegistroAlumno = 
                new RegistroNuevoAlumnoIU(registroPersona);
        frmRegistroAlumno.setVisible(true);
    }//GEN-LAST:event_menuItemAlumnoActionPerformed

    private void menuItemListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListaAlumnosActionPerformed
        // TODO add your handling code here:
        ListaAlumnoIU frmListaAlumnos = new ListaAlumnoIU(this.registroPersona);
        frmListaAlumnos.setVisible(true);
    }//GEN-LAST:event_menuItemListaAlumnosActionPerformed

    private void menuItemDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDocenteActionPerformed
        RegistroNuevoDocenteIU frmRegistroDocente = new RegistroNuevoDocenteIU(this.registroPersona);
        frmRegistroDocente.setVisible(true);
    }//GEN-LAST:event_menuItemDocenteActionPerformed

    private void menuItemListaDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListaDocentesActionPerformed
        ListaDocenteIU frmListaDocentes = new ListaDocenteIU(this.registroPersona);
        frmListaDocentes.setVisible(true);
    }//GEN-LAST:event_menuItemListaDocentesActionPerformed

    private void menuItemNuevoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNuevoCursoActionPerformed
        // Llamar al formulario de Registrar un nuevo curso
        RegistroNuevoCursoIU frmCurso = new RegistroNuevoCursoIU(
                this.registroPersona, this.registroCurso        
        );
        frmCurso.setVisible(true);
    }//GEN-LAST:event_menuItemNuevoCursoActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void menuItemListaCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListaCursosActionPerformed
        // Crear el formulario para listar cursos
        ListaCursosIU frmListaCursos = new ListaCursosIU(this.registroCurso);
        frmListaCursos.setVisible(true);
    }//GEN-LAST:event_menuItemListaCursosActionPerformed

    private void menuItemRegistrarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistrarMatriculaActionPerformed
        // 
        RegistroMatriculaIU frmRegistroMatricula = new RegistroMatriculaIU(
                this.registroPersona,
                this.registroCurso,
                this.registroMatricula
        );
        frmRegistroMatricula.setVisible(true);
    }//GEN-LAST:event_menuItemRegistrarMatriculaActionPerformed

    private void menuItemListaAlumnosMatriculadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListaAlumnosMatriculadosActionPerformed
        // TODO add your handling code here:
        ListaMatriculaIU frmListaMatriculaIU = new ListaMatriculaIU(registroMatricula);
        frmListaMatriculaIU.setVisible(true);
    }//GEN-LAST:event_menuItemListaAlumnosMatriculadosActionPerformed

    private void menuItemAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAdministrativoActionPerformed
        RegistroNuevoAdministrativoIU frmRegistroAdministrativo = new RegistroNuevoAdministrativoIU(this.registroPersona);
        frmRegistroAdministrativo.setVisible(true);
    }//GEN-LAST:event_menuItemAdministrativoActionPerformed

    private void menuItemListaAdministrativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListaAdministrativosActionPerformed
        ListaAdministrativoIU frmListaAdministrativos = new ListaAdministrativoIU(this.registroPersona);
        frmListaAdministrativos.setVisible(true);
    }//GEN-LAST:event_menuItemListaAdministrativosActionPerformed

    private void menuItemListaExpedientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListaExpedientesActionPerformed
        ListaExpedienteIU frmListaExpedienteIU = new ListaExpedienteIU(registroExpediente);
        frmListaExpedienteIU.setVisible(true);
    }//GEN-LAST:event_menuItemListaExpedientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAdminIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdminIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdminIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdminIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdminIU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menuItemAcercaDe;
    private javax.swing.JMenuItem menuItemAdministrativo;
    private javax.swing.JMenuItem menuItemAlumno;
    private javax.swing.JMenuItem menuItemDocente;
    private javax.swing.JMenuItem menuItemListaAdministrativos;
    private javax.swing.JMenuItem menuItemListaAlumnos;
    private javax.swing.JMenuItem menuItemListaAlumnosMatriculados;
    private javax.swing.JMenuItem menuItemListaCursos;
    private javax.swing.JMenuItem menuItemListaDocentes;
    private javax.swing.JMenuItem menuItemListaExpedientes;
    private javax.swing.JMenuItem menuItemNuevoCurso;
    private javax.swing.JMenuItem menuItemRegistrarExpediente;
    private javax.swing.JMenuItem menuItemRegistrarMatricula;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenu menuListaPersonas;
    // End of variables declaration//GEN-END:variables
}
