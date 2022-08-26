package CubeSolver;

import java.util.HashMap;
import java.util.Map;

public class MoveMaps {

    public static Map<String,String> rMap = new HashMap<>();
    public static Map<String,String> rPrimeMap = new HashMap<>();
    public static Map<String,String> r2Map = new HashMap<>();

    public static Map<String,String> uMap = new HashMap<>();
    public static Map<String,String> uPrimeMap = new HashMap<>();
    public static Map<String,String> u2Map = new HashMap<>();

    public static Map<String,String> fMap = new HashMap<>();
    public static Map<String,String> fPrimeMap = new HashMap<>();
    public static Map<String,String> f2Map = new HashMap<>();

    public static Map<String,String> lMap = new HashMap<>();
    public static Map<String,String> lPrimeMap = new HashMap<>();
    public static Map<String,String> l2Map = new HashMap<>();

    public static Map<String,String> dMap = new HashMap<>();
    public static Map<String,String> dPrimeMap = new HashMap<>();
    public static Map<String,String> d2Map = new HashMap<>();

    public static Map<String,String> bMap = new HashMap<>();
    public static Map<String,String> bPrimeMap = new HashMap<>();
    public static Map<String,String> b2Map = new HashMap<>();

    static {

        rMap.put("UB","UB"); rMap.put("UR","BR"); rMap.put("UF","UF"); rMap.put("UL","UL");
        rMap.put("LU","LU"); rMap.put("LF","LF"); rMap.put("LD","LD"); rMap.put("LB","LB");
        rMap.put("FU","FU"); rMap.put("FR","UR"); rMap.put("FD","FD"); rMap.put("FL","FL");
        rMap.put("RU","RB"); rMap.put("RB","RD"); rMap.put("RD","RF"); rMap.put("RF","RU");
        rMap.put("BU","BU"); rMap.put("BL","BL"); rMap.put("BD","BD"); rMap.put("BR","DR");
        rMap.put("DF","DF"); rMap.put("DR","FR"); rMap.put("DB","DB"); rMap.put("DL","DL");

        rMap.put("UBL","UBL"); rMap.put("UBR","BDR"); rMap.put("UFR","BUR"); rMap.put("UFL","UFL");
        rMap.put("LUB","LUB"); rMap.put("LUF","LUF"); rMap.put("LDF","LDF"); rMap.put("LDB","LDB");
        rMap.put("FUL","FUL"); rMap.put("FUR","UBR"); rMap.put("FDR","UFR"); rMap.put("FDL","FDL");
        rMap.put("RUF","RUB"); rMap.put("RUB","RDB"); rMap.put("RDB","RDF"); rMap.put("RDF","RUF");
        rMap.put("BUR","DBR"); rMap.put("BUL","BUL"); rMap.put("BDL","BDL"); rMap.put("BDR","DFR");
        rMap.put("DFL","DFL"); rMap.put("DFR","FUR"); rMap.put("DBR","FDR"); rMap.put("DBL","DBL");

        rPrimeMap.put("UB","UB"); rPrimeMap.put("UR","FR"); rPrimeMap.put("UF","UF"); rPrimeMap.put("UL","UL");
        rPrimeMap.put("LU","LU"); rPrimeMap.put("LF","LF"); rPrimeMap.put("LD","LD"); rPrimeMap.put("LB","LB");
        rPrimeMap.put("FU","FU"); rPrimeMap.put("FR","DR"); rPrimeMap.put("FD","FD"); rPrimeMap.put("FL","FL");
        rPrimeMap.put("RU","RF"); rPrimeMap.put("RB","RU"); rPrimeMap.put("RD","RB"); rPrimeMap.put("RF","RD");
        rPrimeMap.put("BU","BU"); rPrimeMap.put("BL","BL"); rPrimeMap.put("BD","BD"); rPrimeMap.put("BR","UR");
        rPrimeMap.put("DF","DF"); rPrimeMap.put("DR","BR"); rPrimeMap.put("DB","DB"); rPrimeMap.put("DL","DL");

        rPrimeMap.put("UBL","UBL"); rPrimeMap.put("UBR","FUR"); rPrimeMap.put("UFR","FDR"); rPrimeMap.put("UFL","UFL");
        rPrimeMap.put("LUB","LUB"); rPrimeMap.put("LUF","LUF"); rPrimeMap.put("LDF","LDF"); rPrimeMap.put("LDB","LDB");
        rPrimeMap.put("FUL","FUL"); rPrimeMap.put("FUR","DFR"); rPrimeMap.put("FDR","DBR"); rPrimeMap.put("FDL","FDL");
        rPrimeMap.put("RUF","RDF"); rPrimeMap.put("RUB","RUF"); rPrimeMap.put("RDB","RUB"); rPrimeMap.put("RDF","RDB");
        rPrimeMap.put("BUR","UFR"); rPrimeMap.put("BUL","BUL"); rPrimeMap.put("BDL","BDL"); rPrimeMap.put("BDR","UBR");
        rPrimeMap.put("DFL","DFL"); rPrimeMap.put("DFR","BDR"); rPrimeMap.put("DBR","BUR"); rPrimeMap.put("DBL","DBL");

        r2Map.put("UB","UB"); r2Map.put("UR","DR"); r2Map.put("UF","UF"); r2Map.put("UL","UL");
        r2Map.put("LU","LU"); r2Map.put("LF","LF"); r2Map.put("LD","LD"); r2Map.put("LB","LB");
        r2Map.put("FU","FU"); r2Map.put("FR","BR"); r2Map.put("FD","FD"); r2Map.put("FL","FL");
        r2Map.put("RU","RD"); r2Map.put("RB","RF"); r2Map.put("RD","RU"); r2Map.put("RF","RB");
        r2Map.put("BU","BU"); r2Map.put("BL","BL"); r2Map.put("BD","BD"); r2Map.put("BR","FR");
        r2Map.put("DF","DF"); r2Map.put("DR","UR"); r2Map.put("DB","DB"); r2Map.put("DL","DL");

        r2Map.put("UBL","UBL"); r2Map.put("UBR","DFR"); r2Map.put("UFR","DBR"); r2Map.put("UFL","UFL");
        r2Map.put("LUB","LUB"); r2Map.put("LUF","LUF"); r2Map.put("LDF","LDF"); r2Map.put("LDB","LDB");
        r2Map.put("FUL","FUL"); r2Map.put("FUR","BDR"); r2Map.put("FDR","BUR"); r2Map.put("FDL","FDL");
        r2Map.put("RUF","RDB"); r2Map.put("RUB","RDF"); r2Map.put("RDB","RUF"); r2Map.put("RDF","RUB");
        r2Map.put("BUR","FDR"); r2Map.put("BUL","BUL"); r2Map.put("BDL","BDL"); r2Map.put("BDR","FUR");
        r2Map.put("DFL","DFL"); r2Map.put("DFR","UBR"); r2Map.put("DBR","UFR"); r2Map.put("DBL","DBL");

        uMap.put("UB","UR"); uMap.put("UR","UF"); uMap.put("UF","UL"); uMap.put("UL","UB");
        uMap.put("LU","BU"); uMap.put("LF","LF"); uMap.put("LD","LD"); uMap.put("LB","LB");
        uMap.put("FU","LU"); uMap.put("FR","FR"); uMap.put("FD","FD"); uMap.put("FL","FL");
        uMap.put("RU","FU"); uMap.put("RB","RB"); uMap.put("RD","RD"); uMap.put("RF","RF");
        uMap.put("BU","RU"); uMap.put("BL","BL"); uMap.put("BD","BD"); uMap.put("BR","BR");
        uMap.put("DF","DF"); uMap.put("DR","DR"); uMap.put("DB","DB"); uMap.put("DL","DL");

        uMap.put("UBL","UBR"); uMap.put("UBR","UFR"); uMap.put("UFR","UFL"); uMap.put("UFL","UBL");
        uMap.put("LUB","BUR"); uMap.put("LUF","BUL"); uMap.put("LDF","LDF"); uMap.put("LDB","LDB");
        uMap.put("FUL","LUB"); uMap.put("FUR","LUF"); uMap.put("FDR","FDR"); uMap.put("FDL","FDL");
        uMap.put("RUF","FUL"); uMap.put("RUB","FUR"); uMap.put("RDB","RDB"); uMap.put("RDF","RDF");
        uMap.put("BUR","RUF"); uMap.put("BUL","RUB"); uMap.put("BDL","BDL"); uMap.put("BDR","BDR");
        uMap.put("DFL","DFL"); uMap.put("DFR","DFR"); uMap.put("DBR","DBR"); uMap.put("DBL","DBL");

        uPrimeMap.put("UB","UL"); uPrimeMap.put("UR","UB"); uPrimeMap.put("UF","UR"); uPrimeMap.put("UL","UF");
        uPrimeMap.put("LU","FU"); uPrimeMap.put("LF","LF"); uPrimeMap.put("LD","LD"); uPrimeMap.put("LB","LB");
        uPrimeMap.put("FU","RU"); uPrimeMap.put("FR","FR"); uPrimeMap.put("FD","FD"); uPrimeMap.put("FL","FL");
        uPrimeMap.put("RU","BU"); uPrimeMap.put("RB","RB"); uPrimeMap.put("RD","RD"); uPrimeMap.put("RF","RF");
        uPrimeMap.put("BU","LU"); uPrimeMap.put("BL","BL"); uPrimeMap.put("BD","BD"); uPrimeMap.put("BR","BR");
        uPrimeMap.put("DF","DF"); uPrimeMap.put("DR","DR"); uPrimeMap.put("DB","DB"); uPrimeMap.put("DL","DL");

        uPrimeMap.put("UBL","UFL"); uPrimeMap.put("UBR","UBL"); uPrimeMap.put("UFR","UBR"); uPrimeMap.put("UFL","UFR");
        uPrimeMap.put("LUB","FUL"); uPrimeMap.put("LUF","FUR"); uPrimeMap.put("LDF","LDF"); uPrimeMap.put("LDB","LDB");
        uPrimeMap.put("FUL","RUF"); uPrimeMap.put("FUR","RUB"); uPrimeMap.put("FDR","FDR"); uPrimeMap.put("FDL","FDL");
        uPrimeMap.put("RUF","BUR"); uPrimeMap.put("RUB","BUL"); uPrimeMap.put("RDB","RDB"); uPrimeMap.put("RDF","RDF");
        uPrimeMap.put("BUR","LUB"); uPrimeMap.put("BUL","LUF"); uPrimeMap.put("BDL","BDL"); uPrimeMap.put("BDR","BDR");
        uPrimeMap.put("DFL","DFL"); uPrimeMap.put("DFR","DFR"); uPrimeMap.put("DBR","DBR"); uPrimeMap.put("DBL","DBL");

        u2Map.put("UB","UF"); u2Map.put("UR","UL"); u2Map.put("UF","UB"); u2Map.put("UL","UR");
        u2Map.put("LU","RU"); u2Map.put("LF","LF"); u2Map.put("LD","LD"); u2Map.put("LB","LB");
        u2Map.put("FU","BU"); u2Map.put("FR","FR"); u2Map.put("FD","FD"); u2Map.put("FL","FL");
        u2Map.put("RU","LU"); u2Map.put("RB","RB"); u2Map.put("RD","RD"); u2Map.put("RF","RF");
        u2Map.put("BU","FU"); u2Map.put("BL","BL"); u2Map.put("BD","BD"); u2Map.put("BR","BR");
        u2Map.put("DF","DF"); u2Map.put("DR","DR"); u2Map.put("DB","DB"); u2Map.put("DL","DL");

        u2Map.put("UBL","UFR"); u2Map.put("UBR","UFL"); u2Map.put("UFR","UBL"); u2Map.put("UFL","UBR");
        u2Map.put("LUB","RUF"); u2Map.put("LUF","RUB"); u2Map.put("LDF","LDF"); u2Map.put("LDB","LDB");
        u2Map.put("FUL","BUR"); u2Map.put("FUR","BUL"); u2Map.put("FDR","FDR"); u2Map.put("FDL","FDL");
        u2Map.put("RUF","LUB"); u2Map.put("RUB","LUF"); u2Map.put("RDB","RDB"); u2Map.put("RDF","RDF");
        u2Map.put("BUR","FUL"); u2Map.put("BUL","FUR"); u2Map.put("BDL","BDL"); u2Map.put("BDR","BDR");
        u2Map.put("DFL","DFL"); u2Map.put("DFR","DFR"); u2Map.put("DBR","DBR"); u2Map.put("DBL","DBL");

        fMap.put("UB","UB"); fMap.put("UR","UR"); fMap.put("UF","RF"); fMap.put("UL","UL");
        fMap.put("LU","LU"); fMap.put("LF","UF"); fMap.put("LD","LD"); fMap.put("LB","LB");
        fMap.put("FU","FR"); fMap.put("FR","FD"); fMap.put("FD","FL"); fMap.put("FL","FU");
        fMap.put("RU","RU"); fMap.put("RB","RB"); fMap.put("RD","RD"); fMap.put("RF","DF");
        fMap.put("BU","BU"); fMap.put("BL","BL"); fMap.put("BD","BD"); fMap.put("BR","BR");
        fMap.put("DF","LF"); fMap.put("DR","DR"); fMap.put("DB","DB"); fMap.put("DL","DL");

        fMap.put("UBL","UBL"); fMap.put("UBR","UBR"); fMap.put("UFR","RDF"); fMap.put("UFL","RUF");
        fMap.put("LUB","LUB"); fMap.put("LUF","UFR"); fMap.put("LDF","UFL"); fMap.put("LDB","LDB");
        fMap.put("FUL","FUR"); fMap.put("FUR","FDR"); fMap.put("FDR","FDL"); fMap.put("FDL","FUL");
        fMap.put("RUF","DFR"); fMap.put("RUB","RUB"); fMap.put("RDB","RDB"); fMap.put("RDF","DFL");
        fMap.put("BUR","BUR"); fMap.put("BUL","BUL"); fMap.put("BDL","BDL"); fMap.put("BDR","BDR");
        fMap.put("DFL","LUF"); fMap.put("DFR","LDF"); fMap.put("DBR","DBR"); fMap.put("DBL","DBL");

        fPrimeMap.put("UB","UB"); fPrimeMap.put("UR","UR"); fPrimeMap.put("UF","LF"); fPrimeMap.put("UL","UL");
        fPrimeMap.put("LU","LU"); fPrimeMap.put("LF","DF"); fPrimeMap.put("LD","LD"); fPrimeMap.put("LB","LB");
        fPrimeMap.put("FU","FL"); fPrimeMap.put("FR","FU"); fPrimeMap.put("FD","FR"); fPrimeMap.put("FL","FD");
        fPrimeMap.put("RU","RU"); fPrimeMap.put("RB","RB"); fPrimeMap.put("RD","RD"); fPrimeMap.put("RF","UF");
        fPrimeMap.put("BU","BU"); fPrimeMap.put("BL","BL"); fPrimeMap.put("BD","BD"); fPrimeMap.put("BR","BR");
        fPrimeMap.put("DF","RF"); fPrimeMap.put("DR","DR"); fPrimeMap.put("DB","DB"); fPrimeMap.put("DL","DL");

        fPrimeMap.put("UBL","UBL"); fPrimeMap.put("UBR","UBR"); fPrimeMap.put("UFR","LUF"); fPrimeMap.put("UFL","LDF");
        fPrimeMap.put("LUB","LUB"); fPrimeMap.put("LUF","DFL"); fPrimeMap.put("LDF","DFR"); fPrimeMap.put("LDB","LDB");
        fPrimeMap.put("FUL","FDL"); fPrimeMap.put("FUR","FUL"); fPrimeMap.put("FDR","FUR"); fPrimeMap.put("FDL","FDR");
        fPrimeMap.put("RUF","UFL"); fPrimeMap.put("RUB","RUB"); fPrimeMap.put("RDB","RDB"); fPrimeMap.put("RDF","UFR");
        fPrimeMap.put("BUR","BUR"); fPrimeMap.put("BUL","BUL"); fPrimeMap.put("BDL","BDL"); fPrimeMap.put("BDR","BDR");
        fPrimeMap.put("DFL","RDF"); fPrimeMap.put("DFR","RUF"); fPrimeMap.put("DBR","DBR"); fPrimeMap.put("DBL","DBL");

        f2Map.put("UB","UB"); f2Map.put("UR","UR"); f2Map.put("UF","DF"); f2Map.put("UL","UL");
        f2Map.put("LU","LU"); f2Map.put("LF","RF"); f2Map.put("LD","LD"); f2Map.put("LB","LB");
        f2Map.put("FU","FD"); f2Map.put("FR","FL"); f2Map.put("FD","FU"); f2Map.put("FL","FR");
        f2Map.put("RU","RU"); f2Map.put("RB","RB"); f2Map.put("RD","RD"); f2Map.put("RF","LF");
        f2Map.put("BU","BU"); f2Map.put("BL","BL"); f2Map.put("BD","BD"); f2Map.put("BR","BR");
        f2Map.put("DF","UF"); f2Map.put("DR","DR"); f2Map.put("DB","DB"); f2Map.put("DL","DL");

        f2Map.put("UBL","UBL"); f2Map.put("UBR","UBR"); f2Map.put("UFR","DFL"); f2Map.put("UFL","DFR");
        f2Map.put("LUB","LUB"); f2Map.put("LUF","RDF"); f2Map.put("LDF","RUF"); f2Map.put("LDB","LDB");
        f2Map.put("FUL","FDR"); f2Map.put("FUR","FDL"); f2Map.put("FDR","FUL"); f2Map.put("FDL","FUR");
        f2Map.put("RUF","LDF"); f2Map.put("RUB","RUB"); f2Map.put("RDB","RDB"); f2Map.put("RDF","LUF");
        f2Map.put("BUR","BUR"); f2Map.put("BUL","BUL"); f2Map.put("BDL","BDL"); f2Map.put("BDR","BDR");
        f2Map.put("DFL","UFR"); f2Map.put("DFR","UFL"); f2Map.put("DBR","DBR"); f2Map.put("DBL","DBL");

        lMap.put("UB","UB"); lMap.put("UR","UR"); lMap.put("UF","UF"); lMap.put("UL","FL");
        lMap.put("LU","LF"); lMap.put("LF","LD"); lMap.put("LD","LB"); lMap.put("LB","LU");
        lMap.put("FU","FU"); lMap.put("FR","FR"); lMap.put("FD","FD"); lMap.put("FL","DL");
        lMap.put("RU","RU"); lMap.put("RB","RB"); lMap.put("RD","RD"); lMap.put("RF","RF");
        lMap.put("BU","BU"); lMap.put("BL","UL"); lMap.put("BD","BD"); lMap.put("BR","BR");
        lMap.put("DF","DF"); lMap.put("DR","DR"); lMap.put("DB","DB"); lMap.put("DL","BL");

        lMap.put("UBL","FUL"); lMap.put("UBR","UBR"); lMap.put("UFR","UFR"); lMap.put("UFL","FDL");
        lMap.put("LUB","LUF"); lMap.put("LUF","LDF"); lMap.put("LDF","LDB"); lMap.put("LDB","LUB");
        lMap.put("FUL","DFL"); lMap.put("FUR","FUR"); lMap.put("FDR","FDR"); lMap.put("FDL","DBL");
        lMap.put("RUF","RUF"); lMap.put("RUB","RUB"); lMap.put("RDB","RDB"); lMap.put("RDF","RDF");
        lMap.put("BUR","BUR"); lMap.put("BUL","UFL"); lMap.put("BDL","UBL"); lMap.put("BDR","BDR");
        lMap.put("DFL","BDL"); lMap.put("DFR","DFR"); lMap.put("DBR","DBR"); lMap.put("DBL","BUL");

        lPrimeMap.put("UB","UB"); lPrimeMap.put("UR","UR"); lPrimeMap.put("UF","UF"); lPrimeMap.put("UL","BL");
        lPrimeMap.put("LU","LB"); lPrimeMap.put("LF","LU"); lPrimeMap.put("LD","LF"); lPrimeMap.put("LB","LD");
        lPrimeMap.put("FU","FU"); lPrimeMap.put("FR","FR"); lPrimeMap.put("FD","FD"); lPrimeMap.put("FL","UL");
        lPrimeMap.put("RU","RU"); lPrimeMap.put("RB","RB"); lPrimeMap.put("RD","RD"); lPrimeMap.put("RF","RF");
        lPrimeMap.put("BU","BU"); lPrimeMap.put("BL","DL"); lPrimeMap.put("BD","BD"); lPrimeMap.put("BR","BR");
        lPrimeMap.put("DF","DF"); lPrimeMap.put("DR","DR"); lPrimeMap.put("DB","DB"); lPrimeMap.put("DL","FL");

        lPrimeMap.put("UBL","BDL"); lPrimeMap.put("UBR","UBR"); lPrimeMap.put("UFR","UFR"); lPrimeMap.put("UFL","BUL");
        lPrimeMap.put("LUB","LDB"); lPrimeMap.put("LUF","LUB"); lPrimeMap.put("LDF","LUF"); lPrimeMap.put("LDB","LDF");
        lPrimeMap.put("FUL","UBL"); lPrimeMap.put("FUR","FUR"); lPrimeMap.put("FDR","FDR"); lPrimeMap.put("FDL","UFL");
        lPrimeMap.put("RUF","RUF"); lPrimeMap.put("RUB","RUB"); lPrimeMap.put("RDB","RDB"); lPrimeMap.put("RDF","RDF");
        lPrimeMap.put("BUR","BUR"); lPrimeMap.put("BUL","DBL"); lPrimeMap.put("BDL","DFL"); lPrimeMap.put("BDR","BDR");
        lPrimeMap.put("DFL","FUL"); lPrimeMap.put("DFR","DFR"); lPrimeMap.put("DBR","DBR"); lPrimeMap.put("DBL","FDL");

        l2Map.put("UB","UB"); l2Map.put("UR","UR"); l2Map.put("UF","UF"); l2Map.put("UL","DL");
        l2Map.put("LU","LD"); l2Map.put("LF","LB"); l2Map.put("LD","LU"); l2Map.put("LB","LF");
        l2Map.put("FU","FU"); l2Map.put("FR","FR"); l2Map.put("FD","FD"); l2Map.put("FL","BL");
        l2Map.put("RU","RU"); l2Map.put("RB","RB"); l2Map.put("RD","RD"); l2Map.put("RF","RF");
        l2Map.put("BU","BU"); l2Map.put("BL","FL"); l2Map.put("BD","BD"); l2Map.put("BR","BR");
        l2Map.put("DF","DF"); l2Map.put("DR","DR"); l2Map.put("DB","DB"); l2Map.put("DL","UL");

        l2Map.put("UBL","DFL"); l2Map.put("UBR","UBR"); l2Map.put("UFR","UFR"); l2Map.put("UFL","DBL");
        l2Map.put("LUB","LDF"); l2Map.put("LUF","LDB"); l2Map.put("LDF","LUB"); l2Map.put("LDB","LUF");
        l2Map.put("FUL","BDL"); l2Map.put("FUR","FUR"); l2Map.put("FDR","FDR"); l2Map.put("FDL","BUL");
        l2Map.put("RUF","RUF"); l2Map.put("RUB","RUB"); l2Map.put("RDB","RDB"); l2Map.put("RDF","RDF");
        l2Map.put("BUR","BUR"); l2Map.put("BUL","FDL"); l2Map.put("BDL","FUL"); l2Map.put("BDR","BDR");
        l2Map.put("DFL","UBL"); l2Map.put("DFR","DFR"); l2Map.put("DBR","DBR"); l2Map.put("DBL","UFL");

        dMap.put("UB","UB"); dMap.put("UR","UR"); dMap.put("UF","UF"); dMap.put("UL","UL");
        dMap.put("LU","LU"); dMap.put("LF","LF"); dMap.put("LD","FD"); dMap.put("LB","LB");
        dMap.put("FU","FU"); dMap.put("FR","FR"); dMap.put("FD","RD"); dMap.put("FL","FL");
        dMap.put("RU","RU"); dMap.put("RB","RB"); dMap.put("RD","BD"); dMap.put("RF","RF");
        dMap.put("BU","BU"); dMap.put("BL","BL"); dMap.put("BD","LD"); dMap.put("BR","BR");
        dMap.put("DF","DR"); dMap.put("DR","DB"); dMap.put("DB","DL"); dMap.put("DL","DF");

        dMap.put("UBL","UBL"); dMap.put("UBR","UBR"); dMap.put("UFR","UFR"); dMap.put("UFL","UFL");
        dMap.put("LUB","LUB"); dMap.put("LUF","LUF"); dMap.put("LDF","FDR"); dMap.put("LDB","FDL");
        dMap.put("FUL","FUL"); dMap.put("FUR","FUR"); dMap.put("FDR","RDB"); dMap.put("FDL","RDF");
        dMap.put("RUF","RUF"); dMap.put("RUB","RUB"); dMap.put("RDB","BDL"); dMap.put("RDF","BDR");
        dMap.put("BUR","BUR"); dMap.put("BUL","BUL"); dMap.put("BDL","LDF"); dMap.put("BDR","LDB");
        dMap.put("DFL","DFR"); dMap.put("DFR","DBR"); dMap.put("DBR","DBL"); dMap.put("DBL","DFL");

        dPrimeMap.put("UB","UB"); dPrimeMap.put("UR","UR"); dPrimeMap.put("UF","UF"); dPrimeMap.put("UL","UL");
        dPrimeMap.put("LU","LU"); dPrimeMap.put("LF","LF"); dPrimeMap.put("LD","BD"); dPrimeMap.put("LB","LB");
        dPrimeMap.put("FU","FU"); dPrimeMap.put("FR","FR"); dPrimeMap.put("FD","LD"); dPrimeMap.put("FL","FL");
        dPrimeMap.put("RU","RU"); dPrimeMap.put("RB","RB"); dPrimeMap.put("RD","FD"); dPrimeMap.put("RF","RF");
        dPrimeMap.put("BU","BU"); dPrimeMap.put("BL","BL"); dPrimeMap.put("BD","RD"); dPrimeMap.put("BR","BR");
        dPrimeMap.put("DF","DL"); dPrimeMap.put("DR","DF"); dPrimeMap.put("DB","DR"); dPrimeMap.put("DL","DB");

        dPrimeMap.put("UBL","UBL"); dPrimeMap.put("UBR","UBR"); dPrimeMap.put("UFR","UFR"); dPrimeMap.put("UFL","UFL");
        dPrimeMap.put("LUB","LUB"); dPrimeMap.put("LUF","LUF"); dPrimeMap.put("LDF","BDL"); dPrimeMap.put("LDB","BDR");
        dPrimeMap.put("FUL","FUL"); dPrimeMap.put("FUR","FUR"); dPrimeMap.put("FDR","LDF"); dPrimeMap.put("FDL","LDB");
        dPrimeMap.put("RUF","RUF"); dPrimeMap.put("RUB","RUB"); dPrimeMap.put("RDB","FDR"); dPrimeMap.put("RDF","FDL");
        dPrimeMap.put("BUR","BUR"); dPrimeMap.put("BUL","BUL"); dPrimeMap.put("BDL","RDB"); dPrimeMap.put("BDR","RDF");
        dPrimeMap.put("DFL","DBL"); dPrimeMap.put("DFR","DFL"); dPrimeMap.put("DBR","DFR"); dPrimeMap.put("DBL","DBR");

        d2Map.put("UB","UB"); d2Map.put("UR","UR"); d2Map.put("UF","UF"); d2Map.put("UL","UL");
        d2Map.put("LU","LU"); d2Map.put("LF","LF"); d2Map.put("LD","RD"); d2Map.put("LB","LB");
        d2Map.put("FU","FU"); d2Map.put("FR","FR"); d2Map.put("FD","BD"); d2Map.put("FL","FL");
        d2Map.put("RU","RU"); d2Map.put("RB","RB"); d2Map.put("RD","LD"); d2Map.put("RF","RF");
        d2Map.put("BU","BU"); d2Map.put("BL","BL"); d2Map.put("BD","FD"); d2Map.put("BR","BR");
        d2Map.put("DF","DB"); d2Map.put("DR","DL"); d2Map.put("DB","DF"); d2Map.put("DL","DR");

        d2Map.put("UBL","UBL"); d2Map.put("UBR","UBR"); d2Map.put("UFR","UFR"); d2Map.put("UFL","UFL");
        d2Map.put("LUB","LUB"); d2Map.put("LUF","LUF"); d2Map.put("LDF","RDB"); d2Map.put("LDB","RDF");
        d2Map.put("FUL","FUL"); d2Map.put("FUR","FUR"); d2Map.put("FDR","BDL"); d2Map.put("FDL","BDR");
        d2Map.put("RUF","RUF"); d2Map.put("RUB","RUB"); d2Map.put("RDB","LDF"); d2Map.put("RDF","LDB");
        d2Map.put("BUR","BUR"); d2Map.put("BUL","BUL"); d2Map.put("BDL","FDR"); d2Map.put("BDR","FDL");
        d2Map.put("DFL","DBR"); d2Map.put("DFR","DBL"); d2Map.put("DBR","DFL"); d2Map.put("DBL","DFR");

        bMap.put("UB","LB"); bMap.put("UR","UR"); bMap.put("UF","UF"); bMap.put("UL","UL");
        bMap.put("LU","LU"); bMap.put("LF","LF"); bMap.put("LD","LD"); bMap.put("LB","DB");
        bMap.put("FU","FU"); bMap.put("FR","FR"); bMap.put("FD","FD"); bMap.put("FL","FL");
        bMap.put("RU","RU"); bMap.put("RB","UB"); bMap.put("RD","RD"); bMap.put("RF","RF");
        bMap.put("BU","BL"); bMap.put("BL","BD"); bMap.put("BD","BR"); bMap.put("BR","BU");
        bMap.put("DF","DF"); bMap.put("DR","DR"); bMap.put("DB","RB"); bMap.put("DL","DL");

        bMap.put("UBL","LDB"); bMap.put("UBR","LUB"); bMap.put("UFR","UFR"); bMap.put("UFL","UFL");
        bMap.put("LUB","DBL"); bMap.put("LUF","LUF"); bMap.put("LDF","LDF"); bMap.put("LDB","DBR");
        bMap.put("FUL","FUL"); bMap.put("FUR","FUR"); bMap.put("FDR","FDR"); bMap.put("FDL","FDL");
        bMap.put("RUF","RUF"); bMap.put("RUB","UBL"); bMap.put("RDB","UBR"); bMap.put("RDF","RDF");
        bMap.put("BUR","BUL"); bMap.put("BUL","BDL"); bMap.put("BDL","BDR"); bMap.put("BDR","BUR");
        bMap.put("DFL","DFL"); bMap.put("DFR","DFR"); bMap.put("DBR","RUB"); bMap.put("DBL","RDB");

        bPrimeMap.put("UB","RB"); bPrimeMap.put("UR","UR"); bPrimeMap.put("UF","UF"); bPrimeMap.put("UL","UL");
        bPrimeMap.put("LU","LU"); bPrimeMap.put("LF","LF"); bPrimeMap.put("LD","LD"); bPrimeMap.put("LB","UB");
        bPrimeMap.put("FU","FU"); bPrimeMap.put("FR","FR"); bPrimeMap.put("FD","FD"); bPrimeMap.put("FL","FL");
        bPrimeMap.put("RU","RU"); bPrimeMap.put("RB","DB"); bPrimeMap.put("RD","RD"); bPrimeMap.put("RF","RF");
        bPrimeMap.put("BU","BR"); bPrimeMap.put("BL","BU"); bPrimeMap.put("BD","BL"); bPrimeMap.put("BR","BD");
        bPrimeMap.put("DF","DF"); bPrimeMap.put("DR","DR"); bPrimeMap.put("DB","LB"); bPrimeMap.put("DL","DL");

        bPrimeMap.put("UBL","RUB"); bPrimeMap.put("UBR","RDB"); bPrimeMap.put("UFR","UFR"); bPrimeMap.put("UFL","UFL");
        bPrimeMap.put("LUB","UBR"); bPrimeMap.put("LUF","LUF"); bPrimeMap.put("LDF","LDF"); bPrimeMap.put("LDB","UBL");
        bPrimeMap.put("FUL","FUL"); bPrimeMap.put("FUR","FUR"); bPrimeMap.put("FDR","FDR"); bPrimeMap.put("FDL","FDL");
        bPrimeMap.put("RUF","RUF"); bPrimeMap.put("RUB","DBR"); bPrimeMap.put("RDB","DBL"); bPrimeMap.put("RDF","RDF");
        bPrimeMap.put("BUR","BDR"); bPrimeMap.put("BUL","BUR"); bPrimeMap.put("BDL","BUL"); bPrimeMap.put("BDR","BDL");
        bPrimeMap.put("DFL","DFL"); bPrimeMap.put("DFR","DFR"); bPrimeMap.put("DBR","LDB"); bPrimeMap.put("DBL","LUB");

        b2Map.put("UB","DB"); b2Map.put("UR","UR"); b2Map.put("UF","UF"); b2Map.put("UL","UL");
        b2Map.put("LU","LU"); b2Map.put("LF","LF"); b2Map.put("LD","LD"); b2Map.put("LB","RB");
        b2Map.put("FU","FU"); b2Map.put("FR","FR"); b2Map.put("FD","FD"); b2Map.put("FL","FL");
        b2Map.put("RU","RU"); b2Map.put("RB","LB"); b2Map.put("RD","RD"); b2Map.put("RF","RF");
        b2Map.put("BU","BD"); b2Map.put("BL","BR"); b2Map.put("BD","BU"); b2Map.put("BR","BL");
        b2Map.put("DF","DF"); b2Map.put("DR","DR"); b2Map.put("DB","UB"); b2Map.put("DL","DL");

        b2Map.put("UBL","DBR"); b2Map.put("UBR","DBL"); b2Map.put("UFR","UFR"); b2Map.put("UFL","UFL");
        b2Map.put("LUB","RDB"); b2Map.put("LUF","LUF"); b2Map.put("LDF","LDF"); b2Map.put("LDB","RUB");
        b2Map.put("FUL","FUL"); b2Map.put("FUR","FUR"); b2Map.put("FDR","FDR"); b2Map.put("FDL","FDL");
        b2Map.put("RUF","RUF"); b2Map.put("RUB","LDB"); b2Map.put("RDB","LUB"); b2Map.put("RDF","RDF");
        b2Map.put("BUR","BDL"); b2Map.put("BUL","BDR"); b2Map.put("BDL","BUR"); b2Map.put("BDR","BUL");
        b2Map.put("DFL","DFL"); b2Map.put("DFR","DFR"); b2Map.put("DBR","UBL"); b2Map.put("DBL","UBR");

    }

}
