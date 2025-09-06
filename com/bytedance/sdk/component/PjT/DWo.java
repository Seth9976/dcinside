package com.bytedance.sdk.component.PjT;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Set;

public class DWo {
    boolean Au;
    fDm DWo;
    Context JQp;
    WebView PjT;
    String ReZ;
    xs SM;
    boolean XX;
    PjT Zh;
    Au cr;
    boolean cz;
    boolean fDm;
    String qj;
    boolean qla;
    com.bytedance.sdk.component.PjT.qj.PjT xE;
    final Set xf;
    final Set xs;

    DWo() {
        this.ReZ = "IESJSBridge";
        this.qj = "host";
        this.xf = new LinkedHashSet();
        this.xs = new LinkedHashSet();
    }

    DWo(WebView webView0) {
        this.ReZ = "IESJSBridge";
        this.qj = "host";
        this.xf = new LinkedHashSet();
        this.xs = new LinkedHashSet();
        this.PjT = webView0;
    }

    public DWo PjT() {
        this.qla = true;
        return this;
    }

    public DWo PjT(PjT pjT0) {
        this.Zh = pjT0;
        return this;
    }

    public DWo PjT(xf xf0) {
        this.cr = Au.PjT(xf0);
        return this;
    }

    public DWo PjT(String s) {
        this.ReZ = s;
        return this;
    }

    public DWo PjT(boolean z) {
        this.cz = z;
        return this;
    }

    private void ReZ() {
        if(this.PjT == null && !this.fDm && this.Zh == null || TextUtils.isEmpty(this.ReZ) && this.PjT != null || this.cr == null) {
            throw new IllegalArgumentException("Requested arguments aren\'t set properly when building JsBridge.");
        }
    }

    public DWo Zh(boolean z) {
        this.XX = z;
        return this;
    }

    public ub Zh() {
        this.ReZ();
        return new ub(this);
    }
}

