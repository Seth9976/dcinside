package com.kakao.adfit.m;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k;

public final class d {
    static final class a extends e {
        private final long c;

        public a(String s, boolean z, long v) {
            L.p(s, "id");
            super(s, z);
            this.c = v;
        }

        public a(String s, boolean z, long v, int v1, w w0) {
            if((v1 & 4) != 0) {
                v = System.currentTimeMillis();
            }
            this(s, z, v);
        }

        public final long c() {
            return this.c;
        }
    }

    public static final d a;
    private static a b;
    private static long c;

    static {
        d.a = new d();
    }

    private final a a(Context context0) {
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(context0);
            String s = advertisingIdClient$Info0.getId();
            L.o(s, "src.id");
            a d$a0 = new a(s, advertisingIdClient$Info0.isLimitAdTrackingEnabled(), 0L, 4, null);
            f.c(("Get Advertising Id from Google Play services. [id = " + d$a0.a() + "] [isLimitAdTrackingEnabled = " + d$a0.b() + ']'));
            return d$a0;
        }
        catch(ClassNotFoundException unused_ex) {
            f.b("Failed to get Advertising Id from Google Play services. [error = Could not find API class]");
            return null;
        }
        catch(Exception exception0) {
            f.b(("Failed to get Advertising Id from Google Play services: [error = " + exception0.getMessage() + ']'));
            return null;
        }
    }

    private final void a(Context context0, a d$a0) {
        B.a(context0).edit().putString("adfit_adid", d$a0.a()).putBoolean("adfit_limited", d$a0.b()).putLong("adfit_cached_time", d$a0.c()).apply();
    }

    public final e b(Context context0) {
        L.p(context0, "context");
        a d$a0 = d.b;
        if(d$a0 == null) {
            d$a0 = this.d(context0);
            if(d$a0 != null) {
                d.b = d$a0;
            }
        }
        if(d$a0 != null) {
            long v = d$a0.c();
            if(System.currentTimeMillis() <= v && v <= v + 60000L) {
                return d$a0;
            }
        }
        this.e(context0);
        e e0 = d.b;
        return e0 == null ? new e("", true) : e0;
    }

    public final void c(Context context0) {
        L.p(context0, "context");
        if(d.b == null) {
            this.e(context0);
        }
    }

    private final a d(Context context0) {
        SharedPreferences sharedPreferences0 = B.a(context0);
        if(sharedPreferences0.contains("adfit_adid") && sharedPreferences0.contains("adfit_limited")) {
            String s = "";
            String s1 = sharedPreferences0.getString("adfit_adid", "");
            if(s1 != null) {
                s = s1;
            }
            return new a(s, sharedPreferences0.getBoolean("adfit_limited", true), sharedPreferences0.getLong("adfit_cached_time", 0L));
        }
        return null;
    }

    private final void e(Context context0) {
        static final class b extends o implements A3.o {
            int a;
            final Context b;

            b(Context context0, kotlin.coroutines.d d0) {
                this.b = context0;
                super(2, d0);
            }

            public final Object a(O o0, kotlin.coroutines.d d0) {
                return ((b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                return new b(this.b, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                static final class com.kakao.adfit.m.d.b.a extends o implements A3.o {
                    int a;
                    final Context b;

                    com.kakao.adfit.m.d.b.a(Context context0, kotlin.coroutines.d d0) {
                        this.b = context0;
                        super(2, d0);
                    }

                    public final Object a(O o0, kotlin.coroutines.d d0) {
                        return ((com.kakao.adfit.m.d.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                        return new com.kakao.adfit.m.d.b.a(this.b, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object object0) {
                        if(this.a != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        return d.a.a(this.b);
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.a) {
                    case 0: {
                        f0.n(object0);
                        if(d.b == null) {
                            d.b = d.a.d(this.b);
                        }
                        com.kakao.adfit.m.d.b.a d$b$a0 = new com.kakao.adfit.m.d.b.a(this.b, null);
                        this.a = 1;
                        object0 = i.h(h0.c(), d$b$a0, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                a d$a0 = (a)object0;
                if(d$a0 == null) {
                    d$a0 = new a("", true, 0L, 4, null);
                }
                d.b = d$a0;
                d.a.a(this.b, d$a0);
                return S0.a;
            }
        }

        long v = SystemClock.elapsedRealtime();
        if(d.c > v) {
            return;
        }
        d.c = v + 10000L;
        k.f(P.a(j1.c(null, 1, null).plus(h0.e().u1())), null, null, new b(context0, null), 3, null);
    }
}

