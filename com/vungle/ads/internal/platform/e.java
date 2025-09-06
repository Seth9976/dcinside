package com.vungle.ads.internal.platform;

import android.content.Context;
import android.util.AndroidRuntimeException;
import android.webkit.WebSettings;
import androidx.core.util.Consumer;
import com.vungle.ads.internal.util.p;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class e {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final a Companion;
    private static final String TAG;
    @l
    private final Context context;

    static {
        e.Companion = new a(null);
        e.TAG = "e";
    }

    public e(@l Context context0) {
        L.p(context0, "context");
        super();
        this.context = context0;
    }

    public final void getUserAgent(@l Consumer consumer0) {
        L.p(consumer0, "consumer");
        try {
            consumer0.accept(WebSettings.getDefaultUserAgent(this.context));
        }
        catch(Exception exception0) {
            if(exception0 instanceof AndroidRuntimeException) {
                L.o("e", "TAG");
                p.Companion.e("e", "WebView could be missing here");
            }
            consumer0.accept(null);
        }
    }
}

