package androidx.core.content.pm;

import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({Scope.c})
public abstract class ShortcutInfoCompatSaver {
    @RestrictTo({Scope.a})
    public static class NoopImpl extends ShortcutInfoCompatSaver {
        @Override  // androidx.core.content.pm.ShortcutInfoCompatSaver
        public Object a(List list0) {
            return null;
        }

        @Override  // androidx.core.content.pm.ShortcutInfoCompatSaver
        public Object c() {
            return null;
        }

        @Override  // androidx.core.content.pm.ShortcutInfoCompatSaver
        public Object d(List list0) {
            return null;
        }

        public Void e(List list0) [...] // Inlined contents

        public Void f() [...] // Inlined contents

        public Void g(List list0) [...] // Inlined contents
    }

    @AnyThread
    public abstract Object a(List arg1);

    @WorkerThread
    public List b() throws Exception {
        return new ArrayList();
    }

    @AnyThread
    public abstract Object c();

    @AnyThread
    public abstract Object d(List arg1);
}

