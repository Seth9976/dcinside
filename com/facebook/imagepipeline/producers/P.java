package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.j;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.request.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import k1.n.a;
import k1.n;

@n(a.a)
public class p extends N {
    public static final String c = "DataFetchProducer";

    public p(j j0) {
        super(com.facebook.common.executors.a.a(), j0);
    }

    @Override  // com.facebook.imagepipeline.producers.N
    protected l d(d d0) throws IOException {
        byte[] arr_b = p.g(d0.z().toString());
        return this.c(new ByteArrayInputStream(arr_b), arr_b.length);
    }

    @Override  // com.facebook.imagepipeline.producers.N
    protected String f() {
        return "DataFetchProducer";
    }

    @VisibleForTesting
    static byte[] g(String s) {
        com.facebook.common.internal.n.d(Boolean.valueOf(s.substring(0, 5).equals("data:")));
        int v = s.indexOf(44);
        String s1 = s.substring(v + 1, s.length());
        if(p.h(s.substring(0, v))) {
            return Base64.decode(s1, 0);
        }
        String s2 = Uri.decode(s1);
        com.facebook.common.internal.n.i(s2);
        return s2.getBytes();
    }

    @VisibleForTesting
    static boolean h(String s) {
        if(!s.contains(";")) {
            return false;
        }
        String[] arr_s = s.split(";");
        return arr_s[arr_s.length - 1].equals("base64");
    }
}

