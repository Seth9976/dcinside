package com.dcinside.app.settings;

import A3.a;
import android.content.Context;
import android.webkit.WebView;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.dcinside.app.Application;
import com.dcinside.app.realm.j0;
import com.dcinside.app.realm.k0;
import io.realm.F0;
import io.realm.RealmQuery;
import java.io.File;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;
import z3.n;

public final class d {
    @l
    public static final d a;

    static {
        d.a = new d();
    }

    @l
    @n
    public static final I0 a(@l LifecycleCoroutineScope lifecycleCoroutineScope0, boolean z, @l a a0) {
        @f(c = "com.dcinside.app.settings.ClearCache$clear$1", f = "ClearCache.kt", i = {0, 1}, l = {27, 40, 46, 0x2F}, m = "invokeSuspend", n = {"context", "context"}, s = {"L$0", "L$0"})
        @s0({"SMAP\nClearCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClearCache.kt\ncom/dcinside/app/settings/ClearCache$clear$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,52:1\n112#2,3:53\n129#2,3:57\n132#2,7:63\n139#2,5:72\n116#2:77\n129#2,3:78\n132#2,7:83\n139#2,5:92\n1#3:56\n37#4:60\n37#4:61\n37#4:62\n37#4:70\n37#4:71\n37#4:81\n37#4:82\n37#4:90\n37#4:91\n*S KotlinDebug\n*F\n+ 1 ClearCache.kt\ncom/dcinside/app/settings/ClearCache$clear$1\n*L\n33#1:53,3\n33#1:57,3\n33#1:63,7\n33#1:72,5\n33#1:77\n33#1:78,3\n33#1:83,7\n33#1:92,5\n33#1:56\n34#1:60\n35#1:61\n36#1:62\n35#1:70\n36#1:71\n35#1:81\n36#1:82\n35#1:90\n36#1:91\n*E\n"})
        static final class com.dcinside.app.settings.d.a extends o implements A3.o {
            Object k;
            int l;
            final boolean m;
            final a n;

            com.dcinside.app.settings.d.a(boolean z, a a0, kotlin.coroutines.d d0) {
                this.m = z;
                this.n = a0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.d.a(this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.settings.d.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.settings.ClearCache$clear$1$1", f = "ClearCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.settings.d.a.a extends o implements A3.o {
                    int k;
                    final Context l;

                    com.dcinside.app.settings.d.a.a(Context context0, kotlin.coroutines.d d0) {
                        this.l = context0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.settings.d.a.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.settings.d.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        WebView webView0 = new WebView(this.l);
                        webView0.clearCache(true);
                        webView0.destroy();
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.settings.ClearCache$clear$1$3", f = "ClearCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class b extends o implements A3.o {
                    int k;
                    final Context l;

                    b(Context context0, kotlin.coroutines.d d0) {
                        this.l = context0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new b(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        com.dcinside.app.glide.a.b(this.l).c();
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.settings.ClearCache$clear$1$4", f = "ClearCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class c extends o implements A3.o {
                    int k;
                    final a l;

                    c(a a0, kotlin.coroutines.d d0) {
                        this.l = a0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new c(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((c)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.invoke();
                        return S0.a;
                    }
                }

                Context context0;
                Class class2;
                Class class1;
                Class class0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        context0 = Application.e.c();
                        if(this.m) {
                            com.dcinside.app.settings.d.a.a d$a$a0 = new com.dcinside.app.settings.d.a.a(context0, null);
                            this.k = context0;
                            this.l = 1;
                            if(i.h(h0.e(), d$a$a0, this) == object1) {
                                return object1;
                            }
                        label_23:
                            File file0 = context0.getCacheDir();
                            L.o(file0, "getCacheDir(...)");
                            if(kotlin.io.m.Y(file0)) {
                                F0 f00 = F0.g4();
                                L.m(f00);
                                boolean z = f00.E0();
                                class0 = k0.class;
                                class1 = j0.class;
                                class2 = com.dcinside.app.realm.f0.class;
                                if(z) {
                                    RealmQuery realmQuery0 = f00.C4(class2);
                                    L.o(realmQuery0, "this.where(T::class.java)");
                                    realmQuery0.p0().L0();
                                    RealmQuery realmQuery1 = f00.C4(class1);
                                    L.o(realmQuery1, "this.where(T::class.java)");
                                    realmQuery1.p0().L0();
                                    RealmQuery realmQuery2 = f00.C4(class0);
                                    L.o(realmQuery2, "this.where(T::class.java)");
                                    realmQuery2.p0().L0();
                                }
                                else {
                                    f00.beginTransaction();
                                    goto label_44;
                                }
                                goto label_64;
                                try {
                                label_44:
                                    RealmQuery realmQuery3 = f00.C4(class2);
                                    L.o(realmQuery3, "this.where(T::class.java)");
                                    realmQuery3.p0().L0();
                                    RealmQuery realmQuery4 = f00.C4(class1);
                                    L.o(realmQuery4, "this.where(T::class.java)");
                                    realmQuery4.p0().L0();
                                    RealmQuery realmQuery5 = f00.C4(class0);
                                    L.o(realmQuery5, "this.where(T::class.java)");
                                    realmQuery5.p0().L0();
                                    f00.p();
                                    goto label_64;
                                }
                                catch(Throwable throwable1) {
                                    try {
                                        if(f00.E0()) {
                                            f00.e();
                                        }
                                        throw throwable1;
                                    }
                                    catch(Throwable throwable0) {
                                    }
                                }
                                try {
                                    throw throwable0;
                                }
                                catch(Throwable throwable2) {
                                    kotlin.io.c.a(f00, throwable0);
                                    throw throwable2;
                                }
                            label_64:
                                kotlin.io.c.a(f00, null);
                            }
                        }
                        else {
                            b d$a$b0 = new b(context0, null);
                            this.k = context0;
                            this.l = 2;
                            if(i.h(h0.e(), d$a$b0, this) == object1) {
                                return object1;
                            }
                            com.dcinside.app.glide.a.b(context0).b();
                            com.facebook.drawee.backends.pipeline.d.b().g();
                        }
                    label_73:
                        this.k = null;
                        this.l = 3;
                        if(a0.b(100L, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        context0 = (Context)this.k;
                        f0.n(object0);
                        goto label_23;
                    }
                    case 2: {
                        context0 = (Context)this.k;
                        f0.n(object0);
                        com.dcinside.app.glide.a.b(context0).b();
                        com.facebook.drawee.backends.pipeline.d.b().g();
                        goto label_73;
                    }
                    case 3: {
                        f0.n(object0);
                        break;
                    }
                    case 4: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                c d$a$c0 = new c(this.n, null);
                this.l = 4;
                return i.h(h0.e(), d$a$c0, this) == object1 ? object1 : S0.a;
            }
        }

        L.p(lifecycleCoroutineScope0, "lifecycleScope");
        L.p(a0, "complete");
        return k.f(lifecycleCoroutineScope0, h0.c(), null, new com.dcinside.app.settings.d.a(z, a0, null), 2, null);
    }
}

