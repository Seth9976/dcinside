package com.bykv.vk.openvk.preload.a.d;

public enum b {
    BEGIN_ARRAY,
    END_ARRAY,
    BEGIN_OBJECT,
    END_OBJECT,
    NAME,
    STRING,
    NUMBER,
    BOOLEAN,
    NULL,
    END_DOCUMENT;

    public static b[] a() {
        return (b[])b.k.clone();
    }
}

