package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class c3 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;

    private c3(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = textView2;
    }

    @NonNull
    public static c3 a(@NonNull View view0) {
        int v = 0x7F0B0F21;  // id:snackbar_url_content
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0F21);  // id:snackbar_url_content
        if(textView0 != null) {
            v = 0x7F0B0F22;  // id:snackbar_url_open
            TextView textView1 = (TextView)ViewBindings.a(view0, 0x7F0B0F22);  // id:snackbar_url_open
            if(textView1 != null) {
                v = 0x7F0B0F23;  // id:snackbar_url_title
                TextView textView2 = (TextView)ViewBindings.a(view0, 0x7F0B0F23);  // id:snackbar_url_title
                if(textView2 != null) {
                    return new c3(((ConstraintLayout)view0), textView0, textView1, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static c3 c(@NonNull LayoutInflater layoutInflater0) {
        return c3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static c3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E018A, viewGroup0, false);  // layout:url_snackbar
        if(z) {
            viewGroup0.addView(view0);
        }
        return c3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

