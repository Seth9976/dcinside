package com.bykv.vk.openvk.PjT.PjT.Zh.PjT.PjT;

import android.content.Context;
import com.bytedance.sdk.component.Zh.PjT.ReZ;
import com.bytedance.sdk.component.Zh.PjT.Zh;
import com.bytedance.sdk.component.Zh.PjT.qj.PjT;
import com.bytedance.sdk.component.Zh.PjT.qj;
import com.bytedance.sdk.component.Zh.PjT.qla;
import com.bytedance.sdk.component.Zh.PjT.xE;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public class c implements b {
    private volatile long a;
    private final Object b;
    private File c;
    private File d;
    private long e;
    private volatile long f;
    private volatile boolean g;
    private volatile boolean h;
    private RandomAccessFile i;
    private final v.b j;

    public c(Context context0, v.b b0) {
        this.a = 0xFFFFFFFF80000000L;
        this.b = new Object();
        this.e = 0L;
        this.f = -1L;
        this.g = false;
        this.h = false;
        this.i = null;
        this.j = b0;
        try {
            this.c = z.b.d(b0.Zh(), b0.fDm());
            this.d = z.b.c(b0.Zh(), b0.fDm());
            this.i = this.n() ? new RandomAccessFile(this.d, "r") : new RandomAccessFile(this.c, "rw");
            if(!this.n()) {
                this.e = this.c.length();
                this.f();
            }
        }
        catch(Throwable unused_ex) {
            b0.xs();
        }
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.PjT.PjT.b
    public long ReZ() throws IOException {
        if(this.n()) {
            this.a = this.d.length();
            return this.a;
        }
        Object object0 = this.b;
        __monitor_enter(object0);
        int v = 0;
        try {
            while(this.a == 0xFFFFFFFF80000000L) {
                try {
                    v += 15;
                    this.b.wait(5L);
                    if(v > 20000) {
                        goto label_14;
                    }
                    goto label_16;
                }
                catch(InterruptedException unused_ex) {
                    throw new IOException("total length InterruptException");
                }
            label_14:
                __monitor_exit(object0);
                return -1L;
            label_16:
                if(false) {
                    break;
                }
            }
            return this.a;
        }
        finally {
            __monitor_exit(object0);
        }
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.PjT.PjT.b
    public void Zh() {
        try {
            if(!this.g) {
                this.i.close();
            }
            File file0 = this.c;
            if(file0 != null) {
                file0.setLastModified(System.currentTimeMillis());
            }
            File file1 = this.d;
            if(file1 != null) {
                file1.setLastModified(System.currentTimeMillis());
            }
        }
        catch(Throwable unused_ex) {
        }
        this.g = true;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.PjT.PjT.b
    public int a(long v, byte[] arr_b, int v1, int v2) throws IOException {
        Object object0;
        int v4;
        int v3;
        try {
            if(v == this.a) {
                return -1;
            }
            v3 = 0;
            v4 = 0;
            while(true) {
            label_4:
                if(this.g) {
                    return -1;
                }
                object0 = this.b;
                __monitor_enter(object0);
                break;
            }
        }
        catch(Throwable throwable0) {
            throw throwable0 instanceof IOException ? ((IOException)throwable0) : new IOException();
        }
        try {
            if(v < this.c()) {
                this.i.seek(v);
                v4 = this.i.read(arr_b, v1, v2);
            }
            else {
                v3 += 33;
                this.b.wait(33L);
            }
            __monitor_exit(object0);
            goto label_19;
        }
        catch(Throwable throwable1) {
        }
        try {
            __monitor_exit(object0);
            throw throwable1;
        label_19:
            if(v4 > 0) {
                return v4;
            }
            if(v3 >= 20000) {
                throw new SocketTimeoutException();
            }
            goto label_4;
        }
        catch(Throwable throwable0) {
        }
        throw throwable0 instanceof IOException ? ((IOException)throwable0) : new IOException();
    }

    // 去混淆评级： 低(20)
    private long c() {
        return this.n() ? this.d.length() : this.c.length();
    }

    public void f() {
        class a implements ReZ {
            final c a;

            @Override  // com.bytedance.sdk.component.Zh.PjT.ReZ
            public void PjT(Zh zh0, qla qla0) throws IOException {
                InputStream inputStream1;
                xE xE0;
                InputStream inputStream0;
                if(qla0 != null) {
                    try {
                        inputStream0 = null;
                        boolean z = qla0.cr();
                        c.this.h = z;
                        if(c.this.h) {
                            xE0 = qla0.cz();
                            goto label_6;
                        }
                        else {
                            c.this.h = false;
                            c.this.a = c.this.f;
                            xE0 = null;
                        }
                        goto label_71;
                    }
                    catch(Throwable unused_ex) {
                        goto label_49;
                    }
                    try {
                    label_6:
                        if(c.this.h && xE0 != null) {
                            long v = xE0.PjT();
                            c.this.a = v + c.this.e;
                            inputStream0 = xE0.ReZ();
                        }
                        inputStream1 = inputStream0;
                        if(inputStream1 == null) {
                            goto label_15;
                        }
                        goto label_21;
                    }
                    catch(Throwable unused_ex) {
                        inputStream1 = null;
                        goto label_51;
                    }
                    try {
                    label_15:
                        if(xE0 != null) {
                            xE0.close();
                        }
                        qla0.close();
                        if(c.this.h && c.this.c.length() == c.this.a) {
                            c.this.p();
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    return;
                    try {
                    label_21:
                        byte[] arr_b = new byte[0x2000];
                        long v1 = c.this.e;
                        long v2 = 0L;
                        while(true) {
                            int v3 = 0;
                        label_25:
                            int v4 = inputStream1.read(arr_b, v3, 0x2000 - v3);
                            if(v4 == -1) {
                                break;
                            }
                            v3 += v4;
                            v2 += (long)v4;
                            c.this.j.fDm();
                            c.this.j.xs();
                            if(v2 % 0x2000L == 0L || v2 == c.this.a - c.this.e) {
                                synchronized(c.this.b) {
                                    z.b.b(c.this.i, arr_b, v1.intValue(), v3, c.this.j.fDm());
                                }
                                v1 += (long)v3;
                                continue;
                            }
                            if(false) {
                                break;
                            }
                            goto label_25;
                        }
                        c.this.j.xs();
                        inputStream0 = inputStream1;
                        goto label_71;
                    }
                    catch(Throwable unused_ex) {
                        goto label_51;
                    }
                    try {
                        c.this.h = false;
                        c.this.a = c.this.f;
                        xE0 = null;
                        goto label_71;
                    }
                    catch(Throwable unused_ex) {
                    label_49:
                        xE0 = null;
                        inputStream1 = null;
                    }
                    try {
                    label_51:
                        c.this.h = false;
                        c.this.a = c.this.f;
                    }
                    catch(Throwable throwable0) {
                        try {
                            if(inputStream1 != null) {
                                inputStream1.close();
                            }
                            if(xE0 != null) {
                                xE0.close();
                            }
                            qla0.close();
                            if(c.this.h && c.this.c.length() == c.this.a) {
                                c.this.p();
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        throw throwable0;
                    }
                    if(inputStream1 != null) {
                        try {
                            inputStream1.close();
                        label_65:
                            if(xE0 != null) {
                                xE0.close();
                            }
                            qla0.close();
                            if(c.this.h && c.this.c.length() == c.this.a) {
                                c.this.p();
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        return;
                    }
                    goto label_65;
                    try {
                    label_71:
                        if(inputStream0 != null) {
                            inputStream0.close();
                        }
                        if(xE0 != null) {
                            xE0.close();
                        }
                        qla0.close();
                        if(c.this.h && c.this.c.length() == c.this.a) {
                            c.this.p();
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    return;
                }
                c.this.h = false;
                c.this.a = c.this.f;
            }

            @Override  // com.bytedance.sdk.component.Zh.PjT.ReZ
            public void PjT(Zh zh0, IOException iOException0) {
                c.this.h = false;
                c.this.a = -1L;
            }
        }

        PjT qj$PjT0 = s.b.i() == null ? new PjT("v_cache") : s.b.i().Zh();
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        qj$PjT0.PjT(((long)this.j.xE()), timeUnit0).Zh(((long)this.j.ub()), timeUnit0).ReZ(((long)this.j.gK()), timeUnit0);
        qj qj0 = qj$PjT0.PjT();
        this.j.fDm();
        qj0.PjT(new com.bytedance.sdk.component.Zh.PjT.xs.PjT().PjT("RANGE", "bytes=" + this.e + "-").Zh(this.j.xs()).PjT().PjT("videoLoadWhenPlaying").PjT(9).Zh()).PjT(new a(this));
    }

    private boolean n() {
        return this.d.exists();
    }

    private void p() throws IOException {
        Object object0 = this.b;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(this.n()) {
            this.j.xs();
            this.j.fDm();
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        try {
            if(this.c.renameTo(this.d)) {
                RandomAccessFile randomAccessFile0 = this.i;
                if(randomAccessFile0 != null) {
                    randomAccessFile0.close();
                }
                this.i = new RandomAccessFile(this.d, "rw");
                this.j.fDm();
                this.j.xs();
            }
        label_17:
            FIN.finallyExec$NT(v);
        }
        catch(Throwable unused_ex) {
            goto label_17;
        }
    }
}

