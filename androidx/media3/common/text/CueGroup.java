package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import java.util.ArrayList;
import java.util.List;

public final class CueGroup {
    public final O2 a;
    @UnstableApi
    public final long b;
    @UnstableApi
    public static final CueGroup c;
    private static final String d;
    private static final String e;

    static {
        CueGroup.c = new CueGroup(O2.A(), 0L);
        CueGroup.d = "0";
        CueGroup.e = "1";
    }

    @UnstableApi
    public CueGroup(List list0, long v) {
        this.a = O2.r(list0);
        this.b = v;
    }

    private static O2 a(List list0) {
        a o2$a0 = O2.n();
        for(int v = 0; v < list0.size(); ++v) {
            if(((Cue)list0.get(v)).d == null) {
                o2$a0.j(((Cue)list0.get(v)));
            }
        }
        return o2$a0.n();
    }

    @UnstableApi
    public static CueGroup b(Bundle bundle0) {
        ArrayList arrayList0 = bundle0.getParcelableArrayList(CueGroup.d);
        return arrayList0 == null ? new CueGroup(O2.A(), bundle0.getLong(CueGroup.e)) : new CueGroup(BundleCollectionUtil.d(new androidx.media3.common.text.a(), arrayList0), bundle0.getLong(CueGroup.e));
    }

    @UnstableApi
    public Bundle c() {
        Bundle bundle0 = new Bundle();
        ArrayList arrayList0 = BundleCollectionUtil.i(CueGroup.a(this.a), new b());
        bundle0.putParcelableArrayList(CueGroup.d, arrayList0);
        bundle0.putLong(CueGroup.e, this.b);
        return bundle0;
    }
}

