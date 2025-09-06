package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import android.view.DisplayCutout;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.KM.PjT;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager.Stub;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.Lrd.Zh.JQp;
import com.bytedance.sdk.openadsdk.PjT.cr.Zh;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.qla;
import com.bytedance.sdk.openadsdk.component.ReZ;
import com.bytedance.sdk.openadsdk.component.SM.Au;
import com.bytedance.sdk.openadsdk.component.cz;
import com.bytedance.sdk.openadsdk.core.Lrd;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.qj.cr;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.tT;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.XX;
import com.bytedance.sdk.openadsdk.utils.Co;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import v.c;

public class TTAppOpenAdActivity extends TTBaseActivity implements PjT {
    private static Zh Au;
    private final Runnable Co;
    private com.bytedance.sdk.openadsdk.component.cz.Zh DWo;
    protected boolean JQp;
    private final com.bytedance.sdk.openadsdk.component.PjT Jo;
    private ReZ KM;
    private final AtomicBoolean Lrd;
    private String Owx;
    protected final AtomicBoolean PjT;
    private AdSlot Qf;
    private Owx RD;
    final AtomicBoolean ReZ;
    private final com.bytedance.sdk.openadsdk.component.Au.PjT SM;
    private IListenerManager Sks;
    private boolean Yo;
    private volatile boolean ZX;
    protected final KM Zh;
    private int cRA;
    final AtomicBoolean cr;
    long cz;
    private Co fDm;
    private boolean gK;
    private FrameLayout iZZ;
    private int ltE;
    private qla qj;
    private XX qla;
    private Zh tT;
    private float ub;
    private float xE;
    private TTAdDislikeToast xf;
    private final AtomicBoolean xs;
    private int yIW;

