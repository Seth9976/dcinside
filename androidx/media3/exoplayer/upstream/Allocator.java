package androidx.media3.exoplayer.upstream;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface Allocator {
    public interface AllocationNode {
        Allocation a();

        @Nullable
        AllocationNode next();
    }

    void a(AllocationNode arg1);

    int b();

    void c();

    Allocation d();

    void e(Allocation arg1);

    int f();
}

