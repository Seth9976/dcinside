package W0;

import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class d implements e {
    @l
    private final e[] a;

    public d(@l e[] arr_e) {
        L.p(arr_e, "imageSources");
        super();
        this.a = arr_e;
    }

    @l
    public final e[] b() {
        return this.a;
    }

    @l
    public final d e(@l e[] arr_e) {
        L.p(arr_e, "imageSources");
        return new d(arr_e);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(d.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.facebook.fresco.vito.source.FirstAvailableImageSource");
        return Arrays.equals(this.a, ((d)object0).a);
    }

    public static d f(d d0, e[] arr_e, int v, Object object0) {
        if((v & 1) != 0) {
            arr_e = d0.a;
        }
        return d0.e(arr_e);
    }

    @l
    public final e[] g() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override
    @l
    public String toString() {
        return "FirstAvailableImageSource(imageSources=" + Arrays.toString(this.a) + ")";
    }
}

