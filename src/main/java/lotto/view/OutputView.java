package lotto.view;

import lotto.domain.Lotto;
import lotto.domain.LottoGameResult;

import java.util.List;

import static lotto.constant.ConsoleMessage.LOTTO_PROFIT_RATE;
import static lotto.constant.ConsoleMessage.LOTTO_PURCHASE_COMPLETED;

public class OutputView {

    public void printPurchasedLottos(List<Lotto> lottos) {
        System.out.printf((LOTTO_PURCHASE_COMPLETED), lottos.size());

        lottos.forEach(System.out::println);
    }

    public void printLottoResult(LottoGameResult lottoGameResult) {
        System.out.println("당첨 통계");
        System.out.println("---");

        System.out.println(lottoGameResult);
        System.out.printf((LOTTO_PROFIT_RATE), lottoGameResult.calculateProfitRate());
    }
}
