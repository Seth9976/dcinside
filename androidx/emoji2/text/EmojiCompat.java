package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.CheckResult;
import androidx.annotation.ColorInt;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@AnyThread
public class EmojiCompat {
    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface CodepointSequenceMatchResult {
    }

    @RequiresApi(19)
    static final class CompatInternal19 extends CompatInternal {
        private volatile EmojiProcessor b;
        private volatile MetadataRepo c;

        CompatInternal19(EmojiCompat emojiCompat0) {
            super(emojiCompat0);
        }

        @Override  // androidx.emoji2.text.EmojiCompat$CompatInternal
        String a() {
            String s = this.c.g().N();
            return s == null ? "" : s;
        }

        @Override  // androidx.emoji2.text.EmojiCompat$CompatInternal
        int b(@NonNull CharSequence charSequence0, int v) {
            return this.b.b(charSequence0, v);
        }

        @Override  // androidx.emoji2.text.EmojiCompat$CompatInternal
        public int c(CharSequence charSequence0, int v) {
            return this.b.d(charSequence0, v);
        }

        @Override  // androidx.emoji2.text.EmojiCompat$CompatInternal
        int d(@NonNull CharSequence charSequence0, int v) {
            return this.b.e(charSequence0, v);
        }

        @Override  // androidx.emoji2.text.EmojiCompat$CompatInternal
        boolean e(@NonNull CharSequence charSequence0) {
            return this.b.c(charSequence0) == 1;
        }

        @Override  // androidx.emoji2.text.EmojiCompat$CompatInternal
        boolean f(@NonNull CharSequence charSequence0, int v) {
            return this.b.d(charSequence0, v) == 1;
        }

        @Override  // androidx.emoji2.text.EmojiCompat$CompatInternal
        void g() {
            try {
                androidx.emoji2.text.EmojiCompat.CompatInternal19.1 emojiCompat$CompatInternal19$10 = new MetadataRepoLoaderCallback() {
                    final CompatInternal19 a;

                    @Override  // androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback
                    public void a(@Nullable Throwable throwable0) {
                        CompatInternal19.this.a.v(throwable0);
                    }

                    @Override  // androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback
                    public void b(@NonNull MetadataRepo metadataRepo0) {
                        CompatInternal19.this.j(metadataRepo0);
                    }
                };
                this.a.f.a(emojiCompat$CompatInternal19$10);
            }
            catch(Throwable throwable0) {
                this.a.v(throwable0);
            }
        }

        @Override  // androidx.emoji2.text.EmojiCompat$CompatInternal
        CharSequence h(@NonNull CharSequence charSequence0, int v, int v1, int v2, boolean z) {
            return this.b.l(charSequence0, v, v1, v2, z);
        }

