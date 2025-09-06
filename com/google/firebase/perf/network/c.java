package com.google.firebase.perf.network;

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

public final class c extends HttpURLConnection {
    private final g a;

    c(HttpURLConnection httpURLConnection0, Timer timer0, j j0) {
        super(httpURLConnection0.getURL());
        this.a = new g(httpURLConnection0, timer0, j0);
    }

    @Override
    public void addRequestProperty(String s, String s1) {
        this.a.a(s, s1);
    }

    @Override
    public void connect() throws IOException {
        this.a.b();
    }

    @Override
    public void disconnect() {
        this.a.c();
    }

    @Override
    public boolean equals(Object object0) {
        return this.a.equals(object0);
    }

    @Override
    public boolean getAllowUserInteraction() {
        return this.a.d();
    }

    @Override
    public int getConnectTimeout() {
        return this.a.e();
    }

    @Override
    public Object getContent() throws IOException {
        return this.a.f();
    }

    @Override
    public Object getContent(Class[] arr_class) throws IOException {
        return this.a.g(arr_class);
    }

    @Override
    public String getContentEncoding() {
        return this.a.h();
    }

    @Override
    public int getContentLength() {
        return this.a.i();
    }

    @Override
    public long getContentLengthLong() {
        return this.a.j();
    }

    @Override
    public String getContentType() {
        return this.a.k();
    }

    @Override
    public long getDate() {
        return this.a.l();
    }

    @Override
    public boolean getDefaultUseCaches() {
        return this.a.m();
    }

    @Override
    public boolean getDoInput() {
        return this.a.n();
    }

    @Override
    public boolean getDoOutput() {
        return this.a.o();
    }

    @Override
    public InputStream getErrorStream() {
        return this.a.p();
    }

    @Override
    public long getExpiration() {
        return this.a.q();
    }

    @Override
    public String getHeaderField(int v) {
        return this.a.r(v);
    }

    @Override
    public String getHeaderField(String s) {
        return this.a.s(s);
    }

    @Override
    public long getHeaderFieldDate(String s, long v) {
        return this.a.t(s, v);
    }

    @Override
    public int getHeaderFieldInt(String s, int v) {
        return this.a.u(s, v);
    }

    @Override
    public String getHeaderFieldKey(int v) {
        return this.a.v(v);
    }

    @Override
    public long getHeaderFieldLong(String s, long v) {
        return this.a.w(s, v);
    }

    @Override
    public Map getHeaderFields() {
        return this.a.x();
    }

    @Override
    public long getIfModifiedSince() {
        return this.a.y();
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return this.a.z();
    }

    @Override
    public boolean getInstanceFollowRedirects() {
        return this.a.A();
    }

    @Override
    public long getLastModified() {
        return this.a.B();
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return this.a.C();
    }

    @Override
    public Permission getPermission() throws IOException {
        return this.a.D();
    }

    @Override
    public int getReadTimeout() {
        return this.a.E();
    }

    @Override
    public String getRequestMethod() {
        return this.a.F();
    }

    @Override
    public Map getRequestProperties() {
        return this.a.G();
    }

    @Override
    public String getRequestProperty(String s) {
        return this.a.H(s);
    }

    @Override
    public int getResponseCode() throws IOException {
        return this.a.I();
    }

    @Override
    public String getResponseMessage() throws IOException {
        return this.a.J();
    }

    @Override
    public URL getURL() {
        return this.a.K();
    }

    @Override
    public boolean getUseCaches() {
        return this.a.L();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public void setAllowUserInteraction(boolean z) {
        this.a.M(z);
    }

    @Override
    public void setChunkedStreamingMode(int v) {
        this.a.N(v);
    }

    @Override
    public void setConnectTimeout(int v) {
        this.a.O(v);
    }

    @Override
    public void setDefaultUseCaches(boolean z) {
        this.a.P(z);
    }

    @Override
    public void setDoInput(boolean z) {
        this.a.Q(z);
    }

    @Override
    public void setDoOutput(boolean z) {
        this.a.R(z);
    }

    @Override
    public void setFixedLengthStreamingMode(int v) {
        this.a.S(v);
    }

    @Override
    public void setFixedLengthStreamingMode(long v) {
        this.a.T(v);
    }

    @Override
    public void setIfModifiedSince(long v) {
        this.a.U(v);
    }

    @Override
    public void setInstanceFollowRedirects(boolean z) {
        this.a.V(z);
    }

    @Override
    public void setReadTimeout(int v) {
        this.a.W(v);
    }

    @Override
    public void setRequestMethod(String s) throws ProtocolException {
        this.a.X(s);
    }

    @Override
    public void setRequestProperty(String s, String s1) {
        this.a.Y(s, s1);
    }

    @Override
    public void setUseCaches(boolean z) {
        this.a.Z(z);
    }

    @Override
    public String toString() {
        return this.a.toString();
    }

    @Override
    public boolean usingProxy() {
        return this.a.b0();
    }
}

