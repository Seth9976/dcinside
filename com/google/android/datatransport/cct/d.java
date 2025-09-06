package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.cct.internal.o;
import com.google.android.datatransport.cct.internal.p;
import com.google.android.datatransport.cct.internal.q;
import com.google.android.datatransport.cct.internal.r;
import com.google.android.datatransport.cct.internal.s;
import com.google.android.datatransport.cct.internal.t;
import com.google.android.datatransport.cct.internal.u;
import com.google.android.datatransport.cct.internal.v;
import com.google.android.datatransport.cct.internal.w;
import com.google.android.datatransport.cct.internal.x;
import com.google.android.datatransport.e;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.h;
import com.google.android.datatransport.runtime.backends.n;
import com.google.android.datatransport.runtime.i;
import com.google.android.datatransport.runtime.j;
import com.google.firebase.encoders.c;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

final class d implements n {
    static final class a {
        final URL a;
        final com.google.android.datatransport.cct.internal.n b;
        @Nullable
        final String c;

        a(URL uRL0, com.google.android.datatransport.cct.internal.n n0, @Nullable String s) {
            this.a = uRL0;
            this.b = n0;
            this.c = s;
        }

        a a(URL uRL0) {
            return new a(uRL0, this.b, this.c);
        }
    }

    static final class b {
        final int a;
        @Nullable
        final URL b;
        final long c;

        b(int v, @Nullable URL uRL0, long v1) {
            this.a = v;
            this.b = uRL0;
            this.c = v1;
        }
    }

    private static final String A = "fingerprint";
    private static final String B = "locale";
    private static final String C = "country";
    private static final String D = "mcc_mnc";
    private static final String E = "tz-offset";
    private static final String F = "application_build";
    private final com.google.firebase.encoders.a a;
    private final ConnectivityManager b;
    private final Context c;
    final URL d;
    private final com.google.android.datatransport.runtime.time.a e;
    private final com.google.android.datatransport.runtime.time.a f;
    private final int g;
    private static final String h = "CctTransportBackend";
    private static final int i = 30000;
    private static final int j = 130000;
    private static final int k = -1;
    private static final String l = "Accept-Encoding";
    private static final String m = "Content-Encoding";
    private static final String n = "gzip";
    private static final String o = "Content-Type";
    static final String p = "X-Goog-Api-Key";
    private static final String q = "application/json";
    @VisibleForTesting
    static final String r = "net-type";
    @VisibleForTesting
    static final String s = "mobile-subtype";
    private static final String t = "sdk-version";
    private static final String u = "model";
    private static final String v = "hardware";
    private static final String w = "device";
    private static final String x = "product";
    private static final String y = "os-uild";
    private static final String z = "manufacturer";

    d(Context context0, com.google.android.datatransport.runtime.time.a a0, com.google.android.datatransport.runtime.time.a a1) {
        this(context0, a0, a1, 130000);
    }

    d(Context context0, com.google.android.datatransport.runtime.time.a a0, com.google.android.datatransport.runtime.time.a a1, int v) {
        this.a = com.google.android.datatransport.cct.internal.n.b();
        this.c = context0;
        this.b = (ConnectivityManager)context0.getSystemService("connectivity");
        this.d = d.o("https://firebaselogging.googleapis.com/v0cc/log/batch?format=json_proto3");
        this.e = a1;
        this.f = a0;
        this.g = v;
    }

