import com.chrisp1985.gof.adapter.*;
import com.chrisp1985.gof.bridge.LuxuryBundle;
import com.chrisp1985.gof.bridge.Playstation3Fat;
import com.chrisp1985.gof.bridge.Playstation3Slim;
import com.chrisp1985.gof.bridge.StandardBundle;
import com.chrisp1985.gof.builder.Book;
import com.chrisp1985.gof.builder.Genre;
import com.chrisp1985.gof.chainofresponsibility.ChainOfResponsibility;
import com.chrisp1985.gof.chainofresponsibility.FileEditor;
import com.chrisp1985.gof.command.ComputerOffCommand;
import com.chrisp1985.gof.command.ComputerOnCommand;
import com.chrisp1985.gof.command.ComputerOnOffButton;
import com.chrisp1985.gof.facade.FacadeBook;
import com.chrisp1985.gof.facade.HardbackBook;
import com.chrisp1985.gof.facade.LibraryFacade;
import com.chrisp1985.gof.factory.Cake;
import com.chrisp1985.gof.factory.ChocolateCakeFactory;
import com.chrisp1985.gof.factory.VictoriaSpongeCakeFactory;
import com.chrisp1985.gof.iterator.GenericIterator;
import com.chrisp1985.gof.observer.EmailListener;
import com.chrisp1985.gof.observer.LibraryService;
import com.chrisp1985.gof.observer.SmallBook;
import com.chrisp1985.gof.prototype.ComplexClass;
import com.chrisp1985.gof.singleton.DesignBookSingleton;
import com.chrisp1985.gof.state.Playstation;
import com.chrisp1985.gof.strategy.BankAccountPayments;
import com.chrisp1985.gof.strategy.Payments;
import com.chrisp1985.gof.strategy.PaypalPayments;

import org.junit.jupiter.api.Test;

public class GofTests {


    @Test
    public void adapterTest() {
        System.out.println("\nUK Plug at home:");
        new UkToEuAdapter(new UkPlugAtHome()).plugInTwoProng();

        System.out.println("\nUK Plug at work:");
        new UkToEuAdapter(new UkPlugAtWork()).plugInTwoProng();

        System.out.println("\nEU Plug in hotel:");
        new EuPlugInHotel().plugInTwoProng();

        System.out.println("\nUK Plug at home:");
        new UkPlugAtHome().plugInThreePin();
    }

    @Test
    public void facadeTest() {

        FacadeBook myHardBackBook = new HardbackBook("Design Patterns: The Facade");

        LibraryFacade facade = new LibraryFacade();

        facade.searchForBook(myHardBackBook);
        facade.convertBook(myHardBackBook);
        facade.reserveBook(myHardBackBook);
    }

    @Test
    public void singletonTest() {
        System.out.println(DesignBookSingleton.getDesignBookSingleton().getId());
        System.out.println(DesignBookSingleton.getDesignBookSingleton().getId());
    }

    @Test
    public void strategyTests() {
        Payments payments = new Payments();

        System.out.println("\n\nSetting Paypal payment.");
        payments.setPaymentMethod(new PaypalPayments("chris@chris.com"));
        payments.pay();

        System.out.println("\n\nSetting Bank Account payment.");
        payments.setPaymentMethod(new BankAccountPayments());
        payments.pay();
    }

    @Test
    public void commandTest() {
        ComputerOffCommand commandOff = new ComputerOffCommand();
        ComputerOnCommand commandOn = new ComputerOnCommand();
        ComputerOnOffButton computerButton = new ComputerOnOffButton();

        computerButton.setCommand(commandOn).pushButton();
        computerButton.setCommand(commandOn).pushButton();
        computerButton.setCommand(commandOn).pushButton();
        computerButton.setCommand(commandOff).pushButton();
        computerButton.setCommand(commandOff).pushButton();
        computerButton.setCommand(commandOff).pushButton();
    }

    @Test
    public void builderTest() {
        com.chrisp1985.gof.builder.Book myBook = com.chrisp1985.gof.builder.Book.getBuilder()
                .setTitle("Builder Design Book")
                .setAuthor("Chris P")
                .setGenre(Genre.COMEDY)
                .setISBN(12313452L)
                .setisNew(false)
                .build();

        System.out.printf("Book details:\nTitle: %s\nAuthor: %s\nGenre: %s\nISBN: %d\nIsNew: %s",
                myBook.getTitle(),
                myBook.getAuthor(),
                myBook.getGenre(),
                myBook.getISBN(),
                myBook.getIsNew());
    }

    @Test
    public void factoryTest() {
        var chocFactory = new ChocolateCakeFactory();
        Cake chocCake = chocFactory.orderCake();

        System.out.println("\n-------\n");

        var spongeFactory = new VictoriaSpongeCakeFactory();
        Cake spongeCake = spongeFactory.orderCake();
    }

    @Test
    public void iteratorTest() {
        GenericIterator<Integer> intIterator = new GenericIterator<>(new Integer[] {1,4,5,10});
        while(intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }
    }

    @Test
    public void cloneTest() {
        ComplexClass complexClass = new ComplexClass();
        complexClass.setUpdateString("hello");
        System.out.println("ID of main object: " + complexClass.getId());
        System.out.println("String of main object: " + complexClass.getUpdateString());

        ComplexClass clonedObject = complexClass.clone();
        System.out.println("ID of cloned object: " + clonedObject.getId());
        System.out.println("String of cloned object: " + clonedObject.getUpdateString());


        complexClass.setUpdateString("Second Update");
        System.out.println("String of main object: " + complexClass.getUpdateString());
        System.out.println("String of cloned object: " + clonedObject.getUpdateString());
    }

    @Test
    public void observerTest() {
        LibraryService libraryService = new LibraryService();
        SmallBook smallBook = new SmallBook("Observer Design Patterns", "Chris");

        EmailListener dave = new EmailListener("dave@dave.com");
        EmailListener chris = new EmailListener("chris@chris.com");

        libraryService.subscribeToNotification(chris);
        libraryService.subscribeToNotification(dave);
        libraryService.bookReturned(smallBook);

        libraryService.unsubscribeFromNotification(dave);
        libraryService.bookReturned(smallBook);
    }

    @Test
    public void stateTest() {
        Playstation playstation = new Playstation();
        playstation.clickControllerButton();
        playstation.moveThumbstick();
        playstation.loadGame("Crash Bandicoot");
        System.out.println("----");

        playstation.clickControllerButton();
        playstation.moveThumbstick();
        playstation.loadGame("Colin McRae Rally");
        System.out.println("----");

        playstation.clickControllerButton();
        playstation.moveThumbstick();
        playstation.loadGame("WCW Thunder");
        System.out.println("----");

        playstation.clickControllerButton();
        playstation.moveThumbstick();
        playstation.loadGame("Gran Turismo");

    }

    @Test
    public void bridgeTest() {
        var luxury = new LuxuryBundle(new Playstation3Fat());
        luxury.includeExtras();
        luxury.playGame();
        luxury.getDetails();

        System.out.println("---");

        var standard = new StandardBundle(new Playstation3Slim());
        standard.includeExtras();
        standard.playGame();
        standard.getDetails();
    }

    @Test
    public void chainOfResponsibilityTest() {
        FileEditor editor = new ChainOfResponsibility().getChainOfEditors();
        editor.openFile("js", "Found a file.");

        editor.openFile("msi", "Found a file.");

        editor.openFile("txt", "Found a file.");

        editor.openFile("json", "Found a file.");
    }
}
