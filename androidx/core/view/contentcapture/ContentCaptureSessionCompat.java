package androidx.core.view.contentcapture;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.RequiresApi;
import androidx.core.view.O;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewStructureCompat;
import androidx.core.view.autofill.AutofillIdCompat;
import j..util.Objects;
import java.util.List;

public class ContentCaptureSessionCompat {
    @RequiresApi(23)
    static class Api23Impl {
        static Bundle a(ViewStructure viewStructure0) {
            return viewStructure0.getExtras();
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        static AutofillId a(ContentCaptureSession contentCaptureSession0, AutofillId autofillId0, long v) {
            return contentCaptureSession0.newAutofillId(autofillId0, v);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession0, View view0) {
            return contentCaptureSession0.newViewStructure(view0);
        }

        static ViewStructure c(ContentCaptureSession contentCaptureSession0, AutofillId autofillId0, long v) {
            return contentCaptureSession0.newVirtualViewStructure(autofillId0, v);
        }

        static void d(ContentCaptureSession contentCaptureSession0, ViewStructure viewStructure0) {
            contentCaptureSession0.notifyViewAppeared(viewStructure0);
        }

        public static void e(ContentCaptureSession contentCaptureSession0, AutofillId autofillId0, CharSequence charSequence0) {
            contentCaptureSession0.notifyViewTextChanged(autofillId0, charSequence0);
        }

        static void f(ContentCaptureSession contentCaptureSession0, AutofillId autofillId0, long[] arr_v) {
            contentCaptureSession0.notifyViewsDisappeared(autofillId0, arr_v);
        }
    }

    @RequiresApi(34)
    static class Api34Impl {
        static void a(ContentCaptureSession contentCaptureSession0, List list0) {
            contentCaptureSession0.notifyViewsAppeared(list0);
        }
    }

    private final Object a;
    private final View b;
    private static final String c = "TREAT_AS_VIEW_TREE_APPEARING";
    private static final String d = "TREAT_AS_VIEW_TREE_APPEARED";

    @RequiresApi(29)
    private ContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession0, View view0) {
        this.a = contentCaptureSession0;
        this.b = view0;
    }

    public AutofillId a(long v) {
        if(Build.VERSION.SDK_INT >= 29) {
            AutofillIdCompat autofillIdCompat0 = ViewCompat.O(this.b);
            Objects.requireNonNull(autofillIdCompat0);
            AutofillId autofillId0 = autofillIdCompat0.a();
            return Api29Impl.a(a.a(this.a), autofillId0, v);
        }
        return null;
    }

    public ViewStructureCompat b(AutofillId autofillId0, long v) {
        return Build.VERSION.SDK_INT < 29 ? null : ViewStructureCompat.f(Api29Impl.c(((ContentCaptureSession)this.a), autofillId0, v));
    }

    public void c(AutofillId autofillId0, CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 29) {
            Api29Impl.e(((ContentCaptureSession)this.a), autofillId0, charSequence0);
        }
    }

    public void d(List list0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 34) {
            Api34Impl.a(((ContentCaptureSession)this.a), list0);
            return;
        }
        if(v >= 29) {
            ViewStructure viewStructure0 = Api29Impl.b(((ContentCaptureSession)this.a), this.b);
            Api23Impl.a(viewStructure0).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            Api29Impl.d(((ContentCaptureSession)this.a), viewStructure0);
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                ViewStructure viewStructure1 = O.a(list0.get(v1));
                Api29Impl.d(((ContentCaptureSession)this.a), viewStructure1);
            }
            ViewStructure viewStructure2 = Api29Impl.b(((ContentCaptureSession)this.a), this.b);
            Api23Impl.a(viewStructure2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            Api29Impl.d(((ContentCaptureSession)this.a), viewStructure2);
        }
    }

    public void e(long[] arr_v) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 34) {
            AutofillIdCompat autofillIdCompat0 = ViewCompat.O(this.b);
            Objects.requireNonNull(autofillIdCompat0);
            AutofillId autofillId0 = autofillIdCompat0.a();
            Api29Impl.f(((ContentCaptureSession)this.a), autofillId0, arr_v);
            return;
        }
        if(v >= 29) {
            ViewStructure viewStructure0 = Api29Impl.b(((ContentCaptureSession)this.a), this.b);
            Api23Impl.a(viewStructure0).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            Api29Impl.d(((ContentCaptureSession)this.a), viewStructure0);
            AutofillIdCompat autofillIdCompat1 = ViewCompat.O(this.b);
            Objects.requireNonNull(autofillIdCompat1);
            AutofillId autofillId1 = autofillIdCompat1.a();
            Api29Impl.f(((ContentCaptureSession)this.a), autofillId1, arr_v);
            ViewStructure viewStructure1 = Api29Impl.b(((ContentCaptureSession)this.a), this.b);
            Api23Impl.a(viewStructure1).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            Api29Impl.d(((ContentCaptureSession)this.a), viewStructure1);
        }
    }

    @RequiresApi(29)
    public ContentCaptureSession f() {
        return (ContentCaptureSession)this.a;
    }

    @RequiresApi(29)
    public static ContentCaptureSessionCompat g(ContentCaptureSession contentCaptureSession0, View view0) {
        return new ContentCaptureSessionCompat(contentCaptureSession0, view0);
    }
}

