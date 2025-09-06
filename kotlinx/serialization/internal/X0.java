package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.h;
import kotlinx.serialization.descriptors.j;
import y4.l;

public final class x0 {
    public static final boolean a(f f0, Object object0, Function1 function10) {
        L.p(f0, "<this>");
        L.p(function10, "typeParamsAreEqual");
        if(f0 == object0) {
            return true;
        }
        L.y(3, "SD");
        if(!(object0 instanceof f)) {
            return false;
        }
        if(!L.g(f0.h(), ((f)object0).h())) {
            return false;
        }
        if(!((Boolean)function10.invoke(object0)).booleanValue()) {
            return false;
        }
        if(f0.e() != ((f)object0).e()) {
            return false;
        }
        int v = f0.e();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!L.g(f0.d(v1).h(), ((f)object0).d(v1).h())) {
                return false;
            }
            if(!L.g(f0.d(v1).getKind(), ((f)object0).d(v1).getKind())) {
                return false;
            }
        }
        return true;
    }

    public static final int b(@l f f0, @l f[] arr_f) {
        L.p(f0, "<this>");
        L.p(arr_f, "typeParams");
        int v = f0.h().hashCode();
        int v1 = Arrays.hashCode(arr_f);
        Iterable iterable0 = h.a(f0);
        Iterator iterator0 = iterable0.iterator();
        int v2 = 1;
        int v3;
        for(v3 = 1; true; v3 = v3 * 0x1F + v4) {
            int v4 = 0;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            String s = ((f)object0).h();
            if(s != null) {
                v4 = s.hashCode();
            }
        }
        for(Object object1: iterable0) {
            j j0 = ((f)object1).getKind();
            v2 = v2 * 0x1F + (j0 == null ? 0 : j0.hashCode());
        }
        return ((v * 0x1F + v1) * 0x1F + v3) * 0x1F + v2;
    }
}

