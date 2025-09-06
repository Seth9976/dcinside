package com.google.firebase.crashlytics.internal.metadata;

import O1.a;
import com.google.firebase.crashlytics.internal.g;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public class j {
    private final List a;
    private final int b;
    static final String c = "rolloutsState";

    public j(int v) {
        this.a = new ArrayList();
        this.b = v;
    }

    public List a() {
        List list0 = this.b();
        List list1 = new ArrayList();
        for(int v = 0; v < list0.size(); ++v) {
            list1.add(((i)list0.get(v)).h());
        }
        return list1;
    }

    public List b() {
        synchronized(this) {
            return DesugarCollections.unmodifiableList(new ArrayList(this.a));
        }
    }

    @a
    public boolean c(List list0) {
        synchronized(this) {
            this.a.clear();
            if(list0.size() > this.b) {
                g.f().m("Ignored " + 0 + " entries when adding rollout assignments. Maximum allowable: " + this.b);
                List list1 = list0.subList(0, this.b);
                return this.a.addAll(list1);
            }
            return this.a.addAll(list0);
        }
    }
}

