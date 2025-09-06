package androidx.media3.common;

import O1.a;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class FlagSet {
    public static final class Builder {
        private final SparseBooleanArray a;
        private boolean b;

        public Builder() {
            this.a = new SparseBooleanArray();
        }

        @a
        public Builder a(int v) {
            Assertions.i(!this.b);
            this.a.append(v, true);
            return this;
        }

        @a
        public Builder b(FlagSet flagSet0) {
            for(int v = 0; v < flagSet0.d(); ++v) {
                this.a(flagSet0.c(v));
            }
            return this;
        }

        @a
        public Builder c(int[] arr_v) {
            for(int v = 0; v < arr_v.length; ++v) {
                this.a(arr_v[v]);
            }
            return this;
        }

        // 去混淆评级： 低(20)
        @a
        public Builder d(int v, boolean z) {
            return z ? this.a(v) : this;
        }

        public FlagSet e() {
            Assertions.i(!this.b);
            this.b = true;
            return new FlagSet(this.a, null);
        }

        @a
        public Builder f(int v) {
            Assertions.i(!this.b);
            this.a.delete(v);
            return this;
        }

        @a
        public Builder g(int[] arr_v) {
            for(int v = 0; v < arr_v.length; ++v) {
                this.f(arr_v[v]);
            }
            return this;
        }

        // 去混淆评级： 低(20)
        @a
        public Builder h(int v, boolean z) {
            return z ? this.f(v) : this;
        }
    }

    private final SparseBooleanArray a;

    private FlagSet(SparseBooleanArray sparseBooleanArray0) {
        this.a = sparseBooleanArray0;
    }

    FlagSet(SparseBooleanArray sparseBooleanArray0, androidx.media3.common.FlagSet.1 flagSet$10) {
        this(sparseBooleanArray0);
    }

    public boolean a(int v) {
        return this.a.get(v);
    }

    public boolean b(int[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            if(this.a(arr_v[v])) {
                return true;
            }
        }
        return false;
    }

    public int c(int v) {
        Assertions.c(v, 0, this.d());
        return this.a.keyAt(v);
    }

    public int d() {
        return this.a.size();
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FlagSet)) {
            return false;
        }
        if(Util.a < 24) {
            if(this.d() != ((FlagSet)object0).d()) {
                return false;
            }
            for(int v = 0; v < this.d(); ++v) {
                if(this.c(v) != ((FlagSet)object0).c(v)) {
                    return false;
                }
            }
            return true;
        }
        return this.a.equals(((FlagSet)object0).a);
    }

    @Override
    public int hashCode() {
        if(Util.a < 24) {
            int v = this.d();
            for(int v1 = 0; v1 < this.d(); ++v1) {
                v = v * 0x1F + this.c(v1);
            }
            return v;
        }
        return this.a.hashCode();
    }

    class androidx.media3.common.FlagSet.1 {
    }

}

