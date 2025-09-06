package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.e;
import com.google.android.datatransport.runtime.h;
import j..util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class a implements h {
    @NonNull
    private final String a;
    @Nullable
    private final String b;
    static final String c = "cct";
    static final String d = null;
    static final String e = null;
    private static final String f = null;
    private static final String g = "1$";
    private static final String h = "\\";
    private static final Set i;
    public static final a j;
    public static final a k;

    // 去混淆评级： 低(25)
    static {
        a.d = "https://firebaselogging.googleapis.com/v0cc/log/batch?format=json_proto3";
        a.e = "https://firebaselogging-pa.googleapis.com/v1/firelog/legacy/batchlog";
        a.f = "AIzaSyCckkiH8i2ZARwOs1LEzFKld15aOG8ozKo";
        a.i = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new e[]{e.b("proto"), e.b("json")})));
        a.j = new a("https://firebaselogging.googleapis.com/v0cc/log/batch?format=json_proto3", null);
        a.k = new a("https://firebaselogging-pa.googleapis.com/v1/firelog/legacy/batchlog", "AIzaSyCckkiH8i2ZARwOs1LEzFKld15aOG8ozKo");
    }

    public a(@NonNull String s, @Nullable String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // com.google.android.datatransport.runtime.h
    public Set a() {
        return a.i;
    }

    @Nullable
    public byte[] b() {
        String s = this.b;
        if(s == null && this.a == null) {
            return null;
        }
        String s1 = this.a;
        if(s == null) {
            s = "";
        }
        return String.format("%s%s%s%s", "1$", s1, "\\", s).getBytes(Charset.forName("UTF-8"));
    }

    @NonNull
    static String c(@NonNull byte[] arr_b) {
        return new String(arr_b, Charset.forName("UTF-8"));
    }

    @NonNull
    static byte[] d(@NonNull String s) {
        return s.getBytes(Charset.forName("UTF-8"));
    }

    @NonNull
    public static a e(@NonNull byte[] arr_b) {
        String s = new String(arr_b, Charset.forName("UTF-8"));
        if(!s.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] arr_s = s.substring(2).split("\\Q\\\\E", 2);
        if(arr_s.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String s1 = arr_s[0];
        if(s1.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String s2 = arr_s[1];
        if(s2.isEmpty()) {
            s2 = null;
        }
        return new a(s1, s2);
    }

    @Nullable
    public String f() {
        return this.b;
    }

    @NonNull
    public String g() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.runtime.g
    @Nullable
    public byte[] getExtras() {
        return this.b();
    }

    @Override  // com.google.android.datatransport.runtime.g
    @NonNull
    public String getName() {
        return "cct";
    }
}

