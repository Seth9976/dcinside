package com.bytedance.sdk.component.Zh.PjT.PjT.PjT;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

public class cz extends InputStream {
    InputStream PjT;
    HttpURLConnection Zh;

    public cz(InputStream inputStream0, HttpURLConnection httpURLConnection0) {
        this.PjT = inputStream0;
        this.Zh = httpURLConnection0;
    }

    @Override
    public int available() throws IOException {
        return this.PjT == null ? 0 : this.PjT.available();
    }

    @Override
    public void close() throws IOException {
        InputStream inputStream0 = this.PjT;
        if(inputStream0 != null) {
            inputStream0.close();
            this.PjT = null;
        }
        HttpURLConnection httpURLConnection0 = this.Zh;
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
            this.Zh = null;
        }
    }

    @Override
    public void mark(int v) {
        synchronized(this) {
            InputStream inputStream0 = this.PjT;
            if(inputStream0 != null) {
                inputStream0.mark(v);
            }
        }
    }

    @Override
    public boolean markSupported() {
        return this.PjT == null ? false : this.PjT.markSupported();
    }

    @Override
    public int read() throws IOException {
        return this.PjT == null ? 0 : this.PjT.read();
    }

    @Override
    public int read(byte[] arr_b) throws IOException {
        return this.PjT == null ? 0 : this.PjT.read(arr_b);
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        return this.PjT == null ? 0 : this.PjT.read(arr_b, v, v1);
    }

    @Override
    public void reset() throws IOException {
        InputStream inputStream0 = this.PjT;
        if(inputStream0 != null) {
            inputStream0.reset();
        }
    }

    @Override
    public long skip(long v) throws IOException {
        return this.PjT == null ? 0L : this.PjT.skip(v);
    }
}

