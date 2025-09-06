package com.google.firebase.sessions.settings;

import A3.o;
import android.net.Uri.Builder;
import com.google.firebase.sessions.b;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map.Entry;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.S0;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import org.json.JSONObject;
import y4.l;
import y4.m;

public final class d implements a {
    public static final class com.google.firebase.sessions.settings.d.a {
        private com.google.firebase.sessions.settings.d.a() {
        }

        public com.google.firebase.sessions.settings.d.a(w w0) {
        }
    }

    @l
    private final b a;
    @l
    private final g b;
    @l
    private final String c;
    @l
    public static final com.google.firebase.sessions.settings.d.a d = null;
    @l
    private static final String e = "firebase-settings.crashlytics.com";
    @l
    private static final String f = "android";

    static {
        d.d = new com.google.firebase.sessions.settings.d.a(null);
    }

    public d(@l b b0, @l g g0, @l String s) {
        L.p(b0, "appInfo");
        L.p(g0, "blockingDispatcher");
        L.p(s, "baseUrl");
        super();
        this.a = b0;
        this.b = g0;
        this.c = s;
    }

    public d(b b0, g g0, String s, int v, w w0) {
        if((v & 4) != 0) {
            s = "firebase-settings.crashlytics.com";
        }
        this(b0, g0, s);
    }

    @Override  // com.google.firebase.sessions.settings.a
    @m
    public Object a(@l Map map0, @l o o0, @l o o1, @l kotlin.coroutines.d d0) {
        @f(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", i = {}, l = {68, 70, 73}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nRemoteSettingsFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSettingsFetcher.kt\ncom/google/firebase/sessions/settings/RemoteSettingsFetcher$doConfigFetch$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n215#2,2:101\n1#3:103\n*S KotlinDebug\n*F\n+ 1 RemoteSettingsFetcher.kt\ncom/google/firebase/sessions/settings/RemoteSettingsFetcher$doConfigFetch$2\n*L\n53#1:101,2\n*E\n"})
        static final class com.google.firebase.sessions.settings.d.b extends kotlin.coroutines.jvm.internal.o implements o {
            int k;
            final d l;
            final Map m;
            final o n;
            final o o;

            com.google.firebase.sessions.settings.d.b(d d0, Map map0, o o0, o o1, kotlin.coroutines.d d1) {
                this.l = d0;
                this.m = map0;
                this.n = o0;
                this.o = o1;
                super(2, d1);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.google.firebase.sessions.settings.d.b(this.l, this.m, this.n, this.o, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.google.firebase.sessions.settings.d.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        try {
                            URLConnection uRLConnection0 = this.l.c().openConnection();
                            L.n(uRLConnection0, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                            ((HttpsURLConnection)uRLConnection0).setRequestMethod("GET");
                            ((HttpsURLConnection)uRLConnection0).setRequestProperty("Accept", "application/json");
                            for(Object object2: this.m.entrySet()) {
                                ((HttpsURLConnection)uRLConnection0).setRequestProperty(((String)((Map.Entry)object2).getKey()), ((String)((Map.Entry)object2).getValue()));
                            }
                            int v = ((HttpsURLConnection)uRLConnection0).getResponseCode();
                            if(v == 200) {
                                InputStream inputStream0 = ((HttpsURLConnection)uRLConnection0).getInputStream();
                                BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0));
                                StringBuilder stringBuilder0 = new StringBuilder();
                                h l0$h0 = new h();
                                while(true) {
                                    String s = bufferedReader0.readLine();
                                    l0$h0.a = s;
                                    if(s == null) {
                                        break;
                                    }
                                    stringBuilder0.append(s);
                                }
                                bufferedReader0.close();
                                inputStream0.close();
                                JSONObject jSONObject0 = new JSONObject(stringBuilder0.toString());
                                this.k = 1;
                                if(this.n.invoke(jSONObject0, this) == object1) {
                                    return object1;
                                }
                            }
                            else {
                                this.k = 2;
                                if(this.o.invoke("Bad response code: " + v, this) == object1) {
                                    return object1;
                                }
                            }
                        }
                        catch(Exception exception0) {
                        label_38:
                            this.k = 3;
                            if(this.o.invoke((exception0.getMessage() == null ? exception0.toString() : exception0.getMessage()), this) == object1) {
                                return object1;
                            }
                        }
                        return S0.a;
                    }
                    case 1: 
                    case 2: {
                        try {
                            f0.n(object0);
                            return S0.a;
                        }
                        catch(Exception exception0) {
                            goto label_38;
                        }
                    }
                    case 3: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        com.google.firebase.sessions.settings.d.b d$b0 = new com.google.firebase.sessions.settings.d.b(this, map0, o0, o1, null);
        Object object0 = i.h(this.b, d$b0, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    private final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.a.j()).appendPath("settings").appendQueryParameter("build_version", this.a.i().i()).appendQueryParameter("display_version", this.a.i().n()).build().toString());
    }
}

