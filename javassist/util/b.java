package javassist.util;

import com.sun.jdi.Bootstrap;
import com.sun.jdi.ReferenceType;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.connect.AttachingConnector;
import com.sun.jdi.connect.Connector.Argument;
import com.sun.jdi.connect.Connector;
import com.sun.jdi.connect.IllegalConnectorArgumentsException;
import com.sun.jdi.event.EventIterator;
import com.sun.jdi.event.EventSet;
import com.sun.jdi.event.MethodEntryEvent;
import com.sun.jdi.request.EventRequest;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.MethodEntryRequest;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public class b {
    private VirtualMachine a;
    private MethodEntryRequest b;
    private Map c;
    private c d;
    private static final String e = "localhost";
    private static final String f;

    static {
        b.f = "javassist.util.c";
    }

    public b(int v) throws IOException, IllegalConnectorArgumentsException {
        this(Integer.toString(v));
    }

    public b(String s) throws IOException, IllegalConnectorArgumentsException {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = new c();
        AttachingConnector attachingConnector0 = (AttachingConnector)this.b("com.sun.jdi.SocketAttach");
        Map map0 = attachingConnector0.defaultArguments();
        ((Connector.Argument)map0.get("hostname")).setValue("localhost");
        ((Connector.Argument)map0.get("port")).setValue(s);
        VirtualMachine virtualMachine0 = attachingConnector0.attach(map0);
        this.a = virtualMachine0;
        this.b = b.d(virtualMachine0.eventRequestManager(), "javassist.util.c");
    }

    private void a(EventRequestManager eventRequestManager0, MethodEntryRequest methodEntryRequest0) {
        eventRequestManager0.deleteEventRequest(((EventRequest)methodEntryRequest0));
    }

    private Connector b(String s) throws IOException {
        for(Object object0: Bootstrap.virtualMachineManager().allConnectors()) {
            Connector connector0 = (Connector)object0;
            if(connector0.name().equals(s)) {
                return connector0;
            }
            if(false) {
                break;
            }
        }
        throw new IOException("Not found: " + s);
    }

    void c() {
        this.a.redefineClasses(this.c);
        this.c = null;
    }

    private static MethodEntryRequest d(EventRequestManager eventRequestManager0, String s) {
        MethodEntryRequest methodEntryRequest0 = eventRequestManager0.createMethodEntryRequest();
        methodEntryRequest0.addClassFilter(s);
        methodEntryRequest0.setSuspendPolicy(1);
        return methodEntryRequest0;
    }

    public void e(String s, byte[] arr_b) {
        ReferenceType referenceType0 = this.i(s);
        HashMap hashMap0 = new HashMap();
        hashMap0.put(referenceType0, arr_b);
        this.g(hashMap0, s);
    }

    public void f(Map map0) {
        HashMap hashMap0 = new HashMap();
        String s = null;
        for(Object object0: map0.entrySet()) {
            String s1 = (String)((Map.Entry)object0).getKey();
            hashMap0.put(this.i(s1), ((Map.Entry)object0).getValue());
            s = s1;
        }
        if(s != null) {
            this.g(hashMap0, s + " etc.");
        }
    }

    private void g(Map map0, String s) {
        synchronized(this.d) {
            this.h();
            this.c = map0;
            this.b.enable();
            this.b.disable();
            if(this.c == null) {
                return;
            }
            this.c = null;
        }
        throw new RuntimeException("failed to reload: " + s);
    }

    private void h() {
        class a extends Thread {
            final b a;

            private void a(Throwable throwable0) {
                PrintStream printStream0 = System.err;
                printStream0.print("Exception in thread \"HotSwap\" ");
                throwable0.printStackTrace(printStream0);
            }

            @Override
            public void run() {
                EventSet eventSet0 = null;
                try {
                    eventSet0 = b.this.j();
                    EventIterator eventIterator0 = eventSet0.eventIterator();
                    while(true) {
                    label_3:
                        if(!eventIterator0.hasNext()) {
                            goto label_11;
                        }
                        if(eventIterator0.nextEvent() instanceof MethodEntryEvent) {
                            b.this.c();
                            goto label_11;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    this.a(throwable0);
                    goto label_11;
                }
                goto label_3;
            label_11:
                if(eventSet0 != null) {
                    try {
                        eventSet0.resume();
                    }
                    catch(Throwable throwable1) {
                        this.a(throwable1);
                    }
                }
            }
        }

        new a(this).start();
    }

    private ReferenceType i(String s) {
        List list0 = this.a.classesByName(s);
        if(list0 == null || list0.isEmpty()) {
            throw new RuntimeException("no such class: " + s);
        }
        return (ReferenceType)list0.get(0);
    }

    EventSet j() throws InterruptedException {
        return this.a.eventQueue().remove();
    }
}

