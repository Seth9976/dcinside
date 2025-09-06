package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

public final class e {
    public static WebMessage a(String s, WebMessagePort[] arr_webMessagePort) {
        return new WebMessage(s, arr_webMessagePort);
    }
}

