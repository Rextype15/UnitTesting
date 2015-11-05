package mx.iteso;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class TacitKnowledgePrinterTest {


    private Printer printer;
    private TacitKnowledgePrinter tkPrinterTest;


    @Before
    public void setUp() {
        printer = mock(Printer.class);
        tkPrinterTest = new TacitKnowledgePrinter(printer);
    }

    @Test
    public void VerifyPrint10Times() {
        tkPrinterTest.printNumbers(10);
        verify(tkPrinterTest, times(10)).printNumbers(anyInt());
    }

    @Test
    public void VerifyCalculate10Times() {
        tkPrinterTest.printNumbers(10);
        verify(tkPrinterTest, times(10)).calculate(anyInt());
    }

    @Test
    public void VerifyExpectedResult() {
        assertEquals(tkPrinterTest.calculate(2),"2");
    }

    @Test(expected = RuntimeException.class)
    public void ExceptionWhenLimit0() {
        tkPrinterTest.printNumbers(0);
    }

    @Test
    public void ExtraTest() {
        assertEquals(tkPrinterTest.isDivisibleBy(2, 2), true);
    }

}
