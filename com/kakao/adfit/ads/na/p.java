package com.kakao.adfit.ads.na;

import A3.o;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.AudioFocusRequest;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.view.Surface;
import com.kakao.adfit.c.b;
import com.kakao.adfit.e.g;
import com.kakao.adfit.m.l;
import com.kakao.adfit.n.c;
import java.util.List;
import kotlin.J;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

public final class p implements AudioManager.OnAudioFocusChangeListener, h {
    private final Context a;
    private final g b;
    private final f c;
    private final b d;
    private a e;
    private final String f;
    private Drawable g;
    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private boolean m;
    private com.kakao.adfit.l.b n;
    private boolean o;
    private final c p;
    private boolean q;
    private boolean r;
    private final AudioManager s;
    private AudioFocusRequest t;
    private boolean u;

    public p(Context context0, g g0, f m$f0, b b0) {
        static final class d extends N implements Function1 {
            final p a;

            d(p p0) {
                this.a = p0;
                super(1);
            }

            public final void a(String s) {
                L.p(s, "it");
                Context context0 = this.a.a;
                com.kakao.adfit.a.h.c.a(context0).a(s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((String)object0));
                return S0.a;
            }
        }

        L.p(context0, "context");
        L.p(g0, "view");
        L.p(m$f0, "video");
        L.p(b0, "policy");
        super();
        this.a = context0;
        this.b = g0;
        this.c = m$f0;
        this.d = b0;
        this.e = a.b;
        this.h = 16;
        this.i = 9;
        this.j = m$f0.a();
        this.k = m$f0.d();
        this.l = m$f0.c() ? 0.0f : 1.0f;
        c c0 = new c(m$f0, new d(this));
        this.p = c0;
        Object object0 = context0.getSystemService("audio");
        L.n(object0, "null cannot be cast to non-null type android.media.AudioManager");
        this.s = (AudioManager)object0;
        com.kakao.adfit.n.d d0 = this.a(m$f0.e().c());
        String s = "";
        if(d0 == null) {
            this.f = "";
        }
        else {
            String s1 = d0.c();
            if(s1 != null) {
                s = s1;
            }
            this.f = s;
            this.h = d0.d();
            this.i = d0.b();
        }
        this.n = this.r();
        if(c0.b() && c0.a()) {
            c0.k();
        }
    }

    private final com.kakao.adfit.n.d a(List list0) {
        if(list0 != null) {
            com.kakao.adfit.n.d d0 = (com.kakao.adfit.n.d)u.G2(list0);
            if(d0 != null) {
                if(list0.size() == 1) {
                    return d0;
                }
                if(!com.kakao.adfit.m.u.d(this.a)) {
                    for(Object object0: list0) {
                        com.kakao.adfit.n.d d1 = (com.kakao.adfit.n.d)object0;
                        int v = d0.d() * d0.b();
                        int v1 = d1.d() * d1.b();
                        if(v > v1 || v == v1 && d0.a() > d1.a()) {
                            d0 = d1;
                        }
                    }
                    return d0;
                }
                Point point0 = l.a(l.a(this.a), null, 2, null);
                int v2 = l.b(this.a, Math.min(point0.x, point0.y));
                for(Object object1: list0) {
                    com.kakao.adfit.n.d d2 = (com.kakao.adfit.n.d)object1;
                    int v3 = Math.abs(v2 - d0.d());
                    int v4 = Math.abs(v2 - d2.d());
                    if(v3 > v4) {
                        d0 = d2;
                    }
                    else if(v3 == v4) {
                        int v5 = d0.d() * d0.b();
                        int v6 = d2.d() * d2.b();
                        if(v5 < v6 || v5 == v6 && d0.a() < d2.a()) {
                            d0 = d2;
                        }
                    }
                }
                return d0;
            }
        }
        return null;
    }

    static void a(p p0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        p0.b(f);
    }

    @Override  // com.kakao.adfit.ads.na.g
    public int a() {
        return this.i;
    }

    public void a(float f) {
        if(this.l != f) {
            this.l = f;
            if(f > 0.0f) {
                this.c.a(false);
                this.b(f);
                return;
            }
            this.c.a(true);
            this.w();
        }
    }

    public void a(Drawable drawable0) {
        if(!L.g(this.g, drawable0)) {
            this.g = drawable0;
            this.b.updateVideoAdImage();
        }
    }

    @Override  // com.kakao.adfit.ads.na.g
    public void a(Surface surface0) {
        L.p(surface0, "surface");
        this.n.a(surface0);
        if(this.o) {
            this.b();
        }
    }

