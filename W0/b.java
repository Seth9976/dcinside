package W0;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class b implements e {
    @l
    private final Drawable a;

    public b(@l Drawable drawable0) {
        L.p(drawable0, "drawable");
        super();
        this.a = drawable0;
    }

    @l
    public final Drawable b() {
        return this.a;
    }

    @l
    public final b e(@l Drawable drawable0) {
        L.p(drawable0, "drawable");
        return new b(drawable0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(b.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.facebook.fresco.vito.source.DrawableImageSource");
        return L.g(this.a, ((b)object0).a);
    }

    public static b f(b b0, Drawable drawable0, int v, Object object0) {
        if((v & 1) != 0) {
            drawable0 = b0.a;
        }
        return b0.e(drawable0);
    }

    @l
    public final Drawable g() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "DrawableImageSource(drawable=" + this.a + ")";
    }
}

