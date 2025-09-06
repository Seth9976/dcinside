package net.fellbaum.jemoji;

import java.util.Collections;

interface I0 {
    public static final f FB;
    public static final f GB;
    public static final f HB;
    public static final f IB;
    public static final f JB;
    public static final f KB;
    public static final f LB;
    public static final f MB;

    static {
        I0.FB = new f("✖️", "✖️", Collections.singletonList(":heavy_multiplication_x:"), Collections.singletonList(":heavy_multiplication_x:"), Collections.singletonList(":heavy_multiplication_x:"), false, false, 0.6, M1.a("fully-qualified"), "multiply", d0.j, q1.b9);
        I0.GB = new f("✖", "✖", Collections.emptyList(), Collections.emptyList(), Collections.singletonList(":heavy_multiplication_x:"), false, false, 0.6, M1.a("unqualified"), "multiply", d0.j, q1.b9);
        I0.HB = new f("➕", "➕", Collections.singletonList(":heavy_plus_sign:"), Collections.singletonList(":heavy_plus_sign:"), Collections.singletonList(":heavy_plus_sign:"), false, false, 0.6, M1.a("fully-qualified"), "plus", d0.j, q1.b9);
        I0.IB = new f("➖", "➖", Collections.singletonList(":heavy_minus_sign:"), Collections.singletonList(":heavy_minus_sign:"), Collections.singletonList(":heavy_minus_sign:"), false, false, 0.6, M1.a("fully-qualified"), "minus", d0.j, q1.b9);
        I0.JB = new f("➗", "➗", Collections.singletonList(":heavy_division_sign:"), Collections.singletonList(":heavy_division_sign:"), Collections.singletonList(":heavy_division_sign:"), false, false, 0.6, M1.a("fully-qualified"), "divide", d0.j, q1.b9);
        I0.KB = new f("\uD83D\uDFF0", "\uD83D\uDFF0", Collections.singletonList(":heavy_equals_sign:"), Collections.emptyList(), Collections.emptyList(), false, false, 14.0, M1.a("fully-qualified"), "heavy equals sign", d0.j, q1.b9);
        I0.LB = new f("♾️", "♾️", Collections.singletonList(":infinity:"), Collections.singletonList(":infinity:"), Collections.singletonList(":infinity:"), false, false, 11.0, M1.a("fully-qualified"), "infinity", d0.j, q1.b9);
        I0.MB = new f("♾", "♾", Collections.emptyList(), Collections.emptyList(), Collections.singletonList(":infinity:"), false, false, 11.0, M1.a("unqualified"), "infinity", d0.j, q1.b9);
    }
}

