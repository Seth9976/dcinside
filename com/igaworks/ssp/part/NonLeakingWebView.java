package com.igaworks.ssp.part;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import java.lang.reflect.Field;

public class NonLeakingWebView extends WebView {
    private static Field a;

    static {
        try {
            Field field0 = Class.forName("android.webkit.BrowserFrame").getDeclaredField("sConfigCallback");
            NonLeakingWebView.a = field0;
            field0.setAccessible(true);
        }
        catch(Exception unused_ex) {
        }
    }

    public NonLeakingWebView(Context context0) {
        super(context0.getApplicationContext());
    }

    public NonLeakingWebView(Context context0, AttributeSet attributeSet0) {
        super(context0.getApplicationContext(), attributeSet0);
    }

    public NonLeakingWebView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0.getApplicationContext(), attributeSet0, v);
    }

    @Override  // android.webkit.WebView
    public void destroy() {
        super.destroy();
        try {
            Field field0 = NonLeakingWebView.a;
            if(field0 != null) {
                field0.set(null, null);
            }
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }
}

