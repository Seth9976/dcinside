package com.bumptech.glide.gifdecoder;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class d {
    private final byte[] a;
    private ByteBuffer b;
    private c c;
    private int d;
    private static final String e = "GifHeaderParser";
    private static final int f = 0xFF;
    private static final int g = 44;
    private static final int h = 33;
    private static final int i = 59;
    private static final int j = 0xF9;
    private static final int k = 0xFF;
    private static final int l = 0xFE;
    private static final int m = 1;
    private static final int n = 28;
    private static final int o = 2;
    private static final int p = 1;
    private static final int q = 0x80;
    private static final int r = 0x40;
    private static final int s = 7;
    private static final int t = 0x80;
    private static final int u = 7;
    static final int v = 2;
    static final int w = 10;
    private static final int x = 0x100;

    public d() {
        this.a = new byte[0x100];
        this.d = 0;
    }

    public void a() {
        this.b = null;
        this.c = null;
    }

    private boolean b() {
        return this.c.b != 0;
    }

    public boolean c() {
        this.l();
        if(!this.b()) {
            this.j(2);
        }
        return this.c.c > 1;
    }

    @NonNull
    public c d() {
        if(this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if(this.b()) {
            return this.c;
        }
        this.l();
        if(!this.b()) {
            this.i();
            c c0 = this.c;
            if(c0.c < 0) {
                c0.b = 1;
            }
        }
        return this.c;
    }

    private int e() {
        try {
            return this.b.get() & 0xFF;
        }
        catch(Exception unused_ex) {
            this.c.b = 1;
            return 0;
        }
    }

    private void f() {
        b b0 = this.c.d;
        b0.a = this.o();
        b b1 = this.c.d;
        b1.b = this.o();
        b b2 = this.c.d;
        b2.c = this.o();
        b b3 = this.c.d;
        b3.d = this.o();
        int v = this.e();
        boolean z = false;
        int v1 = (int)Math.pow(2.0, (v & 7) + 1);
        b b4 = this.c.d;
        if((v & 0x40) != 0) {
            z = true;
        }
        b4.e = z;
        b4.k = (v & 0x80) == 0 ? null : this.h(v1);
        this.c.d.j = this.b.position();
        this.t();
        if(this.b()) {
            return;
        }
        c c0 = this.c;
        ++c0.c;
        c0.e.add(c0.d);
    }

    private void g() {
        int v3;
        int v = this.e();
        this.d = v;
        if(v > 0) {
            for(int v1 = 0; true; v1 += v3) {
                int v2 = this.d;
                if(v1 >= v2) {
                    break;
                }
                try {
                    v3 = v2 - v1;
                    this.b.get(this.a, v1, v3);
                }
                catch(Exception exception0) {
                    if(Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + v1 + " count: " + v3 + " blockSize: " + this.d, exception0);
                    }
                    this.c.b = 1;
                    break;
                }
            }
        }
    }

    @Nullable
    private int[] h(int v) {
        byte[] arr_b = new byte[v * 3];
        int[] arr_v = null;
        try {
            this.b.get(arr_b);
            arr_v = new int[0x100];
            int v2 = 0;
        label_6:
            for(int v1 = 0; v1 < v; ++v1) {
                int v3 = arr_b[v2] & 0xFF;
                int v4 = v2 + 2;
                int v5 = arr_b[v2 + 1] & 0xFF;
                v2 += 3;
                arr_v[v1] = v5 << 8 | (v3 << 16 | 0xFF000000) | arr_b[v4] & 0xFF;
            }
        }
        catch(BufferUnderflowException bufferUnderflowException0) {
            if(Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", bufferUnderflowException0);
            }
            this.c.b = 1;
            if(true) {
                return arr_v;
            }
            goto label_6;
        }
        return arr_v;
    }

    private void i() {
        this.j(0x7FFFFFFF);
    }

    private void j(int v) {
        boolean z = false;
        while(!z && !this.b() && this.c.c <= v) {
            switch(this.e()) {
                case 33: {
                    switch(this.e()) {
                        case 1: {
                            this.s();
                            break;
                        }
                        case 0xF9: {
                            c c0 = this.c;
                            c0.d = new b();
                            this.k();
                            break;
                        }
                        case 0xFE: {
                            this.s();
                            break;
                        }
                        case 0xFF: {
                            this.g();
                            StringBuilder stringBuilder0 = new StringBuilder();
                            for(int v1 = 0; v1 < 11; ++v1) {
                                stringBuilder0.append(((char)this.a[v1]));
                            }
                            if(stringBuilder0.toString().equals("NETSCAPE2.0")) {
                                this.n();
                            }
                            else {
                                this.s();
                            }
                            break;
                        }
                        default: {
                            this.s();
                        }
                    }
                    break;
                }
                case 44: {
                    c c1 = this.c;
                    if(c1.d == null) {
                        c1.d = new b();
                    }
                    this.f();
                    break;
                }
                case 59: {
                    z = true;
                    break;
                }
                default: {
                    this.c.b = 1;
                }
            }
        }
    }

    private void k() {
        this.e();
        int v = this.e();
        b b0 = this.c.d;
        int v1 = (v & 28) >> 2;
        b0.g = v1;
        boolean z = true;
        if(v1 == 0) {
            b0.g = 1;
        }
        if((v & 1) == 0) {
            z = false;
        }
        b0.f = z;
        int v2 = this.o();
        if(v2 < 2) {
            v2 = 10;
        }
        b b1 = this.c.d;
        b1.i = v2 * 10;
        b1.h = this.e();
        this.e();
    }

    private void l() {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < 6; ++v) {
            stringBuilder0.append(((char)this.e()));
        }
        if(!stringBuilder0.toString().startsWith("GIF")) {
            this.c.b = 1;
            return;
        }
        this.m();
        if(this.c.h && !this.b()) {
            c c0 = this.c;
            c0.a = this.h(c0.i);
            this.c.l = this.c.a[this.c.j];
        }
    }

    private void m() {
        c c0 = this.c;
        c0.f = this.o();
        c c1 = this.c;
        c1.g = this.o();
        int v = this.e();
        this.c.h = (v & 0x80) != 0;
        this.c.i = (int)Math.pow(2.0, (v & 7) + 1);
        c c2 = this.c;
        c2.j = this.e();
        c c3 = this.c;
        c3.k = this.e();
    }

    private void n() {
        do {
            this.g();
            byte[] arr_b = this.a;
            if(arr_b[0] == 1) {
                this.c.m = (arr_b[2] & 0xFF) << 8 | arr_b[1] & 0xFF;
            }
        }
        while(this.d > 0 && !this.b());
    }

    private int o() {
        return this.b.getShort();
    }

    private void p() {
        this.b = null;
        Arrays.fill(this.a, 0);
        this.c = new c();
        this.d = 0;
    }

    public d q(@NonNull ByteBuffer byteBuffer0) {
        this.p();
        ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
        this.b = byteBuffer1;
        byteBuffer1.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public d r(@Nullable byte[] arr_b) {
        if(arr_b != null) {
            this.q(ByteBuffer.wrap(arr_b));
            return this;
        }
        this.b = null;
        this.c.b = 2;
        return this;
    }

    private void s() {
        do {
            int v = this.e();
            this.b.position(Math.min(this.b.position() + v, this.b.limit()));
        }
        while(v > 0);
    }

    private void t() {
        this.e();
        this.s();
    }
}

