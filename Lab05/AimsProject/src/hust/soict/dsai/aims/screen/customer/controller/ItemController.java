package hust.soict.dsai.aims.screen.customer.controller;

import java.awt.Insets;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import hust.soict.dsai.aims.Media.Media;
import hust.soict.dsai.aims.Media.Playable;
import javafx.scene.layout.HBox;

public class ItemController {
	private Media media;
	@FXML
    private Button btnAddToCart;
    @FXML
    private Button btnPlay;
    @FXML
    private Label lblTitle;
    @FXML
    private Label lblCost;
    @FXML
    void btnAddToCartClicked(ActionEvent event) {
    }
    @FXML
    void btnPlayClicked(ActionEvent event) {
    }
    
	public void setData(Media media) {
		this.media = media;
		lblTitle.setText(media.getTitle());
		lblCost.setText(media.getCost()+ "$");
		if(media instanceof Playable) {
			btnPlay.setVisible(true);
		}
		else {
			btnPlay.setVisible(false);
			HBox.setMargin(btnAddToCart, new Insets(0,0,0,60));
		}
	}
}
