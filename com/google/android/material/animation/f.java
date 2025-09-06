package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

public class f extends Property {
    private final WeakHashMap a;
    public static final Property b;

    static {
        f.b = new f();
    }

    private f() {
        super(Integer.class, "drawableAlphaCompat");
        this.a = new WeakHashMap();
    }

    @Nullable
    public Integer a(@NonNull Drawable drawable0) {
        return drawable0.getAlpha();
    }

    public void b(@NonNull Drawable drawable0, @NonNull Integer integer0) {
        drawable0.setAlpha(((int)integer0));
    }

    @Override  // android.util.Property
    @Nullable
    public Object get(@NonNull Object object0) {
        return this.a(((Drawable)object0));
    }

    @Override  // android.util.Property
    public void set(@NonNull Object object0, @NonNull Object object1) {
        this.b(((Drawable)object0), ((Integer)object1));
    }
}

