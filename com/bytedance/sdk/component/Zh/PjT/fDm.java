package com.bytedance.sdk.component.Zh.PjT;

public class fDm {
    public static enum PjT {
        STRING_TYPE,
        BYTE_ARRAY_TYPE;

    }

    public byte[] JQp;
    public SM ReZ;
    public String cr;
    public PjT cz;

    public fDm() {
    }

    public fDm(SM sM0, String s, PjT fDm$PjT0) {
        this.ReZ = sM0;
        this.cr = s;
        this.cz = fDm$PjT0;
    }

    public fDm(SM sM0, byte[] arr_b, PjT fDm$PjT0) {
        this.ReZ = sM0;
        this.JQp = arr_b;
        this.cz = fDm$PjT0;
    }

    public static fDm PjT(SM sM0, String s) {
        return new fDm(sM0, s, PjT.PjT);
    }

    public static fDm PjT(SM sM0, byte[] arr_b) {
        return new fDm(sM0, arr_b, PjT.Zh);
    }

    public String PjT() {
        return this.cr;
    }
}

