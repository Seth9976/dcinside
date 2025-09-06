package bolts;

import j..util.DesugarCollections;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a extends Exception {
    private List a;
    private static final long b = 1L;
    private static final String c = "There were multiple errors.";

    public a(String s, List list0) {
        super(s, (list0 == null || list0.size() <= 0 ? null : ((Throwable)list0.get(0))));
        this.a = DesugarCollections.unmodifiableList(list0);
    }

    public a(String s, Throwable[] arr_throwable) {
        this(s, Arrays.asList(arr_throwable));
    }

    public a(List list0) {
        this("There were multiple errors.", list0);
    }

    @Deprecated
    public Throwable[] a() {
        return (Throwable[])this.a.toArray(new Throwable[this.a.size()]);
    }

    @Deprecated
    public List b() {
        List list0 = new ArrayList();
        List list1 = this.a;
        if(list1 == null) {
            return list0;
        }
        for(Object object0: list1) {
            Throwable throwable0 = (Throwable)object0;
            if(throwable0 instanceof Exception) {
                list0.add(((Exception)throwable0));
            }
            else {
                list0.add(new Exception(throwable0));
            }
        }
        return list0;
    }

    public List c() {
        return this.a;
    }

    @Override
    public void printStackTrace(PrintStream printStream0) {
        super.printStackTrace(printStream0);
        int v = -1;
        for(Object object0: this.a) {
            printStream0.append("\n");
            printStream0.append("  Inner throwable #");
            ++v;
            printStream0.append(Integer.toString(v));
            printStream0.append(": ");
            ((Throwable)object0).printStackTrace(printStream0);
            printStream0.append("\n");
        }
    }

    @Override
    public void printStackTrace(PrintWriter printWriter0) {
        super.printStackTrace(printWriter0);
        int v = -1;
        for(Object object0: this.a) {
            printWriter0.append("\n");
            printWriter0.append("  Inner throwable #");
            ++v;
            printWriter0.append(Integer.toString(v));
            printWriter0.append(": ");
            ((Throwable)object0).printStackTrace(printWriter0);
            printWriter0.append("\n");
        }
    }
}

