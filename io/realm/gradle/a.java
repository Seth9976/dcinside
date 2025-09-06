package io.realm.gradle;

import org.gradle.api.Action;
import org.gradle.api.Project;

public final class a implements Action {
    public final String a;
    public final Project b;
    public final d c;

    public a(String s, Project project0, d d0) {
        this.a = s;
        this.b = project0;
        this.c = d0;
    }

    public final void a(Object object0) {
        b.d(this.a, this.b, this.c, ((Project)object0));
    }
}

