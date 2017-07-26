package me.tychsen.test;

import com.fasterxml.jackson.annotation.JsonProperty;

class MyCollection {
    @JsonProperty("MAT")
    private MAT MAT = null;
    @JsonProperty("DAR")
    private DAR DAR = null;
    @JsonProperty("someString")
    private String someString = null;

    public MAT getMAT() {
        return MAT;
    }

    public void setMAT(MAT MAT) {
        this.MAT = MAT;
    }

    public DAR getDAR() {
        return DAR;
    }

    public void setDAR(DAR DAR) {
        this.DAR = DAR;
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }
}
