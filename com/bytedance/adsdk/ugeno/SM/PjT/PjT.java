package com.bytedance.adsdk.ugeno.SM.PjT;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.JQp;
import com.bytedance.adsdk.ugeno.SM.cz.Zh;
import com.bytedance.adsdk.ugeno.XX.Au;
import com.bytedance.adsdk.ugeno.XX.cr;

public class PjT extends Zh {
    private int Gr;
    private int Lx;
    private boolean QB;
    private String ZsT;
    private String dDm;
    private com.bytedance.adsdk.ugeno.XX.PjT.PjT fU;
    private String kWj;
    private String oMU;
    private boolean uvo;

    public PjT(Context context0) {
        super(context0);
        this.oMU = "row";
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    protected void IJ() {
        super.IJ();
        if(this.uvo) {
            ((com.bytedance.adsdk.ugeno.SM.cz.PjT)this.JQp).setTextColor(this.OL);
        }
        if(this.QB) {
            if(this.Wo) {
                this.PjT(this.jK);
                return;
            }
            this.cr(this.Zd);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.SM.cz.Zh
    public void PjT(String s, String s1) {
        super.PjT(s, s1);
        s.hashCode();
        switch(s) {
            case "direction": {
                this.oMU = s1;
                return;
            }
            case "highlightBackgroundColor": {
                if(com.bytedance.adsdk.ugeno.XX.PjT.ReZ(s1)) {
                    this.Wo = true;
                    this.fU = com.bytedance.adsdk.ugeno.XX.PjT.Zh(s1);
                }
                else {
                    this.Gr = com.bytedance.adsdk.ugeno.XX.PjT.PjT(s1);
                    this.Wo = false;
                }
                this.QB = true;
                return;
            }
            case "highlightBackgroundImage": {
                this.kWj = s1;
                return;
            }
            case "highlightImage": {
                this.ZsT = s1;
                return;
            }
            case "highlightTextColor": 
            case "highlightedTextColor": {
                this.Lx = com.bytedance.adsdk.ugeno.XX.PjT.PjT(s1);
                this.uvo = true;
                return;
            }
            case "image": {
                this.dDm = s1;
            }
        }
    }

    private void Zh(Drawable drawable0) {
        if(drawable0 == null) {
            return;
        }
        switch(this.oMU) {
            case "column": {
                ((com.bytedance.adsdk.ugeno.SM.cz.PjT)this.JQp).setCompoundDrawablesWithIntrinsicBounds(null, drawable0, null, null);
                return;
            }
            case "column_reverse": {
                ((com.bytedance.adsdk.ugeno.SM.cz.PjT)this.JQp).setCompoundDrawablesWithIntrinsicBounds(null, null, null, drawable0);
                return;
            }
            case "row": {
                break;
            }
            case "row_reverse": {
                ((com.bytedance.adsdk.ugeno.SM.cz.PjT)this.JQp).setCompoundDrawablesWithIntrinsicBounds(null, null, drawable0, null);
                return;
            }
        }
        ((com.bytedance.adsdk.ugeno.SM.cz.PjT)this.JQp).setCompoundDrawablesWithIntrinsicBounds(drawable0, null, null, null);
    }

    @Override  // com.bytedance.adsdk.ugeno.SM.cz.Zh
    public void Zh() {
        super.Zh();
        this.cr();
        ((com.bytedance.adsdk.ugeno.SM.cz.PjT)this.JQp).setGravity(17);
    }

    private void cr() {
        if(TextUtils.isEmpty(this.dDm)) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.SM.cz.PjT)this.JQp).setCompoundDrawables(null, null, null, null);
        if(this.dDm.startsWith("local://")) {
            try {
                this.Zh(Au.PjT(this.Zh, cr.PjT(this.Zh, this.dDm.replace("local://", ""))));
            }
            catch(Throwable unused_ex) {
            }
            return;
        }
        JQp.PjT().Zh().PjT(this.SM, this.dDm, new com.bytedance.adsdk.ugeno.PjT.PjT() {
            final PjT PjT;

            @Override  // com.bytedance.adsdk.ugeno.PjT$PjT
            public void PjT(Bitmap bitmap0) {
                if(bitmap0 == null) {
                    return;
                }
                Au.PjT(new Runnable() {
                    final com.bytedance.adsdk.ugeno.SM.PjT.PjT.1 Zh;

                    @Override
                    public void run() {
                        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(PjT.this.Zh.getResources(), bitmap0);
                        PjT.this.Zh(bitmapDrawable0);
                    }
                });
            }
        });
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    protected void kph() {
        super.kph();
        if(this.uvo) {
            ((com.bytedance.adsdk.ugeno.SM.cz.PjT)this.JQp).setTextColor(this.Lx);
        }
        if(this.QB) {
            if(this.Wo) {
                this.PjT(this.fU);
                return;
            }
            this.cr(this.Gr);
        }
    }
}

