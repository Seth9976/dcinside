package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ClearableEditText;

public final class a5 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final LinearLayout d;
    @NonNull
    public final ClearableEditText e;
    @NonNull
    public final TextView f;

    private a5(@NonNull LinearLayout linearLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull LinearLayout linearLayout1, @NonNull ClearableEditText clearableEditText0, @NonNull TextView textView2) {
        this.a = linearLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = linearLayout1;
        this.e = clearableEditText0;
        this.f = textView2;
    }

    @NonNull
    public static a5 a(@NonNull View view0) {
        int v = 0x7F0B0669;  // id:input_string_negative
        View view1 = ViewBindings.a(view0, 0x7F0B0669);  // id:input_string_negative
        if(((TextView)view1) != null) {
            v = 0x7F0B066A;  // id:input_string_positive
            View view2 = ViewBindings.a(view0, 0x7F0B066A);  // id:input_string_positive
            if(((TextView)view2) != null) {
                v = 0x7F0B066B;  // id:input_string_recent_parent
                View view3 = ViewBindings.a(view0, 0x7F0B066B);  // id:input_string_recent_parent
                if(((LinearLayout)view3) != null) {
                    v = 0x7F0B066C;  // id:input_string_text
                    View view4 = ViewBindings.a(view0, 0x7F0B066C);  // id:input_string_text
                    if(((ClearableEditText)view4) != null) {
                        v = 0x7F0B066D;  // id:input_string_title
                        View view5 = ViewBindings.a(view0, 0x7F0B066D);  // id:input_string_title
                        if(((TextView)view5) != null) {
                            return new a5(((LinearLayout)view0), ((TextView)view1), ((TextView)view2), ((LinearLayout)view3), ((ClearableEditText)view4), ((TextView)view5));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static a5 c(@NonNull LayoutInflater layoutInflater0) {
        return a5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static a5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01F0, viewGroup0, false);  // layout:view_input_string
        if(z) {
            viewGroup0.addView(view0);
        }
        return a5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

