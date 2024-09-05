import com.chrisp1985.gof.adapter.*;
import com.chrisp1985.gof.facade.Book;
import com.chrisp1985.gof.facade.HardbackBook;
import com.chrisp1985.gof.facade.LibraryFacade;
import com.chrisp1985.gof.singleton.DesignBookSingleton;
import com.chrisp1985.solid.openclosed.decorators.BookDecorator;
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

        Book myHardBackBook = new HardbackBook("Design Patterns: The Facade");

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
}
