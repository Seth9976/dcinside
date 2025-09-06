package androidx.compose.runtime.saveable;

import A3.a;
import java.util.Map;
import y4.l;
import y4.m;

public interface SaveableStateRegistry {
    public interface Entry {
        void a();
    }

    boolean a(@l Object arg1);

    @l
    Map c();

    @l
    Entry e(@l String arg1, @l a arg2);

    @m
    Object f(@l String arg1);
}

