package activities.messages;

import control.Button;
import org.openqa.selenium.By;

public class PreviousScreens {
    public Button firstNextButton = new Button(By.id("com.google.android.apps.messaging:id/welcome_fragment_federated_learning_next_button"));
    public Button secondNextButtonSpamProtection = new Button(By.id("com.google.android.apps.messaging:id/welcome_fragment_spam_next_button"));
}
