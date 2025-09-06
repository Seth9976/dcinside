package com.google.firebase.perf.network;

import android.os.Build.VERSION;
import com.google.firebase.perf.logging.a;
import com.google.firebase.perf.metrics.j;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

class g {
    private final HttpURLConnection a;
    private final j b;
    private long c;
    private long d;
    private final Timer e;
    private static final a f = null;
    private static final String g = "User-Agent";

    static {
        g.f = a.e();
    }

    public g(HttpURLConnection httpURLConnection0, Timer timer0, j j0) {
        this.c = -1L;
        this.d = -1L;
        this.a = httpURLConnection0;
        this.b = j0;
        this.e = timer0;
        j0.E(httpURLConnection0.getURL().toString());
    }

    public boolean A() {
        return this.a.getInstanceFollowRedirects();
    }

    public long B() {
        this.a0();
        return this.a.getLastModified();
    }

    public OutputStream C() throws IOException {
        try {
            OutputStream outputStream0 = this.a.getOutputStream();
            return outputStream0 != null ? new b(outputStream0, this.b, this.e) : null;
        }
        catch(IOException iOException0) {
            long v = this.e.d();
            this.b.C(v);
            com.google.firebase.perf.network.j.d(this.b);
            throw iOException0;
        }
    }

    public Permission D() throws IOException {
        try {
            return this.a.getPermission();
        }
        catch(IOException iOException0) {
            long v = this.e.d();
            this.b.C(v);
            com.google.firebase.perf.network.j.d(this.b);
            throw iOException0;
        }
    }

    public int E() {
        return this.a.getReadTimeout();
    }

    public String F() {
        return this.a.getRequestMethod();
    }

    public Map G() {
        return this.a.getRequestProperties();
    }

    public String H(String s) {
        return this.a.getRequestProperty(s);
    }

    public int I() throws IOException {
        this.a0();
        if(this.d == -1L) {
            long v = this.e.d();
            this.d = v;
            this.b.D(v);
        }
        try {
            int v1 = this.a.getResponseCode();
            this.b.t(v1);
            return v1;
        }
        catch(IOException iOException0) {
            long v2 = this.e.d();
            this.b.C(v2);
            com.google.firebase.perf.network.j.d(this.b);
            throw iOException0;
        }
    }

    public String J() throws IOException {
        this.a0();
        if(this.d == -1L) {
            long v = this.e.d();
            this.d = v;
            this.b.D(v);
        }
        try {
            String s = this.a.getResponseMessage();
            int v1 = this.a.getResponseCode();
            this.b.t(v1);
            return s;
        }
        catch(IOException iOException0) {
            long v2 = this.e.d();
            this.b.C(v2);
            com.google.firebase.perf.network.j.d(this.b);
            throw iOException0;
        }
    }

    public URL K() {
        return this.a.getURL();
    }

    public boolean L() {
        return this.a.getUseCaches();
    }

    public void M(boolean z) {
        this.a.setAllowUserInteraction(z);
    }

    public void N(int v) {
        this.a.setChunkedStreamingMode(v);
    }

    public void O(int v) {
        this.a.setConnectTimeout(v);
    }

    public void P(boolean z) {
        this.a.setDefaultUseCaches(z);
    }

    public void Q(boolean z) {
        this.a.setDoInput(z);
    }

    public void R(boolean z) {
        this.a.setDoOutput(z);
    }

    public void S(int v) {
        this.a.setFixedLengthStreamingMode(v);
    }

    public void T(long v) {
        this.a.setFixedLengthStreamingMode(v);
    }

    public void U(long v) {
        this.a.setIfModifiedSince(v);
    }

    public void V(boolean z) {
        this.a.setInstanceFollowRedirects(z);
    }

    public void W(int v) {
        this.a.setReadTimeout(v);
    }

    public void X(String s) throws ProtocolException {
        this.a.setRequestMethod(s);
    }

    public void Y(String s, String s1) {
        if("User-Agent".equalsIgnoreCase(s)) {
            this.b.F(s1);
        }
        this.a.setRequestProperty(s, s1);
    }

    public void Z(boolean z) {
        this.a.setUseCaches(z);
    }

    public void a(String s, String s1) {
        this.a.addRequestProperty(s, s1);
    }

    private void a0() {
        if(this.c == -1L) {
            this.e.h();
            long v = this.e.f();
            this.c = v;
            this.b.y(v);
        }
        String s = this.F();
        if(s != null) {
            this.b.s(s);
            return;
        }
        if(this.o()) {
            this.b.s("POST");
            return;
        }
        this.b.s("GET");
    }

    public void b() throws IOException {
        if(this.c == -1L) {
            this.e.h();
            long v = this.e.f();
            this.c = v;
            this.b.y(v);
        }
        try {
            this.a.connect();
        }
        catch(IOException iOException0) {
            long v1 = this.e.d();
            this.b.C(v1);
            com.google.firebase.perf.network.j.d(this.b);
            throw iOException0;
        }
    }

