package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;

@s0({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1557#2:149\n1628#2,3:150\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n133#1:149\n133#1:150,3\n*E\n"})
class n {
    @l
    public static final File a(@l File file0) {
        L.p(file0, "<this>");
        return new File(n.c(file0));
    }

    private static final int b(String s) {
        int v = File.separatorChar;
        int v1 = v.r3(s, ((char)v), 0, false, 4, null);
        if(v1 == 0) {
            if(s.length() > 1 && s.charAt(1) == v) {
                int v2 = v.r3(s, ((char)v), 2, false, 4, null);
                if(v2 >= 0) {
                    int v3 = v.r3(s, ((char)v), v2 + 1, false, 4, null);
                    return v3 < 0 ? s.length() : v3 + 1;
                }
            }
            return 1;
        }
        if(v1 > 0 && s.charAt(v1 - 1) == 58) {
            return v1 + 1;
        }
        return v1 != -1 || !v.b3(s, ':', false, 2, null) ? 0 : s.length();
    }

    @l
    public static final String c(@l File file0) {
        L.p(file0, "<this>");
        String s = file0.getPath();
        L.o(s, "getPath(...)");
        String s1 = file0.getPath();
        L.o(s1, "getPath(...)");
        String s2 = s.substring(0, n.b(s1));
        L.o(s2, "substring(...)");
        return s2;
    }

    public static final boolean d(@l File file0) {
        L.p(file0, "<this>");
        String s = file0.getPath();
        L.o(s, "getPath(...)");
        return n.b(s) > 0;
    }

    @l
    public static final File e(@l File file0, int v, int v1) {
        L.p(file0, "<this>");
        return n.f(file0).j(v, v1);
    }

    @l
    public static final i f(@l File file0) {
        L.p(file0, "<this>");
        String s = file0.getPath();
        L.m(s);
        int v = n.b(s);
        String s1 = s.substring(0, v);
        L.o(s1, "substring(...)");
        String s2 = s.substring(v);
        L.o(s2, "substring(...)");
        if(s2.length() == 0) {
            List list0 = u.H();
            return new i(new File(s1), list0);
        }
        Iterable iterable0 = v.U4(s2, new char[]{File.separatorChar}, false, 0, 6, null);
        ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(new File(((String)object0)));
        }
        return new i(new File(s1), arrayList0);
    }
}

