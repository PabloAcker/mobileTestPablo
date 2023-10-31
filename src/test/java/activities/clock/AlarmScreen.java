package activities.clock;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class AlarmScreen {
    public Button addAlarmButton = new Button(By.id("com.google.android.deskclock:id/fab"));
    public Label nameAlarmLabel = new Label(By.id("com.google.android.deskclock:id/edit_label"));

}
