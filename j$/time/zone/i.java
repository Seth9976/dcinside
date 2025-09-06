package j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

final class i extends j {
    private final Set d;

    i() {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        String[] arr_s = TimeZone.getAvailableIDs();
        for(int v = 0; v < arr_s.length; ++v) {
            linkedHashSet0.add(arr_s[v]);
        }
        this.d = Collections.unmodifiableSet(linkedHashSet0);
    }

    @Override  // j$.time.zone.j
    protected final f c(String s) {
        if(!this.d.contains(s)) {
            throw new g("Not a built-in time zone: " + s);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return new f(TimeZone.getTimeZone(s));
    }

    @Override  // j$.time.zone.j
    protected final Set d() {
        return this.d;
    }
}

