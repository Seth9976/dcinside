package androidx.compose.ui.platform;

import A3.o;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.res.ImageVectorCache;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,170:1\n25#2:171\n36#2:178\n25#2:185\n25#2:192\n25#2:199\n25#2:206\n25#2:214\n1114#3,6:172\n1114#3,6:179\n1114#3,6:186\n1114#3,6:193\n1114#3,6:200\n1114#3,3:207\n1117#3,3:211\n1114#3,6:215\n1#4:210\n76#5:221\n102#5,2:222\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n*L\n90#1:171\n97#1:178\n99#1:185\n104#1:192\n137#1:199\n138#1:206\n141#1:214\n90#1:172,6\n97#1:179,6\n99#1:186,6\n104#1:193,6\n137#1:200,6\n138#1:207,3\n138#1:211,3\n141#1:215,6\n90#1:221\n90#1:222,2\n*E\n"})
public final class AndroidCompositionLocals_androidKt {
    @l
    private static final ProvidableCompositionLocal a;
    @l
    private static final ProvidableCompositionLocal b;
    @l
    private static final ProvidableCompositionLocal c;
    @l
    private static final ProvidableCompositionLocal d;
    @l
    private static final ProvidableCompositionLocal e;
    @l
    private static final ProvidableCompositionLocal f;

