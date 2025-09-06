package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

final class b extends kotlin.collections.b {
    @l
    private final Iterator c;
    @l
    private final Function1 d;
    @l
    private final HashSet e;

    public b(@l Iterator iterator0, @l Function1 function10) {
        L.p(iterator0, "source");
        L.p(function10, "keySelector");
        super();
        this.c = iterator0;
        this.d = function10;
        this.e = new HashSet();
    }

    @Override  // kotlin.collections.b
    protected void a() {
        while(this.c.hasNext()) {
            Object object0 = this.c.next();
            Object object1 = this.d.invoke(object0);
            if(this.e.add(object1)) {
                this.c(object0);
                return;
            }
            if(false) {
                break;
            }
        }
        this.b();
    }
}

