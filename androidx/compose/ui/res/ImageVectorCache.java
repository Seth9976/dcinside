package androidx.compose.ui.res;

import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ImageVectorCache {
    @StabilityInferred(parameters = 0)
    public static final class ImageVectorEntry {
        @l
        private final ImageVector a;
        private final int b;
        public static final int c;

        static {
        }

        public ImageVectorEntry(@l ImageVector imageVector0, int v) {
            L.p(imageVector0, "imageVector");
            super();
            this.a = imageVector0;
            this.b = v;
        }

        @l
        public final ImageVector a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        @l
        public final ImageVectorEntry c(@l ImageVector imageVector0, int v) {
            L.p(imageVector0, "imageVector");
            return new ImageVectorEntry(imageVector0, v);
        }

        public static ImageVectorEntry d(ImageVectorEntry imageVectorCache$ImageVectorEntry0, ImageVector imageVector0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                imageVector0 = imageVectorCache$ImageVectorEntry0.a;
            }
            if((v1 & 2) != 0) {
                v = imageVectorCache$ImageVectorEntry0.b;
            }
            return imageVectorCache$ImageVectorEntry0.c(imageVector0, v);
        }

        public final int e() {
            return this.b;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ImageVectorEntry)) {
                return false;
            }
            return L.g(this.a, ((ImageVectorEntry)object0).a) ? this.b == ((ImageVectorEntry)object0).b : false;
        }

        @l
        public final ImageVector f() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() * 0x1F + this.b;
        }

        @Override
        @l
        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class Key {
        @l
        private final Resources.Theme a;
        private final int b;
        public static final int c = 8;

        static {
        }

        public Key(@l Resources.Theme resources$Theme0, int v) {
            L.p(resources$Theme0, "theme");
            super();
            this.a = resources$Theme0;
            this.b = v;
        }

        @l
        public final Resources.Theme a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        @l
        public final Key c(@l Resources.Theme resources$Theme0, int v) {
            L.p(resources$Theme0, "theme");
            return new Key(resources$Theme0, v);
        }

        public static Key d(Key imageVectorCache$Key0, Resources.Theme resources$Theme0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                resources$Theme0 = imageVectorCache$Key0.a;
            }
            if((v1 & 2) != 0) {
                v = imageVectorCache$Key0.b;
            }
            return imageVectorCache$Key0.c(resources$Theme0, v);
        }

        public final int e() {
            return this.b;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Key)) {
                return false;
            }
            return L.g(this.a, ((Key)object0).a) ? this.b == ((Key)object0).b : false;
        }

        @l
        public final Resources.Theme f() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() * 0x1F + this.b;
        }

        @Override
        @l
        public String toString() {
            return "Key(theme=" + this.a + ", id=" + this.b + ')';
        }
    }

    @l
    private final HashMap a;

    public ImageVectorCache() {
        this.a = new HashMap();
    }

    public final void a() {
        this.a.clear();
    }

    @m
    public final ImageVectorEntry b(@l Key imageVectorCache$Key0) {
        L.p(imageVectorCache$Key0, "key");
        WeakReference weakReference0 = (WeakReference)this.a.get(imageVectorCache$Key0);
        return weakReference0 == null ? null : ((ImageVectorEntry)weakReference0.get());
    }

    public final void c(int v) {
        Iterator iterator0 = this.a.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            L.o(object0, "it.next()");
            ImageVectorEntry imageVectorCache$ImageVectorEntry0 = (ImageVectorEntry)((WeakReference)((Map.Entry)object0).getValue()).get();
            if(imageVectorCache$ImageVectorEntry0 == null || Configuration.needNewResources(v, imageVectorCache$ImageVectorEntry0.e())) {
                iterator0.remove();
            }
        }
    }

    public final void d(@l Key imageVectorCache$Key0, @l ImageVectorEntry imageVectorCache$ImageVectorEntry0) {
        L.p(imageVectorCache$Key0, "key");
        L.p(imageVectorCache$ImageVectorEntry0, "imageVectorEntry");
        WeakReference weakReference0 = new WeakReference(imageVectorCache$ImageVectorEntry0);
        this.a.put(imageVectorCache$Key0, weakReference0);
    }
}

