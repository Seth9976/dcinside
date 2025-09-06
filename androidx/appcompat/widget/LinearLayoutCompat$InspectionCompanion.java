package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;

@RequiresApi(29)
@RestrictTo({Scope.a})
public final class LinearLayoutCompat.InspectionCompanion implements InspectionCompanion {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public LinearLayoutCompat.InspectionCompanion() {
        this.a = false;
    }

    public void a(@NonNull LinearLayoutCompat linearLayoutCompat0, @NonNull PropertyReader propertyReader0) {
        if(!this.a) {
            throw e.a();
        }
        propertyReader0.readBoolean(this.b, linearLayoutCompat0.w());
        propertyReader0.readInt(this.c, linearLayoutCompat0.getBaselineAlignedChildIndex());
        propertyReader0.readGravity(this.d, linearLayoutCompat0.getGravity());
        propertyReader0.readIntEnum(this.e, linearLayoutCompat0.getOrientation());
        propertyReader0.readFloat(this.f, linearLayoutCompat0.getWeightSum());
        propertyReader0.readObject(this.g, linearLayoutCompat0.getDividerDrawable());
        propertyReader0.readInt(this.h, linearLayoutCompat0.getDividerPadding());
        propertyReader0.readBoolean(this.i, linearLayoutCompat0.x());
        propertyReader0.readIntFlag(this.j, linearLayoutCompat0.getShowDividers());
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper0) {
        this.b = propertyMapper0.mapBoolean("baselineAligned", 0x1010126);
        this.c = propertyMapper0.mapInt("baselineAlignedChildIndex", 0x1010127);
        this.d = propertyMapper0.mapGravity("gravity", 0x10100AF);
        this.e = propertyMapper0.mapIntEnum("orientation", 0x10100C4, new IntFunction() {
            final LinearLayoutCompat.InspectionCompanion a;

            public String a(int v) {
                switch(v) {
                    case 0: {
                        return "horizontal";
                    }
                    case 1: {
                        return "vertical";
                    }
                    default: {
                        return String.valueOf(v);
                    }
                }
            }

            @Override
            public Object apply(int v) {
                return this.a(v);
            }
        });
        this.f = propertyMapper0.mapFloat("weightSum", 0x1010128);
        this.g = propertyMapper0.mapObject("divider", attr.divider);
        this.h = propertyMapper0.mapInt("dividerPadding", attr.dividerPadding);
        this.i = propertyMapper0.mapBoolean("measureWithLargestChild", attr.measureWithLargestChild);
        androidx.appcompat.widget.LinearLayoutCompat.InspectionCompanion.2 linearLayoutCompat$InspectionCompanion$20 = new IntFunction() {
            final LinearLayoutCompat.InspectionCompanion a;

            public Set a(int v) {
                Set set0 = new HashSet();
                if(v == 0) {
                    set0.add("none");
                }
                if(v == 1) {
                    set0.add("beginning");
                }
                if(v == 2) {
                    set0.add("middle");
                }
                if(v == 4) {
                    set0.add("end");
                }
                return set0;
            }

            @Override
            public Object apply(int v) {
                return this.a(v);
            }
        };
        this.j = propertyMapper0.mapIntFlag("showDividers", attr.showDividers, linearLayoutCompat$InspectionCompanion$20);
        this.a = true;
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void readProperties(@NonNull Object object0, @NonNull PropertyReader propertyReader0) {
        this.a(((LinearLayoutCompat)object0), propertyReader0);
    }
}

