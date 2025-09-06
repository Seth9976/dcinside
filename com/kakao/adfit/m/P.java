package com.kakao.adfit.m;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

final class p extends a {
    private final List a;
    private final Rect b;
    private final Rect c;

    p(Rect rect0) {
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        this.b = new Rect();
        this.c = new Rect();
        arrayList0.add(new Rect(rect0));
    }

    @Override  // com.kakao.adfit.m.I$a
    public int a() {
        int v = 0;
        for(Object object0: this.a) {
            v += ((Rect)object0).width() * ((Rect)object0).height();
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
            Rect rect2 = (Rect)list0.get(v2);
            if(rect1.intersect(rect2)) {
                Rect rect3 = this.c;
                int v3 = rect2.top;
                int v4 = rect1.top;
                if(v3 < v4) {
                    rect3.set(rect2.left, v3, rect2.right, v4);
                }
                if(rect2.bottom > rect1.bottom) {
                    if(!rect3.isEmpty()) {
                        list0.add(new Rect(rect3));
                    }
                    rect3.set(rect2.left, rect1.bottom, rect2.right, rect2.bottom);
                }
                if(rect2.left < rect1.left) {
                    if(!rect3.isEmpty()) {
                        list0.add(new Rect(rect3));
                    }
                    rect3.set(rect2.left, rect1.top, rect1.left, rect1.bottom);
                }
                if(rect2.right > rect1.right) {
                    if(!rect3.isEmpty()) {
                        list0.add(new Rect(rect3));
                    }
                    rect3.set(rect1.right, rect1.top, rect2.right, rect1.bottom);
                }
                if(rect3.isEmpty()) {
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
}

