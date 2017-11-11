package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Wake Robotics Member on 11/2/2017.
 */


@TeleOp(name = "tankDrive", group = "Tank")
public class tankDrive extends OpMode {

    DcMotor frontLeft;
    DcMotor frontRight;
    DcMotor backLeft;
    DcMotor backRight;
    Servo blockPull;

    @Override
    public void init() {
        backRight = hardwareMap.dcMotor.get("motor0");
        backLeft = hardwareMap.dcMotor.get("motor2");
        frontRight = hardwareMap.dcMotor.get("motor1");
        frontLeft = hardwareMap.dcMotor.get("motor3");
        blockPull = hardwareMap.servo.get("servo0");

        backLeft.setDirection(DcMotor.Direction.REVERSE);
        frontLeft.setDirection(DcMotor.Direction.REVERSE);

    }

    @Override
    public void loop() {

        frontLeft.setPower(gamepad1.left_stick_y);
        backLeft.setPower(gamepad1.left_stick_y);
        frontRight.setPower(gamepad1.right_stick_y);
        backRight.setPower(gamepad1.right_stick_y);

        if (gamepad2.a) {
            blockPull.setPosition(1.0);
        }
        
        if (gamepad2.b) {
            blockPull.setPosition(0.0);
        }

    }
}
