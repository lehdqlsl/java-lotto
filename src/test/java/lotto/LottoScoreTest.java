package lotto;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LottoScoreTest {

    @Test
    void 로또_당첨_수_계산() {
        List<LottoMatcher> lottoMatchers = List.of(
                LottoMatcher.FOURTH_MATCH,
                LottoMatcher.FOURTH_MATCH,
                LottoMatcher.THIRD_MATCH,
                LottoMatcher.THIRD_MATCH,
                LottoMatcher.SECOND_MATCH,
                LottoMatcher.SECOND_MATCH,
                LottoMatcher.FIRST_MATCH,
                LottoMatcher.FIRST_MATCH
        );

        LottoScore lottoScore = new LottoScore(1000, 8, lottoMatchers);

        assertThat(lottoScore.fourthCount()).isEqualTo(2);
        assertThat(lottoScore.thirdCount()).isEqualTo(2);
        assertThat(lottoScore.secondCount()).isEqualTo(2);
        assertThat(lottoScore.firstCount()).isEqualTo(2);
    }

    @Test
    void 로또_수익률_계산() {
        List<LottoMatcher> lottoMatchers = List.of(
                LottoMatcher.FOURTH_MATCH
        );

        LottoScore lottoScore = new LottoScore(1000, 1, lottoMatchers);

        assertThat(lottoScore.rate()).isEqualTo(5);
    }
}
