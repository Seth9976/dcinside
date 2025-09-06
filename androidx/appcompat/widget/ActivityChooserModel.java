package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import j..util.DesugarCollections;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

class ActivityChooserModel extends DataSetObservable {
    public interface ActivityChooserModelClient {
        void setActivityChooserModel(ActivityChooserModel arg1);
    }

    public static final class ActivityResolveInfo implements Comparable {
        public final ResolveInfo a;
        public float b;

        public ActivityResolveInfo(ResolveInfo resolveInfo0) {
            this.a = resolveInfo0;
        }

        public int a(ActivityResolveInfo activityChooserModel$ActivityResolveInfo0) {
            return Float.floatToIntBits(activityChooserModel$ActivityResolveInfo0.b) - Float.floatToIntBits(this.b);
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((ActivityResolveInfo)object0));
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 == null) {
                return false;
            }
            Class class0 = object0.getClass();
            return ActivityResolveInfo.class == class0 ? Float.floatToIntBits(this.b) == Float.floatToIntBits(((ActivityResolveInfo)object0).b) : false;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.b) + 0x1F;
        }

        // 去混淆评级： 低(20)
        @Override
        public String toString() {
            return "[resolveInfo:" + this.a.toString() + "; weight:" + new BigDecimal(((double)this.b)) + "]";
        }
    }

    public interface ActivitySorter {
        void a(Intent arg1, List arg2, List arg3);
    }

    static final class DefaultSorter implements ActivitySorter {
        private final Map a;
        private static final float b = 0.95f;

        DefaultSorter() {
            this.a = new HashMap();
        }

        @Override  // androidx.appcompat.widget.ActivityChooserModel$ActivitySorter
        public void a(Intent intent0, List list0, List list1) {
            Map map0 = this.a;
            map0.clear();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ActivityResolveInfo activityChooserModel$ActivityResolveInfo0 = (ActivityResolveInfo)list0.get(v1);
                activityChooserModel$ActivityResolveInfo0.b = 0.0f;
                map0.put(new ComponentName(activityChooserModel$ActivityResolveInfo0.a.activityInfo.packageName, activityChooserModel$ActivityResolveInfo0.a.activityInfo.name), activityChooserModel$ActivityResolveInfo0);
            }
            int v2 = list1.size() - 1;
            float f = 1.0f;
            while(v2 >= 0) {
                HistoricalRecord activityChooserModel$HistoricalRecord0 = (HistoricalRecord)list1.get(v2);
                ActivityResolveInfo activityChooserModel$ActivityResolveInfo1 = (ActivityResolveInfo)map0.get(activityChooserModel$HistoricalRecord0.a);
                if(activityChooserModel$ActivityResolveInfo1 != null) {
                    activityChooserModel$ActivityResolveInfo1.b += activityChooserModel$HistoricalRecord0.c * f;
                    f *= 0.95f;
                }
                --v2;
            }
            Collections.sort(list0);
        }
    }

    public static final class HistoricalRecord {
        public final ComponentName a;
        public final long b;
        public final float c;

        public HistoricalRecord(ComponentName componentName0, long v, float f) {
            this.a = componentName0;
            this.b = v;
            this.c = f;
        }

        public HistoricalRecord(String s, long v, float f) {
            this(ComponentName.unflattenFromString(s), v, f);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 == null) {
                return false;
            }
            Class class0 = object0.getClass();
            if(HistoricalRecord.class != class0) {
                return false;
            }
            ComponentName componentName0 = this.a;
            if(componentName0 == null) {
                if(((HistoricalRecord)object0).a != null) {
                    return false;
                }
            }
            else if(!componentName0.equals(((HistoricalRecord)object0).a)) {
                return false;
            }
            return this.b == ((HistoricalRecord)object0).b ? Float.floatToIntBits(this.c) == Float.floatToIntBits(((HistoricalRecord)object0).c) : false;
        }

        @Override
        public int hashCode() {
            return this.a == null ? (961 + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + Float.floatToIntBits(this.c) : ((this.a.hashCode() + 0x1F) * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + Float.floatToIntBits(this.c);
        }

        // 去混淆评级： 低(20)
        @Override
        public String toString() {
            return "[; activity:" + this.a + "; time:" + this.b + "; weight:" + new BigDecimal(((double)this.c)) + "]";
        }
    }

    public interface OnChooseActivityListener {
        boolean a(ActivityChooserModel arg1, Intent arg2);
    }

    final class PersistHistoryAsyncTask extends AsyncTask {
        final ActivityChooserModel a;

        public Void a(Object[] arr_object) {
            FileOutputStream fileOutputStream0;
            List list0 = (List)arr_object[0];
            String s = (String)arr_object[1];
            try {
                fileOutputStream0 = ActivityChooserModel.this.d.openFileOutput(s, 0);
            }
            catch(FileNotFoundException fileNotFoundException0) {
                Log.e("ActivityChooserModel", "Error writing historical record file: " + s, fileNotFoundException0);
                return null;
            }
            XmlSerializer xmlSerializer0 = Xml.newSerializer();
            try {
                try {
                    xmlSerializer0.setOutput(fileOutputStream0, null);
                    xmlSerializer0.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializer0.startTag(null, "historical-records");
                    int v = list0.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        HistoricalRecord activityChooserModel$HistoricalRecord0 = (HistoricalRecord)list0.remove(0);
                        xmlSerializer0.startTag(null, "historical-record");
                        xmlSerializer0.attribute(null, "activity", activityChooserModel$HistoricalRecord0.a.flattenToString());
                        xmlSerializer0.attribute(null, "time", String.valueOf(activityChooserModel$HistoricalRecord0.b));
                        xmlSerializer0.attribute(null, "weight", String.valueOf(activityChooserModel$HistoricalRecord0.c));
                        xmlSerializer0.endTag(null, "historical-record");
                    }
                    xmlSerializer0.endTag(null, "historical-records");
                    xmlSerializer0.endDocument();
                    ActivityChooserModel.this.i = true;
                    goto label_49;
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                }
                catch(IllegalStateException illegalStateException0) {
                    goto label_37;
                }
                catch(IOException iOException0) {
                    goto label_41;
                }
                Log.e("ActivityChooserModel", "Error writing historical record file: " + ActivityChooserModel.this.e, illegalArgumentException0);
                ActivityChooserModel.this.i = true;
                if(fileOutputStream0 != null) {
                    goto label_50;
                }
                return null;
            label_37:
                Log.e("ActivityChooserModel", "Error writing historical record file: " + ActivityChooserModel.this.e, illegalStateException0);
                ActivityChooserModel.this.i = true;
                if(fileOutputStream0 != null) {
                    goto label_50;
                label_41:
                    Log.e("ActivityChooserModel", "Error writing historical record file: " + ActivityChooserModel.this.e, iOException0);
                    ActivityChooserModel.this.i = true;
                    if(fileOutputStream0 != null) {
                        goto label_50;
                    }
                }
                return null;
            }
            catch(Throwable throwable0) {
                goto label_45;
            }
            goto label_50;
        label_45:
            ActivityChooserModel.this.i = true;
            if(fileOutputStream0 != null) {
                try {
                    fileOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            throw throwable0;
        label_49:
            if(fileOutputStream0 != null) {
                try {
                label_50:
                    fileOutputStream0.close();
                    return null;
                }
                catch(IOException unused_ex) {
                }
            }
            return null;
        }

        @Override  // android.os.AsyncTask
        public Object doInBackground(Object[] arr_object) {
            return this.a(arr_object);
        }
    }

    private static final Object A = null;
    private static final Map B = null;
    private final Object a;
    private final List b;
    private final List c;
    final Context d;
    final String e;
    private Intent f;
    private ActivitySorter g;
    private int h;
    boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private OnChooseActivityListener m;
    static final boolean n = false;
    static final String o = "ActivityChooserModel";
    static final String p = "historical-records";
    static final String q = "historical-record";
    static final String r = "activity";
    static final String s = "time";
    static final String t = "weight";
    public static final String u = "activity_choser_model_history.xml";
    public static final int v = 50;
    private static final int w = 5;
    private static final float x = 1.0f;
    private static final String y = ".xml";
    private static final int z = -1;

    static {
        ActivityChooserModel.A = new Object();
        ActivityChooserModel.B = new HashMap();
    }

    private ActivityChooserModel(Context context0, String s) {
        this.a = new Object();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = new DefaultSorter();
        this.h = 50;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = false;
        this.d = context0.getApplicationContext();
        if(!TextUtils.isEmpty(s) && !s.endsWith(".xml")) {
            this.e = s + ".xml";
            return;
        }
        this.e = s;
    }

    private boolean a(HistoricalRecord activityChooserModel$HistoricalRecord0) {
        boolean z = this.c.add(activityChooserModel$HistoricalRecord0);
        if(z) {
            this.k = true;
            this.n();
            this.m();
            this.v();
            this.notifyChanged();
        }
        return z;
    }

    public Intent b(int v) {
        synchronized(this.a) {
            if(this.f == null) {
                return null;
            }
            this.c();
            ActivityInfo activityInfo0 = ((ActivityResolveInfo)this.b.get(v)).a.activityInfo;
            ComponentName componentName0 = new ComponentName(activityInfo0.packageName, activityInfo0.name);
            Intent intent0 = new Intent(this.f);
            intent0.setComponent(componentName0);
            if(this.m != null) {
                Intent intent1 = new Intent(intent0);
                if(this.m.a(this, intent1)) {
                    return null;
                }
            }
            this.a(new HistoricalRecord(componentName0, System.currentTimeMillis(), 1.0f));
            return intent0;
        }
    }

    private void c() {
        boolean z = this.l();
        boolean z1 = this.o();
        this.n();
        if(z || z1) {
            this.v();
            this.notifyChanged();
        }
    }

    public static ActivityChooserModel d(Context context0, String s) {
        synchronized(ActivityChooserModel.A) {
            Map map0 = ActivityChooserModel.B;
            ActivityChooserModel activityChooserModel0 = (ActivityChooserModel)map0.get(s);
            if(activityChooserModel0 == null) {
                activityChooserModel0 = new ActivityChooserModel(context0, s);
                map0.put(s, activityChooserModel0);
            }
            return activityChooserModel0;
        }
    }

    public ResolveInfo e(int v) {
        synchronized(this.a) {
            this.c();
        }
        return ((ActivityResolveInfo)this.b.get(v)).a;
    }

    public int f() {
        synchronized(this.a) {
            this.c();
        }
        return this.b.size();
    }

    public int g(ResolveInfo resolveInfo0) {
        synchronized(this.a) {
            this.c();
            List list0 = this.b;
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((ActivityResolveInfo)list0.get(v2)).a == resolveInfo0) {
                    return v2;
                }
            }
            return -1;
        }
    }

    public ResolveInfo h() {
        synchronized(this.a) {
            this.c();
            return !this.b.isEmpty() ? ((ActivityResolveInfo)this.b.get(0)).a : null;
        }
    }

    public int i() {
        synchronized(this.a) {
        }
        return this.h;
    }

    public int j() {
        synchronized(this.a) {
            this.c();
        }
        return this.c.size();
    }

    public Intent k() {
        synchronized(this.a) {
        }
        return this.f;
    }

    private boolean l() {
        if(this.l && this.f != null) {
            this.l = false;
            this.b.clear();
            List list0 = this.d.getPackageManager().queryIntentActivities(this.f, 0);
            int v1 = list0.size();
            for(int v = 0; v < v1; ++v) {
                ActivityResolveInfo activityChooserModel$ActivityResolveInfo0 = new ActivityResolveInfo(((ResolveInfo)list0.get(v)));
                this.b.add(activityChooserModel$ActivityResolveInfo0);
            }
            return true;
        }
        return false;
    }

    private void m() {
        if(!this.j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if(!this.k) {
            return;
        }
        this.k = false;
        if(!TextUtils.isEmpty(this.e)) {
            new PersistHistoryAsyncTask(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.c), this.e});
        }
    }

    private void n() {
        int v = this.c.size() - this.h;
        if(v <= 0) {
            return;
        }
        this.k = true;
        for(int v1 = 0; v1 < v; ++v1) {
            HistoricalRecord activityChooserModel$HistoricalRecord0 = (HistoricalRecord)this.c.remove(0);
        }
    }

    private boolean o() {
        if(this.i && this.k && !TextUtils.isEmpty(this.e)) {
            this.i = false;
            this.j = true;
            this.p();
            return true;
        }
        return false;
    }

    private void p() {
        List list0;
        XmlPullParser xmlPullParser0;
        FileInputStream fileInputStream0;
        try {
            fileInputStream0 = this.d.openFileInput(this.e);
        }
        catch(FileNotFoundException unused_ex) {
            return;
        }
        try {
            xmlPullParser0 = Xml.newPullParser();
            xmlPullParser0.setInput(fileInputStream0, "UTF-8");
            for(int v = 0; v != 1 && v != 2; v = xmlPullParser0.next()) {
            }
            if(!"historical-records".equals(xmlPullParser0.getName())) {
                throw new XmlPullParserException("Share records file does not start with historical-records tag.");
            }
            list0 = this.c;
            list0.clear();
            while(true) {
            label_13:
                int v1 = xmlPullParser0.next();
                if(v1 == 1) {
                    break;
                }
                goto label_17;
            }
        }
        catch(XmlPullParserException xmlPullParserException0) {
            goto label_27;
        }
        catch(IOException iOException0) {
            goto label_30;
        }
        catch(Throwable throwable0) {
            goto label_35;
        }
        if(fileInputStream0 != null) {
            goto label_32;
        label_17:
            if(v1 == 3 || v1 == 4) {
                goto label_13;
            }
            try {
                try {
                    if(!"historical-record".equals(xmlPullParser0.getName())) {
                        throw new XmlPullParserException("Share records file not well-formed.");
                    }
                    list0.add(new HistoricalRecord(xmlPullParser0.getAttributeValue(null, "activity"), Long.parseLong(xmlPullParser0.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParser0.getAttributeValue(null, "weight"))));
                    goto label_13;
                }
                catch(XmlPullParserException xmlPullParserException0) {
                }
                catch(IOException iOException0) {
                    goto label_30;
                }
            label_27:
                Log.e("ActivityChooserModel", "Error reading historical recrod file: " + this.e, xmlPullParserException0);
                if(fileInputStream0 != null) {
                    goto label_32;
                }
                return;
            label_30:
                Log.e("ActivityChooserModel", "Error reading historical recrod file: " + this.e, iOException0);
                if(fileInputStream0 != null) {
                    goto label_32;
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_35;
            }
            try {
            label_32:
                fileInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        return;
    label_35:
        if(fileInputStream0 != null) {
            try {
                fileInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
    }

    public void q(ActivitySorter activityChooserModel$ActivitySorter0) {
        synchronized(this.a) {
            if(this.g == activityChooserModel$ActivitySorter0) {
                return;
            }
            this.g = activityChooserModel$ActivitySorter0;
            if(this.v()) {
                this.notifyChanged();
            }
        }
    }

    public void r(int v) {
        synchronized(this.a) {
            this.c();
            ActivityResolveInfo activityChooserModel$ActivityResolveInfo0 = (ActivityResolveInfo)this.b.get(v);
            ActivityResolveInfo activityChooserModel$ActivityResolveInfo1 = (ActivityResolveInfo)this.b.get(0);
            float f = activityChooserModel$ActivityResolveInfo1 == null ? 1.0f : activityChooserModel$ActivityResolveInfo1.b - activityChooserModel$ActivityResolveInfo0.b + 5.0f;
            this.a(new HistoricalRecord(new ComponentName(activityChooserModel$ActivityResolveInfo0.a.activityInfo.packageName, activityChooserModel$ActivityResolveInfo0.a.activityInfo.name), System.currentTimeMillis(), f));
        }
    }

    public void s(int v) {
        synchronized(this.a) {
            if(this.h == v) {
                return;
            }
            this.h = v;
            this.n();
            if(this.v()) {
                this.notifyChanged();
            }
        }
    }

    public void t(Intent intent0) {
        synchronized(this.a) {
            if(this.f == intent0) {
                return;
            }
            this.f = intent0;
            this.l = true;
            this.c();
        }
    }

    public void u(OnChooseActivityListener activityChooserModel$OnChooseActivityListener0) {
        synchronized(this.a) {
            this.m = activityChooserModel$OnChooseActivityListener0;
        }
    }

    private boolean v() {
        if(this.g != null && this.f != null && !this.b.isEmpty() && !this.c.isEmpty()) {
            ActivitySorter activityChooserModel$ActivitySorter0 = this.g;
            Intent intent0 = this.f;
            List list0 = DesugarCollections.unmodifiableList(this.c);
            activityChooserModel$ActivitySorter0.a(intent0, this.b, list0);
            return true;
        }
        return false;
    }
}

