package com.dcinside.app.wv;

import android.content.Context;
import android.util.Base64;
import java.io.InputStream;
import java.net.URLEncoder;
import kotlin.jvm.internal.L;
import kotlin.text.f;
import kotlin.text.v;
import y4.l;
import z3.n;

public final class h {
    @l
    public static final h a;

    static {
        h.a = new h();
    }

    @l
    @n
    public static final String a(@l Context context0) {
        L.p(context0, "context");
        InputStream inputStream0 = context0.getAssets().open("callback_message.js");
        L.o(inputStream0, "open(...)");
        byte[] arr_b = new byte[inputStream0.available()];
        inputStream0.read(arr_b);
        inputStream0.close();
        String s = URLEncoder.encode(new String(arr_b, f.b), "UTF-8");
        L.o(s, "encode(...)");
        byte[] arr_b1 = v.l2(s, "+", "%20", false, 4, null).getBytes(f.b);
        L.o(arr_b1, "getBytes(...)");
        String s1 = Base64.encodeToString(arr_b1, 2);
        L.o(s1, "encodeToString(...)");
        return v.p(("\n            javascript:(function() {\n            var parent = document.getElementsByTagName(\'head\').item(0);\n            var script = document.createElement(\'script\');\n            script.type = \'text/javascript\';\n            script.innerHTML = decodeURIComponent(window.atob(\"" + s1 + "\"));\n            parent.appendChild(script);\n            })()\n            "));
    }
}

