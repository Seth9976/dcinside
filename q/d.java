package Q;

import com.dcinside.app.model.c;
import java.util.List;
import kotlin.J;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public enum d {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[d.values().length];
            try {
                arr_v[d.h.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.c.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.d.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.f.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.g.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.e.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    MAIN,
    LIST_ODD,
    LIST_EVEN,
    NO_IMG,
    NAVER_ODD,
    NAVER_EVEN,
    NAVER_EVEN_MIDDLE,
    SPLIT_FIRST;

    private static final d[] i;
    private static final kotlin.enums.a j;

    static {
        d.i = arr_d;
        L.p(arr_d, "entries");
        d.j = new kotlin.enums.d(arr_d);
    }

    private static final d[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return d.j;
    }

    @m
    public final List c(@l c c0) {
        L.p(c0, "setting");
        switch(this) {
            case 1: {
                return c0.l();
            }
            case 2: {
                return c0.i();
            }
            case 3: {
                return u.H();
            }
            case 4: {
                return u.H();
            }
            case 5: {
                return c0.g();
            }
            case 6: {
                return u.H();
            }
            case 7: {
                return u.H();
            }
            case 8: {
                return c0.l();
            }
            default: {
                throw new J();
            }
        }
    }
}

