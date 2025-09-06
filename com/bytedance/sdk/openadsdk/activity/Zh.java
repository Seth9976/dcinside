package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.component.reward.qj;
import com.bytedance.sdk.openadsdk.component.reward.top.ReZ;
import com.bytedance.sdk.openadsdk.component.reward.xs;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.RD;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.xf.DWo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import v.c;

public class Zh {
    public static class JQp {
        public boolean JQp;
        public final Bundle PjT;
        public final PjT ReZ;
        public final int Zh;
        public boolean cr;

        public JQp(int v, PjT pjT0) {
            this.PjT = new Bundle();
            this.Zh = v;
            this.ReZ = pjT0;
        }
    }

    static class com.bytedance.sdk.openadsdk.activity.Zh.PjT extends com.bytedance.sdk.openadsdk.activity.Zh.Zh {
        public com.bytedance.sdk.openadsdk.activity.Zh.PjT(Zh zh0, Owx owx0, ReZ reZ0) {
            super(zh0, owx0, reZ0);
        }

        @Override  // com.bytedance.sdk.openadsdk.activity.Zh$Zh
        protected int PjT(Owx owx0) {
            if(owx0 != null) {
                return owx0.PjT() < 0 ? ub.cr().ltE(String.valueOf(owx0.joj())) : owx0.PjT();
            }
            return 5;
        }
    }

    static class com.bytedance.sdk.openadsdk.activity.Zh.ReZ implements Runnable {
        private final Owx PjT;

        public com.bytedance.sdk.openadsdk.activity.Zh.ReZ(Owx owx0) {
            this.PjT = owx0;
        }

        @Override
        public void run() {
            if(!this.PjT.zq()) {
                if(this.PjT.Sky()) {
                    xs.PjT(ub.PjT()).PjT(this.PjT.ig());
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.JQp.PjT(ub.PjT()).PjT(this.PjT.ig());
            }
        }
    }

    static abstract class com.bytedance.sdk.openadsdk.activity.Zh.Zh implements Handler.Callback {
        private final ReZ Au;
        private boolean DWo;
        protected int JQp;
        protected final Zh PjT;
        protected float ReZ;
        private final Context SM;
        private final Handler XX;
        protected final Owx Zh;
        protected int cr;
        protected int cz;
        private boolean qj;
        private boolean xf;

        public com.bytedance.sdk.openadsdk.activity.Zh.Zh(Zh zh0, Owx owx0, ReZ reZ0) {
            this.XX = new Handler(Looper.getMainLooper(), this);
            this.cz = -1;
            this.PjT = zh0;
            this.Zh = owx0;
            this.Au = reZ0;
            this.SM = reZ0.getContext();
            this.cr = this.PjT(owx0);
        }

        private void JQp() {
            if(this.PjT.Lrd()) {
                this.Au.showSkipButton();
                this.DWo = true;
                return;
            }
            this.qj = true;
            this.Au.showCloseButton();
        }

        protected abstract int PjT(Owx arg1);

        public void PjT() {
            this.XX.removeMessages(this.JQp);
        }

        public void PjT(int v) {
            this.cz = v;
            if(v > 0) {
                this.xf = true;
                if(this.cr <= 0 || this.DWo) {
                    this.ReZ(3);
                }
            }
        }

        private void ReZ(int v) {
            if(this.cz > 0 && this.xf && v == 3) {
                this.XX.removeMessages(3);
                this.XX.sendEmptyMessageDelayed(3, 1000L);
            }
        }

        public void ReZ() {
            this.XX.removeMessages(this.JQp);
        }

        public void Zh() {
            if(this.cr >= 0 && !this.DWo && !this.qj) {
                this.XX.removeMessages(this.JQp);
                this.XX.sendEmptyMessage(this.JQp);
            }
        }

        public void Zh(int v) {
            if(!this.DWo && !this.qj) {
                this.ReZ = (float)v;
                int v1 = this.JQp;
                if(((float)v) <= ((float)this.cr)) {
                    this.JQp = 2;
                    this.cr = (int)(((float)v));
                }
                else if(v1 == 0) {
                    this.JQp = 1;
                }
                if(v1 != this.JQp || !this.XX.hasMessages(this.JQp)) {
                    this.XX.removeCallbacksAndMessages(null);
                    this.XX.sendEmptyMessage(this.JQp);
                }
            }
        }

        private void cr() {
            int v = this.cz;
            if(v > 0) {
                this.cz = v - 1;
            }
            if(this.cz == 0 && this.xf) {
                this.xf = false;
                if(this.PjT != null && this.PjT.tT() != null) {
                    cz cz0 = this.PjT.tT();
                    if(cz0 instanceof com.bytedance.sdk.openadsdk.activity.ReZ) {
                        ((com.bytedance.sdk.openadsdk.activity.ReZ)cz0).xE();
                    }
                }
            }
        }

