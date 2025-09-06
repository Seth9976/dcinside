package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,248:1\n24#2:249\n24#2:250\n24#2:251\n24#2:252\n24#2:253\n24#2:254\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n*L\n165#1:249\n202#1:250\n219#1:251\n232#1:252\n239#1:253\n245#1:254\n*E\n"})
public final class TypefaceRequestCache {
    @l
    private final SynchronizedObject a;
    @l
    private final LruCache b;

    public TypefaceRequestCache() {
        this.a = Synchronization_jvmKt.a();
        this.b = new LruCache(16);
    }

    @m
    public final TypefaceResult b(@l TypefaceRequest typefaceRequest0) {
        L.p(typefaceRequest0, "typefaceRequest");
        synchronized(this.a) {
            return (TypefaceResult)this.b.g(typefaceRequest0);
        }
    }

    @l
    public final SynchronizedObject c() {
        return this.a;
    }

    public final int d() {
        synchronized(this.a) {
            return this.b.p();
        }
    }

    public final void e(@l List list0, @l Function1 function10) {
        TypefaceResult typefaceResult1;
        L.p(list0, "typefaceRequests");
        L.p(function10, "resolveTypeface");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            TypefaceRequest typefaceRequest0 = (TypefaceRequest)list0.get(v1);
            synchronized(this.a) {
                TypefaceResult typefaceResult0 = (TypefaceResult)this.b.g(typefaceRequest0);
            }
            if(typefaceResult0 == null) {
                try {
                    typefaceResult1 = (TypefaceResult)function10.invoke(typefaceRequest0);
                }
                catch(Exception exception0) {
                    throw new IllegalStateException("Could not load font", exception0);
                }
                if(!(typefaceResult1 instanceof Async)) {
                    synchronized(this.a) {
                        TypefaceResult typefaceResult2 = (TypefaceResult)this.b.k(typefaceRequest0, typefaceResult1);
                    }
                }
            }
        }
    }

    @l
    public final State f(@l TypefaceRequest typefaceRequest0, @l Function1 function10) {
        State state1;
        L.p(typefaceRequest0, "typefaceRequest");
        L.p(function10, "resolveTypeface");
        synchronized(this.a) {
            State state0 = (TypefaceResult)this.b.g(typefaceRequest0);
            if(state0 != null) {
                if(((TypefaceResult)state0).c()) {
                    return state0;
                }
                TypefaceResult typefaceResult0 = (TypefaceResult)this.b.m(typefaceRequest0);
            }
        }
        try {
            state1 = (TypefaceResult)function10.invoke(new Function1(typefaceRequest0) {
                final TypefaceRequestCache e;
                final TypefaceRequest f;

                {
                    this.e = typefaceRequestCache0;
                    this.f = typefaceRequest0;
                    super(1);
                }

                public final void a(@l TypefaceResult typefaceResult0) {
                    L.p(typefaceResult0, "finalResult");
                    SynchronizedObject synchronizedObject0 = this.e.c();
                    TypefaceRequestCache typefaceRequestCache0 = this.e;
                    TypefaceRequest typefaceRequest0 = this.f;
                    synchronized(synchronizedObject0) {
                        if(typefaceResult0.c()) {
                            typefaceRequestCache0.b.k(typefaceRequest0, typefaceResult0);
                        }
                        else {
                            typefaceRequestCache0.b.m(typefaceRequest0);
                        }
                    }
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((TypefaceResult)object0));
                    return S0.a;
                }
            });
        }
        catch(Exception exception0) {
            throw new IllegalStateException("Could not load font", exception0);
        }
        synchronized(this.a) {
            if(this.b.g(typefaceRequest0) == null && ((TypefaceResult)state1).c()) {
                this.b.k(typefaceRequest0, state1);
            }
            return state1;
        }
    }
}

