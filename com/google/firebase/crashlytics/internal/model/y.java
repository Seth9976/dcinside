package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import java.util.List;

final class y extends f {
    static class a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.f.d.f.a {
        private List a;

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$f$a
        public f a() {
            List list0 = this.a;
            if(list0 == null) {
                throw new IllegalStateException("Missing required properties: rolloutAssignments");
            }
            return new y(list0, null);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$f$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.f.a b(List list0) {
            if(list0 == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.a = list0;
            return this;
        }
    }

    private final List a;

    private y(List list0) {
        this.a = list0;
    }

    y(List list0, a y$a0) {
        this(list0);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$f
    @NonNull
    @c2.a.a(name = "assignments")
    public List b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof f) {
            List list0 = ((f)object0).b();
            return this.a.equals(list0);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }
}

