package androidx.core.widget;

import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentListener;

@RestrictTo({Scope.c})
public final class TextViewOnReceiveContentListener implements OnReceiveContentListener {
    private static final String a = "ReceiveContent";

    @Override  // androidx.core.view.OnReceiveContentListener
    public ContentInfoCompat a(View view0, ContentInfoCompat contentInfoCompat0) {
        if(Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + contentInfoCompat0);
        }
        if(contentInfoCompat0.g() == 2) {
            return contentInfoCompat0;
        }
        ClipData clipData0 = contentInfoCompat0.c();
        int v = contentInfoCompat0.e();
        Editable editable0 = (Editable)((TextView)view0).getText();
        Context context0 = ((TextView)view0).getContext();
        boolean z = false;
        for(int v1 = 0; v1 < clipData0.getItemCount(); ++v1) {
            CharSequence charSequence0 = TextViewOnReceiveContentListener.b(context0, clipData0.getItemAt(v1), v);
            if(charSequence0 != null) {
                if(z) {
                    editable0.insert(Selection.getSelectionEnd(editable0), "\n");
                    editable0.insert(Selection.getSelectionEnd(editable0), charSequence0);
                }
                else {
                    TextViewOnReceiveContentListener.c(editable0, charSequence0);
                    z = true;
                }
            }
        }
        return null;
    }

    private static CharSequence b(Context context0, ClipData.Item clipData$Item0, int v) {
        if((v & 1) != 0) {
            CharSequence charSequence0 = clipData$Item0.coerceToText(context0);
            return charSequence0 instanceof Spanned ? charSequence0.toString() : charSequence0;
        }
        return clipData$Item0.coerceToStyledText(context0);
    }

    private static void c(Editable editable0, CharSequence charSequence0) {
        int v = Selection.getSelectionStart(editable0);
        int v1 = Selection.getSelectionEnd(editable0);
        int v2 = Math.max(0, Math.max(v, v1));
        Selection.setSelection(editable0, v2);
        editable0.replace(Math.max(0, Math.min(v, v1)), v2, charSequence0);
    }
}

