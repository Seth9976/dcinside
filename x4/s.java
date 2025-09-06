package x4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum s {
    NULL,
    INT,
    LONG,
    FLOAT,
    DOUBLE,
    BOOLEAN,
    CHAR,
    STRING,
    ALL,
    PRIMITIVE;

    private static s[] a() [...] // Inlined contents

    public static List b() {
        List list0 = new ArrayList(Arrays.asList(s.values()));
        list0.remove(s.i);
        list0.remove(s.j);
        return list0;
    }

    public static List c() {
        return Arrays.asList(new s[]{s.b, s.c, s.d, s.e, s.f, s.g});
    }
}

