package CubeSolver;

public class CrossSolutions {

    public static String[] edge1w1 = {"B2 ","R2 D ","F2 D2 ","L2 D' ","L' B ","F' D2 ","L B ","B ","F R' D ","R' D ","F' R' D ","L D' ","R B' ","B' ","R' B' ","F D2 ","U R B' ","L' D' ","B R D ","R D ","D2 ","D ","","D' "};
    public static String[] edge2xw1 = {"U' L2 ","U2 L2 ","U L2 ","L2 ","U' F' L ","D F' D' ","L' D F' D' ","D' B D ","F' L ","F2 L ","F L ","L ","U F' L ","D' B' D ","R D F D' ","D F D' ","U2 F' L ","L' ","","D2 R D2 ","F2 U L2 ","R2 U2 L2 ","",""};
    public static String[] edge3vwx1 = {"U R2 ","R2 ","U' R2 ","U2 R2 ","U' F R' ","D' F' D ","","D B D' ","F R' ","R' ","F' R' ","F2 R' ","U F R' ","D B' D' ","R D' F D ","D' F D ","U2 F R' ","D2 L' D2 ","","R ","F2 U' R2 ","","",""};
    public static String[] edge4uvwx1 = {"U2 F2 ","U F2 ","F2 ","U' F2 ","L F' L' ","F' ","","L2 F' L2 ","R U' R' F ","D R' D' ","F' D R' D' ","D' L D ","R' F R ","R2 F R2 ","","F ","R U R' F ","D' L' D ","","D R D' ","","","",""};

    public static String[] edge1w2 = {"B2 ","U' B2 ","U2 B2 ","U B2 ","U2 R B' ","L2 B ","L B ","B ","F' L D' ","R' D ","F L D' ","L D' ","U2 L' B ","B' ","R' B' ","R2 B' ","U' L' B ","L' D' ","B' L' D' ","R D ","D2 ","D ","","D' "};
    public static String[] edge2xw2 = {"D' B2 D ","U2 L2 ","U L2 ","L2 ","U B L' B' ","D F' D' ","L D' B D ","D' B D ","F' L ","D2 R' D2 ","F L ","L ","U F' L ","D' B' D ","R' D' B' D ","D F D' ","B L' B' ","L' ","","B2 L' B2 ","F2 U L2 ","R F2 L ","",""};
    public static String[] edge3vwx2 = {"D B2 D' ","R2 ","D' F2 D ","D2 L2 D2 ","U B' R B ","F U' R2 ","","D B D' ","U2 B' R B ","R' ","F' R' ","D2 L D2 ","U' B' R B ","D B' D' ","R F' U' R2 ","F' U' R2 ","B' R B ","B2 R B2 ","","R ","F D' F' D ","","",""};
    public static String[] edge4uvwx2 = {"D2 B2 D2 ","D R2 D' ","F2 ","D' L2 D ","R U2 R' F ","F' ","","D2 B D2 ","L' U L F' ","D R' D' ","F' D R' D' ","D' L D ","L' U2 L F' ","D2 B' D2 ","","F ","L' U' L F' ","D' L' D ","","D R D' ","","","",""};

    public static String[] edge3uwx1 = {"U2 F2 ","U F2 ","F2 ","U' F2 ","L F' L' ","F' ","","L2 F' L2 ","U' R' F ","D R' D' ","F' R U F2 ","D' L D ","R' F ","R2 F ","R F ","F ","U R' F ","D' L' D ","","R' U F2 ","","R2 U F2 ","",""};
    public static String[] edge3uwx2 = {"D2 B2 D2 ","D R2 D' ","F2 ","D' L2 D ","U2 R' F ","F' ","","D2 B D2 ","U L F' L' ","R U F2 ","F D' L D ","D' L D ","R' F ","D2 B' D2 ","R F ","F ","L' U' L F' ","D' L' D ","","D R D' ","","R D R' D' ","",""};
    public static String[] edge4vuwx1 = {"U R2 ","R2 ","U' R2 ","U2 R2 ","F' U' F R' ","D' F' D ","","D B D' ","F R' F'","R' ","","F2 R' F2 ","F' U F R' ","D B' D' ","R D' F D ","D' F D ","B' R B ","D2 L' D2 ","","R ","","","",""};
    public static String[] edge4vuwx2 = {"D B2 D' ","R2 ","D' F2 D ","D2 L2 D2 ","B U B' R ","D' F' D ","","D B D' ","B U2 B' R ","R' ","","D2 L D2 ","B U' B' R ","D B' D' ","R' D B' D' ","D' F D ","F' U2 F R' ","B2 R B2 ","","R ","","","",""};

