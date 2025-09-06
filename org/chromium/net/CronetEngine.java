package org.chromium.net;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class CronetEngine {
    public static class Builder {
        public static abstract class LibraryLoader {
            public abstract void loadLibrary(String arg1);
        }

        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        protected final ICronetEngineBuilder mBuilderDelegate;

        public Builder(Context context0) {
            this(Builder.createBuilderDelegate(context0));
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder0) {
            this.mBuilderDelegate = iCronetEngineBuilder0;
        }

        public Builder addPublicKeyPins(String s, Set set0, boolean z, Date date0) {
            this.mBuilderDelegate.addPublicKeyPins(s, set0, z, date0);
            return this;
        }

        public Builder addQuicHint(String s, int v, int v1) {
            this.mBuilderDelegate.addQuicHint(s, v, v1);
            return this;
        }

        public CronetEngine build() {
            return this.mBuilderDelegate.build();
        }

        @VisibleForTesting
        static int compareVersions(String s, String s1) {
            int v2;
            int v1;
            if(s == null || s1 == null) {
                throw new IllegalArgumentException("The input values cannot be null");
            }
            String[] arr_s = s.split("\\.");
            String[] arr_s1 = s1.split("\\.");
            for(int v = 0; v < arr_s.length && v < arr_s1.length; ++v) {
                try {
                    v1 = Integer.parseInt(arr_s[v]);
                    v2 = Integer.parseInt(arr_s1[v]);
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new IllegalArgumentException("Unable to convert version segments into integers: " + arr_s[v] + " & " + arr_s1[v], numberFormatException0);
                }
                if(v1 != v2) {
                    return Integer.signum(v1 - v2);
                }
            }
            return Integer.signum(arr_s.length - arr_s1.length);
        }

        private static ICronetEngineBuilder createBuilderDelegate(Context context0) {
            CronetProvider cronetProvider0 = (CronetProvider)Builder.getEnabledCronetProviders(context0, new ArrayList(CronetProvider.getAllProviders(context0))).get(0);
            if(Log.isLoggable("CronetEngine", 3)) {
                Log.d("CronetEngine", String.format("Using \'%s\' provider for creating CronetEngine.Builder.", cronetProvider0));
            }
            return cronetProvider0.createBuilder().mBuilderDelegate;
        }

        public Builder enableBrotli(boolean z) {
            return this;
        }

        public Builder enableHttp2(boolean z) {
            this.mBuilderDelegate.enableHttp2(z);
            return this;
        }

        public Builder enableHttpCache(int v, long v1) {
            this.mBuilderDelegate.enableHttpCache(v, v1);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        public Builder enableQuic(boolean z) {
            this.mBuilderDelegate.enableQuic(z);
            return this;
        }

        @Deprecated
        public Builder enableSdch(boolean z) {
            return this;
        }

        public String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        @VisibleForTesting
        static List getEnabledCronetProviders(Context context0, List list0) {
            static final class a implements Comparator {
                public int b(CronetProvider cronetProvider0, CronetProvider cronetProvider1) {
                    if("Fallback-Cronet-Provider".equals(cronetProvider0.getName())) {
                        return 1;
                    }
                    return "Fallback-Cronet-Provider".equals(cronetProvider1.getName()) ? -1 : -Builder.compareVersions(cronetProvider0.getVersion(), cronetProvider1.getVersion());
                }

                @Override
                public int compare(Object object0, Object object1) {
                    return this.b(((CronetProvider)object0), ((CronetProvider)object1));
                }
            }

            if(list0.size() == 0) {
                throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
            }
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(!((CronetProvider)object0).isEnabled()) {
                    iterator0.remove();
                }
            }
            if(list0.size() == 0) {
                throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            Collections.sort(list0, new a());
            return list0;
        }

        public Builder setLibraryLoader(LibraryLoader cronetEngine$Builder$LibraryLoader0) {
            this.mBuilderDelegate.setLibraryLoader(cronetEngine$Builder$LibraryLoader0);
            return this;
        }

        public Builder setStoragePath(String s) {
            this.mBuilderDelegate.setStoragePath(s);
            return this;
        }

        public Builder setUserAgent(String s) {
            this.mBuilderDelegate.setUserAgent(s);
            return this;
        }
    }

    private static final String TAG = "CronetEngine";

    static {
    }

    // 去混淆评级： 低(20)
    static String access$000() [...] // 潜在的解密器

    public abstract URLStreamHandlerFactory createURLStreamHandlerFactory();

    public abstract byte[] getGlobalMetricsDeltas();

    public abstract String getVersionString();

    public abstract org.chromium.net.UrlRequest.Builder newUrlRequestBuilder(String arg1, Callback arg2, Executor arg3);

    public abstract URLConnection openConnection(URL arg1) throws IOException;

    public abstract void shutdown();

    public abstract void startNetLogToFile(String arg1, boolean arg2);

    public abstract void stopNetLog();
}

