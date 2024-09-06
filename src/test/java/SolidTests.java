import com.chrisp1985.gof.bridge.*;
import com.chrisp1985.gof.builder.Book;
import com.chrisp1985.gof.builder.BookBuilder;
import com.chrisp1985.gof.builder.Genre;
import com.chrisp1985.gof.command.ComputerOffCommand;
import com.chrisp1985.gof.command.ComputerOnCommand;
import com.chrisp1985.gof.command.ComputerOnOffButton;
import com.chrisp1985.gof.factory.*;
import com.chrisp1985.gof.iterator.GenericIterator;
import com.chrisp1985.gof.observer.EmailListener;
import com.chrisp1985.gof.observer.LibraryService;
import com.chrisp1985.gof.observer.SmallBook;
import com.chrisp1985.gof.prototype.ComplexClass;
import com.chrisp1985.gof.state.Playstation;
import com.chrisp1985.gof.strategy.BankAccountPayments;
import com.chrisp1985.gof.strategy.Payments;
import com.chrisp1985.gof.strategy.PaypalPayments;
import com.chrisp1985.solid.openclosed.HardbackBookInterface;
import com.chrisp1985.solid.openclosed.MassiveHardbackBook;
import com.chrisp1985.solid.openclosed.SmallHardBackBook;
import com.chrisp1985.solid.openclosed.decorators.BlueBookDecorator;
import com.chrisp1985.solid.openclosed.decorators.OldBookDecorator;
import com.chrisp1985.solid.openclosed.decorators.RedBookDecorator;
import org.junit.jupiter.api.Test;

public class SolidTests {

    @Test
    public void openClosedTest() {

        System.out.println("SMALL RED BOOK:");
        HardbackBookInterface smallRedBook = new RedBookDecorator(new SmallHardBackBook());
        smallRedBook.readBook();

        System.out.println("\nBIG RED BOOK:");
        HardbackBookInterface bigRedBook = new RedBookDecorator(new MassiveHardbackBook());
        bigRedBook.readBook();

        System.out.println("\nSMALL BLUE BOOK:");
        HardbackBookInterface smallBlueBook = new BlueBookDecorator(new SmallHardBackBook());
        smallBlueBook.readBook();

        System.out.println("\nSMALL BLUE BOOK:");
        HardbackBookInterface smallOldBlueBook = new OldBookDecorator(new BlueBookDecorator(new SmallHardBackBook()));
        smallOldBlueBook.readBook();

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
        Book myBook = Book.getBuilder()
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
}
