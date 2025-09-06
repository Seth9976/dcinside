package com.kakao.adfit.m;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

final class h extends a {
    static class com.kakao.adfit.m.h.a {
        private final Rect a;
        private float b;

        com.kakao.adfit.m.h.a(Rect rect0) {
            this(rect0, 0.0f);
        }

        com.kakao.adfit.m.h.a(Rect rect0, float f) {
            this.a = rect0;
            this.b = f;
        }
    }

    private final List a;
    private final Rect b;
    private final Rect c;
    private final float d;

    h(Rect rect0, float f) {
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        this.b = new Rect();
        this.c = new Rect();
        arrayList0.add(new com.kakao.adfit.m.h.a(new Rect(rect0)));
        this.d = f;
    }

    static float a(float f, float f1) {
        return f + f1 * (1.0f - f);
    }

    @Override  // com.kakao.adfit.m.I$a
    public int a() {
        int v = 0;
        for(Object object0: this.a) {
            Rect rect0 = ((com.kakao.adfit.m.h.a)object0).a;
            v += rect0.width() * rect0.height();
        }
        return v;
    }

    @Override  // com.kakao.adfit.m.F$a
    public void a(View view0, Rect rect0) {
        Rect rect1 = this.b;
        rect1.set(rect0);
        List list0 = this.a;
        int v = list0.size() - 1;
        int v1 = rect1.width() * rect1.height();
        for(int v2 = 0; v2 <= v; ++v2) {
            com.kakao.adfit.m.h.a h$a0 = (com.kakao.adfit.m.h.a)list0.get(v2);
            Rect rect2 = h$a0.a;
            if(rect1.intersect(rect2)) {
                Rect rect3 = this.c;
                int v3 = rect2.top;
                int v4 = rect1.top;
                if(v3 < v4) {
                    rect3.set(rect2.left, v3, rect2.right, v4);
                }
                if(rect2.bottom > rect1.bottom) {
                    if(!rect3.isEmpty()) {
                        list0.add(new com.kakao.adfit.m.h.a(new Rect(rect3), h$a0.b));
                    }
                    rect3.set(rect2.left, rect1.bottom, rect2.right, rect2.bottom);
                }
                if(rect2.left < rect1.left) {
                    if(!rect3.isEmpty()) {
                        list0.add(new com.kakao.adfit.m.h.a(new Rect(rect3), h$a0.b));
                    }
                    rect3.set(rect2.left, rect1.top, rect1.left, rect1.bottom);
                }
                if(rect2.right > rect1.right) {
                    if(!rect3.isEmpty()) {
                        list0.add(new com.kakao.adfit.m.h.a(new Rect(rect3), h$a0.b));
                    }
                    rect3.set(rect1.right, rect1.top, rect2.right, rect1.bottom);
                }
                float f = h.a(h$a0.b, h.e(view0));
                if(f <= this.d) {
                    if(!rect3.isEmpty()) {
                        list0.add(new com.kakao.adfit.m.h.a(new Rect(rect3), h$a0.b));
                        rect3.setEmpty();
                    }
                    rect2.set(rect1);
                    h$a0.b = f;
                }
                else if(rect3.isEmpty()) {
                    list0.remove(v2);
                    --v;
                    --v2;
                }
                else {
                    rect2.set(rect3);
                    rect3.setEmpty();
                }
                v1 -= rect1.width() * rect1.height();
                if(v1 <= 0) {
                    return;
                }
                rect1.set(rect0);
            }
        }
    }

    private static float d(View view0) {
        float f = view0.getAlpha();
        for(ViewParent viewParent0 = view0.getParent(); f > 0.0f && viewParent0 instanceof View; viewParent0 = ((View)viewParent0).getParent()) {
            f *= ((View)viewParent0).getAlpha();
        }
        return f;
    }

    private static float e(View view0) {
        Drawable drawable0 = view0.getBackground();
        float f = 1.0f;
        if(drawable0 != null) {
            float f1 = ((float)drawable0.getAlpha()) / 255.0f;
            Drawable drawable1 = a.b(view0);
            return drawable1 == null ? f1 * h.d(view0) : (f1 + ((float)drawable1.getAlpha()) / 255.0f * (1.0f - f1)) * h.d(view0);
        }
        Drawable drawable2 = a.b(view0);
        if(drawable2 != null) {
            f = ((float)drawable2.getAlpha()) / 255.0f;
        }
        return f * h.d(view0);
    }
}

