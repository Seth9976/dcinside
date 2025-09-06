package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import java.util.Set;

final class a extends c {
    private final Set a;

    a(Set set0) {
        if(set0 == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.a = set0;
    }

    @Override  // com.google.firebase.remoteconfig.c
    @NonNull
    public Set b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof c) {
            Set set0 = ((c)object0).b();
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
        return "ConfigUpdate{updatedKeys=" + this.a + "}";
    }
}

