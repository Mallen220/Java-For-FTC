package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.Subsystems.Claw;
import org.firstinspires.ftc.teamcode.Subsystems.Intake;
import org.firstinspires.ftc.teamcode.Subsystems.MecanumDrive;
import org.firstinspires.ftc.teamcode.Subsystems.VerticalArm;

@TeleOp(name = "mainDrive")
public class RobotContainer extends OpMode {

  private VerticalArm verticalArm;
  private Claw claw;
  private MecanumDrive drive;
  private Intake intake;

  @Override
  public void init() {
    verticalArm = new VerticalArm(hardwareMap, telemetry);
    claw = new Claw(hardwareMap, telemetry);
    drive = new MecanumDrive(hardwareMap, telemetry);
    intake = new Intake(hardwareMap, telemetry);
  }

  public boolean isWithinTolerance(
      final double targetValue, final double currentValue, final double tolerance) {
    return Math.abs(targetValue - currentValue) <= tolerance;
  }

  @Override
  public void loop() {

    final double forwardInput = -gamepad1.left_stick_y;
    final double strafeInput = gamepad1.left_stick_x;
    final double rotateInput = gamepad1.right_stick_x;

    final boolean driveSticksActive =
        !isWithinTolerance(0, gamepad1.left_stick_y, 0.05)
            || !isWithinTolerance(0, gamepad1.left_stick_x, 0.05)
            || !isWithinTolerance(0, gamepad1.right_stick_x, 0.05);

    if (driveSticksActive) {
      drive.driveFieldRelative(forwardInput, strafeInput, rotateInput);
    } else {
      drive.stop();
    }

    if (gamepad2.b) {
      drive.resetYaw();
    }

    if (gamepad2.dpad_up) {
      // TODO: Send the vertical arm to the high bar
    } else if (gamepad2.dpad_right) {
      // TODO: Send the vertical arm to the high bucket
    } else if (gamepad2.dpad_down) {
      // TODO: Send the vertical arm to stowed
    } else if (gamepad2.dpad_left) { // This score logic is complete for you.
      if (verticalArm.getGoalPosition() == Constants.ArmPosition.GO_TO_HIGH_BAR
          && claw.getGoalPosition() == Constants.ClawPosition.CLOSE_POSITION) {
        verticalArm.goToPosition(Constants.ArmPosition.SCORE_HIGH_BAR);
        try {
          Thread.sleep(750);
        } catch (final InterruptedException e) {
          System.out.println("Big Sad");
        }
        claw.setPosition(Constants.ClawPosition.OPEN_POSITION.position);
      } else if (verticalArm.getGoalPosition() == Constants.ArmPosition.SCORE_HIGH_BUCKET
          && claw.getGoalPosition() == Constants.ClawPosition.CLOSE_POSITION) {
        claw.setPosition(Constants.ClawPosition.OPEN_POSITION.position);
      } else {
        claw.setPosition(Constants.ClawPosition.OPEN_POSITION.position);
        verticalArm.goToPosition(Constants.ArmPosition.STOWED);
      }
    }

    if (gamepad1.left_bumper) {
      // TODO: Close the claw
    } else if (gamepad1.right_bumper) {
      // TODO: Open the claw
    }

    if (gamepad2.left_trigger >= 0.25) {
      // TODO: Collect
    } else if (gamepad2.right_trigger >= 0.25) {
      // TODO: Stop collecting
    }

    if (gamepad2.left_bumper) {
      // TODO: Flipper Down
    } else if (gamepad2.right_bumper) {
      // TODO: Arm intake
      // TODO: Flipper Up
    }

    if (gamepad2.x) { // TODO: Pass from intake to outtake
      // TODO: Release the intake
      // TODO: Close the claw
    }

    telemetry.update();
  }
}
