package com.bytedance.sdk.component.PjT;

public enum tT {
    PUBLIC,
    PROTECTED,
    PRIVATE;

    @Override
    public String toString() {
        if(this == tT.ReZ) {
            return "private";
        }
        return this == tT.Zh ? "protected" : "public";
    }
}

