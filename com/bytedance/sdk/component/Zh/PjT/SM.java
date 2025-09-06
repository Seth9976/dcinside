package com.bytedance.sdk.component.Zh.PjT;

import java.nio.charset.Charset;

public final class SM {
    private String PjT;
    private String Zh;

    private SM(String s) {
        this.PjT = s;
    }

    public static SM PjT(String s) {
        return new SM(s);
    }

    public String PjT() {
        return this.PjT;
    }

    public Charset PjT(Charset charset0) {
        try {
            return this.Zh == null ? charset0 : Charset.forName(this.Zh);
        }
        catch(IllegalArgumentException unused_ex) {
        }
        return charset0;
    }
}

