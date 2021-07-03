package com.luqidoproit.educaderpro;

public class ECEthird {
    private String POC;
    private String INTEGRATED;
    private String DSP;
    private String AWP;
    private String INDUSTRIAL_ECE;
    private String CYBER_ECE;
    private String SYSTEM_1;
    private String ECONOMICS_ECE;
    private String MICROWAVE;
    private String SOCIOLOGY_ECE;
    private String DC;
    private String ASP;

    public ECEthird()
    {

    }

// each classes are designed for specific syllabus
    public ECEthird(String poc, String integrated, String dsp, String awp, String industrial_ece, String cyber_ece, String system_1, String economics_ece, String microwave, String sociology_ece, String dc, String asp) {
        POC = poc;
        INTEGRATED = integrated;
        DSP = dsp;
        AWP = awp;
        INDUSTRIAL_ECE = industrial_ece;
        CYBER_ECE = cyber_ece;
        SYSTEM_1 = system_1;
        ECONOMICS_ECE = economics_ece;
        MICROWAVE = microwave;
        SOCIOLOGY_ECE = sociology_ece;
        DC = dc;
        ASP = asp;
    }

    public String getPOC() {
        return POC;
    }

    public void setPOC(String POC) {
        this.POC = POC;
    }

    public String getINTEGRATED() {
        return INTEGRATED;
    }

    public void setINTEGRATED(String INTEGRATED) {
        this.INTEGRATED = INTEGRATED;
    }

    public String getDSP() {
        return DSP;
    }

    public void setDSP(String DSP) {
        this.DSP = DSP;
    }

    public String getAWP() {
        return AWP;
    }

    public void setAWP(String AWP) {
        this.AWP = AWP;
    }

    public String getINDUSTRIAL_ECE() {
        return INDUSTRIAL_ECE;
    }

    public void setINDUSTRIAL_ECE(String INDUSTRIAL_ECE) {
        this.INDUSTRIAL_ECE = INDUSTRIAL_ECE;
    }

    public String getCYBER_ECE() {
        return CYBER_ECE;
    }

    public void setCYBER_ECE(String CYBER_ECE) {
        this.CYBER_ECE = CYBER_ECE;
    }

    public String getSYSTEM_1() {
        return SYSTEM_1;
    }

    public void setSYSTEM_1(String SYSTEM_1) {
        this.SYSTEM_1 = SYSTEM_1;
    }

    public String getECONOMICS_ECE() {
        return ECONOMICS_ECE;
    }

    public void setECONOMICS_ECE(String ECONOMICS_ECE) {
        this.ECONOMICS_ECE = ECONOMICS_ECE;
    }

    public String getMICROWAVE() {
        return MICROWAVE;
    }

    public void setMICROWAVE(String MICROWAVE) {
        this.MICROWAVE = MICROWAVE;
    }

    public String getSOCIOLOGY_ECE() {
        return SOCIOLOGY_ECE;
    }

    public void setSOCIOLOGY_ECE(String SOCIOLOGY_ECE) {
        this.SOCIOLOGY_ECE = SOCIOLOGY_ECE;
    }

    public String getDC() {
        return DC;
    }

    public void setDC(String DC) {
        this.DC = DC;
    }

    public String getASP() {
        return ASP;
    }

    public void setASP(String ASP) {
        this.ASP = ASP;
    }
}
