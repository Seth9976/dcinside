package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.collections.k0;
import y4.l;

public final class y {
    @l
    public static final y a;
    @l
    private static final LinkOption[] b;
    @l
    private static final LinkOption[] c;
    @l
    private static final Set d;
    @l
    private static final Set e;

    static {
        y.a = new y();
        y.b = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
        y.c = new LinkOption[0];
        y.d = k0.k();
        y.e = k0.f(FileVisitOption.FOLLOW_LINKS);
    }

    // 去混淆评级： 低(20)
    @l
    public final LinkOption[] a(boolean z) {
        return z ? y.c : y.b;
    }

    // 去混淆评级： 低(20)
    @l
    public final Set b(boolean z) {
        return z ? y.e : y.d;
    }
}

