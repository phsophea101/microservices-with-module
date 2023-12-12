package com.sample.common.consts;

public enum SampleErrorCode implements ErrorCodeType {

    /**
     * Error General exception.
     */
    E0001("E0001", "General exception error.");

    final String value;
    final String description;

    private SampleErrorCode(String value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getDescription() {
        return description;
    }

}
