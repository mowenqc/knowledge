package com.mowen.base;

/****
 * @project: knowledge_parent
 * @author: huangkai
 * @create-time: 2020/5/29 9:45
 * @description:
 *****/
public enum StatusEnum {
    DEFAULT(0, "默认"),
    ONLINE(1, "上线"),
    OFFLINE(2, "下线");
    StatusEnum(int type, String value) {
        this.type = type;
        this.value = value;
    }

    public static StatusEnum toType(int type){
        for (StatusEnum value : values()) {
            if(type == value.type){
                return value;
            }
        }
        return DEFAULT;
    }

    private int type;

    private String value;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
