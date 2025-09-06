package androidx.core.view;

import android.os.Build.VERSION;
import android.view.ScrollFeedbackProvider;
import android.view.View;
import androidx.annotation.RequiresApi;

public class ScrollFeedbackProviderCompat {
    @RequiresApi(35)
    static class ScrollFeedbackProviderApi35Impl implements ScrollFeedbackProviderImpl {
        private final ScrollFeedbackProvider a;

        ScrollFeedbackProviderApi35Impl(View view0) {
            this.a = ScrollFeedbackProvider.createProvider(view0);
        }

        @Override  // androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl
        public void a(int v, int v1, int v2, boolean z) {
            this.a.onScrollLimit(v, v1, v2, z);
        }

        @Override  // androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl
        public void b(int v, int v1, int v2, int v3) {
            this.a.onScrollProgress(v, v1, v2, v3);
        }

        @Override  // androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl
        public void c(int v, int v1, int v2) {
            this.a.onSnapToItem(v, v1, v2);
        }
    }

    static class ScrollFeedbackProviderBaseImpl implements ScrollFeedbackProviderImpl {
        private ScrollFeedbackProviderBaseImpl() {
        }

        ScrollFeedbackProviderBaseImpl(androidx.core.view.ScrollFeedbackProviderCompat.1 scrollFeedbackProviderCompat$10) {
        }

        @Override  // androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl
        public void a(int v, int v1, int v2, boolean z) {
        }

        @Override  // androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl
        public void b(int v, int v1, int v2, int v3) {
        }

        @Override  // androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl
        public void c(int v, int v1, int v2) {
        }
    }

    interface ScrollFeedbackProviderImpl {
        void a(int arg1, int arg2, int arg3, boolean arg4);

        void b(int arg1, int arg2, int arg3, int arg4);

        void c(int arg1, int arg2, int arg3);
    }

    private final ScrollFeedbackProviderImpl a;

    private ScrollFeedbackProviderCompat(View view0) {
        if(Build.VERSION.SDK_INT >= 35) {
            this.a = new ScrollFeedbackProviderApi35Impl(view0);
            return;
        }
        this.a = new ScrollFeedbackProviderBaseImpl(null);
    }

    public static ScrollFeedbackProviderCompat a(View view0) {
        return new ScrollFeedbackProviderCompat(view0);
    }

    public void b(int v, int v1, int v2, boolean z) {
        this.a.a(v, v1, v2, z);
    }

    public void c(int v, int v1, int v2, int v3) {
        this.a.b(v, v1, v2, v3);
    }

    public void d(int v, int v1, int v2) {
        this.a.c(v, v1, v2);
    }

    class androidx.core.view.ScrollFeedbackProviderCompat.1 {
    }

}

