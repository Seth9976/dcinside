package androidx.core.app;

import android.app.RemoteInput.Builder;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class RemoteInput {
    @RequiresApi(20)
    static class Api20Impl {
        static void a(Object object0, Intent intent0, Bundle bundle0) {
            android.app.RemoteInput.addResultsToIntent(((android.app.RemoteInput[])object0), intent0, bundle0);
        }

        public static android.app.RemoteInput b(RemoteInput remoteInput0) {
            RemoteInput.Builder remoteInput$Builder0 = new RemoteInput.Builder(remoteInput0.o()).setLabel(remoteInput0.n()).setChoices(remoteInput0.h()).setAllowFreeFormInput(remoteInput0.f()).addExtras(remoteInput0.m());
            if(Build.VERSION.SDK_INT >= 26) {
                Set set0 = remoteInput0.g();
                if(set0 != null) {
                    for(Object object0: set0) {
                        Api26Impl.d(remoteInput$Builder0, ((String)object0), true);
                    }
                }
            }
            if(Build.VERSION.SDK_INT >= 29) {
                Api29Impl.b(remoteInput$Builder0, remoteInput0.k());
            }
            return remoteInput$Builder0.build();
        }

        static RemoteInput c(Object object0) {
            Builder remoteInput$Builder0 = new Builder(((android.app.RemoteInput)object0).getResultKey()).h(((android.app.RemoteInput)object0).getLabel()).f(((android.app.RemoteInput)object0).getChoices()).e(((android.app.RemoteInput)object0).getAllowFreeFormInput()).a(((android.app.RemoteInput)object0).getExtras());
            if(Build.VERSION.SDK_INT >= 26) {
                Set set0 = Api26Impl.b(((android.app.RemoteInput)object0));
                if(set0 != null) {
                    for(Object object1: set0) {
                        remoteInput$Builder0.d(((String)object1), true);
                    }
                }
            }
            if(Build.VERSION.SDK_INT >= 29) {
                remoteInput$Builder0.g(Api29Impl.a(((android.app.RemoteInput)object0)));
            }
            return remoteInput$Builder0.b();
        }

        static Bundle d(Intent intent0) {
            return android.app.RemoteInput.getResultsFromIntent(intent0);
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        static void a(RemoteInput remoteInput0, Intent intent0, Map map0) {
            android.app.RemoteInput.addDataResultToIntent(RemoteInput.c(remoteInput0), intent0, map0);
        }

        static Set b(Object object0) {
            return ((android.app.RemoteInput)object0).getAllowedDataTypes();
        }

        static Map c(Intent intent0, String s) {
            return android.app.RemoteInput.getDataResultsFromIntent(intent0, s);
        }

        static RemoteInput.Builder d(RemoteInput.Builder remoteInput$Builder0, String s, boolean z) {
            return remoteInput$Builder0.setAllowDataType(s, z);
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        static int a(Intent intent0) {
            return android.app.RemoteInput.getResultsSource(intent0);
        }

        static void b(Intent intent0, int v) {
            android.app.RemoteInput.setResultsSource(intent0, v);
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        static int a(Object object0) {
            return ((android.app.RemoteInput)object0).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder remoteInput$Builder0, int v) {
            return remoteInput$Builder0.setEditChoicesBeforeSending(v);
        }
    }

    public static final class Builder {
        private final String a;
        private final Set b;
        private final Bundle c;
        private CharSequence d;
        private CharSequence[] e;
        private boolean f;
        private int g;

        public Builder(String s) {
            this.b = new HashSet();
            this.c = new Bundle();
            this.f = true;
            this.g = 0;
            if(s == null) {
                throw new IllegalArgumentException("Result key can\'t be null");
            }
            this.a = s;
        }

        public Builder a(Bundle bundle0) {
            if(bundle0 != null) {
                this.c.putAll(bundle0);
            }
            return this;
        }

        public RemoteInput b() {
            return new RemoteInput(this.a, this.d, this.e, this.f, this.g, this.c, this.b);
        }

        public Bundle c() {
            return this.c;
        }

        public Builder d(String s, boolean z) {
            if(z) {
                this.b.add(s);
                return this;
            }
            this.b.remove(s);
            return this;
        }

        public Builder e(boolean z) {
            this.f = z;
            return this;
        }

        public Builder f(CharSequence[] arr_charSequence) {
            this.e = arr_charSequence;
            return this;
        }

        public Builder g(int v) {
            this.g = v;
            return this;
        }

        public Builder h(CharSequence charSequence0) {
            this.d = charSequence0;
            return this;
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface EditChoicesBeforeSending {
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    private final String a;
    private final CharSequence b;
    private final CharSequence[] c;
    private final boolean d;
    private final int e;
    private final Bundle f;
    private final Set g;
    public static final String h = "android.remoteinput.results";
    public static final String i = "android.remoteinput.resultsData";
    private static final String j = "android.remoteinput.dataTypeResultsData";
    private static final String k = "android.remoteinput.resultsSource";
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 0;
    public static final int o = 1;
    public static final int p = 2;

    RemoteInput(String s, CharSequence charSequence0, CharSequence[] arr_charSequence, boolean z, int v, Bundle bundle0, Set set0) {
        this.a = s;
        this.b = charSequence0;
        this.c = arr_charSequence;
        this.d = z;
        this.e = v;
        this.f = bundle0;
        this.g = set0;
        if(this.k() == 2 && !this.f()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(RemoteInput remoteInput0, Intent intent0, Map map0) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.a(remoteInput0, intent0, map0);
            return;
        }
        Intent intent1 = RemoteInput.i(intent0);
        if(intent1 == null) {
            intent1 = new Intent();
        }
        for(Object object0: map0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            Uri uri0 = (Uri)((Map.Entry)object0).getValue();
            if(s != null) {
                Bundle bundle0 = intent1.getBundleExtra("android.remoteinput.dataTypeResultsData" + s);
                if(bundle0 == null) {
                    bundle0 = new Bundle();
                }
                bundle0.putString(remoteInput0.o(), uri0.toString());
                intent1.putExtra("android.remoteinput.dataTypeResultsData" + s, bundle0);
            }
        }
        intent0.setClipData(ClipData.newIntent("android.remoteinput.results", intent1));
    }

    public static void b(RemoteInput[] arr_remoteInput, Intent intent0, Bundle bundle0) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api20Impl.a(RemoteInput.d(arr_remoteInput), intent0, bundle0);
            return;
        }
        Bundle bundle1 = RemoteInput.p(intent0);
        int v = RemoteInput.q(intent0);
        if(bundle1 != null) {
            bundle1.putAll(bundle0);
            bundle0 = bundle1;
        }
        for(int v1 = 0; v1 < arr_remoteInput.length; ++v1) {
            RemoteInput remoteInput0 = arr_remoteInput[v1];
            Map map0 = RemoteInput.j(intent0, remoteInput0.o());
            Api20Impl.a(RemoteInput.d(new RemoteInput[]{remoteInput0}), intent0, bundle0);
            if(map0 != null) {
                RemoteInput.a(remoteInput0, intent0, map0);
            }
        }
        RemoteInput.s(intent0, v);
    }

    @RequiresApi(20)
    static android.app.RemoteInput c(RemoteInput remoteInput0) {
        return Api20Impl.b(remoteInput0);
    }

    @RequiresApi(20)
    static android.app.RemoteInput[] d(RemoteInput[] arr_remoteInput) {
        if(arr_remoteInput == null) {
            return null;
        }
        android.app.RemoteInput[] arr_remoteInput1 = new android.app.RemoteInput[arr_remoteInput.length];
        for(int v = 0; v < arr_remoteInput.length; ++v) {
            arr_remoteInput1[v] = RemoteInput.c(arr_remoteInput[v]);
        }
        return arr_remoteInput1;
    }

    @RequiresApi(20)
    static RemoteInput e(android.app.RemoteInput remoteInput0) {
        return Api20Impl.c(remoteInput0);
    }

    public boolean f() {
        return this.d;
    }

    public Set g() {
        return this.g;
    }

    public CharSequence[] h() {
        return this.c;
    }

    private static Intent i(Intent intent0) {
        ClipData clipData0 = intent0.getClipData();
        if(clipData0 == null) {
            return null;
        }
        ClipDescription clipDescription0 = clipData0.getDescription();
        if(!clipDescription0.hasMimeType("text/vnd.android.intent")) {
            return null;
        }
        return clipDescription0.getLabel().toString().contentEquals("android.remoteinput.results") ? clipData0.getItemAt(0).getIntent() : null;
    }

    public static Map j(Intent intent0, String s) {
        if(Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.c(intent0, s);
        }
        Intent intent1 = RemoteInput.i(intent0);
        if(intent1 == null) {
            return null;
        }
        HashMap hashMap0 = new HashMap();
        for(Object object0: intent1.getExtras().keySet()) {
            String s1 = (String)object0;
            if(s1.startsWith("android.remoteinput.dataTypeResultsData")) {
                String s2 = s1.substring(39);
                if(!s2.isEmpty()) {
                    String s3 = intent1.getBundleExtra(s1).getString(s);
                    if(s3 != null && !s3.isEmpty()) {
                        hashMap0.put(s2, Uri.parse(s3));
                    }
                }
            }
        }
        return !hashMap0.isEmpty() ? hashMap0 : null;
    }

    public int k() {
        return this.e;
    }

    private static String l(String s) [...] // Inlined contents

    public Bundle m() {
        return this.f;
    }

    public CharSequence n() {
        return this.b;
    }

    public String o() {
        return this.a;
    }

    public static Bundle p(Intent intent0) {
        return Api20Impl.d(intent0);
    }

    public static int q(Intent intent0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.a(intent0);
        }
        Intent intent1 = RemoteInput.i(intent0);
        return intent1 == null ? 0 : intent1.getExtras().getInt("android.remoteinput.resultsSource", 0);
    }

    // 去混淆评级： 低(30)
    public boolean r() {
        return !this.f() && (this.h() == null || this.h().length == 0) && this.g() != null && !this.g().isEmpty();
    }

    public static void s(Intent intent0, int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            Api28Impl.b(intent0, v);
            return;
        }
        Intent intent1 = RemoteInput.i(intent0);
        if(intent1 == null) {
            intent1 = new Intent();
        }
        intent1.putExtra("android.remoteinput.resultsSource", v);
        intent0.setClipData(ClipData.newIntent("android.remoteinput.results", intent1));
    }
}

