package CubeSolver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Arrays;

public class CubeSolver {

    // public int numMoves = 0;

    public static void main(String[] args) throws IOException {

        Cube cube = new Cube();

        System.out.println("Please enter the scramble: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();

        cube.performMoves(a, false, null);

        cube.solveCross();

    }


}
