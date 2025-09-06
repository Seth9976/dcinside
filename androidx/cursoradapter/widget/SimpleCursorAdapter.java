package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public class SimpleCursorAdapter extends ResourceCursorAdapter {
    public interface CursorToStringConverter {
        CharSequence a(Cursor arg1);
    }

    public interface ViewBinder {
        boolean a(View arg1, Cursor arg2, int arg3);
    }

    @RestrictTo({Scope.b})
    protected int[] o;
    @RestrictTo({Scope.b})
    protected int[] p;
    private int q;
    private CursorToStringConverter r;
    private ViewBinder s;
    String[] t;

    @Deprecated
    public SimpleCursorAdapter(Context context0, int v, Cursor cursor0, String[] arr_s, int[] arr_v) {
        super(context0, v, cursor0);
        this.q = -1;
        this.p = arr_v;
        this.t = arr_s;
        this.q(cursor0, arr_s);
    }

    public SimpleCursorAdapter(Context context0, int v, Cursor cursor0, String[] arr_s, int[] arr_v, int v1) {
        super(context0, v, cursor0, v1);
        this.q = -1;
        this.p = arr_v;
        this.t = arr_s;
        this.q(cursor0, arr_s);
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public CharSequence a(Cursor cursor0) {
        CursorToStringConverter simpleCursorAdapter$CursorToStringConverter0 = this.r;
        if(simpleCursorAdapter$CursorToStringConverter0 != null) {
            return simpleCursorAdapter$CursorToStringConverter0.a(cursor0);
        }
        int v = this.q;
        return v > -1 ? cursor0.getString(v) : super.a(cursor0);
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public void e(View view0, Context context0, Cursor cursor0) {
        ViewBinder simpleCursorAdapter$ViewBinder0 = this.s;
        int[] arr_v = this.p;
        int[] arr_v1 = this.o;
        for(int v = 0; v < arr_v.length; ++v) {
            View view1 = view0.findViewById(arr_v[v]);
            if(view1 != null && !(simpleCursorAdapter$ViewBinder0 == null ? false : simpleCursorAdapter$ViewBinder0.a(view1, cursor0, arr_v1[v]))) {
                String s = cursor0.getString(arr_v1[v]);
                if(s == null) {
                    s = "";
                }
                if(view1 instanceof TextView) {
                    this.y(((TextView)view1), s);
                }
                else {
                    if(!(view1 instanceof ImageView)) {
                        throw new IllegalStateException(view1.getClass().getName() + " is not a " + " view that can be bounds by this SimpleCursorAdapter");
                    }
                    this.x(((ImageView)view1), s);
                    continue;
                }
            }
        }
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public Cursor m(Cursor cursor0) {
        this.q(cursor0, this.t);
        return super.m(cursor0);
    }

    public void p(Cursor cursor0, String[] arr_s, int[] arr_v) {
        this.t = arr_s;
        this.p = arr_v;
        this.q(cursor0, arr_s);
        super.b(cursor0);
    }

    private void q(Cursor cursor0, String[] arr_s) {
        if(cursor0 != null) {
            if(this.o == null || this.o.length != arr_s.length) {
                this.o = new int[arr_s.length];
            }
            for(int v = 0; v < arr_s.length; ++v) {
                int[] arr_v = this.o;
                arr_v[v] = cursor0.getColumnIndexOrThrow(arr_s[v]);
            }
            return;
        }
        this.o = null;
    }

    public CursorToStringConverter r() {
        return this.r;
    }

    public int s() {
        return this.q;
    }

    public ViewBinder t() {
        return this.s;
    }

    public void u(CursorToStringConverter simpleCursorAdapter$CursorToStringConverter0) {
        this.r = simpleCursorAdapter$CursorToStringConverter0;
    }

    public void v(int v) {
        this.q = v;
    }

    public void w(ViewBinder simpleCursorAdapter$ViewBinder0) {
        this.s = simpleCursorAdapter$ViewBinder0;
    }

    public void x(ImageView imageView0, String s) {
        try {
            imageView0.setImageResource(Integer.parseInt(s));
        }
        catch(NumberFormatException unused_ex) {
            imageView0.setImageURI(Uri.parse(s));
        }
    }

    public void y(TextView textView0, String s) {
        textView0.setText(s);
    }
}

