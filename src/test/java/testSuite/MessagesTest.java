package testSuite;

import activities.messages.MainScreenMsg;
import activities.messages.MessageContactScreen;
import activities.messages.NewConversationScreen;
import activities.messages.PreviousScreens;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class MessagesTest {
    MainScreenMsg mainScreenMsg = new MainScreenMsg();
    MessageContactScreen messageContactScreen = new MessageContactScreen();
    NewConversationScreen newConversationScreen = new NewConversationScreen();
    PreviousScreens previousScreens = new PreviousScreens();

    @Test
    public void verifySendMessage(){
        String msg= "HolaPablo"+new Date().getTime();
        previousScreens.firstNextButton.click();
        previousScreens.secondNextButtonSpamProtection.click();
        mainScreenMsg.startChatButton.click();
        newConversationScreen.firstContactLabel.click();
        messageContactScreen.setMessageTextBox.setText(msg);
        messageContactScreen.sendButton.click();
        // verificacion de nombre de la alarma creada:
        String actualResult=messageContactScreen.getSpecificTextMsg(msg).getText();
        Assertions.assertEquals(msg,actualResult,"ERROR El mensaje no fue enviado");
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
