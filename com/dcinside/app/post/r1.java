package com.dcinside.app.post;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.pm.ShortcutInfoCompat.Builder;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.dcinside.app.perform.e;
import com.dcinside.app.settings.launchericon.a;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import kotlin.S0;
import kotlin.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.r0;
import rx.o;
import y4.l;
import y4.m;

public final class r1 {
    @l
    public static final r1 a = null;
    @l
    public static final String b = "actionShortEntered";
    @l
    public static final String c = "shortcutGallery";

    static {
        r1.a = new r1();
    }

    public final boolean c(@l Context context0, @l String s, @l String s1, @m Bitmap bitmap0, @m a a0) {
        Bitmap bitmap1;
        L.p(context0, "context");
        L.p(s, "galleryId");
        L.p(s1, "galleryName");
        String s2 = context0.getString(0x7F1509CF, new Object[]{s1});  // string:shortcut_gall_name "%s 갤러리"
        L.o(s2, "getString(...)");
        if(a0 == null) {
            if(bitmap0 == null) {
                return false;
            }
            bitmap1 = bitmap0;
        }
        else {
            bitmap1 = r1.e(this, context0, null, Al.a.n(context0, a0.c()), 0, 8, null);
        }
        Intent intent0 = new Intent();
        intent0.setComponent(new ComponentName(context0, "com.dcinside.app.MainActivity"));
        intent0.setFlags(0x24010000);
        intent0.setAction("actionShortEntered");
        intent0.putExtra("com.dcinside.app.ignore", System.currentTimeMillis());
        if(s.length() > 0) {
            intent0.putExtra("shortcutGallery", s);
        }
        if(ShortcutManagerCompat.r(context0)) {
            V v0 = s.length() == 0 ? r0.a(s1, s1) : r0.a(s2, s);
            ShortcutManagerCompat.y(context0, new Builder(context0, ((String)v0.b()) + System.currentTimeMillis()).k(intent0).u(((String)v0.a())).j(IconCompat.n(bitmap1)).c(), null);
            return true;
        }
        Dl.D(context0, 0x7F1509CE);  // string:shortcut_confirm_error "홈 화면에 추가할 수 없습니다."
        return false;
    }

    @l
    public final Bitmap d(@l Context context0, @m String s, int v, int v1) {
        L.p(context0, "context");
        Bitmap bitmap0 = BitmapFactory.decodeResource(context0.getResources(), v);
        if(s != null && s.length() != 0) {
            Bitmap bitmap1 = bitmap0.copy(Bitmap.Config.ARGB_8888, true);
            bitmap0.recycle();
            Canvas canvas0 = new Canvas(bitmap1);
            Paint paint0 = new Paint();
            paint0.setColor(v1);
            paint0.setTextAlign(Paint.Align.CENTER);
            paint0.setTextSize(0.0f);
            canvas0.drawText(s, ((float)(bitmap1.getWidth() / 2)), ((float)(bitmap1.getHeight() / 2)) - (paint0.descent() + paint0.ascent()) / 2.0f, paint0);
            L.m(bitmap1);
            return bitmap1;
        }
        L.m(bitmap0);
        return bitmap0;
    }

    public static Bitmap e(r1 r10, Context context0, String s, int v, int v1, int v2, Object object0) {
        if((v2 & 8) != 0) {
            v1 = -1;
        }
        return r10.d(context0, s, v, v1);
    }

    @m
    public final o f(@l AppCompatActivity appCompatActivity0, @l a a0) {
        static final class com.dcinside.app.post.r1.a extends N implements Function1 {
            public static final com.dcinside.app.post.r1.a e;

            static {
                com.dcinside.app.post.r1.a.e = new com.dcinside.app.post.r1.a();
            }

            com.dcinside.app.post.r1.a() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F150062);  // string:add_home_launcher_icon "홈 화면에 앱 아이콘을 추가하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class c extends N implements Function1 {
            final AppCompatActivity e;
            final r1 f;
            final a g;

            c(AppCompatActivity appCompatActivity0, r1 r10, a a0) {
                this.e = appCompatActivity0;
                this.f = r10;
                this.g = a0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.o("디시인사이드", "getString(...)");
                this.f.c(this.e, "", "디시인사이드", null, this.g);
                Dl.E(this.e, 0x7F1509F2, 1);  // string:success_home_launcher_icon "홈 화면에 앱 아이콘을 추가하였습니다."
                this.e.finish();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        L.p(appCompatActivity0, "activity");
        L.p(a0, "selectedIcon");
        return com.dcinside.app.internal.c.o(appCompatActivity0) ? null : e.e.a(appCompatActivity0).n(com.dcinside.app.post.r1.a.e).z(0x7F1509CC).x(0x7F1509CD).b().Z1((Object object0) -> {
            L.p(b.e, "$tmp0");
            return (Boolean)b.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new c(appCompatActivity0, this, a0), "$tmp0");
            new c(appCompatActivity0, this, a0).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean g(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void h(Function1 function10, Object object0) [...]
}

