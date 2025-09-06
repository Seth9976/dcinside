package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.v1.s;
import java.util.ArrayList;
import java.util.List;

public abstract class e {
    @NonNull
    private static List a(@NonNull s s0, @NonNull Context context0) {
        List list0 = new ArrayList();
        if(s0.t9()) {
            list0.add(new d(s0.y9()));
        }
        if(s0.s7()) {
            list0.add(new c(s0.s2(), context0));
        }
        if(s0.n5()) {
            list0.add(new a(s0.W1()));
        }
        if(s0.e6()) {
            list0.add(new b(s0.e5()));
        }
        return list0;
    }

    public static boolean b(@NonNull s s0, @NonNull Context context0) {
        List list0 = e.a(s0, context0);
        if(list0.isEmpty()) {
            com.google.firebase.perf.logging.a.e().a("No validators found for PerfMetric.");
            return false;
        }
        for(Object object0: list0) {
            if(!((e)object0).c()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public abstract boolean c();

    public static void d(@NonNull String s, @NonNull String s1) {
        if(s == null || s.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        }
        if(s1 == null || s1.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        if(s.length() > 40) {
            throw new IllegalArgumentException("Attribute key length must not exceed 40 characters");
        }
        if(s1.length() > 100) {
            throw new IllegalArgumentException("Attribute value length must not exceed 100 characters");
        }
        if(!s.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    @Nullable
    public static String e(@Nullable String s) {
        if(s == null) {
            return "Metric name must not be null";
        }
        if(s.length() > 100) {
            return "Metric name must not exceed 100 characters";
        }
        if(s.startsWith("_")) {
            com.google.firebase.perf.util.b.a[] arr_b$a = com.google.firebase.perf.util.b.a.values();
            for(int v = 0; v < arr_b$a.length; ++v) {
                if(arr_b$a[v].toString().equals(s)) {
                    return null;
                }
            }
            return "Metric name must not start with \'_\'";
        }
        return null;
    }

    @Nullable
    public static String f(@Nullable String s) {
        if(s == null) {
            return "Trace name must not be null";
        }
        if(s.length() > 100) {
            return "Trace name must not exceed 100 characters";
        }
        if(s.startsWith("_")) {
            com.google.firebase.perf.util.b.b[] arr_b$b = com.google.firebase.perf.util.b.b.values();
            for(int v = 0; v < arr_b$b.length; ++v) {
                if(arr_b$b[v].toString().equals(s)) {
                    return null;
                }
            }
            return s.startsWith("_st_") ? null : "Trace name must not start with \'_\'";
        }
        return null;
    }
}

