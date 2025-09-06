package com.gomfactory.adpie.sdk.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class TLSSocketFactory extends SSLSocketFactory {
    private SSLSocketFactory internalSSLSocketFactory;

    public TLSSocketFactory() throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext sSLContext0 = SSLContext.getInstance("TLS");
        sSLContext0.init(null, null, null);
        this.internalSSLSocketFactory = sSLContext0.getSocketFactory();
    }

    @Override  // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return this.enableTLSOnSocket(this.internalSSLSocketFactory.createSocket());
    }

    @Override  // javax.net.SocketFactory
    public Socket createSocket(String s, int v) throws IOException, UnknownHostException {
        return this.enableTLSOnSocket(this.internalSSLSocketFactory.createSocket(s, v));
    }

    @Override  // javax.net.SocketFactory
    public Socket createSocket(String s, int v, InetAddress inetAddress0, int v1) throws IOException, UnknownHostException {
        return this.enableTLSOnSocket(this.internalSSLSocketFactory.createSocket(s, v, inetAddress0, v1));
    }

    @Override  // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress0, int v) throws IOException {
        return this.enableTLSOnSocket(this.internalSSLSocketFactory.createSocket(inetAddress0, v));
    }

    @Override  // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress0, int v, InetAddress inetAddress1, int v1) throws IOException {
        return this.enableTLSOnSocket(this.internalSSLSocketFactory.createSocket(inetAddress0, v, inetAddress1, v1));
    }

    @Override  // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket0, String s, int v, boolean z) throws IOException {
        return this.enableTLSOnSocket(this.internalSSLSocketFactory.createSocket(socket0, s, v, z));
    }

    private Socket enableTLSOnSocket(Socket socket0) {
        if(socket0 != null && socket0 instanceof SSLSocket) {
            ((SSLSocket)socket0).setEnabledProtocols(new String[]{"TLSv1.1", "TLSv1.2"});
        }
        return socket0;
    }

    @Override  // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.internalSSLSocketFactory.getDefaultCipherSuites();
    }

    @Override  // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.internalSSLSocketFactory.getSupportedCipherSuites();
    }
}

