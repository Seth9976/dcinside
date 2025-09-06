package com.tbuonomo.viewpagerdotsindicator;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.collections.T;
import kotlin.jvm.internal.s0;
import kotlin.ranges.l;
import kotlin.ranges.s;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nOnPageChangeListenerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPageChangeListenerHelper.kt\ncom/tbuonomo/viewpagerdotsindicator/OnPageChangeListenerHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1855#2,2:51\n1855#2,2:53\n*S KotlinDebug\n*F\n+ 1 OnPageChangeListenerHelper.kt\ncom/tbuonomo/viewpagerdotsindicator/OnPageChangeListenerHelper\n*L\n26#1:51,2\n33#1:53,2\n*E\n"})
public abstract class g {
    private int a;
    private int b;
    public static final int c = 8;

    static {
    }

    public g() {
        this.a = -1;
        this.b = -1;
    }

    public abstract int a();

    public final void b(int v, float f) {
        float f1 = ((float)v) + f;
        int v1 = this.a();
        if(f1 == ((float)(v1 - 1))) {
            f1 = ((float)(v1 - 1)) - 0.0001f;
        }
        if(((float)(((int)f1) + 1)) <= ((float)(v1 - 1)) && ((int)f1) >= 0) {
            this.c(((int)f1), ((int)f1) + 1, f1 % 1.0f);
            int v2 = this.a;
            if(v2 != -1) {
                if(((int)f1) > v2) {
                    Iterator iterator0 = s.W1(v2, ((int)f1)).iterator();
                    while(iterator0.hasNext()) {
                        this.d(((T)iterator0).b());
                    }
                }
                int v3 = this.b;
                if(((int)f1) + 1 < v3) {
                    this.d(v3);
                    Iterator iterator1 = new l(((int)f1) + 2, this.b).iterator();
                    while(iterator1.hasNext()) {
                        this.d(((T)iterator1).b());
                    }
                }
            }
            this.a = (int)f1;
            this.b = ((int)f1) + 1;
        }
    }

    public abstract void c(int arg1, int arg2, float arg3);

    public abstract void d(int arg1);
}

