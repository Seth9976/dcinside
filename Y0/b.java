package y0;

import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import com.facebook.common.internal.j;
import java.util.Map;
import k1.n.a;
import k1.n;

@n(a.a)
public class b {
    private static final MimeTypeMap a;
    private static final Map b;
    private static final Map c;

    static {
        b.a = MimeTypeMap.getSingleton();
        b.b = j.of("image/heif", "heif", "image/heic", "heic");
        b.c = j.of("heif", "image/heif", "heic", "image/heic");
    }

    @Nullable
    public static String a(String s) {
        String s1 = (String)b.b.get(s);
        return s1 == null ? b.a.getExtensionFromMimeType(s) : s1;
    }

    @Nullable
    public static String b(String s) {
        String s1 = (String)b.c.get(s);
        return s1 == null ? b.a.getMimeTypeFromExtension(s) : s1;
    }

    // 去混淆评级： 低(20)
    public static boolean c(String s) {
        return b.c.containsKey(s) || b.a.hasExtension(s);
    }

    // 去混淆评级： 低(20)
    public static boolean d(String s) {
        return b.b.containsKey(s) || b.a.hasMimeType(s);
    }
}

