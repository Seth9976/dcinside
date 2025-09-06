package com.bytedance.sdk.openadsdk.core.widget.PjT;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver.OnWindowFocusChangeListener;
import android.webkit.WebBackForwardList;
import android.webkit.WebView.HitTestResult;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import com.bytedance.sdk.component.utils.KM.PjT;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class cz implements PjT {
    public interface com.bytedance.sdk.openadsdk.core.widget.PjT.cz.PjT {
        void PjT();
    }

    boolean Au;
    int DWo;
    int JQp;
    private final String KM;
    com.bytedance.sdk.openadsdk.core.widget.PjT.cz.PjT Lrd;
    Map Owx;
    Context PjT;
    private long Qf;
    Map RD;
    String ReZ;
    String SM;
    Map Sks;
    boolean XX;
    private final String Yo;
    private boolean ZX;
    Owx Zh;
    GestureDetector cRA;
    WebView cr;
    int cz;
    float fDm;
    boolean gK;
    private final boolean iZZ;
    long ltE;
    float qj;
    float qla;
    List tT;
    boolean ub;
    long xE;
    float xf;
    float xs;
    private final Handler yIW;

    public cz(WebView webView0, Owx owx0, Context context0, boolean z) {
        this.yIW = new KM(fDm.Zh().getLooper(), this);
        this.ReZ = "landingpage";
        this.cz = 0;
        this.Yo = ".*\\/serp\\?sc=.*&clkt=\\d+$";
        this.KM = ".*\\/\\?caf_results=.*&clkt=\\d+$";
        this.Lrd = new com.bytedance.sdk.openadsdk.core.widget.PjT.cz.PjT() {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.cz$PjT
            public void PjT() {
                cz.this.Au = true;
                cz.this.cz();
                cz.this.PjT(2, cz.this.SM, cz.this.DWo);
            }
        };
        this.cRA = new GestureDetector(ub.PjT(), new GestureDetector.SimpleOnGestureListener() {
            final cz PjT;

            @Override  // android.view.GestureDetector$SimpleOnGestureListener
            public boolean onFling(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
                cz.this.ub = true;
                return false;
            }
        });
        this.Zh = owx0;
        this.cr = webView0;
        this.PjT = context0;
        this.JQp = ub.cr().Nv();
        this.Owx = new HashMap();
        this.RD = new HashMap();
        this.Sks = new HashMap();
        this.tT = new ArrayList();
        this.iZZ = z;
    }

    private void Au() {
        WebBackForwardList webBackForwardList0 = this.cr.copyBackForwardList();
        if(webBackForwardList0 != null) {
            int v = webBackForwardList0.getCurrentIndex();
            this.DWo = v + 1;
            if(this.iZZ) {
                this.DWo = v + 2;
            }
        }
    }

    private boolean JQp() {
        try {
            if((this.DWo == 2 || this.DWo == 3) && (Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.SM) || Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.SM))) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("WebArbitrageBehavior", throwable0.toString());
        }
        return false;
    }

    private void PjT(int v, String s, int v1) {
        if(this.XX()) {
            return;
        }
        long v2 = SystemClock.elapsedRealtime();
        Long long0 = (Long)this.Owx.get(v1);
        Float float0 = (Float)this.RD.get(v1);
        com.bytedance.sdk.openadsdk.qla.PjT.PjT pjT0 = new com.bytedance.sdk.openadsdk.qla.PjT.PjT.PjT().PjT(s).PjT(v1).Au(((float)(v2 - (long0 == null ? v2 : ((long)long0))))).SM((float0 == null ? 0.0f : ((float)float0))).Zh(v).PjT();
        ReZ.ReZ(this.Zh, pjT0, this.ReZ);
    }

    public void PjT() {
        this.Zh(this.DWo);
    }

    public void PjT(int v) {
        int v1 = qZS.Zh(this.PjT, ((float)this.cr.getContentHeight()));
        float f = ((float)(v + this.cr.getHeight())) / ((float)v1);
        Float float0 = (Float)this.RD.get(this.DWo);
        if(f > (float0 == null ? 0.0f : ((float)float0))) {
            this.RD.put(this.DWo, f);
        }
    }

    @Override  // com.bytedance.sdk.component.utils.KM$PjT
    public void PjT(Message message0) {
        int v = message0.what;
        com.bytedance.sdk.openadsdk.qla.PjT.PjT pjT0 = (com.bytedance.sdk.openadsdk.qla.PjT.PjT)message0.obj;
        int v1 = 1;
        if(v == 100) {
            if(this.ub) {
                v1 = 2;
            }
            pjT0.cr(v1);
            ReZ.cr(this.Zh, pjT0, this.ReZ);
            this.ub = false;
            return;
        }
        if(v == 200) {
            if(this.gK) {
                this.PjT(1, pjT0.ReZ(), pjT0.cr());
            }
            pjT0.ReZ(((int)this.gK));
            ReZ.JQp(this.Zh, pjT0, this.ReZ);
            this.XX = false;
            this.gK = false;
        }
    }

    public void PjT(MotionEvent motionEvent0) {
        this.cRA.onTouchEvent(motionEvent0);
        switch(motionEvent0.getAction()) {
            case 0: {
                this.qj = motionEvent0.getX();
                this.xf = motionEvent0.getY();
                this.xE = SystemClock.elapsedRealtime();
                return;
            }
            case 1: {
                this.ltE = SystemClock.elapsedRealtime() - this.xE;
                if(this.Zh(motionEvent0)) {
                    this.cr();
                    return;
                }
                this.ReZ(1);
                return;
            }
            case 3: {
                this.ReZ(2);
            }
        }
    }

    public void PjT(String s) {
        this.ReZ = s;
    }

    private void ReZ(int v) {
        if(this.XX()) {
            return;
        }
        this.cz();
        this.XX = true;
        com.bytedance.sdk.openadsdk.qla.PjT.PjT pjT0 = new com.bytedance.sdk.openadsdk.qla.PjT.PjT.PjT().PjT(this.SM).PjT(this.DWo).PjT(this.qj).Zh(this.xf).ReZ(((float)this.ltE)).ReZ(v).PjT();
        if(this.ZX) {
            try {
                WebView.HitTestResult webView$HitTestResult0 = this.cr.getHitTestResult();
                pjT0.PjT(webView$HitTestResult0.getExtra());
                pjT0.PjT(webView$HitTestResult0.getType());
            }
            catch(Throwable unused_ex) {
            }
        }
        Message message0 = Message.obtain();
        message0.what = 200;
        message0.obj = pjT0;
        this.yIW.sendMessageDelayed(message0, 100L);
    }

    public com.bytedance.sdk.openadsdk.core.widget.PjT.cz.PjT ReZ() {
        return this.Lrd;
    }

    public void ReZ(String s) {
        if(this.XX) {
            this.gK = true;
        }
        if(this.DWo == 1 && !TextUtils.isEmpty(s) && s.contains("query=")) {
            int v = s.indexOf("query=");
            int v1 = s.indexOf("&", v + 6);
            if(v + 6 >= 0 && v1 < s.length() && v1 > v + 6) {
                this.cr(s.substring(v + 6, v1));
            }
        }
    }

    private boolean XX() {
        int v = this.cz + 1;
        this.cz = v;
        return v <= this.JQp ? !"landingpage".equals(this.ReZ) && !"landingpage_endcard".equals(this.ReZ) && !"landingpage_split_screen".equals(this.ReZ) && !"landingpage_direct".equals(this.ReZ) && !"landingpage_split_ceiling".equals(this.ReZ) : true;
    }

    private void Zh(int v) {
        if(this.XX()) {
            return;
        }
        if(this.tT.contains(v)) {
            return;
        }
        this.tT.add(v);
        long v1 = SystemClock.elapsedRealtime();
        Long long0 = (Long)this.Sks.get(v);
        com.bytedance.sdk.openadsdk.qla.PjT.PjT pjT0 = new com.bytedance.sdk.openadsdk.qla.PjT.PjT.PjT().PjT(this.SM).PjT(this.DWo).DWo(((float)(v1 - (long0 == null ? v1 : ((long)long0))))).PjT();
        ReZ.Zh(this.Zh, pjT0, this.ReZ);
    }

    private boolean Zh(MotionEvent motionEvent0) {
        this.xs = motionEvent0.getX();
        float f = motionEvent0.getY();
        this.fDm = f;
        float f1 = this.xf;
        if(f - f1 != 0.0f) {
            this.qla = f - f1;
            return true;
        }
        return false;
    }

    public void Zh() {
        com.bytedance.sdk.openadsdk.core.widget.PjT.cz.3 cz$30 = new ViewTreeObserver.OnWindowFocusChangeListener() {
            final cz PjT;

            @Override  // android.view.ViewTreeObserver$OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z) {
                if(!z) {
                    cz cz0 = cz.this;
                    if(!cz0.Au) {
                        cz0.cz();
                        long v = SystemClock.elapsedRealtime();
                        if(v - cz.this.Qf >= 50L) {
                            cz.this.PjT(3, cz.this.SM, cz.this.DWo);
                            cz.this.Qf = v;
                        }
                        return;
                    }
                    cz0.Au = false;
                }
                if(z) {
                    cz.this.Au();
                    cz.this.Owx.put(cz.this.DWo, SystemClock.elapsedRealtime());
                }
            }
        };
        this.cr.getViewTreeObserver().addOnWindowFocusChangeListener(cz$30);
    }

    public void Zh(String s) {
        this.SM = s;
        this.Au();
        this.Owx.put(this.DWo, SystemClock.elapsedRealtime());
        this.Sks.put(this.DWo, SystemClock.elapsedRealtime());
        this.ZX = this.JQp();
    }

    private void cr() {
        if(this.XX()) {
            return;
        }
        com.bytedance.sdk.openadsdk.qla.PjT.PjT pjT0 = new com.bytedance.sdk.openadsdk.qla.PjT.PjT.PjT().PjT(this.SM).PjT(this.DWo).cr(this.qj).JQp(this.xf).cz(this.qla).XX(((float)this.ltE)).PjT();
        Message message0 = Message.obtain();
        message0.what = 100;
        message0.obj = pjT0;
        this.yIW.sendMessageDelayed(message0, 20L);
    }

    private void cr(String s) {
        if(this.XX()) {
            return;
        }
        String s1 = Uri.decode(s);
        com.bytedance.sdk.openadsdk.qla.PjT.PjT pjT0 = new com.bytedance.sdk.openadsdk.qla.PjT.PjT.PjT().PjT(this.SM).Zh(s1).PjT();
        ReZ.PjT(this.Zh, pjT0, this.ReZ);
    }

    @MainThread
    private void cz() {
        if(this.RD.get(this.DWo) != null) {
            return;
        }
        int v = qZS.Zh(this.PjT, ((float)this.cr.getContentHeight()));
        float f = ((float)this.cr.getHeight()) / ((float)v);
        if(f < 0.0f || f > 1.0f) {
            f = 0.0f;
        }
        this.RD.put(this.DWo, f);
    }
}

