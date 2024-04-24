package com.example.pcgamer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;


public class Controller {
    @FXML
    private TextField processadorTextField;

    @FXML
    private TextField ssdTextField;

    @FXML
    private TextField gpuTextField;

    @FXML
    private TextField ramTextField;

    @FXML
    private TextField fonteTextField;

    @FXML
    private TextField motherboardTextField;



    @FXML
    private Label fraseLabel;

    @FXML
    private ImageView imageView;


    @FXML
    private void gerarFrase(ActionEvent event) {
        String processador = processadorTextField.getText();
        String ssd = ssdTextField.getText();
        String gpu = gpuTextField.getText();
        String ram = ramTextField.getText();
        String fonte = fonteTextField.getText();
        String motherboard = motherboardTextField.getText();


        String frase = "Processador: " + processador + "\nSSD: " + ssd + "\nPlaca de Vídeo: " + gpu + "\nMemória RAM: " + ram + "\nFonte de Alimentação: " + fonte + "\nPlaca-Mãe: " + motherboard;
        fraseLabel.setText(frase);

        Image imagem = new Image(getClass().getResourceAsStream("/pcgamer.jpg"));
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


