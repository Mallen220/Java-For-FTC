package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Constants.*;

public class Claw {

  private final double MAX_POSITION = 1;
  private final double MIN_POSITION = 0;
  private ClawPosition goalPosition;
  private final Servo claw;

  private final Telemetry telemetry;

  public Claw(final HardwareMap hwMap, final Telemetry telemetry) {
    claw = null;
    this.telemetry = null;
    // TODO FIX ME!!
  }

  public void openClaw() {
    // TODO FIX ME!!
  }

  public void closeClaw() {
    // TODO FIX ME!!
  }

  public ClawPosition getGoalPosition() {
    // TODO FIX ME!!
    return null;
  }

  public void setPosition(final double position) {
    // TODO FIX ME!!
  }

  public double getClawPosition() {
    // TODO FIX ME!!
    return 0.0;
  }
}
