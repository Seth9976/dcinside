package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ClearableEditText;

public final class l1 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final ClearableEditText b;
    @NonNull
    public final TextView c;
    @NonNull
    public final ProgressBar d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;

    private l1(@NonNull FrameLayout frameLayout0, @NonNull ClearableEditText clearableEditText0, @NonNull TextView textView0, @NonNull ProgressBar progressBar0, @NonNull TextView textView1, @NonNull TextView textView2) {
        this.a = frameLayout0;
        this.b = clearableEditText0;
        this.c = textView0;
        this.d = progressBar0;
        this.e = textView1;
        this.f = textView2;
    }

    @NonNull
    public static l1 a(@NonNull View view0) {
        int v = 0x7F0B0E16;  // id:series_input_url
        View view1 = ViewBindings.a(view0, 0x7F0B0E16);  // id:series_input_url
        if(((ClearableEditText)view1) != null) {
            v = 0x7F0B0E17;  // id:series_input_url_apply
            View view2 = ViewBindings.a(view0, 0x7F0B0E17);  // id:series_input_url_apply
            if(((TextView)view2) != null) {
                v = 0x7F0B0E18;  // id:series_input_url_check_progress
                View view3 = ViewBindings.a(view0, 0x7F0B0E18);  // id:series_input_url_check_progress
                if(((ProgressBar)view3) != null) {
                    v = 0x7F0B0E19;  // id:series_input_url_error
                    View view4 = ViewBindings.a(view0, 0x7F0B0E19);  // id:series_input_url_error
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0E1A;  // id:series_input_url_title
                        View view5 = ViewBindings.a(view0, 0x7F0B0E1A);  // id:series_input_url_title
                        if(((TextView)view5) != null) {
                            return new l1(((FrameLayout)view0), ((ClearableEditText)view1), ((TextView)view2), ((ProgressBar)view3), ((TextView)view4), ((TextView)view5));
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
    public static l1 c(@NonNull LayoutInflater layoutInflater0) {
        return l1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static l1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00CB, viewGroup0, false);  // layout:dialog_fragment_input_url
        if(z) {
            viewGroup0.addView(view0);
        }
        return l1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

