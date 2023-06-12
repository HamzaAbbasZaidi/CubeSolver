package CubeSolver;

public class F2LSolutions {

    // Only important for executing, the print version will be used for comparing
    public static String[] pair1v1 =      {"R2 U2 R' U' R U' R2 ","R U R2 F R F' "    ,"F U2 F' R U' R' "  ,"L U2 L' U R U R' "    ,"B' R B R' F' U' F "       ,"F' L F L' F' U' F "     ,"F' L U' L' F "      ,"F' U' F2 R' F' R "     ,"U2 R2 U R2 U R2 U2 R2 "  ,"U' F U' F2 U F "     ,"U F' U2 F2 R' F' "       ,"R B' R' B R U R' "           ,"U R' F R F' R U' R' " ,"U2 F' U2 F U F' U' F "     ,"U2 R2 D B2 D' R2"      ,"U R' U R2 U' R' ","U R U2 R' U' R U R' ","U' R2 U2 R' U' R U' R2 ","U' R U R2 F R F' "   ,"L U2 L' R U2 R' "   ,"R' F' U' F2 R F' "        ,"U' F' L F L' F' U' F "    ,"U' F' L U' L' F "          ,"F' U2 F2 R' F' R "      ,"U R2 U R2 U R2 U2 R2 "       ,"U2 F2 R' F2 R "       ,"U F' U2 F U F' U' F "     ,"U B' R B2 U' B' U2 R' "     ,"R' F R F' R U' R' ","U' F2 U2 F U F' U F2 "     ,"U R2 D B2 D' R2 "          ,"R' U R2 U' R' ","U R U2 R2 F' R F' "   ,"R U2 R' U' R U R' "     ,"U2 R2 U2 R' U' R U' R2 ","L U L' R U2 R' "   ,"U' F' U2 F2 R' F' R "     ,"L F' L2 U L U2 F "         ,"U2 F' L U' L' F "      ,"F' U2 F U F' U' F "     ,"R2 U R2 U R2 U2 R2 "         ,"U F2 R' F2 R "      ,"U2 F2 U2 F U F' U F2 "     ,"B' R B2 U' B' U2 R' "      ,"R U' R B' R' B R' "   ,"L F' L' U2 L F L' "    ,"R2 D B2 D' R2 "        ,"U' R' U R2 U' R' ","U R U R2 F R F' "   ,"R U2 R2 F R F' "   ,"U' R U2 R' U' R U R' ","U R2 U2 R' U' R U' R2 "     ,"U' F' U2 F U F' U' F "     ,"U' L F' L2 U L U2 F "     ,"U F' L U' L' F "      ,"U B' R B R' F' U' F "     ,"U' R2 U R2 U R2 U2 R2 ","F2 R' F2 R ","U F' U' F2 R' F' R "     ,"U' B' R B2 U' B' U2 R' "     ,"F R' F' R F' U F "     ,"U2 F' U2 F2 R' F' R "     ,"U' R2 D B2 D' R2 ","U2 R' U R2 U' R' ","U2 R' U2 R2 U R' ","R U' R' U' R U R'","U2 R U R' ","U R U' R' U R U R' ","L U' L' F' U' F "     , "L' U L F' U2 F "     , "U B' U' B U R U R' "     ,"L' U2 L F' U2 F "     ,"D R' U R D' ","L' U' L U2 R U R' ","L' U' L F' U2 F "     ,"U2 F D R D' F' "    ,"F' U' F U R U' R' ","F' U2 F "     ,"U L U L' R U R' ","U2 R' U' R2 U R' ", "L U2 L' R U' R' ","L U L' R U' R' ","R U' R' ","L' U L U R U R' ","F' U F U' F' U' F "     ,"U' R' D' F' D R ","L U L' U' F' U' F "  ,"U' F U2 F2 U' F "     ,"D' L' U' L D ","U L' U' L U2 R U R' " ,"F' U' F U' F' U' F "   ,"U' R' U R U' F' U F "     ,"F' U' F U' R U R' ","F' U' F U F' U2 F "     ,"L U2 L' U' R U R' ","U' R' U' R2 U R' ","U2 L' R U' R' L ","U L' R U' R' L ","L' R U' R' L ","U' L' R U' R' L ","L' U' L F' U' F "     ,"L' U' L R' U R F' U' F "      ,"F U F2 L U' L' F ","U L' U' L F' U' F "     ,"L' U2 L D R' U' R D' ","F2 U F' U F U2 F U F "      ,"U2 L' U' L F' U' F "     ,"F' D R' U' R D' U2 F ","R' F R U' F' R U' R' ","U' L' U' L F' U' F "     ,"L U' L2 R U' R' L ","F U2 F' R2 F R2 F' ","U' L U L' U R U R' ","U2 L U L' U R U R' ","U L U L' U R U R' ","L U L' U R U R' ","U L F' U2 F L' "     ,"B' U B F U F' U R U R' "     ,"L U' L' F' U' F2 R' F' R "     ,"U2 L F' U2 F L' "     ,"L U2 L' D' L' U L D ","L U L2 U' L R U' R' ","U' L F' U2 F L' "     ,"R' U' R L F' U2 F L' "     ,"R U' R' L F' U2 F L' "     ,"L F' U2 F L' "     ,"L U L' R U' R' U R U R' ","L U' L' U R2 F R2 F' ","U' R' U R2 U R' ","U' R U R' ","L U' L' U' R U R' ","U' R' U2 R2 U R' ","U2 F' U F "   ,"U L' U L F' U2 F "     ,"U' B' U' B R U2 R'"      ,"F U' F' U F' U' F "     ,"D R' U2 R D' ","U L' U' L U2 R U R' ","F' U2 F U F' U2 F "   ,"U' R' U R U' F' U F "     ,"F' U' F U' R U R' ","F' U' F U F' U2 F "     ,"U2 L U L' R U R' ","U' R' U' R2 U R' ","U' R U R' U' R U2 R' ","U R U' R' ","F' U F U2 R U R' "     ,"U' R U2 R' U' R U2 R' ","F' U' F "     ,"R' D' F' D R ","L U L' F' U2 F "   ,"U F' U F U' F' U' F "     ,"U' D R' U' R D' ","F U F2 U' F "     ,"F U2 F2 U' F "   ,"R' U2 R F' U' F ","U' R U R' U F' U' F ","F U' F2 U' F "     ,"U L U' L' R U' R' ","U2 R U R2 U' R2 U R' ","U R U' R2 F R F' ","R U' R2 F R F' ","U' R U' R2 F R F' ","U2 R U' R2 F R F' ","U R U' R' F' U' F ","R U' R2 D' F' D R "   ,"L U L' R U' R' F' U' F ","F' U' F U F' U' F "     ,"R2 U2 R' U' R U' R' U2 R' ","R U R' F2 R' F2 R ","U' R U' R' F' U' F ","R U' R2 U2 R F' U' F ","L F' L' U2 L F L' R U R' "    ,"R U' R' F' U' F ","R U' R' U L U' L' R U' R' ","R U R' U2 R2 F R2 F' ","L' U L U' R U R' ","U' L' U L U' R U R' ","U2 L' U L U' R U R' ","U L' U L U' R U R' ","L' U L U2 F' U F "     ,"L' U L F' U' F U F' U2 F "     ,"L U' L' U F U2 F2 U F "     ,"U F U2 F2 U F "     ,"L' U L D R' U2 R D ","L' U L2 U L' U' R U R' ","U2 F U2 F2 U F "     ,"L' U L U' F D R D' F' ","R' F R U F' U2 R U R' ","U' L' U L U2 F' U F "     ,"L U L2 U L U' R U R' ","L' U2 L R2 F R2 F' ","R U R' ","U' R U' R' U R U R' ","R' U2 R2 U R' ","R' U R2 U R' ","R' U' R U' F' U F "     ,"U2 L' U L F' U2 F "     ,"B' U' B R U2 R' "     ,"F R' F' R ","D' L' U L D ","U' L' U' L R U' R' ","R U' R' U2 F' U' F "     ,"R' U R' U' F' U F "    ,"U F' U' F U' R U R' ","R' U2 R U' F' U F "     ,"U' L U L' R U R' ","R' U' R2 U R' ","U2 R U' R' ","R' U R U' R U R' ","R U2 R' U' R U2 R' ","R U R' U' R U2 R' ","R U' R' U F' U' F "     ,"U R' D' F' D R ","U L U L' F' U2 F "     ,"U F' U' F "     ,"D R' U' R D' ","U F U F2 U' F ","B' U B U F' U' F "          ,"U R' U2 R F' U' F "     ,"R U R' U F' U' F "     ,"U F U2 F2 U' F "     ,"U2 L U' L' R U' R' ","U' R U R2 U' R2 U R' ","R' U2 R2 U' R' ","U' R' U2 R2 U' R' ","U2 R' U2 R2 U' R' ","U R' U2 R2 U' R' ","B U' B' U F' U' F "     ,"R' U2 R U' R' D' F' D R ","R' U R U' F' L U' L' F ","U B U' B' U F' U' F "     ,"R U' R2 U2 R2 U' R' ","R' U R U2 F2 R' F2 R ","R' U' R U2 F' U' F "     ,"R' U R F' U2 F2 R' F' R "  ,"R' U F R F' R U' R' ","U' B U' B' U F' U' F "     ,"L U L' R' U2 R2 U' R' ","R2 U R U' R U2 R2 U' R' ","U R U R' U' R U R' ","R U R' U' R U R' ","U' R U R' U' R U R' ","U2 R U R' U' R U R' ","U' F' U F2 R' F' R "     ,"F U2 R' F' R2 U R' ","R U' R' U2 F' L U' L' F ","F' U F2 R' F' R "     ,"D' L' U L2 F' L' F D ","R U' R' U F2 R' F2 R ","U F' U F2 R' F' R "     ,"R U R' U' F D R D' F' ","R U' R' L F' L' U2 L F L' "    ,"U2 F' U F2 R' F' R "     ,"L U2 L' R U R' U' R U R' ","R U R2 U' R U2 R U' R' ","R U' R' U R U R' ","U R' U2 R2 U R' ","U R' U R2 U R' ","U R U R' ","B' U2 B F' U F "     ,"U' L' U L F' U2 F "     ,"B' U' B U R U R' "     ,"L F' R' F R F L' "  ,"D' L' U2 L D ","L' U' L R U' R' ","F' U F ","U R' U R F R' F' R ","U' F' U' F U R U' R' ","B U' B' U' F' U' F "     ,"L U L' R U R' ","U R' U' R2 U R' ","B' U B R U R' "     ,"U' L U2 L' R U' R' ","U' L U L' R U' R' ","R U2 R' ","U2 F U2 F2 U' F "   ,"U2 R' D' F' D R ","U' L U L' U' F' U' F "    ,"F' U F U F' U' F "     ,"D' F U' F' D ","U2 F U F2 U' F "     ,"U2 F' U' F "     ,"R' U' R U' F' U' F "     ,"R U R' F R' F' R ","U' F' U F U' F' U' F "     ,"U' L U' L' R U' R' ","R U R2 U' R2 U R' ","U' L U' L' R U2 R' ","U2 L U' L' R U2 R' ","U L U' L' R U2 R' ","L U' L' R U2 R' ","U B' U' B U' F' U' F "     ,"L' U' L2 U' L' U2 F' U' F "     ,"L U' L' F' U F U F' U' F "     ,"L U' L' U2 F' U' F "     ,"L U' L' D' F U' F' D ","L U2 L' U F2 R' F2 R ","U' B' U' B U' F' U' F "     ,"R' U R L U' L' U2 F' U' F "     ,"L U' L' R U R' F R' F' R ", "B' U' B U' F' U' F "     ,"L U' L' U' L U L' R U' R' ","L U L' R2 F R2 F' ","U2 R' U R U R U R' ","U R' U R U R U R' ","R' U R U R U R' ","U' R' U R U R U R' ","U2 R' U R F' U F "     ,"R' F U' F' R U R2 F R2 F' ","R' U' R F' L U' L' F ","U' F' B U B' F "     ,"R' U R D' L' U2 L D ","R' U2 R F2 R' F2 R ","R' U R' F' U F "    ,"R' U R L F' R' F R F L' ","F R' F' U R F' U F ","U R' U R F' U F "     ,"R' U R L U L' R U R' ","R' U R2 U R' U R U R' ","U L' U L R U' R' ","L' U L R U' R' ","U' L' U L R U' R' ","U2 L' U L R U' R' ","U F U' F' U F' U2 F "   ,"L' U' L F R' F' R ","L' U' B L B' R U R' ","U2 F U' F' U F' U2 F "     ,"D R U R' D' R U' R' ","L' U L2 U2 L' R U' R' ","U' F U' F' U F' U2 F "     ,"L' U' L R' U R F R' F' R ","F U F' R U R' U' F' U F "     ,"F U' F' U F' U2 F"      ,"D' L U' L' D U2 R U R' ","L' U' L R' U' R2 U R' ","D' R U R' D ","D' U R U' R' D ","D' R U' R' D ","D' R U2 R' D ","D' F' U' F D ","D' F U F' D R U2 R' ","L U' L' D' F R' F' R D ","D' F R' F' R D ","","F2 U F2 U' F2 "     ,"D F' U F D " ,"D B U B' D' R' F R F' ","D' R U R' F R' F' R D ","D' F' U2 F D ","D2 L U' L' D2 U2 R U R' ","R2 U' R2 U R2 ","U' R' U R U' R U2 R' ","U2 R' U R U' R U2 R' ","U R' U R U' R U2 R' ","R' U R U' R U2 R' "  ,"U' B U' B' F' U F "};

