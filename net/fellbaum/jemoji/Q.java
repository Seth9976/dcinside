package net.fellbaum.jemoji;

import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;

interface q {
    public static final f W3;
    public static final f X3;
    public static final f Y3;
    public static final f Z3;
    public static final f a4;
    public static final f b4;
    public static final f c4;

    static {
        q.W3 = new f("\uD83C\uDF96️", "\uD83C\uDF96️", Collections.singletonList(":military_medal:"), Collections.singletonList(":medal:"), Collections.singletonList(":medal_military:"), false, false, 0.7, M1.a("fully-qualified"), "military medal", d0.b, q1.m);
        q.X3 = new f("\uD83C\uDF96", "\uD83C\uDF96", Collections.emptyList(), Collections.emptyList(), Collections.singletonList(":medal_military:"), false, false, 0.7, M1.a("unqualified"), "military medal", d0.b, q1.m);
        q.Y3 = new f("\uD83C\uDFC6", "\uD83C\uDFC6", Collections.singletonList(":trophy:"), Collections.singletonList(":trophy:"), Collections.singletonList(":trophy:"), false, false, 0.6, M1.a("fully-qualified"), "trophy", d0.b, q1.m);
        q.Z3 = new f("\uD83C\uDFC5", "\uD83C\uDFC5", DesugarCollections.unmodifiableList(Arrays.asList(new String[]{":medal:", ":sports_medal:"})), Collections.singletonList(":sports_medal:"), Collections.singletonList(":medal_sports:"), false, false, 1.0, M1.a("fully-qualified"), "sports medal", d0.b, q1.m);
        q.a4 = new f("\uD83E\uDD47", "\uD83E\uDD47", DesugarCollections.unmodifiableList(Arrays.asList(new String[]{":first_place:", ":first_place_medal:"})), Collections.singletonList(":first_place_medal:"), Collections.singletonList(":1st_place_medal:"), false, false, 3.0, M1.a("fully-qualified"), "1st place medal", d0.b, q1.m);
        q.b4 = new f("\uD83E\uDD48", "\uD83E\uDD48", DesugarCollections.unmodifiableList(Arrays.asList(new String[]{":second_place:", ":second_place_medal:"})), Collections.singletonList(":second_place_medal:"), Collections.singletonList(":2nd_place_medal:"), false, false, 3.0, M1.a("fully-qualified"), "2nd place medal", d0.b, q1.m);
        q.c4 = new f("\uD83E\uDD49", "\uD83E\uDD49", DesugarCollections.unmodifiableList(Arrays.asList(new String[]{":third_place:", ":third_place_medal:"})), Collections.singletonList(":third_place_medal:"), Collections.singletonList(":3rd_place_medal:"), false, false, 3.0, M1.a("fully-qualified"), "3rd place medal", d0.b, q1.m);
    }
}

