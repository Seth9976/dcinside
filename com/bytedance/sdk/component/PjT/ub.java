package com.bytedance.sdk.component.PjT;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ub {
    private final List JQp;
    static Sks PjT;
    private final WebView ReZ;
    private final PjT Zh;
    private final DWo cr;
    private volatile boolean cz;

    ub(DWo dWo0) {
        ArrayList arrayList0 = new ArrayList();
        this.JQp = arrayList0;
        this.cz = false;
        this.cr = dWo0;
        if(dWo0.Au && ub.PjT != null) {
            throw null;
        }
        if(dWo0.PjT == null) {
            this.Zh = dWo0.Zh;
        }
        else {
            PjT pjT0 = dWo0.Zh;
            this.Zh = pjT0 == null ? new cRA() : pjT0;
        }
        this.Zh.PjT(dWo0, null);
        this.ReZ = dWo0.PjT;
        arrayList0.add(dWo0.DWo);
        Lrd.PjT(dWo0.XX);
    }

    public static DWo PjT(WebView webView0) {
        return new DWo(webView0);
    }

    public ub PjT(String s, JQp jQp0) {
        return this.PjT(s, null, jQp0);
    }

    public ub PjT(String s, Zh cr$Zh0) {
        return this.PjT(s, null, cr$Zh0);
    }

    public ub PjT(String s, String s1, JQp jQp0) {
        this.Zh();
        this.Zh.XX.PjT(s, jQp0);
        return this;
    }

    public ub PjT(String s, String s1, Zh cr$Zh0) {
        this.Zh();
        this.Zh.XX.PjT(s, cr$Zh0);
        return this;
    }

    public void PjT() {
        if(this.cz) {
            return;
        }
        this.Zh.Zh();
        this.cz = true;
        Iterator iterator0 = this.JQp.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
    }

    private void Zh() {
        if(this.cz) {
            SM.PjT(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }
}

