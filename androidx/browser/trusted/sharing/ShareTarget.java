package androidx.browser.trusted.sharing;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import j..util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public final class ShareTarget {
    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface EncodingType {
    }

    public static final class FileFormField {
        @NonNull
        public final String a;
        @NonNull
        public final List b;
        public static final String c = "androidx.browser.trusted.sharing.KEY_FILE_NAME";
        public static final String d = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES";

        public FileFormField(@NonNull String s, @NonNull List list0) {
            this.a = s;
            this.b = DesugarCollections.unmodifiableList(list0);
        }

        @Nullable
        static FileFormField a(@Nullable Bundle bundle0) {
            if(bundle0 == null) {
                return null;
            }
            String s = bundle0.getString("androidx.browser.trusted.sharing.KEY_FILE_NAME");
            ArrayList arrayList0 = bundle0.getStringArrayList("androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES");
            return s == null || arrayList0 == null ? null : new FileFormField(s, arrayList0);
        }

        @NonNull
        Bundle b() {
            Bundle bundle0 = new Bundle();
            bundle0.putString("androidx.browser.trusted.sharing.KEY_FILE_NAME", this.a);
            bundle0.putStringArrayList("androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES", new ArrayList(this.b));
            return bundle0;
        }
    }

    public static class Params {
        @Nullable
        public final String a;
        @Nullable
        public final String b;
        @Nullable
        public final List c;
        public static final String d = "androidx.browser.trusted.sharing.KEY_TITLE";
        public static final String e = "androidx.browser.trusted.sharing.KEY_TEXT";
        public static final String f = "androidx.browser.trusted.sharing.KEY_FILES";

        public Params(@Nullable String s, @Nullable String s1, @Nullable List list0) {
            this.a = s;
            this.b = s1;
            this.c = list0;
        }

        @Nullable
        static Params a(@Nullable Bundle bundle0) {
            ArrayList arrayList0 = null;
            if(bundle0 == null) {
                return null;
            }
            ArrayList arrayList1 = bundle0.getParcelableArrayList("androidx.browser.trusted.sharing.KEY_FILES");
            if(arrayList1 != null) {
                arrayList0 = new ArrayList();
                for(Object object0: arrayList1) {
                    arrayList0.add(FileFormField.a(((Bundle)object0)));
                }
            }
            return new Params(bundle0.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle0.getString("androidx.browser.trusted.sharing.KEY_TEXT"), arrayList0);
        }

        @NonNull
        Bundle b() {
            Bundle bundle0 = new Bundle();
            bundle0.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.a);
            bundle0.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.b);
            if(this.c != null) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: this.c) {
                    arrayList0.add(((FileFormField)object0).b());
                }
                bundle0.putParcelableArrayList("androidx.browser.trusted.sharing.KEY_FILES", arrayList0);
            }
            return bundle0;
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RequestMethod {
    }

    @NonNull
    public final String a;
    @Nullable
    public final String b;
    @Nullable
    public final String c;
    @NonNull
    public final Params d;
    @SuppressLint({"IntentName"})
    public static final String e = "androidx.browser.trusted.sharing.KEY_ACTION";
    public static final String f = "androidx.browser.trusted.sharing.KEY_METHOD";
    public static final String g = "androidx.browser.trusted.sharing.KEY_ENCTYPE";
    public static final String h = "androidx.browser.trusted.sharing.KEY_PARAMS";
    public static final String i = "GET";
    public static final String j = "POST";
    public static final String k = "application/x-www-form-urlencoded";
    public static final String l = "multipart/form-data";

    public ShareTarget(@NonNull String s, @Nullable String s1, @Nullable String s2, @NonNull Params shareTarget$Params0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = shareTarget$Params0;
    }

    @Nullable
    public static ShareTarget a(@NonNull Bundle bundle0) {
        String s = bundle0.getString("androidx.browser.trusted.sharing.KEY_ACTION");
        String s1 = bundle0.getString("androidx.browser.trusted.sharing.KEY_METHOD");
        String s2 = bundle0.getString("androidx.browser.trusted.sharing.KEY_ENCTYPE");
        Params shareTarget$Params0 = Params.a(bundle0.getBundle("androidx.browser.trusted.sharing.KEY_PARAMS"));
        return s == null || shareTarget$Params0 == null ? null : new ShareTarget(s, s1, s2, shareTarget$Params0);
    }

    @NonNull
    public Bundle b() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("androidx.browser.trusted.sharing.KEY_ACTION", this.a);
        bundle0.putString("androidx.browser.trusted.sharing.KEY_METHOD", this.b);
        bundle0.putString("androidx.browser.trusted.sharing.KEY_ENCTYPE", this.c);
        bundle0.putBundle("androidx.browser.trusted.sharing.KEY_PARAMS", this.d.b());
        return bundle0;
    }
}

