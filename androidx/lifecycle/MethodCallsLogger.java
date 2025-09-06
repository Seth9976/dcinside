package androidx.lifecycle;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;

@RestrictTo({Scope.c})
public class MethodCallsLogger {
    @l
    private final Map a;

    public MethodCallsLogger() {
        this.a = new HashMap();
    }

    @RestrictTo({Scope.c})
    public boolean a(@l String s, int v) {
        L.p(s, "name");
        Integer integer0 = (Integer)this.a.get(s);
        int v1 = 0;
        int v2 = integer0 == null ? 0 : ((int)integer0);
        if((v2 & v) != 0) {
            v1 = 1;
        }
        this.a.put(s, ((int)(v | v2)));
        return v1 ^ 1;
    }
}

