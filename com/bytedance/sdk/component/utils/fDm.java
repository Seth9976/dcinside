package com.bytedance.sdk.component.utils;

import android.annotation.TargetApi;
import android.webkit.WebView;

public class fDm {
    static class PjT {
        private PjT() {
        }

        PjT(com.bytedance.sdk.component.utils.fDm.1 fDm$10) {
        }

        public void PjT(WebView webView0, String s) {
            if(webView0 == null) {
                return;
            }
            try {
                webView0.loadUrl(s);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    @TargetApi(19)
    static class Zh extends PjT {
        private Zh() {
            super(null);
        }

        Zh(com.bytedance.sdk.component.utils.fDm.1 fDm$10) {
        }

        @Override  // com.bytedance.sdk.component.utils.fDm$PjT
        public void PjT(WebView webView0, String s) {
            if(webView0 == null) {
                return;
            }
            if(s != null && s.startsWith("javascript:")) {
                try {
                    webView0.evaluateJavascript(s, null);
                    return;
                }
                catch(Throwable unused_ex) {
                }
            }
            try {
                webView0.loadUrl(s);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private static final PjT PjT;

    static {
        fDm.PjT = new Zh(null);
    }

    public static void PjT(WebView webView0, String s) {
        fDm.PjT.PjT(webView0, s);
    }

    class com.bytedance.sdk.component.utils.fDm.1 {
    }

}

