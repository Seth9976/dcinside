package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;

public final class InputContentInfoCompat {
    @RequiresApi(25)
    static final class InputContentInfoCompatApi25Impl implements InputContentInfoCompatImpl {
        final InputContentInfo a;

        InputContentInfoCompatApi25Impl(Uri uri0, ClipDescription clipDescription0, Uri uri1) {
            this.a = new InputContentInfo(uri0, clipDescription0, uri1);
        }

        InputContentInfoCompatApi25Impl(Object object0) {
            this.a = (InputContentInfo)object0;
        }

        @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
        public Uri O() {
            return this.a.getLinkUri();
        }

        @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
        public Object a() {
            return this.a;
        }

        @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
        public Uri b() {
            return this.a.getContentUri();
        }

        @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
        public void c() {
            this.a.requestPermission();
        }

        @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
        public void d() {
            this.a.releasePermission();
        }

        @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
        public ClipDescription getDescription() {
            return this.a.getDescription();
        }
    }

    static final class InputContentInfoCompatBaseImpl implements InputContentInfoCompatImpl {
        private final Uri a;
        private final ClipDescription b;
        private final Uri c;

        InputContentInfoCompatBaseImpl(Uri uri0, ClipDescription clipDescription0, Uri uri1) {
            this.a = uri0;
            this.b = clipDescription0;
            this.c = uri1;
        }

        @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
        public Uri O() {
            return this.c;
        }

        @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
        public Object a() {
            return null;
        }

        @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
        public Uri b() {
            return this.a;
        }

        @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
        public void c() {
        }

        @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
        public void d() {
        }

        @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
        public ClipDescription getDescription() {
            return this.b;
        }
    }

    interface InputContentInfoCompatImpl {
        Uri O();

        Object a();

        Uri b();

        void c();

        void d();

        ClipDescription getDescription();
    }

    private final InputContentInfoCompatImpl a;

    public InputContentInfoCompat(Uri uri0, ClipDescription clipDescription0, Uri uri1) {
        if(Build.VERSION.SDK_INT >= 25) {
            this.a = new InputContentInfoCompatApi25Impl(uri0, clipDescription0, uri1);
            return;
        }
        this.a = new InputContentInfoCompatBaseImpl(uri0, clipDescription0, uri1);
    }

    private InputContentInfoCompat(InputContentInfoCompatImpl inputContentInfoCompat$InputContentInfoCompatImpl0) {
        this.a = inputContentInfoCompat$InputContentInfoCompatImpl0;
    }

    public Uri a() {
        return this.a.b();
    }

    public ClipDescription b() {
        return this.a.getDescription();
    }

    public Uri c() {
        return this.a.O();
    }

    public void d() {
        this.a.d();
    }

    public void e() {
        this.a.c();
    }

    public Object f() {
        return this.a.a();
    }

    public static InputContentInfoCompat g(Object object0) {
        if(object0 == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 25 ? new InputContentInfoCompat(new InputContentInfoCompatApi25Impl(object0)) : null;
    }
}

