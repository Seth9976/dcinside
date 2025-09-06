package com.unity3d.services.core.request;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.unity3d.services.core.log.DeviceLog;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class WebRequest {
    public static enum RequestType {
        POST,
        GET,
        HEAD;

        private static RequestType[] $values() [...] // Inlined contents
    }

    private ByteArrayOutputStream _baos;
    private byte[] _body;
    private boolean _canceled;
    private int _connectTimeout;
    private long _contentLength;
    private Map _headers;
    private IWebRequestProgressListener _progressListener;
    private int _readTimeout;
    private String _requestType;
    private int _responseCode;
    private Map _responseHeaders;
    private URL _url;

    public WebRequest(String s, String s1) throws MalformedURLException {
        this(s, s1, null);
    }

    public WebRequest(String s, String s1, Map map0) throws MalformedURLException {
        this(s, s1, map0, 30000, 30000);
    }

    public WebRequest(String s, String s1, Map map0, int v, int v1) throws MalformedURLException {
        this._responseCode = -1;
        this._contentLength = -1L;
        this._canceled = false;
        this._url = new URL(s);
        this._requestType = s1;
        this._headers = map0;
        this._connectTimeout = v;
        this._readTimeout = v1;
    }

    public void cancel() {
        this._canceled = true;
    }

    public byte[] getBody() {
        return this._body;
    }

    public int getConnectTimeout() {
        return this._connectTimeout;
    }

    public long getContentLength() {
        return this._contentLength;
    }

    public Map getHeaders() {
        return this._headers;
    }

    private HttpURLConnection getHttpUrlConnectionWithHeaders() throws NetworkIOException, IllegalArgumentException {
        HttpURLConnection httpURLConnection0;
        if(this.getUrl().toString().startsWith("https://")) {
            try {
                httpURLConnection0 = (HttpsURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(this.getUrl().openConnection())));
            }
            catch(IOException iOException0) {
                throw new NetworkIOException("Open HTTPS connection: " + iOException0.getMessage());
            }
        }
        else {
            if(!this.getUrl().toString().startsWith("http://")) {
                throw new IllegalArgumentException("Invalid url-protocol in url: " + this.getUrl().toString());
            }
            try {
                httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(this.getUrl().openConnection())));
            }
            catch(IOException iOException1) {
                throw new NetworkIOException("Open HTTP connection: " + iOException1.getMessage());
            }
        }
        httpURLConnection0.setInstanceFollowRedirects(false);
        httpURLConnection0.setConnectTimeout(this.getConnectTimeout());
        httpURLConnection0.setReadTimeout(this.getReadTimeout());
        try {
            httpURLConnection0.setRequestMethod(this.getRequestType());
        }
        catch(ProtocolException protocolException0) {
            throw new NetworkIOException("Set Request Method: " + this.getRequestType() + ", " + protocolException0.getMessage());
        }
        if(this.getHeaders() != null && this.getHeaders().size() > 0) {
            for(Object object0: this.getHeaders().keySet()) {
                String s = (String)object0;
                for(Object object1: ((List)this.getHeaders().get(s))) {
                    DeviceLog.debug(("Setting header: " + s + "=" + ((String)object1)));
                    httpURLConnection0.setRequestProperty(s, ((String)object1));
                }
            }
        }
        return httpURLConnection0;
    }

    public String getQuery() {
        return this._url == null ? null : this._url.getQuery();
    }

    public int getReadTimeout() {
        return this._readTimeout;
    }

    public String getRequestType() {
        return this._requestType;
    }

    public int getResponseCode() {
        return this._responseCode;
    }

    public Map getResponseHeaders() {
        return this._responseHeaders;
    }

    public URL getUrl() {
        return this._url;
    }

    public boolean isCanceled() {
        return this._canceled;
    }

    public String makeRequest() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        this._baos = byteArrayOutputStream0;
        this.makeStreamRequest(byteArrayOutputStream0);
        return this._baos.toString("UTF-8");
    }

    public long makeStreamRequest(OutputStream outputStream0) throws Exception {
        InputStream inputStream0;
        Throwable throwable1;
        HttpURLConnection httpURLConnection0 = this.getHttpUrlConnectionWithHeaders();
        httpURLConnection0.setDoInput(true);
        if(this.getRequestType().equals("POST")) {
            httpURLConnection0.setDoOutput(true);
            OutputStream outputStream1 = null;
            try {
                try {
                    outputStream1 = httpURLConnection0.getOutputStream();
                    if(this.getBody() == null) {
                        String s = this.getQuery();
                        if(s != null) {
                            outputStream1.write(s.getBytes(StandardCharsets.UTF_8));
                        }
                    }
                    else {
                        outputStream1.write(this.getBody());
                    }
                    outputStream1.flush();
                    goto label_26;
                }
                catch(IOException iOException0) {
                }
                DeviceLog.exception("Error while writing POST params", iOException0);
                throw new NetworkIOException("Error writing POST params: " + iOException0.getMessage());
            }
            catch(Throwable throwable0) {
                throwable1 = throwable0;
            }
            if(outputStream1 != null) {
                try {
                    outputStream1.close();
                }
                catch(IOException iOException1) {
                    DeviceLog.exception("Error closing writer", iOException1);
                }
            }
            throw throwable1;
            try {
            label_26:
                outputStream1.close();
            }
            catch(IOException iOException2) {
                DeviceLog.exception("Error closing writer", iOException2);
            }
        }
        try {
            this._responseCode = httpURLConnection0.getResponseCode();
        }
        catch(IOException | RuntimeException iOException3) {
            throw new NetworkIOException("Response code: " + iOException3.getMessage());
        }
        long v = (long)httpURLConnection0.getContentLength();
        this._contentLength = v;
        if(v == -1L) {
            this._contentLength = (long)httpURLConnection0.getHeaderFieldInt("X-OrigLength", -1);
        }
        long v1 = 0L;
        OutputStream outputStream2 = outputStream0;
        if(this._baos != null && this._baos == outputStream2 && this._contentLength > 0L) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(((int)this._contentLength));
            this._baos = byteArrayOutputStream0;
            outputStream2 = byteArrayOutputStream0;
        }
        if(httpURLConnection0.getHeaderFields() != null) {
            this._responseHeaders = httpURLConnection0.getHeaderFields();
        }
        try {
            inputStream0 = httpURLConnection0.getInputStream();
        }
        catch(IOException iOException4) {
            inputStream0 = httpURLConnection0.getErrorStream();
            if(inputStream0 == null) {
                throw new NetworkIOException("Can\'t open error stream: " + iOException4.getMessage());
            }
        }
        IWebRequestProgressListener iWebRequestProgressListener0 = this._progressListener;
        if(iWebRequestProgressListener0 != null) {
            iWebRequestProgressListener0.onRequestStart(this.getUrl().toString(), this._contentLength, this._responseCode, this._responseHeaders);
        }
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(inputStream0);
        byte[] arr_b = new byte[0x1000];
        int v2 = 0;
        while(!this.isCanceled() && v2 != -1) {
            try {
                v2 = bufferedInputStream0.read(arr_b);
                if(v2 <= 0) {
                    continue;
                }
            }
            catch(IOException iOException5) {
                throw new NetworkIOException("Network exception: " + iOException5.getMessage());
            }
            catch(Exception exception0) {
                throw new Exception("Unknown Exception: " + exception0.getMessage());
            }
            outputStream2.write(arr_b, 0, v2);
            v1 += (long)v2;
            IWebRequestProgressListener iWebRequestProgressListener1 = this._progressListener;
            if(iWebRequestProgressListener1 != null) {
                iWebRequestProgressListener1.onRequestProgress(this.getUrl().toString(), v1, this._contentLength);
            }
        }
        httpURLConnection0.disconnect();
        outputStream2.flush();
        return v1;
    }

    public void setBody(String s) {
        this._body = s.getBytes(StandardCharsets.UTF_8);
    }

    public void setBody(byte[] arr_b) {
        this._body = arr_b;
    }

    public void setConnectTimeout(int v) {
        this._connectTimeout = v;
    }

    public void setProgressListener(IWebRequestProgressListener iWebRequestProgressListener0) {
        this._progressListener = iWebRequestProgressListener0;
    }

    public void setReadTimeout(int v) {
        this._readTimeout = v;
    }
}

