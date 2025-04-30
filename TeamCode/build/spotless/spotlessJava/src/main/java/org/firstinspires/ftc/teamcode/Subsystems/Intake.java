package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Intake {
  private final Servo leftWheel;
  private final Servo rightWheel;
  private final Servo leftFlipServo;
  private final Servo rightFlipServo;

  private final Telemetry telemetry;

  public Intake(final HardwareMap hwMap, final Telemetry telemetry) {
    this.telemetry = null;
    leftWheel = null;
    rightWheel = null;
    leftFlipServo = null;
    rightFlipServo = null;
    // TODO FIX ME!!

    leftWheel.setDirection(Servo.Direction.FORWARD);
    rightWheel.setDirection(Servo.Direction.REVERSE);
  }

  public void collect() {
    // TODO FIX ME!! Call another method to do so!
  }

  public void release() {
    // TODO FIX ME!! Call another method to do so!
  }

  public void rotateUp() {
    // TODO FIX ME!! Call another method to do so!

  }

  public void rotateDown() {
    // TODO FIX ME!! Call another method to do so!
  }

  public void wheelSetPos(final double position) {
    final Thread thread =
        new Thread(
            () -> {
              leftWheel.setPosition(0.0); // TODO FIX ME!!
              rightWheel.setPosition(0.0); // TODO FIX ME!!
            });
    thread.start();
  }

  public void setIntakePowers(final double leftPower, final double rightPower) {
    final Thread thread =
        new Thread(
            () -> {
              leftWheel.setPosition(0.0); // TODO FIX ME!!
              rightWheel.setPosition(0.0); // TODO FIX ME!!
            });
    thread.start();
  }

  public void setFlipperPos(final double position1, final double position2) {
    final Thread thread =
        new Thread(
            () -> {
              leftFlipServo.setPosition(0.0); // TODO FIX ME!!
              rightFlipServo.setPosition(0.0); // TODO FIX ME!!
            });
    thread.start();
  }

  public void stopWheels() {
    final Thread thread =
        new Thread(
            () -> {
              leftWheel.setPosition(0);
              rightWheel.setPosition(0);
            });
    thread.start();
  }
}
