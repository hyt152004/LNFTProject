package model;

import exceptions.emotionScaleOutOfBoundsException;

public class EmotionScale {
    static int emotionScale;

    public EmotionScale() {
        emotionScale = -1;
    }

    public void setEmotionScale(int emotionScale) throws emotionScaleOutOfBoundsException {
        if (emotionScale >= 0 && emotionScale <= 5) {
            EmotionScale.emotionScale = emotionScale;
        }

        else {
            throw new emotionScaleOutOfBoundsException();
        }
    }

    public int getEmotionScale() {
        return emotionScale;
    }


}