        @Override  // android.os.Handler$Callback
        public boolean handleMessage(@NonNull Message message0) {
            int v = message0.what;
            if(v == 1) {
                if(this.cr <= 0) {
                    this.ReZ(3);
                    this.JQp();
                    return true;
                }
                int v1 = this.cr;
                this.cr = v1 - 1;
                this.Au.setSkipText(v1 + "s");
                this.cr();
                if(this.cr >= 0) {
                    this.XX.removeMessages(message0.what);
                    this.XX.sendEmptyMessageDelayed(message0.what, 1000L);
                    return true;
                }
            }
            else {
                switch(v) {
                    case 2: {
                        if(this.cr <= 0) {
                            this.ReZ(3);
                            this.JQp();
                            return true;
                        }
                        int v2 = this.cr;
                        this.cr = v2 - 1;
                        this.Au.setSkipText(v2 + "s");
                        this.cr();
                        if(this.cr >= 0) {
                            this.XX.removeMessages(message0.what);
                            this.XX.sendEmptyMessageDelayed(message0.what, 1000L);
                            return true;
                        }
                        break;
                    }
                    case 3: {
                        if(this.cz > 0) {
                            this.cr();
                            if(this.cz >= 0) {
                                this.XX.removeMessages(message0.what);
                                this.XX.sendEmptyMessageDelayed(message0.what, 1000L);
                            }
                        }
                        break;
                    }
                    default: {
                        return true;
                    }
                }
            }
            return true;
        }
    }

    static class cr extends com.bytedance.sdk.openadsdk.activity.Zh.Zh {
        private int Au;
        private boolean SM;
        private final int XX;

        public cr(Zh zh0, Owx owx0, ReZ reZ0) {
            super(zh0, owx0, reZ0);
            if(owx0 != null) {
                if(owx0.Yo() >= 0) {
                    this.XX = Math.min(100, owx0.Yo());
                    return;
                }
                this.XX = ub.cr().iZZ(String.valueOf(owx0.joj())).cz;
                return;
            }
            this.XX = 100;
        }

        @Override  // com.bytedance.sdk.openadsdk.activity.Zh$Zh
        protected int PjT(Owx owx0) {
            return owx0 == null ? 30 : owx0.qx();
        }

        @Override  // com.bytedance.sdk.openadsdk.activity.Zh$Zh
        public void Zh(int v) {
            boolean z = this.JQp == 0;
            int v1 = this.cr;
            super.Zh(v);
            if(z) {
                this.Au = this.JQp == 1 ? 3 : ((int)((1.0f - ((float)this.XX) / 100.0f) * this.ReZ));
                qj qj0 = this.PjT.Zh;
                if(qj0 != null) {
                    qj0.PjT(((long)this.cr));
                }
            }
            else if(this.ReZ < ((float)v1)) {
                this.Au = (int)((1.0f - ((float)this.XX) / 100.0f) * ((float)this.cr));
            }
        }

        @Override  // com.bytedance.sdk.openadsdk.activity.Zh$Zh
        public boolean handleMessage(@NonNull Message message0) {
            if(!this.SM && this.cr <= this.Au) {
                this.SM = true;
                cz cz0 = this.PjT.tT();
                if(cz0 instanceof com.bytedance.sdk.openadsdk.activity.JQp) {
                    ((com.bytedance.sdk.openadsdk.activity.JQp)cz0).tT();
                }
                else if(this.PjT.PjT() && !cz0.Lrd() && cz0 instanceof com.bytedance.sdk.openadsdk.activity.ReZ) {
                    cz cz1 = this.PjT.DWo();
                    if(cz1 instanceof com.bytedance.sdk.openadsdk.activity.JQp) {
                        ((com.bytedance.sdk.openadsdk.activity.JQp)cz1).tT();
                    }
                }
            }
            super.handleMessage(message0);
            return true;
        }
    }

    private final Bundle Au;
    private com.bytedance.sdk.openadsdk.PjT.ReZ.Zh DWo;
    private final List JQp;
    private final DWo KM;
    private com.bytedance.sdk.openadsdk.activity.Zh.Zh Lrd;
    private int Owx;
    public com.bytedance.sdk.openadsdk.utils.xs PjT;
    private Bundle RD;
    private static com.bytedance.sdk.openadsdk.PjT.JQp.PjT ReZ;
    private com.bytedance.sdk.openadsdk.PjT.JQp.PjT SM;
    private com.bytedance.sdk.openadsdk.fDm.qj Sks;
    private final Owx XX;
    private Runnable Yo;
    public qj Zh;
    private boolean cRA;
    private static com.bytedance.sdk.openadsdk.PjT.ReZ.Zh cr;
    private List cz;
    private cz fDm;
    private com.bytedance.sdk.openadsdk.core.JQp.ReZ gK;
    private int iZZ;
    private Au ltE;
    private boolean qj;
    private int qla;
    private ReZ tT;
    private com.bytedance.sdk.openadsdk.activity.ReZ ub;
    private com.bytedance.sdk.openadsdk.core.JQp.ReZ xE;
    private boolean xf;
    private Activity xs;
    private boolean yIW;