    public void a(boolean z) {
        this.a(z, this.r);
    }

    public void a(boolean z, boolean z1) {
        if(this.q == z && this.r == z1) {
            return;
        }
        this.q = z;
        this.r = z1;
        if(z) {
            if(this.o) {
                this.b();
                return;
            }
            if(z1 && (this.d.a() || this.d.b() && com.kakao.adfit.m.u.d(this.a))) {
                if(!this.n.g() && this.l() > 0.0f) {
                    this.w();
                }
                this.b();
            }
        }
        else {
            this.s();
        }
    }

    private final void b(float f) {
        this.a(f);
        if(this.n.m()) {
            if(!this.n()) {
                this.w();
                return;
            }
            if(this.n.g()) {
                if(!this.u) {
                    this.v();
                    if(!this.u) {
                        this.w();
                        return;
                    }
                }
                this.n.a(f);
            }
        }
        this.b.updateVideoAdVolume();
    }

    @Override  // com.kakao.adfit.ads.na.g
    public void b() {
        if(!this.n.m()) {
            this.t();
            this.o = true;
            return;
        }
        Surface surface0 = this.n.f();
        if(surface0 != null && surface0.isValid()) {
            if(!this.q) {
                this.o = true;
                a g$a0 = this.m();
                if(g$a0 == a.b || g$a0 == a.e) {
                    this.e = a.c;
                    this.b.updateVideoAdViewState();
                }
                return;
            }
            if(this.l() <= 0.0f) {
                this.n.a(0.0f);
            }
            else if(this.n()) {
                if(!this.u) {
                    this.v();
                }
                if(this.u) {
                    this.n.a(1.0f);
                }
                else {
                    this.w();
                }
            }
            else {
                this.w();
            }
            this.n.b();
            return;
        }
        this.o = true;
        a g$a1 = this.m();
        if(g$a1 == a.b || g$a1 == a.e) {
            this.e = a.c;
            this.b.updateVideoAdViewState();
        }
    }

    @Override  // com.kakao.adfit.ads.na.g
    public int c() {
        return this.h;
    }

    @Override  // com.kakao.adfit.ads.na.g
    public int d() {
        return this.j;
    }

    @Override  // com.kakao.adfit.ads.na.g
    public void e() {
        this.s();
    }

    @Override  // com.kakao.adfit.ads.na.g
    public void f() {
        this.p.j();
        p.a(this, 0.0f, 1, null);
    }

    @Override  // com.kakao.adfit.ads.na.g
    public void g() {
        this.n.a(null);
        this.n.h();
    }

    @Override  // com.kakao.adfit.ads.na.g
    public void h() {
        this.p.g();
    }

    @Override  // com.kakao.adfit.e.f
    public int i() {
        return 2;
    }

    @Override  // com.kakao.adfit.ads.na.g
    public void j() {
        if(this.n.d() != com.kakao.adfit.l.b.d.j) {
            return;
        }
        Surface surface0 = this.n.f();
        this.n.a(null);
        this.n.c(null);
        this.n.a(null);
        this.n.e();
        com.kakao.adfit.l.b b0 = this.r();
        this.n = b0;
        b0.a(surface0);
        this.b();
    }

    @Override  // com.kakao.adfit.ads.na.g
    public void k() {
        this.p.e();
        this.w();
    }

    @Override  // com.kakao.adfit.ads.na.g
    public float l() {
        return this.l;
    }

    @Override  // com.kakao.adfit.ads.na.g
    public a m() {
        return this.e;
    }

    @Override  // com.kakao.adfit.ads.na.g
    public boolean n() {
        return this.m;
    }

    @Override  // com.kakao.adfit.ads.na.g
    public Drawable o() {
        return this.g;
    }

    @Override  // android.media.AudioManager$OnAudioFocusChangeListener
    public void onAudioFocusChange(int v) {
        switch(v) {
            case -3: {
                if(this.u) {
                    this.n.a(this.l() * 0.1f);
                }
                break;
            }
            case -2: 
            case -1: {
                if(this.u && this.n.g()) {
                    this.s();
                    return;
                }
                this.n.a(0.0f);
                return;
            }
            case 1: 
            case 2: 
            case 3: {
                if(this.u) {
                    this.n.a(this.l());
                    return;
                }
                break;
            }
        }
    }

    @Override  // com.kakao.adfit.ads.na.g
    public int p() {
        return this.k;
    }

