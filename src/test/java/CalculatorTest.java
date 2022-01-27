import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {   // test class 는 반드시 public  // 명명규칙 : test 대상 class명 + 'Test'
    @Test   // @Test 어노테이션 : testSum()이 단위테스트 메소드임을 선
    public void testSum() {
        Calculator c = new Calculator();
        double result = c.sum(10, 50);
        assertEquals(60, result, 0);    // assertEquals(기대값, 실제값, 허용오차)
    }

    @Test
    public void testIsSameNumber() {
        Calculator c = new Calculator();
        assertEquals(true, c.isSameNumber(1,1));
        assertTrue(c.isSameNumber(2,2));    // assertTrue(true가 나와야 할 조건)
    }
}