package androidx.media3.exoplayer.upstream;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

@UnstableApi
public final class DefaultAllocator implements Allocator {
    private final boolean a;
    private final int b;
    @Nullable
    private final byte[] c;
    private int d;
    private int e;
    private int f;
    private Allocation[] g;
    private static final int h = 100;

    public DefaultAllocator(boolean z, int v) {
        this(z, v, 0);
    }

    public DefaultAllocator(boolean z, int v, int v1) {
        boolean z1 = true;
        Assertions.a(v > 0);
        if(v1 < 0) {
            z1 = false;
        }
        Assertions.a(z1);
        this.a = z;
        this.b = v;
        this.f = v1;
        this.g = new Allocation[v1 + 100];
        if(v1 > 0) {
            this.c = new byte[v1 * v];
            for(int v2 = 0; v2 < v1; ++v2) {
                Allocation[] arr_allocation = this.g;
                arr_allocation[v2] = new Allocation(this.c, v2 * v);
            }
            return;
        }
        this.c = null;
    }

    @Override  // androidx.media3.exoplayer.upstream.Allocator
    public void a(@Nullable AllocationNode allocator$AllocationNode0) {
        synchronized(this) {
            while(allocator$AllocationNode0 != null) {
                Allocation[] arr_allocation = this.g;
                int v1 = this.f;
                this.f = v1 + 1;
                arr_allocation[v1] = allocator$AllocationNode0.a();
                --this.e;
                allocator$AllocationNode0 = allocator$AllocationNode0.next();
            }
            this.notifyAll();
        }
    }

    @Override  // androidx.media3.exoplayer.upstream.Allocator
    public int b() {
        synchronized(this) {
        }
        return this.e * this.b;
    }

    @Override  // androidx.media3.exoplayer.upstream.Allocator
    public void c() {
        synchronized(this) {
            int v1 = 0;
            int v2 = Math.max(0, (this.d + this.b - 1) / this.b - this.e);
            int v3 = this.f;
            if(v2 >= v3) {
                return;
            }
            if(this.c != null) {
                int v4 = v3 - 1;
                while(v1 <= v4) {
                    Allocation allocation0 = (Allocation)Assertions.g(this.g[v1]);
                    if(allocation0.a == this.c) {
                        ++v1;
                    }
                    else {
                        Allocation allocation1 = (Allocation)Assertions.g(this.g[v4]);
                        if(allocation1.a == this.c) {
                            Allocation[] arr_allocation = this.g;
                            arr_allocation[v1] = allocation1;
                            arr_allocation[v4] = allocation0;
                            --v4;
                            ++v1;
                        }
                        else {
                            --v4;
                        }
                    }
                }
                v2 = Math.max(v2, v1);
                if(v2 >= this.f) {
                    return;
                }
            }
            Arrays.fill(this.g, v2, this.f, null);
            this.f = v2;
        }
    }

    @Override  // androidx.media3.exoplayer.upstream.Allocator
    public Allocation d() {
        Allocation allocation0;
        synchronized(this) {
            ++this.e;
            int v1 = this.f;
            if(v1 > 0) {
                this.f = v1 - 1;
                allocation0 = (Allocation)Assertions.g(this.g[v1 - 1]);
                this.g[this.f] = null;
            }
            else {
                allocation0 = new Allocation(new byte[this.b], 0);
                Allocation[] arr_allocation = this.g;
                if(this.e > arr_allocation.length) {
                    this.g = (Allocation[])Arrays.copyOf(arr_allocation, arr_allocation.length * 2);
                }
            }
            return allocation0;
        }
    }

    @Override  // androidx.media3.exoplayer.upstream.Allocator
    public void e(Allocation allocation0) {
        synchronized(this) {
            int v1 = this.f;
            this.f = v1 + 1;
            this.g[v1] = allocation0;
            --this.e;
            this.notifyAll();
        }
    }

    @Override  // androidx.media3.exoplayer.upstream.Allocator
    public int f() {
        return this.b;
    }

    public void g() {
        synchronized(this) {
            if(this.a) {
                this.h(0);
            }
        }
    }

    public void h(int v) {
        synchronized(this) {
            boolean z = v < this.d;
            this.d = v;
            if(z) {
                this.c();
            }
        }
    }
}

