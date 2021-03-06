package in.twizmwaz.cardinal.util;

public enum Protocols {
    VER_1_11_1("1.11.1", 316),
    VER_1_11("1.11.0", 315),
    VER_1_10("1.10.0-2", 210),
    VER_1_10_PRE2("1.10-pre2", 205),
    VER_1_10_PRE1("1.10-pre1", 204),
    VER_16w21b("16w21b", 203),
    VER_16w21a("16w21a", 202),
    VER_16w20a("16w20a", 201),
    VER_1_9_3("1.9.3-4", 110),
    VER_1_9_2("1.9.2", 109),
    VER_1_9_1("1.9.1 / 1.RV-Pre1", 108),
    VER_1_9_0("1.9.0", 107);

    public static final int LATEST = 315;

    private final String name;
    private final int proto;

    Protocols(String name, int proto) {
        this.name = name;
        this.proto = proto;
    }

    public static String getName(int ver) {
        for (Protocols proto : Protocols.values()) {
            if (proto.proto == ver) {
                return proto.name;
            }
        }
        return ver > LATEST ? "Future" : "Unknown";
    }

}