    private final void q() {
        if(!this.u) {
            return;
        }
        try {
            this.u = false;
            if(Build.VERSION.SDK_INT < 26) {
                this.s.abandonAudioFocus(this);
                return;
            }
            AudioFocusRequest audioFocusRequest0 = this.t;
            if(audioFocusRequest0 != null) {
                this.s.abandonAudioFocusRequest(audioFocusRequest0);
            }
        }
        catch(Exception exception0) {
            com.kakao.adfit.m.f.b(("Failed to abandon audio focus. : " + exception0));
            com.kakao.adfit.common.matrix.c.a.a(exception0);
        }
    }

    private final com.kakao.adfit.l.b r() {
        static final class com.kakao.adfit.ads.na.p.a extends N implements o {
            public abstract class com.kakao.adfit.ads.na.p.a.a {
                public static final int[] a;

                static {
                    int[] arr_v = new int[com.kakao.adfit.l.b.d.values().length];
                    try {
                        arr_v[com.kakao.adfit.l.b.d.d.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[com.kakao.adfit.l.b.d.e.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[com.kakao.adfit.l.b.d.f.ordinal()] = 3;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[com.kakao.adfit.l.b.d.h.ordinal()] = 4;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[com.kakao.adfit.l.b.d.g.ordinal()] = 5;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[com.kakao.adfit.l.b.d.j.ordinal()] = 6;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[com.kakao.adfit.l.b.d.a.ordinal()] = 7;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[com.kakao.adfit.l.b.d.b.ordinal()] = 8;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[com.kakao.adfit.l.b.d.c.ordinal()] = 9;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[com.kakao.adfit.l.b.d.i.ordinal()] = 10;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    com.kakao.adfit.ads.na.p.a.a.a = arr_v;
                }
            }

            final p a;
            final com.kakao.adfit.l.b b;

            com.kakao.adfit.ads.na.p.a(p p0, com.kakao.adfit.l.b b0) {
                this.a = p0;
                this.b = b0;
                super(2);
            }

            public final void a(com.kakao.adfit.l.b b0, com.kakao.adfit.l.b.d b$d0) {
                a g$a0;
                L.p(b0, "<anonymous parameter 0>");
                L.p(b$d0, "playerState");
                if(this.a.u && b$d0 != com.kakao.adfit.l.b.d.e) {
                    this.b.a(0.0f);
                    this.a.q();
                }
                if(this.a.n() && !this.b.m()) {
                    this.a.m = false;
                }
                int[] arr_v = com.kakao.adfit.ads.na.p.a.a.a;
                switch(arr_v[b$d0.ordinal()]) {
                    case 1: {
                        if(this.b.m()) {
                            int v = this.b.c();
                            this.a.h = v;
                            int v1 = this.b.a();
                            this.a.i = v1;
                            this.a.b.updateVideoAdSize();
                            boolean z = this.b.i();
                            this.a.m = z;
                            if(!this.a.n() && this.a.l() > 0.0f) {
                                this.a.w();
                            }
                            int v2 = this.b.k();
                            if(this.a.d() != v2) {
                                this.a.j = v2;
                                this.a.c.a(v2);
                                this.a.p.a(v2);
                                this.a.b.updateVideoAdProgress();
                            }
                            int v3 = this.a.p();
                            if(v3 > 0) {
                                this.b.a(v3);
                            }
                            if(this.a.o) {
                                this.a.b();
                            }
                        }
                        break;
                    }
                    case 2: {
                        if(this.a.p.b()) {
                            this.a.p.h();
                        }
                        else {
                            this.a.p.i();
                        }
                        break;
                    }
                    case 3: 
                    case 4: {
                        this.a.p.f();
                        break;
                    }
                    case 5: {
                        this.a.c.b(0);
                        this.a.p.c();
                        break;
                    }
                    case 6: {
                        this.a.p.d();
                    }
                }
                p p0 = this.a;
                switch(arr_v[b$d0.ordinal()]) {
                    case 1: {
                        g$a0 = this.a.o ? a.c : a.b;
                        break;
                    }
                    case 2: {
                        g$a0 = this.b.l() ? a.c : a.d;
                        break;
                    }
                    case 3: {
                        g$a0 = a.e;
                        break;
                    }
                    case 5: {
                        g$a0 = a.f;
                        break;
                    }
                    case 6: {
                        g$a0 = a.g;
                        break;
                    }
                    case 4: 
                    case 7: 
                    case 8: {
                        g$a0 = a.b;
                        break;
                    }
                    case 9: {
                        g$a0 = a.c;
                        break;
                    }
                    case 10: {
                        g$a0 = a.a;
                        break;
                    }
                    default: {
                        throw new J();
                    }
                }
                p0.e = g$a0;
                this.a.b.updateVideoAdViewState();
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((com.kakao.adfit.l.b)object0), ((com.kakao.adfit.l.b.d)object1));
                return S0.a;
            }
        }


        static final class com.kakao.adfit.ads.na.p.b extends N implements o {
            final p a;
            final com.kakao.adfit.l.b b;

            com.kakao.adfit.ads.na.p.b(p p0, com.kakao.adfit.l.b b0) {
                this.a = p0;
                this.b = b0;
                super(2);
            }

            public final void a(com.kakao.adfit.l.b b0, boolean z) {
                L.p(b0, "<anonymous parameter 0>");
                if(z) {
                    if(this.a.m() == a.d) {
                        this.a.e = a.c;
                        this.a.b.updateVideoAdViewState();
                    }
                }
                else if(this.a.m() == a.c && this.b.d() == com.kakao.adfit.l.b.d.e) {
                    this.a.e = a.d;
                    this.a.b.updateVideoAdViewState();
                }
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((com.kakao.adfit.l.b)object0), ((Boolean)object1).booleanValue());
                return S0.a;
            }
        }


        static final class com.kakao.adfit.ads.na.p.c extends N implements o {
            final p a;
            final com.kakao.adfit.l.b b;

            com.kakao.adfit.ads.na.p.c(p p0, com.kakao.adfit.l.b b0) {
                this.a = p0;
                this.b = b0;
                super(2);
            }

            public final void a(com.kakao.adfit.l.b b0, int v) {
                L.p(b0, "<anonymous parameter 0>");
                this.a.k = v;
                if(this.b.d() != com.kakao.adfit.l.b.d.g) {
                    this.a.c.b(v);
                }
                this.a.p.b(v);
                this.a.b.updateVideoAdProgress();
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((com.kakao.adfit.l.b)object0), ((Number)object1).intValue());
                return S0.a;
            }
        }

        com.kakao.adfit.l.b b0 = com.kakao.adfit.l.c.a.a(this.a, this.f);
        b0.c(new com.kakao.adfit.ads.na.p.a(this, b0));
        b0.b(new com.kakao.adfit.ads.na.p.b(this, b0));
        b0.a(new com.kakao.adfit.ads.na.p.c(this, b0));
        return b0;
    }

