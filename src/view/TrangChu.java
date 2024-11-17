package view;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TrangChu extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public TrangChu() {
		setLayout(null);
		
		plThongBao = new JPanel();
		plThongBao.setBounds(0, 175, 570, 252);
		add(plThongBao);
		plThongBao.setLayout(null);
		
		 lblThongBao = new JLabel("Thông báo mới nhất");
		lblThongBao.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblThongBao.setBounds(10, 11, 125, 14);
		plThongBao.add(lblThongBao);
		        
		 plTongQuan = new JPanel();
		plTongQuan.setBounds(0, 11, 570, 143);
		add(plTongQuan);
		plTongQuan.setLayout(null);
			                
		 lblTongQuan = new JLabel("Tổng quan");
		lblTongQuan.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblTongQuan.setBounds(10, 11, 59, 14);
		plTongQuan.add(lblTongQuan);
			                
		 panel_1 = new JPanel();
		panel_1.setBounds(10, 31, 100, 100);
		plTongQuan.add(panel_1);
			                
		 panel_1_1 = new JPanel();
		panel_1_1.setBounds(159, 31, 100, 100);
		plTongQuan.add(panel_1_1);
			                
		 panel_1_2 = new JPanel();
		panel_1_2.setBounds(307, 31, 100, 100);
		plTongQuan.add(panel_1_2);
			                
		 panel_1_3 = new JPanel();
		panel_1_3.setBounds(459, 31, 100, 100);
		plTongQuan.add(panel_1_3);
	}
	
	private JPanel plThongBao, plTongQuan, panel_1, panel_1_2, panel_1_3, panel_1_1;
	private JLabel lblThongBao, lblTongQuan;

}
