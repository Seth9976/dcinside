package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.j;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

public final class d extends HttpsURLConnection {
    private final g a;
    private final HttpsURLConnection b;

    d(HttpsURLConnection httpsURLConnection0, Timer timer0, j j0) {
        super(httpsURLConnection0.getURL());
        this.b = httpsURLConnection0;
        this.a = new g(httpsURLConnection0, timer0, j0);
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

    @Override  // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.b.getCipherSuite();
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

    @Override  // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.b.getHostnameVerifier();
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

    @Override  // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.b.getLocalCertificates();
    }

    @Override  // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.b.getLocalPrincipal();
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return this.a.C();
    }

    @Override  // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.b.getPeerPrincipal();
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

    @Override  // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.b.getSSLSocketFactory();
    }

    @Override  // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.b.getServerCertificates();
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

    @Override  // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier0) {
        this.b.setHostnameVerifier(hostnameVerifier0);
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

    @Override  // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory0) {
        this.b.setSSLSocketFactory(sSLSocketFactory0);
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

