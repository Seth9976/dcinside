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
import com.dcinside.app.view.ClearableEditText;

public final class j1 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final ClearableEditText d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;

    private j1(@NonNull FrameLayout frameLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull ClearableEditText clearableEditText0, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = frameLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = clearableEditText0;
        this.e = textView2;
        this.f = textView3;
    }

    @NonNull
    public static j1 a(@NonNull View view0) {
        int v = 0x7F0B0E0A;  // id:series_copy_apply
        View view1 = ViewBindings.a(view0, 0x7F0B0E0A);  // id:series_copy_apply
        if(((TextView)view1) != null) {
            v = 0x7F0B0E0B;  // id:series_copy_cancel
            View view2 = ViewBindings.a(view0, 0x7F0B0E0B);  // id:series_copy_cancel
            if(((TextView)view2) != null) {
                v = 0x7F0B0E0C;  // id:series_copy_subject
                View view3 = ViewBindings.a(view0, 0x7F0B0E0C);  // id:series_copy_subject
                if(((ClearableEditText)view3) != null) {
                    v = 0x7F0B0E0D;  // id:series_copy_subject_title
                    View view4 = ViewBindings.a(view0, 0x7F0B0E0D);  // id:series_copy_subject_title
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0E0E;  // id:series_copy_title
                        View view5 = ViewBindings.a(view0, 0x7F0B0E0E);  // id:series_copy_title
                        if(((TextView)view5) != null) {
                            return new j1(((FrameLayout)view0), ((TextView)view1), ((TextView)view2), ((ClearableEditText)view3), ((TextView)view4), ((TextView)view5));
                        }
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
    public static j1 c(@NonNull LayoutInflater layoutInflater0) {
        return j1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static j1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00C9, viewGroup0, false);  // layout:dialog_fragment_copy_series
        if(z) {
            viewGroup0.addView(view0);
        }
        return j1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

