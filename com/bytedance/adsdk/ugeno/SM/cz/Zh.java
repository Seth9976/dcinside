package com.bytedance.adsdk.ugeno.SM.cz;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.XX.Au;
import com.bytedance.adsdk.ugeno.Zh.ReZ;

public class Zh extends ReZ {
    private int Gr;
    private float KP;
    private float Lmo;
    @Deprecated
    private TextUtils.TruncateAt Lx;
    private float NR;
    protected int OL;
    protected String PjT;
    private float QB;
    private float VZ;
    private int ZsT;
    private float dDm;
    private boolean dG;
    private int fU;
    @Deprecated
    private float hLk;
    protected int jp;
    private int kWj;
    private int oMU;
    private float pBJ;
    private int sjb;
    private TextUtils.TruncateAt uvo;
    @Deprecated
    private float vSp;

    public Zh(Context context0) {
        super(context0);
        this.OL = 0xFF000000;
        this.dDm = 12.0f;
        this.ZsT = 0x7FFFFFFF;
        this.Gr = 2;
        this.jp = 3;
        this.uvo = TextUtils.TruncateAt.END;
        this.QB = -1.0f;
        this.pBJ = 400.0f;
    }

    private TextUtils.TruncateAt Au(String s) {
        s.hashCode();
        switch(s) {
            case "center": {
                this.Lx = TextUtils.TruncateAt.MIDDLE;
                return this.Lx;
            }
            case "end": {
                this.Lx = TextUtils.TruncateAt.END;
                return this.Lx;
            }
            case "start": {
                this.Lx = TextUtils.TruncateAt.START;
                return this.Lx;
            }
            default: {
                this.Lx = null;
                return null;
            }
        }
    }

    private int DWo(String s) {
        switch(s) {
            case "bold": {
                return 1;
            }
            case "italic": {
                return 2;
            }
            case "normal": {
                return 0;
            }
            default: {
                return 0;
            }
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public View PjT() {
        return this.ReZ();
    }

    public void PjT(int v) {
        this.fU = v;
        if(v == 0x7FFFFFFF) {
            return;
        }
        ((PjT)this.JQp).setPaintFlags(v);
    }

    public void PjT(TextUtils.TruncateAt textUtils$TruncateAt0) {
        if(textUtils$TruncateAt0 == null) {
            return;
        }
        ((PjT)this.JQp).setEllipsize(textUtils$TruncateAt0);
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void PjT(String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        super.PjT(s, s1);
        s.hashCode();
        switch(s) {
            case "ellipsis": {
                this.uvo = this.SM(s1);
                return;
            }
            case "ellipsize": {
                this.Lx = this.Au(s1);
                return;
            }
            case "fontWeight": {
                float f = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, -1.0f);
                this.pBJ = f;
                if(f < 1.0f || f > 1000.0f) {
                    this.pBJ = 400.0f;
                    return;
                }
                return;
            }
            case "letterSpacing": {
                this.Lmo = Au.PjT(this.Zh, com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f));
                return;
            }
            case "lineHeight": {
                this.QB = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 1.0f);
                return;
            }
            case "lines": {
                this.kWj = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0);
                return;
            }
            case "maxLines": {
                int v = 0x7FFFFFFF;
                int v1 = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0x7FFFFFFF);
                if(v1 > 0) {
                    v = v1;
                }
                this.ZsT = v;
                return;
            }
            case "shadowBlur": 
            case "shadowRadius": {
                this.KP = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "shadowColor": {
                this.sjb = com.bytedance.adsdk.ugeno.XX.PjT.PjT(s1);
                this.dG = true;
                return;
            }
            case "shadowDx": {
                this.vSp = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "shadowDy": {
                this.hLk = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "shadowOffsetX": {
                this.VZ = Au.PjT(this.Zh, com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f));
                return;
            }
            case "shadowOffsetY": {
                this.NR = Au.PjT(this.Zh, com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f));
                return;
            }
            case "text": {
                this.PjT = s1;
                return;
            }
            case "textAlign": {
                this.Gr = this.qj(s1);
                return;
            }
            case "textColor": {
                this.OL = com.bytedance.adsdk.ugeno.XX.PjT.PjT(s1);
                return;
            }
            case "textDecoration": {
                this.fU = this.xf(s1);
                return;
            }
            case "textSize": {
                this.dDm = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "textStyle": {
                this.oMU = this.DWo(s1);
            }
        }
    }

