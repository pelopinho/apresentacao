package com.example.pcgamer;

public class PcGamer {
    private String processador;
    private String ssd;
    private String gpu;
    private String ram;
    private String fonte;
    private String motherboard;



    public PcGamer(String processador, String ssd, String gpu, String ram, String fonte, String motherboard) {
        this.processador = processador;
        this.ssd = ssd;
        this.gpu = gpu;
        this.ram = ram;
        this.fonte = fonte;
        this.motherboard = motherboard;


    }

    // Get/Set PROCESSADOR
    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }


    //Get/Set SSD
    public String getSsd() {
        return ssd;
    }
    public void setSsd(String Ssd) {
        this.ssd = ssd;
    }


    // Get/Set PLACA DE VÍDEO
    public String getGpu() {
        return gpu;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }


    // Get/Set MEMÓRIA RAM
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }


    // Get/Set FONTE
    public String getFonte() {
        return fonte;
    }
    public void setFonte(String fonte) {
        this.fonte= fonte;
    }


    // Get/Set PLACA-MÃE
    public String getMotherboard() {
        return motherboard;
    }
    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

}



