package m3;

import h3.f;
import javassist.E;
import javassist.bytecode.k;
import javassist.l;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.m;

public final class a {
    public static final boolean a(@m l l0) {
        if(l0 != null) {
            try {
                if(l0.e0(f.class)) {
                    return true;
                }
            }
            catch(E unused_ex) {
            }
        }
        return false;
    }

    public static final boolean b(@y4.l l l0, @y4.l l l1) {
        L.p(l0, "<this>");
        L.p(l1, "typeToCheckAgainst");
        String s = l1.X();
        L.o(s, "typeToCheckAgainst.name");
        if(!L.g(l0, l1) && !l0.X().equals(s)) {
            k k0 = l0.u();
            L.o(k0, "this.classFile2");
            String s1 = k0.y();
            if(v.P1(s1, s, false, 2, null)) {
                return true;
            }
            String[] arr_s = k0.o();
            L.o(arr_s, "file.interfaces");
            for(int v = 0; v < arr_s.length; ++v) {
                if(L.g(arr_s[v], s)) {
                    return true;
                }
            }
            if(s1 != null) {
                try {
                    l l2 = l0.w().s(s1);
                    L.o(l2, "classPool.get(superName)");
                    if(a.b(l2, l1)) {
                        return true;
                    }
                }
                catch(E unused_ex) {
                }
            }
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                String s2 = arr_s[v1];
                try {
                    l l3 = l0.w().s(s2);
                    L.o(l3, "classPool.get(interfaceName)");
                    if(a.b(l3, l1)) {
                        return true;
                    }
                }
                catch(E unused_ex) {
                }
            }
            return false;
        }
        return true;
    }
}

