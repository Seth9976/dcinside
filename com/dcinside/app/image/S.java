package com.dcinside.app.image;

import A3.a;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.resource.gif.c;
import com.bumptech.glide.request.d;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dk;
import java.io.File;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import pl.droidsonroids.gif.e;
import y4.l;
import y4.m;

@s0({"SMAP\nImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoader.kt\ncom/dcinside/app/image/ImageLoaderKt\n*L\n1#1,300:1\n80#1:301\n80#1:302\n80#1:303\n80#1:304\n80#1:305\n80#1:306\n*S KotlinDebug\n*F\n+ 1 ImageLoader.kt\ncom/dcinside/app/image/ImageLoaderKt\n*L\n33#1:301\n41#1:302\n45#1:303\n49#1:304\n53#1:305\n57#1:306\n*E\n"})
public final class s {
    private static final r a(ImageView imageView0, a a0) {
        return s.d(imageView0.getContext()) ? ((r)a0.invoke()) : new q();
    }

    public static final void b(@l ImageView imageView0) {
        L.p(imageView0, "<this>");
        if(!s.d(imageView0.getContext())) {
            return;
        }
        Drawable drawable0 = imageView0.getDrawable();
        if(drawable0 instanceof c) {
            ((c)drawable0).stop();
        }
        else if(drawable0 instanceof e) {
            ((e)drawable0).stop();
        }
        com.dcinside.app.glide.a.l(imageView0).p(imageView0);
    }

    @l
    public static final d c(@l Context context0, @l Uri uri0) {
        L.p(context0, "<this>");
        L.p(uri0, "uri");
        d d0 = com.dcinside.app.glide.a.k(context0).m0().r2(uri0).H1();
        L.o(d0, "submit(...)");
        return d0;
    }

    public static final boolean d(@m Context context0) {
        Context context1 = Al.h(context0);
        return context1 != null && (!(context1 instanceof Activity) || !((Activity)context1).isFinishing() && !((Activity)context1).isDestroyed());
    }

    @l
    public static final r e(@l ImageView imageView0, int v) {
        L.p(imageView0, "<this>");
        if(s.d(imageView0.getContext())) {
            com.dcinside.app.glide.c c0 = com.dcinside.app.glide.a.l(imageView0).r0(v);
            L.o(c0, "load(...)");
            return new p(imageView0, c0);
        }
        return new q();
    }

    @l
    public static final r f(@l ImageView imageView0, @m Uri uri0) {
        L.p(imageView0, "<this>");
        if(s.d(imageView0.getContext())) {
            com.dcinside.app.glide.c c0 = com.dcinside.app.glide.a.l(imageView0).p0(uri0);
            L.o(c0, "load(...)");
            return new p(imageView0, c0);
        }
        return new q();
    }

    @l
    public static final r g(@l ImageView imageView0, @m File file0) {
        L.p(imageView0, "<this>");
        if(s.d(imageView0.getContext())) {
            com.dcinside.app.glide.c c0 = com.dcinside.app.glide.a.l(imageView0).q0(file0);
            L.o(c0, "load(...)");
            return new p(imageView0, c0);
        }
        return new q();
    }

    @l
    public static final r h(@l ImageView imageView0, @m String s) {
        L.p(imageView0, "<this>");
        if(s.d(imageView0.getContext())) {
            com.dcinside.app.glide.c c0 = com.dcinside.app.glide.a.l(imageView0).t0(s);
            L.o(c0, "load(...)");
            return new p(imageView0, c0);
        }
        return new q();
    }

    @l
    public static final r i(@l ImageView imageView0, @m String s) {
        L.p(imageView0, "<this>");
        return s == null ? s.g(imageView0, null) : s.g(imageView0, new File(s));
    }

    public static final void j(@l ImageView imageView0, @m String s) {
        L.p(imageView0, "<this>");
        if(s == null) {
            return;
        }
        if(!s.d(imageView0.getContext())) {
            return;
        }
        com.dcinside.app.glide.a.k(imageView0.getContext()).g0().s2(new File(s)).q1(imageView0);
    }

    public static final void k(@l ImageView imageView0, @m String s, int v) {
        L.p(imageView0, "<this>");
        if(s == null) {
            return;
        }
        if(!s.d(imageView0.getContext())) {
            return;
        }
        com.dcinside.app.glide.a.k(imageView0.getContext()).g0().X2(new n[]{new com.bumptech.glide.load.resource.bitmap.n(), new com.bumptech.glide.load.resource.bitmap.L(Dk.d(v))}).s2(new File(s)).q1(imageView0);
    }

    @l
    public static final r l(@l ImageView imageView0, int v, int v1) {
        L.p(imageView0, "<this>");
        if(s.d(imageView0.getContext())) {
            com.dcinside.app.glide.c c0 = com.dcinside.app.glide.a.l(imageView0).r0(v).X2(new n[]{new com.bumptech.glide.load.resource.bitmap.n(), new com.bumptech.glide.load.resource.bitmap.L(Dk.d(v1))});
            L.o(c0, "transform(...)");
            return new p(imageView0, c0);
        }
        return new q();
    }

    @l
    public static final r m(@l ImageView imageView0, @m String s, int v) {
        L.p(imageView0, "<this>");
        if(s.d(imageView0.getContext())) {
            com.dcinside.app.glide.c c0 = com.dcinside.app.glide.a.l(imageView0).t0(s).X2(new n[]{new com.bumptech.glide.load.resource.bitmap.n(), new com.bumptech.glide.load.resource.bitmap.L(Dk.d(v))});
            L.o(c0, "transform(...)");
            return new p(imageView0, c0);
        }
        return new q();
    }
}

