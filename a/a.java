package A;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.PjT.PjT.Zh.PjT.PjT.b;
import com.bykv.vk.openvk.PjT.PjT.Zh.PjT.PjT.c;
import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;

public class a extends MediaDataSource {
    private final b a;
    private long b;
    private final Context c;
    private final v.b d;
    public static final ConcurrentHashMap e;

    static {
        a.e = new ConcurrentHashMap();
    }

    public a(Context context0, v.b b0) {
        this.b = 0xFFFFFFFF80000000L;
        this.c = context0;
        this.d = b0;
        this.a = new c(context0, b0);
    }

    public static a a(Context context0, v.b b0) {
        a a0 = new a(context0, b0);
        String s = b0.fDm();
        a.e.put(s, a0);
        return a0;
    }

    public v.b b() {
        return this.d;
    }

    @Override
    public void close() throws IOException {
        this.d.xs();
        b b0 = this.a;
        if(b0 != null) {
            b0.Zh();
        }
        String s = this.d.fDm();
        a.e.remove(s);
    }

    @Override  // android.media.MediaDataSource
    public long getSize() throws IOException {
        if(this.b == 0xFFFFFFFF80000000L) {
            if(this.c != null && !TextUtils.isEmpty(this.d.xs())) {
                this.b = this.a.ReZ();
                return this.b;
            }
            return -1L;
        }
        return this.b;
    }

    @Override  // android.media.MediaDataSource
    public int readAt(long v, byte[] arr_b, int v1, int v2) throws IOException {
        return this.a.a(v, arr_b, v1, v2);
    }
}

