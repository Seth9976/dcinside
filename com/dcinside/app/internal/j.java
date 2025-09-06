package com.dcinside.app.internal;

import A3.p;
import A3.r;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/SeekBarChanges\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,336:1\n147#2:337\n147#2:338\n147#2:339\n*S KotlinDebug\n*F\n+ 1 ViewExtension.kt\ncom/dcinside/app/internal/SeekBarChanges\n*L\n236#1:337\n253#1:338\n270#1:339\n*E\n"})
public final class j implements SeekBar.OnSeekBarChangeListener {
    @l
    private final g a;
    @m
    private r b;
    @m
    private p c;
    @m
    private p d;

    public j(@l g g0) {
        L.p(g0, "context");
        super();
        this.a = g0;
    }

    public final void a(@l r r0) {
        L.p(r0, "listener");
        this.b = r0;
    }

    public final void b(@l p p0) {
        L.p(p0, "listener");
        this.c = p0;
    }

    public final void c(@l p p0) {
        L.p(p0, "listener");
        this.d = p0;
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public void onProgressChanged(@l SeekBar seekBar0, int v, boolean z) {
        @f(c = "com.dcinside.app.internal.SeekBarChanges$onProgressChanged$1", f = "ViewExtension.kt", i = {}, l = {0xEE}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements A3.o {
            int k;
            private Object l;
            final r m;
            final t n;
            final int o;
            final boolean p;

            a(r r0, t t0, int v, boolean z, d d0) {
                this.m = r0;
                this.n = t0;
                this.o = v;
                this.p = z;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new a(this.m, this.n, this.o, this.p, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        r r0 = this.m;
                        Object object2 = this.n.a();
                        if(((SeekBar)object2) == null) {
                            return S0.a;
                        }
                        this.k = 1;
                        return r0.K0(o0, ((SeekBar)object2), kotlin.coroutines.jvm.internal.b.f(this.o), kotlin.coroutines.jvm.internal.b.a(this.p), this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(seekBar0, "seekBar");
        r r0 = this.b;
        if(r0 == null) {
            return;
        }
        a j$a0 = new a(r0, new t(seekBar0), v, z, null);
        k.f(() -> i.a, this.a, null, j$a0, 2, null);
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public void onStartTrackingTouch(@l SeekBar seekBar0) {
        @f(c = "com.dcinside.app.internal.SeekBarChanges$onStartTrackingTouch$1", f = "ViewExtension.kt", i = {}, l = {0xFF}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.internal.j.b extends o implements A3.o {
            int k;
            private Object l;
            final p m;
            final t n;

            com.dcinside.app.internal.j.b(p p0, t t0, d d0) {
                this.m = p0;
                this.n = t0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.dcinside.app.internal.j.b(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.internal.j.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        p p0 = this.m;
                        SeekBar seekBar0 = (SeekBar)this.n.a();
                        if(seekBar0 == null) {
                            return S0.a;
                        }
                        this.k = 1;
                        return p0.invoke(o0, seekBar0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(seekBar0, "seekBar");
        p p0 = this.c;
        if(p0 == null) {
            return;
        }
        com.dcinside.app.internal.j.b j$b0 = new com.dcinside.app.internal.j.b(p0, new t(seekBar0), null);
        k.f(() -> i.a, this.a, null, j$b0, 2, null);
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public void onStopTrackingTouch(@l SeekBar seekBar0) {
        @f(c = "com.dcinside.app.internal.SeekBarChanges$onStopTrackingTouch$1", f = "ViewExtension.kt", i = {}, l = {0x110}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements A3.o {
            int k;
            private Object l;
            final p m;
            final t n;

            c(p p0, t t0, d d0) {
                this.m = p0;
                this.n = t0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new c(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        p p0 = this.m;
                        SeekBar seekBar0 = (SeekBar)this.n.a();
                        if(seekBar0 == null) {
                            return S0.a;
                        }
                        this.k = 1;
                        return p0.invoke(o0, seekBar0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(seekBar0, "seekBar");
        p p0 = this.d;
        if(p0 == null) {
            return;
        }
        c j$c0 = new c(p0, new t(seekBar0), null);
        k.f(() -> i.a, this.a, null, j$c0, 2, null);
    }
}