    // This will be printed on the screen and contains more ergonomic moves
    public static String[] pair1v1print = {"R2 U2 R' U' R U' R2 ","R U R2' F R F' "   ,"F U2 F' R U' R' "  ,"L U2 L' U R U R' "    ,"y R' F R F' L' U' L y' "  ,"y' R' F R F' R' U' R y ","F' L U' L' F "      ,"y L' U' L2 F' L' F y' ","U2 R2 U R2 U R2 U2 R2 "  ,"y' U' R U' R2 U R y ","y U L' U2 L2 F' L' F y' ","y2 L F' L' F L U L' y2 "     ,"U R' F R F' R U' R' " ,"y' U2 R' U2 R U R' U' R y ","U2 R2 u R2 u' R2 "     ,"U R' U R2 U' R' ","U R U2 R' U' R U R' ","U' R2 U2 R' U' R U' R2 ","U' R U R2 F R F' "   ,"L U2 L' R U2 R' "   ,"R' F' U' F2 R F' "        ,"y' U' R' F R F' R' U' R y","U' F' L U' L' F "          ,"y L' U2 L2 F' L' F y' " ,"U R2 U R2 U R2 U2 R2 "       ,"U2 F2 R' F2 R "       ,"y' U R' U2 R U R' U' R y ","y U R' F R2 U' R' U2 F' y' ","R' F R F' R U' R' ","y U' L2 U2 L U L' U L2 y' ","U R2 u R2 u' R2 "          ,"R' U R2 U' R' ","U R U2 R2 F' R F' "   ,"R U2 R' U' R U R' "     ,"U2 R2 U2 R' U' R U' R2 ","L U L' R U2 R' "   ,"y' U' R' U2 R2 B' R' B y ","L F' L2 U L U2 F "         ,"U2 F' L U' L' F "      ,"y' R' U2 R U R' U' R y ","R2 U R2 U R2 U2 R2 "         ,"U F2 R' F2 R "      ,"y' U2 R2 U2 R U R' U R2 y ","y R' F R2 U' R' U2 F' y' " ,"R U' R B' R' B R' "   ,"Rw U' Rw' U2 Rw U Rw' ","R2 u R2 u' R2 "        ,"U' R' U R2 U' R' ","U R U R2 F R F' "   ,"R U2 R2 F R F' "   ,"U' R U2 R' U' R U R' ","U R2 U2 R' U' R U' R2 "     ,"y' U' R' U2 R U R' U' R y ","U' L F' L2 U L U2 F "     ,"U F' L U' L' F "      ,"y U R' F R F' L' U' L y' ","U' R2 U R2 U R2 U2 R2 ","F2 R' F2 R ","y U L' U' L2 F' L' F y' ","y U' R' F R2 U' R' U2 F' y' ","y L F' L' F L' U L y' ","y U2 L' U2 L2 F' L' F y' ","U' R2 u R2 u' R2 ","U2 R' U R2 U' R' ","U2 R' U2 R2 U R' ","R U' R' U' R U R'","U2 R U R' ","U R U' R' U R U R' ","L U' L' y' R' U' R y ", "L' U L y' R' U2 R y ", "y U R' U' R U y' R U R' ","L' U2 L y' R' U2 R y ","D R' U R D' ","L' U' L U2 R U R' ","L' U' L y' R' U2 R y ","y U2 L u L u' L' "  ,"F' U' F U R U' R' ","y' R' U2 R y ","U L U L' R U R' ","U2 R' U' R2 U R' ", "L U2 L' R U' R' ","L U L' R U' R' ","R U' R' ","L' U L U R U R' ","y' R' U R U' R' U' R y ","U' R' u' R' u R ","L U L' y' R' U' R y ","y' U' R U2 R2 U' R y ","D' L' U' L D "," U L' U' L U2 R U R' ","y' R' U' R U' R' U' R y ","U' R' U R U' y' R' U R y ","F' U' F U' R U R' ","y' R' U' R U R' U2 R y ","L U2 L' U' R U R' ","U' R' U' R2 U R' ","U2 L' R U' R' L ","U L' R U' R' L ","L' R U' R' L ","U' L' R U' R' L ","L' U' L y' R' U' R y ","L' U' L R' U' R y' R' U' R y ","F U F2 L U' L' F ","U L' U' L y' R' U' R y ","L' U2 L D R' U' R D' ","y' R2 U R' U R U2 R U R y' ","U2 L' U' L y' R' U' R y ","F' D R' U' R D' U2 F ","R' F R U' F' R U' R' ","U' L' U' L y' R' U' R y ","L U' L2 R U' R' L ","F U2 F' R2 F R2 F' ","U' L U L' U R U R' ","U2 L U L' U R U R' ","U L U L' U R U R' ","L U L' U R U R' ","y U F R' U2 R F' y' ","y' L' U L R U R' U y R U R' ","L U' L' y L' U' L2 F' L' F y' ","y' U2 F R' U2 R F' y ","L U2 L' D' L' U L D ","L U L2 U' L R U' R' ","y' U' F R' U2 R F' y ","R' U' R y' F R' U2 R F' y ","R U' R' y' F R' U2 R F' y ","y' F R' U2 R F' y ","L U L' R U' R' U R U R' ","L U' L' U R2 F R2 F' ","U' R' U R2 U R' ","U' R U R' ","L U' L' U' R U R' ","U' R' U2 R2 U R' ","y' U2 R' U R ","U L' U L y' R' U2 R y ","y' U' L' U' L y R U2 R' ","y' R U' R' U R' U' R y ","D R' U2 R D' ","U L' U' L U2 R U R' ","y' R' U2 R U R' U2 R ","U' R' U R U' y' R' U R y ","F' U' F U' R U R' ","y' R' U' R U R' U2 R y ","U2 L U L' R U R' ","U' R' U' R2 U R' ","U' R U R' U' R U2 R' ","U R U' R' ","y' R' U R U2 y R U R' ","U' R U2 R' U' R U2 R' ","y' R' U' R y ","R' u' R' u R ","L U L' y' R' U2 R ","y' U R' U R U' R' U' R y ","U' D R' U' R D' ","y' R U R2 U' R y ","y' R U2 R2 U' R ","R' U2 R F' U' F ","U' R U R' U F' U' F ","y' R U' R2 U' R y ","U L U' L' R U' R' ","U2 R U R2 U' R2 U R' ","U R U' R2 F R F' ","R U' R2 F R F' ","U' R U' R2 F R F' ","U2 R U' R2 F R F' ","U R U' R' F' U' F ","R U' R2' u' R' u R "  ,"L U L' R U' R' F' U' F ","y' R' U' R U R' U' R y ","R2 U2 R' U' R U' R' U2 R' ","R U R' F2 R' F2 R ","U' R U' R' F' U' F ","R U' R2 U2 R F' U' F ","Rw U' Rw' U2 Rw U Rw' R U R' ","R U' R' F' U' F ","R U' R' U L U' L' R U' R' ","R U R' U2 R2 F R2 F' ","L' U L U' R U R' ","U' L' U L U' R U R' ","U2 L' U L U' R U R' ","U L' U L U' R U R' ","L' U L U2 y' R' U R y ","L' U L y' R' U' R U R' U2 R y ","L U' L' U y' R U2 R2 U R y ","y' U R U2 R2 U R y ","L' U L D R' U2 R D ","L' U L2 U L' U' R U R' ","y' U2 R U2 R2 U R y ","L' U L U' F D R D' F' ","R' F R U F' U2 R U R' ","U' L' U L U2 y' R' U R y ","L U L2 U L U' R U R' ","L' U2 L R2 F R2 F' ","R U R' ","U' R U' R' U R U R' ","R' U2 R2 U R' ","R' U R2 U R' ","R' U' R U' y' R' U R y ","U2 L' U L y' R' U2 R y ","y R' U' R y' R U2 R' ","F R' F' R ","D' L' U L D ","U' L' U' L R U' R' ","R U' R' U2 y' R' U' R y ","R' U R U' y' R' U R y ","U F' U' F U' R U R' ","R' U2 R U' y' R' U R y ","U' L U L' R U R' ","R' U' R2 U R' ","U2 R U' R' ","R' U R U' R U R' ","R U2 R' U' R U2 R' ","R U R' U' R U2 R' ","R U' R' U y' R' U' R y ","U R' D' F' D R ","U L U L' y' R' U2 R y ","y U L' U' L y' ","D R' U' R D' ","y' U R U R2 U' R y ","y R' U R U L' U' L y' ","U R' U2 R y' R' U' R y ","R U R' U y' R' U' R y ","y' U R U2 R2 U' R y ","U2 L U' L' R U' R' ","U' R U R2 U' R2 U R' ","R' U2 R2 U' R' ","U' R' U2 R2 U' R' ","U2 R' U2 R2 U' R' ","U R' U2 R2 U' R' ","y R U' R' U L' U' L y' ","R' U2 R U' R' D' F' D R ","R' U R U' F' L U' L' F ","y U R U' R' U L' U' L y' ","R U' R2 U2 R2 U' R' ","R' U R U2 F2 R' F2 R ","R' U' R U2 y' R' U' R y ","R' U R y L' U2 L' F' L' F ","R' U F R F' R U' R' ","y U' R U' R' U L' U' L y' ","L U L' R' U2 R2 U' R' ","R2 U R U' R U2 R2 U' R' ","U R U R' U' R U R' ","R U R' U' R U R' ","U' R U R' U' R U R' ","U2 R U R' U' R U R' ","y U' L' U L2 F' L' F y' ","F U2 R' F' R2 U R' ","R U' R' U2 F' L U' L' F ","y L' U L2 F' L' F y' ","D' L' U L2 F' L' F D ","R U' R' U F2 R' F2 R ","y U L' U L2 F' L' F y' ","R U R' U' F D R D' F' ","R U' R' Rw U' Rw' U2 Rw U Rw' ","y U2 L' U L2 F' L' F y' ","L U2 L' R U R' U' R U R' ","R U R2 U' R U2 R U' R' ","R U' R' U R U R' ","U R' U2 R2 U R' ","U R' U R2 U R' ","U R U R' ","y R' U2 R L' U L y' ","U' L' U L y' R' U2 R y ","y R' U' R U y' R U R' ","r U' R' U R U r' "  ,"D' L' U2 L D ","L' U' L R U' R' ","F' U F ","U R' U R F R' F' R ","U' F' U' F U R U' R' ","y R U' R' U' L' U' L y' ","L U L' R U R' ","U R' U' R2 U R' ","y R' U R y' R U R' ","U' L U2 L' R U' R' ","U' L U L' R U' R' ","R U2 R' ","y' U2 R U2 R2 U' R ","U2 R' D' F' D R ","U' L U L' U' y' R' U' 'R ","y' R' U R U R' U' R y ","u' R U' R' u ","y' U2 R U R2 U' R y ","y' U2 R' U' R y ","R' U' R U' y' R' U' R y ","R U R' F R' F' R ","y' U' R' U R U' R' U' R y ","U' L U' L' R U' R' ","R U R2 U' R2 U R' ","U' L U' L' R U2 R' ","U2 L U' L' R U2 R' ","U L U' L' R U2 R' ","L U' L' R U2 R' ","y U R' U' R U' L' U' L y' ","L' U' L2 U' L' U2 y' R' U' R y ","L U' L' y' R' U R U R' U' R y ","L U' L' U2 y L' U' L y' ","L U' L' u' R U' R' u ","L U2 L' U F2 R' F2 R ","y U' R' U' R U' L' U' L y' ","R' U R L U' L' U2 y' R' U' R y ","L U' L' R U R' F R' F' R ","y R' U' R U' L' U' L y' ","L U' L' U' L U L' R U' R' ","L U L' R2 F R2 F' " ,"U2 R' U R U R U R' ","U R' U R U R U R' ","R' U R U R U R' ","U' R' U R U R U R' ","U2 R' U R y' R' U R y ","R' F U' F' R U R2 F R2 F' ","R' U' R F' L U' L' F ","y U' L' R U R' L y' ","R' U R D' L' U2 L D ","R' U2 R F2 R' F2 R ","R' U R y' R' U R y ","R' U R r U' R' U R U r' ","F R' F' U R F' U F ","U R' U R y' R' U R y ","R' U R L U L' R U R' ","R' U R2 U R' U R U R' ","U L' U L R U' R' ","L' U L R U' R' ","U' L' U L R U' R' ","U2 L' U L R U' R' ","y' U R U' R' U R' U2 R ","L' U' L F R' F' R ","L' U' f U f' R U R' ","y' U2 R U' R' U R' U2 R y ","D R U R' D' R U' R' ","L' U L2 U2 L' R U' R' ","y' U' R U' R' U R' U2 R y ","L' U' L R' U R F R' F' R ","y L U L' F U F' U' L' U L y' ","y' R U' R' U R' U2 R y ","D' L U' L' D U2 R U R' ","L' U' L R' U' R2 U R' ","D' R U R' D ","D' U R U' R' D ","D' R U' R' D ","D' R U2 R' D ","u' R' U' R u ","u' R U R' u R U2 R' ","L U' L' D' F R' F' R D ","D' F R' F' R D ","","y' R2 U R2 U' R2 y ","u L' U L u' ","u R U R' u' R' F R F' ","D' R U R' F R' F' R D ","u' R' U2 R u ","D2 L U' L' D2 U2 R U R' ","R2 U' R2 U R2 ","U' R' U R U' R U2 R' ","U2 R' U R U' R U2 R' ","U R' U R U' R U2 R' ","R' U R U' R U2 R' ","y U' R U' R' L' U L y' "};

