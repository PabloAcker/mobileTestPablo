package activities.documents;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainScreenDocs {
    public Button moreOptionsButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"More options\"]"));
    public Button newFolderButton = new Button(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"New folder\"]"));
    public Label nameFirstFolderLabel = new Label(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\"]"));

}
