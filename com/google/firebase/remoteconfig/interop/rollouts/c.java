package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import java.util.Set;

final class c extends e {
    private final Set a;

    c(Set set0) {
        if(set0 == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.a = set0;
    }

    @Override  // com.google.firebase.remoteconfig.interop.rollouts.e
    @NonNull
    public Set b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof e) {
            Set set0 = ((e)object0).b();
            return this.a.equals(set0);
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