    public static String[] pair1v2 =      {"L F' L' F R U R' "   ,"R U R' U R U' R' " ,"U' R U2 R2 F R F' ","U2 R U2 R' U' R U R' ","F2 U2 F U F' U F2 "       ,"U2 L F' L2 U L U2 F' "  ,"R D B' U B D' R' "  ,"F' U' F U' F' U F "    ,"R2 U R2 U R U2 R' U2 R' ","U' F2 R' F2 R "      ,"R' U2 R F' U F "         ,"U2 B' R B2 U' B' U2 R' "     ,"U2 R U' R B' R' B R' ","B' U2 B U' F' U' F "       ,"U2 F2 D' L2 D F2"      ,"U R2 F R2 F' "   ,"B U2 B' R U R' "     ,"U' L F' L' F R U R' "   ,"U' R U R' U R U' R' ","U2 R U2 R2 F R F' " ,"U' F' U' F2 R' F' R "     ,"U L F' L2 U L U2 F "      ,"B' L' B L U2 F' U F "      ,"F' U2 F U' F' U F "     ,"U2 R U' R' U R U' R2 F R F' ","U2 F U' F2 U F "      ,"R' U2 R U2 F' U' F "      ,"U' R B' R' B R U R' "       ,"U R U' R' F' U2 F ","R' F R F' U' F' U' F "     ,"L U' L' U L U' L' R U2 R' ","R2 F R2 F' "   ,"U R U2 R' U R U' R' " ,"R U2 R' U L R U' R' L' ","U2 L F' L' F R U R' "   ,"U2 R U R2 F R F' " ,"L' U2 L U F' U2 F "       ,"U2 F' L F L' F' U' F "     ,"U2 R D B' U B D' R' "  ,"U L' U2 L F' U' F "     ,"U R U' R' U R U' R2 F R F' " ,"U F U' F2 U F "     ,"F U R U' R' F' R U' R' "   ,"B' R B R' U2 F' U' F "     ,"U' R' F R F' R U' R' ","B' U' B F' U2 F "      ,"F2 D' L2 D F2 "        ,"U' R2 F R2 F' "   ,"U R U R' U R U' R' ","R U2 R' U R U' R' ","U L U2 L' U R U R' "  ,"R U' R' U' R U' R2 F R F' " ,"L' U2 L F' U' F "          ,"U F' L F L F' U' F "      ,"U R D B' U B D' R' "  ,};

