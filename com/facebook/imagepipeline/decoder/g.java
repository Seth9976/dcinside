package com.facebook.imagepipeline.decoder;

import com.facebook.common.internal.d;
import com.facebook.common.internal.s;
import com.facebook.common.memory.h;
import com.facebook.common.util.f;
import com.facebook.imagepipeline.image.l;
import java.io.IOException;
import java.io.InputStream;
import k1.n.a;
import k1.n;

@n(a.a)
public class g {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private final com.facebook.common.memory.a h;
    private static final int i = 0;
    private static final int j = 1;
    private static final int k = 2;
    private static final int l = 3;
    private static final int m = 4;
    private static final int n = 5;
    private static final int o = 6;
    private static final int p = 0x4000;

    public g(com.facebook.common.memory.a a0) {
        this.h = (com.facebook.common.memory.a)com.facebook.common.internal.n.i(a0);
        this.c = 0;
        this.b = 0;
        this.d = 0;
        this.f = 0;
        this.e = 0;
        this.a = 0;
    }

    private boolean a(InputStream inputStream0) {
        int v = this.e;
        while(this.a != 6) {
            try {
                int v1 = inputStream0.read();
                if(v1 == -1) {
                    break;
                }
                int v2 = this.c;
                this.c = v2 + 1;
                if(this.g) {
                    this.a = 6;
                    this.g = false;
                    return false;
                }
            alab1:
                switch(this.a) {
                    case 0: {
                        this.a = v1 == 0xFF ? 1 : 6;
                        break;
                    }
                    case 1: {
                        this.a = v1 == 0xD8 ? 2 : 6;
                        break;
                    }
                    case 2: {
                        if(v1 == 0xFF) {
                            this.a = 3;
                        }
                        break;
                    }
                    case 3: {
                        switch(v1) {
                            case 0: {
                                this.a = 2;
                                break alab1;
                            }
                            case 0xD9: {
                                this.g = true;
                                this.g(v2 - 1);
                                this.a = 2;
                                break alab1;
                            }
                            case 0xDA: {
                                this.g(v2 - 1);
                                this.a = g.b(v1) ? 4 : 2;
                                break alab1;
                            }
                            case 0xFF: {
                                this.a = 3;
                                break alab1;
                            }
                            default: {
                                this.a = g.b(v1) ? 4 : 2;
                                break alab1;
                            }
                        }
                    }
                    case 4: {
                        this.a = 5;
                        break;
                    }
                    case 5: {
                        int v3 = (this.b << 8) + v1 - 2;
                        f.c(inputStream0, ((long)v3));
                        this.c += v3;
                        this.a = 2;
                        break;
                    }
                    default: {
                        com.facebook.common.internal.n.o(false);
                    }
                }
                this.b = v1;
                continue;
            }
            catch(IOException iOException0) {
            }
            s.d(iOException0);
            if(true) {
                break;
            }
        }
        return this.a != 6 && this.e != v;
    }

    private static boolean b(int v) {
        if(v == 1) {
            return false;
        }
        return v < 0xD0 || v > 0xD7 ? v != 0xD8 && v != 0xD9 : false;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public boolean e() {
        return this.g;
    }

    public boolean f() {
        return this.c > 1 && this.a != 6;
    }

    private void g(int v) {
        int v1 = this.d;
        if(v1 > 0) {
            this.f = v;
        }
        this.d = v1 + 1;
        this.e = v1;
    }

    public boolean h(l l0) {
        if(this.a == 6) {
            return false;
        }
        if(l0.getSize() <= this.c) {
            return false;
        }
        h h0 = new h(l0.p(), ((byte[])this.h.get(0x4000)), this.h);
        try {
            f.c(h0, ((long)this.c));
            return this.a(h0);
        }
        catch(IOException iOException0) {
            s.d(iOException0);
            return false;
        }
        finally {
            d.b(h0);
        }
    }
}

