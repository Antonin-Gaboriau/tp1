package fr.univ_amu.iut.exercice4;

import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class RobotSimulator {
    private Robot robot;
    private String instructions;

    public RobotSimulator(Robot robot, String instructions) {
        this.robot = robot;
        this.instructions = instructions;
    }

    public void simulate() {
        for (int i = 0; i < instructions.length(); ++i) {
            switch (instructions.charAt (i)) {
                case 'L' :
                    robot.turnLeft ();
                    break;
                case 'R' :
                    robot.turnRight();
                    break;
                case 'A' :
                    robot.advance();
                    break;
            }
        }
    }

    public List<Movement> getMovements() {
        List<Movement> returnList = new ArrayList<>();
        for (int i = 0; i < instructions.length(); ++i) {
            switch (instructions.charAt(i)) {
                case 'L' :
                    returnList.add(Movement.getMovement('L'));
                    break;
                case 'R' :
                    returnList.add(Movement.getMovement('R'));
                    break;
                case 'A' :
                    returnList.add(Movement.getMovement('A'));
                    break;
            }
        }
        return returnList;
    }
}