    public static String[] pair1v2print = {"L F' L' F R U R' "   ,"R U R' U R U' R' " ,"U' R U2 R2 F R F' ","U2 R U2 R' U' R U R' ","y' R2 U2 R U R' U R2 y "  ,"U2 L F' L2 U L U2 F' "  ,"R Uw R' U R Uw' R' ","y' R' U' R U' R' U R y","R2 U R2 U R U2 R' U2 R' ","y U' L2 F' L2 F "    ,"R' U2 R F' U F "         ,"y U2 R' F R2 U' R' U2 F' y' ","U2 R U' R B' R' B R' ","y R' U2 R U' L' U' L y' "  ,"y U2 L2 u' L2 u L2 y' ","U R2' F R2 F' "  ,"y R U2 R' y' R U R' ","U' L F' L' F R U R' "   ,"U' R U R' U R U' R' ","U2 R U2 R2' F R F' ","y U' L' U' L2 F' L' F y' ","U L F' L2' U L U2 F "     ,"y' L F' L' F U2' R' U R y ","y' R' U2 R U' R' U R y ","U2 R U' R' U R U' R2 F R F' ","y' U2 R U' R2' U R y ","R' U2 R U2 y' R' U' R y " ,"U' R B' R' B R U R' "       ,"U R U' R' F' U2 F ","R' F R F' U' y' R' U' R y ","L U' L' U L U' L' R U2 R' ","R2' F R2 F' "  ,"U R U2' R' U R U' R' ","R U2 R' U L R U' R' L' ","U2 L F' L' F R U R' "   ,"U2 R U R2' F R F' ","L' U2 L U y' R' U2 R y "  ,"y' U2 R' F R F' R' U' R y ","U2 R Uw R' U R Uw' R' ","U L' U2 L y' R' U' R y ","U R U' R' U R U' R2' F R F' ","y' U R U' R2 U R y ","F U R U' R' F' R U' R' "   ,"y R' F R F' U2 L' U' L y' ","U' R' F R F' R U' R' ","y R' U' R L' U2 L y' " ,"y' R2' Uw' R2 Uw R2 y ","U' R2' F R2 F' "  ,"U R U R' U R U' R' ","R U2 R' U R U' R' ","U L U2 L' U R U R' "  ,"R U' R' U' R U' R2' F R F' ","L' U2 L y' R' U' R y "     ,"y' U R' F R F' R' U' R y ","U R Uw R' U R Uw' R' ",};


}