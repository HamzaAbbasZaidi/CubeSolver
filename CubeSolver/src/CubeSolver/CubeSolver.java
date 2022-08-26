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

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();

        cube.performMoves(a, false, null);

        long start = System.nanoTime();

        numMoves += cube.solveCross();

        numMoves += cube.solveF2L();

        System.out.println(numMoves+" moves");

        long timeTaken = System.nanoTime() - start;

        System.out.println(timeTaken);

        // numMoves += cube.solveF2L();


        // For a regular cross solver, uncomment the above and comment the below

        // Cube.testAverageCrossMoves();

        // System.out.println(F2LSolutions.pair1v1.length);

    }


}
