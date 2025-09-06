package com.dcinside.rich;

import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.util.Log;
import android.view.WindowManager;
import android.widget.EditText;
import com.google.firebase.crashlytics.j;

public class e {
    public static int[] a(EditText editText0) {
        Editable editable0 = editText0.getText();
        int v = Selection.getSelectionStart(editable0);
        int v1 = Selection.getSelectionEnd(editable0);
        Layout layout0 = editText0.getLayout();
        int[] arr_v = new int[2];
        if(v != -1) {
            arr_v[0] = layout0.getLineForOffset(v);
        }
        if(v1 != -1) {
            arr_v[1] = layout0.getLineForOffset(v1);
        }
        return arr_v;
    }

    public static int b(Context context0, int v) {
        return (int)(((double)(context0.getResources().getDisplayMetrics().density * ((float)v))) + 0.5);
    }

    public static int[] c(Context context0) {
        Point point0 = new Point();
        ((WindowManager)context0.getSystemService("window")).getDefaultDisplay().getSize(point0);
        return new int[]{point0.x, point0.y};
    }

    public static int d(EditText editText0, int v) {
        try {
            return -1 == v ? -1 : editText0.getLayout().getLineEnd(v);
        }
        catch(Exception unused_ex) {
        }
        return -1;
    }

    public static int e(EditText editText0, int v) {
        try {
            int v1 = 0;
            Layout layout0 = editText0.getLayout();
            if(v > 0) {
                try {
                    v1 = layout0.getLineStart(v);
                }
                catch(Exception unused_ex) {
                    j.e().i(String.valueOf(editText0.getText()));
                }
                if(v1 > 0) {
                    String s = editText0.getText().toString();
                    int v2 = s.charAt(v1 - 1);
                    while(v2 != 10) {
                        if(v > 0) {
                            --v;
                            v1 = layout0.getLineStart(v);
                            if(v1 <= 1) {
                                break;
                            }
                            --v1;
                            v2 = s.charAt(v1);
                        }
                    }
                }
            }
            return v1;
        }
        catch(Exception unused_ex) {
            return -1;
        }
    }

    public static void f(String s) {
        Log.d("RichEdit", s);
    }
}

