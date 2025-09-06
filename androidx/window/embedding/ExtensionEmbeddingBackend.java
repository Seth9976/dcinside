package androidx.window.embedding;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@ExperimentalWindowApi
public final class ExtensionEmbeddingBackend implements EmbeddingBackend {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final ExtensionEmbeddingBackend a() {
            if(ExtensionEmbeddingBackend.f == null) {
                ReentrantLock reentrantLock0 = ExtensionEmbeddingBackend.g;
                reentrantLock0.lock();
                try {
                    if(ExtensionEmbeddingBackend.f == null) {
                        ExtensionEmbeddingBackend.f = new ExtensionEmbeddingBackend(ExtensionEmbeddingBackend.e.b());
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
            }
            ExtensionEmbeddingBackend extensionEmbeddingBackend0 = ExtensionEmbeddingBackend.f;
            L.m(extensionEmbeddingBackend0);
            return extensionEmbeddingBackend0;
        }

        private final EmbeddingInterfaceCompat b() {
            EmbeddingInterfaceCompat embeddingInterfaceCompat0 = null;
            try {
                if(this.c(EmbeddingCompat.c.b()) && EmbeddingCompat.c.c()) {
                    embeddingInterfaceCompat0 = new EmbeddingCompat();
                }
            }
            catch(Throwable throwable0) {
                Log.d("EmbeddingBackend", "Failed to load embedding extension: " + throwable0);
            }
            if(embeddingInterfaceCompat0 == null) {
                Log.d("EmbeddingBackend", "No supported embedding extension found");
            }
            return embeddingInterfaceCompat0;
        }

        @VisibleForTesting
        public final boolean c(@m Integer integer0) {
            return integer0 == null ? false : ((int)integer0) >= 1;
        }
    }

    public final class EmbeddingCallbackImpl implements EmbeddingCallbackInterface {
        @m
        private List a;
        final ExtensionEmbeddingBackend b;

        public EmbeddingCallbackImpl() {
            L.p(extensionEmbeddingBackend0, "this$0");
            this.b = extensionEmbeddingBackend0;
            super();
        }

        @Override  // androidx.window.embedding.EmbeddingInterfaceCompat$EmbeddingCallbackInterface
        public void a(@l List list0) {
            L.p(list0, "splitInfo");
            this.a = list0;
            for(Object object0: this.b.l()) {
                ((SplitListenerWrapper)object0).b(list0);
            }
        }

        @m
        public final List b() {
            return this.a;
        }

        public final void c(@m List list0) {
            this.a = list0;
        }
    }

    public static final class SplitListenerWrapper {
        @l
        private final Activity a;
        @l
        private final Executor b;
        @l
        private final Consumer c;
        @m
        private List d;

        public SplitListenerWrapper(@l Activity activity0, @l Executor executor0, @l Consumer consumer0) {
            L.p(activity0, "activity");
            L.p(executor0, "executor");
            L.p(consumer0, "callback");
            super();
            this.a = activity0;
            this.b = executor0;
            this.c = consumer0;
        }

        public final void b(@l List list0) {
            L.p(list0, "splitInfoList");
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                if(((SplitInfo)object0).a(this.a)) {
                    arrayList0.add(object0);
                }
            }
            if(L.g(arrayList0, this.d)) {
                return;
            }
            this.d = arrayList0;
            f f0 = () -> {
                L.p(this, "this$0");
                L.p(arrayList0, "$splitsWithActivity");
                this.c.accept(arrayList0);
            };
            this.b.execute(f0);
        }

        // 检测为 Lambda 实现
        private static final void c(SplitListenerWrapper extensionEmbeddingBackend$SplitListenerWrapper0, List list0) [...]

        @l
        public final Consumer d() {
            return this.c;
        }
    }

    @GuardedBy("globalLock")
    @VisibleForTesting
    @m
    private EmbeddingInterfaceCompat a;
    @l
    private final CopyOnWriteArrayList b;
    @l
    private final EmbeddingCallbackImpl c;
    @l
    private final CopyOnWriteArraySet d;
    @l
    public static final Companion e = null;
    @m
    private static volatile ExtensionEmbeddingBackend f = null;
    @l
    private static final ReentrantLock g = null;
    @l
    private static final String h = "EmbeddingBackend";

    static {
        ExtensionEmbeddingBackend.e = new Companion(null);
        ExtensionEmbeddingBackend.g = new ReentrantLock();
    }

