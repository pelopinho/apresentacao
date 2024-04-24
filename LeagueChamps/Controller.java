package com.example.leaguechamps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;


public class Controller {
    @FXML
    private TextField campeaoTextField;

    @FXML
    private TextField maestriaTextField;

    @FXML
    private TextField cidadeTextField;


    @FXML
    private Label fraseLabel;

    @FXML
    private ImageView imageView;

    private LeagueChamps leagueChamps;

    @FXML
    private void gerarFrase(ActionEvent event) {
        String campeao = campeaoTextField.getText();
        int maestria = Integer.parseInt(maestriaTextField.getText());
        String cidade = cidadeTextField.getText();

        String frase = "Você escolheu o campeão " + campeao + ", maestria " + maestria + ", natural da região de " + cidade;        fraseLabel.setText(frase);

        Image imagem = new Image(getClass().getResourceAsStream("/yasuo.png"));
        imageView.setImage(imagem);

// Dimensões da imagem
        double novaLargura = 500;
        double novaAltura = 300;

        imageView.setFitWidth(novaLargura);
        imageView.setFitHeight(novaAltura);
    }

    public void onHelloButtonClick(ActionEvent actionEvent) {
    }
}