    public void s() {
        if(this.o) {
            this.o = false;
            if(this.m() == a.c && this.n.d() != com.kakao.adfit.l.b.d.c) {
                this.e = a.e;
                this.b.updateVideoAdViewState();
            }
        }
        this.n.h();
    }

    public void t() {
        if(this.n.d() == com.kakao.adfit.l.b.d.i) {
            Surface surface0 = this.n.f();
            com.kakao.adfit.l.b b0 = this.r();
            this.n = b0;
            b0.a(surface0);
        }
        if(!this.n.m()) {
            this.n.j();
        }
    }

    public void u() {
        this.n.e();
        this.n.c(null);
        this.n.a(null);
    }

    private final void v() {
        if(this.u) {
            return;
        }
        try {
            this.u = true;
            if(Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest0 = this.t;
                if(audioFocusRequest0 == null) {
                    audioFocusRequest0 = androidx.media3.exoplayer.g.a(2).setOnAudioFocusChangeListener(this).build();
                    L.m(audioFocusRequest0);
                }
                if(this.s.requestAudioFocus(audioFocusRequest0) != 1) {
                    com.kakao.adfit.m.f.e("Failed to request audio focus.");
                    this.u = false;
                }
            }
            else if(this.s.requestAudioFocus(this, 3, 2) != 1) {
                com.kakao.adfit.m.f.e("Failed to request audio focus.");
                this.u = false;
            }
        }
        catch(Exception exception0) {
            this.u = false;
            com.kakao.adfit.m.f.b(("Failed to request audio focus. : " + exception0));
            com.kakao.adfit.common.matrix.c.a.a(exception0);
        }
        if(!this.u) {
            try {
                if(Build.VERSION.SDK_INT >= 26) {
                    AudioFocusRequest audioFocusRequest1 = this.t;
                    if(audioFocusRequest1 != null) {
                        this.s.abandonAudioFocusRequest(audioFocusRequest1);
                    }
                }
                else {
                    this.s.abandonAudioFocus(this);
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    private final void w() {
        this.a(0.0f);
        this.n.a(0.0f);
        this.q();
        this.b.updateVideoAdVolume();
    }
}