    public static String[] edge2vw1 = {"U R2 ","R2 ","U' R2 ","U2 R2 ","U' F R' ","F U' R2 ","L' F U' R2 ","D B D' ","F R' ","R' ","F' R' ","F2 R' ","U F R' ","D B' D' ","R D' F D ","D' F D ","B' R B ","B2 R B2 ","","R ","F2 U' R2 ","","","L2 U2 R2 "};
    public static String[] edge2vw2 = {"D B2 D' ","R2 ","D' F2 D ","D2 L2 D2 ","U B' R B ","D' F' D ","L' D' F' D ","L2 D' F' D ","U2 B' R B ","R' ","F' R' ","D2 L D2 ","U' B' R B ","R2 D' F D ","R' D B' D' ","F' U' R2 ","U2 F R' ","D2 L' D2 ","","R ","F D' F' D ","","","L' D2 L D2 "};
    public static String[] edge3uvw1 = {"U2 F2 ","U F2 ","F2 ","U' F2 ","L F' ","F' ","L' F' ","L2 F' ","U L F' ","D R' D' ","F' D R' D' ","D' L D ","R' F R ","R2 F R2 ","","F ","U' L F' ","L U' F2 ","","D R D' ","","","","L2 U' F2 "};
    public static String[] edge3uvw2 = {"D2 B2 D2 ","D R2 D' ","F2 ","D' L2 D ","U2 R' F R ","F' ","L' F' ","D2 B D2 ","U' R' F R ","D R' D' ","F2 U L F' ","D' L D ","U2 L F' ","D2 B' D2 ","","F ","U R' F R ","D' L' D ","","D R D' ","","","","L' D' L D L' "};

    public static String[] edge4x1 = {"U' L2", "U2 L2", "U L2", "L2", "F U' F' L","D F' D'","L' D F' D'","D' B D","F' L F","D2 R' D2","","L","F U F' L","D' B' D","","D F D'","B L' B'","L'","","D2 R D2","","","",""};
    public static String[] edge4x2 = {"D' B2 D", "D2 R2 D2", "D F2 D'","L2","B' U B L'","F U F' L2","L D' B D","B' U' B L2","B' U2 B L'","F2 L F2","","L","B' U' B L'","B U' B' L2","","F' U F L2","F U2 F' L","L'","","B2 L' B2","","","",""};
    public static String[] edge3xwv1 = {"U' L2 ","U2 L2 ","U L2 ","L2 ","U' F' L ","F U L2 ","L D' B D ","D' B D ","F' L ","F2 L ","F L ","L ","U F' L ","D' B' D ","","D F D' ","U2 F' L ","L' ","","D2 R D2 ","F2 U L2 ","","",""};
    public static String[] edge3xwv2 = {"D' B2 D ","D2 R2 D2 ","D F2 D' ","L2 ","U B L' B' ","D F' D' ","L' D F' D' ","B' U' B L2 ","U2 B L' B' ","D2 R' D2 ","F L ","L ","U' B L' B' ","D' B' D ","","F' U L2 ","B L' B' ","L' ","","B2 L' B2 ","F' D F D' ","","",""};

    public static String[] edge2uw1 = {"U2 F2 "   ,"U F2 "   ,"F2 "        ,"U' F2 "  ,"L F' "   ,"F' ","L' F' "   ,"L2 F' "  ,"U' R' F ","D R' D' ","F' D R' D' ","D' L D "  ,"R' F "   ,"R2 F "};
    public static String[] edge2uw2 = {"D2 B2 D2 ","D R2 D' ","U' D R2 D' ","D' L2 D ","U2 R' F ","F' ","L D2 B D2","D2 B D2 ","U L F' " ,"R U F2 " ,"F D' L D "  ,"L' U' F2 ","U2 L F' ","D2 B' D2 "};



    //wxvu,wxuv,wvux,wvxu

}
