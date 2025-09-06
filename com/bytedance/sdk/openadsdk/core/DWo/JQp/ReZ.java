package com.bytedance.sdk.openadsdk.core.DWo.JQp;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.DWo;
import com.bytedance.adsdk.ugeno.core.SM;
import com.bytedance.adsdk.ugeno.core.xf.Zh;
import com.bytedance.adsdk.ugeno.core.xf;
import com.bytedance.adsdk.ugeno.core.xs;
import com.bytedance.sdk.component.adexpress.Zh.Au;
import com.bytedance.sdk.component.adexpress.Zh.XX;
import com.bytedance.sdk.component.adexpress.Zh.cr;
import com.bytedance.sdk.component.adexpress.Zh.fDm;
import com.bytedance.sdk.component.adexpress.cr.cz;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.JQp;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class ReZ implements xf, xs, cr, com.bytedance.sdk.component.adexpress.dynamic.cr {
    protected Au Au;
    private ltE Co;
    protected AtomicBoolean DWo;
    protected Owx JQp;
    private com.bytedance.sdk.openadsdk.core.DWo.JQp.cr Jo;
    private static float KM = 0.0f;
    protected JSONObject Lrd;
    protected static int Owx = 24;
    protected SM PjT;
    private static float Qf;
    protected WeakReference RD;
    protected com.bytedance.adsdk.ugeno.Zh.ReZ ReZ;
    protected fDm SM;
    protected String Sks;
    protected FrameLayout XX;
    private static float Yo;
    private static float ZX;
    private final Runnable Zd;
    protected Context Zh;
    private XX cRA;
    protected JSONObject cr;
    protected PjT cz;
    protected float fDm;
    protected long gK;
    private static long iZZ;
    private boolean ig;
    protected boolean ltE;
    private final com.bytedance.sdk.component.Au.Au qZS;
    protected com.bytedance.adsdk.ugeno.Zh.ReZ qj;
    protected float qla;
    public SparseArray tT;
    protected long ub;
    private String wN;
    protected float xE;
    protected com.bytedance.adsdk.ugeno.Zh.ReZ xf;
    protected float xs;
    private final boolean yIW;

    static {
        if(ub.PjT() != null) {
            ReZ.Owx = ub.Zh();
        }
    }

    public ReZ(Context context0, Owx owx0, boolean z, PjT pjT0, ViewGroup viewGroup0) {
        this.ltE = true;
        this.tT = new SparseArray();
        this.wN = "";
        this.qZS = new com.bytedance.sdk.component.Au.Au("ugen_render_template") {
            final ReZ PjT;

            @Override
            public void run() {
                ReZ.this.cr = ReZ.this.PjT();
                if(ReZ.this.Co == null) {
                    ReZ.this.wN = "expressView is null";
                }
                else {
                    String s = ReZ.this.Co.getUgenTemplateErrorReason();
                    ReZ.this.wN = s;
                }
                com.bytedance.sdk.openadsdk.core.fDm.ReZ().post(ReZ.this.Zd);
            }
        };
        this.Zd = new Runnable() {
            final ReZ PjT;

            @Override
            public void run() {
                if(ReZ.this.cRA != null) {
                    XX xX0 = ReZ.this.cRA;
                    ReZ.this.Zh(xX0);
                }
            }
        };
        this.ig = false;
        this.Zh = context0;
        this.yIW = z;
        this.PjT = new SM(context0);
        this.JQp = owx0;
        this.cz = pjT0;
        this.XX = new FrameLayout(context0);
        this.DWo = new AtomicBoolean(false);
        if(viewGroup0 instanceof ltE) {
            this.Co = (ltE)viewGroup0;
        }
        this.Sks = pjT0.cr();
        JSONObject jSONObject0 = this.Zh();
        this.Lrd = jSONObject0;
        this.Jo = new com.bytedance.sdk.openadsdk.core.DWo.JQp.cr(this.Zh, this.JQp, this.Sks, jSONObject0);
    }

    protected com.bytedance.adsdk.ugeno.Zh.ReZ Au() {
        return this.ReZ == null ? null : this.ReZ.ReZ("feedback");
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.cr
    public View JQp() {
        return this.XX;
    }

    private void PjT(DWo dWo0) {
        int v1;
        JSONObject jSONObject0;
        boolean z1;
        int v = 5;
        boolean z = true;
        if(this.Au == null) {
            return;
        }
        String s = dWo0.ReZ().optString("type");
        if("swiperLeft".equals(s)) {
            com.bytedance.sdk.openadsdk.core.DWo.JQp.cr cr0 = this.Jo;
            if(cr0 != null) {
                cr0.Zh();
                return;
            }
        }
        if("swiperRight".equals(s)) {
            com.bytedance.sdk.openadsdk.core.DWo.JQp.cr cr1 = this.Jo;
            if(cr1 != null) {
                cr1.ReZ();
                return;
            }
        }
        if("swiperClick".equals(s)) {
            com.bytedance.sdk.openadsdk.core.DWo.JQp.cr cr2 = this.Jo;
            if(cr2 != null) {
                z1 = cr2.PjT(dWo0);
                jSONObject0 = this.Jo.cr();
                v1 = 2;
                goto label_25;
            }
            goto label_22;
        }
        else {
        label_22:
            jSONObject0 = null;
            z1 = false;
            v1 = 0;
        }
    label_25:
        s.hashCode();
        switch(s) {
            case "creative": {
                v = 2;
                break;
            }
            case "feedback": {
                v = 3;
                break;
            }
            case "mute": {
                break;
            }
            case "privacy": {
                v = 7;
                break;
            }
            case "skip": {
                v = 6;
                break;
            }
            case "video": {
                v = 4;
                break;
            }
            default: {
                v = v1;
            }
        }
        com.bytedance.adsdk.ugeno.Zh.ReZ reZ0 = dWo0.PjT();
        int[] arr_v = new int[2];
        int[] arr_v1 = new int[2];
        WeakReference weakReference0 = this.RD;
        if(weakReference0 != null) {
            int[] arr_v2 = qZS.PjT(((View)weakReference0.get()));
            if(arr_v2 != null) {
                arr_v = arr_v2;
            }
            int[] arr_v3 = qZS.ReZ(((View)this.RD.get()));
            if(arr_v3 != null) {
                arr_v1 = arr_v3;
            }
        }
        com.bytedance.sdk.openadsdk.core.model.fDm.PjT fDm$PjT0 = new com.bytedance.sdk.openadsdk.core.model.fDm.PjT().cr(this.xs).ReZ(this.fDm).Zh(this.qla).PjT(this.xE).Zh(this.ub).PjT(this.gK).ReZ(arr_v[0]).cr(arr_v[1]).JQp(arr_v1[0]).cz(arr_v1[1]).PjT(this.tT);
        if(dWo0.Zh() == 1 && !this.ltE) {
            z = false;
        }
        com.bytedance.sdk.openadsdk.core.model.fDm fDm0 = fDm$PjT0.PjT(z).PjT((reZ0 == null ? "" : reZ0.Co() + "_" + reZ0.Jo())).Zh(z1).Zh(jSONObject0).PjT();
        this.Au.PjT(dWo0.PjT().qj(), v, fDm0);
    }

    private void PjT(CharSequence charSequence0, boolean z, int v, boolean z1) {
        int v1;
        com.bytedance.adsdk.ugeno.Zh.ReZ reZ0 = this.ReZ;
        if(reZ0 == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.Zh.ReZ reZ1 = reZ0.ReZ("countdown");
        if(reZ1 == null) {
            return;
        }
        View view0 = reZ1.qj();
        if(!(view0 instanceof TextView)) {
            return;
        }
        try {
            v1 = Integer.parseInt(((String)charSequence0));
        }
        catch(Exception unused_ex) {
            RD.Zh("UGenRender", new Object[]{"parse duration exception", charSequence0});
            v1 = 0;
        }
        if(!z1 && v1 > 0 && !this.ig) {
            view0.setVisibility(0);
            if(!z && this.cz.PjT() && cz.Zh(this.cz.cr())) {
                ((TextView)view0).setText(String.format(Lrd.PjT(com.bytedance.sdk.component.adexpress.cr.PjT(), "tt_reward_full_skip"), v));
                return;
            }
            if(!"open_ad".equals(this.cz.cr()) && this.cz.PjT()) {
                this.ig = true;
                view0.setVisibility(8);
                return;
            }
            ((TextView)view0).setText(charSequence0 + "s");
            return;
        }
        view0.setVisibility(8);
    }

    private void PjT(JSONObject jSONObject0) {
        if(this.ReZ == null) {
            return;
        }
        if(jSONObject0 == null) {
            return;
        }
        String s = jSONObject0.optString("type");
        String s1 = jSONObject0.optString("nodeId");
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        com.bytedance.adsdk.ugeno.Zh.ReZ reZ0 = this.ReZ.ReZ(s1);
        if(reZ0 != null) {
            if(TextUtils.equals(s, "onShow")) {
                reZ0.ReZ(0);
                return;
            }
            if(TextUtils.equals(s, "onDismiss")) {
                reZ0.ReZ(8);
            }
        }
    }

    protected JSONObject PjT() {
        return this.cz.ReZ();
    }

    @Override  // com.bytedance.adsdk.ugeno.core.xs
    public void PjT(com.bytedance.adsdk.ugeno.Zh.ReZ reZ0, MotionEvent motionEvent0) {
        int v2;
        int v = -1;
        int v1 = 1;
        switch(motionEvent0.getAction()) {
            case 0: {
                this.ub = System.currentTimeMillis();
                this.xs = motionEvent0.getRawX();
                this.fDm = motionEvent0.getRawY();
                this.ltE = true;
                ReZ.iZZ = System.currentTimeMillis();
                com.bytedance.sdk.openadsdk.core.SM.ReZ.PjT(motionEvent0);
                v2 = 0;
                this.tT.put(motionEvent0.getActionMasked(), new com.bytedance.sdk.openadsdk.core.Zh.ReZ.PjT(v2, ((double)motionEvent0.getSize()), ((double)motionEvent0.getPressure()), System.currentTimeMillis()));
                return;
            }
            case 1: {
                break;
            }
            case 2: {
                ReZ.Qf += Math.abs(motionEvent0.getX() - ReZ.Yo);
                ReZ.ZX += Math.abs(motionEvent0.getY() - ReZ.KM);
                ReZ.Yo = motionEvent0.getX();
                ReZ.KM = motionEvent0.getY();
                if(System.currentTimeMillis() - ReZ.iZZ <= 200L || ReZ.Qf <= ((float)ReZ.Owx) && ReZ.ZX <= ((float)ReZ.Owx)) {
                    v1 = 2;
                }
                if(Math.abs(motionEvent0.getRawX() - this.xs) >= ((float)ReZ.Owx) || Math.abs(motionEvent0.getRawY() - this.fDm) >= ((float)ReZ.Owx)) {
                    this.ltE = false;
                }
                v = v1;
                break;
            }
            default: {
                v2 = -1;
                this.tT.put(motionEvent0.getActionMasked(), new com.bytedance.sdk.openadsdk.core.Zh.ReZ.PjT(v2, ((double)motionEvent0.getSize()), ((double)motionEvent0.getPressure()), System.currentTimeMillis()));
                return;
            }
        }
        this.qla = motionEvent0.getRawX();
        this.xE = motionEvent0.getRawY();
        if(Math.abs(this.qla - this.xs) >= ((float)ReZ.Owx) || Math.abs(this.xE - this.fDm) >= ((float)ReZ.Owx)) {
            this.ltE = false;
        }
        this.gK = System.currentTimeMillis();
        v2 = v;
        this.tT.put(motionEvent0.getActionMasked(), new com.bytedance.sdk.openadsdk.core.Zh.ReZ.PjT(v2, ((double)motionEvent0.getSize()), ((double)motionEvent0.getPressure()), System.currentTimeMillis()));
    }

    @Override  // com.bytedance.adsdk.ugeno.core.xf
    public void PjT(com.bytedance.adsdk.ugeno.Zh.ReZ reZ0, String s, com.bytedance.adsdk.ugeno.cr.cz.PjT cz$PjT0) {
    }

    @Override  // com.bytedance.adsdk.ugeno.core.xf
    public void PjT(DWo dWo0, Zh xf$Zh0, com.bytedance.adsdk.ugeno.core.xf.PjT xf$PjT0) {
        if(dWo0 == null) {
            return;
        }
        switch(dWo0.Zh()) {
            case 1: 
            case 4: {
                this.PjT(dWo0);
            }
        }
        if(dWo0.Zh() == 10) {
            this.PjT(dWo0.ReZ());
        }
        if(xf$Zh0 != null && dWo0.cr() != null) {
            xf$Zh0.PjT(dWo0.cr());
        }
    }

    public void PjT(Au au0) {
        this.Au = au0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.cr
    public void PjT(XX xX0) {
        this.cRA = xX0;
        Jo.Zh(this.qZS);
    }

    public void PjT(JQp jQp0) {
        com.bytedance.sdk.openadsdk.core.DWo.JQp.cr cr0 = this.Jo;
        if(cr0 != null) {
            cr0.PjT(jQp0);
        }
    }

    public void PjT(boolean z) {
        this.DWo.set(z);
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.cr
    public int ReZ() {
        return this.JQp.ZX();
    }

    private void SM() {
        if(this.ReZ == null) {
            return;
        }
        if(this.JQp.AjB()) {
            com.bytedance.adsdk.ugeno.Zh.ReZ reZ0 = this.ReZ.ReZ("tvskip");
            if(reZ0 != null) {
                reZ0.ReZ(8);
            }
        }
        com.bytedance.adsdk.ugeno.Zh.ReZ reZ1 = this.ReZ.ReZ("skip");
        if(reZ1 == null) {
            return;
        }
        if(reZ1 instanceof com.bytedance.adsdk.ugeno.SM.cr.ReZ) {
            if(com.bytedance.sdk.openadsdk.core.settings.xs.Gr().fDm(String.valueOf(this.JQp.joj()))) {
                switch(this.JQp.RD()) {
                    case 5: 
                    case 6: {
                        ((com.bytedance.adsdk.ugeno.SM.cr.ReZ)reZ1).Au("local://tt_close_btn");
                        reZ1.Zh();
                        return;
                    }
                }
                if(this.JQp.kW() == 3) {
                    ((com.bytedance.adsdk.ugeno.SM.cr.ReZ)reZ1).Au("local://tt_close_btn");
                    reZ1.Zh();
                }
            }
            else {
                ((com.bytedance.adsdk.ugeno.SM.cr.ReZ)reZ1).Au("local://tt_close_btn");
                reZ1.Zh();
            }
        }
    }

    protected com.bytedance.adsdk.ugeno.Zh.ReZ XX() {
        return this.ReZ == null ? null : this.ReZ.ReZ("video");
    }

    private void Zh(XX xX0) {
        this.cz.ZX().PjT();
        if(this.cr == null) {
            xX0.PjT(0x85, "ugen template is null real reason is " + this.wN);
            return;
        }
        if(this.Lrd == null) {
            xX0.PjT(0x85, "ugen data is null");
            return;
        }
        int v = this.cr();
        if(this.PjT.PjT()) {
            List list0 = this.PjT.Zh();
            if(list0 == null) {
                xX0.PjT(0x8A, "unknow widget");
                return;
            }
            xX0.PjT(0x8A, "unknow widget;" + list0.toString());
            return;
        }
        if(v != 0) {
            xX0.PjT(v, "ugen render fail");
            return;
        }
        if(this.ReZ != null) {
            com.bytedance.sdk.openadsdk.core.DWo.JQp.Zh zh0 = new com.bytedance.sdk.openadsdk.core.DWo.JQp.Zh();
            this.SM = zh0;
            zh0.PjT(true);
            this.SM.PjT(this.ReZ());
            this.setSoundMute(this.yIW);
            this.SM();
            com.bytedance.adsdk.ugeno.Zh.ReZ reZ0 = this.XX();
            this.qj = reZ0;
            if(reZ0 != null && reZ0 instanceof com.bytedance.sdk.openadsdk.core.DWo.Zh.Zh.Zh) {
                ((com.bytedance.sdk.openadsdk.core.DWo.JQp.Zh)this.SM).PjT(((com.bytedance.sdk.openadsdk.core.DWo.Zh.Zh.Zh)reZ0).cr());
            }
            com.bytedance.adsdk.ugeno.Zh.ReZ reZ1 = this.Au();
            com.bytedance.sdk.openadsdk.core.DWo.JQp.cr cr0 = this.Jo;
            if(cr0 != null) {
                cr0.PjT();
            }
            if(reZ1 != null && reZ1.qj() != null) {
                this.RD = new WeakReference(reZ1.qj());
            }
            com.bytedance.adsdk.ugeno.Zh.ReZ reZ2 = this.cz();
            this.xf = reZ2;
            if(reZ2 != null && reZ2 instanceof com.bytedance.adsdk.ugeno.SM.Zh.Zh) {
                ((com.bytedance.sdk.openadsdk.core.DWo.JQp.Zh)this.SM).Zh(((FrameLayout)reZ2.qj()));
            }
            this.XX.addView(this.ReZ.qj(), new FrameLayout.LayoutParams(this.ReZ.wN(), this.ReZ.qZS()));
            float f = this.cz.Yo();
            float f1 = this.cz.KM();
            float f2 = (float)qZS.Zh(this.Zh, f);
            float f3 = (float)qZS.Zh(this.Zh, f1);
            if(this.ReZ() != 7) {
                this.XX.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            }
            else if(f1 <= 0.0f) {
                this.XX.setLayoutParams(new FrameLayout.LayoutParams(((int)f2), -2));
            }
            else {
                this.XX.setLayoutParams(new FrameLayout.LayoutParams(((int)f2), ((int)f3)));
            }
            if(f1 <= 0.0f || f <= 0.0f) {
                this.XX.measure(0, 0);
                int v1 = qZS.ReZ(this.Zh, ((float)this.XX.getMeasuredWidth()));
                int v2 = qZS.ReZ(this.Zh, ((float)this.XX.getMeasuredHeight()));
                this.SM.PjT(((double)v1));
                this.SM.Zh(((double)v2));
            }
            else {
                this.SM.PjT(((double)f));
                this.SM.Zh(((double)f1));
            }
            if(this.DWo.get()) {
                xX0.PjT(0x89, "ugen render timeout");
                return;
            }
            xX0.PjT(this.XX, this.SM);
            return;
        }
        xX0.PjT(0x8A, "ugen render error");
    }

    private void Zh(CharSequence charSequence0, boolean z, int v, boolean z1) {
        com.bytedance.adsdk.ugeno.Zh.ReZ reZ0 = this.ReZ;
        if(reZ0 == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.Zh.ReZ reZ1 = reZ0.ReZ("skip");
        if(reZ1 == null) {
            return;
        }
        int v1 = 0;
        View view0 = reZ1.qj();
        if(view0 == null) {
            return;
        }
        if(!z && !z1) {
            v1 = 8;
        }
        view0.setVisibility(v1);
    }

    protected JSONObject Zh() {
        return this.cz.Qf();
    }

    protected int cr() {
        this.PjT.PjT(this);
        this.PjT.PjT(this);
        com.bytedance.adsdk.ugeno.Zh.ReZ reZ0 = this.PjT.PjT(this.cr);
        this.ReZ = reZ0;
        com.bytedance.sdk.openadsdk.core.DWo.JQp.cr cr0 = this.Jo;
        if(cr0 != null && reZ0 != null) {
            cr0.PjT(reZ0);
        }
        this.cz.ZX().Zh();
        this.cz.ZX().ReZ();
        this.PjT.Zh(this.Lrd);
        return 0;
    }

    public com.bytedance.adsdk.ugeno.Zh.ReZ cz() {
        return this.ReZ == null ? null : this.ReZ.cr("PlayableComponent");
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.cr
    public void onvideoComplate() {
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.cr
    public void setSoundMute(boolean z) {
        com.bytedance.adsdk.ugeno.Zh.ReZ reZ0 = this.ReZ;
        if(reZ0 == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.Zh.ReZ reZ1 = reZ0.ReZ("mute");
        if(reZ1 != null) {
            if(z) {
                ((com.bytedance.adsdk.ugeno.SM.cr.ReZ)reZ1).Au("local://tt_reward_full_mute");
            }
            else {
                ((com.bytedance.adsdk.ugeno.SM.cr.ReZ)reZ1).Au("local://tt_reward_full_unmute");
            }
            reZ1.Zh();
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.cr
    public void setTime(CharSequence charSequence0, int v, int v1, boolean z) {
        boolean z1 = true;
        if(this.ReZ == null) {
            return;
        }
        if(v != 1) {
            z1 = false;
        }
        this.PjT(charSequence0, z1, v1, z);
        this.Zh(charSequence0, z1, v1, z);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.cr
    public void setTimeUpdate(int v) {
    }
}

