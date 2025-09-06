package com.dcinside.app.wv;

import android.app.Dialog;
import android.content.DialogInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.appcompat.app.AlertDialog.Builder;
import java.lang.ref.WeakReference;

public class q extends WebChromeClient {
    private WeakReference a;

    // 检测为 Lambda 实现
    private static void d(JsResult jsResult0, DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    private static void e(JsResult jsResult0, DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    private static void f(JsResult jsResult0, DialogInterface dialogInterface0, int v) [...]

    @Override  // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView0, String s, String s1, JsResult jsResult0) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 != null) {
            Dialog dialog0 = (Dialog)weakReference0.get();
            if(dialog0 != null) {
                dialog0.dismiss();
            }
        }
        this.a = new WeakReference(new Builder(webView0.getContext()).F(0x7F15009B).l(s1).setPositiveButton(0x104000A, (DialogInterface dialogInterface0, int v) -> jsResult0.confirm()).b(false).I());
        return true;
    }

    @Override  // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView0, String s, String s1, JsResult jsResult0) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 != null) {
            Dialog dialog0 = (Dialog)weakReference0.get();
            if(dialog0 != null) {
                dialog0.dismiss();
            }
        }
        this.a = new WeakReference(new Builder(webView0.getContext()).F(0x7F15009B).l(s1).setPositiveButton(0x104000A, (DialogInterface dialogInterface0, int v) -> jsResult0.confirm()).setNegativeButton(0x1040000, (DialogInterface dialogInterface0, int v) -> jsResult0.cancel()).b(false).I());
        return true;
    }
}

