package com.bytedance.sdk.component.adexpress.JQp;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.PjT.cRA;
import java.lang.ref.WeakReference;

public class cr {
    private WeakReference PjT;

    public cr(cRA cRA0) {
        this.PjT = new WeakReference(cRA0);
    }

    public void PjT(cRA cRA0) {
        this.PjT = new WeakReference(cRA0);
    }

    @JavascriptInterface
    public void invokeMethod(String s) {
        if(this.PjT != null && this.PjT.get() != null) {
            ((cRA)this.PjT.get()).invokeMethod(s);
        }
    }
}