    static {
        AndroidCompositionLocals_androidKt.a = CompositionLocalKt.c(SnapshotStateKt.l(), AndroidCompositionLocals_androidKt.LocalConfiguration.1.e);
        AndroidCompositionLocals_androidKt.b = CompositionLocalKt.e(AndroidCompositionLocals_androidKt.LocalContext.1.e);
        AndroidCompositionLocals_androidKt.c = CompositionLocalKt.e(AndroidCompositionLocals_androidKt.LocalImageVectorCache.1.e);
        AndroidCompositionLocals_androidKt.d = CompositionLocalKt.e(AndroidCompositionLocals_androidKt.LocalLifecycleOwner.1.e);
        AndroidCompositionLocals_androidKt.e = CompositionLocalKt.e(AndroidCompositionLocals_androidKt.LocalSavedStateRegistryOwner.1.e);
        AndroidCompositionLocals_androidKt.f = CompositionLocalKt.e(AndroidCompositionLocals_androidKt.LocalView.1.e);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void a(@l AndroidComposeView androidComposeView0, @l o o0, @m Composer composer0, int v) {
        L.p(androidComposeView0, "owner");
        L.p(o0, "content");
        Composer composer1 = composer0.G(1396852028);
        if(ComposerKt.g0()) {
            ComposerKt.w0(1396852028, v, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:83)");
        }
        Context context0 = androidComposeView0.getContext();
        composer1.V(0xE2A708A4);
        MutableState mutableState0 = composer1.W();
        Companion composer$Companion0 = Composer.a;
        if(mutableState0 == composer$Companion0.a()) {
            mutableState0 = SnapshotStateKt.j(context0.getResources().getConfiguration(), SnapshotStateKt.l());
            composer1.O(mutableState0);
        }
        composer1.g0();
        composer1.V(0x44FAF204);
        boolean z = composer1.t(mutableState0);
        androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals.1.1 androidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$10 = composer1.W();
        if(z || androidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$10 == composer$Companion0.a()) {
            androidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$10 = new Function1(mutableState0) {
                final MutableState e;

                {
                    this.e = mutableState0;
                    super(1);
                }

                public final void a(@l Configuration configuration0) {
                    L.p(configuration0, "it");
                    AndroidCompositionLocals_androidKt.c(this.e, configuration0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((Configuration)object0));
                    return S0.a;
                }
            };
            composer1.O(androidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$10);
        }
        composer1.g0();
        androidComposeView0.setConfigurationChangeObserver(androidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$10);
        composer1.V(0xE2A708A4);
        AndroidUriHandler androidUriHandler0 = composer1.W();
        if(androidUriHandler0 == composer$Companion0.a()) {
            L.o(context0, "context");
            androidUriHandler0 = new AndroidUriHandler(context0);
            composer1.O(androidUriHandler0);
        }
        composer1.g0();
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = androidComposeView0.getViewTreeOwners();
        if(androidComposeView$ViewTreeOwners0 == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        composer1.V(0xE2A708A4);
        DisposableSaveableStateRegistry disposableSaveableStateRegistry0 = composer1.W();
        if(disposableSaveableStateRegistry0 == composer$Companion0.a()) {
            disposableSaveableStateRegistry0 = DisposableSaveableStateRegistry_androidKt.a(androidComposeView0, androidComposeView$ViewTreeOwners0.b());
            composer1.O(disposableSaveableStateRegistry0);
        }
        composer1.g0();
        androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals.2 androidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$20 = new Function1(disposableSaveableStateRegistry0) {
            final DisposableSaveableStateRegistry e;

            {
                this.e = disposableSaveableStateRegistry0;
                super(1);
            }

            @l
            public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                L.p(disposableEffectScope0, "$this$DisposableEffect");
                return new DisposableEffectResult() {
                    @Override  // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.a.b();
                    }
                };
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((DisposableEffectScope)object0));
            }
        };
        EffectsKt.c(S0.a, androidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$20, composer1, 6);
        L.o(context0, "context");
        ImageVectorCache imageVectorCache0 = AndroidCompositionLocals_androidKt.m(context0, AndroidCompositionLocals_androidKt.b(mutableState0), composer1, 72);
        Configuration configuration0 = AndroidCompositionLocals_androidKt.b(mutableState0);
        L.o(configuration0, "configuration");
        CompositionLocalKt.b(new ProvidedValue[]{AndroidCompositionLocals_androidKt.a.f(configuration0), AndroidCompositionLocals_androidKt.b.f(context0), AndroidCompositionLocals_androidKt.d.f(androidComposeView$ViewTreeOwners0.a()), AndroidCompositionLocals_androidKt.e.f(androidComposeView$ViewTreeOwners0.b()), SaveableStateRegistryKt.b().f(disposableSaveableStateRegistry0), AndroidCompositionLocals_androidKt.f.f(androidComposeView0), AndroidCompositionLocals_androidKt.c.f(imageVectorCache0)}, ComposableLambdaKt.b(composer1, 0x57B729FC, true, new o(androidComposeView0, androidUriHandler0, o0, v) {
            final AndroidComposeView e;
            final AndroidUriHandler f;
            final o g;
            final int h;

            {
                this.e = androidComposeView0;
                this.f = androidUriHandler0;
                this.g = o0;
                this.h = v;
                super(2);
            }

            @Composable
            public final void a(@m Composer composer0, int v) {
                if((v & 11) == 2 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x57B729FC, v, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:121)");
                }
                CompositionLocalsKt.a(this.e, this.f, this.g, composer0, this.h << 3 & 0x380 | 72);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((Composer)object0), ((Number)object1).intValue());
                return S0.a;
            }
        }), composer1, 56);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(androidComposeView0, o0, v) {
                final AndroidComposeView e;
                final o f;
                final int g;

                {
                    this.e = androidComposeView0;
                    this.f = o0;
                    this.g = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AndroidCompositionLocals_androidKt.a(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    private static final Configuration b(MutableState mutableState0) {
        return (Configuration)mutableState0.getValue();
    }

    private static final void c(MutableState mutableState0, Configuration configuration0) {
        mutableState0.setValue(configuration0);
    }

    @l
    public static final ProvidableCompositionLocal f() {
        return AndroidCompositionLocals_androidKt.a;
    }

    @l
    public static final ProvidableCompositionLocal g() {
        return AndroidCompositionLocals_androidKt.b;
    }

    @l
    public static final ProvidableCompositionLocal h() {
        return AndroidCompositionLocals_androidKt.c;
    }

    @l
    public static final ProvidableCompositionLocal i() {
        return AndroidCompositionLocals_androidKt.d;
    }

    @l
    public static final ProvidableCompositionLocal j() {
        return AndroidCompositionLocals_androidKt.e;
    }

    @l
    public static final ProvidableCompositionLocal k() {
        return AndroidCompositionLocals_androidKt.f;
    }

    private static final Void l(String s) {
        throw new IllegalStateException(("CompositionLocal " + s + " not present").toString());
    }

    @Composable
    @Stable
    private static final ImageVectorCache m(Context context0, Configuration configuration0, Composer composer0, int v) {
        composer0.V(0xE309A0BA);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xE309A0BA, v, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:132)");
        }
        composer0.V(0xE2A708A4);
        ImageVectorCache imageVectorCache0 = composer0.W();
        Companion composer$Companion0 = Composer.a;
        if(imageVectorCache0 == composer$Companion0.a()) {
            imageVectorCache0 = new ImageVectorCache();
            composer0.O(imageVectorCache0);
        }
        composer0.g0();
        composer0.V(0xE2A708A4);
        Configuration configuration1 = composer0.W();
        if(configuration1 == composer$Companion0.a()) {
            configuration1 = new Configuration();
            if(configuration0 != null) {
                configuration1.setTo(configuration0);
            }
            composer0.O(configuration1);
        }
        composer0.g0();
        composer0.V(0xE2A708A4);
        androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.obtainImageVectorCache.callbacks.1.1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$10 = composer0.W();
        if(androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$10 == composer$Companion0.a()) {
            androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$10 = new ComponentCallbacks2() {
                @Override  // android.content.ComponentCallbacks
                public void onConfigurationChanged(@l Configuration configuration0) {
                    L.p(configuration0, "configuration");
                    int v = configuration1.updateFrom(configuration0);
                    imageVectorCache0.c(v);
                    configuration1.setTo(configuration0);
                }

                @Override  // android.content.ComponentCallbacks
                public void onLowMemory() {
                    imageVectorCache0.a();
                }

                @Override  // android.content.ComponentCallbacks2
                public void onTrimMemory(int v) {
                    imageVectorCache0.a();
                }
            };
            composer0.O(androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$10);
        }
        composer0.g0();
        EffectsKt.c(imageVectorCache0, new Function1(context0, androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$10) {
            final Context e;
            final androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.obtainImageVectorCache.callbacks.1.1 f;

            {
                this.e = context0;
                this.f = androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$10;
                super(1);
            }

            @l
            public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                L.p(disposableEffectScope0, "$this$DisposableEffect");
                this.e.getApplicationContext().registerComponentCallbacks(this.f);
                return new DisposableEffectResult() {
                    @Override  // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.f.getApplicationContext().unregisterComponentCallbacks(this.b);
                    }
                };
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((DisposableEffectScope)object0));
            }
        }, composer0, 8);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return imageVectorCache0;
    }
}

