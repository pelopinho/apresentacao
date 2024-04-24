package com.example.caderno;

public class Caderno {
        private int numeroFolhas;
        private String cor;
        private String tamanho;


        public Caderno(int numeroFolhas, String Cor, String Tamanho) {
            this.numeroFolhas = numeroFolhas;
            this.cor = cor;
            this.tamanho = tamanho;
        }

        // Get-Set Quantidade de Folhas:
        public int getNumeroFolhas() {
            return numeroFolhas;
        }
        public void setnumeroFolhas(int numeroFolhas) {
            this.numeroFolhas = numeroFolhas;
        }


        //Get-Set Cor do Caderno:
        public String getCor() {
            return cor;
        }
        public void setCor(String cor) {
            this.cor = cor;
        }


        //Get-Set Tamanho do Caderno:
        public String getTamanho() {
            return tamanho;
        }
        public void setTamanho(String tamanho) {
            this.tamanho = tamanho;
        }
    }



