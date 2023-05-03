package lotto;

import java.util.List;
import java.util.stream.Collectors;

public class Lotto {
    private final List<LottoNumber> lottoNumbers;

    public Lotto(List<LottoNumber> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public LottoMatcher result(List<LottoNumber> targetNumbers) {
        int matchedSize = lottoNumbers.stream()
                .filter(lottoNumber -> targetNumbers.contains(lottoNumber))
                .collect(Collectors.toList())
                .size();
        return LottoMatcher.of(matchedSize);
    }

    public List<LottoNumber> lottoNumbers() {
        return lottoNumbers;
    }
}
