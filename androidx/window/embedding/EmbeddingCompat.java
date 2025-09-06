package androidx.window.embedding;

import android.util.Log;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@ExperimentalWindowApi
public final class EmbeddingCompat implements EmbeddingInterfaceCompat {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final ActivityEmbeddingComponent a() {
            if(this.c()) {
                ActivityEmbeddingComponent activityEmbeddingComponent0 = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
                return activityEmbeddingComponent0 == null ? new EmptyEmbeddingComponent() : activityEmbeddingComponent0;
            }
            return new EmptyEmbeddingComponent();
        }

        @m
        public final Integer b() {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
            }
            catch(NoClassDefFoundError unused_ex) {
                Log.d("EmbeddingCompat", "Embedding extension version not found");
                return null;
            }
            catch(UnsupportedOperationException unused_ex) {
                Log.d("EmbeddingCompat", "Stub Extension");
                return null;
            }
        }

        public final boolean c() {
            try {
                if(WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null) {
                    return true;
                }
            }
            catch(NoClassDefFoundError unused_ex) {
                Log.d("EmbeddingCompat", "Embedding extension version not found");
            }
            catch(UnsupportedOperationException unused_ex) {
                Log.d("EmbeddingCompat", "Stub Extension");
            }
            return false;
        }
    }

    @l
    private final ActivityEmbeddingComponent a;
    @l
    private final EmbeddingAdapter b;
    @l
    public static final Companion c = null;
    public static final boolean d = true;
    @l
    private static final String e = "EmbeddingCompat";

    static {
        EmbeddingCompat.c = new Companion(null);
    }

    public EmbeddingCompat() {
        this(EmbeddingCompat.c.a(), new EmbeddingAdapter());
    }

    public EmbeddingCompat(@l ActivityEmbeddingComponent activityEmbeddingComponent0, @l EmbeddingAdapter embeddingAdapter0) {
        L.p(activityEmbeddingComponent0, "embeddingExtension");
        L.p(embeddingAdapter0, "adapter");
        super();
        this.a = activityEmbeddingComponent0;
        this.b = embeddingAdapter0;
    }

    @Override  // androidx.window.embedding.EmbeddingInterfaceCompat
    public void a(@l Set set0) {
        L.p(set0, "rules");
        Set set1 = this.b.j(set0);
        this.a.setEmbeddingRules(set1);
    }

    @Override  // androidx.window.embedding.EmbeddingInterfaceCompat
    public void b(@l EmbeddingCallbackInterface embeddingInterfaceCompat$EmbeddingCallbackInterface0) {
        L.p(embeddingInterfaceCompat$EmbeddingCallbackInterface0, "embeddingCallback");
        EmbeddingTranslatingCallback embeddingTranslatingCallback0 = new EmbeddingTranslatingCallback(embeddingInterfaceCompat$EmbeddingCallbackInterface0, this.b);
        this.a.setSplitInfoCallback(embeddingTranslatingCallback0);
    }
}

