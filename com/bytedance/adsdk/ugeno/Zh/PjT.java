package com.bytedance.adsdk.ugeno.Zh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.XX.Au;
import java.util.ArrayList;
import java.util.List;

public class PjT extends ReZ {
    public static class com.bytedance.adsdk.ugeno.Zh.PjT.PjT {
        protected float Au;
        protected float DWo;
        protected float JQp;
        protected ViewGroup.LayoutParams Lrd;
        protected boolean Owx;
        protected float PjT;
        protected boolean RD;
        protected float ReZ;
        protected float SM;
        protected boolean Sks;
        protected float XX;
        protected float Zh;
        protected PjT cRA;
        protected float cr;
        protected float cz;
        protected float fDm;
        protected boolean gK;
        protected boolean ltE;
        protected float qj;
        protected boolean qla;
        protected boolean tT;
        protected boolean ub;
        protected boolean xE;
        protected float xf;
        protected float xs;

        public com.bytedance.adsdk.ugeno.Zh.PjT.PjT(PjT pjT0) {
            this.PjT = -2.0f;
            this.Zh = -2.0f;
            this.ReZ = 0.0f;
            this.cr = 0.0f;
            this.cRA = pjT0;
        }

        public ViewGroup.LayoutParams PjT() {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.MarginLayoutParams(((int)this.PjT), ((int)this.Zh));
            viewGroup$LayoutParams0.leftMargin = (int)(this.Owx ? this.cz : this.JQp);
            viewGroup$LayoutParams0.rightMargin = (int)(this.RD ? this.XX : this.JQp);
            viewGroup$LayoutParams0.topMargin = (int)(this.Sks ? this.Au : this.JQp);
            viewGroup$LayoutParams0.bottomMargin = (int)(this.tT ? this.SM : this.JQp);
            return viewGroup$LayoutParams0;
        }

        public void PjT(Context context0, String s, String s1) {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            s.hashCode();
            switch(s) {
                case "height": {
                    if(TextUtils.equals(s1, "match_parent")) {
                        if(this.cRA != null && this.cRA.Qf() && this.cRA.qZS() == -2 && !this.cRA.OMu()) {
                            this.Zh = -2.0f;
                            return;
                        }
                        this.Zh = -1.0f;
                        return;
                    }
                    if(TextUtils.equals(s1, "wrap_content")) {
                        this.Zh = -2.0f;
                        return;
                    }
                    this.Zh = Au.PjT(context0, s1);
                    return;
                }
                case "margin": {
                    this.JQp = Au.PjT(context0, s1);
                    return;
                }
                case "marginBottom": {
                    this.SM = Au.PjT(context0, s1);
                    this.tT = true;
                    return;
                }
                case "marginLeft": {
                    this.cz = Au.PjT(context0, s1);
                    this.Owx = true;
                    return;
                }
                case "marginRight": {
                    this.XX = Au.PjT(context0, s1);
                    this.RD = true;
                    return;
                }
                case "marginTop": {
                    this.Au = Au.PjT(context0, s1);
                    this.Sks = true;
                    return;
                }
                case "minHeight": {
                    this.cr = Au.PjT(context0, s1);
                    return;
                }
                case "minWidth": {
                    this.ReZ = Au.PjT(context0, s1);
                    return;
                }
                case "padding": {
                    this.DWo = Au.PjT(context0, s1);
                    this.qla = true;
                    return;
                }
                case "paddingBottom": {
                    this.fDm = Au.PjT(context0, s1);
                    this.ltE = true;
                    return;
                }
                case "paddingLeft": {
                    this.qj = Au.PjT(context0, s1);
                    this.xE = true;
                    return;
                }
                case "paddingRight": {
                    this.xs = Au.PjT(context0, s1);
                    this.ub = true;
                    return;
                }
                case "paddingTop": {
                    this.xf = Au.PjT(context0, s1);
                    this.gK = true;
                    return;
                }
                case "width": {
                    if(TextUtils.equals(s1, "match_parent")) {
                        if(this.cRA != null && this.cRA.Qf() && this.cRA.wN() == -2 && !this.cRA.OMu()) {
                            this.PjT = -2.0f;
                            return;
                        }
                        this.PjT = -1.0f;
                        return;
                    }
                    if(TextUtils.equals(s1, "wrap_content")) {
                        this.PjT = -2.0f;
                        return;
                    }
                    this.PjT = Au.PjT(context0, s1);
                }
            }
        }

        @Override
        public String toString() {
            return "LayoutParams{mWidth=" + this.PjT + ", mHeight=" + this.Zh + ", mMargin=" + this.JQp + ", mMarginLeft=" + this.cz + ", mMarginRight=" + this.XX + ", mMarginTop=" + this.Au + ", mMarginBottom=" + this.SM + ", mParams=" + this.Lrd + '}';
        }
    }

    protected List PjT;

    public PjT(Context context0) {
        this(context0, null);
    }

    public PjT(Context context0, PjT pjT0) {
        super(context0, pjT0);
        this.PjT = new ArrayList();
    }

    public com.bytedance.adsdk.ugeno.Zh.PjT.PjT DWo() {
        return new com.bytedance.adsdk.ugeno.Zh.PjT.PjT(this);
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public ReZ PjT(String s) {
        if(!TextUtils.isEmpty(s) && TextUtils.equals(s, this.qj)) {
            return this;
        }
        for(Object object0: this.PjT) {
            ReZ reZ0 = (ReZ)object0;
            if(reZ0 != null) {
                ReZ reZ1 = reZ0.ReZ(s);
                if(reZ1 != null) {
                    return reZ1;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public void PjT(ReZ reZ0) {
        if(reZ0 == null) {
            return;
        }
        this.PjT.add(reZ0);
        View view0 = reZ0.qj();
        if(view0 != null) {
            ((ViewGroup)this.JQp).addView(view0);
        }
    }

    public void PjT(ReZ reZ0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(reZ0 == null) {
            return;
        }
        this.PjT.add(reZ0);
        View view0 = reZ0.qj();
        if(view0 != null) {
            ((ViewGroup)this.JQp).addView(view0, viewGroup$LayoutParams0);
        }
    }

    public List SM() {
        return this.PjT;
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public ReZ Zh(String s) {
        if(!TextUtils.isEmpty(s) && TextUtils.equals(s, this.xf)) {
            return this;
        }
        for(Object object0: this.PjT) {
            ReZ reZ0 = (ReZ)object0;
            if(reZ0 != null) {
                ReZ reZ1 = reZ0.cr(s);
                if(reZ1 != null) {
                    return reZ1;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void Zh() {
        super.Zh();
    }
}