    @Override  // com.google.android.datatransport.runtime.backends.n
    public j a(j j0) {
        NetworkInfo networkInfo0 = this.b.getActiveNetworkInfo();
        return j0.r().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", d.l()).a("net-type", d.h(networkInfo0)).a("mobile-subtype", d.g(networkInfo0)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", d.f(this.c)).c("application_build", Integer.toString(d.i(this.c))).d();
    }

    @Override  // com.google.android.datatransport.runtime.backends.n
    public h b(g g0) {
        com.google.android.datatransport.cct.internal.n n0 = this.j(g0);
        URL uRL0 = this.d;
        String s = null;
        if(g0.d() != null) {
            try {
                com.google.android.datatransport.cct.a a0 = com.google.android.datatransport.cct.a.e(g0.d());
                if(a0.f() != null) {
                    s = a0.f();
                }
                if(a0.g() != null) {
                    uRL0 = d.o(a0.g());
                }
            }
            catch(IllegalArgumentException unused_ex) {
                return h.a();
            }
        }
        try {
            b d$b0 = (b)A1.b.a(5, new a(uRL0, n0, s), (a d$a0) -> {
                z1.a.h("CctTransportBackend", "Making request to: %s", d$a0.a);
                HttpURLConnection httpURLConnection0 = (HttpURLConnection)d$a0.a.openConnection();
                httpURLConnection0.setConnectTimeout(30000);
                httpURLConnection0.setReadTimeout(this.g);
                httpURLConnection0.setDoOutput(true);
                httpURLConnection0.setInstanceFollowRedirects(false);
                httpURLConnection0.setRequestMethod("POST");
                httpURLConnection0.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
                httpURLConnection0.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection0.setRequestProperty("Content-Type", "application/json");
                httpURLConnection0.setRequestProperty("Accept-Encoding", "gzip");
                String s = d$a0.c;
                if(s != null) {
                    httpURLConnection0.setRequestProperty("X-Goog-Api-Key", s);
                }
                try(OutputStream outputStream0 = httpURLConnection0.getOutputStream(); GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(outputStream0)) {
                    BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream0));
                    this.a.a(d$a0.b, bufferedWriter0);
                }
                catch(ConnectException | UnknownHostException connectException0) {
                    z1.a.f("CctTransportBackend", "Couldn\'t open connection, returning with 500", connectException0);
                    return new b(500, null, 0L);
                }
                catch(c | IOException c0) {
                    z1.a.f("CctTransportBackend", "Couldn\'t encode request, returning with 400", c0);
                    return new b(400, null, 0L);
                }
                int v = httpURLConnection0.getResponseCode();
                z1.a.h("CctTransportBackend", "Status Code: %d", v);
                z1.a.c("CctTransportBackend", "Content-Type: %s", httpURLConnection0.getHeaderField("Content-Type"));
                z1.a.c("CctTransportBackend", "Content-Encoding: %s", httpURLConnection0.getHeaderField("Content-Encoding"));
                switch(v) {
                    case 200: {
                        try(InputStream inputStream0 = httpURLConnection0.getInputStream(); InputStream inputStream1 = d.n(inputStream0, httpURLConnection0.getHeaderField("Content-Encoding"))) {
                            return new b(200, null, v.b(new BufferedReader(new InputStreamReader(inputStream1))).c());
                        }
                    }
                    case 301: 
                    case 302: 
                    case 307: {
                        return new b(v, new URL(httpURLConnection0.getHeaderField("Location")), 0L);
                    }
                    default: {
                        return new b(v, null, 0L);
                    }
                }
            }, (a d$a0, b d$b0) -> {
                URL uRL0 = d$b0.b;
                if(uRL0 != null) {
                    z1.a.c("CctTransportBackend", "Following redirect to: %s", uRL0);
                    return d$a0.a(d$b0.b);
                }
                return null;
            });
            int v = d$b0.a;
            if(v == 200) {
                return h.e(d$b0.c);
            }
            if(v < 500) {
                switch(v) {
                    case 400: {
                        return h.d();
                    }
                    case 404: {
                        break;
                    }
                    default: {
                        return h.a();
                    }
                }
            }
            return h.f();
        }
        catch(IOException iOException0) {
        }
        z1.a.f("CctTransportBackend", "Could not make request to the backend", iOException0);
        return h.f();
    }

    // 检测为 Lambda 实现
    private b e(a d$a0) throws IOException [...]

    private static String f(Context context0) {
        String s = d.k(context0).getSimOperator();
        return s == null ? "" : s;
    }

    private static int g(NetworkInfo networkInfo0) {
        if(networkInfo0 == null) {
            return com.google.android.datatransport.cct.internal.w.b.b.b();
        }
        int v = networkInfo0.getSubtype();
        if(v == -1) {
            return com.google.android.datatransport.cct.internal.w.b.v.b();
        }
        return com.google.android.datatransport.cct.internal.w.b.a(v) == null ? 0 : v;
    }

    private static int h(NetworkInfo networkInfo0) {
        return networkInfo0 == null ? com.google.android.datatransport.cct.internal.w.c.t.b() : networkInfo0.getType();
    }

    private static int i(Context context0) {
        try {
            return context0.getPackageManager().getPackageInfo("com.dcinside.app.android", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            z1.a.f("CctTransportBackend", "Unable to find version code for package", packageManager$NameNotFoundException0);
            return -1;
        }
    }

    private com.google.android.datatransport.cct.internal.n j(g g0) {
        com.google.android.datatransport.cct.internal.t.a t$a0;
        HashMap hashMap0 = new HashMap();
        for(Object object0: g0.c()) {
            j j0 = (j)object0;
            String s = j0.p();
            if(hashMap0.containsKey(s)) {
                ((List)hashMap0.get(s)).add(j0);
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(j0);
                hashMap0.put(s, arrayList0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            j j1 = (j)((List)map$Entry0.getValue()).get(0);
            com.google.android.datatransport.cct.internal.u.a u$a0 = u.a().f(x.b).g(this.f.J()).h(this.e.J()).b(o.a().c(com.google.android.datatransport.cct.internal.o.b.c).b(com.google.android.datatransport.cct.internal.a.a().m(j1.i("sdk-version")).j(j1.b("model")).f(j1.b("hardware")).d(j1.b("device")).l(j1.b("product")).k(j1.b("os-uild")).h(j1.b("manufacturer")).e(j1.b("fingerprint")).c(j1.b("country")).g(j1.b("locale")).i(j1.b("mcc_mnc")).b(j1.b("application_build")).a()).a());
            try {
                u$a0.i(Integer.parseInt(((String)map$Entry0.getKey())));
            }
            catch(NumberFormatException unused_ex) {
                u$a0.j(((String)map$Entry0.getKey()));
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object2: ((List)map$Entry0.getValue())) {
                j j2 = (j)object2;
                i i0 = j2.e();
                e e0 = i0.b();
                if(e0.equals(e.b("proto"))) {
                    t$a0 = t.l(i0.a());
                }
                else if(e0.equals(e.b("json"))) {
                    t$a0 = t.k(new String(i0.a(), Charset.forName("UTF-8")));
                }
                else {
                    goto label_49;
                }
                t$a0.d(j2.f()).e(j2.q()).j(j2.j("tz-offset")).g(w.a().c(com.google.android.datatransport.cct.internal.w.c.a(j2.i("net-type"))).b(com.google.android.datatransport.cct.internal.w.b.a(j2.i("mobile-subtype"))).a());
                if(j2.d() != null) {
                    t$a0.c(j2.d());
                }
                if(j2.n() != null) {
                    t$a0.b(p.a().b(s.a().b(r.a().b(j2.n()).a()).a()).c(com.google.android.datatransport.cct.internal.p.b.c).a());
                }
                if(j2.g() != null || j2.h() != null) {
                    com.google.android.datatransport.cct.internal.q.a q$a0 = q.a();
                    if(j2.g() != null) {
                        q$a0.b(j2.g());
                    }
                    if(j2.h() != null) {
                        q$a0.c(j2.h());
                    }
                    t$a0.f(q$a0.a());
                }
                arrayList2.add(t$a0.a());
                continue;
            label_49:
                z1.a.i("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", e0);
            }
            u$a0.c(arrayList2);
            arrayList1.add(u$a0.a());
        }
        return com.google.android.datatransport.cct.internal.n.a(arrayList1);
    }

    private static TelephonyManager k(Context context0) {
        return (TelephonyManager)context0.getSystemService("phone");
    }

    @VisibleForTesting
    static long l() {
        Calendar.getInstance();
        return (long)(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    // 检测为 Lambda 实现
    private static a m(a d$a0, b d$b0) [...]

    private static InputStream n(InputStream inputStream0, String s) throws IOException {
        return "gzip".equals(s) ? new GZIPInputStream(inputStream0) : inputStream0;
    }

    private static URL o(String s) {
        try {
            return new URL(s);
        }
        catch(MalformedURLException malformedURLException0) {
            throw new IllegalArgumentException("Invalid url: " + s, malformedURLException0);
        }
    }
}

