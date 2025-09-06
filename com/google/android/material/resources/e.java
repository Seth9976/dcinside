package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.R.styleable;

@RestrictTo({Scope.b})
public class e {
    @Nullable
    public final ColorStateList a;
    @Nullable
    public final ColorStateList b;
    @Nullable
    public final ColorStateList c;
    @Nullable
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final float h;
    public final float i;
    public final float j;
    public final boolean k;
    public final float l;
    @Nullable
    private ColorStateList m;
    private float n;
    @FontRes
    private final int o;
    private boolean p;
    private Typeface q;
    private static final String r = "TextAppearance";
    private static final int s = 1;
    private static final int t = 2;
    private static final int u = 3;

    public e(@NonNull Context context0, @StyleRes int v) {
        this.p = false;
        TypedArray typedArray0 = context0.obtainStyledAttributes(v, styleable.TextAppearance);
        this.l(typedArray0.getDimension(styleable.TextAppearance_android_textSize, 0.0f));
        this.k(d.a(context0, typedArray0, styleable.TextAppearance_android_textColor));
        this.a = d.a(context0, typedArray0, styleable.TextAppearance_android_textColorHint);
        this.b = d.a(context0, typedArray0, styleable.TextAppearance_android_textColorLink);
        this.e = typedArray0.getInt(styleable.TextAppearance_android_textStyle, 0);
        this.f = typedArray0.getInt(styleable.TextAppearance_android_typeface, 1);
        int v1 = d.g(typedArray0, styleable.TextAppearance_fontFamily, styleable.TextAppearance_android_fontFamily);
        this.o = typedArray0.getResourceId(v1, 0);
        this.d = typedArray0.getString(v1);
        this.g = typedArray0.getBoolean(styleable.TextAppearance_textAllCaps, false);
        this.c = d.a(context0, typedArray0, styleable.TextAppearance_android_shadowColor);
        this.h = typedArray0.getFloat(styleable.TextAppearance_android_shadowDx, 0.0f);
        this.i = typedArray0.getFloat(styleable.TextAppearance_android_shadowDy, 0.0f);
        this.j = typedArray0.getFloat(styleable.TextAppearance_android_shadowRadius, 0.0f);
        typedArray0.recycle();
        TypedArray typedArray1 = context0.obtainStyledAttributes(v, styleable.MaterialTextAppearance);
        this.k = typedArray1.hasValue(styleable.MaterialTextAppearance_android_letterSpacing);
        this.l = typedArray1.getFloat(styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
        typedArray1.recycle();
    }

    private void d() {
        if(this.q == null) {
            String s = this.d;
            if(s != null) {
                this.q = Typeface.create(s, this.e);
            }
        }
        if(this.q == null) {
            switch(this.f) {
                case 1: {
                    this.q = Typeface.SANS_SERIF;
                    break;
                }
                case 2: {
                    this.q = Typeface.SERIF;
                    break;
                }
                case 3: {
                    this.q = Typeface.MONOSPACE;
                    break;
                }
                default: {
                    this.q = Typeface.DEFAULT;
                }
            }
            this.q = Typeface.create(this.q, this.e);
        }
    }

    public Typeface e() {
        this.d();
        return this.q;
    }

    @NonNull
    @VisibleForTesting
    public Typeface f(@NonNull Context context0) {
        if(this.p) {
            return this.q;
        }
        if(!context0.isRestricted()) {
            try {
                Typeface typeface0 = ResourcesCompat.j(context0, this.o);
                this.q = typeface0;
                if(typeface0 != null) {
                    this.q = Typeface.create(typeface0, this.e);
                }
                goto label_10;
            }
            catch(UnsupportedOperationException exception0) {
            }
            catch(Resources.NotFoundException | Exception unused_ex) {
                goto label_10;
            }
            Log.d("TextAppearance", "Error loading font " + this.d, exception0);
        }
    label_10:
        this.d();
        this.p = true;
        return this.q;
    }

    public void g(@NonNull Context context0, @NonNull TextPaint textPaint0, @NonNull g g0) {
        class b extends g {
            final Context a;
            final TextPaint b;
            final g c;
            final e d;

            b(Context context0, TextPaint textPaint0, g g0) {
                this.a = context0;
                this.b = textPaint0;
                this.c = g0;
                super();
            }

            @Override  // com.google.android.material.resources.g
            public void a(int v) {
                this.c.a(v);
            }

            @Override  // com.google.android.material.resources.g
            public void b(@NonNull Typeface typeface0, boolean z) {
                e.this.p(this.a, this.b, typeface0);
                this.c.b(typeface0, z);
            }
        }

        this.p(context0, textPaint0, this.e());
        this.h(context0, new b(this, context0, textPaint0, g0));
    }

    public void h(@NonNull Context context0, @NonNull g g0) {
        class a extends FontCallback {
            final g a;
            final e b;

            a(g g0) {
                this.a = g0;
                super();
            }

            @Override  // androidx.core.content.res.ResourcesCompat$FontCallback
            public void h(int v) {
                e.this.p = true;
                this.a.a(v);
            }

            @Override  // androidx.core.content.res.ResourcesCompat$FontCallback
            public void i(@NonNull Typeface typeface0) {
                Typeface typeface1 = Typeface.create(typeface0, e.this.e);
                e.this.q = typeface1;
                e.this.p = true;
                Typeface typeface2 = e.this.q;
                this.a.b(typeface2, false);
            }
        }

        if(this.m(context0)) {
            this.f(context0);
        }
        else {
            this.d();
        }
        int v = this.o;
        if(v == 0) {
            this.p = true;
        }
        if(this.p) {
            g0.b(this.q, true);
            return;
        }
        try {
            ResourcesCompat.l(context0, v, new a(this, g0), null);
        }
        catch(Resources.NotFoundException unused_ex) {
            this.p = true;
            g0.a(1);
        }
        catch(Exception exception0) {
            Log.d("TextAppearance", "Error loading font " + this.d, exception0);
            this.p = true;
            g0.a(-3);
        }
    }

    @Nullable
    public ColorStateList i() {
        return this.m;
    }

    public float j() {
        return this.n;
    }

    public void k(@Nullable ColorStateList colorStateList0) {
        this.m = colorStateList0;
    }

    public void l(float f) {
        this.n = f;
    }

    // 去混淆评级： 低(30)
    private boolean m(Context context0) {
        return (this.o == 0 ? null : ResourcesCompat.d(context0, this.o)) != null;
    }

    public void n(@NonNull Context context0, @NonNull TextPaint textPaint0, @NonNull g g0) {
        this.o(context0, textPaint0, g0);
        textPaint0.setColor((this.m == null ? 0xFF000000 : this.m.getColorForState(textPaint0.drawableState, this.m.getDefaultColor())));
        int v = this.c == null ? 0 : this.c.getColorForState(textPaint0.drawableState, this.c.getDefaultColor());
        textPaint0.setShadowLayer(this.j, this.h, this.i, v);
    }

    public void o(@NonNull Context context0, @NonNull TextPaint textPaint0, @NonNull g g0) {
        if(this.m(context0)) {
            this.p(context0, textPaint0, this.f(context0));
            return;
        }
        this.g(context0, textPaint0, g0);
    }

    public void p(@NonNull Context context0, @NonNull TextPaint textPaint0, @NonNull Typeface typeface0) {
        Typeface typeface1 = i.a(context0, typeface0);
        if(typeface1 != null) {
            typeface0 = typeface1;
        }
        textPaint0.setTypeface(typeface0);
        int v = typeface0.getStyle();
        int v1 = this.e & ~v;
        textPaint0.setFakeBoldText((v1 & 1) != 0);
        textPaint0.setTextSkewX(((v1 & 2) == 0 ? 0.0f : -0.25f));
        textPaint0.setTextSize(this.n);
        if(this.k) {
            textPaint0.setLetterSpacing(this.l);
        }
    }
}

