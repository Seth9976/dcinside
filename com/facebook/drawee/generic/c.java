package com.facebook.drawee.generic;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.R.styleable;
import com.facebook.drawee.drawable.t.d;
import k1.v;
import o3.h;

public class c {
    @h
    public static Drawable a(Context context0, TypedArray typedArray0, int v) {
        int v1 = typedArray0.getResourceId(v, 0);
        return v1 == 0 ? null : context0.getDrawable(v1);
    }

    @v
    private static e b(b b0) {
        if(b0.s() == null) {
            b0.Z(new e());
        }
        return b0.s();
    }

    @h
    public static d c(TypedArray typedArray0, int v) {
        switch(typedArray0.getInt(v, -2)) {
            case -1: {
                return null;
            }
            case 0: {
                return d.a;
            }
            case 1: {
                return d.d;
            }
            case 2: {
                return d.e;
            }
            case 3: {
                return d.f;
            }
            case 4: {
                return d.g;
            }
            case 5: {
                return d.h;
            }
            case 6: {
                return d.i;
            }
            case 7: {
                return d.j;
            }
            case 8: {
                return d.k;
            }
            default: {
                throw new RuntimeException("XML attribute not specified!");
            }
        }
    }

    public static b d(Context context0, @h AttributeSet attributeSet0) {
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        b b0 = c.f(new b(context0.getResources()), context0, attributeSet0);
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return b0;
    }

    public static a e(Context context0, @h AttributeSet attributeSet0) {
        return c.d(context0, attributeSet0).a();
    }

    public static b f(b b0, Context context0, @h AttributeSet attributeSet0) {
        int v10;
        int v9;
        int v8;
        int v7;
        boolean z9;
        boolean z8;
        int v6;
        int v3;
        boolean z7;
        boolean z5;
        boolean z4;
        boolean z3;
        boolean z2;
        boolean z1;
        boolean z;
        int v1;
        if(attributeSet0 == null) {
            z8 = true;
            v8 = 0;
            v10 = 0;
            z9 = true;
            v9 = 1;
            v7 = 1;
        }
        else {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.GenericDraweeHierarchy);
            try {
                int v = typedArray0.getIndexCount();
                v1 = 0;
                z = true;
                z1 = true;
                z2 = true;
                z3 = true;
                z4 = true;
                z5 = true;
                boolean z6 = true;
                z7 = true;
                v3 = 0;
                for(int v2 = 0; v2 < v; ++v2) {
                    int v4 = typedArray0.getIndex(v2);
                    if(v4 == styleable.GenericDraweeHierarchy_actualImageScaleType) {
                        b0.y(c.c(typedArray0, v4));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_placeholderImage) {
                        b0.L(c.a(context0, typedArray0, v4));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_pressedStateOverlayImage) {
                        b0.O(c.a(context0, typedArray0, v4));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_progressBarImage) {
                        b0.R(c.a(context0, typedArray0, v4));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_fadeDuration) {
                        b0.B(typedArray0.getInt(v4, 0));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_viewAspectRatio) {
                        b0.A(typedArray0.getFloat(v4, 0.0f));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_placeholderImageScaleType) {
                        b0.N(c.c(typedArray0, v4));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_retryImage) {
                        b0.W(c.a(context0, typedArray0, v4));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_retryImageScaleType) {
                        b0.Y(c.c(typedArray0, v4));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_failureImage) {
                        b0.E(c.a(context0, typedArray0, v4));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_failureImageScaleType) {
                        b0.G(c.c(typedArray0, v4));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_progressBarImageScaleType) {
                        b0.T(c.c(typedArray0, v4));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_progressBarAutoRotateInterval) {
                        v1 = typedArray0.getInteger(v4, v1);
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_backgroundImage) {
                        b0.z(c.a(context0, typedArray0, v4));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_overlayImage) {
                        b0.H(c.a(context0, typedArray0, v4));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_roundAsCircle) {
                        c.b(b0).z(typedArray0.getBoolean(v4, false));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_roundedCornerRadius) {
                        v3 = typedArray0.getDimensionPixelSize(v4, v3);
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_roundTopLeft) {
                        z = typedArray0.getBoolean(v4, z);
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_roundTopRight) {
                        z2 = typedArray0.getBoolean(v4, z2);
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_roundBottomLeft) {
                        z6 = typedArray0.getBoolean(v4, z6);
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_roundBottomRight) {
                        z4 = typedArray0.getBoolean(v4, z4);
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_roundTopStart) {
                        z1 = typedArray0.getBoolean(v4, z1);
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_roundTopEnd) {
                        z3 = typedArray0.getBoolean(v4, z3);
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_roundBottomStart) {
                        z7 = typedArray0.getBoolean(v4, z7);
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_roundBottomEnd) {
                        z5 = typedArray0.getBoolean(v4, z5);
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_roundWithOverlayColor) {
                        c.b(b0).v(typedArray0.getColor(v4, 0));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_roundingBorderWidth) {
                        c.b(b0).r(((float)typedArray0.getDimensionPixelSize(v4, 0)));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_roundingBorderColor) {
                        c.b(b0).q(typedArray0.getColor(v4, 0));
                    }
                    else if(v4 == styleable.GenericDraweeHierarchy_roundingBorderPadding) {
                        c.b(b0).w(((float)typedArray0.getDimensionPixelSize(v4, 0)));
                    }
                }
            }
            catch(Throwable throwable0) {
                typedArray0.recycle();
                context0.getResources().getConfiguration().getLayoutDirection();
                throw throwable0;
            }
            int v5 = 0;
            typedArray0.recycle();
            if(context0.getResources().getConfiguration().getLayoutDirection() == 1) {
                v6 = !z || !z3 ? 0 : 1;
                z8 = z2 && z1;
                z9 = z4 && z7;
                if(z6 && z5) {
                    v5 = 1;
                }
            }
            else {
                v6 = !z || !z1 ? 0 : 1;
                z8 = z2 && z3;
                z9 = z4 && z5;
                if(z6 && z7) {
                    v5 = 1;
                }
            }
            v7 = v5;
            v8 = v1;
            v9 = v6;
            v10 = v3;
        }
        if(b0.n() != null && v8 > 0) {
            b0.R(new com.facebook.drawee.drawable.b(b0.n(), v8));
        }
        if(v10 > 0) {
            c.b(b0).s((v9 == 0 ? 0.0f : ((float)v10)), (z8 ? ((float)v10) : 0.0f), (z9 ? ((float)v10) : 0.0f), (v7 == 0 ? 0.0f : ((float)v10)));
        }
        return b0;
    }
}

