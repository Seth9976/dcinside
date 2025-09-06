package io.realm.transformer;

import com.android.build.api.variant.Component;
import org.gradle.api.Action;
import org.gradle.api.Project;

public final class e implements Action {
    public final Component a;
    public final Project b;

    public e(Component component0, Project project0) {
        this.a = component0;
        this.b = project0;
    }

    public final void a(Object object0) {
        a.d(this.a, this.b, ((i)object0));
    }
}

