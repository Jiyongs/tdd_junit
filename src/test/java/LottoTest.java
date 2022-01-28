import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

// 단위테스트는 given(데이터가 준비)-when(함수실행)-then(나와야하는 결과) 패턴으로 작성
public class LottoTest {
    // 로또 번호 개수가 6개와 일치하는지 확인하는 단위 테스트
    @DisplayName("로또 번호 개수 테스트")
    @Test
    public void lottoNumberSizeTest() {
        // given
        final Lotto lotto = new Lotto();
        final int price = 1000;
        // when
        final List<Integer> lottoNumber = lotto.generate(price);
        // then
        assertEquals(6, lottoNumber.size());
    }

    // 로또 번호 범위가 1~45 사이인지 확인하는 단위 테스트
    @DisplayName("로또 번호 범위 테스트")
    @Test
    public void lottoNumberRangeTest() {
        // given
        final Lotto lotto = new Lotto();
        final int price = 1000;
        // when
        final List<Integer> lottoNumber = lotto.generate(price);
        // then
        assertTrue(lottoNumber.stream().allMatch(v->v>0&&v<46));
    }

    // 로또 금액이 1000원이 아닐 때 예외발생이 정상적인지 확인하는 단위 테스
    @DisplayName("로또 금액 예외 테스트")
    @Test
    public void lottoPriceTest() {
        // given
        final Lotto lotto = new Lotto();
        final int price = 2000;
        // when
        final RuntimeException ex = assertThrows(RuntimeException.class, ()->lotto.generate(price));
        // then
        assertEquals("1000원만 지불해주세요.", ex.getMessage());
    }
}
