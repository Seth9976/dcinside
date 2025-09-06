package com.dcinside.app.view.popupmenu;

import android.content.Context;
import android.view.View;
import com.dcinside.app.base.i;
import java.lang.ref.WeakReference;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

public abstract class a implements i {
    @l
    private final WeakReference a;

    public a(Object object0) {
        this.a = new WeakReference(object0);
    }

    public abstract boolean b(Object arg1, @l com.dcinside.app.view.popupmenu.l arg2);

    protected final void c(@l d l$d0, @l Context context0, int v, @m Integer integer0, @m Integer integer1, @m Integer integer2, int v1, boolean z, @l o o0) {
        static final class com.dcinside.app.view.popupmenu.a.a extends N implements Function1 {
            final Integer e;
            final Integer f;
            final Context g;
            final int h;
            final int i;
            final Integer j;
            final boolean k;
            final o l;
            final a m;

            com.dcinside.app.view.popupmenu.a.a(Integer integer0, Integer integer1, Context context0, int v, int v1, Integer integer2, boolean z, o o0, a a0) {
                this.e = integer0;
                this.f = integer1;
                this.g = context0;
                this.h = v;
                this.i = v1;
                this.j = integer2;
                this.k = z;
                this.l = o0;
                this.m = a0;
                super(1);
            }

            public final void a(@l c l$c0) {
                static final class com.dcinside.app.view.popupmenu.a.a.a extends N implements Function1 {
                    final a e;
                    final int f;

                    com.dcinside.app.view.popupmenu.a.a.a(a a0, int v) {
                        this.e = a0;
                        this.f = v;
                        super(1);
                    }

                    public final void a(@l Context context0) {
                        L.p(context0, "it");
                        Object object0 = this.e.a.get();
                        if(object0 != null) {
                            this.e.e(object0, this.f);
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((Context)object0));
                        return S0.a;
                    }
                }

                L.p(l$c0, "$this$item");
                int v = 0;
                l$c0.n((this.e == null ? 0 : ((int)this.e)));
                l$c0.t((this.f == null ? 0 : ((int)this.f)));
                l$c0.q(this.g.getString(this.h));
                l$c0.c(new com.dcinside.app.view.popupmenu.a.a.a(this.m, this.h));
                l$c0.o(this.i);
                Integer integer0 = this.j;
                if(integer0 != null) {
                    v = (int)integer0;
                }
                l$c0.r(v);
                l$c0.m(this.k);
                l$c0.s(this.l);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((c)object0));
                return S0.a;
            }
        }

        L.p(l$d0, "<this>");
        L.p(context0, "ctx");
        L.p(o0, "iconGravity");
        l$d0.d(new com.dcinside.app.view.popupmenu.a.a(integer0, integer1, context0, v, v1, integer2, z, o0, this));
    }

    public static void d(a a0, d l$d0, Context context0, int v, Integer integer0, Integer integer1, Integer integer2, int v1, boolean z, o o0, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        a0.c(l$d0, context0, v, ((v2 & 4) == 0 ? integer0 : null), ((v2 & 8) == 0 ? integer1 : null), ((v2 & 16) == 0 ? integer2 : null), ((v2 & 0x20) == 0 ? v1 : 0), ((v2 & 0x40) == 0 ? z : true), ((v2 & 0x80) == 0 ? o0 : o.a));
    }

    public abstract void e(Object arg1, int arg2);

    @m
    public final n f(@l Context context0, @l View view0) {
        static final class b extends N implements Function1 {
            final kotlin.jvm.internal.l0.a e;
            final a f;
            final Object g;

            b(kotlin.jvm.internal.l0.a l0$a0, a a0, Object object0) {
                this.e = l0$a0;
                this.f = a0;
                this.g = object0;
                super(1);
            }

            public final void a(@l com.dcinside.app.view.popupmenu.l l0) {
                L.p(l0, "$this$popupMenu");
                l0.d(0x800005);
                this.e.a = this.f.b(this.g, l0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.view.popupmenu.l)object0));
                return S0.a;
            }
        }

        L.p(context0, "ctx");
        L.p(view0, "anchor");
        Object object0 = this.a.get();
        if(object0 == null) {
            return null;
        }
        kotlin.jvm.internal.l0.a l0$a0 = new kotlin.jvm.internal.l0.a();
        try {
            k k0 = com.dcinside.app.view.popupmenu.m.a(new b(l0$a0, this, object0));
            return k0 == null || !l0$a0.a ? null : k0.c(context0, view0);
        }
        catch(Exception exception0) {
            timber.log.b.a.y(exception0);
            throw new NullPointerException();
        }
    }

    @m
    public final n g(@l Context context0, @l View view0, @l Function1 function10) {
        static final class com.dcinside.app.view.popupmenu.a.c extends N implements Function1 {
            final kotlin.jvm.internal.l0.a e;
            final a f;
            final Object g;

            com.dcinside.app.view.popupmenu.a.c(kotlin.jvm.internal.l0.a l0$a0, a a0, Object object0) {
                this.e = l0$a0;
                this.f = a0;
                this.g = object0;
                super(1);
            }

            public final void a(@l com.dcinside.app.view.popupmenu.l l0) {
                L.p(l0, "$this$popupMenu");
                l0.d(0x800005);
                this.e.a = this.f.b(this.g, l0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.view.popupmenu.l)object0));
                return S0.a;
            }
        }

        L.p(context0, "ctx");
        L.p(view0, "anchor");
        L.p(function10, "listener");
        Object object0 = this.a.get();
        if(object0 == null) {
            return null;
        }
        kotlin.jvm.internal.l0.a l0$a0 = new kotlin.jvm.internal.l0.a();
        try {
            k k0 = com.dcinside.app.view.popupmenu.m.a(new com.dcinside.app.view.popupmenu.a.c(l0$a0, this, object0));
            return k0 == null || !l0$a0.a ? null : k0.d(context0, view0, function10);
        }
        catch(Exception exception0) {
            timber.log.b.a.y(exception0);
            throw new NullPointerException();
        }
    }
}

