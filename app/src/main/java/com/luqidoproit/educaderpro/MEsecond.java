package com.luqidoproit.educaderpro;

public class MEsecond {
    private String SCIENCE_ME;
    private String MATH_3_ME;
    private String TECHINAL_ME;
    private String HUMAN_ME;
    private String THERMO;
    private String FLUID;
    private String MATERIALS;
    private String APPLIED;
    private String MECHANICS;
    private String MANUFAC;

    public MEsecond(){

    }

    public MEsecond(String science_me, String math_3_me, String techinal_me, String human_me, String thermo, String fluid, String materials, String applied, String mechanics, String manufac) {
        SCIENCE_ME = science_me;
        MATH_3_ME = math_3_me;
        TECHINAL_ME = techinal_me;
        HUMAN_ME = human_me;
        THERMO = thermo;
        FLUID = fluid;
        MATERIALS = materials;
        APPLIED = applied;
        MECHANICS = mechanics;
        MANUFAC = manufac;
    }

    public String getSCIENCE_ME() {
        return SCIENCE_ME;
    }

    public void setSCIENCE_ME(String SCIENCE_ME) {
        this.SCIENCE_ME = SCIENCE_ME;
    }

    public String getMATH_3_ME() {
        return MATH_3_ME;
    }

    public void setMATH_3_ME(String MATH_3_ME) {
        this.MATH_3_ME = MATH_3_ME;
    }

    public String getTECHINAL_ME() {
        return TECHINAL_ME;
    }

    public void setTECHINAL_ME(String TECHINAL_ME) {
        this.TECHINAL_ME = TECHINAL_ME;
    }

    public String getHUMAN_ME() {
        return HUMAN_ME;
    }

    public void setHUMAN_ME(String HUMAN_ME) {
        this.HUMAN_ME = HUMAN_ME;
    }

    public String getTHERMO() {
        return THERMO;
    }

    public void setTHERMO(String THERMO) {
        this.THERMO = THERMO;
    }

    public String getFLUID() {
        return FLUID;
    }

    public void setFLUID(String FLUID) {
        this.FLUID = FLUID;
    }

    public String getMATERIALS() {
        return MATERIALS;
    }

    public void setMATERIALS(String MATERIALS) {
        this.MATERIALS = MATERIALS;
    }

    public String getAPPLIED() {
        return APPLIED;
    }

    public void setAPPLIED(String APPLIED) {
        this.APPLIED = APPLIED;
    }

    public String getMECHANICS() {
        return MECHANICS;
    }

    public void setMECHANICS(String MECHANICS) {
        this.MECHANICS = MECHANICS;
    }

    public String getMANUFAC() {
        return MANUFAC;
    }

    public void setMANUFAC(String MANUFAC) {
        this.MANUFAC = MANUFAC;
    }
}
