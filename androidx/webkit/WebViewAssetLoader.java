package androidx.webkit;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.core.util.Pair;
import androidx.webkit.internal.AssetHelper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public final class WebViewAssetLoader {
    public static final class AssetsPathHandler implements PathHandler {
        private AssetHelper a;

        public AssetsPathHandler(@NonNull Context context0) {
            this.a = new AssetHelper(context0);
        }

        @VisibleForTesting
        AssetsPathHandler(@NonNull AssetHelper assetHelper0) {
            this.a = assetHelper0;
        }

        @Override  // androidx.webkit.WebViewAssetLoader$PathHandler
        @Nullable
        @WorkerThread
        public WebResourceResponse a(@NonNull String s) {
            try {
                InputStream inputStream0 = this.a.h(s);
                return new WebResourceResponse(AssetHelper.f(s), null, inputStream0);
            }
            catch(IOException iOException0) {
                Log.e("WebViewAssetLoader", "Error opening asset path: " + s, iOException0);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    public static final class Builder {
        private boolean a;
        private String b;
        @NonNull
        private final List c;

        public Builder() {
            this.b = "appassets.androidplatform.net";
            this.c = new ArrayList();
        }

        @NonNull
        public Builder a(@NonNull String s, @NonNull PathHandler webViewAssetLoader$PathHandler0) {
            Pair pair0 = Pair.a(s, webViewAssetLoader$PathHandler0);
            this.c.add(pair0);
            return this;
        }

        @NonNull
        public WebViewAssetLoader b() {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.c) {
                arrayList0.add(new PathMatcher(this.b, ((String)((Pair)object0).a), this.a, ((PathHandler)((Pair)object0).b)));
            }
            return new WebViewAssetLoader(arrayList0);
        }

        @NonNull
        public Builder c(@NonNull String s) {
            this.b = s;
            return this;
        }

        @NonNull
        public Builder d(boolean z) {
            this.a = z;
            return this;
        }
    }

    public static final class InternalStoragePathHandler implements PathHandler {
        @NonNull
        private final File a;
        private static final String[] b;

        static {
            InternalStoragePathHandler.b = new String[]{"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};
        }

        public InternalStoragePathHandler(@NonNull Context context0, @NonNull File file0) {
            try {
                this.a = new File(AssetHelper.a(file0));
                if(!this.b(context0)) {
                    throw new IllegalArgumentException("The given directory \"" + file0 + "\" doesn\'t exist under an allowed app internal storage directory");
                }
            }
            catch(IOException iOException0) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file0.getPath(), iOException0);
            }
        }

        @Override  // androidx.webkit.WebViewAssetLoader$PathHandler
        @NonNull
        @WorkerThread
        public WebResourceResponse a(@NonNull String s) {
            try {
                File file0 = AssetHelper.b(this.a, s);
                if(file0 != null) {
                    InputStream inputStream0 = AssetHelper.i(file0);
                    return new WebResourceResponse(AssetHelper.f(s), null, inputStream0);
                }
                Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", s, this.a));
                return new WebResourceResponse(null, null, null);
            }
            catch(IOException iOException0) {
            }
            Log.e("WebViewAssetLoader", "Error opening the requested path: " + s, iOException0);
            return new WebResourceResponse(null, null, null);
        }

        private boolean b(@NonNull Context context0) throws IOException {
            String s = AssetHelper.a(this.a);
            String s1 = AssetHelper.a(context0.getCacheDir());
            String s2 = AssetHelper.a(AssetHelper.c(context0));
            if(!s.startsWith(s1) && !s.startsWith(s2)) {
                return false;
            }
            if(!s.equals(s1) && !s.equals(s2)) {
                String[] arr_s = InternalStoragePathHandler.b;
                for(int v = 0; v < arr_s.length; ++v) {
                    if(s.startsWith(s2 + arr_s[v])) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    }

    public interface PathHandler {
        @Nullable
        @WorkerThread
        WebResourceResponse a(@NonNull String arg1);
    }

    @VisibleForTesting
    static class PathMatcher {
        final boolean a;
        @NonNull
        final String b;
        @NonNull
        final String c;
        @NonNull
        final PathHandler d;
        static final String e = "http";
        static final String f = "https";

        PathMatcher(@NonNull String s, @NonNull String s1, boolean z, @NonNull PathHandler webViewAssetLoader$PathHandler0) {
            if(s1.isEmpty() || s1.charAt(0) != 0x2F) {
                throw new IllegalArgumentException("Path should start with a slash \'/\'.");
            }
            if(!s1.endsWith("/")) {
                throw new IllegalArgumentException("Path should end with a slash \'/\'");
            }
            this.b = s;
            this.c = s1;
            this.a = z;
            this.d = webViewAssetLoader$PathHandler0;
        }

        @NonNull
        @WorkerThread
        public String a(@NonNull String s) {
            return s.replaceFirst(this.c, "");
        }

        @Nullable
        @WorkerThread
        public PathHandler b(@NonNull Uri uri0) {
            if(uri0.getScheme().equals("http") && !this.a) {
                return null;
            }
            if(!uri0.getScheme().equals("http") && !uri0.getScheme().equals("https")) {
                return null;
            }
            if(!uri0.getAuthority().equals(this.b)) {
                return null;
            }
            return uri0.getPath().startsWith(this.c) ? this.d : null;
        }
    }

    public static final class ResourcesPathHandler implements PathHandler {
        private AssetHelper a;

        public ResourcesPathHandler(@NonNull Context context0) {
            this.a = new AssetHelper(context0);
        }

        @VisibleForTesting
        ResourcesPathHandler(@NonNull AssetHelper assetHelper0) {
            this.a = assetHelper0;
        }

        @Override  // androidx.webkit.WebViewAssetLoader$PathHandler
        @Nullable
        @WorkerThread
        public WebResourceResponse a(@NonNull String s) {
            try {
                InputStream inputStream0 = this.a.j(s);
                return new WebResourceResponse(AssetHelper.f(s), null, inputStream0);
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                Log.e("WebViewAssetLoader", "Resource not found from the path: " + s, resources$NotFoundException0);
                return new WebResourceResponse(null, null, null);
            }
            catch(IOException iOException0) {
                Log.e("WebViewAssetLoader", "Error opening resource from the path: " + s, iOException0);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    private final List a;
    private static final String b = "WebViewAssetLoader";
    public static final String c = "appassets.androidplatform.net";

    WebViewAssetLoader(@NonNull List list0) {
        this.a = list0;
    }

    @Nullable
    @WorkerThread
    public WebResourceResponse a(@NonNull Uri uri0) {
        for(Object object0: this.a) {
            PathMatcher webViewAssetLoader$PathMatcher0 = (PathMatcher)object0;
            PathHandler webViewAssetLoader$PathHandler0 = webViewAssetLoader$PathMatcher0.b(uri0);
            if(webViewAssetLoader$PathHandler0 != null) {
                WebResourceResponse webResourceResponse0 = webViewAssetLoader$PathHandler0.a(webViewAssetLoader$PathMatcher0.a(uri0.getPath()));
                if(webResourceResponse0 != null) {
                    return webResourceResponse0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }
}

