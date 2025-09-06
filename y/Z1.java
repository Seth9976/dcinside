package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class z1 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final EditText d;
    @NonNull
    public final TextView e;
    @NonNull
    public final EditText f;
    @NonNull
    public final ProgressBar g;
    @NonNull
    public final TextView h;
    @NonNull
    public final EditText i;
    @NonNull
    public final TextView j;

    private z1(@NonNull FrameLayout frameLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull EditText editText0, @NonNull TextView textView2, @NonNull EditText editText1, @NonNull ProgressBar progressBar0, @NonNull TextView textView3, @NonNull EditText editText2, @NonNull TextView textView4) {
        this.a = frameLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = editText0;
        this.e = textView2;
        this.f = editText1;
        this.g = progressBar0;
        this.h = textView3;
        this.i = editText2;
        this.j = textView4;
    }

    @NonNull
    public static z1 a(@NonNull View view0) {
        int v = 0x7F0B109C;  // id:voice_download_confirm
        View view1 = ViewBindings.a(view0, 0x7F0B109C);  // id:voice_download_confirm
        if(((TextView)view1) != null) {
            v = 0x7F0B109D;  // id:voice_download_gall_name
            View view2 = ViewBindings.a(view0, 0x7F0B109D);  // id:voice_download_gall_name
            if(((TextView)view2) != null) {
                v = 0x7F0B109E;  // id:voice_download_gall_name_input
                View view3 = ViewBindings.a(view0, 0x7F0B109E);  // id:voice_download_gall_name_input
                if(((EditText)view3) != null) {
                    v = 0x7F0B109F;  // id:voice_download_name
                    View view4 = ViewBindings.a(view0, 0x7F0B109F);  // id:voice_download_name
                    if(((TextView)view4) != null) {
                        v = 0x7F0B10A0;  // id:voice_download_nickname_input
                        View view5 = ViewBindings.a(view0, 0x7F0B10A0);  // id:voice_download_nickname_input
                        if(((EditText)view5) != null) {
                            v = 0x7F0B10A1;  // id:voice_download_progress
                            View view6 = ViewBindings.a(view0, 0x7F0B10A1);  // id:voice_download_progress
                            if(((ProgressBar)view6) != null) {
                                v = 0x7F0B10A2;  // id:voice_download_subject
                                View view7 = ViewBindings.a(view0, 0x7F0B10A2);  // id:voice_download_subject
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B10A3;  // id:voice_download_subject_input
                                    View view8 = ViewBindings.a(view0, 0x7F0B10A3);  // id:voice_download_subject_input
                                    if(((EditText)view8) != null) {
                                        v = 0x7F0B10A4;  // id:voice_download_title
                                        View view9 = ViewBindings.a(view0, 0x7F0B10A4);  // id:voice_download_title
                                        if(((TextView)view9) != null) {
                                            return new z1(((FrameLayout)view0), ((TextView)view1), ((TextView)view2), ((EditText)view3), ((TextView)view4), ((EditText)view5), ((ProgressBar)view6), ((TextView)view7), ((EditText)view8), ((TextView)view9));
                                        }
                                    }
                                }
                            }
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
    public static z1 c(@NonNull LayoutInflater layoutInflater0) {
        return z1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static z1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00D9, viewGroup0, false);  // layout:dialog_fragment_voice_download
        if(z) {
            viewGroup0.addView(view0);
        }
        return z1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

