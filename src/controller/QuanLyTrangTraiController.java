package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.QuanLyTrangTrai;

public class QuanLyTrangTraiController {
    private QuanLyTrangTrai view;
    private boolean enabledText = false;

    public QuanLyTrangTraiController(QuanLyTrangTrai view) {
        this.view = view;
   	
        setEnabledTextField();
//xử lý sự kiện nút thêm
        view.getBtnThem().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	//mở khóa text field
                enabledText = !enabledText;
                setEnabledTextField();
            }
        });

// xử lý sự kiện nút "Sửa"
        view.getBtnSua().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	//mở khóa text field
                enabledText = !enabledText;
                setEnabledTextField();
            }
        });
        
// Xử lý sự kiện nút "Lưu"
        view.getBtnLuu().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enabledText = false; // Khóa text field
                setEnabledTextField();
            }
        });

// Xử lý sự kiện nút "Xóa"
        view.getBtnXoa().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enabledText = false; // Khóa text field
                setEnabledTextField();
            }
        });

// Xử lý sự kiện nút "Làm mới"
        view.getBtnLamMoi().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enabledText = false; // Khóa text field
                setEnabledTextField();
            }
        });
    }
    
    public void setEnabledTextField() {
    	view.getTextMaTrangTrai().setEnabled(enabledText);
    	view.getTextTenTrangTrai().setEnabled(enabledText);
    	view.getTextDienTich().setEnabled(enabledText);
    	view.getTextVon().setEnabled(enabledText);
    	view.getTextDoanhThu().setEnabled(enabledText);
    } 
}
