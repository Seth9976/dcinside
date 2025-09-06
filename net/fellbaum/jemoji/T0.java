package net.fellbaum.jemoji;

import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;

interface t0 {
    public static final f AB;
    public static final f BB;
    public static final f CB;
    public static final f DB;
    public static final f EB;
    public static final f qB;
    public static final f rB;
    public static final f sB;
    public static final f tB;
    public static final f uB;
    public static final f vB;
    public static final f wB;
    public static final f xB;
    public static final f yB;
    public static final f zB;

    static {
        t0.qB = new f("✉️", "✉️", Collections.singletonList(":envelope:"), Collections.singletonList(":email:"), Collections.singletonList(":envelope:"), false, false, 0.6, M1.a("fully-qualified"), "envelope", d0.g, q1.a9);
        t0.rB = new f("✉", "✉", Collections.emptyList(), Collections.emptyList(), Collections.singletonList(":envelope:"), false, false, 0.6, M1.a("unqualified"), "envelope", d0.g, q1.a9);
        t0.sB = new f("\uD83D\uDCE7", "\uD83D\uDCE7", DesugarCollections.unmodifiableList(Arrays.asList(new String[]{":e_mail:", ":email:"})), Collections.singletonList(":e-mail:"), DesugarCollections.unmodifiableList(Arrays.asList(new String[]{":e-mail:", ":email:"})), false, false, 0.6, M1.a("fully-qualified"), "e-mail", d0.g, q1.a9);
        t0.tB = new f("\uD83D\uDCE8", "\uD83D\uDCE8", Collections.singletonList(":incoming_envelope:"), Collections.singletonList(":incoming_envelope:"), Collections.singletonList(":incoming_envelope:"), false, false, 0.6, M1.a("fully-qualified"), "incoming envelope", d0.g, q1.a9);
        t0.uB = new f("\uD83D\uDCE9", "\uD83D\uDCE9", Collections.singletonList(":envelope_with_arrow:"), Collections.singletonList(":envelope_with_arrow:"), Collections.singletonList(":envelope_with_arrow:"), false, false, 0.6, M1.a("fully-qualified"), "envelope with arrow", d0.g, q1.a9);
        t0.vB = new f("\uD83D\uDCE4", "\uD83D\uDCE4", Collections.singletonList(":outbox_tray:"), Collections.singletonList(":outbox_tray:"), Collections.singletonList(":outbox_tray:"), false, false, 0.6, M1.a("fully-qualified"), "outbox tray", d0.g, q1.a9);
        t0.wB = new f("\uD83D\uDCE5", "\uD83D\uDCE5", Collections.singletonList(":inbox_tray:"), Collections.singletonList(":inbox_tray:"), Collections.singletonList(":inbox_tray:"), false, false, 0.6, M1.a("fully-qualified"), "inbox tray", d0.g, q1.a9);
        t0.xB = new f("\uD83D\uDCE6", "\uD83D\uDCE6", Collections.singletonList(":package:"), Collections.singletonList(":package:"), Collections.singletonList(":package:"), false, false, 0.6, M1.a("fully-qualified"), "package", d0.g, q1.a9);
        t0.yB = new f("\uD83D\uDCEB", "\uD83D\uDCEB", Collections.singletonList(":mailbox:"), Collections.singletonList(":mailbox:"), Collections.singletonList(":mailbox:"), false, false, 0.6, M1.a("fully-qualified"), "closed mailbox with raised flag", d0.g, q1.a9);
        t0.zB = new f("\uD83D\uDCEA", "\uD83D\uDCEA", Collections.singletonList(":mailbox_closed:"), Collections.singletonList(":mailbox_closed:"), Collections.singletonList(":mailbox_closed:"), false, false, 0.6, M1.a("fully-qualified"), "closed mailbox with lowered flag", d0.g, q1.a9);
        t0.AB = new f("\uD83D\uDCEC", "\uD83D\uDCEC", Collections.singletonList(":mailbox_with_mail:"), Collections.singletonList(":mailbox_with_mail:"), Collections.singletonList(":mailbox_with_mail:"), false, false, 0.7, M1.a("fully-qualified"), "open mailbox with raised flag", d0.g, q1.a9);
        t0.BB = new f("\uD83D\uDCED", "\uD83D\uDCED", Collections.singletonList(":mailbox_with_no_mail:"), Collections.singletonList(":mailbox_with_no_mail:"), Collections.singletonList(":mailbox_with_no_mail:"), false, false, 0.7, M1.a("fully-qualified"), "open mailbox with lowered flag", d0.g, q1.a9);
        t0.CB = new f("\uD83D\uDCEE", "\uD83D\uDCEE", Collections.singletonList(":postbox:"), Collections.singletonList(":postbox:"), Collections.singletonList(":postbox:"), false, false, 0.6, M1.a("fully-qualified"), "postbox", d0.g, q1.a9);
        t0.DB = new f("\uD83D\uDDF3️", "\uD83D\uDDF3️", DesugarCollections.unmodifiableList(Arrays.asList(new String[]{":ballot_box:", ":ballot_box_with_ballot:"})), Collections.singletonList(":ballot_box_with_ballot:"), Collections.singletonList(":ballot_box:"), false, false, 0.7, M1.a("fully-qualified"), "ballot box with ballot", d0.g, q1.a9);
        t0.EB = new f("\uD83D\uDDF3", "\uD83D\uDDF3", Collections.emptyList(), Collections.emptyList(), Collections.singletonList(":ballot_box:"), false, false, 0.7, M1.a("unqualified"), "ballot box with ballot", d0.g, q1.a9);
    }
}

