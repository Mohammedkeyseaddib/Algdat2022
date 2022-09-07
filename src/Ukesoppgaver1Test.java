import static org.junit.jupiter.api.Assertions.*;

class Ukesoppgaver1Test {

    // tester a og får minste verdien og indeksen
    @org.junit.jupiter.api.Test
    void min() {
        int [] a= {8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};

       int minimum= Ukesoppgaver1.min(a);

       assertEquals(6,minimum);
       assertEquals(1, a[minimum]);

       // test for alle permutasjoner for 4 tall

        // test corner cases - " Spesialtilfeller "

        int [] b= {1,4,17,10,6,20,8,};
        assertEquals(0,Ukesoppgaver1.min(b));
        int [] c= {8,4,17,10,6,20,1,};
        assertEquals(6,Ukesoppgaver1.min(c));





    }
}