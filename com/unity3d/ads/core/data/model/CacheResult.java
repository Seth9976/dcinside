package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class CacheResult {
    public static final class Failure extends CacheResult {
        @l
        private final CacheError error;
        @l
        private final CacheSource source;

        public Failure(@l CacheError cacheError0, @l CacheSource cacheSource0) {
            L.p(cacheError0, "error");
            L.p(cacheSource0, "source");
            super(null);
            this.error = cacheError0;
            this.source = cacheSource0;
        }

        public Failure(CacheError cacheError0, CacheSource cacheSource0, int v, w w0) {
            if((v & 2) != 0) {
                cacheSource0 = CacheSource.LOCAL;
            }
            this(cacheError0, cacheSource0);
        }

        @l
        public final CacheError component1() {
            return this.error;
        }

        @l
        public final CacheSource component2() {
            return this.source;
        }

        @l
        public final Failure copy(@l CacheError cacheError0, @l CacheSource cacheSource0) {
            L.p(cacheError0, "error");
            L.p(cacheSource0, "source");
            return new Failure(cacheError0, cacheSource0);
        }

        public static Failure copy$default(Failure cacheResult$Failure0, CacheError cacheError0, CacheSource cacheSource0, int v, Object object0) {
            if((v & 1) != 0) {
                cacheError0 = cacheResult$Failure0.error;
            }
            if((v & 2) != 0) {
                cacheSource0 = cacheResult$Failure0.source;
            }
            return cacheResult$Failure0.copy(cacheError0, cacheSource0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Failure)) {
                return false;
            }
            return this.error == ((Failure)object0).error ? this.source == ((Failure)object0).source : false;
        }

        @l
        public final CacheError getError() {
            return this.error;
        }

        @l
        public final CacheSource getSource() {
            return this.source;
        }

        @Override
        public int hashCode() {
            return this.error.hashCode() * 0x1F + this.source.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Failure(error=" + this.error + ", source=" + this.source + ')';
        }
    }

    public static final class Success extends CacheResult {
        @l
        private final CachedFile cachedFile;
        @l
        private final CacheSource source;

        public Success(@l CachedFile cachedFile0, @l CacheSource cacheSource0) {
            L.p(cachedFile0, "cachedFile");
            L.p(cacheSource0, "source");
            super(null);
            this.cachedFile = cachedFile0;
            this.source = cacheSource0;
        }

        @l
        public final CachedFile component1() {
            return this.cachedFile;
        }

        @l
        public final CacheSource component2() {
            return this.source;
        }

        @l
        public final Success copy(@l CachedFile cachedFile0, @l CacheSource cacheSource0) {
            L.p(cachedFile0, "cachedFile");
            L.p(cacheSource0, "source");
            return new Success(cachedFile0, cacheSource0);
        }

        public static Success copy$default(Success cacheResult$Success0, CachedFile cachedFile0, CacheSource cacheSource0, int v, Object object0) {
            if((v & 1) != 0) {
                cachedFile0 = cacheResult$Success0.cachedFile;
            }
            if((v & 2) != 0) {
                cacheSource0 = cacheResult$Success0.source;
            }
            return cacheResult$Success0.copy(cachedFile0, cacheSource0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Success)) {
                return false;
            }
            return L.g(this.cachedFile, ((Success)object0).cachedFile) ? this.source == ((Success)object0).source : false;
        }

        @l
        public final CachedFile getCachedFile() {
            return this.cachedFile;
        }

        @l
        public final CacheSource getSource() {
            return this.source;
        }

        @Override
        public int hashCode() {
            return this.cachedFile.hashCode() * 0x1F + this.source.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Success(cachedFile=" + this.cachedFile + ", source=" + this.source + ')';
        }
    }

    private CacheResult() {
    }

    public CacheResult(w w0) {
    }
}

