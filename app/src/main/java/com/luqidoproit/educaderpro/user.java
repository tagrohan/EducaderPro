package com.luqidoproit.educaderpro;

public class user {
    private String math;
    private String electrical;
    private String physics;
    private String program;
    private String graphics;
    private String chemistry;
    private String english;
    private String maths2;

    public user(){

    }


    public user(String math, String electrical, String physics, String program, String graphics, String chemistry, String english, String maths2) {
        this.math = math;
        this.electrical = electrical;
        this.physics = physics;
        this.program = program;
        this.graphics = graphics;
        this.chemistry = chemistry;
        this.english = english;
        this.maths2 = maths2;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getElectrical() {
        return electrical;
    }

    public void setElectrical(String electrical) {
        this.electrical = electrical;
    }

    public String getPhysics() {
        return physics;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getChemistry() {
        return chemistry;
    }

    public void setChemistry(String chemistry) {
        this.chemistry = chemistry;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMaths2() {
        return maths2;
    }

    public void setMaths2(String maths2) {
        this.maths2 = maths2;
    }
}
