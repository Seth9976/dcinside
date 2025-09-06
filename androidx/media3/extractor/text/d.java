package androidx.media3.extractor.text;

import androidx.media3.common.util.Consumer;
import com.google.common.collect.O2.a;

public final class d implements Consumer {
    public final a a;

    public d(a o2$a0) {
        this.a = o2$a0;
    }

    @Override  // androidx.media3.common.util.Consumer
    public final void accept(Object object0) {
        this.a.j(((CuesWithTiming)object0));
    }
}

