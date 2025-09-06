package androidx.compose.ui.text.font;

import A3.a;
import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.caches.SimpleArrayMap;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.g;

@s0({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,427:1\n24#2:428\n24#2:429\n24#2:430\n24#2:431\n24#2:432\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n*L\n365#1:428\n376#1:429\n388#1:430\n395#1:431\n416#1:432\n*E\n"})
public final class AsyncTypefaceCache {
    @g
    public static final class AsyncTypefaceResult {
        @m
        private final Object a;

        private AsyncTypefaceResult(Object object0) {
            this.a = object0;
        }

        public static final AsyncTypefaceResult a(Object object0) {
            return new AsyncTypefaceResult(object0);
        }

        @l
        public static Object b(@m Object object0) [...] // Inlined contents

        // 去混淆评级： 低(20)
        public static boolean c(Object object0, Object object1) {
            return object1 instanceof AsyncTypefaceResult ? L.g(object0, ((AsyncTypefaceResult)object1).i()) : false;
        }

        public static final boolean d(Object object0, Object object1) {
            return L.g(object0, object1);
        }

        @m
        public final Object e() {
            return this.a;
        }

        @Override
        public boolean equals(Object object0) {
            return AsyncTypefaceResult.c(this.a, object0);
        }

        public static int f(Object object0) {
            return object0 == null ? 0 : object0.hashCode();
        }

        public static final boolean g(Object object0) {
            return object0 == null;
        }

        public static String h(Object object0) [...] // Inlined contents

        @Override
        public int hashCode() {
            return AsyncTypefaceResult.f(this.a);
        }

        public final Object i() {
            return this.a;
        }

        @Override
        public String toString() {
            return "AsyncTypefaceResult(result=" + this.a + ')';
        }
    }

    public static final class Key {
        @l
        private final Font a;
        @m
        private final Object b;

        public Key(@l Font font0, @m Object object0) {
            L.p(font0, "font");
            super();
            this.a = font0;
            this.b = object0;
        }

        @l
        public final Font a() {
            return this.a;
        }

        @m
        public final Object b() {
            return this.b;
        }

        @l
        public final Key c(@l Font font0, @m Object object0) {
            L.p(font0, "font");
            return new Key(font0, object0);
        }

        public static Key d(Key asyncTypefaceCache$Key0, Font font0, Object object0, int v, Object object1) {
            if((v & 1) != 0) {
                font0 = asyncTypefaceCache$Key0.a;
            }
            if((v & 2) != 0) {
                object0 = asyncTypefaceCache$Key0.b;
            }
            return asyncTypefaceCache$Key0.c(font0, object0);
        }

        @l
        public final Font e() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Key)) {
                return false;
            }
            return L.g(this.a, ((Key)object0).a) ? L.g(this.b, ((Key)object0).b) : false;
        }

        @m
        public final Object f() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Key(font=" + this.a + ", loaderKey=" + this.b + ')';
        }
    }

    @l
    private final Object a;
    @l
    private final LruCache b;
    @l
    private final SimpleArrayMap c;
    @l
    private final SynchronizedObject d;

    public AsyncTypefaceCache() {
        this.a = null;
        this.b = new LruCache(16);
        this.c = new SimpleArrayMap(0, 1, null);
        this.d = Synchronization_jvmKt.a();
    }

    @m
    public final AsyncTypefaceResult d(@l Font font0, @l PlatformFontLoader platformFontLoader0) {
        L.p(font0, "font");
        L.p(platformFontLoader0, "platformFontLoader");
        Key asyncTypefaceCache$Key0 = new Key(font0, platformFontLoader0.a());
        synchronized(this.d) {
            AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)this.b.g(asyncTypefaceCache$Key0);
            if(asyncTypefaceCache$AsyncTypefaceResult0 == null) {
                asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)this.c.e(asyncTypefaceCache$Key0);
            }
            return asyncTypefaceCache$AsyncTypefaceResult0;
        }
    }

    public final void e(@l Font font0, @l PlatformFontLoader platformFontLoader0, @m Object object0, boolean z) {
        L.p(font0, "font");
        L.p(platformFontLoader0, "platformFontLoader");
        Key asyncTypefaceCache$Key0 = new Key(font0, platformFontLoader0.a());
        synchronized(this.d) {
            if(object0 == null) {
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult0 = AsyncTypefaceResult.a(this.a);
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult1 = (AsyncTypefaceResult)this.c.n(asyncTypefaceCache$Key0, asyncTypefaceCache$AsyncTypefaceResult0);
            }
            else if(z) {
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult2 = AsyncTypefaceResult.a(object0);
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult3 = (AsyncTypefaceResult)this.c.n(asyncTypefaceCache$Key0, asyncTypefaceCache$AsyncTypefaceResult2);
            }
            else {
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult4 = AsyncTypefaceResult.a(object0);
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult5 = (AsyncTypefaceResult)this.b.k(asyncTypefaceCache$Key0, asyncTypefaceCache$AsyncTypefaceResult4);
            }
        }
    }

    public static void f(AsyncTypefaceCache asyncTypefaceCache0, Font font0, PlatformFontLoader platformFontLoader0, Object object0, boolean z, int v, Object object1) {
        if((v & 8) != 0) {
            z = false;
        }
        asyncTypefaceCache0.e(font0, platformFontLoader0, object0, z);
    }

    @m
    public final Object g(@l Font font0, @l PlatformFontLoader platformFontLoader0, boolean z, @l Function1 function10, @l d d0) {
        Key asyncTypefaceCache$Key1;
        AsyncTypefaceCache asyncTypefaceCache0;
        Object object2;
        androidx.compose.ui.text.font.AsyncTypefaceCache.runCached.1 asyncTypefaceCache$runCached$10;
        if(d0 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache.runCached.1) {
            asyncTypefaceCache$runCached$10 = (androidx.compose.ui.text.font.AsyncTypefaceCache.runCached.1)d0;
            int v = asyncTypefaceCache$runCached$10.p;
            if((v & 0x80000000) == 0) {
                asyncTypefaceCache$runCached$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    boolean m;
                    Object n;
                    int p;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.n = object0;
                        this.p |= 0x80000000;
                        return d0.g(null, null, false, null, this);
                    }
                };
            }
            else {
                asyncTypefaceCache$runCached$10.p = v ^ 0x80000000;
            }
        }
        else {
            asyncTypefaceCache$runCached$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                boolean m;
                Object n;
                int p;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.n = object0;
                    this.p |= 0x80000000;
                    return d0.g(null, null, false, null, this);
                }
            };
        }
        Object object0 = asyncTypefaceCache$runCached$10.n;
        Object object1 = b.l();
        switch(asyncTypefaceCache$runCached$10.p) {
            case 0: {
                f0.n(object0);
                Key asyncTypefaceCache$Key0 = new Key(font0, platformFontLoader0.a());
                SynchronizedObject synchronizedObject0 = this.d;
                __monitor_enter(synchronizedObject0);
                try {
                    AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)this.b.g(asyncTypefaceCache$Key0);
                    if(asyncTypefaceCache$AsyncTypefaceResult0 == null) {
                        asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)this.c.e(asyncTypefaceCache$Key0);
                    }
                    if(asyncTypefaceCache$AsyncTypefaceResult0 != null) {
                        object2 = asyncTypefaceCache$AsyncTypefaceResult0.i();
                        goto label_26;
                    }
                    goto label_28;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(synchronizedObject0);
                throw throwable0;
            label_26:
                __monitor_exit(synchronizedObject0);
                return object2;
            label_28:
                __monitor_exit(synchronizedObject0);
                asyncTypefaceCache$runCached$10.k = this;
                asyncTypefaceCache$runCached$10.l = asyncTypefaceCache$Key0;
                asyncTypefaceCache$runCached$10.m = z;
                asyncTypefaceCache$runCached$10.p = 1;
                Object object3 = function10.invoke(asyncTypefaceCache$runCached$10);
                if(object3 == object1) {
                    return object1;
                }
                asyncTypefaceCache0 = this;
                object0 = object3;
                asyncTypefaceCache$Key1 = asyncTypefaceCache$Key0;
                break;
            }
            case 1: {
                z = asyncTypefaceCache$runCached$10.m;
                asyncTypefaceCache$Key1 = (Key)asyncTypefaceCache$runCached$10.l;
                asyncTypefaceCache0 = (AsyncTypefaceCache)asyncTypefaceCache$runCached$10.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        synchronized(asyncTypefaceCache0.d) {
            if(object0 == null) {
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult1 = AsyncTypefaceResult.a(asyncTypefaceCache0.a);
                asyncTypefaceCache0.c.n(asyncTypefaceCache$Key1, asyncTypefaceCache$AsyncTypefaceResult1);
            }
            else if(z) {
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult2 = AsyncTypefaceResult.a(object0);
                asyncTypefaceCache0.c.n(asyncTypefaceCache$Key1, asyncTypefaceCache$AsyncTypefaceResult2);
            }
            else {
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult3 = AsyncTypefaceResult.a(object0);
                asyncTypefaceCache0.b.k(asyncTypefaceCache$Key1, asyncTypefaceCache$AsyncTypefaceResult3);
            }
            return object0;
        }
    }

    @m
    public final Object h(@l Font font0, @l PlatformFontLoader platformFontLoader0, @l a a0) {
        Object object0;
        L.p(font0, "font");
        L.p(platformFontLoader0, "platformFontLoader");
        L.p(a0, "block");
        SynchronizedObject synchronizedObject0 = this.d;
        __monitor_enter(synchronizedObject0);
        try {
            Key asyncTypefaceCache$Key0 = new Key(font0, platformFontLoader0.a());
            AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)this.b.g(asyncTypefaceCache$Key0);
            if(asyncTypefaceCache$AsyncTypefaceResult0 == null) {
                asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)this.c.e(asyncTypefaceCache$Key0);
            }
            if(asyncTypefaceCache$AsyncTypefaceResult0 != null) {
                object0 = asyncTypefaceCache$AsyncTypefaceResult0.i();
                goto label_15;
            }
            goto label_17;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(synchronizedObject0);
        throw throwable0;
    label_15:
        __monitor_exit(synchronizedObject0);
        return object0;
    label_17:
        __monitor_exit(synchronizedObject0);
        Object object1 = a0.invoke();
        AsyncTypefaceCache.f(this, font0, platformFontLoader0, object1, false, 8, null);
        return object1;
    }
}

