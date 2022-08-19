package CubeSolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cube {

    public String[] edges;
    public String[] corners;

    public static final ArrayList<String> allEdgeStickers = new ArrayList<>(Arrays.asList("UB", "UR", "UF", "UL", "LU", "LF", "LD", "LB", "FU", "FR", "FD", "FL", "RU", "RB", "RD", "RF", "BU", "BL", "BD", "BR", "DF", "DR", "DB", "DL"));

    public Cube() {
        this.edges = new String[] {"UB","UR","UF","UL","FR","FL","BL","BR","DF","DR","DB","DL"};
        this.corners = new String[] {"UBL", "UBR", "UFR", "UFL", "DFL", "DFR", "DBR", "DBL"};
    }

    public Cube(String[] edges, String[] corners) {
        this.edges = edges;
        this.corners = corners;
    }

    public void solveCross() {
        System.out.println("Cross: ");

        Cube copy = new Cube(this.edges.clone(),this.corners.clone());

        StringBuilder sbwxvu = new StringBuilder();

        copy.performMoves(CrossEdgeSolutions.edge1wxvu[allEdgeStickers.indexOf(copy.edges[10])], true, sbwxvu);
        copy.performMoves(CrossEdgeSolutions.edge2wxvu[allEdgeStickers.indexOf(copy.edges[11])], true, sbwxvu);
        copy.performMoves(CrossEdgeSolutions.edge3wxvu[allEdgeStickers.indexOf(copy.edges[9])], true, sbwxvu);
        copy.performMoves(CrossEdgeSolutions.edge4wxvu[allEdgeStickers.indexOf(copy.edges[8])], true, sbwxvu);

        String[] moves = sbwxvu.toString().split(" ");
        List<String> newMoves = Arrays.asList(moves);
        System.out.println(Arrays.toString(moves));
        List<String> newMovesSimplified = cancel(newMoves);
        System.out.println(newMovesSimplified);
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

                // int finalI = i;
                // String[] finalSb = sb;

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

                switch(rotation) {
                    case 0:
                    case 4:
                        sb.set(i, "");
                        sb.set(i + 1, "");
                        break;
                    case 1:
                        sb.set(i, Character.toString(sb.get(i).charAt(0)));
                        sb.set(i + 1, "");
                        break;
                    case -2:
                    case 2:
                        sb.set(i, Character.toString(sb.get(i).charAt(0)).concat("2"));
                        sb.set(i + 1, "");
                        break;
                    case -1:
                    case 3:
                        sb.set(i, Character.toString(sb.get(i).charAt(0)).concat("'"));
                        sb.set(i + 1, "");
                        break;
                    default:
                }
                filtered = sb.stream().filter(k -> k != "").collect(Collectors.toList());
            break;
            }
        }
        return filtered;
    }

    public void performMoves(String s, boolean print, StringBuilder sb) {

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

        switch(move) {

            case "R":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.rMap.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.rMap.get(output.corners[i]);
                break;

            case "R'":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.rPrimeMap.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.rPrimeMap.get(output.corners[i]);
                break;

            case "R2":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.r2Map.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.r2Map.get(output.corners[i]);
                break;

            case "U":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.uMap.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.uMap.get(output.corners[i]);
                break;

            case "U'":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.uPrimeMap.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.uPrimeMap.get(output.corners[i]);
                break;

            case "U2":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.u2Map.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.u2Map.get(output.corners[i]);
                break;

            case "F":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.fMap.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.fMap.get(output.corners[i]);
                break;

            case "F'":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.fPrimeMap.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.fPrimeMap.get(output.corners[i]);
                break;

            case "F2":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.f2Map.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.f2Map.get(output.corners[i]);
                break;

            case "L":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.lMap.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.lMap.get(output.corners[i]);
                break;

            case "L'":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.lPrimeMap.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.lPrimeMap.get(output.corners[i]);
                break;

            case "L2":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.l2Map.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.l2Map.get(output.corners[i]);
                break;

            case "D":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.dMap.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.dMap.get(output.corners[i]);
                break;

            case "D'":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.dPrimeMap.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.dPrimeMap.get(output.corners[i]);
                break;

            case "D2":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.d2Map.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.d2Map.get(output.corners[i]);
                break;

            case "B":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.bMap.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.bMap.get(output.corners[i]);
                break;

            case "B'":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.bPrimeMap.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.bPrimeMap.get(output.corners[i]);
                break;

            case "B2":
                for(int i = 0; i <= 11; i++) output.edges[i] = MoveMaps.b2Map.get(output.edges[i]);
                for(int i = 0; i <= 7; i++) output.corners[i] = MoveMaps.b2Map.get(output.corners[i]);
                break;

            default:
                throw new IllegalArgumentException(move+" is not a move");
        }

    }

}