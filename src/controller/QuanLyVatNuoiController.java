package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.QuanLyVatNuoi;

public class QuanLyVatNuoiController {
	private QuanLyVatNuoi view;
	private boolean enabledText = false;

    public QuanLyVatNuoiController(QuanLyVatNuoi view) {
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
    	view.getTfGiaChamNuoi().setEnabled(enabledText);
    	view.getTfMaVatNuoi().setEnabled(enabledText);
    	view.getTfMaTrangTrai().setEnabled(enabledText);
    	view.getTfSLVatNuoi().setEnabled(enabledText);
    	view.getTfSLThuDuoc().setEnabled(enabledText);
    	view.getTfTenVatNuoi().setEnabled(enabledText);
    	view.getTfTenTrangTrai().setEnabled(enabledText);
    	view.getTfTinhTrangSucKhoe().setEnabled(enabledText);
    } 
}

