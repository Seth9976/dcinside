package I0;

import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface d {
    public static final class a {
        public static boolean a(@l d d0) [...] // Inlined contents

        public static boolean b(@l d d0, @l Map map0) {
            L.p(map0, "frameBitmaps");
            return true;
        }
    }

    public interface b {
        void a(@l d arg1, int arg2);

        void b(@l d arg1, int arg2);
    }

    boolean A();

    void B(int arg1, @l com.facebook.common.references.a arg2, int arg3);

    @m
    com.facebook.common.references.a C(int arg1);

    boolean D(int arg1);

    @m
    com.facebook.common.references.a E(int arg1);

    void F(int arg1, @l com.facebook.common.references.a arg2, int arg3);

    boolean G(@l Map arg1);

    void H(@m b arg1);

    @m
    com.facebook.common.references.a I(int arg1, int arg2, int arg3);

    void clear();

    int z();
}

