package com.sapient.problem.entity;

/**
 * Created by himu on 3/1/2018.
 */
public enum InputReceiverTypeEnum {

    CSV("csvReceiver"), XML("xmlReceiver"), TXT("txtReceiver"), EXCEL("excelReceiver");

    private final String value;

    InputReceiverTypeEnum(String input) {
        this.value = input;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
