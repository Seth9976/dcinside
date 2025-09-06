package com.bytedance.sdk.openadsdk.core.xf.Zh;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.PjT.PjT.PjT.cz.b;
import com.bykv.vk.openvk.PjT.PjT.PjT.cz.d;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.JQp.xE;
import com.bytedance.sdk.component.utils.KM.PjT;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.gK.Zh;
import com.bytedance.sdk.openadsdk.core.widget.gK;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.XX;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz;
import com.bytedance.sdk.openadsdk.utils.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import x.a;
import x.c;
import y4.m;

public class JQp implements b, PjT, com.bytedance.sdk.openadsdk.core.Zh.PjT.PjT, Zh, com.bytedance.sdk.openadsdk.core.widget.ub.PjT, c {
    ImageView Au;
    com.bytedance.sdk.openadsdk.core.Zh.PjT Co;
    View DWo;
    ImageView JQp;
    com.bytedance.sdk.openadsdk.core.Zh.PjT Jo;
    boolean KM;
    int Lrd;
    int Owx;
    protected final int PjT;
    cz Qf;
    boolean RD;
    ViewGroup ReZ;
    View SM;
    boolean Sks;
    View XX;
    com.bytedance.sdk.openadsdk.core.xf.Zh.PjT Yo;
    x.b ZX;
    private long Zd;
    protected final int Zh;
    Owx cRA;
    d cr;
    View cz;
    TextView fDm;
    int gK;
    gK iZZ;
    private final String ig;
    int ltE;
    private com.bytedance.sdk.openadsdk.core.xf.Zh.cz.PjT qZS;
    ImageView qj;
    TextView qla;
    int tT;
    int ub;
    boolean wN;
    TextView xE;
    View xf;
    com.bytedance.sdk.openadsdk.core.widget.PjT xs;
    Context yIW;

    public JQp(Context context0, ViewGroup viewGroup0, boolean z, int v, Owx owx0, x.b b0) {
        this(context0, viewGroup0, z, v, owx0, b0, true);
    }

    public JQp(Context context0, ViewGroup viewGroup0, boolean z, int v, Owx owx0, x.b b0, boolean z1) {
        this.PjT = 0xE4;
        this.Zh = 0xA0;
        this.RD = true;
        this.KM = true;
        this.wN = true;
        this.ig = Build.MODEL;
        if(this instanceof cr) {
            return;
        }
        this.yIW = ub.PjT().getApplicationContext();
        this.cr(z1);
        this.ReZ = viewGroup0;
        this.RD = z;
        this.Lrd = v;
        this.ZX = b0;
        this.cRA = owx0;
        this.cr(8);
        this.PjT(context0, this.ReZ);
        this.cr();
        this.xf();
    }

    public void Au() {
        qZS.JQp(this.cz);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.widget.gK$Zh
    public boolean DWo() {
        return false;
    }

    private int JQp(int v) {
        if(this.ltE > 0 && this.Owx > 0) {
            int v1 = qZS.Zh(this.yIW, 228.0f);
            int v2 = qZS.Zh(this.yIW, 160.0f);
            int v3 = (int)(((float)this.Owx) * (((float)v) * 1.0f / ((float)this.ltE)));
            if(v3 <= v1) {
                return v3 >= v2 ? v3 : v2;
            }
            return v1;
        }
        return 0;
    }

    public void JQp() {
    }

    boolean Lrd() {
        return (this.Lrd & 4) != 4 || this.RD;
    }

    public void Owx() {
        ImageView imageView0 = this.qj;
        if(imageView0 != null) {
            imageView0.setImageBitmap(null);
        }
        com.bytedance.sdk.openadsdk.core.widget.PjT pjT0 = this.xs;
        if(pjT0 != null) {
            pjT0.setImageBitmap(null);
        }
    }

    private void PjT(int v, String s, Owx owx0) {
        ReZ.PjT(new Au("load_vast_icon_fail") {
            final JQp cr;

            @Override
            public void run() {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("error_code", v);
                    jSONObject0.put("description", v + ":" + s);
                    jSONObject0.put("url", JQp.this.cRA.Xe().PjT());
                }
                catch(Throwable unused_ex) {
                }
                String s = JQp.this.cRA == null ? null : wN.ReZ(owx0.XWz());
                ReZ.Zh(JQp.this.cRA, s, "load_vast_icon_fail", jSONObject0);
            }
        });
    }

