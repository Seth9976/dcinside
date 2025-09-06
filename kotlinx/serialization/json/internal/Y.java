package kotlinx.serialization.json.internal;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.f;
import y4.l;

public final class y implements d0 {
    @l
    private final InputStreamReader a;

    public y(@l InputStream inputStream0, @l Charset charset0) {
        L.p(inputStream0, "stream");
        L.p(charset0, "charset");
        super();
        this.a = new InputStreamReader(inputStream0, charset0);
    }

    public y(InputStream inputStream0, Charset charset0, int v, w w0) {
        if((v & 2) != 0) {
            charset0 = f.b;
        }
        this(inputStream0, charset0);
    }

    @Override  // kotlinx.serialization.json.internal.d0
    public int a(@l char[] arr_c, int v, int v1) {
        L.p(arr_c, "buffer");
        return this.a.read(arr_c, v, v1);
    }
}

