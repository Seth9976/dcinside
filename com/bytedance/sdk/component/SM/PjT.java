package com.bytedance.sdk.component.SM;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.component.utils.Qf;
import com.bytedance.sdk.component.utils.SM;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class PjT extends ReZ implements com.bytedance.sdk.component.utils.KM.PjT {
    public interface com.bytedance.sdk.component.SM.PjT.PjT {
        void PjT();

        void PjT(int arg1);
    }

    private volatile float Au;
    private float DWo;
    private final int JQp;
    private View.OnTouchListener Owx;
    com.bytedance.sdk.component.SM.PjT.PjT PjT;
    private int RD;
    private final int ReZ;
    private float SM;
    private volatile float XX;
    private final int Zh;
    private final List cr;
    private final Context cz;
    private final List fDm;
    private float gK;
    private String ltE;
    private long qj;
    private final Handler qla;
    private float ub;
    private boolean xE;
    private long xf;
    private int xs;

    public PjT(Context context0, int v, int v1, List list0, int v2) {
        this.SM = -1.0f;
        this.DWo = -1.0f;
        this.qla = new KM(SM.PjT().getLooper(), this);
        this.PjT = new com.bytedance.sdk.component.SM.PjT.PjT() {
            final PjT PjT;

            @Override  // com.bytedance.sdk.component.SM.PjT$PjT
            public void PjT() {
                if(PjT.this.SM == -1.0f && PjT.this.DWo == -1.0f && PjT.this.xf == -1L) {
                    PjT.this.SM = PjT.this.XX;
                    PjT.this.DWo = PjT.this.Au;
                    PjT.this.xf = PjT.this.qj;
                    PjT.this.xE = true;
                }
            }

            @Override  // com.bytedance.sdk.component.SM.PjT$PjT
            public void PjT(int v) {
                PjT.this.xs = v;
                PjT.this.Zh();
            }
        };
        this.RD = -1;
        this.cz = context0;
        this.fDm = new ArrayList();
        this.Zh = v == -1 ? Qf.PjT(context0) : Qf.PjT(context0, ((float)v));
        this.ReZ = Qf.PjT(context0, ((float)v1));
        this.cr = list0;
        this.JQp = v2;
    }

    private int PjT(float f, float f1, long v) {
        if(this.SM == -1.0f && this.DWo == -1.0f && this.xf == -1L) {
            return 1;
        }
        if(!this.cr.contains(this.xs)) {
            return 2;
        }
        if(v - this.xf > ((long)this.JQp)) {
            this.Zh();
            return 3;
        }
        if(Math.abs(f - this.SM) <= ((float)this.Zh) / 2.0f && Math.abs(f1 - this.DWo) <= ((float)this.ReZ) / 2.0f) {
            return 0;
        }
        this.Zh();
        return 4;
    }

    private void PjT(View view0, MotionEvent motionEvent0, int v, boolean z) {
        JSONObject jSONObject0 = new JSONObject();
        WebView webView0 = view0 instanceof WebView ? ((WebView)view0) : null;
        try {
            jSONObject0.put("arbi_current_url", (webView0 == null ? "" : webView0.getUrl()));
            jSONObject0.put("click_x", ((double)motionEvent0.getX()));
            jSONObject0.put("click_y", ((double)motionEvent0.getY()));
            jSONObject0.put("is_interceptor", (v == 0 ? 1 : 0));
            jSONObject0.put("is_first_click", ((int)z));
            jSONObject0.put("click_timestamp", System.currentTimeMillis());
            jSONObject0.put("arbi_interceptor_type", v);
            jSONObject0.put("current_url_index", this.xs);
        }
        catch(Throwable unused_ex) {
        }
        Message message0 = Message.obtain();
        message0.what = 100;
        message0.obj = jSONObject0;
        this.qla.sendMessageDelayed(message0, 200L);
    }

    public com.bytedance.sdk.component.SM.PjT.PjT PjT() {
        return this.PjT;
    }

    @Override  // com.bytedance.sdk.component.utils.KM$PjT
    public void PjT(Message message0) {
        int v = message0.what;
        Object object0 = message0.obj;
        JSONObject jSONObject0 = new JSONObject();
        if(v == 100) {
            if(object0 instanceof JSONObject) {
                jSONObject0 = (JSONObject)object0;
                try {
                    jSONObject0.put("is_trigger_jump", ((int)this.xE));
                    this.xE = false;
                }
                catch(Throwable unused_ex) {
                }
            }
            if(com.bytedance.sdk.component.SM.PjT.PjT.PjT().Zh() != null) {
                com.bytedance.sdk.component.SM.PjT.PjT.PjT().Zh().PjT(this.ltE, "arbitrage_click_event", jSONObject0);
            }
        }
    }

    @Override  // com.bytedance.sdk.component.SM.ReZ
    public void PjT(View.OnTouchListener view$OnTouchListener0) {
        this.Owx = view$OnTouchListener0;
    }

    public void PjT(String s) {
        this.ltE = s;
    }

    private void Zh() {
        this.SM = -1.0f;
        this.DWo = -1.0f;
        this.xf = -1L;
    }

    @Override  // android.view.View$OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        motionEvent0.getX();
        motionEvent0.getY();
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        this.qj = SystemClock.elapsedRealtime();
        this.XX = f;
        this.Au = f1;
        switch(v) {
            case 0: {
                this.ub = f;
                this.gK = f1;
                return this.Owx == null ? false : this.Owx.onTouch(view0, motionEvent0);
            }
            case 1: {
                if(this.PjT(f, f1, this.ub, this.gK, this.cz)) {
                    int v1 = this.PjT(this.XX, this.Au, this.qj);
                    boolean z = this.fDm.contains(this.xs);
                    this.PjT(view0, motionEvent0, v1, !z);
                    if(!z) {
                        this.fDm.add(this.xs);
                    }
                    if(v1 == 0) {
                        motionEvent0.setAction(3);
                        return this.Owx == null ? false : this.Owx.onTouch(view0, motionEvent0);
                    }
                }
                return this.Owx == null ? false : this.Owx.onTouch(view0, motionEvent0);
            }
            default: {
                return this.Owx == null ? false : this.Owx.onTouch(view0, motionEvent0);
            }
        }
    }
}

