package com.example.caderno;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;


    public class Controller {
        @FXML
        private TextField numeroFolhasTextField;

        @FXML
        private TextField corTextField;

        @FXML
        private TextField tamanhoTextField;

        @FXML
        private TextField classeTextField;

        @FXML
        private Text fraseText;

        @FXML
        private Label fraseLabel;

        @FXML
        private ImageView imageView;

        private Caderno caderno;

        @FXML
        private void gerarFrase(ActionEvent event) {
            int numeroFolhas = Integer.parseInt(numeroFolhasTextField.getText());
            String cor = corTextField.getText();
            String tamanho = tamanhoTextField.getText();

            String frase = "Você está comprando um caderno da cor " + cor + ", de folha " + tamanho + " e de " + numeroFolhas + " folhas";
            fraseLabel.setText(frase);

            Image imagem = new Image(getClass().getResourceAsStream("/caderno.jpg"));
            imageView.setImage(imagem);
        }

        public void onHelloButtonClick(ActionEvent actionEvent) {
        }
    }


