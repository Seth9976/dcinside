package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;

@k(message = "changed in Okio 2.x")
public final class c {
    @l
    public static final c a;

    static {
        c.a = new c();
    }

    @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    @l
    public final m0 a(@l File file0) {
        L.p(file0, "file");
        return Z.a(file0);
    }

    @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    @l
    public final m0 b() {
        return Z.c();
    }

    @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "sink.buffer()", imports = {"okio.buffer"}))
    @l
    public final okio.m c(@l m0 m00) {
        L.p(m00, "sink");
        return Z.d(m00);
    }

    @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "source.buffer()", imports = {"okio.buffer"}))
    @l
    public final n d(@l o0 o00) {
        L.p(o00, "source");
        return Z.e(o00);
    }

    @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "file.sink()", imports = {"okio.sink"}))
    @l
    public final m0 e(@l File file0) {
        L.p(file0, "file");
        return a0.q(file0, false, 1, null);
    }

    @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "outputStream.sink()", imports = {"okio.sink"}))
    @l
    public final m0 f(@l OutputStream outputStream0) {
        L.p(outputStream0, "outputStream");
        return Z.p(outputStream0);
    }

    @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "socket.sink()", imports = {"okio.sink"}))
    @l
    public final m0 g(@l Socket socket0) {
        L.p(socket0, "socket");
        return Z.q(socket0);
    }

    @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "path.sink(*options)", imports = {"okio.sink"}))
    @l
    public final m0 h(@l Path path0, @l OpenOption[] arr_openOption) {
        L.p(path0, "path");
        L.p(arr_openOption, "options");
        return Z.r(path0, ((OpenOption[])Arrays.copyOf(arr_openOption, arr_openOption.length)));
    }

    @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "file.source()", imports = {"okio.source"}))
    @l
    public final o0 i(@l File file0) {
        L.p(file0, "file");
        return Z.t(file0);
    }

    @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "inputStream.source()", imports = {"okio.source"}))
    @l
    public final o0 j(@l InputStream inputStream0) {
        L.p(inputStream0, "inputStream");
        return Z.u(inputStream0);
    }

    @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "socket.source()", imports = {"okio.source"}))
    @l
    public final o0 k(@l Socket socket0) {
        L.p(socket0, "socket");
        return Z.v(socket0);
    }

    @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "path.source(*options)", imports = {"okio.source"}))
    @l
    public final o0 l(@l Path path0, @l OpenOption[] arr_openOption) {
        L.p(path0, "path");
        L.p(arr_openOption, "options");
        return Z.w(path0, ((OpenOption[])Arrays.copyOf(arr_openOption, arr_openOption.length)));
    }
}

