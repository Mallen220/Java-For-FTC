package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Constants;

public class MecanumDrive { // TODO: This file is already done! You did it in session 3.
  private DcMotor frontLeftMotor;
  private DcMotor frontRightMotor;
  private DcMotor backLeftMotor;
  private DcMotor backRightMotor;
  private Telemetry telemetry;

  public MecanumDrive(HardwareMap hardwareMap, Telemetry telemetry) {
    frontLeftMotor = hardwareMap.dcMotor.get(Constants.DriveConstants.FRONT_LEFT_MOTOR_ID);
    frontRightMotor = hardwareMap.dcMotor.get(Constants.DriveConstants.FRONT_RIGHT_MOTOR_ID);
    backLeftMotor = hardwareMap.dcMotor.get(Constants.DriveConstants.BACK_LEFT_MOTOR_ID);
    backRightMotor = hardwareMap.dcMotor.get(Constants.DriveConstants.BACK_RIGHT_MOTOR_ID);
    this.telemetry = telemetry;

    frontLeftMotor.setDirection(DcMotor.Direction.REVERSE);

    this.telemetry = telemetry;
  }

  private void setPowers(double fLPower, double fRPower, double bLPower, double bRPower) {
    frontLeftMotor.setPower(fLPower);
    frontRightMotor.setPower(fRPower);
    backLeftMotor.setPower(bLPower);
    backRightMotor.setPower(bRPower);
  }

  public void drive(double forward, double right, double rotate) {

    double fLPower = -forward + right + rotate;
    double fRPower = -forward - right - rotate;
    double bLPower = forward - -right + -rotate;
    double bRPower = -forward + right - rotate;

    setPowers(fLPower, fRPower, bLPower, bRPower);
  }

  public void stop() {
    setPowers(0, 0, 0, 0);
  }
}