    public boolean b0() {
        return this.a.usingProxy();
    }

    public void c() {
        long v = this.e.d();
        this.b.C(v);
        this.b.c();
        this.a.disconnect();
    }

    public boolean d() {
        return this.a.getAllowUserInteraction();
    }

    public int e() {
        return this.a.getConnectTimeout();
    }

    @Override
    public boolean equals(Object object0) {
        return this.a.equals(object0);
    }

    public Object f() throws IOException {
        com.google.firebase.perf.network.a a0;
        this.a0();
        int v = this.a.getResponseCode();
        this.b.t(v);
        try {
            a0 = this.a.getContent();
        }
        catch(IOException iOException0) {
            long v1 = this.e.d();
            this.b.C(v1);
            com.google.firebase.perf.network.j.d(this.b);
            throw iOException0;
        }
        if(a0 instanceof InputStream) {
            String s = this.a.getContentType();
            this.b.z(s);
            return new com.google.firebase.perf.network.a(a0, this.b, this.e);
        }
        String s1 = this.a.getContentType();
        this.b.z(s1);
        long v2 = (long)this.a.getContentLength();
        this.b.A(v2);
        long v3 = this.e.d();
        this.b.C(v3);
        this.b.c();
        return a0;
    }

    public Object g(Class[] arr_class) throws IOException {
        com.google.firebase.perf.network.a a0;
        this.a0();
        int v = this.a.getResponseCode();
        this.b.t(v);
        try {
            a0 = this.a.getContent(arr_class);
        }
        catch(IOException iOException0) {
            long v1 = this.e.d();
            this.b.C(v1);
            com.google.firebase.perf.network.j.d(this.b);
            throw iOException0;
        }
        if(a0 instanceof InputStream) {
            String s = this.a.getContentType();
            this.b.z(s);
            return new com.google.firebase.perf.network.a(a0, this.b, this.e);
        }
        String s1 = this.a.getContentType();
        this.b.z(s1);
        long v2 = (long)this.a.getContentLength();
        this.b.A(v2);
        long v3 = this.e.d();
        this.b.C(v3);
        this.b.c();
        return a0;
    }

    public String h() {
        this.a0();
        return this.a.getContentEncoding();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public int i() {
        this.a0();
        return this.a.getContentLength();
    }

    public long j() {
        this.a0();
        return Build.VERSION.SDK_INT < 24 ? 0L : this.a.getContentLengthLong();
    }

    public String k() {
        this.a0();
        return this.a.getContentType();
    }

    public long l() {
        this.a0();
        return this.a.getDate();
    }

    public boolean m() {
        return this.a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.a.getDoInput();
    }

    public boolean o() {
        return this.a.getDoOutput();
    }

    public InputStream p() {
        this.a0();
        try {
            int v = this.a.getResponseCode();
            this.b.t(v);
        }
        catch(IOException unused_ex) {
            g.f.a("IOException thrown trying to obtain the response code");
        }
        InputStream inputStream0 = this.a.getErrorStream();
        return inputStream0 != null ? new com.google.firebase.perf.network.a(inputStream0, this.b, this.e) : null;
    }

    public long q() {
        this.a0();
        return this.a.getExpiration();
    }

    public String r(int v) {
        this.a0();
        return this.a.getHeaderField(v);
    }

    public String s(String s) {
        this.a0();
        return this.a.getHeaderField(s);
    }

    public long t(String s, long v) {
        this.a0();
        return this.a.getHeaderFieldDate(s, v);
    }

    @Override
    public String toString() {
        return this.a.toString();
    }

    public int u(String s, int v) {
        this.a0();
        return this.a.getHeaderFieldInt(s, v);
    }

    public String v(int v) {
        this.a0();
        return this.a.getHeaderFieldKey(v);
    }

    public long w(String s, long v) {
        this.a0();
        return Build.VERSION.SDK_INT < 24 ? 0L : this.a.getHeaderFieldLong(s, v);
    }

    public Map x() {
        this.a0();
        return this.a.getHeaderFields();
    }

    public long y() {
        return this.a.getIfModifiedSince();
    }

    public InputStream z() throws IOException {
        this.a0();
        int v = this.a.getResponseCode();
        this.b.t(v);
        String s = this.a.getContentType();
        this.b.z(s);
        try {
            InputStream inputStream0 = this.a.getInputStream();
            return inputStream0 != null ? new com.google.firebase.perf.network.a(inputStream0, this.b, this.e) : null;
        }
        catch(IOException iOException0) {
            long v1 = this.e.d();
            this.b.C(v1);
            com.google.firebase.perf.network.j.d(this.b);
            throw iOException0;
        }
    }
}

