
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
}