    public TTAppOpenAdActivity() {
        this.PjT = new AtomicBoolean(false);
        this.Zh = new KM(Looper.getMainLooper(), this);
        this.ReZ = new AtomicBoolean(false);
        this.cr = new AtomicBoolean(false);
        this.SM = new com.bytedance.sdk.openadsdk.component.Au.PjT();
        this.JQp = false;
        this.xs = new AtomicBoolean(false);
        this.fDm = Co.ReZ();
        this.Lrd = new AtomicBoolean(false);
        this.cz = 0L;
        this.ZX = false;
        this.Jo = new com.bytedance.sdk.openadsdk.component.PjT() {
            final TTAppOpenAdActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.component.PjT
            public void JQp() {
                TTAppOpenAdActivity.this.ltE();
            }

            @Override  // com.bytedance.sdk.openadsdk.component.PjT
            public void PjT() {
                TTAppOpenAdActivity.this.Owx();
                TTAppOpenAdActivity.this.finish();
            }

            @Override  // com.bytedance.sdk.openadsdk.component.PjT
            public void PjT(int v, boolean z) {
                if(TTAppOpenAdActivity.this.KM != null) {
                    TTAppOpenAdActivity.this.KM.PjT(v, z);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.component.PjT
            public void PjT(long v, long v1) {
                TTAppOpenAdActivity.this.SM.PjT(v);
                if(!TTAppOpenAdActivity.this.JQp && TTAppOpenAdActivity.this.KM != null && TTAppOpenAdActivity.this.KM.XX() != null && TTAppOpenAdActivity.this.KM.XX().cr()) {
                    TTAppOpenAdActivity.this.KM.XX().XX();
                }
                TTAppOpenAdActivity.this.xs();
            }

            @Override  // com.bytedance.sdk.openadsdk.component.PjT
            public void PjT(View view0) {
                TTAppOpenAdActivity.this.RD();
            }

            @Override  // com.bytedance.sdk.openadsdk.component.PjT
            public void ReZ() {
                TTAppOpenAdActivity.this.cz();
                TTAppOpenAdActivity.this.fDm.JQp();
                TTAppOpenAdActivity.this.ub();
                if(TTAppOpenAdActivity.this.gK) {
                    TTAppOpenAdActivity.this.xf();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.component.PjT
            public void Zh() {
                TTAppOpenAdActivity.this.ZX = true;
                if(com.bytedance.sdk.openadsdk.RD.PjT.PjT("splash_auto_close_switch", 0) == 0) {
                    TTAppOpenAdActivity.this.XX();
                    TTAppOpenAdActivity.this.finish();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.component.PjT
            public void Zh(long v, int v1) {
                StringBuilder stringBuilder0 = new StringBuilder("onError() called with: totalPlayTime = [");
                stringBuilder0.append(v);
                stringBuilder0.append("], percent = [");
                stringBuilder0.append(v1);
                stringBuilder0.append("]");
                if(TTAppOpenAdActivity.this.KM != null) {
                    com.bytedance.sdk.openadsdk.component.Au.ReZ reZ0 = TTAppOpenAdActivity.this.KM.XX();
                    if(reZ0 != null) {
                        reZ0.PjT(true);
                    }
                }
                TTAppOpenAdActivity.this.Owx();
                TTAppOpenAdActivity.this.finish();
            }

            @Override  // com.bytedance.sdk.openadsdk.component.PjT
            public void Zh(View view0) {
                TTAppOpenAdActivity.this.PjT();
            }

            @Override  // com.bytedance.sdk.openadsdk.component.PjT
            public void cr() {
                TTAppOpenAdActivity.this.finish();
            }
        };
        this.Co = new Runnable() {
            final TTAppOpenAdActivity PjT;

            @Override
            public void run() {
                if(TTAppOpenAdActivity.this.xs.get()) {
                    return;
                }
                if(TTAppOpenAdActivity.this.RD != null && TTAppOpenAdActivity.this.RD.uvo() && TTAppOpenAdActivity.this.RD.QB() != null && TTAppOpenAdActivity.this.RD.QB().PjT() != null) {
                    TTAppOpenAdActivity.this.RD.QB().PjT().PjT(0L);
                }
                XX xX0 = new XX();
                TTAppOpenAdActivity.this.qla = xX0;
                TTAppOpenAdActivity.this.qla.PjT(System.currentTimeMillis(), 1.0f);
                TTAppOpenAdActivity.this.fDm.JQp();
                if(TTAppOpenAdActivity.this.DWo != null) {
                    TTAppOpenAdActivity.this.DWo.Zh();
                }
                if(TTAppOpenAdActivity.this.KM != null) {
                    TTAppOpenAdActivity.this.KM.JQp();
                }
                TTAppOpenAdActivity.this.gK();
                View view0 = TTAppOpenAdActivity.this.findViewById(0x1020002);
                JSONObject jSONObject0 = new JSONObject();
                try {
                    if(view0 != null) {
                        jSONObject0.put("width", view0.getWidth());
                        jSONObject0.put("height", view0.getHeight());
                        jSONObject0.put("alpha", ((double)view0.getAlpha()));
                    }
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("root_view", jSONObject0.toString());
                    jSONObject1.put("ad_root", TTAppOpenAdActivity.this.cRA);
                    jSONObject1.put("openad_creative_type", (TTAppOpenAdActivity.this.gK ? "video_normal_ad" : "image_normal_ad"));
                    if(Au.ReZ() == null) {
                        jSONObject1.put("appicon_acquirefail", "1");
                    }
                    if(TTAppOpenAdActivity.this.Yo || TTAppOpenAdActivity.this.RD.pBJ()) {
                        jSONObject1.put("dynamic_show_type", TTAppOpenAdActivity.this.xE());
                        TTAppOpenAdActivity.this.PjT(jSONObject1);
                    }
                    jSONObject1.put("is_icon_only", ((int)TTAppOpenAdActivity.this.RD.Pv()));
                    com.bytedance.sdk.openadsdk.cr.ReZ.PjT(TTAppOpenAdActivity.this.RD, "open_ad", jSONObject1);
                    View view1 = TTAppOpenAdActivity.this.findViewById(0x1020002);
                    com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT jQp$PjT0 = new com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(TTAppOpenAdActivity.this.xE());
                    JQp.PjT(view1, TTAppOpenAdActivity.this.RD, jQp$PjT0);
                    com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(TTAppOpenAdActivity.this.RD);
                    TTAppOpenAdActivity.this.xs.set(true);
                    return;
                }
                catch(JSONException jSONException0) {
                }
                Log.e("TTAppOpenAdActivity", "run: ", jSONException0);
                TTAppOpenAdActivity.this.finish();
            }
        };
    }

    private void Au() {
        if(26 != Build.VERSION.SDK_INT) {
            this.yIW = this.RD.jK();
        }
        else if(this.getResources().getConfiguration().orientation == 1) {
            this.yIW = 1;
        }
        else {
            this.yIW = 2;
        }
        this.SM();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void DWo() {
        if(this.yIW != 2) {
            this.setRequestedOrientation(1);
        }
        else if(this.JQp()) {
            this.setRequestedOrientation(8);
        }
        else {
            this.setRequestedOrientation(0);
        }
        if(this.yIW == 2 || !qZS.ReZ(this)) {
            this.getWindow().addFlags(0x400);
        }
    }

    protected boolean JQp() {
        try {
            if(this.getIntent().getIntExtra("orientation_angle", 0) == 3) {
                return true;
            }
        }
        catch(Exception exception0) {
            RD.Zh("TTAppOpenAdActivity", exception0.getMessage());
        }
        return false;
    }

    private void Owx() {
        if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            this.PjT("onAdSkip");
            return;
        }
        Zh zh0 = this.tT;
        if(zh0 != null) {
            zh0.Zh();
        }
    }

    private JSONObject PjT(JSONObject jSONObject0) {
        return this.xE() == 0 ? this.KM.PjT(jSONObject0) : null;
    }

    private void PjT(String s) {
        Jo.ReZ(new com.bytedance.sdk.component.Au.Au("AppOpenAd_executeMultiProcessCallback") {
            final TTAppOpenAdActivity Zh;

            @Override
            public void run() {
                try {
                    TTAppOpenAdActivity.this.cr().executeAppOpenAdCallback(TTAppOpenAdActivity.this.Owx, s);
                }
                catch(Throwable throwable0) {
                    RD.Zh("TTAppOpenAdActivity", new Object[]{"open_ad", "executeAppOpenAdCallback execute throw Exception : ", throwable0});
                }
            }
        }, 5);
    }

    protected void PjT() {
        if(this.isFinishing()) {
            return;
        }
        if(this.cr.get()) {
            this.fDm();
            return;
        }
        if(this.qj == null) {
            try {
                this.qj();
            }
            catch(Throwable throwable0) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", throwable0);
            }
        }
        qla qla0 = this.qj;
        if(qla0 != null) {
            qla0.PjT();
        }
    }

    protected void PjT(Intent intent0) {
        if(intent0 != null) {
            this.cRA = intent0.getIntExtra("ad_source", 0);
            this.cz = intent0.getLongExtra("start_show_time", 0L);
        }
    }

    protected void PjT(Bundle bundle0) {
        if(bundle0 != null) {
            try {
                if(this.tT == null) {
                    this.tT = TTAppOpenAdActivity.Au;
                    TTAppOpenAdActivity.Au = null;
                }
                String s = bundle0.getString("material_meta");
                this.Owx = bundle0.getString("multi_process_meta_md5");
                this.cRA = bundle0.getInt("ad_source", 0);
                this.cz = bundle0.getLong("start_show_time", 0L);
                this.RD = com.bytedance.sdk.openadsdk.core.Zh.PjT(new JSONObject(s));
            }
            catch(Throwable throwable0) {
                RD.Zh("TTAppOpenAdActivity", throwable0.getMessage());
            }
        }
    }

    @Override  // com.bytedance.sdk.component.utils.KM$PjT
    public void PjT(Message message0) {
        if(message0.what == 100) {
            if(this.gK && (this.KM != null && this.KM.XX() != null)) {
                this.KM.XX().PjT(1);
            }
            this.Owx();
            this.finish();
        }
    }

    private void RD() {
        tT.ReZ(this.ltE);
        this.Owx();
        if(this.gK && (this.KM != null && this.KM.XX() != null)) {
            this.KM.XX().PjT(4);
        }
        com.bytedance.sdk.openadsdk.component.cr.PjT.PjT(this.RD, ((int)this.SM.Zh()), this.DWo.PjT(), this.SM.PjT());
        if(this.RD != null && this.RD.uvo() && this.RD.QB() != null && this.RD.QB().PjT() != null) {
            cr cr0 = this.RD.QB().PjT();
            long v = this.KM == null || this.KM.XX() == null ? 0L : this.KM.XX().xf();
            cr0.cz(v);
            cr0.JQp(v);
        }
        this.finish();
    }

    void ReZ() {
        if(this.gK) {
            if(this.KM != null && this.KM.XX() != null && this.KM.XX().cr()) {
                this.KM.XX().XX();
            }
            this.xs();
        }
        com.bytedance.sdk.openadsdk.component.cz.Zh zh0 = this.DWo;
        if(zh0 != null) {
            zh0.cr();
        }
    }

    private void SM() {
        int v2;
        int v1;
        new StringBuilder("changeScreenOrientation: mOrientation=").append(this.yIW);
        int v = Build.VERSION.SDK_INT;
        if(v != 26) {
            if(v == 27) {
                try {
                    this.DWo();
                }
                catch(Throwable throwable0) {
                    RD.Zh("TTAppOpenAdActivity", throwable0.getMessage());
                    return;
                }
            }
            else {
                this.DWo();
            }
        }
        Pair pair0 = qZS.DWo(this.getApplicationContext());
        if(this.yIW == 2) {
            v1 = Math.max(((int)(((Integer)pair0.first))), ((int)(((Integer)pair0.second))));
            v2 = Math.min(((int)(((Integer)pair0.first))), ((int)(((Integer)pair0.second))));
        }
        else {
            v1 = Math.min(((int)(((Integer)pair0.first))), ((int)(((Integer)pair0.second))));
            v2 = Math.max(((int)(((Integer)pair0.first))), ((int)(((Integer)pair0.second))));
        }
        this.xE = (float)v2;
        this.ub = (float)v1;
        float f = qZS.PjT();
        if(qZS.ReZ(this)) {
            int v3 = this.yIW;
            if(v3 == 1) {
                this.xE -= f;
            }
            else if(v3 == 2) {
                this.ub -= f;
            }
        }
        ReZ reZ0 = this.KM;
        if(reZ0 != null) {
            reZ0.PjT(this.ub, this.xE);
        }
    }

    private void XX() {
        RD.PjT("TTAppOpenAdActivity", "invoke callback onAdDismiss, " + this);
        if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            this.PjT("onAdTimeOver");
            return;
        }
        Zh zh0 = this.tT;
        if(zh0 != null) {
            zh0.ReZ();
        }
    }

    private boolean Zh(Bundle bundle0) {
        if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            Intent intent0 = this.getIntent();
            if(intent0 != null) {
                String s = intent0.getStringExtra("multi_process_materialmeta");
                if(s != null) {
                    try {
                        this.RD = com.bytedance.sdk.openadsdk.core.Zh.PjT(new JSONObject(s));
                    }
                    catch(Exception exception0) {
                        RD.Zh("TTAppOpenAdActivity", new Object[]{"open_ad", "initData MultiGlobalInfo throws ", exception0});
                    }
                }
                this.Owx = intent0.getStringExtra("multi_process_meta_md5");
            }
        }
        else {
            this.RD = Lrd.PjT().Zh();
            this.tT = Lrd.PjT().JQp();
            Lrd.PjT().cz();
        }
        this.PjT(this.getIntent());
        this.PjT(bundle0);
        Owx owx0 = this.RD;
        if(owx0 == null) {
            this.finish();
            return false;
        }
        this.Qf = owx0.ig();
        this.RD.PjT(this.cz);
        this.ltE = this.RD.joj();
        com.bytedance.sdk.openadsdk.utils.Zh.PjT(this.RD);
        return true;
    }

    void Zh() {
        if(!this.ReZ.get()) {
            if(this.gK) {
                if(this.KM != null && this.KM.XX() != null && this.KM.XX().JQp()) {
                    this.KM.XX().DWo();
                }
                this.xf();
            }
            com.bytedance.sdk.openadsdk.component.cz.Zh zh0 = this.DWo;
            if(zh0 != null) {
                zh0.ReZ();
            }
        }
    }

    protected IListenerManager cr() {
        if(this.Sks == null) {
            this.Sks = Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT().PjT(7));
        }
        return this.Sks;
    }

    private void cz() {
        Log.d("TTAppOpenAdActivity", "startCountDownTimer() called");
        int v = this.RD == null || this.RD.ReZ() < 0 ? ub.cr().Sks(String.valueOf(this.ltE)) : this.RD.ReZ();
        this.DWo.PjT(this.SM.PjT());
        this.DWo.Zh(v);
    }

    private void fDm() {
        this.xf.show(TTAdDislikeToast.getDislikeTip());
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void finish() {
        super.finish();
        this.overridePendingTransition(0, 0);
    }

    private void gK() {
        if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            this.PjT("onAdShow");
            return;
        }
        Zh zh0 = this.tT;
        if(zh0 != null) {
            zh0.PjT();
        }
    }

    private void ltE() {
        if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            this.PjT("onAdClicked");
        }
        else {
            Zh zh0 = this.tT;
            if(zh0 != null) {
                zh0.onAdClicked();
            }
        }
        if(xs.Gr().Lrd(String.valueOf(this.ltE))) {
            this.Lrd.set(true);
        }
    }

    @Override  // android.app.Activity
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        qZS.PjT(this);
        this.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            final TTAppOpenAdActivity PjT;

            @Override  // android.view.View$OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int v) {
                if(v == 0) {
                    try {
                        if(TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() {
                            final com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7 PjT;

                            @Override
                            public void run() {
                                qZS.PjT(TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    }
                    catch(Exception exception0) {
                        RD.Zh("TTAppOpenAdActivity", exception0.getMessage());
                    }
                }
            }
        });
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        if(ub.cr().RD(String.valueOf(this.ltE)) == 1) {
            int v = ub.cr().Sks(String.valueOf(this.ltE));
            if(this.SM.Zh() >= ((long)v) * 1000L) {
                this.RD();
            }
        }
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ub.Zh(this.getApplicationContext());
        if(!this.Zh(bundle0)) {
            this.finish();
            return;
        }
        if(!fDm.JQp()) {
            this.finish();
            return;
        }
        if(bundle0 != null) {
            com.bytedance.sdk.openadsdk.cr.ReZ.JQp(this.RD, "open_ad", null);
        }
        this.gK = Owx.JQp(this.RD);
        new StringBuilder("onCreate: isVideo is ").append(this.gK);
        if(this.gK) {
            c c0 = this.RD.MWx();
            this.SM.PjT(((float)c0.C()));
        }
        else {
            float f = (float)ub.cr().tT(String.valueOf(this.ltE));
            this.SM.PjT(f);
        }
        com.bytedance.sdk.openadsdk.component.cz.Zh zh0 = new com.bytedance.sdk.openadsdk.component.cz.Zh(this.SM);
        this.DWo = zh0;
        zh0.PjT(this.Jo);
        this.Au();
        FrameLayout frameLayout0 = new FrameLayout(this);
        this.iZZ = frameLayout0;
        frameLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            this.setContentView(this.iZZ);
        }
        catch(Throwable unused_ex) {
            com.bytedance.sdk.openadsdk.qla.ReZ.Zh();
            this.finish();
            return;
        }
        this.iZZ.post(new Runnable() {
            final TTAppOpenAdActivity PjT;

            @Override
            public void run() {
                try {
                    boolean z = true;
                    int v = TTAppOpenAdActivity.this.RD.ZX();
                    TTAppOpenAdActivity tTAppOpenAdActivity0 = TTAppOpenAdActivity.this;
                    if(tTAppOpenAdActivity0.RD == null || TTAppOpenAdActivity.this.RD.iZZ() != 2 || v == 1) {
                        z = false;
                    }
                    tTAppOpenAdActivity0.Yo = z;
                    if(TTAppOpenAdActivity.this.Yo) {
                        com.bytedance.sdk.openadsdk.component.Zh zh0 = new com.bytedance.sdk.openadsdk.component.Zh(TTAppOpenAdActivity.this, TTAppOpenAdActivity.this.RD, TTAppOpenAdActivity.this.iZZ, TTAppOpenAdActivity.this.Jo, TTAppOpenAdActivity.this.yIW, TTAppOpenAdActivity.this.gK, TTAppOpenAdActivity.this.SM, TTAppOpenAdActivity.this.DWo);
                        TTAppOpenAdActivity.this.KM = zh0;
                    }
                    else {
                        ReZ reZ0 = new ReZ(TTAppOpenAdActivity.this, TTAppOpenAdActivity.this.RD, TTAppOpenAdActivity.this.iZZ, TTAppOpenAdActivity.this.Jo, TTAppOpenAdActivity.this.yIW, TTAppOpenAdActivity.this.gK, TTAppOpenAdActivity.this.SM);
                        TTAppOpenAdActivity.this.KM = reZ0;
                        TTAppOpenAdActivity.this.KM.PjT(TTAppOpenAdActivity.this.ub, TTAppOpenAdActivity.this.xE);
                    }
                    TTAppOpenAdActivity.this.KM.PjT(TTAppOpenAdActivity.this.iZZ);
                    TTAppOpenAdActivity.this.KM.PjT();
                    TTAppOpenAdActivity.this.KM.Zh();
                    return;
                }
                catch(Throwable throwable0) {
                }
                TTAppOpenAdActivity.this.finish();
                RD.Zh("TTAppOpenAdActivity", throwable0.getMessage());
            }
        });
        try {
            View view0 = this.getWindow().getDecorView();
            if(Build.VERSION.SDK_INT >= 35) {
                view0.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    final TTAppOpenAdActivity Zh;

                    @Override  // android.view.View$OnApplyWindowInsetsListener
                    public WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
                        try {
                            DisplayCutout displayCutout0 = windowInsets0.getDisplayCutout();
                            if(displayCutout0 != null) {
                                List list0 = displayCutout0.getBoundingRects();
                                if(list0 != null && !list0.isEmpty()) {
                                    int v = displayCutout0.getSafeInsetLeft();
                                    int v1 = displayCutout0.getSafeInsetTop();
                                    int v2 = displayCutout0.getSafeInsetRight();
                                    int v3 = displayCutout0.getSafeInsetBottom();
                                    view0.setPadding(v, v1, v2, v3);
                                }
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        return windowInsets0;
                    }
                });
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if(this.RD != null) {
            com.bytedance.sdk.openadsdk.cz.Zh.PjT().PjT("videoForceBreak", this.RD);
        }
        this.Zh.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.cz.Zh zh0 = this.DWo;
        if(zh0 != null) {
            zh0.JQp();
        }
        JQp.PjT(this.RD);
        com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.Zh(this.RD);
        if(this.gK) {
            com.bytedance.sdk.openadsdk.component.cr.PjT.PjT(this.RD, this.SM.Zh(), this.SM.PjT(), true);
        }
        else {
            com.bytedance.sdk.openadsdk.component.cr.PjT.PjT(this.RD, -1L, this.SM.PjT(), false);
        }
        if(this.fDm.cz() && this.xs.get()) {
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(String.valueOf(this.fDm.cr()), this.RD, "open_ad", this.qla);
            this.fDm = Co.ReZ();
        }
        ReZ reZ0 = this.KM;
        if(reZ0 != null) {
            reZ0.ReZ();
        }
        if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            this.PjT("recycleRes");
        }
        this.XX();
        TTAppOpenAdActivity.Au = null;
        this.tT = null;
        qla qla0 = this.qj;
        if(qla0 != null) {
            qla0.setCallback(null);
        }
        if(xs.Gr().cRA(String.valueOf(this.ltE)) == 1 && !Owx.cz(this.RD) && !this.RD.zq()) {
            cz.PjT(ub.PjT()).PjT(this.Qf);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected void onPause() {
        super.onPause();
        this.JQp = false;
        this.ReZ();
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected void onResume() {
        super.onResume();
        this.JQp = true;
        if(this.PjT.getAndSet(true)) {
            if(this.Lrd.get()) {
                this.Owx();
                if(this.gK && (this.KM != null && this.KM.XX() != null)) {
                    this.KM.XX().PjT(3);
                }
                this.finish();
                return;
            }
            this.Zh();
        }
    }

    @Override  // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        try {
            bundle0.putString("material_meta", (this.RD == null ? null : this.RD.dDm().toString()));
            bundle0.putString("multi_process_meta_md5", this.Owx);
            bundle0.putInt("ad_source", this.cRA);
            bundle0.putLong("start_show_time", this.cz);
        }
        catch(Throwable throwable0) {
            RD.Zh("TTAppOpenAdActivity", throwable0.getMessage());
        }
        TTAppOpenAdActivity.Au = this.tT;
        super.onSaveInstanceState(bundle0);
    }

    @Override  // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.cr.PjT(this, this.RD);
    }

