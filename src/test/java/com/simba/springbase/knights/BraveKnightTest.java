package com.simba.springbase.knights;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() {
        // 创建 mock Quest
        Quest mockQuest = mock(Quest.class);
        // 注入 mock Quest
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
