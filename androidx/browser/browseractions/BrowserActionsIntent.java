package androidx.browser.browseractions;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Deprecated
public class BrowserActionsIntent {
    @RestrictTo({Scope.c})
    @VisibleForTesting
    interface BrowserActionsFallDialogListener {
        void a();
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BrowserActionsItemId {
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BrowserActionsUrlType {
    }

    public static final class Builder {
        private final Intent a;
        private Context b;
        private Uri c;
        private int d;
        private ArrayList e;
        @Nullable
        private PendingIntent f;
        private List g;

        public Builder(@NonNull Context context0, @NonNull Uri uri0) {
            this.a = new Intent("androidx.browser.browseractions.browser_action_open");
            this.d = 0;
            this.e = new ArrayList();
            this.f = null;
            this.g = new ArrayList();
            this.b = context0;
            this.c = uri0;
        }

        @NonNull
        public BrowserActionsIntent a() {
            this.a.setData(this.c);
            this.a.putExtra("androidx.browser.browseractions.extra.TYPE", this.d);
            this.a.putParcelableArrayListExtra("androidx.browser.browseractions.extra.MENU_ITEMS", this.e);
            PendingIntent pendingIntent0 = PendingIntent.getActivity(this.b, 0, new Intent(), 0x4000000);
            this.a.putExtra("androidx.browser.browseractions.APP_ID", pendingIntent0);
            PendingIntent pendingIntent1 = this.f;
            if(pendingIntent1 != null) {
                this.a.putExtra("androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT", pendingIntent1);
            }
            BrowserServiceFileProvider.n(this.a, this.g, this.b);
            return new BrowserActionsIntent(this.a);
        }

        @NonNull
        private Bundle b(@NonNull BrowserActionItem browserActionItem0) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("androidx.browser.browseractions.TITLE", browserActionItem0.e());
            bundle0.putParcelable("androidx.browser.browseractions.ACTION", browserActionItem0.a());
            if(browserActionItem0.b() != 0) {
                bundle0.putInt("androidx.browser.browseractions.ICON_ID", browserActionItem0.b());
            }
            if(browserActionItem0.c() != null) {
                bundle0.putParcelable("androidx.browser.browseractions.ICON_URI", browserActionItem0.c());
            }
            return bundle0;
        }

        @NonNull
        public Builder c(@NonNull ArrayList arrayList0) {
            if(arrayList0.size() > 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            for(int v = 0; v < arrayList0.size(); ++v) {
                if(TextUtils.isEmpty(((BrowserActionItem)arrayList0.get(v)).e()) || ((BrowserActionItem)arrayList0.get(v)).a() == null) {
                    throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                }
                this.e.add(this.b(((BrowserActionItem)arrayList0.get(v))));
                if(((BrowserActionItem)arrayList0.get(v)).c() != null) {
                    this.g.add(((BrowserActionItem)arrayList0.get(v)).c());
                }
            }
            return this;
        }

        @NonNull
        public Builder d(@NonNull BrowserActionItem[] arr_browserActionItem) {
            return this.c(new ArrayList(Arrays.asList(arr_browserActionItem)));
        }

        @NonNull
        public Builder e(@NonNull PendingIntent pendingIntent0) {
            this.f = pendingIntent0;
            return this;
        }

        @NonNull
        public Builder f(int v) {
            this.d = v;
            return this;
        }
    }

    @NonNull
    private final Intent a;
    private static final String b = "BrowserActions";
    private static final String c = "https://www.example.com";
    public static final String d = "androidx.browser.browseractions.APP_ID";
    public static final String e = "androidx.browser.browseractions.browser_action_open";
    public static final String f = "androidx.browser.browseractions.ICON_ID";
    private static final String g = "androidx.browser.browseractions.ICON_URI";
    public static final String h = "androidx.browser.browseractions.TITLE";
    public static final String i = "androidx.browser.browseractions.ACTION";
    public static final String j = "androidx.browser.browseractions.extra.TYPE";
    public static final String k = "androidx.browser.browseractions.extra.MENU_ITEMS";
    public static final String l = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
    @SuppressLint({"MinMaxConstant"})
    public static final int m = 5;
    public static final int n = 0;
    public static final int o = 1;
    public static final int p = 2;
    public static final int q = 3;
    public static final int r = 4;
    public static final int s = 5;
    public static final int t = -1;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 3;
    public static final int y = 4;
    @Nullable
    private static BrowserActionsFallDialogListener z;

    BrowserActionsIntent(@NonNull Intent intent0) {
        this.a = intent0;
    }

    @NonNull
    @RestrictTo({Scope.a})
    public static List a(@NonNull Context context0) {
        Intent intent0 = new Intent("androidx.browser.browseractions.browser_action_open", Uri.parse("https://www.example.com"));
        return context0.getPackageManager().queryIntentActivities(intent0, 0x20000);
    }

    @Nullable
    @Deprecated
    public static String b(@NonNull Intent intent0) {
        return BrowserActionsIntent.d(intent0);
    }

    @NonNull
    public Intent c() {
        return this.a;
    }

    @Nullable
    public static String d(@NonNull Intent intent0) {
        PendingIntent pendingIntent0 = (PendingIntent)intent0.getParcelableExtra("androidx.browser.browseractions.APP_ID");
        return pendingIntent0 == null ? null : pendingIntent0.getTargetPackage();
    }

    public static void e(@NonNull Context context0, @NonNull Intent intent0) {
        BrowserActionsIntent.f(context0, intent0, BrowserActionsIntent.a(context0));
    }

    @RestrictTo({Scope.c})
    @VisibleForTesting
    static void f(Context context0, Intent intent0, List list0) {
        if(list0 != null) {
            switch(list0.size()) {
                case 0: {
                    break;
                }
                case 1: {
                    intent0.setPackage(((ResolveInfo)list0.get(0)).activityInfo.packageName);
                    ContextCompat.startActivity(context0, intent0, null);
                    return;
                }
                default: {
                    Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com"));
                    ResolveInfo resolveInfo0 = context0.getPackageManager().resolveActivity(intent1, 0x10000);
                    if(resolveInfo0 != null) {
                        String s = resolveInfo0.activityInfo.packageName;
                        for(int v = 0; v < list0.size(); ++v) {
                            if(s.equals(((ResolveInfo)list0.get(v)).activityInfo.packageName)) {
                                intent0.setPackage(s);
                                break;
                            }
                        }
                    }
                    ContextCompat.startActivity(context0, intent0, null);
                    return;
                }
            }
        }
        BrowserActionsIntent.i(context0, intent0);
    }

    public static void g(@NonNull Context context0, @NonNull Uri uri0) {
        BrowserActionsIntent.e(context0, new Builder(context0, uri0).a().c());
    }

    public static void h(@NonNull Context context0, @NonNull Uri uri0, int v, @NonNull ArrayList arrayList0, @NonNull PendingIntent pendingIntent0) {
        BrowserActionsIntent.e(context0, new Builder(context0, uri0).f(v).c(arrayList0).e(pendingIntent0).a().c());
    }

    private static void i(Context context0, Intent intent0) {
        Uri uri0 = intent0.getData();
        ArrayList arrayList0 = intent0.getParcelableArrayListExtra("androidx.browser.browseractions.extra.MENU_ITEMS");
        BrowserActionsIntent.j(context0, uri0, (arrayList0 == null ? null : BrowserActionsIntent.k(arrayList0)));
    }

    private static void j(Context context0, Uri uri0, List list0) {
        new BrowserActionsFallbackMenuUi(context0, uri0, list0).e();
        BrowserActionsFallDialogListener browserActionsIntent$BrowserActionsFallDialogListener0 = BrowserActionsIntent.z;
        if(browserActionsIntent$BrowserActionsFallDialogListener0 != null) {
            browserActionsIntent$BrowserActionsFallDialogListener0.a();
        }
    }

    @NonNull
    public static List k(@NonNull ArrayList arrayList0) {
        List list0 = new ArrayList();
        for(int v = 0; v < arrayList0.size(); ++v) {
            Bundle bundle0 = (Bundle)arrayList0.get(v);
            String s = bundle0.getString("androidx.browser.browseractions.TITLE");
            PendingIntent pendingIntent0 = (PendingIntent)bundle0.getParcelable("androidx.browser.browseractions.ACTION");
            int v1 = bundle0.getInt("androidx.browser.browseractions.ICON_ID");
            Uri uri0 = (Uri)bundle0.getParcelable("androidx.browser.browseractions.ICON_URI");
            if(TextUtils.isEmpty(s) || pendingIntent0 == null) {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
            list0.add((v1 == 0 ? new BrowserActionItem(s, pendingIntent0, uri0) : new BrowserActionItem(s, pendingIntent0, v1)));
        }
        return list0;
    }

    @RestrictTo({Scope.c})
    @VisibleForTesting
    static void l(BrowserActionsFallDialogListener browserActionsIntent$BrowserActionsFallDialogListener0) {
        BrowserActionsIntent.z = browserActionsIntent$BrowserActionsFallDialogListener0;
    }
}

