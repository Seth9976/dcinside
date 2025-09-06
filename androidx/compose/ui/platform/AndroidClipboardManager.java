package androidx.compose.ui.platform;

import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidClipboardManager implements ClipboardManager {
    @l
    private final android.content.ClipboardManager a;

    public AndroidClipboardManager(@l android.content.ClipboardManager clipboardManager0) {
        L.p(clipboardManager0, "clipboardManager");
        super();
        this.a = clipboardManager0;
    }

    public AndroidClipboardManager(@l Context context0) {
        L.p(context0, "context");
        Object object0 = context0.getSystemService("clipboard");
        L.n(object0, "null cannot be cast to non-null type android.content.ClipboardManager");
        this(((android.content.ClipboardManager)object0));
    }

    @Override  // androidx.compose.ui.platform.ClipboardManager
    @m
    public AnnotatedString a() {
        ClipData clipData0 = this.a.getPrimaryClip();
        AnnotatedString annotatedString0 = null;
        if(clipData0 != null && clipData0.getItemCount() > 0) {
            ClipData.Item clipData$Item0 = clipData0.getItemAt(0);
            if(clipData$Item0 != null) {
                annotatedString0 = clipData$Item0.getText();
            }
            return AndroidClipboardManager_androidKt.a(annotatedString0);
        }
        return null;
    }

    @Override  // androidx.compose.ui.platform.ClipboardManager
    public boolean b() {
        ClipDescription clipDescription0 = this.a.getPrimaryClipDescription();
        return clipDescription0 == null ? false : clipDescription0.hasMimeType("text/*");
    }

    @Override  // androidx.compose.ui.platform.ClipboardManager
    public void c(@l AnnotatedString annotatedString0) {
        L.p(annotatedString0, "annotatedString");
        ClipData clipData0 = ClipData.newPlainText("plain text", AndroidClipboardManager_androidKt.b(annotatedString0));
        this.a.setPrimaryClip(clipData0);
    }
}

