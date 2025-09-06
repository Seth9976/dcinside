package com.bytedance.sdk.openadsdk.core.Au;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.Zh.Au;
import com.bytedance.sdk.component.adexpress.Zh.Zh;
import com.bytedance.sdk.component.adexpress.Zh.cz;
import com.bytedance.sdk.component.adexpress.Zh.qla;
import com.bytedance.sdk.component.adexpress.Zh.xE;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.adexpress.dynamic.cr;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.DWo.Zh.XX;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.Qf;
import com.bytedance.sdk.openadsdk.core.ZX;
import com.bytedance.sdk.openadsdk.core.Zh.PjT.PjT;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.cr.JQp;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class ltE extends ReZ implements Au, qla, cr, fDm, PjT {
    protected final Context Au;
    private xs CY;
    private JQp Co;
    protected AdSlot DWo;
    private xE HG;
    private final AtomicBoolean IJ;
    private PAGExpressAdWrapperListener JQp;
    private float Jo;
    public com.bytedance.sdk.component.adexpress.Zh.cr KM;
    private tT Ld;
    int Lrd;
    private ThemeStatusBroadcastReceiver MWx;
    private long Nv;
    private com.bytedance.sdk.openadsdk.core.Au.ReZ OMu;
    protected HashSet Owx;
    private boolean PjT;
    private String Qf;
    protected ViewGroup RD;
    private com.bytedance.sdk.openadsdk.ReZ.ReZ ReZ;
    protected String SM;
    public static int Sks = 500;
    private final ViewTreeObserver.OnScrollChangedListener VY;
    private SM XX;
    private XX Xe;
    private float Xtz;
    protected Zh Yo;
    private float ZX;
    private String Zd;
    private int Zh;
    private com.bytedance.sdk.component.adexpress.Zh.DWo.PjT cI;
    boolean cRA;
    private TTDislikeDialogAbstract cr;
    private com.bytedance.sdk.openadsdk.core.Au.Au cz;
    private com.bytedance.sdk.openadsdk.core.ReZ.XX dIF;
    private final Runnable dwk;
    private int fA;
    protected boolean fDm;
    protected int gK;
    long iZZ;
    private com.bytedance.sdk.openadsdk.core.ReZ.cr.PjT ig;
    private float ix;
    private com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ kFP;
    private RD kph;
    protected String ltE;
    private List oG;
    private com.bytedance.sdk.openadsdk.core.DWo.ReZ.Zh qZS;
    protected Owx qj;
    protected com.bytedance.sdk.component.adexpress.Zh.ReZ qla;
    private boolean rds;
    public boolean tT;
    private final Runnable tY;
    boolean ub;
    private float wKV;
    private String wN;
    protected boolean xE;
    private final Runnable xH;
    public FrameLayout xf;
    protected boolean xs;
    private com.bytedance.sdk.component.adexpress.Zh.SM xu;
    public com.bytedance.sdk.openadsdk.cr.XX yIW;
    private float yks;
    private final SparseArray zYH;
    private cz zZ;

    static {
    }

    public ltE(@NonNull Context context0, Owx owx0, AdSlot adSlot0, String s) {
        super(context0);
        this.PjT = true;
        this.Zh = 0;
        this.SM = "embeded_ad";
        this.Qf = null;
        this.fDm = false;
        this.xE = false;
        this.ub = true;
        this.gK = -1;
        this.wN = "";
        this.tT = false;
        this.rds = true;
        this.Lrd = -1;
        this.yIW = new com.bytedance.sdk.openadsdk.cr.XX();
        this.iZZ = 0L;
        this.IJ = new AtomicBoolean(false);
        this.VY = new ViewTreeObserver.OnScrollChangedListener() {
            final ltE PjT;

            @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
            public void onScrollChanged() {
                ltE ltE0 = ltE.this;
                if(!ltE0.ub) {
                    return;
                }
                ltE0.Sks();
                ltE.this.removeCallbacks(ltE.this.tY);
                ltE.this.postDelayed(ltE.this.tY, 500L);
            }
        };
        this.tY = new Runnable() {
            final ltE PjT;

            @Override
            public void run() {
                if(Qf.PjT(ltE.this, 0, 5)) {
                    int v = ltE.this.getVisibility();
                    ltE.this.cz(v);
                    return;
                }
                ltE.this.cz(8);
            }
        };
        this.xH = () -> {
            com.bytedance.sdk.component.adexpress.Zh.cr cr0 = ltE.this.KM;
            if(cr0 != null && cr0 instanceof tT) {
                ((tT)cr0).PjT(0);
                ltE.this.fA = 0;
            }
        };
        this.dwk = () -> {
            com.bytedance.sdk.component.adexpress.Zh.cr cr0 = ltE.this.KM;
            if(cr0 != null && cr0 instanceof tT) {
                ((tT)cr0).PjT(8);
                ltE.this.fA = 8;
            }
        };
        this.fA = 8;
        this.zYH = new SparseArray();
        this.wKV = -1.0f;
        this.yks = -1.0f;
        this.Xtz = -1.0f;
        this.ix = -1.0f;
        this.Nv = 0L;
        this.SM = s;
        this.Au = context0;
        this.qj = owx0;
        this.DWo = adSlot0;
        this.tT = false;
        this.cz();
    }

    public ltE(@NonNull Context context0, Owx owx0, AdSlot adSlot0, String s, boolean z, boolean z1) {
        super(context0);
        this.PjT = true;
        this.Zh = 0;
        this.SM = "embeded_ad";
        this.Qf = null;
        this.fDm = false;
        this.xE = false;
        this.ub = true;
        this.gK = -1;
        this.wN = "";
        this.tT = false;
        this.rds = true;
        this.Lrd = -1;
        this.yIW = new com.bytedance.sdk.openadsdk.cr.XX();
        this.iZZ = 0L;
        this.IJ = new AtomicBoolean(false);
        this.VY = new ViewTreeObserver.OnScrollChangedListener() {
            final ltE PjT;

            @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
            public void onScrollChanged() {
                ltE ltE0 = ltE.this;
                if(!ltE0.ub) {
                    return;
                }
                ltE0.Sks();
                ltE.this.removeCallbacks(ltE.this.tY);
                ltE.this.postDelayed(ltE.this.tY, 500L);
            }
        };
        this.tY = new Runnable() {
            final ltE PjT;

            @Override
            public void run() {
                if(Qf.PjT(ltE.this, 0, 5)) {
                    int v = ltE.this.getVisibility();
                    ltE.this.cz(v);
                    return;
                }
                ltE.this.cz(8);
            }
        };
        this.xH = () -> {
            com.bytedance.sdk.component.adexpress.Zh.cr cr0 = ltE.this.KM;
            if(cr0 != null && cr0 instanceof tT) {
                ((tT)cr0).PjT(0);
                ltE.this.fA = 0;
            }
        };
        this.dwk = () -> {
            com.bytedance.sdk.component.adexpress.Zh.cr cr0 = ltE.this.KM;
            if(cr0 != null && cr0 instanceof tT) {
                ((tT)cr0).PjT(8);
                ltE.this.fA = 8;
            }
        };
        this.fA = 8;
        this.zYH = new SparseArray();
        this.wKV = -1.0f;
        this.yks = -1.0f;
        this.Xtz = -1.0f;
        this.ix = -1.0f;
        this.Nv = 0L;
        this.SM = s;
        this.Au = context0;
        this.qj = owx0;
        this.DWo = adSlot0;
        this.tT = z;
        this.rds = z1;
        this.cz();
    }

    public void Au() {
        com.bytedance.sdk.component.adexpress.Zh.cr cr0 = this.KM;
        if(cr0 instanceof tT) {
            if(cr0 == null) {
                return;
            }
            ((tT)cr0).Au();
            int v = this.qj == null ? 5 : this.qj.fDm().cr();
            com.bytedance.sdk.component.utils.SM.Zh().postDelayed(() -> if(gK.ReZ(ltE.this.qj)) {
                com.bytedance.sdk.component.adexpress.Zh.cr cr0 = ltE.this.KM;
                if(cr0 instanceof tT) {
                    ((tT)cr0).Zh(1);
                }
            }, ((long)v) * 1000L);
        }
        if(this.qj != null && this.qj.QB() != null && this.qj.QB().PjT() != null) {
            this.qj.QB().PjT().PjT(0L);
        }
        if(this.KM instanceof com.bytedance.sdk.openadsdk.core.DWo.JQp.JQp && com.bytedance.sdk.openadsdk.core.model.qla.PjT(this.qj)) {
            this.PjT(this.KM);
        }

        class com.bytedance.sdk.openadsdk.core.Au.ltE.6 implements Runnable {
            final ltE PjT;

            @Override
            public void run() {
                ltE.this.JQp(1);
            }
        }

    }

    public void DWo() {
        if(this.Ld != null && this.Ld.Zh() != null) {
            this.Ld.cz();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
    public void JQp() {
    }

    // 检测为 Lambda 实现
    public void JQp(int v) [...]

    private void Lrd() {
        List list0 = this.oG;
        if(list0 == null) {
            return;
        }
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
    }

    private void Owx() {
        if(!com.bytedance.sdk.openadsdk.core.fDm.JQp()) {
            xf.PjT();
        }
    }

    public static JSONObject PjT(View view0) {
        try {
            int[] arr_v = new int[2];
            view0.getLocationOnScreen(arr_v);
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("width", view0.getWidth());
            jSONObject0.put("height", view0.getHeight());
            jSONObject0.put("left", arr_v[0]);
            jSONObject0.put("top", arr_v[1]);
            return jSONObject0;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public JSONObject PjT(JSONObject jSONObject0, Owx owx0) {
        if(this.KM instanceof tT) {
            if(jSONObject0 == null) {
                jSONObject0 = new JSONObject();
            }
            try {
                int v = this.getRenderEngineCacheType();
                if(owx0 != null) {
                    if(owx0.VY() != null && owx0.VY().fDm()) {
                        jSONObject0.put("engine_version", owx0.VY().xs());
                    }
                    else if(owx0.xH() == null) {
                        jSONObject0.put("engine_version", "v1");
                    }
                    else {
                        jSONObject0.put("engine_version", "v3");
                    }
                }
                jSONObject0.put("engine_type", v);
                return jSONObject0;
            }
            catch(Exception unused_ex) {
            }
            return jSONObject0;
        }
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
    public void PjT() {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
    public void PjT(int v) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
    public void PjT(int v, com.bytedance.sdk.component.adexpress.Zh.fDm fDm0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
    public void PjT(int v, String s) {
    }

    public void PjT(int v, boolean z, boolean z1) {
        this.ub = z;
        this.removeCallbacks(this.dwk);
        this.removeCallbacks(this.xH);
        if(v == 0) {
            if(z1) {
                this.xH.run();
                return;
            }
            this.postDelayed(this.xH, 50L);
            return;
        }
        if(z1) {
            this.dwk.run();
            return;
        }
        this.postDelayed(this.dwk, 50L);
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.Au
    public void PjT(View view0, int v, com.bytedance.sdk.component.adexpress.ReZ reZ0) {
        View view1;
        com.bytedance.sdk.component.utils.RD.PjT("ClickCreativeListener", new Object[]{"trigger Class2 method1", v});
        if(v != -1 && reZ0 != null) {
            HashMap hashMap0 = new HashMap();
            if(cRA.ReZ(this.qj)) {
                hashMap0.put("click_scence", 3);
            }
            else {
                hashMap0.put("click_scence", 1);
            }
            com.bytedance.sdk.openadsdk.core.model.fDm fDm0 = (com.bytedance.sdk.openadsdk.core.model.fDm)reZ0;
            if(gK.ReZ(this.qj)) {
                JSONObject jSONObject0 = fDm0.ub;
                if(jSONObject0 != null) {
                    try {
                        int v1 = jSONObject0.optInt("click_type", 0);
                        JSONObject jSONObject1 = new JSONObject();
                        jSONObject1.put("click_type", v1);
                        hashMap0.put("pag_json_data", jSONObject1.toString());
                    }
                    catch(Throwable throwable0) {
                        com.bytedance.sdk.component.utils.RD.Zh(throwable0.toString(), new Object[0]);
                    }
                }
            }
            com.bytedance.sdk.openadsdk.core.Au.Au au0 = this.cz;
            if(au0 != null) {
                au0.cr(this.getDynamicShowType());
                this.cz.PjT(hashMap0);
            }
            SM sM0 = this.XX;
            if(sM0 != null) {
                sM0.cr(this.getDynamicShowType());
                this.XX.PjT(hashMap0);
            }
            float f = fDm0.PjT;
            float f1 = fDm0.Zh;
            float f2 = fDm0.ReZ;
            float f3 = fDm0.cr;
            boolean z = fDm0.qla;
            SparseArray sparseArray0 = fDm0.fDm != null && fDm0.fDm.size() != 0 ? fDm0.fDm : this.zYH;
            String s = fDm0.qj;
            JSONObject jSONObject2 = null;
            if(view0 == null) {
                view1 = this;
            }
            else {
                if(view0 != this) {
                    jSONObject2 = ltE.PjT(view0);
                }
                view1 = view0;
            }
            fDm0.xf = v;
            if(jSONObject2 != null && fDm0.xs == null) {
                fDm0.xs = jSONObject2;
            }
            switch(v) {
                case 1: {
                    FrameLayout frameLayout0 = this.xf;
                    if(frameLayout0 != null) {
                        frameLayout0.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    if(this.qj != null && this.qj.tT() == 1 && !z) {
                        return;
                    }
                    SM sM1 = this.XX;
                    if(sM1 != null) {
                        sM1.PjT(fDm0);
                        this.XX.PjT(s);
                        this.XX.PjT(view1, f, f1, f2, f3, sparseArray0, z);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener1 = this.JQp;
                    if(pAGExpressAdWrapperListener1 != null && !fDm0.gK) {
                        pAGExpressAdWrapperListener1.onAdClicked();
                        return;
                    }
                    break;
                }
                case 2: {
                    if(fDm0.xE > 0) {
                        ZX.PjT(true);
                    }
                    com.bytedance.sdk.openadsdk.core.Au.Au au1 = this.cz;
                    if(au1 != null) {
                        au1.PjT(fDm0);
                        this.cz.PjT(s);
                        if(gK.ReZ(this.qj)) {
                            JSONObject jSONObject3 = fDm0.ub;
                            if(jSONObject3 != null) {
                                boolean z1 = jSONObject3.optBoolean("is_ceiling_page", false);
                                this.cz.cr(z1);
                            }
                        }
                        this.cz.PjT(view1, f, f1, f2, f3, sparseArray0, z);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener0 = this.JQp;
                    if(pAGExpressAdWrapperListener0 != null && !fDm0.gK) {
                        pAGExpressAdWrapperListener0.onAdClicked();
                    }
                    ZX.PjT(false);
                    com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(this.qj, 9);
                    return;
                }
                case 3: {
                    TTDislikeDialogAbstract tTDislikeDialogAbstract0 = this.cr;
                    if(tTDislikeDialogAbstract0 != null) {
                        tTDislikeDialogAbstract0.show();
                        return;
                    }
                    com.bytedance.sdk.openadsdk.ReZ.ReZ reZ1 = this.ReZ;
                    if(reZ1 != null) {
                        reZ1.PjT();
                        return;
                    }
                    TTDelegateActivity.PjT(this.qj, this.Zd);
                    return;
                }
                case 4: {
                    FrameLayout frameLayout1 = this.xf;
                    if(frameLayout1 != null) {
                        frameLayout1.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    if(this.qj != null && this.qj.tT() == 1 && !z) {
                        return;
                    }
                    wN.ReZ(this.qj);
                    if(!"embeded_ad".equals(this.SM) || !this.tT() || this.xs || !wN.ReZ(this.qj)) {
                        SM sM2 = this.XX;
                        if(sM2 != null) {
                            sM2.PjT(fDm0);
                            this.XX.PjT(s);
                            this.XX.PjT(view1, f, f1, f2, f3, sparseArray0, z);
                        }
                    }
                    else {
                        com.bytedance.sdk.openadsdk.core.Au.Au au2 = this.cz;
                        if(au2 != null) {
                            au2.PjT(fDm0);
                            this.cz.PjT(s);
                            this.cz.PjT(view1, f, f1, f2, f3, sparseArray0, z);
                        }
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.JQp;
                    if(pAGExpressAdWrapperListener2 != null && !fDm0.gK) {
                        pAGExpressAdWrapperListener2.onAdClicked();
                        return;
                    }
                    break;
                }
                case 5: {
                    this.PjT(!this.tT, "dynamicClick");
                    return;
                }
                case 6: {
                    this.PjT();
                    return;
                }
                case 7: {
                    TTWebsiteActivity.PjT(this.Au, this.qj, this.SM);
                }
            }
        }
    }

    public void PjT(com.bytedance.sdk.component.adexpress.Zh.cr cr0) {
        if(this.qZS == null) {
            return;
        }
        try {
            if(cr0 instanceof com.bytedance.sdk.openadsdk.core.DWo.JQp.JQp) {
                ViewGroup viewGroup0 = (ViewGroup)((com.bytedance.sdk.openadsdk.core.DWo.JQp.JQp)cr0).cz().qj();
                this.RD = viewGroup0;
                if(viewGroup0 != null) {
                    this.qZS.PjT();
                    View view0 = this.qZS.Zh();
                    if(view0 != null) {
                        ViewGroup viewGroup1 = (ViewGroup)view0.getParent();
                        if(viewGroup1 != null) {
                            viewGroup1.removeView(view0);
                        }
                        this.RD.addView(view0, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.qla
    public void PjT(com.bytedance.sdk.component.adexpress.Zh.cr cr0, com.bytedance.sdk.component.adexpress.Zh.fDm fDm0) {
        this.IJ.set(true);
        this.KM = cr0;
        if(this.fA != this.getWindowVisibility()) {
            this.cz(this.getWindowVisibility());
        }
        cr0.ReZ();
        if(cr0.ReZ() == 3 && (this.qj != null && this.qj.RD() == 1)) {
            this.qj.JQp(0);
        }
        if(cr0.ReZ() != 1) {
            View view0 = cr0.JQp();
            if(view0.getParent() != null) {
                ((ViewGroup)view0.getParent()).removeView(view0);
            }
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; v1 < this.getChildCount(); ++v1) {
                arrayList0.add(this.getChildAt(v1));
            }
            for(int v = 0; v < arrayList0.size(); ++v) {
                if(arrayList0.get(v) instanceof com.bytedance.sdk.component.SM.cz) {
                    this.removeView(((View)arrayList0.get(v)));
                }
            }
            if(gK.ReZ(this.qj)) {
                this.addView(cr0.JQp(), new FrameLayout.LayoutParams(-1, -1));
            }
            else {
                this.addView(cr0.JQp());
            }
        }
        Owx owx0 = this.qj;
        if(owx0 != null) {
            com.bytedance.sdk.openadsdk.qla.ReZ.PjT(owx0.JQp(), this.iZZ, this.SM, cr0.ReZ());
        }
        com.bytedance.sdk.component.adexpress.Zh.SM sM0 = this.xu;
        if(sM0 != null) {
            ((com.bytedance.sdk.openadsdk.core.Au.xs)sM0).qj();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener0 = this.JQp;
        if(pAGExpressAdWrapperListener0 != null) {
            pAGExpressAdWrapperListener0.onRenderSuccess(this, ((float)fDm0.cr()), ((float)fDm0.JQp()));
        }
        if(this.KM instanceof com.bytedance.sdk.openadsdk.core.DWo.JQp.JQp && com.bytedance.sdk.openadsdk.core.model.qla.PjT(this.qj)) {
            this.xE();
        }
        if(this.PjT(fDm0)) {
            com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(this, this.qj, this.ReZ(this.getDynamicShowType()));
        }
        RD rD0 = this.kph;
        if(rD0 != null) {
            rD0.PjT(this.qj, this.SM);
        }
    }

    protected void PjT(com.bytedance.sdk.component.adexpress.Zh.xs.PjT xs$PjT0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
    public void PjT(String s, JSONObject jSONObject0) {
    }

    protected void PjT(JSONObject jSONObject0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
    public void PjT(boolean z, String s) {
    }

    protected boolean PjT(com.bytedance.sdk.component.adexpress.Zh.fDm fDm0) {
        return true;
    }

    private void RD() {
        if(this.qj != null && this.qj.XWz() == 1 && this.qj.iZZ() != 2) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.cz.PjT.PjT pjT0 = new com.bytedance.sdk.openadsdk.core.cz.PjT.PjT();
        switch(this.Zh) {
            case 3: {
                com.bytedance.sdk.component.adexpress.dynamic.JQp.XX xX2 = new com.bytedance.sdk.component.adexpress.dynamic.JQp.XX();
                Zh zh0 = new Zh(this.Au.getApplicationContext(), this.CY, this.MWx, this.tT, xX2, this, pjT0, new com.bytedance.sdk.openadsdk.core.Au.cz(this.Au, this.MWx, this.tT, xX2, this.CY, pjT0));
                this.Yo = zh0;
                this.oG.add(zh0);
                return;
            }
            case 7: {
                com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ reZ0 = new com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ(this.Au, this.qj, this.tT, ((com.bytedance.sdk.openadsdk.core.DWo.JQp.PjT)this.CY), this);
                this.kFP = reZ0;
                XX xX1 = new XX(this.Au, reZ0, this, this.CY);
                this.Xe = xX1;
                this.oG.add(xX1);
                return;
            }
            case 0: 
            case 9: {
                tT tT0 = new tT(this.Au, this.CY, this.MWx, this.Co, this.qj);
                this.Ld = tT0;
                xE xE0 = new xE(this.Au, this.CY, tT0, this);
                this.HG = xE0;
                this.oG.add(xE0);
                return;
            }
            case 10: {
                com.bytedance.sdk.openadsdk.core.DWo.JQp.JQp jQp0 = new com.bytedance.sdk.openadsdk.core.DWo.JQp.JQp(this.Au, this.qj, this.tT, ((com.bytedance.sdk.openadsdk.core.DWo.JQp.PjT)this.CY), this);
                XX xX0 = new XX(this.Au, jQp0, this, this.CY);
                this.Xe = xX0;
                this.oG.add(xX0);
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
    public long ReZ() {
        return 0L;
    }

    protected com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT ReZ(int v) {
        return new com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(v);
    }

    public void SM() {
        if(this.qj == null) {
            return;
        }
        this.iZZ = SystemClock.elapsedRealtime();
        if(this.qj.pBJ()) {
            com.bytedance.sdk.openadsdk.core.Au.ReZ reZ0 = this.OMu;
            if(reZ0 == null) {
                this.a_(106);
                return;
            }
            reZ0.PjT(this);
            this.OMu.PjT();
            return;
        }
        this.Co.PjT();
        com.bytedance.sdk.component.adexpress.Zh.DWo.PjT dWo$PjT0 = this.cI;
        if(dWo$PjT0 != null) {
            dWo$PjT0.PjT(this);
        }
        try {
            this.cI.PjT();
        }
        catch(Throwable unused_ex) {
        }
    }

    private void Sks() {
        if(this.IJ.get()) {
            this.yIW.PjT(System.currentTimeMillis(), Qf.PjT(this));
        }
    }

    private void XX() {
        com.bytedance.sdk.openadsdk.core.model.Owx.PjT owx$PjT0 = this.qj.VY();
        if(TextUtils.equals(this.SM, "embeded_ad") && owx$PjT0 != null) {
            String s = owx$PjT0.xf();
            if(!TextUtils.isEmpty(s)) {
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    int v = jSONObject0.optInt("width");
                    int v1 = jSONObject0.optInt("height");
                    if(v != 0 && v1 != 0) {
                        this.Jo = (float)v1;
                        this.ZX = (float)v;
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
    public void Zh() {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
    public void Zh(int v) {
    }

    protected void Zh(int v, int v1) {
        int v3;
        if(TextUtils.equals(this.SM, "banner_ad")) {
            return;
        }
        int v2 = (v1 < this.Lrd || this.Lrd < 0 || !this.cRA && !TextUtils.equals(this.SM, "open_ad")) && (v != 0 || !TextUtils.equals(this.SM, "open_ad")) && this.cr() != 5 ? 0 : 1;
        if(v1 > this.Lrd) {
            v3 = 0;
        }
        else if(this.qj != null && this.qj.MWx() != null) {
            v3 = (int)(Math.min(this.Lrd, this.qj.MWx().C() * ((double)this.qj.MWx().t())) - ((double)v1));
        }
        else {
            v3 = this.Lrd - v1;
        }
        if(this.Yo != null && this.Yo.Zh() != null) {
            this.Yo.Zh().setTime(String.valueOf(v), v2, v3, false);
        }
        com.bytedance.sdk.component.adexpress.Zh.cr cr0 = this.KM;
        if(cr0 instanceof com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ) {
            ((com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ)cr0).setTime(String.valueOf(v), v2, v3, false);
        }
    }

    public void Zh(int v, String s) {
        com.bytedance.sdk.component.adexpress.Zh.cr cr0 = this.KM;
        if(cr0 == null) {
            return;
        }
        if(cr0 instanceof tT) {
            KM kM0 = ((tT)cr0).xE();
            if(kM0 != null) {
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("time", v);
                    jSONObject0.put("flag", s);
                    kM0.PjT("onVideoPaused", jSONObject0);
                }
                catch(JSONException unused_ex) {
                }
            }
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.qla
    public void a_(int v) {
        com.bytedance.sdk.component.adexpress.Zh.SM sM0 = this.xu;
        if(sM0 != null) {
            if(!this.PjT) {
                sM0.Au();
            }
            this.xu.SM();
            ((com.bytedance.sdk.openadsdk.core.Au.xs)this.xu).qj();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener0 = this.JQp;
        if(pAGExpressAdWrapperListener0 != null) {
            pAGExpressAdWrapperListener0.onRenderFail(this, com.bytedance.sdk.openadsdk.core.Au.PjT(v), v);
        }
        RD rD0 = this.kph;
        if(rD0 != null) {
            rD0.PjT(this.qj, this.SM);
        }
    }

    private void cRA() {
        List list0 = this.oG;
        if(list0 == null) {
            return;
        }
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
    public int cr() {
        return 0;
    }

    protected void cz() {
        this.Owx = new HashSet();
        this.MWx = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot0 = this.DWo;
        if(adSlot0 != null) {
            this.ZX = adSlot0.getExpressViewAcceptedWidth();
            this.Jo = this.DWo.getExpressViewAcceptedHeight();
            this.XX();
            this.Qf = this.DWo.getCodeId();
            if(!TextUtils.equals(this.SM, "fullscreen_interstitial_ad")) {
                if(!TextUtils.equals(this.SM, "rewarded_video")) {
                    if(TextUtils.equals(this.SM, "open_ad")) {
                        this.Lrd = this.qj == null || this.qj.ReZ() < 0 ? ub.cr().Sks(this.Qf) : this.qj.ReZ();
                        if(this.Lrd < 0) {
                            this.Lrd = 5;
                        }
                    }
                }
                else if(this.qj != null && this.qj.Zh() >= 0) {
                    this.Lrd = this.qj.Zh();
                }
                else {
                    this.Lrd = ub.cr().DWo(this.Qf);
                }
            }
            else if(this.qj != null && this.qj.PjT() >= 0) {
                this.Lrd = this.qj.PjT();
            }
            else {
                this.Lrd = ub.cr().ltE(this.Qf);
            }
        }
        this.setBackgroundColor(0);
        if(this.qj.pBJ()) {
            this.OMu = new com.bytedance.sdk.openadsdk.core.Au.ReZ(this.Au, this, this.qj, this.SM);
            return;
        }
        this.ub();
        this.oG = new ArrayList();
        this.gK();
        xE xE0 = this.HG;
        if(xE0 != null) {
            this.Ld = (tT)xE0.Zh();
        }
        KM kM0 = this.getJsObject();
        if(kM0 != null) {
            kM0.cz(this.SM);
        }
    }

    // 检测为 Lambda 实现
    public void cz(int v) [...]

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        int v;
        com.bytedance.sdk.openadsdk.core.Au.Au au0 = this.cz;
        if(au0 != null) {
            au0.Zh(motionEvent0.getDeviceId());
            this.cz.PjT(motionEvent0.getSource());
            this.cz.ReZ(motionEvent0.getToolType(0));
        }
        SM sM0 = this.XX;
        if(sM0 != null) {
            sM0.Zh(motionEvent0.getDeviceId());
            this.XX.PjT(motionEvent0.getSource());
            this.XX.ReZ(motionEvent0.getToolType(0));
        }
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                this.wKV = motionEvent0.getRawX();
                this.yks = motionEvent0.getRawY();
                this.Nv = System.currentTimeMillis();
                v = 0;
                break;
            }
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                this.Xtz += Math.abs(motionEvent0.getX() - this.wKV);
                this.ix += Math.abs(motionEvent0.getY() - this.yks);
                this.wKV = motionEvent0.getX();
                this.yks = motionEvent0.getY();
                v = System.currentTimeMillis() - this.Nv <= 200L || this.Xtz <= 8.0f && this.ix <= 8.0f ? 2 : 1;
                break;
            }
            case 3: {
                v = 4;
                break;
            }
            default: {
                v = -1;
            }
        }
        SparseArray sparseArray0 = this.zYH;
        if(sparseArray0 != null) {
            sparseArray0.put(motionEvent0.getActionMasked(), new com.bytedance.sdk.openadsdk.core.Zh.ReZ.PjT(v, ((double)motionEvent0.getSize()), ((double)motionEvent0.getPressure()), System.currentTimeMillis()));
        }
        return super.dispatchTouchEvent(motionEvent0);
    }

    public void fDm() {
        if(this.qj != null && this.qj.QB() != null && this.qj.QB().PjT() != null) {
            this.qj.QB().PjT().JQp(this.getVideoProgress());
        }
    }

    private void gK() {
        if(this.qj.XWz() == 1 && this.qj.uvo()) {
            com.bytedance.sdk.openadsdk.core.Au.Owx owx0 = new com.bytedance.sdk.openadsdk.core.Au.Owx(this, this.MWx, this.CY);
            cz cz0 = new cz(this.Au, this.CY, owx0);
            this.zZ = cz0;
            this.oG.add(cz0);
            this.cI = new com.bytedance.sdk.component.adexpress.Zh.xf(this.oG, this.xu);
            return;
        }
        if(this.yIW()) {
            this.ltE();
            return;
        }
        try {
            this.Owx();
            tT tT0 = new tT(this.Au, this.CY, this.MWx, this.Co, this.qj);
            this.Ld = tT0;
            xE xE0 = new xE(this.Au, this.CY, tT0, this);
            this.HG = xE0;
            this.oG.add(xE0);
        }
        catch(Exception exception0) {
            com.bytedance.sdk.component.utils.RD.PjT("NativeExpressView", "NativeExpressView dynamicRender fail", exception0);
        }
        com.bytedance.sdk.openadsdk.core.Au.Owx owx1 = new com.bytedance.sdk.openadsdk.core.Au.Owx(this, this.MWx, this.CY);
        cz cz1 = new cz(this.Au, this.CY, owx1);
        this.zZ = cz1;
        this.oG.add(cz1);
        this.cI = new com.bytedance.sdk.component.adexpress.Zh.xf(this.oG, this.xu);
    }

    public com.bytedance.sdk.openadsdk.cr.XX getAdShowTime() {
        return this.yIW;
    }

    private int getAdSlotType() {
        String s = this.SM;
        s.hashCode();
        switch(s) {
            case "banner_ad": {
                return 1;
            }
            case "fullscreen_interstitial_ad": {
                return 8;
            }
            case "interaction": {
                return 2;
            }
            case "open_ad": {
                return 3;
            }
            case "rewarded_video": {
                return 7;
            }
            default: {
                return 5;
            }
        }
    }

    public com.bytedance.sdk.openadsdk.core.Au.ReZ getBrandBannerController() {
        return this.OMu;
    }

    public com.bytedance.sdk.openadsdk.core.Au.Au getClickCreativeListener() {
        return this.cz;
    }

    public SM getClickListener() {
        return this.XX;
    }

    public String getClosedListenerKey() {
        return this.Zd;
    }

    public int getDynamicShowType() {
        return this.KM == null ? 0 : this.KM.ReZ();
    }

    public int getExpectExpressHeight() {
        return this.Jo.intValue();
    }

    public int getExpectExpressWidth() {
        return this.ZX.intValue();
    }

    public KM getJsObject() {
        return this.Ld == null ? null : this.Ld.xE();
    }

    public int getRenderEngineCacheType() {
        com.bytedance.sdk.component.adexpress.Zh.cr cr0 = this.KM;
        if(cr0 instanceof tT) {
            DWo dWo0 = ((tT)cr0).qla();
            return dWo0 == null ? 0 : dWo0.PjT();
        }
        return 0;
    }

    protected int getRenderTimeout() {
        return ub.cr().cRA();
    }

    public String getUgenTemplateErrorReason() {
        return this.wN;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Zh.PjT$PjT
    public long getVideoProgress() {
        return this.dIF == null ? 0L : this.dIF.getVideoProgress();
    }

    public com.bytedance.sdk.component.SM.cz getWebView() {
        return this.Ld == null ? null : this.Ld.PjT();
    }

    private void ltE() {
        this.Zh = this.qj.ZX();
        try {
            this.Owx();
            this.RD();
        }
        catch(Exception exception0) {
            com.bytedance.sdk.component.utils.RD.PjT("NativeExpressView", "NativeExpressView dynamicRender fail", exception0);
        }
        boolean z = this.qj.Jo() == 1;
        this.PjT = z;
        if(z) {
            com.bytedance.sdk.openadsdk.core.Au.Owx owx0 = new com.bytedance.sdk.openadsdk.core.Au.Owx(this, this.MWx, this.CY);
            cz cz0 = new cz(this.Au, this.CY, owx0);
            this.zZ = cz0;
            this.oG.add(cz0);
        }
        this.cI = new com.bytedance.sdk.component.adexpress.Zh.xf(this.oG, this.xu);
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Sks();
        this.Lrd();
        this.getViewTreeObserver().addOnScrollChangedListener(this.VY);
        com.bytedance.sdk.openadsdk.core.SM.Zh().PjT(this.Zd, this.ig);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getViewTreeObserver().removeOnScrollChangedListener(this.VY);
        com.bytedance.sdk.openadsdk.core.SM.Zh().cz(this.Zd);
        this.cRA();
        this.PjT(8, true, true);
    }

    @Override  // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
    }

    @Override  // android.widget.FrameLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.Sks();
    }

    @Override  // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if(Build.VERSION.SDK_INT < 28) {
            this.onWindowVisibilityChanged((z ? this.getVisibility() : 8));
        }
        this.Sks();
        com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(this.qj, z);
        if(z) {
            com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(this.qj, 4);
            return;
        }
        com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(this.qj, 8);
    }

    @Override  // android.view.View
    public void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        this.PjT(v, true, false);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.cr
    public void onvideoComplate() {
    }

    public void qj() {
        try {
            com.bytedance.sdk.openadsdk.core.Au.ReZ reZ0 = this.OMu;
            if(reZ0 != null) {
                reZ0.Zh();
            }
            this.fDm();
            this.removeAllViews();
            if(this.getParent() != null) {
                ((ViewGroup)this.getParent()).removeView(this);
            }
            List list0 = this.oG;
            if(list0 != null) {
                for(Object object0: list0) {
                    ((com.bytedance.sdk.component.adexpress.Zh.DWo)object0).PjT();
                }
            }
            com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(this.qj);
            com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.Zh(this.qj);
            this.ReZ = null;
            this.cr = null;
            this.DWo = null;
            this.qj = null;
            this.JQp = null;
            this.cz = null;
            this.qla = null;
            this.XX = null;
            com.bytedance.sdk.openadsdk.core.DWo.ReZ.Zh zh0 = this.qZS;
            if(zh0 != null) {
                zh0.ReZ();
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        com.bytedance.sdk.component.utils.RD.PjT("NativeExpressView", "detach error", throwable0);
    }

    public boolean qla() {
        return this.IJ.get();
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.Zh.ReZ reZ0) {
        this.qla = reZ0;
        cz cz0 = this.zZ;
        if(cz0 != null) {
            cz0.PjT(reZ0);
        }
    }

    public void setBannerClickClosedListener(com.bytedance.sdk.openadsdk.core.ReZ.cr.PjT cr$PjT0) {
        this.ig = cr$PjT0;
    }

    public void setClickCreativeListener(com.bytedance.sdk.openadsdk.core.Au.Au au0) {
        this.cz = au0;
        if(au0 != null) {
            au0.PjT(this);
        }
    }

    public void setClickListener(SM sM0) {
        this.XX = sM0;
    }

    public void setClosedListenerKey(String s) {
        this.Zd = s;
        com.bytedance.sdk.openadsdk.core.Au.ReZ reZ0 = this.OMu;
        if(reZ0 != null) {
            reZ0.PjT(s);
        }
    }

    public void setDislike(com.bytedance.sdk.openadsdk.ReZ.ReZ reZ0) {
        com.bytedance.sdk.component.adexpress.Zh.cr cr0 = this.KM;
        if(cr0 != null && cr0 instanceof com.bytedance.sdk.openadsdk.core.Au.Owx) {
            com.bytedance.sdk.openadsdk.core.Au.PjT pjT0 = (com.bytedance.sdk.openadsdk.core.Au.PjT)cr0.JQp();
            if(pjT0 != null) {
                pjT0.setDislikeInner(reZ0);
            }
        }
        com.bytedance.sdk.openadsdk.core.Au.ReZ reZ1 = this.OMu;
        if(reZ1 != null) {
            reZ1.PjT(reZ0);
        }
        this.ReZ = reZ0;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener0) {
        this.JQp = pAGExpressAdWrapperListener0;
        com.bytedance.sdk.openadsdk.core.Au.ReZ reZ0 = this.OMu;
        if(reZ0 != null) {
            reZ0.PjT(pAGExpressAdWrapperListener0);
        }
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.JQp jQp0) {
        if(this.Ld != null && this.getJsObject() != null) {
            this.getJsObject().PjT(jQp0);
        }
        com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ reZ0 = this.kFP;
        if(reZ0 != null) {
            reZ0.PjT(jQp0);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract0) {
        com.bytedance.sdk.component.adexpress.Zh.cr cr0 = this.KM;
        if(cr0 != null && cr0 instanceof com.bytedance.sdk.openadsdk.core.Au.Owx) {
            com.bytedance.sdk.openadsdk.core.Au.PjT pjT0 = (com.bytedance.sdk.openadsdk.core.Au.PjT)cr0.JQp();
            if(pjT0 != null) {
                pjT0.setDislikeOuter(tTDislikeDialogAbstract0);
            }
        }
        com.bytedance.sdk.openadsdk.core.Au.ReZ reZ0 = this.OMu;
        if(reZ0 != null) {
            reZ0.PjT(tTDislikeDialogAbstract0);
        }
        this.cr = tTDislikeDialogAbstract0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.cr
    public void setSoundMute(boolean z) {
        this.tT = z;
        if(this.Yo != null && this.Yo.Zh() != null) {
            this.Yo.Zh().setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.Zh.cr cr0 = this.KM;
        if(cr0 instanceof com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ) {
            ((com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ)cr0).setSoundMute(z);
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.cr
    public void setTime(CharSequence charSequence0, int v, int v1, boolean z) {
        try {
            int v2 = Integer.parseInt(String.valueOf(charSequence0));
            this.Zh(v2, v);
            com.bytedance.sdk.openadsdk.core.DWo.ReZ.Zh zh0 = this.qZS;
            if(zh0 != null) {
                zh0.PjT(v2);
            }
        }
        catch(NumberFormatException unused_ex) {
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.cr
    public void setTimeUpdate(int v) {
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.ReZ.XX xX0) {
        this.dIF = xX0;
    }

    public void setVideoFrameChangeListener(com.bytedance.sdk.openadsdk.xf.XX xX0) {
        if(this.Ld != null && this.getJsObject() != null) {
            this.getJsObject().PjT(xX0);
        }
    }

    private boolean tT() {
        return Owx.JQp(this.qj);
    }

    private void ub() {
        com.bytedance.sdk.component.adexpress.Zh.xs.PjT xs$PjT0;
        boolean z2;
        long v;
        boolean z = true;
        com.bytedance.sdk.openadsdk.cr.ub ub0 = new com.bytedance.sdk.openadsdk.cr.ub(1, this.SM, this.qj);
        this.Co = ub0;
        this.xu = new com.bytedance.sdk.openadsdk.core.Au.xs(ub0, this.SM, this.qj, this.Qf);
        boolean z1 = this.qj.tY();
        try {
            com.bytedance.sdk.openadsdk.core.model.Owx.PjT owx$PjT0 = this.qj.VY();
            if(owx$PjT0 != null) {
                String s = owx$PjT0.qj();
                if(!TextUtils.isEmpty(s)) {
                    v = new JSONObject(s).optLong("render_delay_time");
                    goto label_12;
                }
            }
        }
        catch(Exception unused_ex) {
        }
        v = 0L;
        try {
        label_12:
            if(Owx.JQp(this.qj) || ub.cr().xs(this.Qf) != 1) {
                goto label_18;
            }
            else {
                z2 = true;
            }
            goto label_19;
        }
        catch(Exception unused_ex) {
            z2 = false;
            goto label_27;
        }
        z2 = true;
        goto label_19;
    label_18:
        z2 = false;
        try {
        label_19:
            if(com.bytedance.sdk.openadsdk.core.settings.xs.Gr().fDm(this.Qf)) {
                switch(this.qj.RD()) {
                    case 5: 
                    case 6: {
                        z2 = true;
                        break;
                    }
                    default: {
                        if(this.qj.kW() == 3) {
                            z2 = true;
                        }
                    }
                }
            }
            else {
                z2 = true;
            }
        }
        catch(Exception unused_ex) {
        }
    label_27:
        long v1 = Math.min(Math.max(v, 0L), 10000L);
        int v2 = this.getRenderTimeout();
        double f = this.qj.MWx() == null ? 0.0 : this.qj.MWx().C() * ((double)this.qj.MWx().t());
        if(this.Lrd == -1 || this.Lrd >= ((int)f)) {
            z = false;
        }
        this.cRA = z;
        if(com.bytedance.sdk.openadsdk.core.DWo.ReZ.PjT(this.qj) || com.bytedance.sdk.openadsdk.core.DWo.ReZ.Zh(this.qj)) {
            xs$PjT0 = new com.bytedance.sdk.openadsdk.core.DWo.JQp.PjT.PjT();
            if(com.bytedance.sdk.openadsdk.core.DWo.ReZ.PjT(this.qj)) {
                ((com.bytedance.sdk.openadsdk.core.DWo.JQp.PjT.PjT)xs$PjT0).PjT(com.bytedance.sdk.openadsdk.core.DWo.ReZ.PjT(this.qj, this.SM));
            }
            ((com.bytedance.sdk.openadsdk.core.DWo.JQp.PjT.PjT)xs$PjT0).PjT(((com.bytedance.adsdk.ugeno.core.qla)this.xu));
            ((com.bytedance.sdk.openadsdk.core.DWo.JQp.PjT.PjT)xs$PjT0).PjT(this.ZX);
            ((com.bytedance.sdk.openadsdk.core.DWo.JQp.PjT.PjT)xs$PjT0).Zh(this.Jo);
        }
        else {
            xs$PjT0 = new com.bytedance.sdk.component.adexpress.Zh.xs.PjT();
        }
        xs$PjT0.JQp(z1);
        xs$PjT0.PjT(this.SM).Zh(this.qj.dIF()).ReZ(this.qj.SW()).cr(this.qj.xR()).PjT(this.xu).cr(this.qj.xi()).PjT(v2).Zh(this.qj.jp()).ReZ(this.rds).Zh(this.qj.wN()).PjT(v1).ReZ(this.qj.cI()).PjT(com.bytedance.sdk.openadsdk.core.Au.PjT.Zh.PjT(this.qj)).cr(z2).JQp(this.Lrd).PjT(this.cRA).PjT(f).cz(com.bytedance.sdk.openadsdk.core.settings.xs.Gr().ix()).XX(this.qj.pz().PjT()).Au(this.qj.pz().Zh()).PjT(new com.bytedance.sdk.component.adexpress.Zh.JQp() {
            final ltE Zh;

            @Override  // com.bytedance.sdk.component.adexpress.Zh.JQp
            public JSONObject PjT() {
                JSONObject jSONObject0 = null;
                try {
                    ltE ltE0 = ltE.this;
                    Owx owx0 = ltE0.qj;
                    if(owx0 == null) {
                        ltE0.wN = "material is null";
                        return null;
                    }
                    if(z1) {
                        ltE0.kph = new RD();
                        jSONObject0 = com.bytedance.sdk.openadsdk.core.Au.PjT.Zh.PjT(ltE.this.ZX, ltE.this.Jo, ltE.this.fDm, ltE.this.qj, ltE.this.SM, ltE.this.kph);
                        ltE.this.wN = "";
                        return jSONObject0;
                    }
                    if(com.bytedance.sdk.openadsdk.core.DWo.ReZ.PjT(owx0)) {
                        RD rD0 = new RD();
                        ltE.this.kph = rD0;
                        jSONObject0 = com.bytedance.sdk.openadsdk.core.DWo.ReZ.PjT(ltE.this.qj, ltE.this.kph);
                        ltE.this.wN = "";
                        return jSONObject0;
                    }
                    jSONObject0 = com.bytedance.sdk.openadsdk.core.Au.PjT.Zh.PjT(ltE.this.ZX, ltE.this.Jo, ltE.this.fDm, ltE.this.qj);
                    ltE.this.PjT(jSONObject0);
                }
                catch(Throwable unused_ex) {
                }
                return jSONObject0;
            }
        });
        this.PjT(xs$PjT0);
        this.CY = xs$PjT0.PjT();
    }

    public void xE() {
        com.bytedance.sdk.openadsdk.core.DWo.ReZ.Zh zh0 = new com.bytedance.sdk.openadsdk.core.DWo.ReZ.Zh(this.Au, this.qj);
        this.qZS = zh0;
        zh0.PjT(this);
        this.qZS.PjT(new com.bytedance.sdk.openadsdk.core.DWo.ReZ.PjT() {
            final ltE PjT;

        });
    }

    public void xf() {
        try {
            if(this.xf != null && this.xf.getParent() != null) {
                this.removeView(this.xf);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public boolean xs() {
        return this.KM != null && this.KM instanceof com.bytedance.sdk.openadsdk.core.Au.Owx;
    }

    // 去混淆评级： 中等(50)
    private boolean yIW() {
        return TextUtils.equals(this.SM, "fullscreen_interstitial_ad") || TextUtils.equals(this.SM, "rewarded_video") || TextUtils.equals("open_ad", this.SM) || tT.Zh(this.SM) || TextUtils.equals(this.SM, "embeded_ad");
    }

    class com.bytedance.sdk.openadsdk.core.Au.ltE.3 implements Runnable {
        final ltE PjT;

        @Override
        public void run() {
            ltE.this.cz(0);
        }
    }


    class com.bytedance.sdk.openadsdk.core.Au.ltE.4 implements Runnable {
        final ltE PjT;

        @Override
        public void run() {
            ltE.this.cz(8);
        }
    }

}

