package view;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import domain.Ladder;
import domain.TestLadderRowGenerator;
import utils.LadderRowGenerator;

class OutputViewTest {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setOutputStream() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
        outputStream.reset();
    }

    @Test
    @DisplayName("사다리의 bar가 true면 -----로, false면      로(공백5칸)변환되어 출력된다. ")
    void printLadder() {
//        다음 모양의 사다리가 제대로 출력되는지 확인하는 테스트
//        |-----|     |-----|
//        |     |-----|     |
//        |-----|     |     |
//        |     |-----|     |
//        |-----|     |-----|
        String expected = "    |-----|     |-----|\n    |     |-----|     |\n    |-----|     |     |\n    |     |-----|     |\n    |-----|     |-----|\n";
        LadderRowGenerator ladderRowGenerator = new TestLadderRowGenerator();
        Ladder ladder = new Ladder(ladderRowGenerator);

        ladder.create(5, 4);
        List<List<Boolean>> ladderMap = ladder.getLadderMap();

        OutputView.printLadder(ladderMap);
        assertThat(outputStream.toString()).isEqualTo(expected);
    }
}