    @VisibleForTesting
    public ExtensionEmbeddingBackend(@m EmbeddingInterfaceCompat embeddingInterfaceCompat0) {
        this.a = embeddingInterfaceCompat0;
        EmbeddingCallbackImpl extensionEmbeddingBackend$EmbeddingCallbackImpl0 = new EmbeddingCallbackImpl(this);
        this.c = extensionEmbeddingBackend$EmbeddingCallbackImpl0;
        this.b = new CopyOnWriteArrayList();
        EmbeddingInterfaceCompat embeddingInterfaceCompat1 = this.a;
        if(embeddingInterfaceCompat1 != null) {
            embeddingInterfaceCompat1.b(extensionEmbeddingBackend$EmbeddingCallbackImpl0);
        }
        this.d = new CopyOnWriteArraySet();
    }

    @Override  // androidx.window.embedding.EmbeddingBackend
    public void a(@l Set set0) {
        L.p(set0, "rules");
        this.d.clear();
        this.d.addAll(set0);
        EmbeddingInterfaceCompat embeddingInterfaceCompat0 = this.a;
        if(embeddingInterfaceCompat0 != null) {
            embeddingInterfaceCompat0.a(this.d);
        }
    }

    @Override  // androidx.window.embedding.EmbeddingBackend
    @l
    public Set b() {
        return this.d;
    }

    @Override  // androidx.window.embedding.EmbeddingBackend
    public void c(@l Activity activity0, @l Executor executor0, @l Consumer consumer0) {
        L.p(activity0, "activity");
        L.p(executor0, "executor");
        L.p(consumer0, "callback");
        ReentrantLock reentrantLock0 = ExtensionEmbeddingBackend.g;
        reentrantLock0.lock();
        try {
            if(this.k() == null) {
                Log.v("EmbeddingBackend", "Extension not loaded, skipping callback registration.");
                consumer0.accept(u.H());
                return;
            }
            SplitListenerWrapper extensionEmbeddingBackend$SplitListenerWrapper0 = new SplitListenerWrapper(activity0, executor0, consumer0);
            this.l().add(extensionEmbeddingBackend$SplitListenerWrapper0);
            if(this.c.b() == null) {
                extensionEmbeddingBackend$SplitListenerWrapper0.b(u.H());
            }
            else {
                List list0 = this.c.b();
                L.m(list0);
                extensionEmbeddingBackend$SplitListenerWrapper0.b(list0);
            }
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @Override  // androidx.window.embedding.EmbeddingBackend
    public void d(@l Consumer consumer0) {
        L.p(consumer0, "consumer");
        ReentrantLock reentrantLock0 = ExtensionEmbeddingBackend.g;
        reentrantLock0.lock();
        try {
            for(Object object0: this.l()) {
                SplitListenerWrapper extensionEmbeddingBackend$SplitListenerWrapper0 = (SplitListenerWrapper)object0;
                if(L.g(extensionEmbeddingBackend$SplitListenerWrapper0.d(), consumer0)) {
                    this.l().remove(extensionEmbeddingBackend$SplitListenerWrapper0);
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @Override  // androidx.window.embedding.EmbeddingBackend
    public boolean e() {
        return this.a != null;
    }

    @Override  // androidx.window.embedding.EmbeddingBackend
    public void f(@l EmbeddingRule embeddingRule0) {
        L.p(embeddingRule0, "rule");
        if(this.d.contains(embeddingRule0)) {
            this.d.remove(embeddingRule0);
            EmbeddingInterfaceCompat embeddingInterfaceCompat0 = this.a;
            if(embeddingInterfaceCompat0 != null) {
                embeddingInterfaceCompat0.a(this.d);
            }
        }
    }

    @Override  // androidx.window.embedding.EmbeddingBackend
    public void g(@l EmbeddingRule embeddingRule0) {
        L.p(embeddingRule0, "rule");
        if(!this.d.contains(embeddingRule0)) {
            this.d.add(embeddingRule0);
            EmbeddingInterfaceCompat embeddingInterfaceCompat0 = this.a;
            if(embeddingInterfaceCompat0 != null) {
                embeddingInterfaceCompat0.a(this.d);
            }
        }
    }

    @m
    public final EmbeddingInterfaceCompat k() {
        return this.a;
    }

    @l
    public final CopyOnWriteArrayList l() {
        return this.b;
    }

    @VisibleForTesting
    public static void m() {
    }

    public final void n(@m EmbeddingInterfaceCompat embeddingInterfaceCompat0) {
        this.a = embeddingInterfaceCompat0;
    }
}

