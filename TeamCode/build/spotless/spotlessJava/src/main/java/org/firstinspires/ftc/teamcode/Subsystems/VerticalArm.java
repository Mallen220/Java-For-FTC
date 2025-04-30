package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Constants.*;

public class VerticalArm {

  private final DcMotor leftArm;
  private final DcMotor rightArm;
  private ArmPosition goalPosition;

  private final Telemetry telemetry;

  public VerticalArm(final HardwareMap hwMap, final Telemetry telemetry) {
    this.telemetry = null;
    leftArm = null;
    rightArm = null;
    goalPosition = null;
    // TODO FIX ME!!

    rightArm.setDirection(DcMotor.Direction.REVERSE);

    leftArm.setZeroPowerBehavior(null); // TODO FIX ME!!
    rightArm.setZeroPowerBehavior(null); // TODO FIX ME!!

    resetEncoders();
    setRunMode(null); // TODO FIX ME!!
  }

  private void setRunMode(final DcMotor.RunMode mode) {
    leftArm.setMode(mode);
    rightArm.setMode(mode);
  }

  private void resetEncoders() {
    // TODO FIX ME!!
    // Hint: Set Run mode to STOP_AND_RESET_ENCODER
  }

  public void goToPosition(final ArmPosition position) {
    // TODO FIX ME!!
    goalPosition = position;
    final int targetPosition = position.encoderTicks;

    // Hint: Include safety Checks here!

    if (Math.abs(leftArm.getCurrentPosition() - rightArm.getCurrentPosition())
        > ArmConstants.MAX_ALLOWED_DIFFERENCE) {
      final double leftDistance = Math.abs(leftArm.getCurrentPosition() - targetPosition);
      final double rightDistance = 0.0; // TODO FIX ME!!

      if (leftDistance >= rightDistance) {
        // TODO FIX ME!!
      } else {
        // TODO FIX ME!!
      }
    }

    // Hint: Set the target position for both arms, use Arm.setTargetPosition

    setRunMode(DcMotor.RunMode.RUN_TO_POSITION);

    leftArm.setPower(0.0); // TODO FIX ME!!
    rightArm.setPower(0.0); // TODO FIX ME!!
  }

  public ArmPosition getGoalPosition() {
    // TODO FIX ME!!
    return null;
  }

  public void moveUp(final double power) {
    // TODO FIX ME!!
    // Hint: Negative powers
  }

  public void setArmPowers(final double left, final double right) {
    // TODO FIX ME!!
  }

  public void stop() {
    // TODO FIX ME!!
  }
}
