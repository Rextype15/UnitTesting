package mx.iteso;

import org.junit.Test;

import static org.junit.Assert.*;

public class TacitKnowledgePrinterTest {

    //Test printNumbers with a limit of 10
        //Verify calculate being called 10 times
        //Verify expected result

    //Test printNumbers with a limit of 0
        //Verify Exception

    //What else can we test?
        //What should we verify?

    private Printer printer;
    private TacitKnowledgePrinterTest tkPrinter;

    @Before
    public void setUp() {
        printer = mock(Printer.class);
        tkPrinter = new TacitKnowledgePrinterTest(printer);
    }

    @Test
    public void Verify10Times() {
        tkPrinter.printNumbers(10);
        verify(printer, times(10)).printNumbers(anyString());
    }

    @Test
    public void VerifyExpectedResult() {

    }

    @Test(expected = RuntimeExpection.class)
    public void ExceptionWhenLimit0() {
        tkPrinter.printNumbers(0);
    }

    @Test
    public void ExtraTest() {

    }

    @Test
    public void forbiddenTest() {
        assertTrue(true);
    }

}
