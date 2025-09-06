package net.fellbaum.jemoji;

import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;

interface s0 {
    public static final f jB;
    public static final f kB;
    public static final f lB;
    public static final f mB;
    public static final f nB;
    public static final f oB;
    public static final f pB;

    static {
        s0.jB = new f("\uD83D\uDD12", "\uD83D\uDD12", Collections.singletonList(":lock:"), Collections.singletonList(":lock:"), Collections.singletonList(":lock:"), false, false, 0.6, M1.a("fully-qualified"), "locked", d0.g, q1.Z8);
        s0.kB = new f("\uD83D\uDD13", "\uD83D\uDD13", Collections.singletonList(":unlock:"), Collections.singletonList(":unlock:"), Collections.singletonList(":unlock:"), false, false, 0.6, M1.a("fully-qualified"), "unlocked", d0.g, q1.Z8);
        s0.lB = new f("\uD83D\uDD0F", "\uD83D\uDD0F", Collections.singletonList(":lock_with_ink_pen:"), Collections.singletonList(":lock_with_ink_pen:"), Collections.singletonList(":lock_with_ink_pen:"), false, false, 0.6, M1.a("fully-qualified"), "locked with pen", d0.g, q1.Z8);
        s0.mB = new f("\uD83D\uDD10", "\uD83D\uDD10", Collections.singletonList(":closed_lock_with_key:"), Collections.singletonList(":closed_lock_with_key:"), Collections.singletonList(":closed_lock_with_key:"), false, false, 0.6, M1.a("fully-qualified"), "locked with key", d0.g, q1.Z8);
        s0.nB = new f("\uD83D\uDD11", "\uD83D\uDD11", Collections.singletonList(":key:"), Collections.singletonList(":key:"), Collections.singletonList(":key:"), false, false, 0.6, M1.a("fully-qualified"), "key", d0.g, q1.Z8);
        s0.oB = new f("\uD83D\uDDDD️", "\uD83D\uDDDD️", DesugarCollections.unmodifiableList(Arrays.asList(new String[]{":key2:", ":old_key:"})), Collections.singletonList(":old_key:"), Collections.singletonList(":old_key:"), false, false, 0.7, M1.a("fully-qualified"), "old key", d0.g, q1.Z8);
        s0.pB = new f("\uD83D\uDDDD", "\uD83D\uDDDD", Collections.emptyList(), Collections.emptyList(), Collections.singletonList(":old_key:"), false, false, 0.7, M1.a("unqualified"), "old key", d0.g, q1.Z8);
    }
}

