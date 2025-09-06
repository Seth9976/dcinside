package androidx.fragment.app;

import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Map;

@Deprecated
public class FragmentManagerNonConfig {
    @Nullable
    private final Collection a;
    @Nullable
    private final Map b;
    @Nullable
    private final Map c;

    FragmentManagerNonConfig(@Nullable Collection collection0, @Nullable Map map0, @Nullable Map map1) {
        this.a = collection0;
        this.b = map0;
        this.c = map1;
    }

    @Nullable
    Map a() {
        return this.b;
    }

    @Nullable
    Collection b() {
        return this.a;
    }

    @Nullable
    Map c() {
        return this.c;
    }

    boolean d(Fragment fragment0) {
        return this.a == null ? false : this.a.contains(fragment0);
    }
}

