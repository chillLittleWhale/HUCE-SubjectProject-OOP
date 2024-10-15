package view;

import model.*;
import controller.*;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Admin_view extends javax.swing.JFrame {
    private ArrayList< Univercity> dsTruong;
    private ArrayList< Majors> dsNganh;
    private ArrayList< Subject> dsMon;
    private ArrayList< Account> dsSV;
    DefaultTableModel modelTruong;
    DefaultTableModel modelNganh;
    DefaultTableModel modelMon;
    DefaultTableModel modelSV;
    int slRowTruong;
    int slRowNganh;
    int slRowMon;
    int slRowSV;
    
    public Admin_view() {
        initComponents();
        this.setLocationRelativeTo(null);
        dsTruong = new DAO_admin().getUniList();
        dsNganh = new DAO_admin().getMajList();
        dsMon = new DAO_admin().getSubList();
        dsSV = new DAO_sv().getAccSvList();
        setTableTruong();
        setTableNganh();
        setTableMon();
        setTableSV();
        showTableTruong();
        showTableNganh();
        showTableMon();
        showTableSV();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_truong = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_IdTruong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_TenTruong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_DchiTruong = new javax.swing.JTextField();
        bnt_addTruong = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txt_searchTruong = new javax.swing.JTextField();
        btn_searchTruong = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbBoxTruong = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btn_renewTruong = new javax.swing.JButton();
        btn_xoaTruong = new javax.swing.JButton();
        btn_updateTruong = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_nganh = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_IdNganh = new javax.swing.JTextField();
        txt_tenNganh = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_addNganh = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        cbBoxNganh = new javax.swing.JComboBox<>();
        txt_searchNganh = new javax.swing.JTextField();
        btn_searchNganh = new javax.swing.JButton();
        btn_renewNganh = new javax.swing.JButton();
        btn_xoaNganh = new javax.swing.JButton();
        btn_updateNganh = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_thuocKhoa = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_mon = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txt_IdMon = new javax.swing.JTextField();
        txt_TenMon = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_addMon = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        cbBoxMon = new javax.swing.JComboBox<>();
        txt_searchMon = new javax.swing.JTextField();
        btn_searchMon = new javax.swing.JButton();
        btn_renewMon = new javax.swing.JButton();
        btn_xoaMon = new javax.swing.JButton();
        btn_updateMon = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_sv = new javax.swing.JTable();
        txt_searchSv = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_tenSv = new javax.swing.JTextField();
        txt_gioiTinh = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        txt_queQuan = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_nganhSv = new javax.swing.JTextField();
        txt_truongSv = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_themSv = new javax.swing.JButton();
        btn_suaSv = new javax.swing.JButton();
        btn_xoaSv = new javax.swing.JButton();
        btn_renewSv = new javax.swing.JButton();
        btn_searchSv = new javax.swing.JButton();
        cbBoxSv = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alpha access level");
        setResizable(false);

        table_truong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Trường", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_truong.setMinimumSize(new java.awt.Dimension(10, 0));
        table_truong.getTableHeader().setReorderingAllowed(false);
        table_truong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_truongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_truong);
        if (table_truong.getColumnModel().getColumnCount() > 0) {
            table_truong.getColumnModel().getColumn(0).setMinWidth(20);
            table_truong.getColumnModel().getColumn(0).setPreferredWidth(20);
            table_truong.getColumnModel().getColumn(1).setMinWidth(20);
            table_truong.getColumnModel().getColumn(1).setPreferredWidth(20);
            table_truong.getColumnModel().getColumn(2).setPreferredWidth(170);
            table_truong.getColumnModel().getColumn(3).setPreferredWidth(230);
        }

        jLabel1.setText("ID trường :");

        jLabel2.setText("Tên trường :");

        jLabel3.setText("Địa chỉ :");

        bnt_addTruong.setText("Thêm");
        bnt_addTruong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_addTruongActionPerformed(evt);
            }
        });

        txt_searchTruong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchTruongActionPerformed(evt);
            }
        });
        txt_searchTruong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchTruongKeyReleased(evt);
            }
        });

        btn_searchTruong.setText("Tìm");
        btn_searchTruong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchTruongActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Tìm kiếm");

        cbBoxTruong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên", "Địa chỉ" }));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setText("Thêm mới");

        btn_renewTruong.setText("Làm mới");
        btn_renewTruong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_renewTruongActionPerformed(evt);
            }
        });
        btn_renewTruong.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                btn_renewTruongVetoableChange(evt);
            }
        });

        btn_xoaTruong.setText("Xóa");
        btn_xoaTruong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaTruongActionPerformed(evt);
            }
        });

        btn_updateTruong.setText("Cập nhật");
        btn_updateTruong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateTruongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btn_xoaTruong, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(31, 31, 31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_IdTruong, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_TenTruong, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_DchiTruong, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(bnt_addTruong, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(btn_updateTruong))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(139, 139, 139)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbBoxTruong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(txt_searchTruong, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btn_searchTruong, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_renewTruong)
                .addGap(223, 223, 223))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_renewTruong))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_IdTruong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_TenTruong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_DchiTruong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnt_addTruong)
                            .addComponent(btn_updateTruong)
                            .addComponent(btn_xoaTruong))
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbBoxTruong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_searchTruong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btn_searchTruong)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("quản lý trường", jPanel1);

        table_nganh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Ngành học", "Thuộc khoa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_nganh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_nganhMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_nganh);
        if (table_nganh.getColumnModel().getColumnCount() > 0) {
            table_nganh.getColumnModel().getColumn(0).setPreferredWidth(15);
            table_nganh.getColumnModel().getColumn(1).setPreferredWidth(50);
            table_nganh.getColumnModel().getColumn(2).setPreferredWidth(170);
            table_nganh.getColumnModel().getColumn(3).setPreferredWidth(170);
        }

        jLabel6.setText("ID ngành :");

        jLabel7.setText("Tên ngành :");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setText("Thêm mới");

        btn_addNganh.setText("Thêm");
        btn_addNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addNganhActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setText("Tìm kiếm");

        cbBoxNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên", "Khoa" }));

        txt_searchNganh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchNganhKeyReleased(evt);
            }
        });

        btn_searchNganh.setText("Tìm");
        btn_searchNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchNganhActionPerformed(evt);
            }
        });

        btn_renewNganh.setText("Làm mới");
        btn_renewNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_renewNganhActionPerformed(evt);
            }
        });

        btn_xoaNganh.setText("Xóa");
        btn_xoaNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaNganhActionPerformed(evt);
            }
        });

        btn_updateNganh.setText("Cập nhật");
        btn_updateNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateNganhActionPerformed(evt);
            }
        });

        jLabel10.setText("Thuộc khoa :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel9)
                            .addGap(50, 50, 50)
                            .addComponent(cbBoxNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addComponent(jLabel8))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btn_xoaNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addGap(40, 40, 40)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_addNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_IdNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(109, 109, 109)
                                    .addComponent(btn_updateNganh))
                                .addComponent(txt_thuocKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_tenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(txt_searchNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btn_searchNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_renewNganh)
                .addGap(191, 191, 191))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_IdNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_tenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_thuocKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xoaNganh)
                    .addComponent(btn_addNganh)
                    .addComponent(btn_updateNganh))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbBoxNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txt_searchNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_searchNganh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_renewNganh)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("quản lý ngành học", jPanel2);

        table_mon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Môn học"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_mon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_monMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_mon);
        if (table_mon.getColumnModel().getColumnCount() > 0) {
            table_mon.getColumnModel().getColumn(0).setPreferredWidth(15);
            table_mon.getColumnModel().getColumn(1).setPreferredWidth(50);
            table_mon.getColumnModel().getColumn(2).setPreferredWidth(170);
        }

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel11.setText("Thêm mới");

        txt_TenMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenMonActionPerformed(evt);
            }
        });

        jLabel12.setText("ID môn :");

        jLabel13.setText("Tên môn :");

        btn_addMon.setText("Thêm ");
        btn_addMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addMonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel14.setText("Tìm kiếm");

        cbBoxMon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên" }));

        txt_searchMon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchMonKeyReleased(evt);
            }
        });

        btn_searchMon.setText("Tìm");
        btn_searchMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchMonActionPerformed(evt);
            }
        });

        btn_renewMon.setText("Làm mới");
        btn_renewMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_renewMonActionPerformed(evt);
            }
        });

        btn_xoaMon.setText("Xóa");
        btn_xoaMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaMonActionPerformed(evt);
            }
        });

        btn_updateMon.setText("Cập nhật");
        btn_updateMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateMonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(btn_xoaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_IdMon, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)
                                        .addComponent(txt_TenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(btn_addMon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(48, 48, 48)
                                            .addComponent(btn_updateMon))))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(203, 203, 203))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96)))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addComponent(jLabel14)
                            .addGap(54, 54, 54)
                            .addComponent(cbBoxMon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(txt_searchMon, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btn_searchMon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_renewMon)
                .addGap(184, 184, 184))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_IdMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TenMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addMon)
                    .addComponent(btn_xoaMon)
                    .addComponent(btn_updateMon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbBoxMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txt_searchMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_searchMon)
                .addGap(92, 92, 92))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_renewMon)
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("quản lý môn học", jPanel3);

        table_sv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Họ tên", "Giới tính", "Ngày sinh", "Quê quán", "Ngành", "Trường", "Số điện thoại", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_sv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_svMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_svMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(table_sv);
        if (table_sv.getColumnModel().getColumnCount() > 0) {
            table_sv.getColumnModel().getColumn(0).setPreferredWidth(5);
            table_sv.getColumnModel().getColumn(1).setPreferredWidth(100);
            table_sv.getColumnModel().getColumn(2).setPreferredWidth(50);
            table_sv.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        txt_searchSv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchSvKeyReleased(evt);
            }
        });

        jLabel15.setText("Họ tên :");

        jLabel16.setText("Giới tính :");

        jLabel17.setText("Ngày sinh :");

        jLabel18.setText("Quê quán :");

        jLabel19.setText("Ngành :");

        jLabel20.setText("Trường :");

        jLabel21.setText("Số điện thoại :");

        jLabel22.setText("Email :");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btn_themSv.setText("Thêm");
        btn_themSv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themSvActionPerformed(evt);
            }
        });

        btn_suaSv.setText("Cập nhật");
        btn_suaSv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaSvActionPerformed(evt);
            }
        });

        btn_xoaSv.setText("Xóa");
        btn_xoaSv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaSvActionPerformed(evt);
            }
        });

        btn_renewSv.setText("Làm mới");
        btn_renewSv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_renewSvActionPerformed(evt);
            }
        });

        btn_searchSv.setText("Tìm kiếm");
        btn_searchSv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchSvActionPerformed(evt);
            }
        });

        cbBoxSv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Họ tên", "Giới tính", "Ngày sinh", "Quê quán", "Ngành ", "Trường", "SDT", "Email", " " }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_queQuan, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txt_dob)
                            .addComponent(txt_tenSv)
                            .addComponent(txt_gioiTinh))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_searchSv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_nganhSv, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_truongSv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_sdt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(105, 105, 105)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_suaSv, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_themSv, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_xoaSv, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_renewSv))
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_searchSv, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbBoxSv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_searchSv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchSv)
                    .addComponent(cbBoxSv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel19)
                            .addComponent(txt_tenSv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nganhSv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txt_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(txt_truongSv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txt_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(btn_themSv)
                            .addGap(18, 18, 18)
                            .addComponent(btn_suaSv)
                            .addGap(18, 18, 18)
                            .addComponent(btn_xoaSv)
                            .addGap(18, 18, 18)
                            .addComponent(btn_renewSv))))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("quản lý sinh viên", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void setTableTruong(){
        modelTruong = (DefaultTableModel) table_truong.getModel();
        modelTruong.setColumnIdentifiers(new Object[]{
            "STT", "ID", "Trường", "Địa chỉ"
        });
        table_truong.getColumnModel().getColumn(0).setPreferredWidth(15);
        table_truong.getColumnModel().getColumn(1).setPreferredWidth(20);
        table_truong.getColumnModel().getColumn(2).setPreferredWidth(170);
        table_truong.getColumnModel().getColumn(3).setPreferredWidth(250);
    }
    public void setTableNganh(){
        modelNganh = (DefaultTableModel) table_nganh.getModel();
        modelNganh.setColumnIdentifiers(new Object[]{
            "STT", "ID", "Ngành học", "Thuộc khoa"
        });
        table_nganh.getColumnModel().getColumn(0).setPreferredWidth(15);
        table_nganh.getColumnModel().getColumn(1).setPreferredWidth(50);
        table_nganh.getColumnModel().getColumn(2).setPreferredWidth(170);
        table_nganh.getColumnModel().getColumn(3).setPreferredWidth(170);
    }
    
    public void setTableMon(){
        modelMon = (DefaultTableModel) table_mon.getModel();
        modelMon.setColumnIdentifiers(new Object[]{
            "STT", "ID", "Môn học"
        });
        table_mon.getColumnModel().getColumn(0).setPreferredWidth(15);
        table_mon.getColumnModel().getColumn(1).setPreferredWidth(50);
        table_mon.getColumnModel().getColumn(2).setPreferredWidth(170);
    }
    public void setTableSV(){
        modelSV = (DefaultTableModel) table_sv.getModel();
        modelSV.setColumnIdentifiers(new Object[]{
            "STT", "Họ tên", "Giới tính", "Ngày sinh", "Quê quán", "Ngành", "Trường", "Số điện thoại", "Email"
        });
        table_sv.getColumnModel().getColumn(0).setPreferredWidth(15);
        table_sv.getColumnModel().getColumn(1).setPreferredWidth(100);
        table_sv.getColumnModel().getColumn(2).setPreferredWidth(40);
        table_sv.getColumnModel().getColumn(3).setPreferredWidth(70);
        table_sv.getColumnModel().getColumn(4).setPreferredWidth(60);
        table_sv.getColumnModel().getColumn(5).setPreferredWidth(130);
        table_sv.getColumnModel().getColumn(6).setPreferredWidth(150);
        table_sv.getColumnModel().getColumn(7).setPreferredWidth(70);
        table_sv.getColumnModel().getColumn(8).setPreferredWidth(120);
    }
    int sttTruong ;
    public void showTableTruong(){
        sttTruong = 1;
        for (Univercity uni : dsTruong) {
            modelTruong.addRow(new Object[]{
            sttTruong++, uni.getIdTruong(), uni.getTenTruong(), uni.getDchiTruong()});
        }
    }
    public void showResultTruong(){
        Univercity uni = dsTruong.get(dsTruong.size()-1);
        modelTruong.addRow(new Object[]{
            sttTruong++, uni.getIdTruong(), uni.getTenTruong(), uni.getDchiTruong()});
    }
    
    int sttNganh ;
    public void showTableNganh(){
        sttNganh = 1;
        for (Majors maj : dsNganh) {
            modelNganh.addRow(new Object[]{
            sttNganh++, maj.getIdNganh(), maj.getTenNganh(), maj.getThuocKhoa()});
        }
    }
    
    public void showResultNganh(){
        Majors maj = dsNganh.get(dsNganh.size()-1);
        modelNganh.addRow(new Object[]{
            sttNganh++, maj.getIdNganh(), maj.getTenNganh(), maj.getThuocKhoa()});
    }
    
    int sttMon ;
    public void showTableMon(){
        sttMon = 1;
        for (Subject sub : dsMon) {
            modelMon.addRow(new Object[]{
            sttMon++, sub.getIdMon(), sub.getTenMon()} );
        }
    }
    public void showResultMon(){
        Subject sub = dsMon.get(dsMon.size()-1);
        modelMon.addRow(new Object[]{
            sttMon++, sub.getIdMon(), sub.getTenMon()});
    }
    
    int sttSV ;
    public void showTableSV(){
        sttSV = 1;
        for (Account acc : dsSV) {
            String gioiTinh = acc.getGioiTinh() ? "nam" : "nữ";
            modelSV.addRow(new Object[]{
                sttSV++, acc.getName(), gioiTinh, acc.getNgaySinh(),acc.getQueQuan(), 
                acc.getNganh(), acc.getTruong(), acc.getSdt(), acc.getEmail()});
        }
    }
    public void showResultSV(){
        Account acc = dsSV.get(dsSV.size()-1);
        String gioiTinh = acc.getGioiTinh() ? "nam" : "nữ";
        modelSV.addRow(new Object[]{
            sttSV++, acc.getName(), gioiTinh, acc.getNgaySinh(),acc.getQueQuan(), 
            acc.getNganh(), acc.getTruong(), acc.getSdt(), acc.getEmail()});
    }
    private void txt_searchTruongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchTruongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchTruongActionPerformed

    private void txt_TenMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenMonActionPerformed

    private void bnt_addTruongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_addTruongActionPerformed
        if(!txt_IdTruong.getText().equals("")
                && !txt_TenTruong.getText().equals("")
                && !txt_DchiTruong.getText().equals("")){
            Univercity uni = new Univercity(txt_IdTruong.getText(),
                    txt_TenTruong.getText(), txt_DchiTruong.getText());
            if( new DAO_admin().addUnivercity(uni)){
                JOptionPane.showMessageDialog(rootPane, "them thanh cong");
                dsTruong.add(uni);
                showResultTruong();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Id truong khong duoc trung");
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Thông tin không được bỏ trống");
        }
        
    }//GEN-LAST:event_bnt_addTruongActionPerformed

    private void table_truongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_truongMouseClicked
        slRowTruong = table_truong.getSelectedRow();
        txt_IdTruong.setText(modelTruong.getValueAt(slRowTruong, 1).toString());
        txt_TenTruong.setText(modelTruong.getValueAt(slRowTruong, 2).toString());
        txt_DchiTruong.setText(modelTruong.getValueAt(slRowTruong, 3).toString());
    }//GEN-LAST:event_table_truongMouseClicked

    private void btn_updateTruongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateTruongActionPerformed
        Univercity uni = new Univercity(txt_IdTruong.getText(),
                txt_TenTruong.getText(), txt_DchiTruong.getText());
        if( new DAO_admin().updateUnivercity(uni)){
            JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công");
            modelTruong.setValueAt(txt_TenTruong.getText(), slRowTruong, 2);
            modelTruong.setValueAt(txt_DchiTruong.getText(), slRowTruong, 3);
        } else {
            JOptionPane.showMessageDialog(rootPane, "ID trường không hợp lệ");
        }        
    }//GEN-LAST:event_btn_updateTruongActionPerformed

    private void btn_xoaTruongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaTruongActionPerformed
        if(!txt_IdTruong.getText().equals("")){
            Univercity uni = new Univercity(txt_IdTruong.getText(),
                    txt_TenTruong.getText(), txt_DchiTruong.getText());
            if( new DAO_admin().deleteUnivercity(uni)){
                modelTruong.setRowCount(0);
                dsTruong = new DAO_admin().getUniList();
                modelTruong = (DefaultTableModel) table_truong.getModel();
                modelTruong.setColumnIdentifiers(new Object[]{
                    "STT", "ID", "Trường", "Địa chỉ"
                });
                setTableTruong();
                showTableTruong();
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
            } else {
                JOptionPane.showMessageDialog(rootPane, "ID trường không hợp lệ");
            }
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn đối tượng");
        } 
    }//GEN-LAST:event_btn_xoaTruongActionPerformed

    private void btn_renewTruongVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_btn_renewTruongVetoableChange

    }//GEN-LAST:event_btn_renewTruongVetoableChange

    private void btn_renewTruongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_renewTruongActionPerformed
        modelTruong.setRowCount(0);
        dsTruong = new DAO_admin().getUniList();
        modelTruong = (DefaultTableModel) table_truong.getModel();
        modelTruong.setColumnIdentifiers(new Object[]{
            "STT", "ID", "Trường", "Địa chỉ"
        });
        setTableTruong();
        showTableTruong();
    }//GEN-LAST:event_btn_renewTruongActionPerformed

    private void btn_searchTruongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchTruongActionPerformed
        String selectedValue = cbBoxTruong.getSelectedItem().toString();
        
        if(selectedValue.equals("ID")){
            dsTruong = new DAO_admin().timTruongTheoMa(txt_searchTruong.getText());
        }
        else if(selectedValue.equals("Tên")){
            try {
                dsTruong = new DAO_admin().timTruongTheoTen(txt_searchTruong.getText());
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Admin_view.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            try {
                dsTruong = new DAO_admin().timTruongTheoDchi(txt_searchTruong.getText());
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Admin_view.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        setTableTruong();
        modelTruong.setRowCount(0);
        showTableTruong();
    }//GEN-LAST:event_btn_searchTruongActionPerformed

    private void btn_addMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addMonActionPerformed
        if(!txt_IdMon.getText().equals("")
                && !txt_TenMon.getText().equals("")){
            Subject sub = new Subject(txt_IdMon.getText(),txt_TenMon.getText());
            if( new DAO_admin().addSubject(sub)){
                JOptionPane.showMessageDialog(rootPane, "thêm môn học thành công");
                dsMon.add(sub);
                showResultMon();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Id môn không được trùng");
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Thông tin không được bỏ trống");
        }
    }//GEN-LAST:event_btn_addMonActionPerformed

    private void table_nganhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_nganhMouseClicked
        slRowNganh = table_nganh.getSelectedRow();
        txt_IdNganh.setText(modelNganh.getValueAt(slRowNganh, 1).toString());
        txt_tenNganh.setText(modelNganh.getValueAt(slRowNganh, 2).toString());
        txt_thuocKhoa.setText(modelNganh.getValueAt(slRowNganh, 3).toString());
    }//GEN-LAST:event_table_nganhMouseClicked

    private void btn_addNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addNganhActionPerformed
        if(!txt_IdNganh.getText().equals("")
                && !txt_tenNganh.getText().equals("")
                && !txt_thuocKhoa.getText().equals("")){
            Majors maj = new Majors(txt_IdNganh.getText(),
                    txt_tenNganh.getText(), txt_thuocKhoa.getText());
            if( new DAO_admin().addMajors(maj)){
                JOptionPane.showMessageDialog(rootPane, "Thêm ngành thành công");
                dsNganh.add(maj);
                showResultNganh();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Id ngành không được trùng");
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Thông tin không được bỏ trống");
        }
    }//GEN-LAST:event_btn_addNganhActionPerformed

    private void btn_renewNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_renewNganhActionPerformed
        modelNganh.setRowCount(0);
        dsNganh = new DAO_admin().getMajList();
        modelNganh = (DefaultTableModel) table_nganh.getModel();
        modelNganh.setColumnIdentifiers(new Object[]{
            "STT", "ID", "Ngành học", "Thuộc khoa"
        });
        setTableNganh();
        showTableNganh();
    }//GEN-LAST:event_btn_renewNganhActionPerformed

    private void btn_updateNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateNganhActionPerformed
        Majors maj = new Majors(txt_IdNganh.getText(),
                txt_tenNganh.getText(), txt_thuocKhoa.getText());
        if( new DAO_admin().updateMajors(maj)){
            JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công");
            modelNganh.setValueAt(txt_tenNganh.getText(), slRowNganh, 2);
            modelNganh.setValueAt(txt_thuocKhoa.getText(), slRowNganh, 3);
        } else {
            JOptionPane.showMessageDialog(rootPane, "ID ngành không hợp lệ");
        }
    }//GEN-LAST:event_btn_updateNganhActionPerformed

    private void btn_xoaNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaNganhActionPerformed
        if(!txt_IdNganh.getText().equals("")){
            Majors maj = new Majors(txt_IdNganh.getText(),
                    txt_tenNganh.getText(), txt_thuocKhoa.getText());
            if( new DAO_admin().deleteMajors(maj)){
                modelNganh.setRowCount(0);
                dsNganh = new DAO_admin().getMajList();
                modelNganh = (DefaultTableModel) table_nganh.getModel();
                modelNganh.setColumnIdentifiers(new Object[]{
                    "STT", "ID", "Ngành học", "Thuộc khoa"
                });
                setTableNganh();
                showTableNganh();
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
            } else {
                JOptionPane.showMessageDialog(rootPane, "ID ngành không hợp lệ");
            }
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn đối tượng");
        } 
    }//GEN-LAST:event_btn_xoaNganhActionPerformed

    private void btn_searchNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchNganhActionPerformed
        String selectedValue = cbBoxNganh.getSelectedItem().toString();
        if(selectedValue.equals("ID")){
            dsNganh = new DAO_admin().timNganhTheoMa(txt_searchNganh.getText());
        }
        else if(selectedValue.equals("Tên")){
            try {
                dsNganh = new DAO_admin().timNganhTheoTen(txt_searchNganh.getText());
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Admin_view.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(selectedValue.equals("Khoa")){
            try {
                dsNganh = new DAO_admin().timNganhTheoKhoa(txt_searchNganh.getText());
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Admin_view.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        setTableNganh();
        modelNganh.setRowCount(0);
        showTableNganh();
    }//GEN-LAST:event_btn_searchNganhActionPerformed

    private void table_monMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_monMouseClicked
        slRowMon = table_mon.getSelectedRow();
        txt_IdMon.setText(modelMon.getValueAt(slRowMon, 1).toString());
        txt_TenMon.setText(modelMon.getValueAt(slRowMon, 2).toString());
    }//GEN-LAST:event_table_monMouseClicked

    private void btn_xoaMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaMonActionPerformed
        if(!txt_IdMon.getText().equals("")){
            Subject sub = new Subject(txt_IdMon.getText(),
                    txt_TenMon.getText());
            if( new DAO_admin().deleteSubject(sub)){
                modelMon.setRowCount(0);
                dsMon = new DAO_admin().getSubList();
                modelMon = (DefaultTableModel) table_mon.getModel();
                modelMon.setColumnIdentifiers(new Object[]{"STT", "ID", "Môn học"});
                setTableMon();
                showTableMon();
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
            } else {
                JOptionPane.showMessageDialog(rootPane, "ID môn không hợp lệ");
            }
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn đối tượng");
        } 
    }//GEN-LAST:event_btn_xoaMonActionPerformed

    private void btn_updateMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateMonActionPerformed
        Subject sub = new Subject(txt_IdMon.getText(),txt_TenMon.getText());
        if( new DAO_admin().updateSubject(sub)){
            JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công");
            modelMon.setValueAt(txt_TenMon.getText(), slRowMon, 2);
        } else {
            JOptionPane.showMessageDialog(rootPane, "ID môn không hợp lệ");
        }
    }//GEN-LAST:event_btn_updateMonActionPerformed

    private void btn_searchMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchMonActionPerformed
        String selectedValue = cbBoxMon.getSelectedItem().toString();
        if(selectedValue.equals("ID")){
            dsMon = new DAO_admin().timMonTheoMa(txt_searchMon.getText());
        }
        else if(selectedValue.equals("Tên")){
            try {
                dsMon = new DAO_admin().timMonTheoTen(txt_searchMon.getText());
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Admin_view.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        setTableMon();
        modelMon.setRowCount(0);
        showTableMon();
    }//GEN-LAST:event_btn_searchMonActionPerformed

    private void btn_renewMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_renewMonActionPerformed
        modelMon.setRowCount(0);
        dsMon = new DAO_admin().getSubList();
        modelMon = (DefaultTableModel) table_mon.getModel();
        modelMon.setColumnIdentifiers(new Object[]{
            "STT", "ID", "Môn học"
        });
        setTableMon();
        showTableMon();
    }//GEN-LAST:event_btn_renewMonActionPerformed

    private void table_svMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_svMouseClicked
        if(selectedCol != -1 && selectedRow != -1){
            slRowSV = table_sv.getSelectedRow();
            txt_tenSv.setText(modelSV.getValueAt(slRowSV, 1).toString());
            txt_gioiTinh.setText(modelSV.getValueAt(slRowSV, 2).toString());
            txt_dob.setText(modelSV.getValueAt(slRowSV, 3).toString());
            txt_queQuan.setText(modelSV.getValueAt(slRowSV, 4).toString());
            txt_nganhSv.setText(modelSV.getValueAt(slRowSV, 5).toString());
            txt_truongSv.setText(modelSV.getValueAt(slRowSV, 6).toString());
            txt_sdt.setText(modelSV.getValueAt(slRowSV, 7).toString());
            txt_email.setText(modelSV.getValueAt(slRowSV, 8).toString());
        }
        else{
            txt_tenSv.setText("");
            txt_gioiTinh.setText("");
            txt_dob.setText("");
            txt_queQuan.setText("");
            txt_nganhSv.setText("");
            txt_truongSv.setText("");
            txt_sdt.setText("");
            txt_email.setText("");
        }
        
    }//GEN-LAST:event_table_svMouseClicked

    private void btn_themSvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themSvActionPerformed
        if(!txt_tenSv.getText().isEmpty()&& !txt_sdt.getText().isEmpty()&& !txt_email.getText().isEmpty()){
            String gt = txt_gioiTinh.getText().toLowerCase();
            if(!gt.equals("nam") && !gt.equals("nữ")){
                JOptionPane.showMessageDialog(rootPane, "Có 2 giới tính nam và nữ, dcmbongay");
                return;
            }
            Account acc = new Account(txt_sdt.getText(),"defaultPass123",txt_email.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try {
                java.util.Date utilDate = dateFormat.parse(txt_dob.getText());
                acc.setNgaySinh(new java.sql.Date(utilDate.getTime()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            acc.setName(txt_tenSv.getText());
            acc.setGioiTinh(gt.equals("nam"));
            acc.setQueQuan(txt_queQuan.getText());
            acc.setNganh(txt_nganhSv.getText());
            acc.setTruong(txt_truongSv.getText());
            
            if( new DAO_sv().addAccount(acc)){
                JOptionPane.showMessageDialog(rootPane, "thêm sinh viên thành công");
                dsSV.add(acc);
                showResultSV();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sdt này đã được đăng ký");
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Thông tin tên, sdt, email không được bỏ trống");
        }
    }//GEN-LAST:event_btn_themSvActionPerformed

    private void btn_suaSvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaSvActionPerformed
        if(txt_sdt.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn đối tượng");
            return;
        }
        if(!modelSV.getValueAt(slRowSV, 7).toString().equals(txt_sdt.getText())){
            JOptionPane.showMessageDialog(rootPane, "không thể thay đổi số điện thoại", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String gt = txt_gioiTinh.getText().toLowerCase();
        Account acc = new Account();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            java.util.Date utilDate = dateFormat.parse(txt_dob.getText());
            acc.setNgaySinh(new java.sql.Date(utilDate.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        acc.setName(txt_tenSv.getText());
        acc.setGioiTinh( gt.equals("nam"));
        acc.setQueQuan(txt_queQuan.getText());
        acc.setNganh(txt_nganhSv.getText());
        acc.setTruong(txt_truongSv.getText());
        acc.setSdt(txt_sdt.getText());
        acc.setEmail(txt_email.getText());
        
        if( new DAO_sv().updateSinhVien(acc)){
            JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công");
            modelSV.setValueAt(txt_tenSv.getText(), slRowSV, 1);
            modelSV.setValueAt(txt_gioiTinh.getText(), slRowSV, 2);
            modelSV.setValueAt(txt_dob.getText(), slRowSV, 3);
            modelSV.setValueAt(txt_queQuan.getText(), slRowSV, 4);
            modelSV.setValueAt(txt_nganhSv.getText(), slRowSV, 5);
            modelSV.setValueAt(txt_truongSv.getText(), slRowSV, 6);
            modelSV.setValueAt(txt_email.getText(), slRowSV, 8);
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Cập nhật không thành công");
        }
    }//GEN-LAST:event_btn_suaSvActionPerformed

    private void btn_xoaSvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaSvActionPerformed
        if(!txt_sdt.getText().isEmpty()){
            Account acc = new Account();
            acc.setSdt(txt_sdt.getText());
            if( new DAO_sv().deleteSinhVien(acc)){
                modelSV.setRowCount(0);
                dsSV = new DAO_sv().getAccSvList();
                modelSV = (DefaultTableModel) table_sv.getModel();
                modelSV.setColumnIdentifiers(new Object[]{"STT", "Họ tên", "Giới tính", 
                    "Ngày sinh", "Quê quán", "Ngành", "Trường", "Số điện thoại", "Email"});
                setTableSV();
                showTableSV();
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Xóa không thành công");
            }
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn đối tượng");
        } 
    }//GEN-LAST:event_btn_xoaSvActionPerformed

    private void btn_renewSvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_renewSvActionPerformed
        modelSV.setRowCount(0);
        dsSV = new DAO_sv().getAccSvList();
        modelSV = (DefaultTableModel) table_sv.getModel();
        modelSV.setColumnIdentifiers(new Object[]{"STT", "Họ tên", "Giới tính", 
            "Ngày sinh", "Quê quán", "Ngành", "Trường", "Số điện thoại", "Email"});
        setTableSV();
        showTableSV();
    }//GEN-LAST:event_btn_renewSvActionPerformed

    private void btn_searchSvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchSvActionPerformed
        String selectedValue = cbBoxSv.getSelectedItem().toString();
        if(selectedValue.equals("Họ tên")){
            try {
                dsSV = new DAO_sv().timSvTheoTen(txt_searchSv.getText());
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Admin_view.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(selectedValue.equals("Giới tính")){
            String gt = txt_searchSv.getText().toLowerCase();
            if(!gt.equals("nam") && !gt.equals("nữ")){
                JOptionPane.showMessageDialog(rootPane, "chỉ có 2 loại giới tính: nam và nữ");
                return;
            }
            dsSV = new DAO_sv().timSvTheoGioiTinh(gt.equals("nam"));
        }
        else if(selectedValue.equals("Ngày sinh")){
            dsSV = new DAO_sv().timSvTheoNgaySinh(txt_searchSv.getText());
        }
        else if(selectedValue.equals("Quê quán")){
            try {
                dsSV = new DAO_sv().timSvTheoQueQuan(txt_searchSv.getText());
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Admin_view.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(selectedValue.equals("Ngành")){
            try {
                dsSV = new DAO_sv().timSvTheoNganh(txt_searchSv.getText());
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Admin_view.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(selectedValue.equals("Trường")){
            try {
                dsSV = new DAO_sv().timSvTheoTruong(txt_searchSv.getText());
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Admin_view.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(selectedValue.equals("SDT")){
            try {
                dsSV = new DAO_sv().timSvTheoSdt(txt_searchSv.getText());
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Admin_view.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(selectedValue.equals("Email")){
            try {
                dsSV = new DAO_sv().timSvTheoEmail(txt_searchSv.getText());
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Admin_view.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        setTableSV();
        modelSV.setRowCount(0);
        showTableSV();
    }//GEN-LAST:event_btn_searchSvActionPerformed

    private void txt_searchTruongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchTruongKeyReleased
        String keyword = txt_searchTruong.getText().toLowerCase();  // lấy giá trị từ ô search
        DefaultTableModel tableModel = (DefaultTableModel) table_truong.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
        table_truong.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + keyword));
    }//GEN-LAST:event_txt_searchTruongKeyReleased

    private void txt_searchNganhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchNganhKeyReleased
        String keyword = txt_searchNganh.getText().toLowerCase();  // lấy giá trị từ ô search
        DefaultTableModel tableModel = (DefaultTableModel) table_nganh.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
        table_nganh.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + keyword));
    }//GEN-LAST:event_txt_searchNganhKeyReleased

    private void txt_searchMonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchMonKeyReleased
        String keyword = txt_searchMon.getText().toLowerCase();  // lấy giá trị từ ô search
        DefaultTableModel tableModel = (DefaultTableModel) table_mon.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
        table_mon.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + keyword));
    }//GEN-LAST:event_txt_searchMonKeyReleased

    private void txt_searchSvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchSvKeyReleased
        String keyword = txt_searchSv.getText().toLowerCase();  // lấy giá trị từ ô search
        DefaultTableModel tableModel = (DefaultTableModel) table_sv.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
        table_sv.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + keyword));
    }//GEN-LAST:event_txt_searchSvKeyReleased

    private int selectedRow = -1;
    private int selectedCol = -1;
    private void table_svMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_svMousePressed
        int row = table_sv.rowAtPoint(evt.getPoint());
        int col = table_sv.columnAtPoint(evt.getPoint());
        // Check if the cell is valid and left mouse button is clicked
        if (row >= 0 && col >= 0 && SwingUtilities.isLeftMouseButton(evt)) {
            // If cell is already selected, then deselect it
            if (row == selectedRow && col == selectedCol) {
                table_sv.clearSelection();
                selectedRow = -1;
                selectedCol = -1;
            } else {
                // Otherwise, select the cell
    //            table_sv.setRowSelectionInterval(row, row);
    //            table_sv.setColumnSelectionInterval(col, col);
                table_sv.changeSelection(row, col, false, false);
                selectedRow = row;
                selectedCol = col;
            }
        }

    }//GEN-LAST:event_table_svMousePressed

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
            java.util.logging.Logger.getLogger(Admin_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_addTruong;
    private javax.swing.JButton btn_addMon;
    private javax.swing.JButton btn_addNganh;
    private javax.swing.JButton btn_renewMon;
    private javax.swing.JButton btn_renewNganh;
    private javax.swing.JButton btn_renewSv;
    private javax.swing.JButton btn_renewTruong;
    private javax.swing.JButton btn_searchMon;
    private javax.swing.JButton btn_searchNganh;
    private javax.swing.JButton btn_searchSv;
    private javax.swing.JButton btn_searchTruong;
    private javax.swing.JButton btn_suaSv;
    private javax.swing.JButton btn_themSv;
    private javax.swing.JButton btn_updateMon;
    private javax.swing.JButton btn_updateNganh;
    private javax.swing.JButton btn_updateTruong;
    private javax.swing.JButton btn_xoaMon;
    private javax.swing.JButton btn_xoaNganh;
    private javax.swing.JButton btn_xoaSv;
    private javax.swing.JButton btn_xoaTruong;
    private javax.swing.JComboBox<String> cbBoxMon;
    private javax.swing.JComboBox<String> cbBoxNganh;
    private javax.swing.JComboBox<String> cbBoxSv;
    private javax.swing.JComboBox<String> cbBoxTruong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable table_mon;
    private javax.swing.JTable table_nganh;
    private javax.swing.JTable table_sv;
    private javax.swing.JTable table_truong;
    private javax.swing.JTextField txt_DchiTruong;
    private javax.swing.JTextField txt_IdMon;
    private javax.swing.JTextField txt_IdNganh;
    private javax.swing.JTextField txt_IdTruong;
    private javax.swing.JTextField txt_TenMon;
    private javax.swing.JTextField txt_TenTruong;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_gioiTinh;
    private javax.swing.JTextField txt_nganhSv;
    private javax.swing.JTextField txt_queQuan;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_searchMon;
    private javax.swing.JTextField txt_searchNganh;
    private javax.swing.JTextField txt_searchSv;
    private javax.swing.JTextField txt_searchTruong;
    private javax.swing.JTextField txt_tenNganh;
    private javax.swing.JTextField txt_tenSv;
    private javax.swing.JTextField txt_thuocKhoa;
    private javax.swing.JTextField txt_truongSv;
    // End of variables declaration//GEN-END:variables
}
