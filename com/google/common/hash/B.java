package com.google.common.hash;

import O1.j;
import com.google.common.base.H;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@j
@k
abstract class b extends c {
    final q[] a;
    private static final long b;

    b(q[] arr_q) {
        for(int v = 0; v < arr_q.length; ++v) {
            H.E(arr_q[v]);
        }
        this.a = arr_q;
    }

    @Override  // com.google.common.hash.c
    public s a(int v) {
        H.d(v >= 0);
        s[] arr_s = new s[this.a.length];
        for(int v1 = 0; v1 < this.a.length; ++v1) {
            arr_s[v1] = this.a[v1].a(v);
        }
        return this.l(arr_s);
    }

    @Override  // com.google.common.hash.q
    public s i() {
        s[] arr_s = new s[this.a.length];
        for(int v = 0; v < this.a.length; ++v) {
            arr_s[v] = this.a[v].i();
        }
        return this.l(arr_s);
    }

    private s l(s[] arr_s) {
        class a implements s {
            final s[] a;
            final b b;

            a(s[] arr_s) {
                this.a = arr_s;
                super();
            }

            @Override  // com.google.common.hash.s
            public J a(float f) {
                return this.a(f);
            }

            @Override  // com.google.common.hash.s
            public s a(float f) {
                s[] arr_s = this.a;
                for(int v = 0; v < arr_s.length; ++v) {
                    arr_s[v].a(f);
                }
                return this;
            }

            @Override  // com.google.common.hash.s
            public J b(int v) {
                return this.b(v);
            }

            @Override  // com.google.common.hash.s
            public s b(int v) {
                s[] arr_s = this.a;
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    arr_s[v1].b(v);
                }
                return this;
            }

            @Override  // com.google.common.hash.s
            public J c(long v) {
                return this.c(v);
            }

            @Override  // com.google.common.hash.s
            public s c(long v) {
                s[] arr_s = this.a;
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    arr_s[v1].c(v);
                }
                return this;
            }

            @Override  // com.google.common.hash.s
            public J d(double f) {
                return this.d(f);
            }

            @Override  // com.google.common.hash.s
            public s d(double f) {
                s[] arr_s = this.a;
                for(int v = 0; v < arr_s.length; ++v) {
                    arr_s[v].d(f);
                }
                return this;
            }

            @Override  // com.google.common.hash.s
            public J e(short v) {
                return this.e(v);
            }

            @Override  // com.google.common.hash.s
            public s e(short v) {
                s[] arr_s = this.a;
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    arr_s[v1].e(v);
                }
                return this;
            }

            @Override  // com.google.common.hash.s
            public J f(boolean z) {
                return this.f(z);
            }

            @Override  // com.google.common.hash.s
            public s f(boolean z) {
                s[] arr_s = this.a;
                for(int v = 0; v < arr_s.length; ++v) {
                    arr_s[v].f(z);
                }
                return this;
            }

            @Override  // com.google.common.hash.s
            public J g(byte b) {
                return this.g(b);
            }

            @Override  // com.google.common.hash.s
            public s g(byte b) {
                s[] arr_s = this.a;
                for(int v = 0; v < arr_s.length; ++v) {
                    arr_s[v].g(b);
                }
                return this;
            }

            @Override  // com.google.common.hash.s
            public J h(byte[] arr_b) {
                return this.h(arr_b);
            }

            @Override  // com.google.common.hash.s
            public s h(byte[] arr_b) {
                s[] arr_s = this.a;
                for(int v = 0; v < arr_s.length; ++v) {
                    arr_s[v].h(arr_b);
                }
                return this;
            }

            @Override  // com.google.common.hash.s
            public J i(char c) {
                return this.i(c);
            }

            @Override  // com.google.common.hash.s
            public s i(char c) {
                s[] arr_s = this.a;
                for(int v = 0; v < arr_s.length; ++v) {
                    arr_s[v].i(c);
                }
                return this;
            }

            @Override  // com.google.common.hash.s
            public J j(CharSequence charSequence0) {
                return this.j(charSequence0);
            }

            @Override  // com.google.common.hash.s
            public s j(CharSequence charSequence0) {
                s[] arr_s = this.a;
                for(int v = 0; v < arr_s.length; ++v) {
                    arr_s[v].j(charSequence0);
                }
                return this;
            }

            @Override  // com.google.common.hash.s
            public J k(byte[] arr_b, int v, int v1) {
                return this.k(arr_b, v, v1);
            }

            @Override  // com.google.common.hash.s
            public s k(byte[] arr_b, int v, int v1) {
                s[] arr_s = this.a;
                for(int v2 = 0; v2 < arr_s.length; ++v2) {
                    arr_s[v2].k(arr_b, v, v1);
                }
                return this;
            }

            @Override  // com.google.common.hash.s
            public J l(ByteBuffer byteBuffer0) {
                return this.l(byteBuffer0);
            }

            @Override  // com.google.common.hash.s
            public s l(ByteBuffer byteBuffer0) {
                int v = byteBuffer0.position();
                s[] arr_s = this.a;
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    s s0 = arr_s[v1];
                    y.d(byteBuffer0, v);
                    s0.l(byteBuffer0);
                }
                return this;
            }

            @Override  // com.google.common.hash.s
            public J m(CharSequence charSequence0, Charset charset0) {
                return this.m(charSequence0, charset0);
            }

            @Override  // com.google.common.hash.s
            public s m(CharSequence charSequence0, Charset charset0) {
                s[] arr_s = this.a;
                for(int v = 0; v < arr_s.length; ++v) {
                    arr_s[v].m(charSequence0, charset0);
                }
                return this;
            }

            @Override  // com.google.common.hash.s
            public p n() {
                return b.this.m(this.a);
            }

            @Override  // com.google.common.hash.s
            public s o(@I Object object0, n n0) {
                s[] arr_s = this.a;
                for(int v = 0; v < arr_s.length; ++v) {
                    arr_s[v].o(object0, n0);
                }
                return this;
            }
        }

        return new a(this, arr_s);
    }

    abstract p m(s[] arg1);
}

