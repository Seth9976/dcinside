package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ;
import com.bytedance.sdk.openadsdk.Lrd.Zh.JQp;
import com.bytedance.sdk.openadsdk.PjT.Zh.cz;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.Au.Au;
import com.bytedance.sdk.openadsdk.core.Au.SM;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.Zh.Zh;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.cr.XX;
import com.bytedance.sdk.openadsdk.utils.Co;
import com.bytedance.sdk.openadsdk.utils.Zd;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x.b;

public class xE {
    static class PjT implements View.OnLayoutChangeListener {
        private final XX PjT;
        private final ViewGroup Zh;

        public PjT(XX xX0, ViewGroup viewGroup0) {
            this.PjT = xX0;
            this.Zh = viewGroup0;
        }

        @Override  // android.view.View$OnLayoutChangeListener
        public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
            float f = Qf.PjT(this.Zh);
            this.PjT.PjT(System.currentTimeMillis(), f);
        }
    }

    private long Au;
    private final com.bytedance.sdk.openadsdk.PjT.Zh.PjT DWo;
    private List JQp;
    private final Owx PjT;
    private final Context ReZ;
    private final XX SM;
    private cz XX;
    private com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz Zh;
    private final PAGNativeAd cr;
    private final String cz;
    private com.bytedance.sdk.openadsdk.core.Zh.PjT fDm;
    private b qj;
    private final AtomicBoolean xf;
    private Zh xs;

    public xE(Context context0, PAGNativeAd pAGNativeAd0, Owx owx0, String s, com.bytedance.sdk.openadsdk.PjT.Zh.PjT pjT0) {
        this.JQp = new ArrayList();
        this.SM = new XX();
        this.xf = new AtomicBoolean(false);
        this.cr = pAGNativeAd0;
        this.PjT = owx0;
        this.ReZ = context0;
        this.cz = s;
        this.DWo = pjT0;
        if(owx0.cI() == 4) {
            this.Zh = com.bytedance.sdk.openadsdk.ltE.PjT.PjT.XX.PjT(context0, owx0, s);
        }
    }

    private void PjT(ViewGroup viewGroup0) {
        Zd.PjT(viewGroup0, true, 5, new com.bytedance.sdk.openadsdk.utils.Zd.Zh() {
            final xE Zh;

            @Override  // com.bytedance.sdk.openadsdk.utils.Zd$Zh
            public void PjT() {
                xE.this.Zh(viewGroup0);
            }

            @Override  // com.bytedance.sdk.openadsdk.utils.Zd$Zh
            public void PjT(View view0, boolean z) {
                if(!z) {
                    ReZ.PjT(xE.this.PjT, 8);
                    return;
                }
                ReZ.PjT(xE.this.PjT, 4);
                xE.this.Zh(viewGroup0, view0);
            }

            @Override  // com.bytedance.sdk.openadsdk.utils.Zd$Zh
            public void PjT(boolean z) {
                xE.this.PjT(z, viewGroup0);
            }

            @Override  // com.bytedance.sdk.openadsdk.utils.Zd$Zh
            public void Zh() {
                xE.this.Zh();
            }
        }, null);
    }

    private void PjT(@NonNull ViewGroup viewGroup0, @Nullable View view0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("click_scence", 1);
        Context context0 = viewGroup0 == null ? null : com.bytedance.sdk.component.utils.Zh.PjT(viewGroup0);
        if(context0 == null) {
            context0 = this.ReZ;
        }
        this.xs = this.PjT.iZZ() == 2 ? new SM(context0, this.PjT, this.cz, wN.PjT(this.cz)) : new Zh(context0, this.PjT, this.cz, wN.PjT(this.cz));
        this.xs.PjT(viewGroup0);
        this.xs.PjT(this.qj);
        this.xs.Zh(view0);
        this.xs.PjT(this.Zh);
        this.xs.PjT(this.cr);
        this.xs.PjT(hashMap0);
        this.xs.PjT(new com.bytedance.sdk.openadsdk.core.Zh.Zh.PjT() {
            final xE PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh$PjT
            public void PjT(View view0, int v) {
                if(xE.this.XX != null) {
                    xE.this.XX.onAdClicked();
                }
            }
        });
        this.fDm = this.PjT.iZZ() == 2 ? new Au(this.ReZ, this.PjT, this.cz, wN.PjT(this.cz)) : new com.bytedance.sdk.openadsdk.core.Zh.PjT(this.ReZ, this.PjT, this.cz, wN.PjT(this.cz));
        this.fDm.PjT(viewGroup0);
        this.fDm.PjT(this.qj);
        this.fDm.Zh(view0);
        this.fDm.PjT(this.Zh);
        this.fDm.PjT(this.cr);
        this.fDm.PjT(hashMap0);
        this.fDm.PjT(new com.bytedance.sdk.openadsdk.core.Zh.Zh.PjT() {
            final xE PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh$PjT
            public void PjT(View view0, int v) {
                if(xE.this.XX != null) {
                    xE.this.XX.onAdClicked();
                }
                JQp.PjT(xE.this.PjT, 9);
                xE.this.DWo.xs();
            }
        });
    }

    private void PjT(@NonNull ViewGroup viewGroup0, com.bytedance.sdk.openadsdk.core.XX xX0, List list0, @Nullable List list1) {
        Zh zh0 = this.xs;
        if(zh0 != null && this.fDm != null) {
            xX0.PjT(list0, zh0);
            xX0.PjT(list1, this.fDm);
            this.PjT(this.xs, this.fDm);
            this.PjT(xX0, viewGroup0);
        }
    }

    private void PjT(@NonNull ViewGroup viewGroup0, List list0, @Nullable List list1) {
        Zh zh0 = this.xs;
        if(zh0 != null && this.fDm != null) {
            this.PjT(list0, zh0);
            this.PjT(list1, this.fDm);
            this.PjT(this.xs, this.fDm);
            this.PjT(viewGroup0);
        }
    }

    private void PjT(@NonNull ViewGroup viewGroup0, List list0, List list1, @Nullable List list2, cz cz0) {
        this.XX = cz0;
        viewGroup0.addOnLayoutChangeListener(new PjT(this.SM, viewGroup0));
        this.JQp = list0;
        this.PjT(list1, null);
        if(list0 != null) {
            for(Object object0: this.JQp) {
                View view0 = (View)object0;
                if(view0 != null) {
                    view0.setTag(0x1F000042, Boolean.TRUE);
                }
            }
            if(list2 != null) {
                list2.addAll(list0);
            }
        }
        this.PjT(list2, null);
    }

    private void PjT(com.bytedance.sdk.openadsdk.core.XX xX0, ViewGroup viewGroup0) {
        xX0.setCallback(new com.bytedance.sdk.openadsdk.core.XX.PjT() {
            final xE Zh;

            @Override  // com.bytedance.sdk.openadsdk.core.XX$PjT
            public void PjT() {
                xE.this.Zh(viewGroup0);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.XX$PjT
            public void PjT(View view0) {
                xE.this.Zh(viewGroup0, view0);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.XX$PjT
            public void PjT(boolean z) {
                xE.this.PjT(z, viewGroup0);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.XX$PjT
            public void Zh() {
                xE.this.Zh();
            }
        });
    }

    private void PjT(com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0) {
        if(xs.Gr().cr(String.valueOf(this.PjT.joj()))) {
            if(this.DWo != null && this.DWo.PjT() != null) {
                this.DWo.PjT().setOnClickListener(pjT0);
                this.DWo.PjT().setOnTouchListener(pjT0);
            }
            com.bytedance.sdk.openadsdk.PjT.Zh.PjT pjT1 = this.DWo;
            if(pjT1 != null) {
                pjT1.PjT(pjT0);
            }
        }
        else {
            if(this.DWo != null && this.DWo.PjT() != null) {
                PAGMediaView pAGMediaView0 = this.DWo.PjT();
                com.bytedance.sdk.openadsdk.core.xE.4 xE$40 = new com.bytedance.sdk.openadsdk.core.Zh.ReZ() {
                    final xE PjT;

                    @Override  // com.bytedance.sdk.openadsdk.core.Zh.ReZ
                    protected void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
                        if(view0 instanceof PAGVideoMediaView) {
                            ((PAGVideoMediaView)view0).handleInterruptVideo();
                        }
                    }
                };
                pAGMediaView0.setOnClickListener(xE$40);
                pAGMediaView0.setOnTouchListener(xE$40);
            }
            com.bytedance.sdk.openadsdk.PjT.Zh.PjT pjT2 = this.DWo;
            if(pjT2 != null) {
                pjT2.PjT(null);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void PjT(Zh zh0, com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0) {
        if(this.PjT.iZZ() == 2) {
            this.Zh(zh0, pjT0);
            return;
        }
        this.PjT(pjT0);
    }

    private void PjT(List list0, com.bytedance.sdk.openadsdk.core.Zh.ReZ reZ0) {
        if(com.bytedance.sdk.component.utils.xs.Zh(list0)) {
            for(Object object0: list0) {
                View view0 = (View)object0;
                if(view0 != null) {
                    view0.setOnClickListener(reZ0);
                    view0.setOnTouchListener(reZ0);
                }
            }
        }
    }

    private void PjT(boolean z, ViewGroup viewGroup0) {
        if(z && this.PjT.en() && !this.PjT.JDf()) {
            this.PjT.XX(true);
            Co co0 = this.PjT.zSs();
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(this.PjT, this.cz, co0);
        }
        if(!z && this.Au > 0L) {
            String s = String.valueOf(SystemClock.elapsedRealtime() - this.Au);
            float f = Qf.PjT(viewGroup0);
            this.SM.PjT(System.currentTimeMillis(), f);
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(s, this.PjT, this.cz, this.SM);
            this.Au = 0L;
            return;
        }
        float f1 = Qf.PjT(viewGroup0);
        this.SM.PjT(System.currentTimeMillis(), f1);
        this.Au = SystemClock.elapsedRealtime();
    }

    public XX PjT() {
        return this.SM;
    }

    public void PjT(View view0, int v) {
        cz cz0 = this.XX;
        if(cz0 != null) {
            cz0.onAdClicked();
        }
    }

    public void PjT(@NonNull ViewGroup viewGroup0, List list0, List list1, @Nullable List list2, @Nullable View view0, cz cz0) {
        this.PjT(viewGroup0, list0, list1, list2, cz0);
        this.PjT(viewGroup0, view0);
        this.PjT(viewGroup0, list1, list2);
    }

    public void PjT(b b0) {
        this.qj = b0;
        Zh zh0 = this.xs;
        if(zh0 != null) {
            zh0.PjT(b0);
        }
        com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0 = this.fDm;
        if(pjT0 != null) {
            pjT0.PjT(b0);
        }
    }

    private void ReZ(ViewGroup viewGroup0) {
        JSONObject jSONObject3;
        PAGMediaView pAGMediaView0;
        JSONObject jSONObject2;
        JSONObject jSONObject1;
        View view0;
        JSONArray jSONArray0;
        JSONObject jSONObject0;
        try {
            jSONObject0 = new JSONObject();
            if(this.JQp != null) {
                jSONArray0 = new JSONArray();
                Iterator iterator0 = this.JQp.iterator();
                while(true) {
                label_4:
                    if(!iterator0.hasNext()) {
                        jSONObject0.put("image_view", jSONArray0.toString());
                        break;
                    }
                    Object object0 = iterator0.next();
                    view0 = (View)object0;
                    if(view0 == null) {
                        continue;
                    }
                    jSONObject1 = new JSONObject();
                    goto label_11;
                }
            }
            goto label_16;
        }
        catch(JSONException jSONException0) {
            RD.PjT("InteractionManager", "onShowFun json error", jSONException0);
            return;
        }
        try {
        label_11:
            jSONObject1.put("width", view0.getWidth());
            jSONObject1.put("height", view0.getHeight());
            jSONObject1.put("alpha", ((double)view0.getAlpha()));
        }
        catch(Throwable unused_ex) {
        }
        try {
            jSONArray0.put(jSONObject1);
            goto label_4;
        label_16:
            if(viewGroup0 != null) {
                jSONObject2 = new JSONObject();
                goto label_18;
            }
            goto label_22;
        }
        catch(JSONException jSONException0) {
            RD.PjT("InteractionManager", "onShowFun json error", jSONException0);
            return;
        }
        try {
        label_18:
            jSONObject2.put("width", viewGroup0.getWidth());
            jSONObject2.put("height", viewGroup0.getHeight());
            jSONObject2.put("alpha", ((double)viewGroup0.getAlpha()));
        }
        catch(Throwable unused_ex) {
        }
        try {
            jSONObject0.put("root_view", jSONObject2.toString());
        label_22:
            pAGMediaView0 = this.DWo.Au();
            if(pAGMediaView0 != null) {
                jSONObject3 = new JSONObject();
                goto label_25;
            }
            goto label_30;
        }
        catch(JSONException jSONException0) {
            RD.PjT("InteractionManager", "onShowFun json error", jSONException0);
            return;
        }
        try {
        label_25:
            float f = (float)pAGMediaView0.getWidth();
            jSONObject3.put("width", ((double)(((float)qZS.ReZ(this.ReZ, f)) * 1.0f)));
            float f1 = (float)pAGMediaView0.getHeight();
            jSONObject3.put("height", ((double)(((float)qZS.ReZ(this.ReZ, f1)) * 1.0f)));
        }
        catch(Throwable unused_ex) {
        }
        try {
            jSONObject0.put("media_view", jSONObject3.toString());
        label_30:
            ltE ltE0 = this.DWo.Zh();
            if(ltE0 != null) {
                Owx owx0 = this.PjT;
                if(owx0 != null) {
                    jSONObject0.put("dynamic_show_type", owx0.ZX());
                    ltE0.PjT(jSONObject0, this.PjT);
                }
            }
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(this.PjT, this.cz, jSONObject0);
            ReZ.PjT(this.PjT);
            return;
        }
        catch(JSONException jSONException0) {
        }
        RD.PjT("InteractionManager", "onShowFun json error", jSONException0);
    }

    private com.bytedance.sdk.openadsdk.core.XX Zh(@NonNull ViewGroup viewGroup0, List list0, List list1, @Nullable List list2, cz cz0) {
        this.XX = cz0;
        viewGroup0.addOnLayoutChangeListener(new PjT(this.SM, viewGroup0));
        this.JQp = list0;
        com.bytedance.sdk.openadsdk.core.XX xX0 = this.cr(viewGroup0);
        if(xX0 == null) {
            xX0 = new com.bytedance.sdk.openadsdk.core.XX(this.ReZ, viewGroup0);
            viewGroup0.addView(xX0);
        }
        xX0.PjT();
        xX0.setRefClickViews(list1);
        if(list0 != null) {
            for(Object object0: this.JQp) {
                View view0 = (View)object0;
                if(view0 != null) {
                    view0.setTag(0x1F000042, Boolean.TRUE);
                }
            }
            if(list2 != null) {
                list2.addAll(list0);
            }
        }
        xX0.setRefCreativeViews(list2);
        return xX0;
    }

    private void Zh() {
        if(this.Au > 0L) {
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(String.valueOf(SystemClock.elapsedRealtime() - this.Au), this.PjT, this.cz, this.SM);
            this.Au = 0L;
        }
    }

    private void Zh(ViewGroup viewGroup0) {
        float f = Qf.PjT(viewGroup0);
        this.SM.PjT(System.currentTimeMillis(), f);
    }

    private void Zh(ViewGroup viewGroup0, View view0) {
        if(this.xf.get()) {
            return;
        }
        this.xf.set(true);
        if(this.cr instanceof com.bytedance.sdk.openadsdk.PjT.Zh.PjT.ReZ) {
            ltE ltE0 = this.DWo.Zh();
            if(ltE0 != null) {
                ltE0.Au();
            }
            ((com.bytedance.sdk.openadsdk.PjT.Zh.PjT.ReZ)this.cr).PjT(true);
        }
        float f = Qf.PjT(viewGroup0);
        this.SM.PjT(System.currentTimeMillis(), f);
        this.Au = SystemClock.elapsedRealtime();
        this.ReZ(viewGroup0);
        cz cz0 = this.XX;
        if(cz0 != null) {
            cz0.PjT(this.cr);
        }
        boolean z = !this.PjT.CD();
        if(this.PjT.QB() != null) {
            this.PjT.QB().PjT().PjT(0L);
        }
    }

    private void Zh(Zh zh0, com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0) {
        if(this.DWo != null && this.DWo.Zh() != null) {
            ltE ltE0 = this.DWo.Zh();
            if(zh0 instanceof SM && pjT0 instanceof Au) {
                ltE0.setClickListener(((SM)zh0));
                ltE0.setClickCreativeListener(((Au)pjT0));
            }
            ltE0.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.JQp() {
                final xE PjT;

                @Override  // com.bytedance.sdk.openadsdk.core.widget.JQp
                public void PjT() {
                    if(xE.this.XX != null) {
                        xE.this.XX.onAdClicked();
                    }
                }
            });
        }
        if(this.DWo != null && this.DWo.PjT() != null) {
            this.DWo.PjT().setOnClickListener(pjT0);
            this.DWo.PjT().setOnTouchListener(pjT0);
        }
        com.bytedance.sdk.openadsdk.PjT.Zh.PjT pjT1 = this.DWo;
        if(pjT1 != null) {
            pjT1.PjT(pjT0);
            this.DWo.PjT(zh0);
        }
    }

    private com.bytedance.sdk.openadsdk.core.XX cr(ViewGroup viewGroup0) {
        for(int v = 0; v < viewGroup0.getChildCount(); ++v) {
            View view0 = viewGroup0.getChildAt(v);
            if(view0 instanceof com.bytedance.sdk.openadsdk.core.XX) {
                return (com.bytedance.sdk.openadsdk.core.XX)view0;
            }
        }
        return null;
    }
}

