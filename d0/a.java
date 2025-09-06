package D0;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.c;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class a extends c {
    @m
    private final b b;
    private long c;
    private long d;

    public a(@m b b0) {
        this.b = b0;
        this.c = -1L;
        this.d = -1L;
    }

    @Override  // com.facebook.drawee.controller.c
    public void c(@l String s, @m Object object0) {
        L.p(s, "id");
        this.c = System.currentTimeMillis();
    }

    @Override  // com.facebook.drawee.controller.c
    public void e(@l String s, @m Object object0, @m Animatable animatable0) {
        L.p(s, "id");
        long v = System.currentTimeMillis();
        this.d = v;
        b b0 = this.b;
        if(b0 != null) {
            b0.a(v - this.c);
        }
    }
}

