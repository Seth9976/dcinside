package com.google.firebase.perf.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.logging.a;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

public final class j {
    private static final Pattern a;

    static {
        j.a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");
    }

    public static Long a(@NonNull HttpMessage httpMessage0) {
        try {
            Header header0 = httpMessage0.getFirstHeader("content-length");
            if(header0 != null) {
                return Long.parseLong(header0.getValue());
            }
        }
        catch(NumberFormatException unused_ex) {
            a.e().a("The content-length value is not a valid number");
        }
        return null;
    }

    public static String b(@NonNull HttpResponse httpResponse0) {
        Header header0 = httpResponse0.getFirstHeader("content-type");
        if(header0 != null) {
            String s = header0.getValue();
            return s == null ? null : s;
        }
        return null;
    }

    public static boolean c(@Nullable String s) {
        return s == null || !j.a.matcher(s).matches();
    }

    public static void d(com.google.firebase.perf.metrics.j j0) {
        if(!j0.i()) {
            j0.v();
        }
        j0.c();
    }
}

