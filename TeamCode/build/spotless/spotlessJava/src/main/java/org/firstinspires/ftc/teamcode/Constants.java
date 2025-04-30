package org.firstinspires.ftc.teamcode;

public class Constants {
  public static class DriveConstants {
    public static final String FRONT_LEFT_MOTOR_ID = "front_left_motor";
    public static final String FRONT_RIGHT_MOTOR_ID = "front_right_motor";
    public static final String BACK_LEFT_MOTOR_ID = "back_left_motor";
    public static final String BACK_RIGHT_MOTOR_ID = "back_right_motor";
  }

  public static class ArmConstants {
    // Vertical Arm Constants
    public static final String LEFT_ARM_ID = "leftArm";
    public static final String RIGHT_ARM_ID = "rightArm";
    public static final int VERTICAL_MIN_POSITION = 0;
    public static final int VERTICAL_MAX_POSITION = 4100;
    public static final double VERTICAL_MOVE_POWER = 0.35;
    public static final int MAX_ALLOWED_DIFFERENCE = 10; // In Ticks
  }

  public enum ArmPosition {
    INTAKE(250),
    STOWED(250),
    SCORE_HIGH_BUCKET(4100),
    GO_TO_HIGH_BAR(2200),
    SCORE_HIGH_BAR(1500);

    public final int encoderTicks;

    ArmPosition(final int encoderTicks) {
      this.encoderTicks = encoderTicks;
    }
  }

  public static class ClawConstants {
    public static final String CLAW_SERVO_ID = "servo1";
  }

  public enum ClawPosition {
    CLOSE_POSITION(1.0),
    OPEN_POSITION(0.7);

    public final double position;

    ClawPosition(final double position) {
      this.position = position;
    }
  }

  public static class IntakeConstants {
    public static final String LEFT_WHEEL_ID = "leftWheel";
    public static final String RIGHT_WHEEL_ID = "rightWheel";
    public static final String LEFT_FLIP_SERVO_ID = "leftFlipServo";
    public static final String RIGHT_FLIP_SERVO_ID = "rightFlipServo";
    public static final double LEFT_UP_POSITION = 0.82;
    public static final double LEFT_DOWN_POSITION = 0.37;
    public static final double RIGHT_UP_POSITION = 0.9;
    public static final double RIGHT_DOWN_POSITION = 0.45;
    public static final double MAX_VOLTAGE = 5;
    public static final double SERVO_POWER = 0.5;
  }
}
