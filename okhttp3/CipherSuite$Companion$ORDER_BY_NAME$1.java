package okhttp3;

import java.util.Comparator;
import kotlin.jvm.internal.L;
import y4.l;

public final class CipherSuite.Companion.ORDER_BY_NAME.1 implements Comparator {
    @Override
    public int compare(Object object0, Object object1) {
        return this.compare(((String)object0), ((String)object1));
    }

    public int compare(@l String s, @l String s1) {
        L.p(s, "a");
        L.p(s1, "b");
        int v = Math.min(s.length(), s1.length());
        for(int v1 = 4; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            int v3 = s1.charAt(v1);
            if(v2 != v3) {
                return L.t(v2, v3) < 0 ? -1 : 1;
            }
        }
        int v4 = s.length();
        int v5 = s1.length();
        if(v4 != v5) {
            return v4 < v5 ? -1 : 1;
        }
        return 0;
    }
}

