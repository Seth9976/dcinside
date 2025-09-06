package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.provider.FontRequest;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DefaultEmojiCompatConfig {
    @RestrictTo({Scope.a})
    public static class DefaultEmojiCompatConfigFactory {
        private final DefaultEmojiCompatConfigHelper a;
        @NonNull
        private static final String b = "emoji2.text.DefaultEmojiConfig";
        @NonNull
        private static final String c = "androidx.content.action.LOAD_EMOJI_FONT";
        @NonNull
        private static final String d = "emojicompat-emoji-font";

        @RestrictTo({Scope.a})
        public DefaultEmojiCompatConfigFactory(@Nullable DefaultEmojiCompatConfigHelper defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper0) {
            if(defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper0 == null) {
                defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper0 = DefaultEmojiCompatConfigFactory.e();
            }
            this.a = defaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper0;
        }

        @Nullable
        private Config a(@NonNull Context context0, @Nullable FontRequest fontRequest0) {
            return fontRequest0 == null ? null : new FontRequestEmojiCompatConfig(context0, fontRequest0);
        }

        @NonNull
        private List b(@NonNull Signature[] arr_signature) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_signature.length; ++v) {
                arrayList0.add(arr_signature[v].toByteArray());
            }
            return Collections.singletonList(arrayList0);
        }

        @Nullable
        @RestrictTo({Scope.a})
        public Config c(@NonNull Context context0) {
            return this.a(context0, this.h(context0));
        }

        @NonNull
        private FontRequest d(@NonNull ProviderInfo providerInfo0, @NonNull PackageManager packageManager0) throws PackageManager.NameNotFoundException {
            return new FontRequest(providerInfo0.authority, providerInfo0.packageName, "emojicompat-emoji-font", this.b(this.a.b(packageManager0, providerInfo0.packageName)));
        }

        @NonNull
        private static DefaultEmojiCompatConfigHelper e() {
            return Build.VERSION.SDK_INT >= 28 ? new DefaultEmojiCompatConfigHelper_API28() : new DefaultEmojiCompatConfigHelper_API19();
        }

        // 去混淆评级： 低(20)
        private boolean f(@Nullable ProviderInfo providerInfo0) {
            return providerInfo0 != null && (providerInfo0.applicationInfo != null && (providerInfo0.applicationInfo.flags & 1) == 1);
        }

        @Nullable
        private ProviderInfo g(@NonNull PackageManager packageManager0) {
            Intent intent0 = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
            for(Object object0: this.a.c(packageManager0, intent0, 0)) {
                ProviderInfo providerInfo0 = this.a.a(((ResolveInfo)object0));
                if(this.f(providerInfo0)) {
                    return providerInfo0;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }

        @Nullable
        @RestrictTo({Scope.a})
        @VisibleForTesting
        FontRequest h(@NonNull Context context0) {
            PackageManager packageManager0 = context0.getPackageManager();
            Preconditions.m(packageManager0, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfo0 = this.g(packageManager0);
            if(providerInfo0 == null) {
                return null;
            }
            try {
                return this.d(providerInfo0, packageManager0);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", packageManager$NameNotFoundException0);
                return null;
            }
        }
    }

    @RestrictTo({Scope.a})
    public static class DefaultEmojiCompatConfigHelper {
        @Nullable
        public ProviderInfo a(@NonNull ResolveInfo resolveInfo0) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @NonNull
        public Signature[] b(@NonNull PackageManager packageManager0, @NonNull String s) throws PackageManager.NameNotFoundException {
            return packageManager0.getPackageInfo(s, 0x40).signatures;
        }

        @NonNull
        public List c(@NonNull PackageManager packageManager0, @NonNull Intent intent0, int v) {
            return Collections.emptyList();
        }
    }

    @RequiresApi(19)
    @RestrictTo({Scope.a})
    public static class DefaultEmojiCompatConfigHelper_API19 extends DefaultEmojiCompatConfigHelper {
        @Override  // androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper
        @Nullable
        public ProviderInfo a(@NonNull ResolveInfo resolveInfo0) {
            return resolveInfo0.providerInfo;
        }

        @Override  // androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper
        @NonNull
        public List c(@NonNull PackageManager packageManager0, @NonNull Intent intent0, int v) {
            return packageManager0.queryIntentContentProviders(intent0, v);
        }
    }

    @RequiresApi(28)
    @RestrictTo({Scope.a})
    public static class DefaultEmojiCompatConfigHelper_API28 extends DefaultEmojiCompatConfigHelper_API19 {
        @Override  // androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper
        @NonNull
        public Signature[] b(@NonNull PackageManager packageManager0, @NonNull String s) throws PackageManager.NameNotFoundException {
            return packageManager0.getPackageInfo(s, 0x40).signatures;
        }
    }

    @Nullable
    public static FontRequestEmojiCompatConfig a(@NonNull Context context0) {
        return (FontRequestEmojiCompatConfig)new DefaultEmojiCompatConfigFactory(null).c(context0);
    }
}