    public Zh(Activity activity0, Owx owx0) {
        this.JQp = new ArrayList();
        this.cz = new ArrayList();
        this.Au = new Bundle();
        this.XX = owx0;
        this.xs = activity0;
        this.KM = new DWo(activity0.getApplicationContext());
        this.Owx();
    }

    public int Au() {
        return this.qla;
    }

    @Nullable
    public cz DWo() {
        cz cz0 = this.fDm;
        if(cz0 == null) {
            return null;
        }
        int v = cz0.SM - 1;
        return v < 0 || v >= this.JQp.size() ? null : ((cz)this.JQp.get(v));
    }

    public void JQp() {
        cz cz0 = this.fDm;
        if(cz0 != null) {
            cz0.ub();
        }
    }

    public void JQp(TTAdActivity tTAdActivity0) {
        this.Owx = 6;
        int v = this.ReZ();
        for(Object object0: this.JQp) {
            cz cz0 = (cz)object0;
            if(cz0.SM >= v) {
                cz0.qla();
            }
        }
        cz cz1 = this.fDm;
        if(cz1 != null) {
            cz1.Yo();
        }
        if(this.fDm != null && !this.fDm.ltE() && !this.XX.zq()) {
            fDm.Zh().post(new com.bytedance.sdk.openadsdk.activity.Zh.ReZ(this.XX));
        }
        com.bytedance.sdk.openadsdk.activity.Zh.Zh zh$Zh0 = this.Lrd;
        if(zh$Zh0 != null) {
            zh$Zh0.ReZ();
        }
        com.bytedance.sdk.openadsdk.utils.xs xs0 = this.PjT;
        if(xs0 != null) {
            xs0.ReZ();
        }
        this.fDm = null;
        this.xs = null;
    }

    // 去混淆评级： 低(20)
    private boolean Lrd() {
        return this.JQp.isEmpty() ? false : ((cz)this.JQp.get(this.JQp.size() - 1)) instanceof com.bytedance.sdk.openadsdk.activity.ReZ;
    }

