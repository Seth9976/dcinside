package androidx.core.app;

import android.app.Activity;
import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import androidx.core.util.Preconditions;
import java.util.ArrayList;

public final class ShareCompat {
    public static class IntentBuilder {
        private final Context a;
        private final Intent b;
        private CharSequence c;
        private ArrayList d;
        private ArrayList e;
        private ArrayList f;
        private ArrayList g;

        public IntentBuilder(Context context0) {
            Activity activity0;
            this.a = (Context)Preconditions.l(context0);
            Intent intent0 = new Intent().setAction("android.intent.action.SEND");
            this.b = intent0;
            intent0.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", "com.dcinside.app.android");
            intent0.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", "com.dcinside.app.android");
            intent0.addFlags(0x80000);
            while(true) {
                activity0 = null;
                if(!(context0 instanceof ContextWrapper)) {
                    break;
                }
                if(context0 instanceof Activity) {
                    activity0 = (Activity)context0;
                    break;
                }
                context0 = ((ContextWrapper)context0).getBaseContext();
            }
            if(activity0 != null) {
                ComponentName componentName0 = activity0.getComponentName();
                this.b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName0);
                this.b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName0);
            }
        }

        public IntentBuilder a(String s) {
            if(this.f == null) {
                this.f = new ArrayList();
            }
            this.f.add(s);
            return this;
        }

        public IntentBuilder b(String[] arr_s) {
            this.i("android.intent.extra.BCC", arr_s);
            return this;
        }

        public IntentBuilder c(String s) {
            if(this.e == null) {
                this.e = new ArrayList();
            }
            this.e.add(s);
            return this;
        }

        public IntentBuilder d(String[] arr_s) {
            this.i("android.intent.extra.CC", arr_s);
            return this;
        }

        public IntentBuilder e(String s) {
            if(this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(s);
            return this;
        }

        public IntentBuilder f(String[] arr_s) {
            this.i("android.intent.extra.EMAIL", arr_s);
            return this;
        }

        public IntentBuilder g(Uri uri0) {
            if(this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(uri0);
            return this;
        }

        private void h(String s, ArrayList arrayList0) {
            String[] arr_s = this.b.getStringArrayExtra(s);
            int v = arr_s == null ? 0 : arr_s.length;
            String[] arr_s1 = new String[arrayList0.size() + v];
            arrayList0.toArray(arr_s1);
            if(arr_s != null) {
                System.arraycopy(arr_s, 0, arr_s1, arrayList0.size(), v);
            }
            this.b.putExtra(s, arr_s1);
        }

        private void i(String s, String[] arr_s) {
            Intent intent0 = this.m();
            String[] arr_s1 = intent0.getStringArrayExtra(s);
            int v = arr_s1 == null ? 0 : arr_s1.length;
            String[] arr_s2 = new String[arr_s.length + v];
            if(arr_s1 != null) {
                System.arraycopy(arr_s1, 0, arr_s2, 0, v);
            }
            System.arraycopy(arr_s, 0, arr_s2, v, arr_s.length);
            intent0.putExtra(s, arr_s2);
        }

        public Intent j() {
            return Intent.createChooser(this.m(), this.c);
        }

        @Deprecated
        public static IntentBuilder k(Activity activity0) {
            return new IntentBuilder(activity0);
        }

        Context l() {
            return this.a;
        }

        public Intent m() {
            ArrayList arrayList0 = this.d;
            if(arrayList0 != null) {
                this.h("android.intent.extra.EMAIL", arrayList0);
                this.d = null;
            }
            ArrayList arrayList1 = this.e;
            if(arrayList1 != null) {
                this.h("android.intent.extra.CC", arrayList1);
                this.e = null;
            }
            ArrayList arrayList2 = this.f;
            if(arrayList2 != null) {
                this.h("android.intent.extra.BCC", arrayList2);
                this.f = null;
            }
            if(this.g != null && this.g.size() > 1) {
                this.b.setAction("android.intent.action.SEND_MULTIPLE");
                this.b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.g);
                ShareCompat.g(this.b, this.g);
                return this.b;
            }
            this.b.setAction("android.intent.action.SEND");
            if(this.g != null && !this.g.isEmpty()) {
                Parcelable parcelable0 = (Parcelable)this.g.get(0);
                this.b.putExtra("android.intent.extra.STREAM", parcelable0);
                ShareCompat.g(this.b, this.g);
                return this.b;
            }
            this.b.removeExtra("android.intent.extra.STREAM");
            this.b.setClipData(null);
            int v = this.b.getFlags();
            this.b.setFlags(v & -2);
            return this.b;
        }

        public IntentBuilder n(@StringRes int v) {
            return this.o(this.a.getText(v));
        }

        public IntentBuilder o(CharSequence charSequence0) {
            this.c = charSequence0;
            return this;
        }

        public IntentBuilder p(String[] arr_s) {
            this.b.putExtra("android.intent.extra.BCC", arr_s);
            return this;
        }

        public IntentBuilder q(String[] arr_s) {
            this.b.putExtra("android.intent.extra.CC", arr_s);
            return this;
        }

        public IntentBuilder r(String[] arr_s) {
            if(this.d != null) {
                this.d = null;
            }
            this.b.putExtra("android.intent.extra.EMAIL", arr_s);
            return this;
        }

        public IntentBuilder s(String s) {
            this.b.putExtra("android.intent.extra.HTML_TEXT", s);
            if(!this.b.hasExtra("android.intent.extra.TEXT")) {
                this.v(Html.fromHtml(s));
            }
            return this;
        }

        public IntentBuilder t(Uri uri0) {
            this.g = null;
            if(uri0 != null) {
                this.g(uri0);
            }
            return this;
        }

        public IntentBuilder u(String s) {
            this.b.putExtra("android.intent.extra.SUBJECT", s);
            return this;
        }

        public IntentBuilder v(CharSequence charSequence0) {
            this.b.putExtra("android.intent.extra.TEXT", charSequence0);
            return this;
        }

        public IntentBuilder w(String s) {
            this.b.setType(s);
            return this;
        }

        public void x() {
            Intent intent0 = this.j();
            this.a.startActivity(intent0);
        }
    }

    public static class IntentReader {
        private final Context a;
        private final Intent b;
        private final String c;
        private final ComponentName d;
        private ArrayList e;
        private static final String f = "IntentReader";

        public IntentReader(Activity activity0) {
            this(((Context)Preconditions.l(activity0)), activity0.getIntent());
        }

        public IntentReader(Context context0, Intent intent0) {
            this.a = (Context)Preconditions.l(context0);
            this.b = (Intent)Preconditions.l(intent0);
            this.c = ShareCompat.f(intent0);
            this.d = ShareCompat.d(intent0);
        }

        @Deprecated
        public static IntentReader a(Activity activity0) {
            return new IntentReader(activity0);
        }

        public ComponentName b() {
            return this.d;
        }

        public Drawable c() {
            if(this.d == null) {
                return null;
            }
            PackageManager packageManager0 = this.a.getPackageManager();
            try {
                return packageManager0.getActivityIcon(this.d);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.e("IntentReader", "Could not retrieve icon for calling activity", packageManager$NameNotFoundException0);
                return null;
            }
        }

        public Drawable d() {
            if(this.c == null) {
                return null;
            }
            PackageManager packageManager0 = this.a.getPackageManager();
            try {
                return packageManager0.getApplicationIcon(this.c);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.e("IntentReader", "Could not retrieve icon for calling application", packageManager$NameNotFoundException0);
                return null;
            }
        }

        public CharSequence e() {
            if(this.c == null) {
                return null;
            }
            PackageManager packageManager0 = this.a.getPackageManager();
            try {
                return packageManager0.getApplicationLabel(packageManager0.getApplicationInfo(this.c, 0));
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.e("IntentReader", "Could not retrieve label for calling application", packageManager$NameNotFoundException0);
                return null;
            }
        }

        public String f() {
            return this.c;
        }

        public String[] g() {
            return this.b.getStringArrayExtra("android.intent.extra.BCC");
        }

        public String[] h() {
            return this.b.getStringArrayExtra("android.intent.extra.CC");
        }

        public String[] i() {
            return this.b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        public String j() {
            String s = this.b.getStringExtra("android.intent.extra.HTML_TEXT");
            if(s == null) {
                CharSequence charSequence0 = this.o();
                if(charSequence0 instanceof Spanned) {
                    return Html.toHtml(((Spanned)charSequence0));
                }
                return charSequence0 == null ? null : Html.escapeHtml(charSequence0);
            }
            return s;
        }

        public Uri k() {
            return (Uri)this.b.getParcelableExtra("android.intent.extra.STREAM");
        }

        public Uri l(int v) {
            if(this.e == null && this.q()) {
                this.e = this.b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList arrayList0 = this.e;
            if(arrayList0 != null) {
                return (Uri)arrayList0.get(v);
            }
            if(v != 0) {
                throw new IndexOutOfBoundsException("Stream items available: " + this.m() + " index requested: " + v);
            }
            return (Uri)this.b.getParcelableExtra("android.intent.extra.STREAM");
        }

        public int m() {
            if(this.e == null && this.q()) {
                this.e = this.b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList arrayList0 = this.e;
            return arrayList0 != null ? arrayList0.size() : this.b.hasExtra("android.intent.extra.STREAM");
        }

        public String n() {
            return this.b.getStringExtra("android.intent.extra.SUBJECT");
        }

        public CharSequence o() {
            return this.b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        public String p() {
            return this.b.getType();
        }

        public boolean q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.b.getAction());
        }

        public boolean r() {
            String s = this.b.getAction();
            return "android.intent.action.SEND".equals(s) || "android.intent.action.SEND_MULTIPLE".equals(s);
        }

        public boolean s() {
            return "android.intent.action.SEND".equals(this.b.getAction());
        }
    }

    public static final String a = "androidx.core.app.EXTRA_CALLING_PACKAGE";
    public static final String b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
    public static final String c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final String d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    private static final String e = ".sharecompat_";

    @Deprecated
    public static void a(Menu menu0, @IdRes int v, IntentBuilder shareCompat$IntentBuilder0) {
        MenuItem menuItem0 = menu0.findItem(v);
        if(menuItem0 == null) {
            throw new IllegalArgumentException("Could not find menu item with id " + v + " in the supplied menu");
        }
        ShareCompat.b(menuItem0, shareCompat$IntentBuilder0);
    }

    @Deprecated
    public static void b(MenuItem menuItem0, IntentBuilder shareCompat$IntentBuilder0) {
        ActionProvider actionProvider0 = menuItem0.getActionProvider();
        ShareActionProvider shareActionProvider0 = actionProvider0 instanceof ShareActionProvider ? ((ShareActionProvider)actionProvider0) : new ShareActionProvider(shareCompat$IntentBuilder0.l());
        shareActionProvider0.setShareHistoryFileName(".sharecompat_" + shareCompat$IntentBuilder0.l().getClass().getName());
        shareActionProvider0.setShareIntent(shareCompat$IntentBuilder0.m());
        menuItem0.setActionProvider(shareActionProvider0);
    }

    public static ComponentName c(Activity activity0) {
        Intent intent0 = activity0.getIntent();
        ComponentName componentName0 = activity0.getCallingActivity();
        return componentName0 == null ? ShareCompat.d(intent0) : componentName0;
    }

    static ComponentName d(Intent intent0) {
        ComponentName componentName0 = (ComponentName)intent0.getParcelableExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY");
        return componentName0 == null ? ((ComponentName)intent0.getParcelableExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY")) : componentName0;
    }

    public static String e(Activity activity0) {
        Intent intent0 = activity0.getIntent();
        String s = activity0.getCallingPackage();
        return s != null || intent0 == null ? s : ShareCompat.f(intent0);
    }

    static String f(Intent intent0) {
        String s = intent0.getStringExtra("androidx.core.app.EXTRA_CALLING_PACKAGE");
        return s == null ? intent0.getStringExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE") : s;
    }

    static void g(Intent intent0, ArrayList arrayList0) {
        CharSequence charSequence0 = intent0.getCharSequenceExtra("android.intent.extra.TEXT");
        String s = intent0.getStringExtra("android.intent.extra.HTML_TEXT");
        ClipData clipData0 = new ClipData(null, new String[]{intent0.getType()}, new ClipData.Item(charSequence0, s, null, ((Uri)arrayList0.get(0))));
        int v = arrayList0.size();
        for(int v1 = 1; v1 < v; ++v1) {
            clipData0.addItem(new ClipData.Item(((Uri)arrayList0.get(v1))));
        }
        intent0.setClipData(clipData0);
        intent0.addFlags(1);
    }
}

