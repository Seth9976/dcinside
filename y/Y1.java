package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class y1 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;

    private y1(@NonNull FrameLayout frameLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = frameLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = textView2;
        this.e = textView3;
    }

    @NonNull
    public static y1 a(@NonNull View view0) {
        int v = 0x7F0B1098;  // id:voice_copyright_close
        View view1 = ViewBindings.a(view0, 0x7F0B1098);  // id:voice_copyright_close
        if(((TextView)view1) != null) {
            v = 0x7F0B1099;  // id:voice_copyright_content
            View view2 = ViewBindings.a(view0, 0x7F0B1099);  // id:voice_copyright_content
            if(((TextView)view2) != null) {
                v = 0x7F0B109A;  // id:voice_copyright_law
                View view3 = ViewBindings.a(view0, 0x7F0B109A);  // id:voice_copyright_law
                if(((TextView)view3) != null) {
                    v = 0x7F0B109B;  // id:voice_copyright_title
                    View view4 = ViewBindings.a(view0, 0x7F0B109B);  // id:voice_copyright_title
                    if(((TextView)view4) != null) {
                        return new y1(((FrameLayout)view0), ((TextView)view1), ((TextView)view2), ((TextView)view3), ((TextView)view4));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static y1 c(@NonNull LayoutInflater layoutInflater0) {
        return y1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static y1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00D8, viewGroup0, false);  // layout:dialog_fragment_voice_copyright
        if(z) {
            viewGroup0.addView(view0);
        }
        return y1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