    private void Owx() {
        boolean z = com.bytedance.sdk.openadsdk.core.settings.xs.Gr().fDm(String.valueOf(this.XX.joj()));
        int v = this.Sks() ? this.Zh(0, z) : 0;
        if(this.JQp.isEmpty() && !cRA.ReZ(this.XX)) {
            cz cz0 = Zh.PjT(this, this.XX, v);
            this.JQp.add(cz0);
            ++v;
        }
        this.PjT(v, z);
        if(this.XX.Sky()) {
            this.Zh = new qj(new com.bytedance.sdk.openadsdk.component.reward.qj.PjT() {
                final Zh PjT;

                @Override  // com.bytedance.sdk.openadsdk.component.reward.qj$PjT
                public void PjT() {
                    if(!Zh.this.qj().getBoolean("reward_verify", false) && !Zh.this.qla() && !Zh.this.qj().getBoolean("user_has_give_up_reward", false)) {
                        for(Object object0: Zh.this.JQp) {
                            cz cz0 = (cz)object0;
                            if(cz0 instanceof com.bytedance.sdk.openadsdk.activity.JQp) {
                                ((com.bytedance.sdk.openadsdk.activity.JQp)cz0).ReZ(1);
                                return;
                            }
                            if(cz0 instanceof com.bytedance.sdk.openadsdk.activity.ReZ) {
                                ((com.bytedance.sdk.openadsdk.activity.ReZ)cz0).Zh(1);
                                return;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                }
            });
        }
    }

    private static cz PjT(Zh zh0, Owx owx0, int v) {
        boolean z = owx0.Sky();
        AdSlot adSlot0 = owx0.ig();
        if(adSlot0 != null) {
            z = adSlot0.getDurationSlotType() == 7;
        }
        return z ? new com.bytedance.sdk.openadsdk.activity.JQp(zh0, owx0, v) : new com.bytedance.sdk.openadsdk.activity.cr(zh0, owx0, v);
    }

    private void PjT(int v, boolean z) {
        if(this.PjT() && this.cz() != null) {
            return;
        }
        if(!z && !cRA.ReZ(this.XX)) {
            if(this.Zh()) {
                this.RD();
            }
            return;
        }
        com.bytedance.sdk.openadsdk.activity.ReZ reZ0 = new com.bytedance.sdk.openadsdk.activity.ReZ(this, this.XX, v);
        this.JQp.add(reZ0);
    }

    private void PjT(cz cz0, cz cz1, JQp zh$JQp0) {
        if(this.qj) {
            if(this.PjT()) {
                if(this.Lrd == null) {
                    this.Lrd = cz1 instanceof com.bytedance.sdk.openadsdk.activity.cr ? new com.bytedance.sdk.openadsdk.activity.Zh.PjT(this, this.XX, this.tT) : new cr(this, this.XX, this.tT);
                }
                int v = cz1.SM;
                int v1 = 0;
                while(v < this.JQp.size()) {
                    cz cz2 = (cz)this.JQp.get(v);
                    if(cz2.Lrd()) {
                        break;
                    }
                    if(cz2 instanceof com.bytedance.sdk.openadsdk.activity.PjT) {
                        c c0 = cz2.Au.MWx();
                        v1 = c0 == null ? ((int)(((long)v1) + 10L)) : ((int)(((double)v1) + c0.C()));
                    }
                    else if(cz2 instanceof com.bytedance.sdk.openadsdk.activity.ReZ) {
                        v1 += cz2.Au.WQX().PjT();
                    }
                    ++v;
                }
                this.Lrd.Zh(v1);
                if(cz1 instanceof com.bytedance.sdk.openadsdk.activity.ReZ) {
                    if(cz1.Lrd()) {
                        this.ReZ(cz0);
                    }
                    else {
                        this.Lrd.PjT(cz1.Au.WQX().PjT());
                    }
                }
                com.bytedance.sdk.openadsdk.utils.xs xs0 = this.PjT;
                if(xs0 != null && cz0 == null) {
                    xs0.PjT(((long)(v1 * 1000)));
                }
                if(cz1 instanceof com.bytedance.sdk.openadsdk.activity.PjT) {
                    ++this.qla;
                    this.PjT(0.0f);
                    int v2 = Lrd.Zh(ub.PjT(), "tt_multiple_ad_indicator");
                    Object[] arr_object = {((int)(this.PjT(cz1) + 1)), this.iZZ};
                    this.ltE.setText(this.xs.getString(v2, arr_object));
                    this.ltE.setVisibility(0);
                }
                else {
                    this.ltE.setVisibility(8);
                }
            }
            else {
                if(cz1 instanceof com.bytedance.sdk.openadsdk.activity.PjT) {
                    ++this.qla;
                    this.PjT(0.0f);
                    if(this.Lrd == null) {
                        this.Lrd = cz1 instanceof com.bytedance.sdk.openadsdk.activity.cr ? new com.bytedance.sdk.openadsdk.activity.Zh.PjT(this, this.XX, this.tT) : new cr(this, this.XX, this.tT);
                    }
                    int v3 = cz1.SM;
                    int v4 = 0;
                    while(v3 < this.JQp.size()) {
                        cz cz3 = (cz)this.JQp.get(v3);
                        if(cz3 instanceof com.bytedance.sdk.openadsdk.activity.ReZ) {
                            break;
                        }
                        c c1 = cz3.Au.MWx();
                        v4 = c1 == null ? ((int)(((long)v4) + 10L)) : ((int)(((double)v4) + c1.C()));
                        ++v3;
                    }
                    this.Lrd.Zh(v4);
                    com.bytedance.sdk.openadsdk.utils.xs xs1 = this.PjT;
                    if(xs1 != null && cz0 == null) {
                        xs1.PjT(((long)(v4 * 1000)));
                    }
                }
                else if(cz1 instanceof com.bytedance.sdk.openadsdk.activity.ReZ) {
                    this.ReZ(cz0);
                }
                if(cz1 instanceof com.bytedance.sdk.openadsdk.activity.PjT) {
                    int v5 = Lrd.Zh(ub.PjT(), "tt_multiple_ad_indicator");
                    this.ltE.setText(this.xs.getString(v5, new Object[]{((int)(cz1.SM + 1)), this.iZZ}));
                }
                else {
                    this.ltE.setVisibility(8);
                }
            }
        }
        for(int v6 = cz0 == null ? 0 : cz0.SM; v6 < this.JQp.size(); ++v6) {
            ((cz)this.JQp.get(v6)).PjT(cz0, cz1, zh$JQp0);
        }
        cz1.PjT(this.xs, this.RD);
        switch(this.Owx) {
            case 2: {
                cz1.cr(this.xs);
                return;
            }
            case 3: {
                cz1.cr(this.xs);
                cz1.Zh(this.xs);
                cz1.Zh(true);
                return;
            }
            case 4: {
                cz1.Zh(false);
                cz1.JQp(this.xs);
                return;
            }
            case 5: {
                cz1.ReZ(this.xs);
            }
        }
    }

    public int PjT(cz cz0) {
        if(cz0 == null) {
            return 0;
        }
        int v = this.cz.indexOf(cz0.SM);
        return v >= 0 ? Math.min(v, this.iZZ - 1) : 0;
    }

    public void PjT(float f) {
        com.bytedance.sdk.openadsdk.fDm.qj qj0 = this.Sks;
        if(qj0 == null) {
            return;
        }
        qj0.setProgress(f);
        int v = Float.compare(f, 0.0f);
        if(v == 0 && this.Sks.getVisibility() == 0) {
            this.Sks.setVisibility(4);
            return;
        }
        if(v > 0 && this.Sks.getVisibility() != 0) {
            this.Sks.setVisibility(0);
        }
    }

    public void PjT(int v) {
        com.bytedance.sdk.openadsdk.activity.Zh.Zh zh$Zh0 = this.Lrd;
        if(zh$Zh0 == null) {
            return;
        }
        switch(v) {
            case 1: {
                zh$Zh0.Zh();
                com.bytedance.sdk.openadsdk.utils.xs xs0 = this.PjT;
                if(xs0 != null) {
                    xs0.PjT();
                    return;
                }
                break;
            }
            case 2: {
                zh$Zh0.PjT();
                com.bytedance.sdk.openadsdk.utils.xs xs1 = this.PjT;
                if(xs1 != null) {
                    xs1.Zh();
                    return;
                }
                break;
            }
        }
    }

    public void PjT(Activity activity0) {
        cz cz0 = this.fDm;
        if(cz0 != null) {
            cz0.PjT(activity0);
        }
    }

    public void PjT(View view0) {
        if(view0.getParent() != null) {
            return;
        }
        view0.setVisibility(4);
        this.gK.addView(view0, 0);
    }

    public void PjT(View view0, boolean z) {
        if(view0.getParent() != null) {
            return;
        }
        if(this.gK == null) {
            return;
        }
        view0.setVisibility(4);
        int v = this.gK.getChildCount();
        if(z) {
            this.gK.addView(view0, 0);
            return;
        }
        this.gK.addView(view0, v - 1);
    }

    public void PjT(TTAdActivity tTAdActivity0) {
        this.Owx = 2;
        cz cz0 = this.fDm;
        if(cz0 != null) {
            cz0.cr(tTAdActivity0);
        }
    }

    public void PjT(TTAdActivity tTAdActivity0, Bundle bundle0) {
        com.bytedance.sdk.openadsdk.PjT.JQp.PjT pjT0 = this.SM;
        if(pjT0 != null) {
            Zh.ReZ = pjT0;
            return;
        }
        com.bytedance.sdk.openadsdk.PjT.ReZ.Zh zh0 = this.DWo;
        if(zh0 != null) {
            Zh.cr = zh0;
        }
    }

    public void PjT(TTAdActivity tTAdActivity0, Bundle bundle0, com.bytedance.sdk.openadsdk.PjT.JQp.PjT pjT0, com.bytedance.sdk.openadsdk.PjT.ReZ.Zh zh0) {
        this.RD = bundle0;
        this.Owx = 1;
        com.bytedance.sdk.openadsdk.core.JQp.ReZ reZ0 = new com.bytedance.sdk.openadsdk.core.JQp.ReZ(tTAdActivity0);
        this.xE = reZ0;
        if(Build.VERSION.SDK_INT >= 35) {
            reZ0.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.JQp.ReZ reZ1 = new com.bytedance.sdk.openadsdk.core.JQp.ReZ(tTAdActivity0);
        this.gK = reZ1;
        this.xE.addView(reZ1, new FrameLayout.LayoutParams(-1, -1));
        if(this.qj) {
            this.Sks = new com.bytedance.sdk.openadsdk.fDm.qj(tTAdActivity0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, qZS.Zh(tTAdActivity0, 2.0f));
            frameLayout$LayoutParams0.gravity = 80;
            this.xE.addView(this.Sks, frameLayout$LayoutParams0);
            Au au0 = new Au(tTAdActivity0);
            this.ltE = au0;
            au0.setTextColor(-1);
            this.ltE.setTextSize(15.0f);
            this.ltE.setShadowLayer(1.0f, 0.0f, 1.0f, 0xFF000000);
            FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-2, -2);
            frameLayout$LayoutParams1.topMargin = qZS.Zh(tTAdActivity0, 60.0f);
            frameLayout$LayoutParams1.rightMargin = qZS.Zh(tTAdActivity0, 16.0f);
            frameLayout$LayoutParams1.gravity = 0x800035;
            this.xE.addView(this.ltE, frameLayout$LayoutParams1);
            ReZ reZ2 = new ReZ(tTAdActivity0);
            this.tT = reZ2;
            this.xE.addView(reZ2, new FrameLayout.LayoutParams(-1, -2));
            this.tT.PjT(this.XX);
            this.tT.setShowDislike(true);
        }
        this.SM = pjT0;
        this.DWo = zh0;
        if(pjT0 == null && bundle0 != null) {
            this.SM = Zh.ReZ;
            Zh.ReZ = null;
        }
        if(zh0 == null && bundle0 != null) {
            this.DWo = Zh.cr;
            Zh.cr = null;
        }
        this.ReZ(null, new JQp(1, null));
    }

    public void PjT(cz cz0, JQp zh$JQp0) {
        if(this.fDm != null && this.fDm != cz0) {
            return;
        }
        this.ReZ(null, zh$JQp0);
    }

    // 检测为 Lambda 实现
    public void PjT(cz cz0, boolean z, int v, String s, int v1, String s1) [...]

    public void PjT(cz cz0, boolean z, boolean z1, boolean z2, int v) {
        if(this.fDm != null && this.fDm != cz0) {
            return;
        }
        com.bytedance.sdk.openadsdk.activity.ReZ reZ0 = this.cz();
        if(reZ0 != null) {
            JQp zh$JQp0 = new JQp(v, (cz0 == null ? null : cz0.Sks()));
            zh$JQp0.PjT.putBoolean("isSkip", z);
            zh$JQp0.PjT.putBoolean("force", z1);
            zh$JQp0.PjT.putBoolean("isFromLandingPage", z2);
            this.ReZ(reZ0, zh$JQp0);
        }
    }

    public void PjT(boolean z) {
        cz cz0 = this.fDm;
        if(cz0 != null) {
            cz0.Zh(z);
        }
    }

    public boolean PjT() {
        return this.xf;
    }

    public boolean PjT(Owx owx0) {
        return owx0 != null && owx0.WQX() != null && owx0.WQX().PjT() > 0;
    }

    private void RD() {
        this.PjT = com.bytedance.sdk.openadsdk.utils.Au.PjT(this.xs, new com.bytedance.sdk.openadsdk.utils.Au.PjT() {
            final Zh PjT;

            @Override  // com.bytedance.sdk.openadsdk.utils.Au$PjT
            public View PjT() {
                return Zh.this.tT == null ? null : Zh.this.tT.getCloseButton();
            }

            @Override  // com.bytedance.sdk.openadsdk.utils.Au$PjT
            public void Zh() {
                if(Zh.this.tT != null) {
                    Zh.this.tT.setSkipInvisiable();
                }
            }
        });
    }

    private void ReZ(cz cz0) {
        com.bytedance.sdk.openadsdk.fDm.qj qj0 = this.Sks;
        if(qj0 != null) {
            qZS.XX(qj0);
            this.Sks = null;
        }
        ReZ reZ0 = this.tT;
        if(reZ0 != null) {
            qZS.XX(reZ0);
            qZS.XX(this.tT.getITopLayout());
            this.tT = null;
        }
        com.bytedance.sdk.openadsdk.activity.Zh.Zh zh$Zh0 = this.Lrd;
        if(zh$Zh0 != null) {
            zh$Zh0.ReZ();
        }
        if(cz0 instanceof com.bytedance.sdk.openadsdk.activity.JQp) {
            ((com.bytedance.sdk.openadsdk.activity.JQp)cz0).tT();
        }
        com.bytedance.sdk.openadsdk.utils.xs xs0 = this.PjT;
        if(xs0 != null) {
            xs0.ReZ();
        }
    }

    private void ReZ(cz cz0, JQp zh$JQp0) {
        if(this.xs == null) {
            return;
        }
        if(cz0 == null) {
            int v = this.fDm == null ? 0 : this.fDm.SM + 1;
            if(v < this.JQp.size()) {
                cz0 = (cz)this.JQp.get(v);
            }
            if(cz0 == null) {
                this.Zh(this.fDm);
                return;
            }
        }
        cz cz1 = this.fDm;
        if(cz1 != null) {
            if(cz1 == cz0) {
                return;
            }
            cz1.JQp(this.xs);
            this.fDm.ReZ(this.xs);
            View view0 = this.fDm.PjT();
            if(view0 != null) {
                this.gK.removeView(view0);
            }
            this.fDm.qla();
            this.fDm.DWo = false;
            if(this.PjT()) {
                cz cz2 = this.fDm;
                if(cz2 instanceof com.bytedance.sdk.openadsdk.activity.PjT) {
                    int v1 = cz2.SM + 1;
                    cz cz3 = v1 >= this.JQp.size() ? null : ((cz)this.JQp.get(v1));
                    if(cz3 instanceof com.bytedance.sdk.openadsdk.activity.ReZ && cz3 != cz0) {
                        View view1 = cz3.PjT();
                        if(view1 != null && view1.getParent() != null && view1.getParent() instanceof ViewGroup) {
                            ((ViewGroup)view1.getParent()).removeView(view1);
                        }
                        cz3.qla();
                    }
                }
            }
        }
        cz0.DWo = true;
        cz0.PjT(this.xs, zh$JQp0);
        View view2 = cz0.PjT();
        if(view2 != null) {
            ViewParent viewParent0 = view2.getParent();
            if(viewParent0 != null) {
                if(viewParent0 == this.gK) {
                    view2.setVisibility(0);
                }
                else if(viewParent0 instanceof ViewGroup) {
                    ((ViewGroup)viewParent0).removeView(view2);
                }
            }
            if(view2.getParent() == null) {
                this.gK.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            }
            if(this.xs.getWindow().getContainer() == null) {
                this.xs.setContentView(this.xE);
            }
        }
        cz cz4 = this.fDm;
        this.fDm = cz0;
        this.PjT(cz4, cz0, zh$JQp0);
    }

    public int ReZ() {
        return this.fDm == null ? -1 : this.fDm.SM;
    }

    public void ReZ(TTAdActivity tTAdActivity0) {
        this.Owx = 4;
        cz cz0 = this.fDm;
        if(cz0 != null) {
            cz0.JQp(tTAdActivity0);
        }
        com.bytedance.sdk.openadsdk.activity.Zh.Zh zh$Zh0 = this.Lrd;
        if(zh$Zh0 != null) {
            zh$Zh0.PjT();
        }
        com.bytedance.sdk.openadsdk.utils.xs xs0 = this.PjT;
        if(xs0 != null) {
            xs0.Zh();
        }
        qj qj0 = this.Zh;
        if(qj0 != null) {
            qj0.PjT();
        }
    }

    public ReZ SM() {
        return this.tT;
    }

    private boolean Sks() {
        Owx owx0 = this.XX;
        boolean z = false;
        if(owx0 instanceof RD) {
            com.bytedance.sdk.openadsdk.core.model.PjT pjT0 = ((RD)owx0).MD();
            if(pjT0 != null) {
                boolean z1 = pjT0.xf() && com.bytedance.sdk.openadsdk.core.settings.xs.Gr().UR();
                this.qj = z1;
                if(z1 && 39 == this.XX.RD()) {
                    z = true;
                }
                this.xf = z;
                return this.qj;
            }
        }
        return false;
    }

    public com.bytedance.sdk.openadsdk.activity.PjT XX() {
        cz cz0 = this.fDm;
        if(cz0 == null) {
            return null;
        }
        int v = cz0.SM;
        while(true) {
            ++v;
            if(v >= this.JQp.size()) {
                break;
            }
            cz cz1 = (cz)this.JQp.get(v);
            if(cz1 instanceof com.bytedance.sdk.openadsdk.activity.PjT) {
                return (com.bytedance.sdk.openadsdk.activity.PjT)cz1;
            }
        }
        return null;
    }

    private int Zh(int v, boolean z) {
        List list0 = ((RD)this.XX).MD().cr();
        if(list0 != null) {
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                Owx owx0 = (Owx)list0.get(v2);
                cz cz0 = Zh.PjT(this, owx0, v);
                this.JQp.add(cz0);
                this.cz.add(v);
                int v3 = v + 1;
                if(this.PjT()) {
                    boolean z1 = v2 == v1 - 1;
                    if(z) {
                        if(!z1 && this.PjT(owx0)) {
                            com.bytedance.sdk.openadsdk.activity.ReZ reZ0 = new com.bytedance.sdk.openadsdk.activity.ReZ(this, owx0, v3);
                            this.JQp.add(reZ0);
                            v3 = v + 2;
                        }
                        if(z1) {
                            com.bytedance.sdk.openadsdk.core.model.PjT pjT0 = ((RD)this.XX).MD();
                            if(pjT0 != null) {
                                v = v3 + 1;
                                com.bytedance.sdk.openadsdk.activity.ReZ reZ1 = new com.bytedance.sdk.openadsdk.activity.ReZ(this, new RD(pjT0, owx0), v3);
                                this.ub = reZ1;
                                this.JQp.add(reZ1);
                            }
                        }
                    }
                }
                else {
                    v = v3;
                }
                ++this.iZZ;
            }
        }
        return v;
    }

    public void Zh(TTAdActivity tTAdActivity0) {
        this.Owx = 3;
        cz cz0 = this.fDm;
        if(cz0 != null) {
            cz0.Zh(tTAdActivity0);
        }
        com.bytedance.sdk.openadsdk.activity.Zh.Zh zh$Zh0 = this.Lrd;
        if(zh$Zh0 != null) {
            zh$Zh0.Zh();
        }
        com.bytedance.sdk.openadsdk.utils.xs xs0 = this.PjT;
        if(xs0 != null) {
            xs0.PjT();
        }
        qj qj0 = this.Zh;
        if(qj0 != null) {
            qj0.Zh();
        }
    }

    public void Zh(cz cz0) {
        Activity activity0 = this.xs;
        if(activity0 != null) {
            activity0.finish();
        }
    }

    public void Zh(cz cz0, JQp zh$JQp0) {
        cz cz1 = this.fDm;
        if(cz1 != null && cz1 != cz0) {
            return;
        }
        if(cz1 != null && cz1 instanceof com.bytedance.sdk.openadsdk.activity.PjT) {
            long v = cz1.Sks() == null || this.fDm.Sks().tT == null ? 0L : this.fDm.Sks().tT.Au();
            int v1 = this.PjT() ? this.PjT(this.fDm) : this.fDm.SM;
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(System.currentTimeMillis(), this.fDm.Au, this.fDm.b_(), "dislike_skip", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                final Zh ReZ;

                @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                public JSONObject PjT() {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("duration", v);
                        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(v1 + 1, jSONObject0);
                    }
                    catch(Throwable throwable0) {
                        throwable0.getMessage();
                    }
                    return jSONObject0;
                }
            });
        }
        this.ReZ(this.XX(), zh$JQp0);
    }

