package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Profile;

public class ProfileController {
	private Profile view;
	private boolean enabledText = false;
	public ProfileController(Profile view) {
		this.view = view;
		setEnabledTextField();
// xử lý nút sửa
		view.getBtnSua().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	//mở khóa text field
                enabledText = !enabledText;
                setEnabledTextField();
            }
        });
//xử lý nút lưu
		view.getBtnLuu().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enabledText = false; // Khóa text field
                setEnabledTextField();
            }
        });
	}
	public void setEnabledTextField() {
    	view.getTextHoTen().setEnabled(enabledText);
    	view.getTextQueQuan().setEnabled(enabledText);
    } 
}
