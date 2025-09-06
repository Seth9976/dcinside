package com.dcinside.app.util;

import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c;
import com.dcinside.app.Application.b;
import com.dcinside.app.Application;
import com.dcinside.app.type.m;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.q0;
import kotlin.text.v;
import y4.l;

@s0({"SMAP\nClipboards.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clipboards.kt\ncom/dcinside/app/util/Clipboards\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,105:1\n31#2:106\n1#3:107\n177#4,9:108\n177#4,9:117\n*S KotlinDebug\n*F\n+ 1 Clipboards.kt\ncom/dcinside/app/util/Clipboards\n*L\n48#1:106\n74#1:108,9\n90#1:117,9\n*E\n"})
public final class Clipboards implements DefaultLifecycleObserver {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[m.values().length];
            try {
                arr_v[m.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.j.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @l
    public static final Clipboards a;
    private static boolean b;

    static {
        Clipboards.a = new Clipboards();
    }

    public final boolean a() {
        if(Clipboards.b) {
            Clipboards.b = false;
            return true;
        }
        return false;
    }

    public final void b(@StringRes int v, @l String s, @l String s1) {
        L.p(s, "label");
        L.p(s1, "text");
        b application$b0 = Application.e;
        Context context0 = application$b0.c();
        if(Build.VERSION.SDK_INT < 33 && v != 0) {
            Dl.D(application$b0.c(), v);
        }
        ClipData clipData0 = ClipData.newPlainText(s, s1);
        ClipboardManager clipboardManager0 = (ClipboardManager)ContextCompat.getSystemService(context0, ClipboardManager.class);
        if(clipboardManager0 != null) {
            clipboardManager0.setPrimaryClip(clipData0);
        }
        dl.a.x4(s1);
    }

    @y4.m
    public final String c(@y4.m ClipboardManager clipboardManager0) {
        ClipData clipData0;
        if(clipboardManager0 != null) {
            try {
                if(!clipboardManager0.hasPrimaryClip()) {
                    clipboardManager0 = null;
                }
                if(clipboardManager0 != null) {
                    clipData0 = clipboardManager0.getPrimaryClip();
                    if(clipData0 != null) {
                        goto label_6;
                    }
                }
            }
            catch(Exception unused_ex) {
            }
            return null;
        label_6:
            if(clipData0.getItemCount() <= 0) {
                clipData0 = null;
            }
            if(clipData0 != null) {
                ClipData.Item clipData$Item0 = clipData0.getItemAt(0);
                if(clipData$Item0 != null) {
                    CharSequence charSequence0 = clipData$Item0.getText();
                    if(charSequence0 != null) {
                        String s = charSequence0.toString();
                        return s != null && (s.length() != 0 && !L.g(dl.a.F0(), s)) ? s : null;
                    }
                }
            }
        }
        try {
        }
        catch(Exception unused_ex) {
        }
        return null;
    }

    @y4.m
    public final q0 d(@l String s) {
        Uri uri0;
        L.p(s, "uriString");
        try {
            uri0 = null;
            uri0 = Uri.parse(s);
        }
        catch(Exception unused_ex) {
        }
        if(uri0 == null) {
            return null;
        }
        String s1 = uri0.getScheme();
        if(s1 != null && (v.v2(s1, "http", false, 2, null) || L.g("dcapp", s1))) {
            int v = Yk.m.match(uri0);
            com.dcinside.app.main.a.a a$a0 = com.dcinside.app.main.a.a.e(uri0, v);
            String s2 = a$a0.a();
            String s3 = a$a0.b();
            m m0 = a$a0.c();
            if(a$a0.d() != null) {
                return null;
            }
            return s2 == null || s2.length() == 0 ? null : new q0(s2, s3, m0);
        }
        return null;
    }

    public final void e(@l AppCompatActivity appCompatActivity0, @l String s, @y4.m String s1, @l m m0) {
        Integer integer0;
        int v;
        L.p(appCompatActivity0, "activity");
        L.p(s, "id");
        L.p(m0, "galleryGrade");
        try {
            if(s1 == null) {
                v = 0;
            }
            else if(s1.length() > 0) {
                v = Integer.parseInt(s1);
            }
            else {
                v = 0;
            }
            integer0 = v;
        }
        catch(Exception unused_ex) {
            integer0 = null;
        }
        int v1 = integer0 == null ? 0 : ((int)integer0);
        StringBuilder stringBuilder0 = new StringBuilder();
        switch(m0) {
            case 3: {
                stringBuilder0.append("mi$");
                break;
            }
            case 4: {
                stringBuilder0.append("pr$");
            }
        }
        stringBuilder0.append(s);
        String s2 = stringBuilder0.toString();
        L.o(s2, "let(...)");
        new com.dcinside.app.util.Xk.a(s2, v1, 0, null, false, false, false, false, false, false, null, false, null, null, 0x3FFC, null).a(appCompatActivity0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void m(LifecycleOwner lifecycleOwner0) {
        c.d(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void n(LifecycleOwner lifecycleOwner0) {
        c.c(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner0) {
        c.b(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner0) {
        c.e(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@l LifecycleOwner lifecycleOwner0) {
        L.p(lifecycleOwner0, "owner");
        Clipboards.b = true;
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void r(LifecycleOwner lifecycleOwner0) {
        c.a(this, lifecycleOwner0);
    }
}

