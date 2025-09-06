package com.google.android.material.color;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.color.utilities.A2;
import com.google.android.material.color.utilities.P2;

public class q {
    class a implements f {
        a() {
            super();
        }

        @Override  // com.google.android.material.color.p$f
        public boolean a(@NonNull Activity activity0, int v) {
            return true;
        }
    }

    class b implements e {
        b() {
            super();
        }

        @Override  // com.google.android.material.color.p$e
        public void a(@NonNull Activity activity0) {
        }
    }

    public static class c {
        @StyleRes
        private int a;
        @NonNull
        private f b;
        @NonNull
        private e c;
        @Nullable
        private Bitmap d;
        @Nullable
        private Integer e;

        public c() {
            this.b = q.e;
            this.c = q.f;
        }

        @NonNull
        public q f() {
            return new q(this, null);
        }

        @O1.a
        @NonNull
        public c g(@ColorInt int v) {
            this.d = null;
            this.e = v;
            return this;
        }

        @O1.a
        @NonNull
        public c h(@NonNull Bitmap bitmap0) {
            this.d = bitmap0;
            this.e = null;
            return this;
        }

        @O1.a
        @NonNull
        public c i(@NonNull e p$e0) {
            this.c = p$e0;
            return this;
        }

        @O1.a
        @NonNull
        public c j(@NonNull f p$f0) {
            this.b = p$f0;
            return this;
        }

        @O1.a
        @NonNull
        public c k(@StyleRes int v) {
            this.a = v;
            return this;
        }
    }

    @StyleRes
    private final int a;
    @NonNull
    private final f b;
    @NonNull
    private final e c;
    @Nullable
    private Integer d;
    private static final f e;
    private static final e f;

    static {
        q.e = new a();
        q.f = new b();
    }

    private q(c q$c0) {
        this.a = q$c0.a;
        this.b = q$c0.b;
        this.c = q$c0.c;
        if(q$c0.e != null) {
            this.d = q$c0.e;
            return;
        }
        if(q$c0.d != null) {
            this.d = q.c(q$c0.d);
        }
    }

    q(c q$c0, a q$a0) {
        this(q$c0);
    }

    private static int c(Bitmap bitmap0) {
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        int[] arr_v = new int[v * v1];
        bitmap0.getPixels(arr_v, 0, v, 0, 0, v, v1);
        return (int)(((Integer)P2.a(A2.a(arr_v, 0x80)).get(0)));
    }

    @Nullable
    public Integer d() {
        return this.d;
    }

    @NonNull
    public e e() {
        return this.c;
    }

    @NonNull
    public f f() {
        return this.b;
    }

    @StyleRes
    public int g() {
        return this.a;
    }
}