    public boolean Zh() {
        return this.qj;
    }

    public boolean Zh(int v) {
        return v == this.JQp.size() - 1 && this.JQp.get(v) != null && this.JQp.get(v) instanceof com.bytedance.sdk.openadsdk.activity.ReZ;
    }

    public Activity cr() {
        return this.xs;
    }

    public void cr(TTAdActivity tTAdActivity0) {
        this.Owx = 5;
        cz cz0 = this.fDm;
        if(cz0 != null) {
            cz0.ReZ(tTAdActivity0);
        }
    }

    public com.bytedance.sdk.openadsdk.activity.ReZ cz() {
        com.bytedance.sdk.openadsdk.activity.ReZ reZ0 = this.ub;
        if(reZ0 != null) {
            return reZ0;
        }
        int v = this.fDm == null ? -1 : this.fDm.SM;
        for(int v1 = this.JQp.size() - 1; v1 > v; --v1) {
            cz cz0 = (cz)this.JQp.get(v1);
            if(cz0 instanceof com.bytedance.sdk.openadsdk.activity.ReZ) {
                this.ub = (com.bytedance.sdk.openadsdk.activity.ReZ)cz0;
                return this.ub;
            }
        }
        return this.ub;
    }

    public void fDm() {
        if(this.ub()) {
            return;
        }
        this.gK();
        com.bytedance.sdk.openadsdk.PjT.JQp.PjT pjT0 = this.SM;
        if(pjT0 == null) {
            com.bytedance.sdk.openadsdk.PjT.ReZ.Zh zh0 = this.DWo;
            if(zh0 != null) {
                zh0.PjT();
            }
        }
        else {
            pjT0.PjT();
        }
        Runnable runnable0 = this.Yo;
        if(runnable0 != null) {
            runnable0.run();
            this.Yo = null;
        }
    }

    public void gK() {
        this.cRA = true;
    }

    public DWo ltE() {
        return this.KM;
    }

    public Bundle qj() {
        return this.Au;
    }

    public boolean qla() {
        return this.yIW;
    }

    private cz tT() {
        return this.fDm;
    }

    public boolean ub() {
        return this.cRA;
    }

    public void xE() {
        this.yIW = true;
        qj qj0 = this.Zh;
        if(qj0 != null) {
            qj0.ReZ();
        }
    }

    public void xf() {
        com.bytedance.sdk.openadsdk.PjT.JQp.PjT pjT0 = this.SM;
        if(pjT0 != null) {
            pjT0.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.PjT.ReZ.Zh zh0 = this.DWo;
        if(zh0 != null) {
            zh0.onAdClicked();
        }
    }

    public void xs() {
        com.bytedance.sdk.openadsdk.PjT.JQp.PjT pjT0 = this.SM;
        if(pjT0 != null) {
            pjT0.Zh();
            return;
        }
        com.bytedance.sdk.openadsdk.PjT.ReZ.Zh zh0 = this.DWo;
        if(zh0 != null) {
            zh0.Zh();
        }
    }
}

