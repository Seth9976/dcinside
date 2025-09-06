package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface c extends a {
    static class com.google.android.material.circularreveal.c.a {
    }

    public static class b implements TypeEvaluator {
        private final e a;
        public static final TypeEvaluator b;

        static {
            b.b = new b();
        }

        public b() {
            this.a = new e(null);
        }

        @NonNull
        public e a(float f, @NonNull e c$e0, @NonNull e c$e1) {
            this.a.b((1.0f - f) * c$e0.a + f * c$e1.a, (1.0f - f) * c$e0.b + f * c$e1.b, (1.0f - f) * c$e0.c + f * c$e1.c);
            return this.a;
        }

        @Override  // android.animation.TypeEvaluator
        @NonNull
        public Object evaluate(float f, @NonNull Object object0, @NonNull Object object1) {
            return this.a(f, ((e)object0), ((e)object1));
        }
    }

    public static class com.google.android.material.circularreveal.c.c extends Property {
        public static final Property a;

        static {
            com.google.android.material.circularreveal.c.c.a = new com.google.android.material.circularreveal.c.c("circularReveal");
        }

        private com.google.android.material.circularreveal.c.c(String s) {
            super(e.class, s);
        }

        @Nullable
        public e a(@NonNull c c0) {
            return c0.getRevealInfo();
        }

        public void b(@NonNull c c0, @Nullable e c$e0) {
            c0.setRevealInfo(c$e0);
        }

        @Override  // android.util.Property
        @Nullable
        public Object get(@NonNull Object object0) {
            return this.a(((c)object0));
        }

        @Override  // android.util.Property
        public void set(@NonNull Object object0, @Nullable Object object1) {
            this.b(((c)object0), ((e)object1));
        }
    }

    public static class d extends Property {
        public static final Property a;

        static {
            d.a = new d("circularRevealScrimColor");
        }

        private d(String s) {
            super(Integer.class, s);
        }

        @NonNull
        public Integer a(@NonNull c c0) {
            return c0.getCircularRevealScrimColor();
        }

        public void b(@NonNull c c0, @NonNull Integer integer0) {
            c0.setCircularRevealScrimColor(((int)integer0));
        }

        @Override  // android.util.Property
        @NonNull
        public Object get(@NonNull Object object0) {
            return this.a(((c)object0));
        }

        @Override  // android.util.Property
        public void set(@NonNull Object object0, @NonNull Object object1) {
            this.b(((c)object0), ((Integer)object1));
        }
    }

    public static class e {
        public float a;
        public float b;
        public float c;
        public static final float d = 3.402823E+38f;

        private e() {
        }

        public e(float f, float f1, float f2) {
            this.a = f;
            this.b = f1;
            this.c = f2;
        }

        e(com.google.android.material.circularreveal.c.a c$a0) {
        }

        public e(@NonNull e c$e0) {
            this(c$e0.a, c$e0.b, c$e0.c);
        }

        public boolean a() {
            return this.c == 3.402823E+38f;
        }

        public void b(float f, float f1, float f2) {
            this.a = f;
            this.b = f1;
            this.c = f2;
        }

        public void c(@NonNull e c$e0) {
            this.b(c$e0.a, c$e0.b, c$e0.c);
        }
    }

    void b();

    void draw(Canvas arg1);

    void e();

    @Nullable
    Drawable getCircularRevealOverlayDrawable();

    @ColorInt
    int getCircularRevealScrimColor();

    @Nullable
    e getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@Nullable Drawable arg1);

    void setCircularRevealScrimColor(@ColorInt int arg1);

    void setRevealInfo(@Nullable e arg1);
}