        @Override  // androidx.emoji2.text.EmojiCompat$CompatInternal
        void i(@NonNull EditorInfo editorInfo0) {
            editorInfo0.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.c.h());
            editorInfo0.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.a.h);
        }

        void j(@NonNull MetadataRepo metadataRepo0) {
            if(metadataRepo0 == null) {
                IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("metadataRepo cannot be null");
                this.a.v(illegalArgumentException0);
                return;
            }
            this.c = metadataRepo0;
            MetadataRepo metadataRepo1 = this.c;
            SpanFactory emojiCompat$SpanFactory0 = this.a.g;
            GlyphChecker emojiCompat$GlyphChecker0 = this.a.n;
            Set set0 = EmojiExclusions.a();
            this.b = new EmojiProcessor(metadataRepo1, emojiCompat$SpanFactory0, emojiCompat$GlyphChecker0, this.a.i, this.a.j, set0);
            this.a.w();
        }
    }

    static class CompatInternal {
        final EmojiCompat a;

        CompatInternal(EmojiCompat emojiCompat0) {
            this.a = emojiCompat0;
        }

        String a() [...] // 潜在的解密器

        int b(@NonNull CharSequence charSequence0, @IntRange(from = 0L) int v) {
            return -1;
        }

        public int c(CharSequence charSequence0, int v) {
            return 0;
        }

        int d(@NonNull CharSequence charSequence0, @IntRange(from = 0L) int v) {
            return -1;
        }

        boolean e(@NonNull CharSequence charSequence0) {
            return false;
        }

        boolean f(@NonNull CharSequence charSequence0, int v) {
            return false;
        }

        void g() {
            this.a.w();
        }

        CharSequence h(@NonNull CharSequence charSequence0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, @IntRange(from = 0L) int v2, boolean z) {
            return charSequence0;
        }

        void i(@NonNull EditorInfo editorInfo0) {
        }
    }

    public static abstract class Config {
        @NonNull
        final MetadataRepoLoader a;
        SpanFactory b;
        boolean c;
        boolean d;
        @Nullable
        int[] e;
        @Nullable
        Set f;
        boolean g;
        int h;
        int i;
        @NonNull
        GlyphChecker j;

        protected Config(@NonNull MetadataRepoLoader emojiCompat$MetadataRepoLoader0) {
            this.h = 0xFF00FF00;
            this.i = 0;
            this.j = new DefaultGlyphChecker();
            Preconditions.m(emojiCompat$MetadataRepoLoader0, "metadataLoader cannot be null.");
            this.a = emojiCompat$MetadataRepoLoader0;
        }

        @NonNull
        protected final MetadataRepoLoader a() {
            return this.a;
        }

        @NonNull
        public Config b(@NonNull InitCallback emojiCompat$InitCallback0) {
            Preconditions.m(emojiCompat$InitCallback0, "initCallback cannot be null");
            if(this.f == null) {
                this.f = new ArraySet();
            }
            this.f.add(emojiCompat$InitCallback0);
            return this;
        }

        @NonNull
        public Config c(@ColorInt int v) {
            this.h = v;
            return this;
        }

        @NonNull
        public Config d(boolean z) {
            this.g = z;
            return this;
        }

        @NonNull
        public Config e(@NonNull GlyphChecker emojiCompat$GlyphChecker0) {
            Preconditions.m(emojiCompat$GlyphChecker0, "GlyphChecker cannot be null");
            this.j = emojiCompat$GlyphChecker0;
            return this;
        }

        @NonNull
        public Config f(int v) {
            this.i = v;
            return this;
        }

        @NonNull
        public Config g(boolean z) {
            this.c = z;
            return this;
        }

        @NonNull
        public Config h(@NonNull SpanFactory emojiCompat$SpanFactory0) {
            this.b = emojiCompat$SpanFactory0;
            return this;
        }

        @NonNull
        public Config i(boolean z) {
            return this.j(z, null);
        }

        @NonNull
        public Config j(boolean z, @Nullable List list0) {
            this.d = z;
            if(z && list0 != null) {
                this.e = new int[list0.size()];
                int v = 0;
                for(Object object0: list0) {
                    this.e[v] = (int)(((Integer)object0));
                    ++v;
                }
                Arrays.sort(this.e);
                return this;
            }
            this.e = null;
            return this;
        }

        @NonNull
        public Config k(@NonNull InitCallback emojiCompat$InitCallback0) {
            Preconditions.m(emojiCompat$InitCallback0, "initCallback cannot be null");
            Set set0 = this.f;
            if(set0 != null) {
                set0.remove(emojiCompat$InitCallback0);
            }
            return this;
        }
    }

    @RestrictTo({Scope.a})
    public static class DefaultSpanFactory implements SpanFactory {
        @Override  // androidx.emoji2.text.EmojiCompat$SpanFactory
        @NonNull
        @RequiresApi(19)
        public EmojiSpan a(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer0) {
            return new TypefaceEmojiSpan(typefaceEmojiRasterizer0);
        }
    }

    public interface GlyphChecker {
        boolean a(@NonNull CharSequence arg1, @IntRange(from = 0L) int arg2, @IntRange(from = 0L) int arg3, @IntRange(from = 0L) int arg4);
    }

    public static abstract class InitCallback {
        public void a(@Nullable Throwable throwable0) {
        }

        public void b() {
        }
    }

    static class ListenerDispatcher implements Runnable {
        private final List a;
        private final Throwable b;
        private final int c;

        ListenerDispatcher(@NonNull InitCallback emojiCompat$InitCallback0, int v) {
            this(Arrays.asList(new InitCallback[]{((InitCallback)Preconditions.m(emojiCompat$InitCallback0, "initCallback cannot be null"))}), v, null);
        }

        ListenerDispatcher(@NonNull Collection collection0, int v) {
            this(collection0, v, null);
        }

        ListenerDispatcher(@NonNull Collection collection0, int v, @Nullable Throwable throwable0) {
            Preconditions.m(collection0, "initCallbacks cannot be null");
            this.a = new ArrayList(collection0);
            this.c = v;
            this.b = throwable0;
        }

        @Override
        public void run() {
            int v = this.a.size();
            int v1 = 0;
            if(this.c != 1) {
                while(v1 < v) {
                    ((InitCallback)this.a.get(v1)).a(this.b);
                    ++v1;
                }
                return;
            }
            while(v1 < v) {
                ((InitCallback)this.a.get(v1)).b();
                ++v1;
            }
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LoadStrategy {
    }

    public interface MetadataRepoLoader {
        void a(@NonNull MetadataRepoLoaderCallback arg1);
    }

    public static abstract class MetadataRepoLoaderCallback {
        public abstract void a(@Nullable Throwable arg1);

        public abstract void b(@NonNull MetadataRepo arg1);
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReplaceStrategy {
    }

    public interface SpanFactory {
        @NonNull
        @RequiresApi(19)
        EmojiSpan a(@NonNull TypefaceEmojiRasterizer arg1);
    }

    public static final int A = 1;
    public static final int B = 2;
    @RestrictTo({Scope.a})
    static final int C = 0x7FFFFFFF;
    private static final Object D = null;
    private static final Object E = null;
    @GuardedBy("INSTANCE_LOCK")
    @Nullable
    private static volatile EmojiCompat F = null;
    @GuardedBy("CONFIG_LOCK")
    private static volatile boolean G = false;
    private static final String H = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";
    @NonNull
    private final ReadWriteLock a;
    @GuardedBy("mInitLock")
    @NonNull
    private final Set b;
    @GuardedBy("mInitLock")
    private volatile int c;
    @NonNull
    private final Handler d;
    @NonNull
    private final CompatInternal e;
    @NonNull
    final MetadataRepoLoader f;
    @NonNull
    private final SpanFactory g;
    final boolean h;
    final boolean i;
    @Nullable
    final int[] j;
    private final boolean k;
    private final int l;
    private final int m;
    private final GlyphChecker n;
    public static final String o = "android.support.text.emoji.emojiCompat_metadataVersion";
    public static final String p = "android.support.text.emoji.emojiCompat_replaceAll";
    public static final int q = 3;
    public static final int r = 0;
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 0;
    public static final int y = 1;
    public static final int z;

    static {
        EmojiCompat.D = new Object();
        EmojiCompat.E = new Object();
    }

    private EmojiCompat(@NonNull Config emojiCompat$Config0) {
        this.a = new ReentrantReadWriteLock();
        this.c = 3;
        this.h = emojiCompat$Config0.c;
        this.i = emojiCompat$Config0.d;
        this.j = emojiCompat$Config0.e;
        this.k = emojiCompat$Config0.g;
        this.l = emojiCompat$Config0.h;
        this.f = emojiCompat$Config0.a;
        this.m = emojiCompat$Config0.i;
        this.n = emojiCompat$Config0.j;
        this.d = new Handler(Looper.getMainLooper());
        ArraySet arraySet0 = new ArraySet();
        this.b = arraySet0;
        SpanFactory emojiCompat$SpanFactory0 = emojiCompat$Config0.b;
        if(emojiCompat$SpanFactory0 == null) {
            emojiCompat$SpanFactory0 = new DefaultSpanFactory();
        }
        this.g = emojiCompat$SpanFactory0;
        if(emojiCompat$Config0.f != null && !emojiCompat$Config0.f.isEmpty()) {
            arraySet0.addAll(emojiCompat$Config0.f);
        }
        this.e = new CompatInternal19(this);
        this.u();
    }

    @CheckResult
    @Nullable
    public CharSequence A(@Nullable CharSequence charSequence0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, @IntRange(from = 0L) int v2, int v3) {
        Preconditions.o(this.s(), "Not initialized yet");
        Preconditions.j(v, "start cannot be negative");
        Preconditions.j(v1, "end cannot be negative");
        Preconditions.j(v2, "maxEmojiCount cannot be negative");
        Preconditions.b(v <= v1, "start should be <= than end");
        if(charSequence0 == null) {
            return null;
        }
        Preconditions.b(v <= charSequence0.length(), "start should be < than charSequence length");
        Preconditions.b(v1 <= charSequence0.length(), "end should be < than charSequence length");
        if(charSequence0.length() != 0 && v != v1) {
            switch(v3) {
                case 1: {
                    return this.e.h(charSequence0, v, v1, v2, true);
                }
                case 2: {
                    return this.e.h(charSequence0, v, v1, v2, false);
                }
                default: {
                    return this.e.h(charSequence0, v, v1, v2, this.h);
                }
            }
        }
        return charSequence0;
    }

    public void B(@NonNull InitCallback emojiCompat$InitCallback0) {
        Preconditions.m(emojiCompat$InitCallback0, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if(this.c == 1 || this.c == 2) {
                ListenerDispatcher emojiCompat$ListenerDispatcher0 = new ListenerDispatcher(emojiCompat$InitCallback0, this.c);
                this.d.post(emojiCompat$ListenerDispatcher0);
            }
            else {
                this.b.add(emojiCompat$InitCallback0);
            }
        }
        finally {
            this.a.writeLock().unlock();
        }
    }

    @NonNull
    public static EmojiCompat C(@NonNull Config emojiCompat$Config0) {
        synchronized(EmojiCompat.D) {
            EmojiCompat emojiCompat0 = new EmojiCompat(emojiCompat$Config0);
            EmojiCompat.F = emojiCompat0;
            return emojiCompat0;
        }
    }

    @Nullable
    @RestrictTo({Scope.e})
    public static EmojiCompat D(@Nullable EmojiCompat emojiCompat0) {
        synchronized(EmojiCompat.D) {
            EmojiCompat.F = emojiCompat0;
        }
        return EmojiCompat.F;
    }

    @RestrictTo({Scope.e})
    public static void E(boolean z) {
        synchronized(EmojiCompat.E) {
            EmojiCompat.G = z;
        }
    }

    public void F(@NonNull InitCallback emojiCompat$InitCallback0) {
        Preconditions.m(emojiCompat$InitCallback0, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            this.b.remove(emojiCompat$InitCallback0);
        }
        finally {
            this.a.writeLock().unlock();
        }
    }

    public void G(@NonNull EditorInfo editorInfo0) {
        if(this.s() && editorInfo0 != null) {
            if(editorInfo0.extras == null) {
                editorInfo0.extras = new Bundle();
            }
            this.e.i(editorInfo0);
        }
    }

    @NonNull
    public static EmojiCompat c() {
        synchronized(EmojiCompat.D) {
            EmojiCompat emojiCompat0 = EmojiCompat.F;
            Preconditions.o(emojiCompat0 != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            return emojiCompat0;
        }
    }

    @NonNull
    public String d() {
        Preconditions.o(this.s(), "Not initialized yet");
        return "";
    }

    public int e(@NonNull CharSequence charSequence0, @IntRange(from = 0L) int v) {
        return this.e.b(charSequence0, v);
    }

    public int f(@NonNull CharSequence charSequence0, @IntRange(from = 0L) int v) {
        Preconditions.o(this.s(), "Not initialized yet");
        Preconditions.m(charSequence0, "sequence cannot be null");
        return this.e.c(charSequence0, v);
    }

    @ColorInt
    @RestrictTo({Scope.b})
    public int g() {
        return this.l;
    }

    public int h(@NonNull CharSequence charSequence0, @IntRange(from = 0L) int v) {
        return this.e.d(charSequence0, v);
    }

    public int i() {
        this.a.readLock().lock();
        int v = this.c;
        this.a.readLock().unlock();
        return v;
    }

    public static boolean j(@NonNull InputConnection inputConnection0, @NonNull Editable editable0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, boolean z) {
        return EmojiProcessor.f(inputConnection0, editable0, v, v1, z);
    }

    public static boolean k(@NonNull Editable editable0, int v, @NonNull KeyEvent keyEvent0) {
        return EmojiProcessor.g(editable0, v, keyEvent0);
    }

    @Deprecated
    public boolean l(@NonNull CharSequence charSequence0) {
        Preconditions.o(this.s(), "Not initialized yet");
        Preconditions.m(charSequence0, "sequence cannot be null");
        return this.e.e(charSequence0);
    }

    @Deprecated
    public boolean m(@NonNull CharSequence charSequence0, @IntRange(from = 0L) int v) {
        Preconditions.o(this.s(), "Not initialized yet");
        Preconditions.m(charSequence0, "sequence cannot be null");
        return this.e.f(charSequence0, v);
    }

    @Nullable
    public static EmojiCompat n(@NonNull Context context0) {
        return EmojiCompat.o(context0, null);
    }

    @Nullable
    @RestrictTo({Scope.a})
    public static EmojiCompat o(@NonNull Context context0, @Nullable DefaultEmojiCompatConfigFactory defaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory0) {
        if(EmojiCompat.G) {
            return EmojiCompat.F;
        }
        if(defaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory0 == null) {
            defaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory0 = new DefaultEmojiCompatConfigFactory(null);
        }
        Config emojiCompat$Config0 = defaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory0.c(context0);
        synchronized(EmojiCompat.E) {
            if(!EmojiCompat.G) {
                if(emojiCompat$Config0 != null) {
                    EmojiCompat.p(emojiCompat$Config0);
                }
                EmojiCompat.G = true;
            }
            return EmojiCompat.F;
        }
    }

    @NonNull
    public static EmojiCompat p(@NonNull Config emojiCompat$Config0) {
        EmojiCompat emojiCompat0 = EmojiCompat.F;
        if(emojiCompat0 == null) {
            synchronized(EmojiCompat.D) {
                emojiCompat0 = EmojiCompat.F;
                if(emojiCompat0 == null) {
                    emojiCompat0 = new EmojiCompat(emojiCompat$Config0);
                    EmojiCompat.F = emojiCompat0;
                }
            }
        }
        return emojiCompat0;
    }

    public static boolean q() [...] // 潜在的解密器

    @RestrictTo({Scope.b})
    public boolean r() {
        return this.k;
    }

    private boolean s() {
        return this.i() == 1;
    }

    public void t() {
        Preconditions.o(this.m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if(this.s()) {
            return;
        }
        this.a.writeLock().lock();
        if(this.c == 0) {
            this.a.writeLock().unlock();
            return;
        }
        this.c = 0;
        this.a.writeLock().unlock();
        this.e.g();
    }

    private void u() {
        this.a.writeLock().lock();
        if(this.m == 0) {
            this.c = 0;
        }
        this.a.writeLock().unlock();
        if(this.i() == 0) {
            this.e.g();
        }
    }

    void v(@Nullable Throwable throwable0) {
        ArrayList arrayList0 = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList0.addAll(this.b);
            this.b.clear();
        }
        finally {
            this.a.writeLock().unlock();
        }
        ListenerDispatcher emojiCompat$ListenerDispatcher0 = new ListenerDispatcher(arrayList0, this.c, throwable0);
        this.d.post(emojiCompat$ListenerDispatcher0);
    }

    void w() {
        ArrayList arrayList0 = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList0.addAll(this.b);
            this.b.clear();
        }
        finally {
            this.a.writeLock().unlock();
        }
        ListenerDispatcher emojiCompat$ListenerDispatcher0 = new ListenerDispatcher(arrayList0, this.c);
        this.d.post(emojiCompat$ListenerDispatcher0);
    }

    @CheckResult
    @Nullable
    public CharSequence x(@Nullable CharSequence charSequence0) {
        return charSequence0 == null ? this.y(null, 0, 0) : this.y(charSequence0, 0, charSequence0.length());
    }

    @CheckResult
    @Nullable
    public CharSequence y(@Nullable CharSequence charSequence0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1) {
        return this.z(charSequence0, v, v1, 0x7FFFFFFF);
    }

    @CheckResult
    @Nullable
    public CharSequence z(@Nullable CharSequence charSequence0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, @IntRange(from = 0L) int v2) {
        return this.A(charSequence0, v, v1, v2, 0);
    }
}

