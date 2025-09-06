package com.bytedance.sdk.component.JQp.ReZ.PjT.PjT;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class ReZ implements Closeable {
    private int JQp;
    private final InputStream PjT;
    private byte[] ReZ;
    private final Charset Zh;
    private int cr;

    public ReZ(InputStream inputStream0, int v, Charset charset0) {
        if(inputStream0 == null || charset0 == null) {
            throw null;
        }
        if(v < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if(!charset0.equals(cr.PjT)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.PjT = inputStream0;
        this.Zh = charset0;
        this.ReZ = new byte[v];
    }

    public ReZ(InputStream inputStream0, Charset charset0) {
        this(inputStream0, 0x2000, charset0);
    }

    public String PjT() throws IOException {
        int v3;
        int v2;
        InputStream inputStream0 = this.PjT;
        __monitor_enter(inputStream0);
        try {
            if(this.ReZ == null) {
                throw new IOException("LineReader is closed");
            }
            if(this.cr >= this.JQp) {
                this.ReZ();
            }
            for(int v = this.cr; v != this.JQp; ++v) {
                byte[] arr_b = this.ReZ;
                if(arr_b[v] == 10) {
                    int v1 = this.cr;
                    if(v == v1) {
                        v2 = v;
                    }
                    else {
                        v2 = v - 1;
                        if(arr_b[v2] != 13) {
                            v2 = v;
                        }
                    }
                    String s = new String(arr_b, v1, v2 - v1, this.Zh.name());
                    this.cr = v + 1;
                    __monitor_exit(inputStream0);
                    return s;
                }
            }
            com.bytedance.sdk.component.JQp.ReZ.PjT.PjT.ReZ.1 reZ$10 = new ByteArrayOutputStream(this.JQp - this.cr + 80) {
                final ReZ PjT;

                @Override
                public String toString() {
                    int v = this.count <= 0 || this.buf[this.count - 1] != 13 ? this.count : this.count - 1;
                    try {
                        return new String(this.buf, 0, v, ReZ.this.Zh.name());
                    }
                    catch(UnsupportedEncodingException unsupportedEncodingException0) {
                        throw new AssertionError(unsupportedEncodingException0);
                    }
                }
            };
            do {
                reZ$10.write(this.ReZ, this.cr, this.JQp - this.cr);
                this.JQp = -1;
                this.ReZ();
                v3 = this.cr;
            label_27:
            }
            while(v3 == this.JQp);
            byte[] arr_b1 = this.ReZ;
            if(arr_b1[v3] == 10) {
                int v4 = this.cr;
                if(v3 != v4) {
                    reZ$10.write(arr_b1, v4, v3 - v4);
                }
                this.cr = v3 + 1;
                __monitor_exit(inputStream0);
                return reZ$10.toString();
            }
            ++v3;
            goto label_27;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(inputStream0);
        throw throwable0;
    }

    private void ReZ() throws IOException {
        int v = this.PjT.read(this.ReZ, 0, this.ReZ.length);
        if(v == -1) {
            throw new EOFException();
        }
        this.cr = 0;
        this.JQp = v;
    }

    public boolean Zh() {
        return this.JQp == -1;
    }

    @Override
    public void close() throws IOException {
        InputStream inputStream0 = this.PjT;
        __monitor_enter(inputStream0);
        try {
            if(this.ReZ != null) {
                this.ReZ = null;
                this.PjT.close();
            }
            __monitor_exit(inputStream0);
            return;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(inputStream0);
        throw throwable0;
    }
}

