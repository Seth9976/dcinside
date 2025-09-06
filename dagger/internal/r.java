package dagger.internal;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class r {
    private final List a;
    private static final String b = "Set contributions cannot be null";

    private r(int v) {
        this.a = new ArrayList(v);
    }

    public r a(Object object0) {
        Object object1 = p.c(object0, "Set contributions cannot be null");
        this.a.add(object1);
        return this;
    }

    public r b(Collection collection0) {
        for(Object object0: collection0) {
            p.c(object0, "Set contributions cannot be null");
        }
        this.a.addAll(collection0);
        return this;
    }

    public Set c() {
        switch(this.a.size()) {
            case 0: {
                return Collections.emptySet();
            }
            case 1: {
                return Collections.singleton(this.a.get(0));
            }
            default: {
                return DesugarCollections.unmodifiableSet(new HashSet(this.a));
            }
        }
    }

    public static r d(int v) {
        return new r(v);
    }
}

