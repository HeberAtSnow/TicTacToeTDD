import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
    Board b;
    @BeforeEach
    void setUp() {
        b=new Board();
    }
    @AfterEach
    void tearDown() {
    }
// TODO: Test case for playing X in upper left corner
// TODO: Test case for Winning1 - top row
// TODO: Test case for Winning2 - Middle row
// TODO: Test case for Winning3 - bottom row
// TODO: Test case for Winning4 - Column 1
// TODO: Test case for Winning5 - Column 2
// TODO: Test case for Winning6 - Column 3
// TODO: Test case for Winning7 - Diagnal 1
// TODO: Test case for Winning8 - Diagnal 2
// TODO: Test case for BoardIsFull - all 9 squares have been played
// TODO: Test case for playing a piece - can't play in an already used square
// TODO: Test case for Won't accept column <0 or column >2,  Row <0 or Row >2 on play
// TODO: Test case for Won't accept anything but O or X as placeable pieces



    @Test
    void writeOne(){
        Assertions.assertEquals(true,true,"Sample test by Heber");
        Assertions.assertTrue(true,"Sample test by Heber");
        Assertions.assertFalse(false, "Sample by Heber");
    }

}