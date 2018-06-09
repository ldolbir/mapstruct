package org.mapstruct.example.dto;

public class Transaction {
    private String reazonCode;

    public String getReazonCode() {
        return reazonCode;
    }

    public void setReazonCode(String reazonCode) {
        this.reazonCode = reazonCode;
    }

    public Boolean getChanged() {
        return changed;
    }

    public void setChanged(Boolean changed) {
        this.changed = changed;
    }

    public String getModifiedToken() {
        return modifiedToken;
    }

    public void setModifiedToken(String modifiedToken) {
        this.modifiedToken = modifiedToken;
    }

    private Boolean changed;
    private String modifiedToken;
}
