package UI.panels;

import UI.model.ModelStudent;
import UI.searchBar.SearchOption;
import UI.searchBar.SearchOptionEvent;
import UI.swing.table.ModelProfile;
import controller.DAO_admin;
import controller.DAO_sv;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.DefaultRowSorter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import model.Account;
import model.CustomTableCellRenderer;
import model.Subject;
import model.TopStudent;
import model.TopStudent2;
import view.compareView;
import view.compareView2;

public class rank2Panel extends javax.swing.JPanel {

    private Account acc;
    private ArrayList< TopStudent2> dsTopSv = new ArrayList<>();
    DefaultTableModel model;
    int stt;    
    int order;
    public rank2Panel(Account acc) throws SQLException {
        initComponents();
        this.acc = acc;
        order = cbBox.getSelectedIndex();
        this.dsTopSv = new DAO_sv().getTopSvbyTinchiTichLuy(order);
        setTable();
        showTable();
        setSearchBar();
    }
    
    private void setSearchBar(){
        txt_search.addEventOptionSelected(new SearchOptionEvent() {
            @Override
            public void optionSelected(SearchOption option, int index) {
                txt_search.setHint("Search by " + option.getName() + "...");
            }
        });
        txt_search.addOption(new SearchOption("User name", new ImageIcon(getClass().getResource("/icon/name-25.png"))));
        txt_search.addOption(new SearchOption("University", new ImageIcon(getClass().getResource("/icon/university-25.png"))));
        txt_search.addOption(new SearchOption("City", new ImageIcon(getClass().getResource("/icon/city-25.png"))));        
    }
    private void setTable(){
        model = (DefaultTableModel) table1.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Hạng", "Tên", "Số tín tích lũy", 
            "Số tín đăng ký","Tỉ lệ hoàn thành", "Số tín nợ","Trường", "Tỉnh"
        });
        table1.getColumnModel().getColumn(0).setPreferredWidth(45); // hạng
        table1.getColumnModel().getColumn(1).setPreferredWidth(170); // tên
        table1.getColumnModel().getColumn(2).setPreferredWidth(80);  // tín tích lũy
        table1.getColumnModel().getColumn(3).setPreferredWidth(85); // tín đăng ký 
        table1.getColumnModel().getColumn(4).setPreferredWidth(95); // tỉ lệ hoàn thành
        table1.getColumnModel().getColumn(5).setPreferredWidth(75); // tín nợ
        table1.getColumnModel().getColumn(6).setPreferredWidth(180); // trường
        table1.getColumnModel().getColumn(7).setPreferredWidth(110); //tỉnh
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        JTableHeader header = table1.getTableHeader();
        header.setDefaultRenderer(centerRenderer);
        TableColumnModel columnModel = table1.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
           if(i != 1){
               table1.getColumnModel().getColumn(i).setCellRenderer( new CustomTableCellRenderer());
          }
        }
        
    }
    
    private void showTable() throws SQLException{
        stt = 1;
        for(TopStudent2 account : dsTopSv) {
            table1.addRow(new ModelStudent(stt++, account.getAvatarImageIcon(), account.getName(), account.getSdt(), account.getSotinTichLuy(), account.getSotinDat(), account.getSotinNo(), account.getTruong(), account.getQueQuan()).toRowTable2());
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new UI.swing.table.Table();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        cbBox = new javax.swing.JComboBox<>();
        txt_search = new UI.searchBar.TextFieldSearchOption();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1025, 466));
        setRequestFocusEnabled(false);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hạng", "Tên", "Số tín tích lũy", "Số tín đăng ký", "tỉ lệ hoàn thành", "Số tín nợ", "Trường", "Tỉnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jLabel2.setBackground(new java.awt.Color(251, 251, 251));
        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Leader Board");
        jLabel2.setOpaque(true);
        jScrollPane2.setViewportView(jLabel2);

        cbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Số tín chỉ tích lũy", "Số tín chỉ đăng ký", "Tỷ lệ hoàn thành" }));
        cbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBoxActionPerformed(evt);
            }
        });

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1013, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBoxActionPerformed
        try {
            resetRankPanel();
        } catch (SQLException ex) {
            Logger.getLogger(rank2Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbBoxActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed

    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        if(txt_search.isSelected()){
            int option = txt_search.getSelectedIndex();
            String keyword = txt_search.getText().toLowerCase();  // lấy giá trị từ ô search
            DefaultTableModel tableModel = (DefaultTableModel) table1.getModel();
            DefaultRowSorter<DefaultTableModel, Integer> sorter = new TableRowSorter<>(tableModel); // Tạo một DefaultRowSorter với DefaultTableModel
            table1.setRowSorter(sorter);
            if(option == 0){ // tìm theo tên
                // Đặt bộ lọc cho DefaultRowSorter
                RowFilter<DefaultTableModel, Integer> filter = new RowFilter<DefaultTableModel, Integer>() {
                    @Override
                    public boolean include(Entry<? extends DefaultTableModel, ? extends Integer> entry) {
                        int columnToFilter = 1;  // chỉ số cột 1
                        CustomRowFilter customFilter = new CustomRowFilter();
                        return customFilter.include(entry);
                    }
                };
                sorter.setRowFilter(filter);   
            }
            else if(option == 1){ // tìm theo trường
                RowFilter<DefaultTableModel, Integer> filter = RowFilter.regexFilter("(?i)" + keyword, 6); // Đặt bộ lọc cho DefaultRowSorter
                sorter.setRowFilter(filter);                
            }
            else if(option == 2){ // tìm theo tỉnh
                RowFilter<DefaultTableModel, Integer> filter = RowFilter.regexFilter("(?i)" + keyword, 7); // Đặt bộ lọc cho DefaultRowSorter
                sorter.setRowFilter(filter);
            }
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int row = table1.rowAtPoint(evt.getPoint());
        int col = table1.columnAtPoint(evt.getPoint());
        // Check if right mouse button is clicked
        if (row >= 0 && col >= 0 && SwingUtilities.isRightMouseButton(evt)){
            Object profileCell = model.getValueAt(row, 1);
            if (profileCell instanceof ModelProfile) {
                ModelProfile profile = (ModelProfile) profileCell; // Ép kiểu thành ModelProfile
                if(acc.getSdt().equals(profile.getSdt())){
                    return;
                }
                else{
                    compareView2 cpView = null;
                    try {
                        cpView = new compareView2(acc, new DAO_sv().getAccBySdt(profile.getSdt()));
                    } catch (SQLException ex) {
                        Logger.getLogger(rank2Panel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    cpView.setVisible(true);
                    cpView.setLocationRelativeTo(null);
                    cpView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
                }
            }
        }
    }//GEN-LAST:event_table1MouseClicked

    public void resetRankPanel() throws SQLException{
        if(model != null){
            order = cbBox.getSelectedIndex(); 
            System.out.println(order);
            model.setRowCount(0);
            dsTopSv = new DAO_sv().getTopSvbyTinchiTichLuy(order);
            model = (DefaultTableModel) table1.getModel();
            model.setColumnIdentifiers(new Object[]{
            "Hạng", "Tên", "Số tín tích lũy", 
            "Số tín đăng ký","Tỉ lệ hoàn thành", "Số tín nợ","Trường", "Tỉnh"});
            setTable();
            showTable();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private UI.swing.table.Table table1;
    private UI.searchBar.TextFieldSearchOption txt_search;
    // End of variables declaration//GEN-END:variables
    public class CustomRowFilter extends RowFilter<Object, Object> {
        @Override
        public boolean include(RowFilter.Entry<? extends Object, ? extends Object> entry) {
            Object value = entry.getValue(1); // Lấy giá trị từ cột 1 (chứa kiểu dữ liệu ModelProfile)
            if (value instanceof ModelProfile) {
                ModelProfile modelProfile = (ModelProfile) value;
                String name = modelProfile.getName().toLowerCase(); // Lấy thuộc tính "name" từ ModelProfile
                String keyword = txt_search.getText().toLowerCase(); // Lấy từ khóa tìm kiếm từ ô search

                return name.contains(keyword);
            }
            return false;
        }
    }
}
