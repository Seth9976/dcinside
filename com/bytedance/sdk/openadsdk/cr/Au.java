package com.bytedance.sdk.openadsdk.cr;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.SM.Zh;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Au {
    private final WebView Au;
    private long DWo;
    private final boolean JQp;
    private final Owx PjT;
    private final List ReZ;
    private String SM;
    private int XX;
    private final Map Zh;
    private final Map cr;
    private int cz;

    public Au(Owx owx0, WebView webView0, boolean z) {
        this.SM = "landingpage";
        this.Zh = new HashMap();
        this.ReZ = new ArrayList();
        this.cr = new HashMap();
        this.PjT = owx0;
        this.Au = webView0;
        this.JQp = z;
    }

    private boolean PjT(boolean z) {
        int v = z ? this.cz : this.XX;
        this.Zh(z);
        int v1 = z ? this.cz : this.XX;
        return v1 > 0 && v1 != v;
    }

    public void PjT(WebView webView0, String s) {
        if(this.PjT != null && Zh.PjT(this.PjT.qla().ReZ(), s)) {
            String s1 = (String)this.cr.get(this.cz);
            if(TextUtils.isEmpty(s1)) {
                s1 = "";
            }
            ReZ.PjT(this.PjT, this.SM, this.cz, s1, s, 2);
        }
    }

    public void PjT(String s) {
        if(this.PjT(false)) {
            long v = SystemClock.elapsedRealtime();
            ReZ.PjT(this.PjT, this.SM, this.cz, s, ((float)(v - this.DWo)));
        }
    }

    public void PjT(String s, int v) {
        if(this.JQp) {
            ++v;
        }
        if(this.PjT(true)) {
            ReZ.PjT(this.PjT, this.SM, this.cz, s, v);
            this.cr.put(this.cz, s);
            this.DWo = SystemClock.elapsedRealtime();
        }
    }

    public void ReZ(String s) {
        this.SM = s;
    }

    private void Zh(boolean z) {
        try {
            WebBackForwardList webBackForwardList0 = this.Au.copyBackForwardList();
            if(webBackForwardList0 != null) {
                if(z) {
                    int v = webBackForwardList0.getCurrentIndex();
                    this.cz = v + 1;
                    if(this.JQp) {
                        this.cz = v + 2;
                        return;
                    }
                }
                else {
                    int v1 = webBackForwardList0.getCurrentIndex();
                    this.XX = v1 + 1;
                    if(this.JQp) {
                        this.XX = v1 + 2;
                    }
                }
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("ArbitrageLandingLog", throwable0.toString());
    }

    public void Zh(String s) {
        String s1 = (String)this.cr.get(this.cz);
        if(TextUtils.isEmpty(s1)) {
            s1 = "";
        }
        int v = this.cz;
        if(v > 0) {
            ReZ.PjT(this.PjT, this.SM, v, s1, s, 1);
        }
    }
}

