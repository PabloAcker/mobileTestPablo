package testSuite;

import activities.clock.AlarmClockDetailScreen;
import activities.clock.AlarmScreen;
import activities.clock.MainScreenClock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class ClockTest {
    AlarmClockDetailScreen alarmClockDetailScreen = new AlarmClockDetailScreen();
    AlarmScreen alarmScreen = new AlarmScreen();
    MainScreenClock mainScreenClock = new MainScreenClock();

    @Test
    public void verifyCreateAlarm(){
        String nameAlarm= "Pablo"+new Date().getTime();
        mainScreenClock.alarmButton.click();
        alarmScreen.addAlarmButton.click();
        alarmClockDetailScreen.okButton.click();
        alarmScreen.nameAlarmLabel.click();
        alarmClockDetailScreen.setNameAlarmTextBox.setText(nameAlarm);
        alarmClockDetailScreen.okButtonNameAlarm.click();
        // verificacion de nombre de la alarma creada:
        String actualResult=alarmScreen.nameAlarmLabel.getText();
        Assertions.assertEquals(nameAlarm,actualResult,"ERROR La alarma no pudo ser creada");
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
