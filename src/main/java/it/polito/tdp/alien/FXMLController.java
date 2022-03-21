package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.Dizionario;
import it.polito.tdp.alien.model.Parola;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private Dizionario model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtTestoAlieno;

    @FXML
    private TextArea txtTraduzione;

    @FXML
    void handleClear(ActionEvent event) {
    	txtTraduzione.clear();
    }

    @FXML
    void handleTranslate(ActionEvent event) {
    	String s=txtTestoAlieno.getText();
    	String array[];
    	String alieno;
    	Parola p;
    	String lingua;
    	if(s.length()==0) {
    		txtTraduzione.setText("Errore: inserire una parola");
    	}
    	else if(s.contains(" ")){
    		array=s.split(" ");
    		alieno=array[0].toLowerCase();
    		lingua=array[1].toLowerCase();
    		model.add(new Parola(alieno));
    		p=model.trovaParole(alieno);
    		p.setSignificato(lingua);
    		txtTraduzione.setText("Hai aggiunto una nuova parola correttamente!");
    		
    	}
    	else if(!(s.contains(" "))){
    		String ss= model.traduzioni(s);
    		txtTraduzione.setText(ss);
    	}
    	
    }
    
    public void setModel(Dizionario model) {
    	this.model=model;
    }

    @FXML
    void initialize() {
        assert txtTestoAlieno != null : "fx:id=\"txtTestoAlieno\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTraduzione != null : "fx:id=\"txtTraduzione\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}
