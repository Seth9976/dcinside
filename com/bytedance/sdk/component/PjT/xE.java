package com.bytedance.sdk.component.PjT;

import android.text.TextUtils;

public class xE {
    public static final class PjT {
        private String JQp;
        private String PjT;
        private String ReZ;
        private String XX;
        private String Zh;
        private String cr;
        private String cz;

        private PjT() {
        }

        PjT(com.bytedance.sdk.component.PjT.xE.1 xE$10) {
        }

        public PjT JQp(String s) {
            this.JQp = s;
            return this;
        }

        public PjT PjT(String s) {
            this.PjT = s;
            return this;
        }

        public xE PjT() {
            return new xE(this, null);
        }

        public PjT ReZ(String s) {
            this.ReZ = s;
            return this;
        }

        public PjT XX(String s) {
            this.XX = s;
            return this;
        }

        public PjT Zh(String s) {
            this.Zh = s;
            return this;
        }

        public PjT cr(String s) {
            this.cr = s;
            return this;
        }

        public PjT cz(String s) {
            this.cz = s;
            return this;
        }
    }

    public final String Au;
    public final String JQp;
    public final int PjT;
    public final String ReZ;
    public final String XX;
    public final String Zh;
    public final String cr;
    public final String cz;

    private xE(PjT xE$PjT0) {
        this.Zh = xE$PjT0.PjT;
        this.ReZ = xE$PjT0.Zh;
        this.cr = xE$PjT0.ReZ;
        this.JQp = xE$PjT0.cr;
        this.cz = xE$PjT0.JQp;
        this.XX = xE$PjT0.cz;
        this.PjT = 1;
        this.Au = xE$PjT0.XX;
    }

    xE(PjT xE$PjT0, com.bytedance.sdk.component.PjT.xE.1 xE$10) {
        this(xE$PjT0);
    }

    private xE(String s, int v) {
        this.Zh = null;
        this.ReZ = null;
        this.cr = null;
        this.JQp = null;
        this.cz = s;
        this.XX = null;
        this.PjT = v;
        this.Au = null;
    }

    public static PjT PjT() {
        return new PjT(null);
    }

    public static xE PjT(String s, int v) {
        return new xE(s, v);
    }

    // 去混淆评级： 低(20)
    public static boolean PjT(xE xE0) {
        return xE0 == null || xE0.PjT != 1 || TextUtils.isEmpty(xE0.cr) || TextUtils.isEmpty(xE0.JQp);
    }

    @Override
    public String toString() {
        return "methodName: " + this.cr + ", params: " + this.JQp + ", callbackId: " + this.cz + ", type: " + this.ReZ + ", version: " + this.Zh + ", ";
    }

    class com.bytedance.sdk.component.PjT.xE.1 {
    }

}

