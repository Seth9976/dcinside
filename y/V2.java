package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class v2 implements ViewBinding {
    @NonNull
    private final ScrollView a;
    @NonNull
    public final TextView b;
    @NonNull
    public final SwitchCompat c;
    @NonNull
    public final TextView d;
    @NonNull
    public final LinearLayout e;
    @NonNull
    public final RecyclerView f;
    @NonNull
    public final LinearLayout g;
    @NonNull
    public final ImageView h;
    @NonNull
    public final TextView i;
    @NonNull
    public final TextView j;

    private v2(@NonNull ScrollView scrollView0, @NonNull TextView textView0, @NonNull SwitchCompat switchCompat0, @NonNull TextView textView1, @NonNull LinearLayout linearLayout0, @NonNull RecyclerView recyclerView0, @NonNull LinearLayout linearLayout1, @NonNull ImageView imageView0, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = scrollView0;
        this.b = textView0;
        this.c = switchCompat0;
        this.d = textView1;
        this.e = linearLayout0;
        this.f = recyclerView0;
        this.g = linearLayout1;
        this.h = imageView0;
        this.i = textView2;
        this.j = textView3;
    }

    @NonNull
    public static v2 a(@NonNull View view0) {
        int v = 0x7F0B0237;  // id:block_report_all_title
        View view1 = ViewBindings.a(view0, 0x7F0B0237);  // id:block_report_all_title
        if(((TextView)view1) != null) {
            v = 0x7F0B0238;  // id:block_report_enable_switch
            View view2 = ViewBindings.a(view0, 0x7F0B0238);  // id:block_report_enable_switch
            if(((SwitchCompat)view2) != null) {
                v = 0x7F0B0239;  // id:block_report_enable_title
                View view3 = ViewBindings.a(view0, 0x7F0B0239);  // id:block_report_enable_title
                if(((TextView)view3) != null) {
                    v = 0x7F0B023A;  // id:block_report_enable_wrap
                    View view4 = ViewBindings.a(view0, 0x7F0B023A);  // id:block_report_enable_wrap
                    if(((LinearLayout)view4) != null) {
                        v = 0x7F0B023F;  // id:block_report_list
                        View view5 = ViewBindings.a(view0, 0x7F0B023F);  // id:block_report_list
                        if(((RecyclerView)view5) != null) {
                            v = 0x7F0B0240;  // id:block_report_list_opener
                            View view6 = ViewBindings.a(view0, 0x7F0B0240);  // id:block_report_list_opener
                            if(((LinearLayout)view6) != null) {
                                v = 0x7F0B0241;  // id:block_report_list_opener_arrow
                                View view7 = ViewBindings.a(view0, 0x7F0B0241);  // id:block_report_list_opener_arrow
                                if(((ImageView)view7) != null) {
                                    v = 0x7F0B0242;  // id:block_report_list_opener_count
                                    View view8 = ViewBindings.a(view0, 0x7F0B0242);  // id:block_report_list_opener_count
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B0243;  // id:block_report_msg
                                        View view9 = ViewBindings.a(view0, 0x7F0B0243);  // id:block_report_msg
                                        if(((TextView)view9) != null) {
                                            return new v2(((ScrollView)view0), ((TextView)view1), ((SwitchCompat)view2), ((TextView)view3), ((LinearLayout)view4), ((RecyclerView)view5), ((LinearLayout)view6), ((ImageView)view7), ((TextView)view8), ((TextView)view9));
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
    public ScrollView b() {
        return this.a;
    }

    @NonNull
    public static v2 c(@NonNull LayoutInflater layoutInflater0) {
        return v2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static v2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0116, viewGroup0, false);  // layout:fragment_report_block_setting
        if(z) {
            viewGroup0.addView(view0);
        }
        return v2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