    @Override  // x.c
    public void PjT() {
        this.PjT(false, this.RD);
        this.ltE();
    }

    public void PjT(int v) {
    }

    public void PjT(int v, int v1) {
        if(v == -1) {
            v = qZS.ReZ(this.yIW);
        }
        if(v <= 0) {
            return;
        }
        this.ub = v;
        this.gK = this.RD() || this.DWo() || (this.Lrd & 8) == 8 ? v1 : this.JQp(v);
        this.Zh(this.ub, this.gK);
    }

    public void PjT(long v) {
    }

    public void PjT(long v, long v1) {
    }

    void PjT(Context context0, View view0) {
        if((this.cRA == null || !this.cRA.DnO() && !this.cRA.dnv() || xs.Gr().Qtm()) && view0 != null) {
            view0.setKeepScreenOn(true);
        }
        com.bykv.vk.openvk.PjT.PjT.PjT.cz.c c0 = this.ZX == null || !this.ZX.ub() ? new com.bykv.vk.openvk.PjT.PjT.PjT.cz.c(this.yIW) : new com.bykv.vk.openvk.PjT.PjT.PjT.cz.cr(this.yIW);
        if(view0 instanceof RelativeLayout) {
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(13);
            ((RelativeLayout)view0).addView(c0, 0, relativeLayout$LayoutParams0);
        }
        qZS.PjT(c0, 8);
        this.cr = c0;
        this.JQp = (ImageView)view0.findViewById(qla.dG);
        this.cz = view0.findViewById(qla.QB);
        this.XX = view0.findViewById(qla.sjb);
        this.Au = (ImageView)view0.findViewById(qla.pBJ);
        this.SM = view0.findViewById(qla.fU);
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.PjT.cz.b
    public void PjT(SurfaceTexture surfaceTexture0, int v, int v1) {
        this.Sks = true;
        if(this.xE()) {
            this.Yo.PjT(this, surfaceTexture0);
        }
    }

    @Override  // x.c
    public void PjT(Drawable drawable0) {
        ViewGroup viewGroup0 = this.ReZ;
        if(viewGroup0 != null) {
            viewGroup0.setBackgroundDrawable(drawable0);
        }
    }

    @Override  // com.bytedance.sdk.component.utils.KM$PjT
    public void PjT(Message message0) {
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.PjT.cz.b
    public void PjT(SurfaceHolder surfaceHolder0) {
        if(surfaceHolder0 != this.cr.getHolder()) {
            return;
        }
        this.Sks = true;
        if(this.xE()) {
            this.Yo.PjT(this, surfaceHolder0);
        }
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.PjT.cz.b
    public void PjT(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
        if(surfaceHolder0 != this.cr.getHolder()) {
        }
    }

    void PjT(View view0, Context context0) {
        if(view0 != null && context0 != null && (this.SM != null && this.SM.getParent() != null && this.DWo == null)) {
            this.DWo = this.SM;
            this.qj = (ImageView)view0.findViewById(qla.uvo);
            this.xf = view0.findViewById(qla.Lx);
            this.xs = (com.bytedance.sdk.openadsdk.core.widget.PjT)view0.findViewById(qla.kph);
            this.fDm = (TextView)view0.findViewById(qla.IJ);
            this.qla = (TextView)view0.findViewById(qla.OMu);
            this.xE = (TextView)view0.findViewById(qla.VY);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.widget.ub$PjT
    public void PjT(View view0, boolean z) {
    }

    public void PjT(@m ViewGroup viewGroup0) {
    }

    public void PjT(PAGNativeAd pAGNativeAd0) {
        com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0 = this.Jo;
        if(pjT0 != null) {
            pjT0.PjT(pAGNativeAd0);
        }
        com.bytedance.sdk.openadsdk.core.Zh.PjT pjT1 = this.Co;
        if(pjT1 != null) {
            pjT1.PjT(pAGNativeAd0);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void PjT(Owx owx0, WeakReference weakReference0, boolean z) {
        String s;
        if(owx0 == null) {
            return;
        }
        this.PjT(false, this.RD);
        this.PjT(this.ReZ, ub.PjT());
        View view0 = this.DWo;
        if(view0 != null) {
            qZS.PjT(view0, 0);
        }
        ImageView imageView0 = this.qj;
        if(imageView0 != null) {
            qZS.PjT(imageView0, 0);
        }
        qZS.PjT(this.xf, 0);
        if(this.qj != null && (this.cRA != null && this.cRA.MWx() != null && this.cRA.MWx().c() != null)) {
            com.bytedance.sdk.openadsdk.gK.Zh.PjT().PjT(this.cRA.MWx().c(), this.cRA.MWx().o(), this.cRA.MWx().w(), this.qj, owx0);
        }
        if(!TextUtils.isEmpty(owx0.Ld())) {
            s = owx0.Ld();
        }
        else if(TextUtils.isEmpty(owx0.Xtz())) {
            s = TextUtils.isEmpty(owx0.ix()) ? "" : owx0.ix();
        }
        else {
            s = owx0.Xtz();
        }
        if(this.xs != null && (this.cRA != null && this.cRA.Xe() != null && this.cRA.Xe().PjT() != null)) {
            qZS.PjT(this.xs, 0);
            qZS.PjT(this.fDm, 4);
            if(this.cRA == null || !this.cRA.uvo()) {
                com.bytedance.sdk.openadsdk.gK.Zh.PjT().PjT(this.cRA.Xe(), this.xs, owx0);
            }
            else {
                com.bytedance.sdk.openadsdk.SM.cr.PjT(this.cRA.Xe()).ReZ(2).PjT(new com.bytedance.sdk.openadsdk.SM.Zh(owx0, this.cRA.Xe().PjT(), new xE() {
                    final JQp Zh;

                    @Override  // com.bytedance.sdk.component.JQp.xE
                    public void PjT(int v, String s, @m Throwable throwable0) {
                        JQp.this.PjT(v, s, owx0);
                    }

                    @Override  // com.bytedance.sdk.component.JQp.xE
                    public void PjT(qj qj0) {
                        if(qj0 != null && qj0.Zh() != null) {
                            com.bytedance.sdk.openadsdk.core.widget.PjT pjT0 = JQp.this.xs;
                            if(pjT0 != null) {
                                pjT0.setImageBitmap(((Bitmap)qj0.Zh()));
                            }
                            String s = JQp.this.cRA == null ? null : wN.ReZ(owx0.XWz());
                            ReZ.Zh(JQp.this.cRA, s, "load_vast_icon_success", null);
                        }
                    }
                }));
                if(this.cRA.QB() != null && this.cRA.QB().Zh() != null) {
                    this.cRA.QB().Zh().Zh(0L);
                }
            }
            if(this.cRA != null && this.cRA.uvo()) {
                try {
                    this.xs.setTag(0x22000001, "VAST_ICON");
                }
                catch(Throwable unused_ex) {
                }
            }
            if(this.cRA != null && this.cRA.QB() != null && this.cRA.QB().Zh() != null) {
                com.bytedance.sdk.openadsdk.core.qj.Zh zh0 = this.cRA.QB().Zh();
                com.bytedance.sdk.openadsdk.core.widget.PjT pjT0 = this.xs;
                if(pjT0 != null) {
                    pjT0.post(new Runnable() {
                        final JQp Zh;

                        @Override
                        public void run() {
                            com.bytedance.sdk.openadsdk.core.widget.PjT pjT0 = JQp.this.xs;
                            if(pjT0 != null && pjT0.isShown()) {
                                com.bytedance.sdk.openadsdk.core.qj.Zh zh0 = zh0;
                                if(zh0 != null) {
                                    zh0.Zh(JQp.this.getVideoProgress());
                                }
                            }
                        }
                    });
                }
            }
            if(this.cRA()) {
                this.xs.setOnClickListener(this.Co);
                this.xs.setOnTouchListener(this.Co);
            }
            else {
                this.xs.setOnClickListener(this.Jo);
                this.xs.setOnTouchListener(this.Jo);
            }
        }
        else if(!TextUtils.isEmpty(s)) {
            qZS.PjT(this.xs, 4);
            qZS.PjT(this.fDm, 0);
            TextView textView0 = this.fDm;
            if(textView0 != null) {
                textView0.setText(s.substring(0, 1));
                if(this.cRA()) {
                    this.fDm.setOnClickListener(this.Co);
                    this.fDm.setOnTouchListener(this.Co);
                }
                else {
                    this.fDm.setOnClickListener(this.Jo);
                    this.fDm.setOnTouchListener(this.Jo);
                }
            }
        }
        if(this.qla != null && !TextUtils.isEmpty(s)) {
            this.qla.setText(s);
            this.qla.setTag(0x22000001, "VAST_TITLE");
        }
        qZS.PjT(this.qla, 0);
        qZS.PjT(this.xE, 0);
        String s1 = owx0.Nv();
        if(TextUtils.isEmpty(s1)) {
            int v = owx0.cI();
            if(v == 2) {
                s1 = Lrd.PjT(this.yIW, "tt_video_mobile_go_detail");
            }
            else {
                switch(v) {
                    case 4: {
                        s1 = Lrd.PjT(this.yIW, "tt_video_download_apk");
                        break;
                    }
                    case 5: {
                        s1 = Lrd.PjT(this.yIW, "tt_video_dial_phone");
                        break;
                    }
                    case 3: 
                    case 8: {
                        s1 = Lrd.PjT(this.yIW, "tt_video_mobile_go_detail");
                        break;
                    }
                    default: {
                        s1 = Lrd.PjT(this.yIW, "tt_video_mobile_go_detail");
                    }
                }
            }
        }
        TextView textView1 = this.xE;
        if(textView1 != null) {
            textView1.setText(s1);
            this.xE.setOnClickListener(this.Jo);
            this.xE.setOnTouchListener(this.Jo);
        }
        if(!this.wN) {
            this.cz(4);
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.xf.Zh.cz.PjT cz$PjT0) {
        this.qZS = cz$PjT0;
    }

    @Override  // x.c
    @SuppressLint({"ClickableViewAccessibility"})
    public void PjT(Object object0, WeakReference weakReference0, boolean z) {
        this.PjT(((Owx)object0), weakReference0, z);
    }

    public void PjT(String s) {
    }

    public void PjT(a a0) {
        if(a0 instanceof com.bytedance.sdk.openadsdk.core.xf.Zh.PjT) {
            this.Yo = (com.bytedance.sdk.openadsdk.core.xf.Zh.PjT)a0;
            this.fDm();
        }
    }

    @Override  // x.c
    public void PjT(boolean z) {
        this.wN = z;
    }

    public void PjT(boolean z, boolean z1) {
        qZS.PjT(this.JQp, 8);
    }

    public void PjT(boolean z, boolean z1, boolean z2) {
        qZS.PjT(this.JQp, (!z || this.cz.getVisibility() == 0 ? 8 : 0));
    }

    public boolean PjT(int v, v.c c0, boolean z) {
        return this.iZZ == null || this.iZZ.PjT(v, c0, z);
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.PjT.cz.b
    public boolean PjT(SurfaceTexture surfaceTexture0) {
        this.Sks = false;
        if(this.xE()) {
            this.Yo.Zh(this, surfaceTexture0);
        }
        return true;
    }

    public boolean RD() {
        return this.RD;
    }

    @Override  // x.c
    public View ReZ() {
        return this.ReZ;
    }

    public void ReZ(int v) {
        qZS.PjT(this.ReZ, 0);
        d d0 = this.cr;
        if(d0 != null) {
            d0.setVisibility(v);
        }
    }

    public void ReZ(int v, int v1) {
        this.ltE = v;
        this.Owx = v1;
    }

    public void ReZ(@m ViewGroup viewGroup0) {
        if(viewGroup0 == null) {
            return;
        }
        if(this.ReZ.getParent() == null) {
            viewGroup0.addView(this.ReZ);
        }
        this.cr(0);
    }

    public void ReZ(boolean z) {
    }

    public void SM() {
        this.cr(8);
        if(this.Lrd()) {
            this.cr.setVisibility(8);
        }
        ImageView imageView0 = this.Au;
        if(imageView0 != null) {
            imageView0.setImageDrawable(null);
        }
        this.cr(8);
        qZS.PjT(this.DWo, 8);
        qZS.PjT(this.qj, 8);
        qZS.PjT(this.xf, 8);
        qZS.PjT(this.xs, 8);
        qZS.PjT(this.fDm, 8);
        qZS.PjT(this.qla, 8);
        gK gK0 = this.iZZ;
        if(gK0 != null) {
            gK0.PjT(true);
        }
    }

    public boolean Sks() {
        return this.Sks;
    }

    public void XX() {
        qZS.cz(this.cz);
        qZS.cz(this.XX);
        if(this.Au != null && (this.cRA != null && this.cRA.MWx() != null && this.cRA.MWx().c() != null)) {
            qZS.cz(this.Au);
            com.bytedance.sdk.openadsdk.gK.Zh.PjT().PjT(this.cRA.MWx().c(), this.cRA.MWx().o(), this.cRA.MWx().w(), this.Au, this.cRA);
        }
        if(this.JQp.getVisibility() == 0) {
            qZS.PjT(this.JQp, 8);
        }
    }

    @Override  // x.c
    public void Zh() {
        qZS.JQp(this.cz);
        qZS.JQp(this.XX);
        ImageView imageView0 = this.Au;
        if(imageView0 != null) {
            qZS.JQp(imageView0);
        }
    }

    public void Zh(int v, int v1) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.ReZ.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            return;
        }
        if(v == -2 || v == -1 || v > 0) {
            viewGroup$LayoutParams0.width = v;
        }
        if(v1 == -2 || v1 == -1 || v1 > 0) {
            viewGroup$LayoutParams0.height = v1;
        }
        this.ReZ.setLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.PjT.cz.b
    public void Zh(SurfaceHolder surfaceHolder0) {
        if(surfaceHolder0 != this.cr.getHolder()) {
            return;
        }
        this.Sks = false;
        if(this.xE()) {
            this.Yo.Zh(this, surfaceHolder0);
        }
    }

    public void Zh(@m ViewGroup viewGroup0) {
    }

    public void Zh(boolean z) {
    }

    public void Zh(boolean z, boolean z1) {
        ImageView imageView0 = this.JQp;
        if(imageView0 != null) {
            if(z) {
                imageView0.setImageDrawable(DWo.PjT(this.yIW, "tt_play_movebar_textpage"));
                return;
            }
            imageView0.setImageDrawable(DWo.PjT(this.yIW, "tt_stop_movebar_textpage"));
        }
    }

    public boolean Zh(int v) {
        return false;
    }

    private boolean cRA() {
        if(com.bytedance.sdk.openadsdk.core.DWo.ReZ.PjT(this.cRA.ZX())) {
            return this.cRA.xH() == null ? Owx.JQp(this.cRA) && this.cRA.Qf() == 1 : Owx.JQp(this.cRA) && false && this.cRA.Qf() == 1;
        }
        return this.cRA.VY() == null ? Owx.JQp(this.cRA) && this.cRA.Qf() == 1 : Owx.JQp(this.cRA) && false && this.cRA.Qf() == 1;
    }

    void cr() {
        this.cr.a(this);
        this.JQp.setOnClickListener(new View.OnClickListener() {
            final JQp PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(JQp.this.xE()) {
                    TextView textView0 = JQp.this.xE;
                    if(textView0 != null && textView0.getVisibility() == 0) {
                        return;
                    }
                    JQp.this.Yo.PjT(JQp.this, view0);
                }
            }
        });
    }

    public void cr(int v) {
        this.tT = v;
        qZS.PjT(this.ReZ, v);
    }

    public void cr(boolean z) {
        this.KM = z;
        if(z) {
            com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0 = this.Jo;
            if(pjT0 != null) {
                pjT0.PjT(true);
            }
            com.bytedance.sdk.openadsdk.core.Zh.PjT pjT1 = this.Co;
            if(pjT1 != null) {
                pjT1.PjT(true);
            }
        }
        else {
            com.bytedance.sdk.openadsdk.core.Zh.PjT pjT2 = this.Jo;
            if(pjT2 != null) {
                pjT2.PjT(false);
            }
            com.bytedance.sdk.openadsdk.core.Zh.PjT pjT3 = this.Co;
            if(pjT3 != null) {
                pjT3.PjT(false);
            }
        }
    }

    private void cz(int v) {
        qZS.PjT(this.xf, v);
    }

    public void cz() {
    }

    void fDm() {
        if(this.Yo != null && this.iZZ == null) {
            gK gK0 = new gK();
            this.iZZ = gK0;
            gK0.PjT(this.yIW, this.ReZ);
            this.iZZ.PjT(this.Yo, this);
        }
    }

    @TargetApi(14)
    public void gK() {
        qZS.PjT(this.ReZ, 0);
        d d0 = this.cr;
        if(d0 != null) {
            qZS.PjT(d0.getView(), 0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Zh.PjT$PjT
    public long getVideoProgress() {
        if(this.Zd <= 0L) {
            if(this.cRA != null && this.cRA.MWx() != null) {
                this.Zd = (long)(this.cRA.MWx().C() * 1000.0);
            }
            x.b b0 = this.ZX;
            if(b0 != null) {
                this.Zd = b0.Au();
            }
        }
        return this.Zd;
    }

    void ltE() {
        try {
            qZS.PjT(this.DWo, 8);
            qZS.PjT(this.qj, 8);
            qZS.PjT(this.xf, 8);
            qZS.PjT(this.xs, 8);
            qZS.PjT(this.fDm, 8);
            qZS.PjT(this.qla, 8);
            qZS.PjT(this.xE, 8);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.widget.gK$Zh
    public void qj() {
        this.PjT(true, false);
    }

    public void qla() {
        gK gK0 = this.iZZ;
        if(gK0 != null) {
            gK0.PjT(false);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.widget.ub$PjT
    public boolean tT() {
        return this.iZZ != null && this.iZZ.PjT();
    }

    public void ub() {
        qZS.cz(this.cz);
        qZS.cz(this.XX);
        if(this.JQp.getVisibility() == 0) {
            qZS.PjT(this.JQp, 8);
        }
    }

    boolean xE() {
        return this.Yo != null;
    }

    void xf() {
        int v;
        String s1;
        String s = this.KM ? "embeded_ad" : "embeded_ad_landingpage";
        if(this.cRA.Sky()) {
            s1 = "rewarded_video";
            v = 7;
        }
        else if(this.cRA.GL()) {
            s1 = "fullscreen_interstitial_ad";
            v = 5;
        }
        else if(this.cRA.dnv()) {
            s1 = "banner_ad";
            v = 2;
        }
        else {
            s1 = s;
            v = 1;
        }
        if(this.cRA.cI() == 4) {
            this.Qf = XX.PjT(this.yIW, this.cRA, s1);
        }
        com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.core.Zh.PjT(this.yIW, this.cRA, s1, v);
        this.Jo = pjT0;
        pjT0.PjT(this);
        this.Jo.Zh(true);
        if(this.KM) {
            this.Jo.PjT(true);
        }
        else {
            this.Jo.PjT(false);
            this.Jo.ReZ(true);
        }
        this.Jo.PjT(this.ZX);
        this.Jo.JQp(true);
        this.Jo.PjT(new com.bytedance.sdk.openadsdk.core.Zh.Zh.PjT() {
            final JQp PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh$PjT
            public void PjT(View view0, int v) {
                if(JQp.this.qZS != null) {
                    JQp.this.qZS.PjT(view0, v);
                }
            }
        });
        cz cz0 = this.Qf;
        if(cz0 != null) {
            com.bytedance.sdk.openadsdk.core.Zh.PjT pjT1 = this.Jo;
            if(pjT1 != null) {
                pjT1.PjT(cz0);
            }
        }
        if(this.cRA()) {
            com.bytedance.sdk.openadsdk.core.xf.Zh.JQp.2 jQp$20 = new com.bytedance.sdk.openadsdk.core.Zh.PjT(this.yIW, this.cRA, s1, v) {
                final JQp PjT;

                @Override  // com.bytedance.sdk.openadsdk.core.Zh.PjT
                public boolean ReZ() {
                    View view0 = JQp.this.DWo;
                    if(view0 == null || view0.getVisibility() != 0) {
                        View view1 = JQp.this.xf;
                        if(view1 == null || view1.getVisibility() != 0) {
                            com.bytedance.sdk.openadsdk.core.widget.PjT pjT0 = JQp.this.xs;
                            if(pjT0 == null || pjT0.getVisibility() != 0) {
                                TextView textView0 = JQp.this.fDm;
                                return textView0 != null && textView0.getVisibility() == 0;
                            }
                        }
                    }
                    return true;
                }

                @Override  // com.bytedance.sdk.openadsdk.core.Zh.PjT
                public boolean Zh() {
                    gK gK0 = JQp.this.iZZ;
                    boolean z = gK0 == null ? false : gK0.PjT();
                    JQp.this.JQp.getVisibility();
                    return z || JQp.this.JQp.getVisibility() == 0;
                }
            };
            this.Co = jQp$20;
            jQp$20.PjT(new com.bytedance.sdk.openadsdk.core.Zh.Zh.PjT() {
                final JQp PjT;

                @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh$PjT
                public void PjT(View view0, int v) {
                    if(JQp.this.qZS != null) {
                        JQp.this.qZS.PjT(view0, v);
                    }
                }
            });
            this.Co.Zh(true);
            this.Co.PjT(this.KM);
            this.Co.PjT(this.ZX);
            this.Co.JQp(true);
            cz cz1 = this.Qf;
            if(cz1 != null) {
                this.Co.PjT(cz1);
            }
            this.Co.PjT(this);
        }
    }

    public d xs() {
        return this.cr;
    }
}

