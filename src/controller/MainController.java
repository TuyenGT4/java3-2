package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import view.MainView;
import view.QuanLyCayTrong;
import view.QuanLyVatNuoi;
import view.TrangChu;

public class MainController {
	private MainView view;
	private boolean isPanelVisible = false;
	
	public MainController(MainView view) {
		this.view = view;
		// Hiển thị Trang chủ mặc định
	    TrangChu trangChuPanel = new TrangChu();
	    view.getPlPage().add(trangChuPanel);
	    view.getLblTitlePage().setText(view.getBtnTrangChu().getText());
		
// xử lý sự kiện nút trang chủ
		view.getBtnTrangChu().addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {		                       
		    	// Hiển thị TrangChu trên plPage
		        view.getPlPage().removeAll();
		        TrangChu trangChuPanel = new TrangChu(); // Tạo instance của TrangChu
		        view.getPlPage().add(trangChuPanel); // Thêm TrangChu vào plPage
		        view.getPlPage().revalidate();
		        view.getPlPage().repaint();
		    			    	
		    	//Hiển thị tiêu đề trang
		        String buttonText = view.getBtnTrangChu().getText();
		        // Đặt text cho titlePage
		        view.getLblTitlePage().setText(buttonText);
		        
		        // ... (Các xử lý khác của nút Trang chủ)
		    }
		});
		
		//xử lý khi trước đó danh sách quản lý được mở ra
		view.getBtnTrangChu().addMouseListener(new MouseAdapter() {
		    @Override
		    public void mousePressed(MouseEvent e) {
		        // Xử lý khi nút được nhấn
		        if (isPanelVisible) {
		            isPanelVisible = false;
		            view.getPlVachNgan2().setVisible(isPanelVisible);
		        }
		    }
		});
		
		
		
// xử lý sự kiện nút quản lý	
		view.getBtnQuanLy().addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String buttonText1 = view.getBtnQuanLy().getText();
		        // Lấy text của nút Quản lý
		        String buttonText = view.getBtnQuanLy().getText();
		        // Đặt text cho titlePage
		        view.getLblTitlePage().setText(buttonText);
		        
		        // ... (Các xử lý khác của nút Quản lý)
		    }
		});
		
//ẩn hiện danh sách quản lý
				// Thêm ActionListener để hiển thị/ẩn plVachNgan2 khi nhấn vào quản lý
				view.getBtnQuanLy().addActionListener(e -> {
		            isPanelVisible = !isPanelVisible;
		            view.getPlVachNgan2().setVisible(isPanelVisible);
		        });
				// Thêm MouseListener cho toàn bộ frame
				view.addMouseListener(new MouseAdapter() {
				    @Override
				    public void mousePressed(MouseEvent e) { // Sử dụng mousePressed()
				        // Kiểm tra xem click có nằm ngoài vùng btnNewButton_1 và plVachNgan2 không
				        if (!view.getBtnQuanLy().getBounds().contains(e.getPoint()) && 
				            !view.getPlVachNgan2().getBounds().contains(e.getPoint())) {
				            isPanelVisible = false;
				            view.getPlVachNgan2().setVisible(isPanelVisible);
				        }
				    }
				});

				
// xử lý sự kiện nút Vật nuôi	
				view.getBtnVatNuoi().addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        // ... (Các xử lý khác của nút Cây trồng)
				    	
				    	// Hiển thị QuanLyVatNuoi trên plPage
				        view.getPlPage().removeAll();
				        QuanLyVatNuoi qlVatNuoi = new QuanLyVatNuoi(); // Tạo instance của TrangChu
				        view.getPlPage().add(qlVatNuoi); // Thêm TrangChu vào plPage
				        view.getPlPage().revalidate();
				        view.getPlPage().repaint();
				        
				        // Lấy text của nút Vật nuôi
				        String buttonText = view.getBtnVatNuoi().getText();
				        // Đặt text cho titlePage
				        view.getLblTitlePage().setText(buttonText);
				    }
				});

//xử lý sự kiện nút Cây trồng			
				view.getBtnCayTrong().addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        // ... (Các xử lý khác của nút Cây trồng)
				    	
				    	
				    	// Hiển thị QuanLyCayTrong trên plPage
				        view.getPlPage().removeAll();
				        QuanLyCayTrong qlCayTrong = new QuanLyCayTrong(); // Tạo instance của TrangChu
				        view.getPlPage().add(qlCayTrong); // Thêm TrangChu vào plPage
				        view.getPlPage().revalidate();
				        view.getPlPage().repaint();
				        
				        
				        // Lấy text của nút Cây trồng
				        String buttonText = view.getBtnCayTrong().getText();
				        // Đặt text cho titlePage
				        view.getLblTitlePage().setText(buttonText);
				    }
				});	
				
//xử lý sự kiện nút trang trại
				view.getBtnTrangTrai().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// ... (Các xử lý khác của nút TrangTrai)

				        // Lấy text của nút TrangTrai
				        String buttonText = view.getBtnTrangTrai().getText();
				        // Đặt text cho titlePage
				        view.getLblTitlePage().setText(buttonText);
						
					}
					
				});
// xử lý sự kiện nút thống kê
		view.getBtnThongKe().addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) { 
		        // Lấy text của nút Thống kê
		        String buttonText = view.getBtnThongKe().getText();
		        // Đặt text cho titlePage
		        view.getLblTitlePage().setText(buttonText);
		        
		        // ... (Các xử lý khác của nút Thống kê)
		    }
		});
		
		
		//xử lý khi trước đó danh sách quản lý được mở ra
		view.getBtnThongKe().addMouseListener(new MouseAdapter() {
			@Override
		    public void mousePressed(MouseEvent e) {
		        // Xử lý khi nút được nhấn
                if (isPanelVisible) {
                    isPanelVisible = false;
                    view.getPlVachNgan2().setVisible(isPanelVisible);
                }
            }
		});
		
		
// xử lý sự kiện nút thông báo
		view.getBtnThongBao().addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {		      		    			
		        // Lấy text của nút Trang chủ
		        String buttonText = view.getBtnThongBao().getText();
		        // Đặt text cho titlePage
		        view.getLblTitlePage().setText(buttonText);
		        
		        // ... (Các xử lý khác của nút Trang chủ)
		    }
		});
		
		//xử lý khi trước đó danh sách quản lý được mở ra
		view.getBtnThongBao().addMouseListener(new MouseAdapter() {
		    @Override
		    public void mousePressed(MouseEvent e) {
		        // Xử lý khi nút được nhấn
                if (isPanelVisible) {
                    isPanelVisible = false;
                    view.getLblTitlePage().setVisible(isPanelVisible);
                }
            }
		});
		
// xử lý sự kiện panel user
	}
}
