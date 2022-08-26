package CubeSolver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// import java.util.Arrays;

public class CubeSolver {

  public static void main(String[] args) throws IOException {
    int numMoves = 0;
    Cube cube = new Cube();
    System.out.println("Please enter the scramble: ");

    // Take move input
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String a = reader.readLine();

    cube.performMoves(a, false, null);

    long start = System.currentTimeMillis();
    numMoves += cube.solveCross();
    // numMoves += cube.solveF2L();
    System.out.println(numMoves + " moves");
    long timeTaken = System.currentTimeMillis() - start;
    System.out.println(timeTaken + "ms");

    // For a regular cross solver, comment the above and uncomment the below

//     Cube.testAverageCrossMoves();

    System.out.println(F2LSolutions.pair1v1.length);
    System.out.println(F2LSolutions.pair1v1print.length);

  }
}
