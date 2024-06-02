package hust.soict.dsai.aims.screen.customer.controller;

import java.awt.Insets;
import java.io.IOException;

import hust.soict.dsai.aims.Store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class ViewStoreController {
	@FXML
    private GridPane gridPane;
    @FXML
    void 004cff(ActionEvent event) {
    }
    @FXML
    void btnViewCartPressed(ActionEvent event) {
    }
    
    private Store store;
    public ViewStoreController(Store store) {
    	this.store = store;
    }
    
    public void initialize() {
    	final String ITEM_FXML_FILE_PATH = "hust/soict/dsai/aims/screen/customer/view/Item.fxml";
    	int column = 0;
    	int row = 1;
    	for (int i = 0; i<store.getItemsInStore().size(); i ++) {
    		try {
    			FXMLLoader fxmlloader = new FXMLLoader();
    			fxmlloader.setLocation(getClass().getResource(ITEM_FXML_FILE_PATH));
    			ItemController itemController = new ItemController(cart);
    			fxmlloader.setController(itemController);
    			AnchorPane anchorPane = new AnchorPane();
    			anchorPane = fxmlloader.load();
    			itemController.setData(store.getItemsInStore().get(i));
    			
    			if (column == 3) {
    				column = 0;
    				row++
    			}
    			
    			gridPane.add(anchorPane, column++, row);
    			GridPane.setMargin(anchorPane, new Insets(20,10,10,10));
    			
    			
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    }
