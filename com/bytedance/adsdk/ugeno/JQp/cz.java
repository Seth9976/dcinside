package com.bytedance.adsdk.ugeno.JQp;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.adsdk.ugeno.Zh.PjT;

public class cz extends PjT {
    public static class com.bytedance.adsdk.ugeno.JQp.cz.PjT extends com.bytedance.adsdk.ugeno.Zh.PjT.PjT {
        public int Co;
        public int Jo;
        public int KM;
        public float Qf;
        public float Yo;
        public int ZX;
        public float iZZ;
        public int wN;
        public int yIW;

        public com.bytedance.adsdk.ugeno.JQp.cz.PjT(PjT pjT0) {
            super(pjT0);
            this.yIW = 1;
            this.iZZ = 0.0f;
            this.Yo = 0.0f;
            this.KM = -1;
            this.Qf = -1.0f;
            this.ZX = -1;
            this.Jo = -1;
            this.Co = 0xFFFFFF;
            this.wN = 0xFFFFFF;
        }

        private int JQp(String s) {
            s.hashCode();
            switch(s) {
                case "baseline": {
                    return 3;
                }
                case "center": {
                    return 2;
                }
                case "flex_end": {
                    return 1;
                }
                case "flex_start": {
                    return 0;
                }
                case "stretch": {
                    return 4;
                }
                default: {
                    return -1;
                }
            }
        }

        private int PjT(String s) {
            try {
                return Integer.parseInt(s);
            }
            catch(NumberFormatException unused_ex) {
                return 1;
            }
        }

        @Override  // com.bytedance.adsdk.ugeno.Zh.PjT$PjT
        public ViewGroup.LayoutParams PjT() {
            return this.Zh();
        }

        @Override  // com.bytedance.adsdk.ugeno.Zh.PjT$PjT
        public void PjT(Context context0, String s, String s1) {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            super.PjT(context0, s, s1);
            s.hashCode();
            switch(s) {
                case "alignSelf": {
                    this.KM = this.JQp(s1);
                    return;
                }
                case "flexBasisPercent": {
                    this.Qf = this.cr(s1);
                    return;
                }
                case "flexGrow": {
                    this.iZZ = this.Zh(s1);
                    return;
                }
                case "flexShrink": {
                    this.Yo = this.ReZ(s1);
                    return;
                }
                case "order": {
                    this.yIW = this.PjT(s1);
                }
            }
        }

        private float ReZ(String s) {
            try {
                return Float.parseFloat(s);
            }
            catch(Exception unused_ex) {
                return 0.0f;
            }
        }

        private float Zh(String s) {
            try {
                return Float.parseFloat(s);
            }
            catch(Exception unused_ex) {
                return 0.0f;
            }
        }

        public com.bytedance.adsdk.ugeno.JQp.JQp.PjT Zh() {
            com.bytedance.adsdk.ugeno.JQp.JQp.PjT jQp$PjT0 = new com.bytedance.adsdk.ugeno.JQp.JQp.PjT(((int)this.PjT), ((int)this.Zh));
            jQp$PjT0.leftMargin = (int)this.cz;
            jQp$PjT0.rightMargin = (int)this.XX;
            jQp$PjT0.topMargin = (int)this.Au;
            jQp$PjT0.bottomMargin = (int)this.SM;
            jQp$PjT0.ReZ(this.yIW);
            jQp$PjT0.cr(this.KM);
            jQp$PjT0.PjT(this.iZZ);
            jQp$PjT0.Zh(this.Yo);
            jQp$PjT0.ReZ(this.Qf);
            return jQp$PjT0;
        }

        private float cr(String s) {
            try {
                return Float.parseFloat(s);
            }
            catch(Exception unused_ex) {
                return -1.0f;
            }
        }

        @Override  // com.bytedance.adsdk.ugeno.Zh.PjT$PjT
        public String toString() {
            return "LayoutParams{mWidth=" + this.PjT + ", mHeight=" + this.Zh + ", mMargin=" + this.JQp + ", mMarginLeft=" + this.cz + ", mMarginRight=" + this.XX + ", mMarginTop=" + this.Au + ", mMarginBottom=" + this.SM + ", mParams=" + this.Lrd + ", mOrder=" + this.yIW + ", mFlexGrow=" + this.iZZ + ", mFlexShrink=" + this.Yo + ", mAlignSelf=" + this.KM + ", mFlexBasisPercent=" + this.Qf + ", mMinWidth=" + this.ZX + ", mMinHeight=" + this.Jo + ", mMaxWidth=" + this.Co + ", mMaxHeight=" + this.wN + "} " + super.toString();
        }
    }

    private int OL;
    private int ZsT;
    private int dDm;
    private int jp;
    private int oMU;

    public cz(Context context0) {
        super(context0);
    }

    private int Au(String s) {
        s.hashCode();
        return s.equals("wrap") ? 1 : 0;
    }

    private int DWo(String s) {
        switch(s) {
            case "baseline": {
                return 3;
            }
            case "center": {
                return 2;
            }
            case "flex_end": {
                return 1;
            }
            case "flex_start": {
                return 0;
            }
            case "stretch": {
                return 4;
            }
            default: {
                return 4;
            }
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.PjT
    public com.bytedance.adsdk.ugeno.Zh.PjT.PjT DWo() {
        return new com.bytedance.adsdk.ugeno.JQp.cz.PjT(this);
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public View PjT() {
        return this.ReZ();
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void PjT(String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        super.PjT(s, s1);
        s.hashCode();
        switch(s) {
            case "alignContent": {
                this.ZsT = this.qj(s1);
                return;
            }
            case "alignItems": {
                this.oMU = this.DWo(s1);
                return;
            }
            case "flexDirection": {
                this.OL = this.XX(s1);
                return;
            }
            case "flexWrap": {
                this.jp = this.Au(s1);
                return;
            }
            case "justifyContent": {
                this.dDm = this.SM(s1);
            }
        }
    }

    public JQp ReZ() {
        JQp jQp0 = new JQp(this.Zh);
        jQp0.PjT(this);
        return jQp0;
    }

    private int SM(String s) {
        s.hashCode();
        switch(s) {
            case "center": {
                return 2;
            }
            case "flex_end": {
                return 1;
            }
            case "space_around": {
                return 4;
            }
            case "space_between": {
                return 3;
            }
            default: {
                return 0;
            }
        }
    }

    int XX(String s) {
        s.hashCode();
        switch(s) {
            case "column": {
                return 2;
            }
            case "column_reverse": {
                return 3;
            }
            case "row_reverse": {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.PjT
    public void Zh() {
        super.Zh();
        ((JQp)this.JQp).setFlexDirection(this.OL);
        ((JQp)this.JQp).setFlexWrap(this.jp);
        ((JQp)this.JQp).setJustifyContent(this.dDm);
        ((JQp)this.JQp).setAlignItems(this.oMU);
        ((JQp)this.JQp).setAlignContent(this.ZsT);
    }

    private int qj(String s) {
        switch(s) {
            case "center": {
                return 2;
            }
            case "flex_end": {
                return 1;
            }
            case "flex_start": {
                return 0;
            }
            case "space_around": {
                return 4;
            }
            case "space_between": {
                return 3;
            }
            case "stretch": {
                return 5;
            }
            default: {
                return 5;
            }
        }
    }
}

