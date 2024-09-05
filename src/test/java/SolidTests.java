import com.chrisp1985.gof.builder.Book;
import com.chrisp1985.gof.builder.BookBuilder;
import com.chrisp1985.gof.builder.Genre;
import com.chrisp1985.gof.command.ComputerOffCommand;
import com.chrisp1985.gof.command.ComputerOnCommand;
import com.chrisp1985.gof.command.ComputerOnOffButton;
import com.chrisp1985.gof.factory.*;
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
        ComputerOnOffButton computer = new ComputerOnOffButton();

        computer.setCommand(commandOn).pushButton();
        computer.setCommand(commandOn).pushButton();
        computer.setCommand(commandOn).pushButton();
        computer.setCommand(commandOff).pushButton();
        computer.setCommand(commandOff).pushButton();
        computer.setCommand(commandOff).pushButton();
    }

    @Test
    public void builderTest() {
        BookBuilder builder = new BookBuilder();
        Book myBook = builder.setTitle("Builder Design Book")
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
}
