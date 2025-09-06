package androidx.lifecycle;

import java.util.LinkedHashMap;
import java.util.Map;
import y4.l;

public final class SavedStateHandlesVM extends ViewModel {
    @l
    private final Map a;

    public SavedStateHandlesVM() {
        this.a = new LinkedHashMap();
    }

    @l
    public final Map c() {
        return this.a;
    }
}

