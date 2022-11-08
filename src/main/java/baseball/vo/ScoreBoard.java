package baseball.vo;

public class ScoreBoard {
    private final int strike;
    private final int ball;

    public ScoreBoard(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
