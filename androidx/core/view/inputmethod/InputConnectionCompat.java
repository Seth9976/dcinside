package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ContentInfoCompat.Builder;
import androidx.core.view.ViewCompat;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class InputConnectionCompat {
    @RequiresApi(25)
    static class Api25Impl {
        static boolean a(InputConnection inputConnection0, InputContentInfo inputContentInfo0, int v, Bundle bundle0) {
            return inputConnection0.commitContent(inputContentInfo0, v, bundle0);
        }
    }

    public interface OnCommitContentListener {
        boolean a(InputContentInfoCompat arg1, int arg2, Bundle arg3);
    }

    private static final String a = "InputConnectionCompat";
    private static final String b = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String c = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String d = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String e = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String f = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String g = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String h = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String i = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String j = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String k = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String l = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String m = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String n = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final String o = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final int p = 1;
    private static final String q = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    public static boolean b(InputConnection inputConnection0, EditorInfo editorInfo0, InputContentInfoCompat inputContentInfoCompat0, int v, Bundle bundle0) {
        if(Build.VERSION.SDK_INT >= 25) {
            return Api25Impl.a(inputConnection0, c.a(inputContentInfoCompat0.f()), v, bundle0);
        }
        boolean z = false;
        int v1 = EditorInfoCompat.e(editorInfo0);
        if(v1 == 2) {
            z = true;
        }
        else if(v1 != 3 && v1 != 4) {
            return false;
        }
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable((z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"), inputContentInfoCompat0.a());
        bundle1.putParcelable((z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"), inputContentInfoCompat0.b());
        bundle1.putParcelable((z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"), inputContentInfoCompat0.c());
        bundle1.putInt((z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"), v);
        bundle1.putParcelable((z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"), bundle0);
        return z ? inputConnection0.performPrivateCommand("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", bundle1) : inputConnection0.performPrivateCommand("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", bundle1);
    }

    private static OnCommitContentListener c(View view0) {
        Preconditions.l(view0);
        return (InputContentInfoCompat inputContentInfoCompat0, int v, Bundle bundle0) -> {
            if(Build.VERSION.SDK_INT >= 25 && (v & 1) != 0) {
                try {
                    inputContentInfoCompat0.e();
                }
                catch(Exception exception0) {
                    Log.w("InputConnectionCompat", "Can\'t insert content from IME; requestPermission() failed", exception0);
                    return false;
                }
                Parcelable parcelable0 = (Parcelable)inputContentInfoCompat0.f();
                bundle0 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
                bundle0.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable0);
                return ViewCompat.u1(view0, new Builder(new ClipData(inputContentInfoCompat0.b(), new ClipData.Item(inputContentInfoCompat0.a())), 2).e(inputContentInfoCompat0.c()).c(bundle0).a()) == null;
            }
            return ViewCompat.u1(view0, new Builder(new ClipData(inputContentInfoCompat0.b(), new ClipData.Item(inputContentInfoCompat0.a())), 2).e(inputContentInfoCompat0.c()).c(bundle0).a()) == null;
        };
    }

    public static InputConnection d(View view0, InputConnection inputConnection0, EditorInfo editorInfo0) {
        return InputConnectionCompat.e(inputConnection0, editorInfo0, InputConnectionCompat.c(view0));
    }

    @Deprecated
    public static InputConnection e(InputConnection inputConnection0, EditorInfo editorInfo0, OnCommitContentListener inputConnectionCompat$OnCommitContentListener0) {
        ObjectsCompat.e(inputConnection0, "inputConnection must be non-null");
        ObjectsCompat.e(editorInfo0, "editorInfo must be non-null");
        ObjectsCompat.e(inputConnectionCompat$OnCommitContentListener0, "onCommitContentListener must be non-null");
        if(Build.VERSION.SDK_INT >= 25) {
            return new InputConnectionWrapper(inputConnection0, false) {
                @Override  // android.view.inputmethod.InputConnectionWrapper
                public boolean commitContent(InputContentInfo inputContentInfo0, int v, Bundle bundle0) {
                    InputContentInfoCompat inputContentInfoCompat0 = InputContentInfoCompat.g(inputContentInfo0);
                    return inputConnectionCompat$OnCommitContentListener0.a(inputContentInfoCompat0, v, bundle0) ? true : super.commitContent(inputContentInfo0, v, bundle0);
                }
            };
        }
        return EditorInfoCompat.a(editorInfo0).length == 0 ? inputConnection0 : new InputConnectionWrapper(inputConnection0, false) {
            // 去混淆评级： 低(20)
            @Override  // android.view.inputmethod.InputConnectionWrapper
            public boolean performPrivateCommand(String s, Bundle bundle0) {
                return InputConnectionCompat.f(s, bundle0, inputConnectionCompat$OnCommitContentListener0) ? true : super.performPrivateCommand(s, bundle0);
            }
        };
    }

    static boolean f(String s, Bundle bundle0, OnCommitContentListener inputConnectionCompat$OnCommitContentListener0) {
        ResultReceiver resultReceiver0;
        boolean z1;
        boolean z = false;
        if(bundle0 == null) {
            return false;
        }
        if(TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", s)) {
            z1 = false;
            goto label_8;
        }
        if(TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", s)) {
            z1 = true;
            try {
            label_8:
                resultReceiver0 = null;
                resultReceiver0 = (ResultReceiver)bundle0.getParcelable((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"));
                Uri uri0 = (Uri)bundle0.getParcelable((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"));
                ClipDescription clipDescription0 = (ClipDescription)bundle0.getParcelable((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"));
                Uri uri1 = (Uri)bundle0.getParcelable((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"));
                int v = bundle0.getInt((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"));
                Bundle bundle1 = (Bundle)bundle0.getParcelable((z1 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"));
                if(uri0 != null && clipDescription0 != null) {
                    z = inputConnectionCompat$OnCommitContentListener0.a(new InputContentInfoCompat(uri0, clipDescription0, uri1), v, bundle1);
                    goto label_22;
                label_19:
                    if(resultReceiver0 == null) {
                        throw throwable0;
                    }
                    goto label_20;
                }
                goto label_22;
            }
            catch(Throwable throwable0) {
                goto label_19;
            }
        label_20:
            resultReceiver0.send(0, null);
            throw throwable0;
        label_22:
            if(resultReceiver0 != null) {
                resultReceiver0.send(((int)z), null);
            }
            return z;
        }
        return false;
    }

    // 检测为 Lambda 实现
    private static boolean g(View view0, InputContentInfoCompat inputContentInfoCompat0, int v, Bundle bundle0) [...]
}

