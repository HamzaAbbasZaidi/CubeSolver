package CubeSolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cube {

    public String[] edges;
    public String[] corners;

    public static final ArrayList<String> allEdgeStickers = new ArrayList<>(Arrays.asList("UB", "UR", "UF", "UL", "LU", "LF", "LD", "LB", "FU", "FR", "FD", "FL", "RU", "RB", "RD", "RF", "BU", "BL", "BD", "BR", "DF", "DR", "DB", "DL"));
    public static final ArrayList<String> allPossibleMoves = new ArrayList<>(Arrays.asList("R ","R' ","R2 ","U ","U' ","U2 ","F ","F' ","F2 ","L ","L' ","L2 ","B ","B' ","B2 ","D ","D' ","D2 "));

    public static final ArrayList<String> wxvuTries = new ArrayList<>(Arrays.asList("wxvu","Wxvu","wXvu","WXvu","wxVu","WxVu","wXVu","WXVu","wxvU","WxvU","wXvU","WXvU","wxVU","WxVU","wXVU","WXVU"));
    public static final ArrayList<String> wxuvTries = new ArrayList<>(Arrays.asList("wxuv","Wxuv","wXuv","WXuv","wxUv","WxUv","wXUv","WXUv","wxuV","WxuV","wXuV","WXuV","wxUV","WxUV","wXUV","WXUV"));
    public static final ArrayList<String> wvuxTries = new ArrayList<>(Arrays.asList("wvux","Wvux","wVux","WVux","wvUx","WvUx","wVUx","WVUx","wvuX","WvuX","wVuX","WVuX","wvUX","WvUX","wVUX","WVUX"));
    public static final ArrayList<String> wvxuTries = new ArrayList<>(Arrays.asList("wvxu","Wvxu","wVxu","WVxu","wvXu","WvXu","wVXu","WVXu","wvxU","WvxU","wVxU","WVxU","wvXU","WvXU","wVXU","WVXU"));

    public Cube() {

        this.edges = new String[] {"UB","UR","UF","UL","FR","FL","BL","BR","DF","DR","DB","DL"};
        this.corners = new String[] {"UBL", "UBR", "UFR", "UFL", "DFL", "DFR", "DBR", "DBL"};

    }

    public Cube(String[] edges, String[] corners) {

        this.edges = edges;
        this.corners = corners;

    }

    public int solveCross() {

        System.out.println("Cross: ");

        StringBuilder finalCrossSolution = new StringBuilder();
        int length = 20;

        for(int i = 0; i < 16; i++) {

            StringBuilder solutionBuilder = new StringBuilder();
            Cube cubeCopy = new Cube(this.edges.clone(),this.corners.clone());

            for(int j = 0; j < 4; j++) {

                switch (wxvuTries.get(i).charAt(j)) {

                    case 'w' -> cubeCopy.performMoves(CrossSolutions.edge1w1[allEdgeStickers.indexOf(cubeCopy.edges[10])], true, solutionBuilder);
                    case 'W' -> cubeCopy.performMoves(CrossSolutions.edge1w2[allEdgeStickers.indexOf(cubeCopy.edges[10])], true, solutionBuilder);
                    case 'x' -> cubeCopy.performMoves(CrossSolutions.edge2xw1[allEdgeStickers.indexOf(cubeCopy.edges[11])], true, solutionBuilder);
                    case 'X' -> cubeCopy.performMoves(CrossSolutions.edge2xw2[allEdgeStickers.indexOf(cubeCopy.edges[11])], true, solutionBuilder);
                    case 'v' -> cubeCopy.performMoves(CrossSolutions.edge3vwx1[allEdgeStickers.indexOf(cubeCopy.edges[9])], true, solutionBuilder);
                    case 'V' -> cubeCopy.performMoves(CrossSolutions.edge3vwx2[allEdgeStickers.indexOf(cubeCopy.edges[9])], true, solutionBuilder);
                    case 'u' -> cubeCopy.performMoves(CrossSolutions.edge4uvwx1[allEdgeStickers.indexOf(cubeCopy.edges[8])], true, solutionBuilder);
                    case 'U' -> cubeCopy.performMoves(CrossSolutions.edge4uvwx2[allEdgeStickers.indexOf(cubeCopy.edges[8])], true, solutionBuilder);

                }
            }

            if(cancel(Arrays.asList(solutionBuilder.toString().split(" "))).size() < length) {

                finalCrossSolution = new StringBuilder(solutionBuilder.toString());
                length = cancel(Arrays.asList(solutionBuilder.toString().split(" "))).size();

            }

            /*
             printMoves(Arrays.asList(solutionBuilder.toString().split(" ")));
             printMoves(cancel(Arrays.asList(solutionBuilder.toString().split(" "))));
            */

            cubeCopy = new Cube(this.edges.clone(),this.corners.clone());
            solutionBuilder = new StringBuilder();

            for(int j = 0; j < 4; j++) {

                switch (wxuvTries.get(i).charAt(j)) {

                    case 'w'/**/ -> cubeCopy.performMoves(CrossSolutions.edge1w1[allEdgeStickers.indexOf(cubeCopy.edges[10])], true, solutionBuilder);
                    case 'W' -> cubeCopy.performMoves(CrossSolutions.edge1w2[allEdgeStickers.indexOf(cubeCopy.edges[10])], true, solutionBuilder);
                    case 'x' -> cubeCopy.performMoves(CrossSolutions.edge2xw1[allEdgeStickers.indexOf(cubeCopy.edges[11])], true, solutionBuilder);
                    case 'X'/**/ -> cubeCopy.performMoves(CrossSolutions.edge2xw2[allEdgeStickers.indexOf(cubeCopy.edges[11])], true, solutionBuilder);
                    case 'u' -> cubeCopy.performMoves(CrossSolutions.edge3uwx1[allEdgeStickers.indexOf(cubeCopy.edges[8])], true, solutionBuilder);
                    case 'U'/**/ -> cubeCopy.performMoves(CrossSolutions.edge3uwx2[allEdgeStickers.indexOf(cubeCopy.edges[8])], true, solutionBuilder);
                    case 'v'/**/ -> cubeCopy.performMoves(CrossSolutions.edge4vuxw1[allEdgeStickers.indexOf(cubeCopy.edges[9])], true, solutionBuilder);
                    case 'V' -> cubeCopy.performMoves(CrossSolutions.edge4vuxw2[allEdgeStickers.indexOf(cubeCopy.edges[9])], true, solutionBuilder);

                }
            }

            if(cancel(Arrays.asList(solutionBuilder.toString().split(" "))).size() < length) {

                finalCrossSolution = new StringBuilder(solutionBuilder.toString());
                length = cancel(Arrays.asList(solutionBuilder.toString().split(" "))).size();

            }

            /*
             printMoves(Arrays.asList(solutionBuilder.toString().split(" ")));
             printMoves(cancel(Arrays.asList(solutionBuilder.toString().split(" "))));
            */

            cubeCopy = new Cube(this.edges.clone(),this.corners.clone());
            solutionBuilder = new StringBuilder();

            for(int j = 0; j < 4; j++) {

                switch (wvuxTries.get(i).charAt(j)) {

                    case 'w' -> cubeCopy.performMoves(CrossSolutions.edge1w1[allEdgeStickers.indexOf(cubeCopy.edges[10])], true, solutionBuilder);
                    case 'W' -> cubeCopy.performMoves(CrossSolutions.edge1w2[allEdgeStickers.indexOf(cubeCopy.edges[10])], true, solutionBuilder);
                    case 'v' -> cubeCopy.performMoves(CrossSolutions.edge2vw1[allEdgeStickers.indexOf(cubeCopy.edges[9])], true, solutionBuilder);
                    case 'V' -> cubeCopy.performMoves(CrossSolutions.edge2vw2[allEdgeStickers.indexOf(cubeCopy.edges[9])], true, solutionBuilder);
                    case 'u' -> cubeCopy.performMoves(CrossSolutions.edge3uvw1[allEdgeStickers.indexOf(cubeCopy.edges[8])], true, solutionBuilder);
                    case 'U' -> cubeCopy.performMoves(CrossSolutions.edge3uvw2[allEdgeStickers.indexOf(cubeCopy.edges[8])], true, solutionBuilder);
                    case 'x' -> cubeCopy.performMoves(CrossSolutions.edge4x1[allEdgeStickers.indexOf(cubeCopy.edges[11])], true, solutionBuilder);
                    case 'X' -> cubeCopy.performMoves(CrossSolutions.edge4x2[allEdgeStickers.indexOf(cubeCopy.edges[11])], true, solutionBuilder);

                }
            }
            if(cancel(Arrays.asList(solutionBuilder.toString().split(" "))).size() < length) {

                finalCrossSolution = new StringBuilder(solutionBuilder.toString());
                length = cancel(Arrays.asList(solutionBuilder.toString().split(" "))).size();

            }

            /*
             printMoves(Arrays.asList(solutionBuilder.toString().split(" ")));
             printMoves(cancel(Arrays.asList(solutionBuilder.toString().split(" "))));
            */

            cubeCopy = new Cube(this.edges.clone(),this.corners.clone());
            solutionBuilder = new StringBuilder();

            for(int j = 0; j < 4; j++) {

                switch (wvxuTries.get(i).charAt(j)) {

                    case 'w' -> cubeCopy.performMoves(CrossSolutions.edge1w1[allEdgeStickers.indexOf(cubeCopy.edges[10])], true, solutionBuilder);
                    case 'W' -> cubeCopy.performMoves(CrossSolutions.edge1w2[allEdgeStickers.indexOf(cubeCopy.edges[10])], true, solutionBuilder);
                    case 'v' -> cubeCopy.performMoves(CrossSolutions.edge2vw1[allEdgeStickers.indexOf(cubeCopy.edges[9])], true, solutionBuilder);
                    case 'V' -> cubeCopy.performMoves(CrossSolutions.edge2vw2[allEdgeStickers.indexOf(cubeCopy.edges[9])], true, solutionBuilder);
                    case 'x' -> cubeCopy.performMoves(CrossSolutions.edge3xwv1[allEdgeStickers.indexOf(cubeCopy.edges[11])], true, solutionBuilder);
                    case 'X' -> cubeCopy.performMoves(CrossSolutions.edge3xwv2[allEdgeStickers.indexOf(cubeCopy.edges[11])], true, solutionBuilder);
                    case 'u' -> cubeCopy.performMoves(CrossSolutions.edge4uvwx1[allEdgeStickers.indexOf(cubeCopy.edges[8])], true, solutionBuilder);
                    case 'U' -> cubeCopy.performMoves(CrossSolutions.edge4uvwx2[allEdgeStickers.indexOf(cubeCopy.edges[8])], true, solutionBuilder);

                }
            }
            if(cancel(Arrays.asList(solutionBuilder.toString().split(" "))).size() < length) {

                finalCrossSolution = new StringBuilder(solutionBuilder.toString());
                length = cancel(Arrays.asList(solutionBuilder.toString().split(" "))).size();

            }

            /*
             printMoves(Arrays.asList(solutionBuilder.toString().split(" ")));
             printMoves(cancel(Arrays.asList(solutionBuilder.toString().split(" "))));
            */

        }

        // System.out.println("The shortest cross solution found is:"+'\n');
        printMoves(cancel(Arrays.asList(finalCrossSolution.toString().split(" "))));
        return (cancel(Arrays.asList(finalCrossSolution.toString().split(" ")))).size();
    }

    private void printMoves(List<String> listOfMoves) {

        for (String move : listOfMoves) System.out.print(move.concat(" "));
        System.out.println('\n');

    }
    private List<String> cancel(List<String> sb) {

        while(isNotSimplified(sb) && sb.size() >= 1) {

            sb = makeFirstSimplificationPossible(sb);

        }

        return sb;

    }

    private boolean isNotSimplified(List<String> sb) {
        for(int i = 0; i < sb.size() - 1; i++) {
            if(sb.get(i).charAt(0) == sb.get(i + 1).charAt(0)) return true;
        }
        return false;
    }

    private List<String> makeFirstSimplificationPossible(List<String> sb) {

        List<String> filtered = null;

        for(int i = 0; i < sb.size() - 1; i++) {
            if(sb.get(i).charAt(0) == sb.get(i + 1).charAt(0)) {

                int rotation = 0;
                if(sb.get(i).length() == 1) {
                    rotation += 1;
                }
                else if(sb.get(i).charAt(1) == '2') {
                    rotation += 2;
                }
                else {
                    rotation -= 1;
                }
                if(sb.get(i + 1).length() == 1) {
                    rotation += 1;
                }
                else if(sb.get(i + 1).charAt(1) == '2') {
                    rotation += 2;
                }
                else {
                    rotation -= 1;
                }

                switch (rotation) {
                    case 0, 4 -> {
                        sb.set(i, "");
                        sb.set(i + 1, "");
                    }
                    case 1 -> {
                        sb.set(i, Character.toString(sb.get(i).charAt(0)));
                        sb.set(i + 1, "");
                    }
                    case -2, 2 -> {
                        sb.set(i, Character.toString(sb.get(i).charAt(0)).concat("2"));
                        sb.set(i + 1, "");
                    }
                    case 3 -> {
                        sb.set(i, Character.toString(sb.get(i).charAt(0)).concat("'"));
                        sb.set(i + 1, "");
                    }
                    default -> {
                    }
                }
                filtered = sb.stream().filter(k -> k != "").collect(Collectors.toList());
            break;
            }
        }
        return filtered;
    }

    public void performMoves(String s, boolean print, StringBuilder sb) {

        if(s == "") return;

        String[] moves = s.split(" ");

        if(print) sb.append(s);

        for(String m : moves) {
            makeMove(m,this);
        }

    }

    public Cube tryMoves(String s) {

        String[] moves = s.split(" ");
        Cube newCube = new Cube(this.edges.clone(),this.corners.clone()); // to make sure the current cube isn't touched

        for(String m : moves) {
            makeMove(m,newCube);
        }

        return newCube;

    }

    public void makeMove(String move, Cube output) {

        switch (move) {

            case "R" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.rMap.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.rMap.get(output.corners[i]);
            }
            case "R'" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.rPrimeMap.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.rPrimeMap.get(output.corners[i]);
            }
            case "R2" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.r2Map.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.r2Map.get(output.corners[i]);
            }
            case "U" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.uMap.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.uMap.get(output.corners[i]);
            }
            case "U'" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.uPrimeMap.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.uPrimeMap.get(output.corners[i]);
            }
            case "U2" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.u2Map.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.u2Map.get(output.corners[i]);
            }
            case "F" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.fMap.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.fMap.get(output.corners[i]);
            }
            case "F'" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.fPrimeMap.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.fPrimeMap.get(output.corners[i]);
            }
            case "F2" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.f2Map.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.f2Map.get(output.corners[i]);
            }
            case "L" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.lMap.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.lMap.get(output.corners[i]);
            }
            case "L'" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.lPrimeMap.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.lPrimeMap.get(output.corners[i]);
            }
            case "L2" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.l2Map.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.l2Map.get(output.corners[i]);
            }
            case "D" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.dMap.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.dMap.get(output.corners[i]);
            }
            case "D'" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.dPrimeMap.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.dPrimeMap.get(output.corners[i]);
            }
            case "D2" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.d2Map.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.d2Map.get(output.corners[i]);
            }
            case "B" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.bMap.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.bMap.get(output.corners[i]);
            }
            case "B'" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.bPrimeMap.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.bPrimeMap.get(output.corners[i]);
            }
            case "B2" -> {
                for (int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.b2Map.get(output.edges[i]);
                for (int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.b2Map.get(output.corners[i]);
            }
            default -> throw new IllegalArgumentException(move + " is not a move");

        }

    }

    public static void testAverageCrossMoves() {

        double solutionMoves = 0;

        for(int i = 0; i < 1000; i++) {

            Cube cube = new Cube();
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < 25; j++) {
                int move = (int) Math.floor(Math.random()*18);
                sb.append(allPossibleMoves.get(move));
            }

            System.out.println("Scramble: ");
            cube.performMoves(sb.toString(),false,null);
            System.out.println(sb);
            solutionMoves += cube.solveCross();

        }

        System.out.println("Average number of moves: "+solutionMoves/1000);

    }

}

