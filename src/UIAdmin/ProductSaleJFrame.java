/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIAdmin;

import DAO.StatisticalDAO;
import Entity.Turnover;
import Utils.MsgBox;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dantr
 */
public class ProductSaleJFrame extends javax.swing.JFrame {

	StatisticalDAO dao = new StatisticalDAO();

	/**
	 * Creates new form ProductSaleJFrame
	 */
	public ProductSaleJFrame() {
		initComponents();
		init();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tblProSale = new javax.swing.JTable();
                jdtDateOrder = new com.toedter.calendar.JDateChooser();
                jLabel1 = new javax.swing.JLabel();
                btnTim = new javax.swing.JButton();
                btnShowAll = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                tblProSale.setBackground(new java.awt.Color(255, 255, 255));
                tblProSale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                tblProSale.setForeground(new java.awt.Color(255, 102, 255));
                tblProSale.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "IDProduct", "ProductName", "Quantity Sold", "Turnover"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblProSale.setRowHeight(25);
                jScrollPane1.setViewportView(tblProSale);

                jdtDateOrder.setBackground(new java.awt.Color(255, 255, 255));
                jdtDateOrder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 51, 255)));
                jdtDateOrder.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jdtDateOrderMouseClicked(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 102, 255));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("DATE");

                btnTim.setBackground(new java.awt.Color(255, 153, 255));
                btnTim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btnTim.setForeground(new java.awt.Color(255, 255, 255));
                btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search.png"))); // NOI18N
                btnTim.setText("SEARCH");
                btnTim.setMaximumSize(new java.awt.Dimension(111, 51));
                btnTim.setMinimumSize(new java.awt.Dimension(111, 51));
                btnTim.setPreferredSize(new java.awt.Dimension(111, 51));
                btnTim.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTimActionPerformed(evt);
                        }
                });

                btnShowAll.setBackground(new java.awt.Color(255, 153, 255));
                btnShowAll.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btnShowAll.setForeground(new java.awt.Color(255, 255, 255));
                btnShowAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/List (2).png"))); // NOI18N
                btnShowAll.setText("SHOW ALL");
                btnShowAll.setMaximumSize(new java.awt.Dimension(111, 51));
                btnShowAll.setMinimumSize(new java.awt.Dimension(111, 51));
                btnShowAll.setPreferredSize(new java.awt.Dimension(111, 51));
                btnShowAll.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnShowAllActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jdtDateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jdtDateOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jdtDateOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdtDateOrderMouseClicked
                // TODO add your handling code here:
        }//GEN-LAST:event_jdtDateOrderMouseClicked

        private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
                // TODO add your handling code here:
		fillTableTurnover();
               
        }//GEN-LAST:event_btnTimActionPerformed

        private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
                // TODO add your handling code here:
		fillTableTurnoverAll();
        }//GEN-LAST:event_btnShowAllActionPerformed

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
			java.util.logging.Logger.getLogger(ProductSaleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ProductSaleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ProductSaleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ProductSaleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ProductSaleJFrame().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnShowAll;
        private javax.swing.JButton btnTim;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private com.toedter.calendar.JDateChooser jdtDateOrder;
        private javax.swing.JTable tblProSale;
        // End of variables declaration//GEN-END:variables
	
	private void init() {
		fillTableTurnoverAll();
		setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.WHITE);

	}

	private void fillTableTurnover() {
		Date Dateod;
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		DefaultTableModel model = (DefaultTableModel) tblProSale.getModel();
		model.setRowCount(0);
		try {
			String a = f.format(jdtDateOrder.getDate());
			Dateod = new SimpleDateFormat("yyyy-MM-dd").parse(a);
			List<Object[]> list = dao.getTurnover(Dateod);
			for (Object[] row : list) {
				model.addRow(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void fillTableTurnoverAll() {
		DefaultTableModel model = (DefaultTableModel) tblProSale.getModel();
		model.setRowCount(0);
		try {
			List<Turnover> list = dao.selectALL();
			for (Turnover dt : list) {
				Object[] row = {dt.getIDProduct(), dt.getProductName(), dt.getQuantitySold(), dt.getTurnover()};
				model.addRow(row);
			}
		} catch (Exception e) {
			MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
		}
	}

}