    @Override  // android.app.Activity
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if(z) {
            if(!this.Yo) {
                this.fDm.JQp();
            }
            if(this.RD != null && this.RD.en() && !this.RD.JDf()) {
                this.RD.XX(true);
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(this.RD, "open_ad", this.RD.zSs());
            }
        }
        else if(this.xs.get()) {
            if(this.fDm.cz()) {
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(String.valueOf(this.fDm.cr()), this.RD, "open_ad", this.qla);
            }
            this.fDm = Co.ReZ();
        }
        JQp.PjT(this.RD, (z ? 4 : 8));
        com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(this.RD, z);
    }

    private void qj() {
        if(this.qj == null) {
            qla qla0 = new qla(this, this.RD);
            this.qj = qla0;
            qla0.setDislikeSource("video_player");
            this.qj.setCallback(new com.bytedance.sdk.openadsdk.common.qla.PjT() {
                final TTAppOpenAdActivity PjT;

                @Override  // com.bytedance.sdk.openadsdk.common.qla$PjT
                public void PjT(View view0) {
                    TTAppOpenAdActivity.this.ReZ.set(true);
                    TTAppOpenAdActivity.this.ReZ();
                    com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(TTAppOpenAdActivity.this.RD, 8);
                }

                @Override  // com.bytedance.sdk.openadsdk.common.qla$PjT
                public void PjT(FilterWord filterWord0) {
                    if(!TTAppOpenAdActivity.this.cr.get() && filterWord0 != null && !filterWord0.hasSecondOptions()) {
                        TTAppOpenAdActivity.this.cr.set(true);
                        TTAppOpenAdActivity.this.qla();
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.common.qla$PjT
                public void Zh(View view0) {
                    TTAppOpenAdActivity.this.ReZ.set(false);
                    TTAppOpenAdActivity.this.Zh();
                    com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(TTAppOpenAdActivity.this.RD, 4);
                }
            });
        }
        FrameLayout frameLayout0 = (FrameLayout)this.findViewById(0x1020002);
        frameLayout0.addView(this.qj);
        if(this.xf == null) {
            TTAdDislikeToast tTAdDislikeToast0 = new TTAdDislikeToast(this);
            this.xf = tTAdDislikeToast0;
            frameLayout0.addView(tTAdDislikeToast0);
        }
    }

    private void qla() {
        this.xf.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private void ub() {
        if(this.xs.get()) {
            return;
        }
        try {
            this.getWindow().getDecorView().post(this.Co);
        }
        catch(Throwable unused_ex) {
            this.finish();
        }
    }

    private int xE() {
        if(this.RD.pBJ()) {
            return 5;
        }
        return this.Yo ? this.KM.cr() : -1;
    }

    private void xf() {
        if(this.gK && !this.RD.Pv() && !this.ZX) {
            this.Zh.sendEmptyMessageDelayed(100, 5000L);
        }
    }

    private void xs() {
        if(this.gK && !this.RD.Pv()) {
            this.Zh.removeMessages(100);
        }
    }
}