    public PjT ReZ() {
        PjT pjT0 = new PjT(this.Zh);
        pjT0.PjT(this);
        return pjT0;
    }

    // 去混淆评级： 低(20)
    private TextUtils.TruncateAt SM(String s) {
        return TextUtils.equals(s, "none") ? null : TextUtils.TruncateAt.END;
    }

    private void SM() {
        float f = this.QB;
        if(f <= 3.0f) {
            ((PjT)this.JQp).setLineSpacing(0.0f, f);
            return;
        }
        if(Build.VERSION.SDK_INT >= 28) {
            int v = Math.round(Au.PjT(this.Zh, (f - this.dDm * 1.2f) / 2.0f));
            int v1 = ((PjT)this.JQp).getPaddingTop();
            int v2 = ((PjT)this.JQp).getPaddingBottom();
            ((PjT)this.JQp).setPadding(((PjT)this.JQp).getPaddingLeft(), v1 + v, ((PjT)this.JQp).getPaddingRight(), v2 + v);
            ((PjT)this.JQp).setLineHeight(Math.round(Au.PjT(this.Zh, this.QB)));
        }
    }

    public void XX(String s) {
        this.PjT = s;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(TextUtils.equals("null", s)) {
            this.PjT = "";
        }
        ((PjT)this.JQp).setText(this.PjT);
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void Zh() {
        super.Zh();
        if(TextUtils.equals("null", this.PjT)) {
            this.PjT = "";
        }
        this.XX(this.PjT);
        boolean z = true;
        ((PjT)this.JQp).setTextSize(1, this.dDm);
        ((PjT)this.JQp).setTextColor(this.OL);
        ((PjT)this.JQp).setLines(this.kWj);
        ((PjT)this.JQp).setMaxLines(this.ZsT);
        ((PjT)this.JQp).setGravity(this.Gr);
        ((PjT)this.JQp).setIncludeFontPadding(false);
        this.PjT(this.fU);
        if(this.Qf()) {
            this.PjT(this.uvo);
        }
        else {
            this.PjT(this.Lx);
        }
        if(this.QB > 0.0f) {
            if(this.Qf()) {
                this.SM();
            }
            else {
                this.cr();
            }
        }
        int v = Build.VERSION.SDK_INT;
        if(v >= 23) {
            ((PjT)this.JQp).setBreakStrategy(0);
        }
        if(!this.Qf()) {
            ((PjT)this.JQp).setShadowLayer(this.KP, this.vSp, this.hLk, this.sjb);
        }
        else if(this.dG) {
            if(this.KP <= 0.0f) {
                this.KP = 0.00001f;
            }
            ((PjT)this.JQp).setShadowLayer(this.KP, this.VZ, this.NR, this.sjb);
        }
        int v1 = this.oMU;
        if(v1 == 1) {
            ((PjT)this.JQp).setTypeface(Typeface.DEFAULT, 1);
        }
        else if(v >= 28) {
            Typeface typeface0 = Typeface.DEFAULT;
            int v2 = (int)this.pBJ;
            if(v1 != 2) {
                z = false;
            }
            Typeface typeface1 = Typeface.create(typeface0, v2, z);
            ((PjT)this.JQp).setTypeface(typeface1);
        }
        else if(this.pBJ >= 500.0f) {
            ((PjT)this.JQp).setTypeface(Typeface.DEFAULT, 1);
        }
        if(Au.PjT(this.Zh, this.dDm) > 0.0f) {
            float f = this.Lmo;
            float f1 = Au.PjT(this.Zh, this.dDm);
            ((PjT)this.JQp).setLetterSpacing(f / f1);
        }
    }

    private void cr() {
        ((PjT)this.JQp).setLineSpacing(0.0f, this.QB);
    }

    private int qj(String s) {
        s.hashCode();
        switch(s) {
            case "center": {
                return 17;
            }
            case "left": {
                return 3;
            }
            case "right": {
                return 5;
            }
            default: {
                return 2;
            }
        }
    }

    private int xf(String s) {
        s.hashCode();
        switch(s) {
            case "none": {
                return 0x7FFFFFFF;
            }
            case "strikethrough": {
                return 16;
            }
            case "underline": {
                return 8;
            }
            default: {
                return 0x7FFFFFFF;
            }
        }
    }
}

