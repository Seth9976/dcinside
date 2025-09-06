package com.bykv.vk.openvk.PjT.PjT.Zh.PjT.Zh;

import android.content.Context;
import com.bytedance.sdk.component.Zh.PjT.ReZ;
import com.bytedance.sdk.component.Zh.PjT.Zh;
import com.bytedance.sdk.component.Zh.PjT.qj.PjT;
import com.bytedance.sdk.component.Zh.PjT.qj;
import com.bytedance.sdk.component.Zh.PjT.qla;
import com.bytedance.sdk.component.Zh.PjT.xE;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import t.a.a;
import v.b;

public class c {
    private Context a;
    private b b;
    private volatile boolean c;
    private File d;
    private File e;
    private final List f;
    private volatile boolean g;

    public c(Context context0, b b0) {
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = new ArrayList();
        this.g = false;
        this.a = context0;
        this.b = b0;
        this.d = z.b.d(b0.Zh(), b0.fDm());
        this.e = z.b.c(b0.Zh(), b0.fDm());
    }

    private void a() {
        try {
            if(!this.d.renameTo(this.e)) {
                throw new IOException("Error renaming file " + this.d + " to " + this.e + " for completion!");
            }
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
    }

    public b c() {
        return this.b;
    }

    private void h(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public void i(a a$a0) {
        if(this.g) {
            synchronized(a.class) {
                this.f.add(a$a0);
            }
            return;
        }
        this.f.add(a$a0);
        if(this.r()) {
            this.b.XX(1);
            this.j(this.b, 200);
            com.bykv.vk.openvk.PjT.PjT.Zh.PjT.Zh.b.b(this.b);
            return;
        }
        this.g = true;
        this.b.XX(0);
        this.m();
    }

    private void j(b b0, int v) {
        Class class0 = a.class;
        __monitor_enter(class0);
        try {
            for(Object object0: this.f) {
                a a$a0 = (a)object0;
                if(a$a0 != null) {
                    a$a0.PjT(b0, v);
                }
            }
            __monitor_exit(class0);
            return;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(class0);
        throw throwable0;
    }

    private void k(b b0, int v, String s) {
        Class class0 = a.class;
        __monitor_enter(class0);
        try {
            for(Object object0: this.f) {
                a a$a0 = (a)object0;
                if(a$a0 != null) {
                    a$a0.PjT(b0, v, s);
                }
            }
            __monitor_exit(class0);
            return;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(class0);
        throw throwable0;
    }

    public void l(boolean z) {
        this.c = z;
    }

    private void m() {
        class com.bykv.vk.openvk.PjT.PjT.Zh.PjT.Zh.c.a implements ReZ {
            final long a;
            final c b;

            com.bykv.vk.openvk.PjT.PjT.Zh.PjT.Zh.c.a(long v) {
                this.a = v;
                super();
            }

            @Override  // com.bytedance.sdk.component.Zh.PjT.ReZ
            public void PjT(Zh zh0, qla qla0) throws IOException {
                int v10;
                long v3;
                RandomAccessFile randomAccessFile0;
                InputStream inputStream0;
                xE xE0;
                long v = this.a;
                Closeable closeable0 = null;
                if(qla0 == null) {
                    try {
                        v10 = 601;
                        inputStream0 = null;
                        c.this.k(c.this.b, 601, "Network link failed.");
                        goto label_96;
                    }
                    catch(Throwable throwable0) {
                        randomAccessFile0 = null;
                    }
                    try {
                    label_76:
                        c.this.s();
                        c c0 = c.this;
                        b b0 = c0.b;
                        if(qla0 != null) {
                            v10 = qla0.ReZ();
                        }
                        c0.k(b0, v10, throwable0.getMessage());
                    }
                    catch(Throwable throwable1) {
                        c.this.h(randomAccessFile0);
                        c.this.h(inputStream0);
                        c.this.h(closeable0);
                        c.this.h(qla0);
                        c.this.b.xs();
                        c.this.b.ReZ();
                        com.bykv.vk.openvk.PjT.PjT.Zh.PjT.Zh.b.b(c.this.b);
                        throw throwable1;
                    }
                    c.this.h(randomAccessFile0);
                    c.this.h(inputStream0);
                    c.this.h(closeable0);
                    goto label_99;
                label_96:
                    c.this.h(null);
                    c.this.h(null);
                    c.this.h(null);
                }
                else {
                    try {
                        if(qla0.cr()) {
                            goto label_10;
                        }
                        else {
                            int v1 = qla0.ReZ();
                            String s = qla0.JQp();
                            c.this.k(c.this.b, v1, s);
                            goto label_7;
                        }
                        goto label_99;
                    }
                    catch(Throwable throwable0) {
                        inputStream0 = null;
                        randomAccessFile0 = null;
                        v10 = 601;
                        goto label_76;
                    }
                label_7:
                    c.this.h(null);
                    c.this.h(null);
                    c.this.h(closeable0);
                    goto label_99;
                    try {
                    label_10:
                        xE0 = qla0.cz();
                    }
                    catch(Throwable throwable0) {
                        inputStream0 = null;
                        randomAccessFile0 = null;
                        v10 = 601;
                        goto label_76;
                    }
                    try {
                        xE0 = qla0.cz();
                        if(xE0 == null) {
                            inputStream0 = null;
                            v3 = 0L;
                        }
                        else {
                            long v2 = xE0.PjT();
                            InputStream inputStream1 = xE0.ReZ();
                            v3 = this.a + v2;
                            inputStream0 = inputStream1;
                        }
                    }
                    catch(Throwable throwable0) {
                        inputStream0 = null;
                        randomAccessFile0 = null;
                        closeable0 = xE0;
                        v10 = 601;
                        goto label_76;
                    }
                    try {
                        if(inputStream0 == null) {
                            int v4 = qla0.ReZ();
                            String s1 = qla0.JQp();
                            c.this.k(c.this.b, v4, s1);
                        }
                        else {
                            randomAccessFile0 = new RandomAccessFile(c.this.d, "rw");
                            goto label_40;
                        }
                        goto label_66;
                    }
                    catch(Throwable throwable0) {
                        randomAccessFile0 = null;
                        closeable0 = xE0;
                        v10 = 601;
                        goto label_76;
                    }
                    try {
                    label_40:
                        byte[] arr_b = new byte[0x2000];
                        long v5 = 0L;
                    alab1:
                        while(true) {
                            int v6 = 0;
                            do {
                                int v7 = inputStream0.read(arr_b, v6, 0x2000 - v6);
                                if(v7 == -1) {
                                    goto label_56;
                                }
                                if(c.this.c) {
                                    break alab1;
                                }
                                v6 += v7;
                                v5 += (long)v7;
                            }
                            while(v5 % 0x2000L != 0L && v5 != v3 - this.a);
                            z.b.b(randomAccessFile0, arr_b, v.intValue(), v6, c.this.b.fDm());
                            v += (long)v6;
                        }
                        int v8 = qla0.ReZ();
                        c.this.q(c.this.b, v8);
                    }
                    catch(Throwable throwable0) {
                        closeable0 = xE0;
                        v10 = 601;
                        goto label_76;
                    }
                    c.this.h(randomAccessFile0);
                    goto label_67;
                    try {
                    label_56:
                        if(c.this.b.DWo() && v3 == c.this.d.length()) {
                            c.this.a();
                        }
                        int v9 = qla0.ReZ();
                        c.this.j(c.this.b, v9);
                        closeable0 = randomAccessFile0;
                    }
                    catch(Throwable throwable0) {
                        closeable0 = xE0;
                        v10 = 601;
                        goto label_76;
                    }
                label_66:
                    c.this.h(closeable0);
                label_67:
                    c.this.h(inputStream0);
                    c.this.h(xE0);
                }
            label_99:
                c.this.h(qla0);
                c.this.b.xs();
                c.this.b.ReZ();
                com.bykv.vk.openvk.PjT.PjT.Zh.PjT.Zh.b.b(c.this.b);
            }

            @Override  // com.bytedance.sdk.component.Zh.PjT.ReZ
            public void PjT(Zh zh0, IOException iOException0) {
                c.this.k(c.this.b, 601, iOException0.getMessage());
                com.bykv.vk.openvk.PjT.PjT.Zh.PjT.Zh.b.b(c.this.b);
            }
        }

        PjT qj$PjT0 = s.b.i() == null ? new PjT("v_preload") : s.b.i().Zh();
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        qj$PjT0.PjT(((long)this.b.xE()), timeUnit0).Zh(((long)this.b.ub()), timeUnit0).ReZ(((long)this.b.gK()), timeUnit0);
        qj qj0 = qj$PjT0.PjT();
        com.bytedance.sdk.component.Zh.PjT.xs.PjT xs$PjT0 = new com.bytedance.sdk.component.Zh.PjT.xs.PjT();
        long v = this.d.length();
        int v1 = this.b.ReZ();
        boolean z = this.b.DWo();
        int v2 = this.b.PjT();
        if(v2 > 0) {
            if(((long)v2) >= this.b.SM()) {
                z = true;
            }
            else {
                v1 = v2;
            }
        }
        xs$PjT0.PjT("videoPreload").PjT(6);
        if(z) {
            xs$PjT0.PjT("RANGE", "bytes=" + v + "-").Zh(this.b.xs()).PjT().Zh();
        }
        else {
            xs$PjT0.PjT("RANGE", "bytes=" + v + "-" + v1).Zh(this.b.xs()).PjT().Zh();
        }
        qj0.PjT(xs$PjT0.Zh()).PjT(new com.bykv.vk.openvk.PjT.PjT.Zh.PjT.Zh.c.a(this, v));
    }

    private void q(b b0, int v) {
        Class class0 = a.class;
        __monitor_enter(class0);
        try {
            for(Object object0: this.f) {
                a a$a0 = (a)object0;
                if(a$a0 != null) {
                    a$a0.Zh(b0, v);
                }
            }
            __monitor_exit(class0);
            return;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(class0);
        throw throwable0;
    }

    private boolean r() {
        if(this.e.exists()) {
            return true;
        }
        if(!this.b.DWo()) {
            return this.d.length() < ((long)this.b.ReZ()) ? this.b.PjT() > 0 && this.d.length() >= ((long)this.b.PjT()) : true;
        }
        return false;
    }

    private void s() {
        try {
            this.e.delete();
            this.d.delete();
        }
        catch(Throwable unused_ex) {
        }
    }
}

