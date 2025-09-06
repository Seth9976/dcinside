package kotlin.io.path;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;

@r
final class f implements a {
    @l
    public static final f a;

    static {
        f.a = new f();
    }

    @Override  // kotlin.io.path.a
    @l
    public b a(@l Path path0, @l Path path1, boolean z) {
        L.p(path0, "<this>");
        L.p(path1, "target");
        LinkOption[] arr_linkOption = y.a.a(z);
        LinkOption[] arr_linkOption1 = (LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length);
        if(!Files.isDirectory(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption1, arr_linkOption1.length))) || !Files.isDirectory(path1, ((LinkOption[])Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1)))) {
            CopyOption[] arr_copyOption = (CopyOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length);
            L.o(Files.copy(path0, path1, ((CopyOption[])Arrays.copyOf(arr_copyOption, arr_copyOption.length))), "copy(...)");
        }
        return b.a;
    }
}

